package sunmi.loglib;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.sunmi.logservice.aidl.LogProvider;
import com.sunmi.logservice.aidl.log.LogOpt;
import java.util.List;

/* loaded from: classes.dex */
public class SunmiLogKernel {
    private static final String SUNMI_LOG_SERVICE_ACTION = "sunmi.intent.action.LOG_SERVICE";
    private static final String SUNMI_LOG_SERVICE_PKG_NAME = "com.sunmi.logservice_v3";
    private static final String TAG = "SunmiLogKernel";
    private static SunmiLogKernel instance = new SunmiLogKernel();
    private Context appContext;
    private ConnectLogCallback mConnCallback;
    public LogOpt mLogOpt;
    private boolean isBind = false;
    private ServiceConnection mServiceConnection = new ServiceConnection() { // from class: sunmi.loglib.SunmiLogKernel.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                LogProvider asInterface = LogProvider.Stub.asInterface(iBinder);
                if (setBinder(asInterface)) {
                    SunmiLogKernel.this.mLogOpt = (LogOpt) getBinder(asInterface, LogOpt.class);
                    if (SunmiLogKernel.this.mConnCallback != null) {
                        SunmiLogKernel.this.mConnCallback.onConnectLogSDK();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                Log.e(SunmiLogKernel.TAG, "bind service exception:" + e);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (SunmiLogKernel.this.mConnCallback != null) {
                SunmiLogKernel.this.mConnCallback.onDisconnectLogSDK();
            }
        }

        private boolean setBinder(LogProvider logProvider) {
            try {
                return logProvider.setBinder(new Binder()) >= 0;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        private <T> T getBinder(LogProvider logProvider, Class<T> cls) {
            if (cls == LogOpt.class) {
                try {
                    return (T) logProvider.getLogOpt();
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
            return null;
        }
    };

    /* loaded from: classes.dex */
    public interface ConnectLogCallback {
        void onConnectLogSDK();

        void onDisconnectLogSDK();
    }

    public String getLogLibVersion() {
        return "1.0.1";
    }

    public String getMatchedLogSDKVersion() {
        return "v1.0.1";
    }

    private SunmiLogKernel() {
    }

    public static SunmiLogKernel getInstance() {
        return instance;
    }

    public Context getAppContext() {
        return this.appContext;
    }

    public void setAppContext(Context context) {
        this.appContext = context;
    }

    public boolean initLogSDK(Context context, ConnectLogCallback connectLogCallback) {
        this.isBind = false;
        this.mConnCallback = connectLogCallback;
        Intent intent = new Intent(SUNMI_LOG_SERVICE_ACTION);
        intent.setPackage(SUNMI_LOG_SERVICE_PKG_NAME);
        this.appContext = context.getApplicationContext();
        List<ResolveInfo> queryIntentServices = this.appContext.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            this.appContext.startService(intent);
            this.isBind = this.appContext.bindService(intent, this.mServiceConnection, 4);
        } else {
            Log.e(TAG, "bind LogService failed: service not found");
        }
        return this.isBind;
    }

    public void destroyLogSDK() {
        ServiceConnection serviceConnection = this.mServiceConnection;
        if (serviceConnection == null || !this.isBind) {
            return;
        }
        this.appContext.unbindService(serviceConnection);
        this.isBind = false;
    }
}
