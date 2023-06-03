package com.sunmi.sunmisecurityservice.wifi.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import com.sunmi.sunmisecurityservice_v3.R;

/* loaded from: classes.dex */
public class SimCardDialog extends Dialog {

    /* loaded from: classes.dex */
    public interface OnClickSimListener {
        void left();

        void right();
    }

    public SimCardDialog(Context context, int i) {
        super(context, i);
    }

    public static SimCardDialog createDialog(Context context) {
        SimCardDialog simCardDialog = new SimCardDialog(context, R.style.CustomProgressDialog);
        simCardDialog.setContentView(R.layout.p1_custom_install_sim_dialog);
        simCardDialog.getWindow().getAttributes().gravity = 17;
        simCardDialog.setCanceledOnTouchOutside(false);
        simCardDialog.setCancelable(false);
        if (Build.VERSION.SDK_INT >= 26) {
            simCardDialog.getWindow().setType(2038);
        } else {
            simCardDialog.getWindow().setType(2010);
        }
        return simCardDialog;
    }

    public SimCardDialog setOnClick(final OnClickSimListener onClickSimListener) {
        ((TextView) findViewById(R.id.custom_installed)).setOnClickListener(new View.OnClickListener() { // from class: com.sunmi.sunmisecurityservice.wifi.dialog.SimCardDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                onClickSimListener.left();
            }
        });
        ((TextView) findViewById(R.id.custom_sure)).setOnClickListener(new View.OnClickListener() { // from class: com.sunmi.sunmisecurityservice.wifi.dialog.SimCardDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                onClickSimListener.right();
            }
        });
        return this;
    }
}
