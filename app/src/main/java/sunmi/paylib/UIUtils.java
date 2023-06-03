package sunmi.paylib;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* loaded from: classes.dex */
class UIUtils {
    protected static final int SYSTEM_UI_FLAG_SUNMI_SEC = 8;

    UIUtils() {
    }

    public static void setSunmiSecStatusBar(View view) {
        view.setSystemUiVisibility(view.getSystemUiVisibility() | 8);
    }

    public static void banPowerKey(Window window) {
        if (window != null) {
            window.setFlags(4, 4);
        }
    }

    public static void banVolumeKey(Dialog dialog) {
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: sunmi.paylib.UIUtils.1
            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i == 25) {
                    Log.e("onKeyDown", "KEYCODE_VOLUME_DOWN");
                    return true;
                } else if (i == 24) {
                    Log.e("onKeyDown", "KEYCODE_VOLUME_UP");
                    return true;
                } else {
                    return false;
                }
            }
        });
    }

    public static void screenMonopoly(Window window) {
        banPowerKey(window);
        setSunmiSecStatusBar(window.getDecorView());
        window.addFlags(128);
    }

    public static void screenMonopoly(Dialog dialog) {
        Window window = dialog.getWindow();
        window.addFlags(128);
        banPowerKey(window);
        setSunmiSecStatusBar(window.getDecorView());
        banVolumeKey(dialog);
    }

    public static void setLight(Activity activity, int i) {
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        attributes.screenBrightness = Float.valueOf(i).floatValue() * 0.003921569f;
        activity.getWindow().setAttributes(attributes);
    }
}
