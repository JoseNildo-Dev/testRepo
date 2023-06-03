package com.sunmi.sunmisecurityservice.wifi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import com.sunmi.sunmisecurityservice_v3.R;

/* loaded from: classes.dex */
public class WifiFailedHelpActivity extends AppCompatActivity {
    RelativeLayout mRelativeLayoutBack;

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_wifi_failed_help);
        this.mRelativeLayoutBack = (RelativeLayout) findViewById(R.id.RelativeLayout_back);
        initView();
    }

    private void initView() {
        this.mRelativeLayoutBack.setOnClickListener(new View.OnClickListener() { // from class: com.sunmi.sunmisecurityservice.wifi.WifiFailedHelpActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WifiFailedHelpActivity.this.finish();
            }
        });
    }
}
