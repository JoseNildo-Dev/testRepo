package sunmi.installer;

import android.app.Application;
import android.content.Intent;
import android.content.pm.IPackageDeleteObserver2;
import android.content.pm.IPackageInstallObserver2;
import android.content.pm.IPackageManager;
import android.content.pm.VerificationParams;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class PM {
    public static final String ACTION_INSTALL_APP_HIDE = "android.intent.action.INSTALL_APP_HIDE";
    private static final String TAG = "PM";
    private static PM instance;
    private Application app;
    private IPackageManager iPm;
    private final int INSTALL_COMPLETE = 1;
    private final int INSTALL_SUCCEEDED = 1;
    private final int INSTALL_FAILED_INSUFFICIENT_STORAGE = -4;
    private final int INSTALL_FAILED_INVALID_APK = -2;
    private final int INSTALL_PARSE_FAILED_INCONSISTENT_CERTIFICATES = -104;
    private final int INSTALL_FAILED_UPDATE_INCOMPATIBLE = -7;
    private final int INSTALL_FAILED_OLDER_SDK = -12;
    private final int INSTALL_FAILED_CPU_ABI_INCOMPATIBLE = -16;
    private int mResultCode = -1;
    private PackageInstallObserver mInstallObserver = new PackageInstallObserver();
    private Handler mHandler = new Handler() { // from class: sunmi.installer.PM.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            if (message.arg1 == 1) {
                PM.this.mResultCode = 0;
            } else {
                PM.this.mResultCode = message.arg1;
            }
            PM.this.sendBroadcast(PM.ACTION_INSTALL_APP_HIDE, (String) message.obj);
        }
    };

    private int getErrorCode(int i) {
        Log.d(TAG, "Installation error code: " + i);
        if (i != -104) {
            if (i == -16) {
                return -106;
            }
            if (i == -12) {
                return -105;
            }
            if (i != -7) {
                if (i != -4) {
                    return i != -2 ? -100 : -101;
                }
                return -103;
            }
        }
        return -104;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendBroadcast(String str, String str2) {
        Intent intent = new Intent(str);
        intent.putExtra("packageName", str2);
        intent.putExtra("respCode", this.mResultCode);
        this.app.sendBroadcast(intent);
    }

    private PM(Application application) {
        this.app = application;
    }

    public static PM getInstance(Application application) {
        if (instance == null) {
            instance = new PM(application);
        }
        return instance;
    }

    public boolean connect() {
        try {
            this.iPm = IPackageManager.Stub.asInterface((IBinder) Class.forName("android.os.ServiceManager").getMethod("getService", String.class).invoke(null, "package"));
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return false;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return false;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public void installPackage(final File file) {
        new Thread(new Runnable() { // from class: sunmi.installer.PM.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    PM.this._installPackage(file);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    Log.d(PM.TAG, "install fail RemoteException:" + e.getMessage());
                }
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _installPackage(File file) throws RemoteException {
        if (this.iPm == null) {
            throw new RuntimeException("PM not connected, please call connect method.");
        }
        VerificationParams verificationParams = new VerificationParams(null, null, null, -1, null);
        this.mInstallObserver.reset();
        this.iPm.installPackage(file.getPath(), this.mInstallObserver, 2, this.iPm.getNameForUid(Binder.getCallingUid()), verificationParams, null);
        this.mInstallObserver.waitForCompletion();
        int result = this.mInstallObserver.getResult();
        Log.d(TAG, "install result: " + result);
    }

    public void unInstallPackage(final String str) {
        new Thread(new Runnable() { // from class: sunmi.installer.PM.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    PM.this._unInstallPackage(str);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    Log.d(PM.TAG, "unInstall fail RemoteException:" + e.getMessage());
                }
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _unInstallPackage(String str) throws RemoteException {
        IPackageManager iPackageManager = this.iPm;
        if (iPackageManager == null) {
            throw new RuntimeException("PM not connected, please call connect method.");
        }
        iPackageManager.deletePackage(str, new PackageDeleteObserver(), Binder.getCallingUid(), 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class PackageInstallObserver extends IPackageInstallObserver2.Stub {
        final AtomicBoolean mDone = new AtomicBoolean();
        String mPackageName;
        int mResult;

        @Override // android.content.pm.IPackageInstallObserver2
        public void onUserActionRequired(Intent intent) throws RemoteException {
        }

        PackageInstallObserver() {
        }

        @Override // android.content.pm.IPackageInstallObserver2
        public void onPackageInstalled(String str, int i, String str2, Bundle bundle) throws RemoteException {
            synchronized (this.mDone) {
                Log.d(PM.TAG, "onPackageInstalled basePackageName:" + str + " msg:" + str2);
                Message obtainMessage = PM.this.mHandler.obtainMessage(1);
                obtainMessage.arg1 = i;
                obtainMessage.obj = str;
                PM.this.mHandler.sendMessage(obtainMessage);
                Log.d(PM.TAG, "----------Installation PKG: " + str + " CODE: " + i);
                this.mResult = i;
                this.mPackageName = str;
                this.mDone.set(true);
                this.mDone.notifyAll();
            }
        }

        public void reset() {
            synchronized (this.mDone) {
                this.mDone.set(false);
            }
        }

        public void waitForCompletion() {
            synchronized (this.mDone) {
                while (!this.mDone.get()) {
                    try {
                        this.mDone.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }

        int getResult() {
            return this.mResult;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class PackageDeleteObserver extends IPackageDeleteObserver2.Stub {
        @Override // android.content.pm.IPackageDeleteObserver2
        public void onUserActionRequired(Intent intent) throws RemoteException {
        }

        PackageDeleteObserver() {
        }

        @Override // android.content.pm.IPackageDeleteObserver2
        public void onPackageDeleted(String str, int i, String str2) throws RemoteException {
            Log.d(PM.TAG, "onPackageDeleted packageName:" + str + " msg:" + str2);
        }
    }
}
