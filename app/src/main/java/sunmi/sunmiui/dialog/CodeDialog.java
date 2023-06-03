package sunmi.sunmiui.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import sunmi.sunmiui.R;
import sunmi.sunmiui.utils.BitmapUtil;

/* loaded from: classes.dex */
public class CodeDialog extends BaseDialog {
    private static CodeDialog instance;
    private ImageView clear;
    private ImageView code;
    private EditText editText;
    private TextView error;
    private boolean isReq;
    private ImageView load;
    private TextView title;

    @Override // sunmi.sunmiui.dialog.BaseDialog, android.content.DialogInterface
    public /* bridge */ /* synthetic */ void cancel() {
        super.cancel();
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

    public static CodeDialog getInstance() {
        if (instance == null) {
            instance = new CodeDialog();
        }
        return instance;
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    protected void init() {
        this.title = (TextView) this.dialog.findViewById(R.id.txt);
        this.code = (ImageView) this.dialog.findViewById(R.id.code);
        this.editText = (EditText) this.dialog.findViewById(R.id.editText);
        this.clear = (ImageView) this.dialog.findViewById(R.id.clear);
        this.load = (ImageView) this.dialog.findViewById(R.id.load);
        this.error = (TextView) this.dialog.findViewById(R.id.txt_error);
        this.clear.setOnClickListener(new View.OnClickListener() { // from class: sunmi.sunmiui.dialog.CodeDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CodeDialog.this.editText.setText("");
            }
        });
        this.error.setVisibility(8);
        this.load.setVisibility(8);
        this.clear.setVisibility(8);
    }

    public void setData(String str, String str2, final CodeInputSuccess codeInputSuccess, View.OnClickListener onClickListener) {
        this.isReq = false;
        this.error.setVisibility(8);
        this.load.clearAnimation();
        this.load.setVisibility(8);
        this.clear.setVisibility(8);
        this.title.setText(str);
        this.code.setImageBitmap(BitmapUtil.stringtoBitmap(str2));
        this.code.setOnClickListener(onClickListener);
        this.editText.addTextChangedListener(new TextWatcher() { // from class: sunmi.sunmiui.dialog.CodeDialog.2
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (editable.length() > 0 && !CodeDialog.this.isReq) {
                    CodeDialog.this.load.clearAnimation();
                    CodeDialog.this.load.setVisibility(8);
                    CodeDialog.this.clear.setVisibility(0);
                }
                if (codeInputSuccess != null && editable.length() == 4 && !CodeDialog.this.isReq) {
                    codeInputSuccess.codeInputSuccess(editable.toString());
                }
                if (editable.length() != 0 || CodeDialog.this.isReq) {
                    return;
                }
                CodeDialog.this.load.clearAnimation();
                CodeDialog.this.load.setVisibility(8);
                CodeDialog.this.clear.setVisibility(8);
            }
        });
    }

    public void setImgCode(String str) {
        this.isReq = false;
        this.code.setImageBitmap(BitmapUtil.stringtoBitmap(str));
        this.load.clearAnimation();
        this.load.setVisibility(8);
        this.clear.setVisibility(8);
    }

    public void showError(String str) {
        this.error.setText(str);
        this.error.setVisibility(0);
        this.load.clearAnimation();
        this.load.setVisibility(8);
        this.clear.setVisibility(8);
        this.editText.setText("");
    }

    public void hideError() {
        this.error.setVisibility(8);
    }

    public void hideLoad() {
        this.isReq = false;
        this.load.clearAnimation();
        this.load.setVisibility(8);
    }

    public void showLoad() {
        this.isReq = true;
        this.load.setVisibility(0);
        this.clear.setVisibility(8);
        Animation loadAnimation = AnimationUtils.loadAnimation(this.dialog.getContext(), R.anim.loading_anim);
        loadAnimation.setInterpolator(new LinearInterpolator());
        this.load.setAnimation(loadAnimation);
        this.load.startAnimation(loadAnimation);
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    protected void onDialogCancel() {
        this.load.clearAnimation();
    }
}
