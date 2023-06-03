package sunmi.sunmiui.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* loaded from: classes.dex */
public abstract class BaseEditDialog extends BaseDialog {
    protected EditText editText;

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

    @Override // sunmi.sunmiui.dialog.BaseDialog
    protected void onDialogCancel() {
        this.editText.setText("");
    }

    public String getText() {
        return this.editText.getText().toString();
    }

    public void setInputType(int i) {
        this.editText.setInputType(i);
    }

    public void showSoftInput() {
        ((InputMethodManager) this.editText.getContext().getSystemService("input_method")).showSoftInput(this.editText, 0);
    }
}
