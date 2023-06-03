package com.sunmi.sunmisecurityservice.wifi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sunmi.sunmisecurityservice_v3.R;

/* loaded from: classes.dex */
public class SimFailHelpActivity extends AppCompatActivity {
    private RelativeLayout mRelBack;
    private TextView mTextView;

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    void initView() {
        setContentView(R.layout.v1_sim_connection_fail_help);
        this.mRelBack = (RelativeLayout) findViewById(R.id.layout_back);
        this.mTextView = (TextView) findViewById(R.id.txt_msg);
        this.mTextView.setText(Html.fromHtml(getString(R.string.wenxintishi_msg1)));
        this.mRelBack.setOnClickListener(new View.OnClickListener() { // from class: com.sunmi.sunmisecurityservice.wifi.SimFailHelpActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SimFailHelpActivity.this.finish();
            }
        });
    }
}
