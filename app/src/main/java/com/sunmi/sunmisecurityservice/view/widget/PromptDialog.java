package com.sunmi.sunmisecurityservice.view.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.sunmi.sunmisecurityservice_v3.R;

/* loaded from: classes.dex */
public class PromptDialog extends Dialog {
    private static Context context;
    private static long countSeconds;
    static Handler mHandler = new Handler() { // from class: com.sunmi.sunmisecurityservice.view.widget.PromptDialog.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PromptDialog.countSeconds <= 0) {
                PromptDialog.mOnClickListener.onClick(PromptDialog.mTvOk);
                long unused = PromptDialog.countSeconds = 10L;
                PromptDialog.mHandler.removeMessages(0);
                return;
            }
            PromptDialog.access$106();
            PromptDialog.mTvOk.setText(Html.fromHtml(PromptDialog.context.getString(R.string.reboot_system_now) + "<font color='#FF0000'>(" + PromptDialog.countSeconds + ")</font>"));
            PromptDialog.mHandler.sendEmptyMessageDelayed(0, 1000L);
        }
    };
    private static View.OnClickListener mOnClickListener;
    private static TextView mTvCancel;
    private static TextView mTvMessage;
    private static TextView mTvOk;
    private static PromptDialog promptDialog;

    static /* synthetic */ long access$106() {
        long j = countSeconds - 1;
        countSeconds = j;
        return j;
    }

    public PromptDialog(Context context2, int i) {
        super(context2, i);
        context = context2;
    }

    public static PromptDialog createDialog(Context context2, String str, String str2, String str3, long j, final View.OnClickListener onClickListener, final View.OnClickListener onClickListener2) {
        promptDialog = new PromptDialog(context2, R.style.defaultDialogStyle);
        promptDialog.setContentView(R.layout.dialog_prompt);
        promptDialog.getWindow().getAttributes().gravity = 17;
        promptDialog.getWindow().setType(2003);
        promptDialog.setCanceledOnTouchOutside(true);
        promptDialog.setCancelable(true);
        mTvOk = (TextView) promptDialog.findViewById(R.id.right);
        mTvCancel = (TextView) promptDialog.findViewById(R.id.left);
        mTvMessage = (TextView) promptDialog.findViewById(R.id.dialog_msg);
        if (!TextUtils.isEmpty(str)) {
            mTvMessage.setText(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            mTvCancel.setText(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            mTvOk.setText(str3);
        }
        countSeconds = j;
        mHandler.sendEmptyMessage(0);
        mOnClickListener = onClickListener2;
        mTvOk.setOnClickListener(new View.OnClickListener() { // from class: com.sunmi.sunmisecurityservice.view.widget.PromptDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PromptDialog.mHandler.removeCallbacksAndMessages(null);
                onClickListener2.onClick(view);
            }
        });
        mTvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.sunmi.sunmisecurityservice.view.widget.PromptDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PromptDialog.mHandler.removeCallbacksAndMessages(null);
                onClickListener.onClick(view);
                PromptDialog.promptDialog.dismiss();
            }
        });
        return promptDialog;
    }

    public void hideDialog() {
        if (promptDialog != null) {
            mHandler.removeCallbacksAndMessages(null);
            promptDialog.dismiss();
        }
    }
}
