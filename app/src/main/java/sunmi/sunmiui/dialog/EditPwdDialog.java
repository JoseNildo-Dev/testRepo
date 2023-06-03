package sunmi.sunmiui.dialog;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import sunmi.sunmiui.R;

/* loaded from: classes.dex */
public class EditPwdDialog extends BaseEditDialog {
    public static final String TAG = "EditPwdDialog";
    private static EditPwdDialog instance;
    private RelativeLayout clear;
    private TextView error;
    private ImageView eye;
    private Drawable eyeNo;
    private View eyeRegion;
    private Drawable eyeYes;
    private boolean pwdVisible = false;
    TextWatcher textWatcher = new TextWatcher() { // from class: sunmi.sunmiui.dialog.EditPwdDialog.3
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            EditPwdDialog.this.error.setVisibility(4);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() > 0) {
                EditPwdDialog.this.clear.setVisibility(0);
            } else {
                EditPwdDialog.this.clear.setVisibility(8);
            }
        }
    };

    private EditPwdDialog() {
    }

    public static EditPwdDialog getInstance() {
        if (instance == null) {
            instance = new EditPwdDialog();
        }
        return instance;
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    protected void init() {
        this.eyeNo = this.resources.getDrawable(R.drawable.eye_no, null);
        this.eyeYes = this.resources.getDrawable(R.drawable.eye_yes, null);
        this.error = (TextView) this.dialog.findViewById(R.id.error);
        this.editText = (EditText) this.dialog.findViewById(R.id.edit);
        this.eye = (ImageView) this.dialog.findViewById(R.id.eye);
        this.eyeRegion = this.dialog.findViewById(R.id.eye_region);
        this.clear = (RelativeLayout) this.dialog.findViewById(R.id.rel_clear);
        this.clear.setVisibility(8);
        this.clear.setOnClickListener(new View.OnClickListener() { // from class: sunmi.sunmiui.dialog.EditPwdDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EditPwdDialog.this.editText.setText("");
            }
        });
        this.eyeRegion.setOnClickListener(new View.OnClickListener() { // from class: sunmi.sunmiui.dialog.EditPwdDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (EditPwdDialog.this.pwdVisible) {
                    EditPwdDialog.this.pwdVisible = false;
                    EditPwdDialog.this.eye.setImageDrawable(EditPwdDialog.this.eyeNo);
                    EditPwdDialog.this.editText.setInputType(129);
                } else {
                    EditPwdDialog.this.pwdVisible = true;
                    EditPwdDialog.this.eye.setImageDrawable(EditPwdDialog.this.eyeYes);
                    EditPwdDialog.this.editText.setInputType(144);
                }
                EditPwdDialog.this.editText.setSelection(EditPwdDialog.this.editText.getText().length());
                Log.d(EditPwdDialog.TAG, "onClick:" + EditPwdDialog.this.pwdVisible);
            }
        });
        this.editText.addTextChangedListener(this.textWatcher);
    }

    public void showKeyboard() {
        if (this.editText != null) {
            this.editText.setFocusable(true);
            this.editText.setFocusableInTouchMode(true);
            this.editText.requestFocus();
            ((InputMethodManager) this.editText.getContext().getSystemService("input_method")).showSoftInput(this.editText, 0);
        }
    }

    public void setKeyListen(KeyListener keyListener) {
        this.editText.setKeyListener(keyListener);
    }

    public void showError(String str) {
        this.error.setText(str);
        this.error.setVisibility(0);
    }

    @Override // sunmi.sunmiui.dialog.BaseEditDialog, sunmi.sunmiui.dialog.BaseDialog
    protected void onDialogCancel() {
        this.editText.setText("");
        instance = null;
    }
}
