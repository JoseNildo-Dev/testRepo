package sunmi.installer;

import android.content.Intent;
import android.content.pm.IPackageInstallObserver2;
import android.content.pm.IPackageManager;
import android.content.pm.VerificationParams;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

/* renamed from: sunmi.installer.Pm  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0026Pm {
    private static final String TAG = "Gank";

    public void installPackage(final File file, final InstallAppObserver installAppObserver) {
        new Thread(new Runnable() { // from class: sunmi.installer.Pm.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C0026Pm.this._installPackage(file, installAppObserver);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    Log.d(C0026Pm.TAG, "install fail RemoteException:" + e.getMessage());
                }
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _installPackage(File file, InstallAppObserver installAppObserver) throws RemoteException {
        Log.v(TAG, "File: " + file.getPath());
        IPackageManager iPackageManager = null;
        try {
            iPackageManager = IPackageManager.Stub.asInterface((IBinder) Class.forName("android.os.ServiceManager").getMethod("getService", String.class).invoke(null, "package"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        }
        IPackageManager iPackageManager2 = iPackageManager;
        if (iPackageManager2 == null) {
            throw new RuntimeException("PM not connected, please call connect method.");
        }
        iPackageManager2.installPackage(file.getPath(), new PackageInstallObserver(installAppObserver), 2, iPackageManager2.getNameForUid(Binder.getCallingUid()), new VerificationParams(null, null, null, -1, null), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sunmi.installer.Pm$PackageInstallObserver */
    /* loaded from: classes.dex */
    public class PackageInstallObserver extends IPackageInstallObserver2.Stub {
        InstallAppObserver mInstallAppObserver;

        @Override // android.content.pm.IPackageInstallObserver2
        public void onUserActionRequired(Intent intent) throws RemoteException {
        }

        PackageInstallObserver(InstallAppObserver installAppObserver) {
            this.mInstallAppObserver = installAppObserver;
        }

        @Override // android.content.pm.IPackageInstallObserver2
        public void onPackageInstalled(String str, int i, String str2, Bundle bundle) throws RemoteException {
            InstallAppObserver installAppObserver = this.mInstallAppObserver;
            if (installAppObserver != null) {
                installAppObserver.onInstall(i);
            }
        }
    }
}
