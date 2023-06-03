package com.sunmi.sunmisecurityservice.presenter.impl;

import com.sunmi.sunmisecurityservice.base.BasePresenter;
import com.sunmi.sunmisecurityservice.model.Tuple;
import com.sunmi.sunmisecurityservice.model.entity.AlarmReason;
import com.sunmi.sunmisecurityservice.model.impl.AuthCodeDataImpl;
import com.sunmi.sunmisecurityservice.presenter.AlarmReasonPresenterable;
import com.sunmi.sunmisecurityservice.presenter.AuthCodePresenterable;
import com.sunmi.sunmisecurityservice.presenter.listener.AuthCodeListener;
import com.sunmi.sunmisecurityservice.view.AuthCodeCallback;
import java.util.List;

/* loaded from: classes.dex */
public class AuthCodePresenterImpl extends BasePresenter<AuthCodeCallback> implements AuthCodePresenterable, AlarmReasonPresenterable, AuthCodeListener {
    public static final int CHANGE_ALARM = 2;
    public static final int CHANGE_MODE = 1;
    private AuthCodeDataImpl mAuthCodeDataImp1 = new AuthCodeDataImpl(this);
    private int mType;

    public AuthCodePresenterImpl(int i) {
        this.mType = -1;
        this.mType = i;
    }

    @Override // com.sunmi.sunmisecurityservice.presenter.AuthCodePresenterable
    public void checkAuthCodeByCloud(String str) {
        this.mAuthCodeDataImp1.checkAuthCodeByCloud(this.mType, Integer.parseInt(str));
    }

    @Override // com.sunmi.sunmisecurityservice.presenter.AlarmReasonPresenterable
    public Tuple<List<AlarmReason>, String> getAlarmReason() {
        return this.mAuthCodeDataImp1.loadAlarmReason();
    }

    @Override // com.sunmi.sunmisecurityservice.presenter.listener.AuthCodeListener
    public void onError(String str) {
        ((AuthCodeCallback) this.mViewRef.get()).onAuthCodeCheckFail(str);
    }

    @Override // com.sunmi.sunmisecurityservice.presenter.listener.AuthCodeListener
    public void onSuccess() {
        ((AuthCodeCallback) this.mViewRef.get()).onAuthCodeCheckSuccess();
    }

    @Override // com.sunmi.sunmisecurityservice.presenter.listener.AuthCodeListener
    public void onLoadingData() {
        ((AuthCodeCallback) this.mViewRef.get()).onCheckAuthCode();
    }
}
