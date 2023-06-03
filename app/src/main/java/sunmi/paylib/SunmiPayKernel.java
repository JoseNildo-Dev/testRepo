package sunmi.paylib;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import android.view.Window;
import android.widget.Toast;
import com.sunmi.pay.hardware.aidl.DeviceProvide;
import com.sunmi.pay.hardware.aidl.emv.EMVOpt;
import com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt;
import com.sunmi.pay.hardware.aidl.print.PrinterOpt;
import com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt;
import com.sunmi.pay.hardware.aidl.security.SecurityOpt;
import com.sunmi.pay.hardware.aidl.system.BasicOpt;
import com.sunmi.pay.hardware.aidl.tax.TaxOpt;
import com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2;
import com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2;
import com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2;
import com.sunmi.pay.hardware.aidlv2.print.PrinterOptV2;
import com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2;
import com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2;
import com.sunmi.pay.hardware.aidlv2.system.BasicOptV2;
import com.sunmi.pay.hardware.aidlv2.tax.TaxOptV2;
import java.util.List;

/* loaded from: classes.dex */
public class SunmiPayKernel {
    private static final String TAG = "SunmiPayKernel";
    private static SunmiPayKernel instance = new SunmiPayKernel();
    private Context appContext;
    public BasicOpt mBasicOpt;
    public BasicOptV2 mBasicOptV2;
    private ConnCallback mConnCallback;
    private ConnectCallback mConnCallbackV2;
    public EMVOpt mEMVOpt;
    public EMVOptV2 mEMVOptV2;
    public ETCOptV2 mETCOptV2;
    public PinPadOpt mPinPadOpt;
    public PinPadOptV2 mPinPadOptV2;
    public PrinterOpt mPrinterOpt;
    public PrinterOptV2 mPrinterOptV2;
    public ReadCardOpt mReadCardOpt;
    public ReadCardOptV2 mReadCardOptV2;
    public SecurityOpt mSecurityOpt;
    public SecurityOptV2 mSecurityOptV2;
    public TaxOpt mTaxOpt;
    public TaxOptV2 mTaxOptV2;
    private boolean isBind = false;
    private ServiceConnection mServiceConnection = new ServiceConnection() { // from class: sunmi.paylib.SunmiPayKernel.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                DeviceProvide asInterface = DeviceProvide.Stub.asInterface(iBinder);
                if (setBinder(asInterface)) {
                    SunmiPayKernel.this.mBasicOpt = (BasicOpt) getBinder(asInterface, BasicOpt.class);
                    SunmiPayKernel.this.mReadCardOpt = (ReadCardOpt) getBinder(asInterface, ReadCardOpt.class);
                    SunmiPayKernel.this.mPinPadOpt = (PinPadOpt) getBinder(asInterface, PinPadOpt.class);
                    SunmiPayKernel.this.mEMVOpt = (EMVOpt) getBinder(asInterface, EMVOpt.class);
                    SunmiPayKernel.this.mSecurityOpt = (SecurityOpt) getBinder(asInterface, SecurityOpt.class);
                    SunmiPayKernel.this.mPrinterOpt = (PrinterOpt) getBinder(asInterface, PrinterOpt.class);
                    SunmiPayKernel.this.mTaxOpt = (TaxOpt) getBinder(asInterface, TaxOpt.class);
                    SunmiPayKernel.this.mBasicOptV2 = (BasicOptV2) getBinder(asInterface, BasicOptV2.class);
                    SunmiPayKernel.this.mReadCardOptV2 = (ReadCardOptV2) getBinder(asInterface, ReadCardOptV2.class);
                    SunmiPayKernel.this.mPinPadOptV2 = (PinPadOptV2) getBinder(asInterface, PinPadOptV2.class);
                    SunmiPayKernel.this.mEMVOptV2 = (EMVOptV2) getBinder(asInterface, EMVOptV2.class);
                    SunmiPayKernel.this.mSecurityOptV2 = (SecurityOptV2) getBinder(asInterface, SecurityOptV2.class);
                    SunmiPayKernel.this.mPrinterOptV2 = (PrinterOptV2) getBinder(asInterface, PrinterOptV2.class);
                    SunmiPayKernel.this.mTaxOptV2 = (TaxOptV2) getBinder(asInterface, TaxOptV2.class);
                    SunmiPayKernel.this.mETCOptV2 = (ETCOptV2) getBinder(asInterface, ETCOptV2.class);
                    if (SunmiPayKernel.this.mConnCallback != null) {
                        SunmiPayKernel.this.mConnCallback.onServiceConnected();
                    }
                    if (SunmiPayKernel.this.mConnCallbackV2 != null) {
                        SunmiPayKernel.this.mConnCallbackV2.onConnectPaySDK();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                Log.e(SunmiPayKernel.TAG, "bind service exception:" + e);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (SunmiPayKernel.this.mConnCallback != null) {
                SunmiPayKernel.this.mConnCallback.onServiceDisconnected();
            }
            if (SunmiPayKernel.this.mConnCallbackV2 != null) {
                SunmiPayKernel.this.mConnCallbackV2.onDisconnectPaySDK();
            }
        }

        private boolean setBinder(DeviceProvide deviceProvide) {
            try {
                return deviceProvide.setBinder(new Binder()) >= 0;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private <T> T getBinder(DeviceProvide deviceProvide, Class<T> cls) {
            ETCOptV2 eTCOptV2;
            T t = null;
            try {
                if (cls == BasicOpt.class) {
                    eTCOptV2 = deviceProvide.getBasicOpt();
                } else if (cls == ReadCardOpt.class) {
                    eTCOptV2 = deviceProvide.getReadCardOpt();
                } else if (cls == PinPadOpt.class) {
                    eTCOptV2 = deviceProvide.getPinPadOpt();
                } else if (cls == EMVOpt.class) {
                    eTCOptV2 = deviceProvide.getEMVOpt();
                } else if (cls == SecurityOpt.class) {
                    eTCOptV2 = deviceProvide.getSecurityOpt();
                } else if (cls == PrinterOpt.class) {
                    eTCOptV2 = deviceProvide.getPrinterOpt();
                } else if (cls == TaxOpt.class) {
                    eTCOptV2 = deviceProvide.getTaxOpt();
                } else if (cls == BasicOptV2.class) {
                    eTCOptV2 = deviceProvide.getBasicOptV2();
                } else if (cls == ReadCardOptV2.class) {
                    eTCOptV2 = deviceProvide.getReadCardOptV2();
                } else if (cls == PinPadOptV2.class) {
                    eTCOptV2 = deviceProvide.getPinPadOptV2();
                } else if (cls == EMVOptV2.class) {
                    eTCOptV2 = deviceProvide.getEMVOptV2();
                } else if (cls == SecurityOptV2.class) {
                    eTCOptV2 = deviceProvide.getSecurityOptV2();
                } else if (cls == PrinterOptV2.class) {
                    eTCOptV2 = deviceProvide.getPrinterOptV2();
                } else if (cls == TaxOptV2.class) {
                    eTCOptV2 = deviceProvide.getTaxOptV2();
                } else if (cls != ETCOptV2.class) {
                    return null;
                } else {
                    eTCOptV2 = deviceProvide.getETCOptV2();
                }
                t = eTCOptV2;
                return t;
            } catch (Exception e) {
                e.printStackTrace();
                return t;
            }
        }
    };

    @Deprecated
    /* loaded from: classes.dex */
    public interface ConnCallback {
        void onServiceConnected();

        void onServiceDisconnected();
    }

    /* loaded from: classes.dex */
    public interface ConnectCallback {
        void onConnectPaySDK();

        void onDisconnectPaySDK();
    }

    public String getMatchedPaySDKVersion() {
        return "v3.3.93";
    }

    public String getPayLibVersion() {
        return "1.4.44T01";
    }

    private SunmiPayKernel() {
    }

    public static SunmiPayKernel getInstance() {
        return instance;
    }

    public Context getAppContext() {
        return this.appContext;
    }

    public void setAppContext(Context context) {
        this.appContext = context;
    }

    @Deprecated
    public void connectPayService(Context context, ConnCallback connCallback) {
        this.mConnCallback = connCallback;
        Intent intent = new Intent("sunmi.intent.action.PAY_HARDWARE");
        intent.setPackage("com.sunmi.pay.hardware_v3");
        this.appContext = context.getApplicationContext();
        List<ResolveInfo> queryIntentServices = this.appContext.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            this.appContext.startService(intent);
            this.isBind = this.appContext.bindService(intent, this.mServiceConnection, 4);
            return;
        }
        Log.e(TAG, "bind PayHardwareService failed: service not found");
        Toast.makeText(context, "bind PayHardwareService failed: service not found", 0).show();
    }

    public boolean initPaySDK(Context context, ConnectCallback connectCallback) {
        this.isBind = false;
        this.mConnCallbackV2 = connectCallback;
        Intent intent = new Intent("sunmi.intent.action.PAY_HARDWARE");
        intent.setPackage("com.sunmi.pay.hardware_v3");
        this.appContext = context.getApplicationContext();
        List<ResolveInfo> queryIntentServices = this.appContext.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            this.appContext.startService(intent);
            this.isBind = this.appContext.bindService(intent, this.mServiceConnection, 4);
        } else {
            Log.e(TAG, "bind PayHardwareService failed: service not found");
            Toast.makeText(context, "bind PayHardwareService failed: service not found", 0).show();
        }
        return this.isBind;
    }

    @Deprecated
    public void unbindPayService(Context context) {
        if (this.mServiceConnection == null || !this.isBind) {
            return;
        }
        context.getApplicationContext().unbindService(this.mServiceConnection);
        this.isBind = false;
    }

    public void destroyPaySDK() {
        ServiceConnection serviceConnection = this.mServiceConnection;
        if (serviceConnection == null || !this.isBind) {
            return;
        }
        this.appContext.unbindService(serviceConnection);
        this.isBind = false;
    }

    public static void screenMonopoly(Window window) {
        UIUtils.screenMonopoly(window);
    }

    public static void screenMonopoly(Dialog dialog) {
        UIUtils.screenMonopoly(dialog);
    }
}
