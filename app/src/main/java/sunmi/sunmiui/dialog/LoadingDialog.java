package sunmi.sunmiui.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import sunmi.sunmiui.R;

/* loaded from: classes.dex */
public class LoadingDialog extends BaseDialog {
    private static LoadingDialog instance;
    private TextView loadingMsg;
    private View loadingProgress;

    @Override // sunmi.sunmiui.dialog.BaseDialog, android.content.DialogInterface
    public /* bridge */ /* synthetic */ void cancel() {
        super.cancel();
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog, android.content.DialogInterface
    public /* bridge */ /* synthetic */ void dismiss() {
        super.dismiss();
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    public /* bridge */ /* synthetic */ Dialog getDialog() {
        return super.getDialog();
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    public /* bridge */ /* synthetic */ boolean hasDialog() {
        return super.hasDialog();
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    public /* bridge */ /* synthetic */ void onDestory() {
        super.onDestory();
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    public /* bridge */ /* synthetic */ void setCancelable(boolean z) {
        super.setCancelable(z);
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    public /* bridge */ /* synthetic */ void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    public /* bridge */ /* synthetic */ void setDialog(Dialog dialog) {
        super.setDialog(dialog);
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    public /* bridge */ /* synthetic */ void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        super.setOnCancelListener(onCancelListener);
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    public /* bridge */ /* synthetic */ void setSystemDialog(Dialog dialog) {
        super.setSystemDialog(dialog);
    }

    private LoadingDialog() {
    }

    public static LoadingDialog getInstance() {
        if (instance == null) {
            instance = new LoadingDialog();
        }
        return instance;
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    protected void init() {
        this.loadingProgress = this.dialog.findViewById(R.id.progress);
        this.loadingMsg = (TextView) this.dialog.findViewById(R.id.msg);
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    protected void onDialogCancel() {
        this.dialog = null;
        instance = null;
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    public void show() {
        super.show();
        if (this.dialog == null || this.dialog.getContext() == null) {
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.dialog.getContext(), R.anim.loading_anim);
        loadAnimation.setInterpolator(new LinearInterpolator());
        this.loadingProgress.setAnimation(loadAnimation);
        this.loadingProgress.startAnimation(loadAnimation);
    }

    public void setLoadingMsgSize(int i) {
        this.loadingMsg.setTextSize(2, i);
    }
}
