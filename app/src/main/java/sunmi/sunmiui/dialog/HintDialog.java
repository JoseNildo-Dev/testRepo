package sunmi.sunmiui.dialog;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public class HintDialog extends BaseDialog {
    private static HintDialog instance;

    @Override // sunmi.sunmiui.dialog.BaseDialog
    protected void init() {
    }

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

    @Override // sunmi.sunmiui.dialog.BaseDialog
    public /* bridge */ /* synthetic */ void show() {
        super.show();
    }

    private HintDialog() {
    }

    public static HintDialog getInstance() {
        if (instance == null) {
            instance = new HintDialog();
        }
        return instance;
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    protected void onDialogCancel() {
        this.dialog = null;
        instance = null;
    }
}
