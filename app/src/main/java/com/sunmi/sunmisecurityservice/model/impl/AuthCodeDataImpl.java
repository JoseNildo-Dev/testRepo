package com.sunmi.sunmisecurityservice.model.impl;

import android.text.TextUtils;
import com.sunmi.sunmisecurityservice.api.RASApiService;
import com.sunmi.sunmisecurityservice.app.Constant;
import com.sunmi.sunmisecurityservice.app.MyApplication;
import com.sunmi.sunmisecurityservice.model.AlarmReasonable;
import com.sunmi.sunmisecurityservice.model.AuthCodeable;
import com.sunmi.sunmisecurityservice.model.Tuple;
import com.sunmi.sunmisecurityservice.model.entity.AlarmReason;
import com.sunmi.sunmisecurityservice.model.entity.AuthCodeRequestParams;
import com.sunmi.sunmisecurityservice.model.entity.AuthCodeResponseParams;
import com.sunmi.sunmisecurityservice.presenter.listener.AuthCodeListener;
import com.sunmi.sunmisecurityservice.util.DeviceUtils;
import com.sunmi.sunmisecurityservice.util.LogUtil;
import com.sunmi.sunmisecurityservice.util.SharedPreferencesUtil;
import com.sunmi.sunmisecurityservice.util.TupleUtil;
import com.sunmi.sunmisecurityservice.util.Util;
import com.sunmi.sunmisecurityservice_v3.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class AuthCodeDataImpl implements AuthCodeable, AlarmReasonable {
    private static final int MAX_RETRY_COUNT = 5;
    private static final String TAG = "AuthCodeDataImpl";
    private int mCurRetryCount;
    private long mLastLimitTime = -1;
    private AuthCodeListener mListener;
    private RASApiService mRASApiService;

    private int getAlarmReasonStatus(int i, int i2) {
        if (i < 0) {
            return -1;
        }
        return (i & (1 << i2)) == 0 ? 0 : 1;
    }

    static /* synthetic */ int access$108(AuthCodeDataImpl authCodeDataImpl) {
        int i = authCodeDataImpl.mCurRetryCount;
        authCodeDataImpl.mCurRetryCount = i + 1;
        return i;
    }

    public AuthCodeDataImpl(AuthCodeListener authCodeListener) {
        initRASApiService();
        this.mListener = authCodeListener;
    }

    private void initRASApiService() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        this.mRASApiService = (RASApiService) new Retrofit.Builder().baseUrl(Constant.SERVER_ADDRESS).client(new OkHttpClient.Builder().addInterceptor(new Interceptor() { // from class: com.sunmi.sunmisecurityservice.model.impl.AuthCodeDataImpl.1
            @Override // okhttp3.Interceptor
            public Response intercept(Interceptor.Chain chain) throws IOException {
                return chain.proceed(chain.request().newBuilder().addHeader("userAgent", "sunmi.com").build());
            }
        }).addInterceptor(httpLoggingInterceptor).build()).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJavaCallAdapterFactory.create()).build().create(RASApiService.class);
    }

    @Override // com.sunmi.sunmisecurityservice.model.AlarmReasonable
    public Tuple<List<AlarmReason>, String> loadAlarmReason() {
        String str;
        char[] cArr;
        int readInt = SharedPreferencesUtil.readInt(SharedPreferencesUtil.KEY_HIS_ALARM_REASON, -1);
        int secStatus = DeviceUtils.getSecStatus();
        if (secStatus >= 0) {
            SharedPreferencesUtil.saveInt(SharedPreferencesUtil.KEY_HIS_ALARM_REASON, secStatus);
            str = Integer.toBinaryString(secStatus);
            if (str.length() < 32) {
                Arrays.fill(new char[32 - str.length()], '0');
                str = new String(cArr) + str;
            }
        } else {
            str = "-";
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(createAlarmReason(R.string.alarm_reason_1, secStatus, 0, readInt, 0));
        arrayList.add(createAlarmReason(R.string.alarm_reason_2, secStatus, 1, readInt, 1));
        arrayList.add(createAlarmReason(R.string.alarm_reason_3, secStatus, 2, readInt, 2));
        arrayList.add(createAlarmReason(R.string.alarm_reason_4, secStatus, 3, readInt, 3));
        arrayList.add(createAlarmReason(R.string.alarm_reason_lost, secStatus, 4, readInt, 4));
        return TupleUtil.tuple(arrayList, str);
    }

    private AlarmReason createAlarmReason(int i, int i2, int i3, int i4, int i5) {
        return new AlarmReason(MyApplication.app.getString(i), getAlarmReasonStatus(i2, i3), getAlarmReasonStatus(i4, i5));
    }

    @Override // com.sunmi.sunmisecurityservice.model.AuthCodeable
    public void checkAuthCodeByCloud(int i, int i2) {
        if (this.mCurRetryCount <= 0) {
            if (System.currentTimeMillis() - this.mLastLimitTime >= Constant.UNLOCK_LIMIT_TIME) {
                LogUtil.e(TAG, "据上次锁机已超规定时间，重置限制次数为5");
                this.mCurRetryCount = 5;
            } else {
                this.mListener.onError(MyApplication.app.getString(R.string.check_fail5));
                return;
            }
        }
        this.mListener.onLoadingData();
        int i3 = this.mCurRetryCount - 1;
        this.mCurRetryCount = i3;
        if (i3 == 0) {
            this.mLastLimitTime = System.currentTimeMillis();
        }
        AuthCodeRequestParams authCodeRequestParams = new AuthCodeRequestParams(i, i2);
        if (TextUtils.isEmpty(authCodeRequestParams.data) || TextUtils.isEmpty(authCodeRequestParams.signData)) {
            this.mListener.onError(MyApplication.app.getString(R.string.fail_getdata_sp));
        } else {
            this.mRASApiService.authCodeMD5(authCodeRequestParams.toRequestMap()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1<AuthCodeResponseParams>() { // from class: com.sunmi.sunmisecurityservice.model.impl.AuthCodeDataImpl.2
                @Override // rx.functions.Action1
                public void call(AuthCodeResponseParams authCodeResponseParams) {
                    AuthCodeDataImpl.this.handleResponse(authCodeResponseParams);
                }
            }, new Action1<Throwable>() { // from class: com.sunmi.sunmisecurityservice.model.impl.AuthCodeDataImpl.3
                @Override // rx.functions.Action1
                public void call(Throwable th) {
                    th.printStackTrace();
                    LogUtil.e(AuthCodeDataImpl.TAG, "请求服务器验证授权码出错：" + th.getMessage());
                    AuthCodeDataImpl.access$108(AuthCodeDataImpl.this);
                    AuthCodeDataImpl.this.mListener.onError(MyApplication.app.getString(R.string.error_net));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResponse(AuthCodeResponseParams authCodeResponseParams) {
        LogUtil.e(TAG, authCodeResponseParams.toString());
        if (authCodeResponseParams.data != null) {
            LogUtil.e(TAG, "授权数据不为空");
        }
        int i = authCodeResponseParams.code;
        if (i == 1) {
            checkAuthCodeByFirmware(authCodeResponseParams);
        } else if (i == 311) {
            updateErrorUI(authCodeResponseParams.msg);
        } else if (i == 312) {
            this.mLastLimitTime = System.currentTimeMillis();
            this.mListener.onError(MyApplication.app.getString(R.string.check_fail5));
        } else {
            updateErrorUI(authCodeResponseParams.msg);
        }
    }

    @Override // com.sunmi.sunmisecurityservice.model.AuthCodeable
    public void checkAuthCodeByFirmware(AuthCodeResponseParams authCodeResponseParams) {
        Observable.just(authCodeResponseParams.data).map(new Func1<AuthCodeResponseParams.DataBean, byte[]>() { // from class: com.sunmi.sunmisecurityservice.model.impl.AuthCodeDataImpl.7
            @Override // rx.functions.Func1
            public byte[] call(AuthCodeResponseParams.DataBean dataBean) {
                byte[] bArr = new byte[512];
                byte[] copyOf = Arrays.copyOf(Util.hexStringToBytes(dataBean.ciphertext), 256);
                byte[] copyOf2 = Arrays.copyOf(Util.hexStringToBytes(dataBean.signature), 256);
                System.arraycopy(copyOf, 0, bArr, 0, 256);
                System.arraycopy(copyOf2, 0, bArr, 256, 256);
                return bArr;
            }
        }).map(new Func1<byte[], Integer>() { // from class: com.sunmi.sunmisecurityservice.model.impl.AuthCodeDataImpl.6
            @Override // rx.functions.Func1
            public Integer call(byte[] bArr) {
                return Integer.valueOf(DeviceUtils.setAuthResCode(bArr));
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1<Integer>() { // from class: com.sunmi.sunmisecurityservice.model.impl.AuthCodeDataImpl.4
            @Override // rx.functions.Action1
            public void call(Integer num) {
                LogUtil.e(AuthCodeDataImpl.TAG, "L1校验结果：" + num);
                if (num.intValue() == 0) {
                    AuthCodeDataImpl.this.mListener.onSuccess();
                } else {
                    AuthCodeDataImpl.this.updateErrorUI(num.intValue());
                }
            }
        }, new Action1<Throwable>() { // from class: com.sunmi.sunmisecurityservice.model.impl.AuthCodeDataImpl.5
            @Override // rx.functions.Action1
            public void call(Throwable th) {
                th.printStackTrace();
                LogUtil.e(AuthCodeDataImpl.TAG, "请求安全芯片验证授权码出错：" + th.getMessage());
                AuthCodeDataImpl.access$108(AuthCodeDataImpl.this);
                AuthCodeDataImpl.this.mListener.onError(MyApplication.app.getString(R.string.fail_check_sp));
            }
        });
    }

    private HashMap<Integer, String> buildErrorCodeMap() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(-2, MyApplication.app.getString(R.string.fail_check_2));
        hashMap.put(-3, MyApplication.app.getString(R.string.fail_check_3));
        hashMap.put(-6, MyApplication.app.getString(R.string.fail_check_6));
        hashMap.put(-7, MyApplication.app.getString(R.string.fail_check_7));
        hashMap.put(-8, MyApplication.app.getString(R.string.fail_check_8));
        hashMap.put(-9, MyApplication.app.getString(R.string.fail_check_9));
        hashMap.put(-10, MyApplication.app.getString(R.string.fail_check_10));
        hashMap.put(-11, MyApplication.app.getString(R.string.fail_check_11));
        hashMap.put(-12, MyApplication.app.getString(R.string.fail_check_12));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateErrorUI(int i) {
        if (this.mCurRetryCount > 0) {
            this.mListener.onError(buildErrorCodeMap().get(Integer.valueOf(i)));
            return;
        }
        this.mLastLimitTime = System.currentTimeMillis();
        this.mListener.onError(MyApplication.app.getString(R.string.check_fail5));
    }

    private void updateErrorUI(String str) {
        if (this.mCurRetryCount > 0) {
            this.mListener.onError(str);
            return;
        }
        this.mLastLimitTime = System.currentTimeMillis();
        this.mListener.onError(MyApplication.app.getString(R.string.check_fail5));
    }
}
