package com.sunmi.sunmisecurityservice.app;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import com.sunmi.baseservice.IBaseServiceInterface;
import com.sunmi.logservice.aidl.log.LogOpt;
import com.sunmi.pay.hardware.aidl.security.SecurityOpt;
import com.sunmi.pay.hardware.aidl.system.BasicOpt;
import com.sunmi.sunmisecurityservice.log.EnumTamperLogUploadStatus;
import com.sunmi.sunmisecurityservice.util.I18NUtils;
import com.sunmi.sunmisecurityservice.util.LogUtil;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import sunmi.loglib.SunmiLogKernel;
import sunmi.paylib.SunmiPayKernel;
import sunmi.sunmiui.utils.Adaptation;

/* loaded from: classes.dex */
public class MyApplication extends Application {
    public static final String BASE_SERVICE_ACTION = "com.sunmi.baseservice";
    public static final String BASE_SERVICE_PKG_NAME = "com.sunmi.baseservice";
    private static final String TAG = "MyApplication";
    public static MyApplication app;
    public static int tamperLogUploadStatus = EnumTamperLogUploadStatus.UPLOAD_STATUS_DEFAULT.getValue();
    private IBaseServiceInterface baseService;
    public BasicOpt basicOptBinder;
    public volatile boolean isBaseServiceConnect;
    public volatile boolean isConnect;
    public volatile boolean isLogServiceConnect;
    private Set<OnServiceConnectListener> listeners;
    public LogOpt logOptBinder;
    public SecurityOpt securityOpt;
    private Handler handler = new Handler();
    private SunmiPayKernel.ConnCallback mConnCallback = new SunmiPayKernel.ConnCallback() { // from class: com.sunmi.sunmisecurityservice.app.MyApplication.1
        @Override // sunmi.paylib.SunmiPayKernel.ConnCallback
        public void onServiceConnected() {
            LogUtil.e(MyApplication.TAG, "bind hardware service success.");
            MyApplication myApplication = MyApplication.this;
            myApplication.isConnect = true;
            myApplication.basicOptBinder = SunmiPayKernel.getInstance().mBasicOpt;
            MyApplication.this.securityOpt = SunmiPayKernel.getInstance().mSecurityOpt;
            MyApplication.this.notifyServiceConnect();
        }

        @Override // sunmi.paylib.SunmiPayKernel.ConnCallback
        public void onServiceDisconnected() {
            LogUtil.e(MyApplication.TAG, "disconnected to hardware service!");
            MyApplication myApplication = MyApplication.this;
            myApplication.isConnect = false;
            myApplication.securityOpt = null;
            myApplication.basicOptBinder = null;
            myApplication.checkServiceConnectivity(0L);
        }
    };
    private SunmiLogKernel.ConnectLogCallback mConnLogCallback = new SunmiLogKernel.ConnectLogCallback() { // from class: com.sunmi.sunmisecurityservice.app.MyApplication.2
        @Override // sunmi.loglib.SunmiLogKernel.ConnectLogCallback
        public void onConnectLogSDK() {
            LogUtil.e(MyApplication.TAG, "bind log service success.");
            MyApplication myApplication = MyApplication.this;
            myApplication.isLogServiceConnect = true;
            myApplication.logOptBinder = SunmiLogKernel.getInstance().mLogOpt;
        }

        @Override // sunmi.loglib.SunmiLogKernel.ConnectLogCallback
        public void onDisconnectLogSDK() {
            LogUtil.e(MyApplication.TAG, "disconnected to log service!");
            MyApplication myApplication = MyApplication.this;
            myApplication.isLogServiceConnect = false;
            myApplication.logOptBinder = null;
            myApplication.checkLogServiceConnectivity(0L);
        }
    };
    private ServiceConnection serviceConnection = new ServiceConnection() { // from class: com.sunmi.sunmisecurityservice.app.MyApplication.3
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            LogUtil.e(MyApplication.TAG, "bind base service success.");
            MyApplication myApplication = MyApplication.this;
            myApplication.isBaseServiceConnect = true;
            myApplication.baseService = IBaseServiceInterface.Stub.asInterface(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            LogUtil.e(MyApplication.TAG, "disconnected to base service!");
            MyApplication myApplication = MyApplication.this;
            myApplication.isBaseServiceConnect = false;
            myApplication.baseService = null;
            MyApplication.this.checkBaseServiceConnectivity(0L);
        }
    };

    /* loaded from: classes.dex */
    public interface OnServiceConnectListener {
        void onServiceConnect();
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        app = this;
        this.listeners = new CopyOnWriteArraySet();
        Adaptation.init(this);
        LogUtil.startLogger(null);
        Constant.LANGUAGE = I18NUtils.getCurrentLanguage(this);
        configCrashHandler();
        bindSDKService();
        bindBaseService();
        bindLogSDKService();
    }

    private void configCrashHandler() {
        CrashHandler.configUncaughtExceptionHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindSDKService() {
        LogUtil.e(TAG, "start bind payHardware service...");
        SunmiPayKernel.getInstance().connectPayService(this, this.mConnCallback);
        checkServiceConnectivity(3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindLogSDKService() {
        LogUtil.e(TAG, "start bind log service...");
        SunmiLogKernel.getInstance().initLogSDK(this, this.mConnLogCallback);
        checkLogServiceConnectivity(3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindBaseService() {
        Intent intent = new Intent("com.sunmi.baseservice");
        intent.setPackage("com.sunmi.baseservice");
        bindService(intent, this.serviceConnection, 1);
        checkBaseServiceConnectivity(3000L);
    }

    public IBaseServiceInterface getBaseService() {
        return this.baseService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkLogServiceConnectivity(long j) {
        this.handler.postDelayed(new Runnable() { // from class: com.sunmi.sunmisecurityservice.app.MyApplication.4
            @Override // java.lang.Runnable
            public void run() {
                if (MyApplication.this.isLogServiceConnect) {
                    return;
                }
                MyApplication.this.bindLogSDKService();
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkBaseServiceConnectivity(long j) {
        this.handler.postDelayed(new Runnable() { // from class: com.sunmi.sunmisecurityservice.app.MyApplication.5
            @Override // java.lang.Runnable
            public void run() {
                if (MyApplication.this.isBaseServiceConnect) {
                    return;
                }
                MyApplication.this.bindBaseService();
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkServiceConnectivity(long j) {
        this.handler.postDelayed(new Runnable() { // from class: com.sunmi.sunmisecurityservice.app.MyApplication.6
            @Override // java.lang.Runnable
            public void run() {
                if (MyApplication.this.isConnect) {
                    return;
                }
                MyApplication.this.bindSDKService();
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyServiceConnect() {
        this.handler.post(new Runnable() { // from class: com.sunmi.sunmisecurityservice.app.MyApplication.7
            @Override // java.lang.Runnable
            public void run() {
                for (OnServiceConnectListener onServiceConnectListener : MyApplication.this.listeners) {
                    onServiceConnectListener.onServiceConnect();
                }
            }
        });
    }

    public void registerServiceConnectListener(OnServiceConnectListener onServiceConnectListener) {
        if (onServiceConnectListener != null) {
            this.listeners.add(onServiceConnectListener);
        }
    }

    public void unregisterServiceConnectListener(OnServiceConnectListener onServiceConnectListener) {
        this.listeners.remove(onServiceConnectListener);
    }
}
