package com.sunmi.sunmisecurityservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.sunmi.sunmisecurityservice.app.BroadcastConstant;
import com.sunmi.sunmisecurityservice.util.DeviceUtils;
import com.sunmi.sunmisecurityservice.util.LogUtil;
import com.sunmi.sunmisecurityservice.util.Util;
import com.sunmi.sunmisecurityservice_v3.R;
import java.util.Arrays;

/* loaded from: classes.dex */
public class TestMainActivity extends AppCompatActivity implements View.OnClickListener {
    Button attckBtn;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button changBtn;
    Intent intent;
    Button pswBtn;
    byte[] res = new byte[512];

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_test_main);
        this.attckBtn = (Button) findViewById(R.id.btn1);
        this.attckBtn.setOnClickListener(this);
        this.changBtn = (Button) findViewById(R.id.btn2);
        this.changBtn.setOnClickListener(this);
        this.pswBtn = (Button) findViewById(R.id.btn3);
        this.pswBtn.setOnClickListener(this);
        this.btn4 = (Button) findViewById(R.id.btn4);
        this.btn5 = (Button) findViewById(R.id.btn5);
        this.btn6 = (Button) findViewById(R.id.btn6);
        this.btn7 = (Button) findViewById(R.id.btn7);
        this.btn8 = (Button) findViewById(R.id.btn8);
        this.btn9 = (Button) findViewById(R.id.btn9);
        this.btn4.setOnClickListener(this);
        this.btn5.setOnClickListener(this);
        this.btn6.setOnClickListener(this);
        this.btn7.setOnClickListener(this);
        this.btn8.setOnClickListener(this);
        this.btn9.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1 /* 2131230762 */:
                this.intent = new Intent();
                this.intent.setFlags(268435456);
                this.intent.setAction(BroadcastConstant.ACTION_SECURE_ATTACKED);
                sendBroadcast(this.intent);
                return;
            case R.id.btn2 /* 2131230763 */:
                this.intent = new Intent();
                this.intent.setFlags(268435456);
                this.intent.setAction("com.sunmi.sunmisecurityservice_v3");
                sendBroadcast(this.intent);
                return;
            case R.id.btn3 /* 2131230764 */:
                this.intent = new Intent();
                this.intent.setFlags(268435456);
                this.intent.setAction(BroadcastConstant.ACTION_PASSWORD);
                sendBroadcast(this.intent);
                return;
            case R.id.btn4 /* 2131230765 */:
                Toast.makeText(this, DeviceUtils.getDeviceModel(), 0).show();
                return;
            case R.id.btn5 /* 2131230766 */:
                Toast.makeText(this, DeviceUtils.getMSN(), 0).show();
                return;
            case R.id.btn6 /* 2131230767 */:
                Toast.makeText(this, new String(IntToChar32(DeviceUtils.getSecStatus())), 0).show();
                return;
            case R.id.btn7 /* 2131230768 */:
                String debugMode = DeviceUtils.getDebugMode();
                Toast.makeText(this, getString(R.string.is_debug) + debugMode, 0).show();
                return;
            case R.id.btn8 /* 2131230769 */:
                int authReqCode = DeviceUtils.getAuthReqCode(1, 1234, DeviceUtils.getMSN(), this.res);
                Toast.makeText(this, getString(R.string.request_key_from_l1) + authReqCode, 0).show();
                return;
            case R.id.btn9 /* 2131230770 */:
                byte[] hexStringToBytes = Util.hexStringToBytes("091F71CFB53B1695EF892B7F665AC36F2130E9815B650BE2C841B37A7A44146A854285FC31D874EF0F88CF610F3DD9B02D68CDCACBB2A235ACDB1C1FCCF96AB122346ADB9F0848C58781F7EC1BF3652F00A07BEFC890074AB5472E89BF2A22ECDC5697F773A4F094890E321C84642D5113A503931AFBCB099F1E95BB26634F4A73ED52A36D7B99BD2CDE411CEB535527A5A2038DE62F19FC738595103087F9D1E03C3F20CF4D86ED186BF09A2E28DBB0C9658698DBBDC92028C830A2CAFC0092DAEE6A802333486E5F79300CC0649982441B7B074C84D4F8FE20B15E2C0437AA981B0A0806D380D5CD0E831B4FD0E0B4C01D80753162CF6C8A5321061BFC079B");
                byte[] hexStringToBytes2 = Util.hexStringToBytes("1D34B1E4401C1FA9E11069C772C3E736BB264BF9CE6843CDEAF3EEA9F295FC67EA72A81054E8FB03E6F6FB29B979C5804A4CB1986EBA632CD5DF371212F5D450582B472126C5161035FAF44AD15A9D5D77E277ABD5C2D487CAD02AF8DEA2D97FCD83C2F53CEE9A514BF3F4EFDD3C2AB505E52838A9EB36505213106D0EA48813025F81326476525CAF8BDB4797E9655C20AEB29E3760E16F4120714E42207C1857ED2B6CD20C54DA84DA55DD026DDE3958734A32C0A9D24C70EF1BD93B78018D93960F5876CFA082ADB3A5295F206707A5D4792106A41129EF5DD92F5D5445D11BF8D62E95B3EC57488F47B419AC84B6ED4EC4EBCA69EE21F499C4D27EB7021A");
                byte[] bArr = new byte[512];
                System.arraycopy(hexStringToBytes, 0, bArr, 0, hexStringToBytes.length);
                System.arraycopy(hexStringToBytes2, 0, bArr, 256, hexStringToBytes2.length);
                LogUtil.e("yiuhet", "授权密文:" + Util.bytesToHexStr(bArr));
                int authResCode = DeviceUtils.setAuthResCode(bArr);
                Toast.makeText(this, getString(R.string.write_authorization_status) + authResCode, 0).show();
                return;
            default:
                return;
        }
    }

    private char[] IntToChar32(int i) {
        char[] charArray = Integer.toBinaryString(i).toCharArray();
        char[] cArr = new char[32];
        Arrays.fill(cArr, '0');
        System.arraycopy(charArray, 0, cArr, 32 - charArray.length, charArray.length);
        return cArr;
    }
}
