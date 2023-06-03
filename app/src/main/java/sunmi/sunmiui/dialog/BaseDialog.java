package sunmi.sunmiui.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.Log;

/* loaded from: classes.dex */
abstract class BaseDialog implements DialogInterface {
    private static final String TAG = "sunmiui";
    protected Dialog dialog;
    protected DialogInterface.OnCancelListener onCancelListener;
    protected Resources resources;

    protected abstract void init();

    protected abstract void onDialogCancel();

    public void setDialog(Dialog dialog) {
        this.dialog = dialog;
        this.resources = dialog.getContext().getResources();
        this.dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: sunmi.sunmiui.dialog.BaseDialog.1
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                if (BaseDialog.this.onCancelListener != null) {
                    BaseDialog.this.onCancelListener.onCancel(BaseDialog.this);
                }
                BaseDialog baseDialog = BaseDialog.this;
                baseDialog.dialog = null;
                baseDialog.onDialogCancel();
            }
        });
        init();
    }

    public void setSystemDialog(Dialog dialog) {
        this.dialog = dialog;
        this.dialog.getWindow().setType(2003);
        this.resources = dialog.getContext().getResources();
        this.dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: sunmi.sunmiui.dialog.BaseDialog.2
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                if (BaseDialog.this.onCancelListener != null) {
                    BaseDialog.this.onCancelListener.onCancel(BaseDialog.this);
                }
                BaseDialog baseDialog = BaseDialog.this;
                baseDialog.dialog = null;
                baseDialog.onDialogCancel();
            }
        });
        init();
    }

    public void show() {
        Dialog dialog = this.dialog;
        if (dialog == null || dialog.isShowing()) {
            return;
        }
        try {
            this.dialog.show();
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(TAG, "show dialog fail!");
        }
    }

    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.onCancelListener = onCancelListener;
    }

    @Override // android.content.DialogInterface
    public void cancel() {
        if (this.dialog != null) {
            Log.i("BaseDialog", "dialog dismiss");
            this.dialog.cancel();
        }
    }

    public void onDestory() {
        if (this.dialog != null) {
            this.dialog = null;
        }
    }

    @Override // android.content.DialogInterface
    public void dismiss() {
        cancel();
    }

    public boolean hasDialog() {
        return this.dialog != null;
    }

    public void setCanceledOnTouchOutside(boolean z) {
        this.dialog.setCanceledOnTouchOutside(z);
    }

    public void setCancelable(boolean z) {
        this.dialog.setCancelable(z);
    }

    public Dialog getDialog() {
        return this.dialog;
    }
}
