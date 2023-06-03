package sunmi.sunmiui.dialog;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import sunmi.sunmiui.R;

/* loaded from: classes.dex */
public class EditTextDialog extends BaseEditDialog {
    private static EditTextDialog instance;
    private View clear;
    TextWatcher textWatcher = new TextWatcher() { // from class: sunmi.sunmiui.dialog.EditTextDialog.2
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() > 0) {
                EditTextDialog.this.clear.setVisibility(0);
            } else {
                EditTextDialog.this.clear.setVisibility(4);
            }
        }
    };

    private EditTextDialog() {
    }

    public static EditTextDialog getInstance() {
        if (instance == null) {
            instance = new EditTextDialog();
        }
        return instance;
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    protected void init() {
        this.editText = (EditText) this.dialog.findViewById(R.id.edit);
        this.clear = this.dialog.findViewById(R.id.clear);
        this.editText.addTextChangedListener(this.textWatcher);
        this.clear.setOnClickListener(new View.OnClickListener() { // from class: sunmi.sunmiui.dialog.EditTextDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EditTextDialog.this.editText.setText("");
            }
        });
    }

    @Override // sunmi.sunmiui.dialog.BaseEditDialog, sunmi.sunmiui.dialog.BaseDialog
    protected void onDialogCancel() {
        this.editText.setText("");
        instance = null;
    }

    public void showKeyboard() {
        if (this.editText != null) {
            this.editText.setFocusable(true);
            this.editText.setFocusableInTouchMode(true);
            this.editText.requestFocus();
            ((InputMethodManager) this.editText.getContext().getSystemService("input_method")).showSoftInput(this.editText, 0);
        }
    }

    public void setText(String str) {
        this.editText.setText(str);
        this.editText.setSelection(str.length());
    }

    public EditText getEditText() {
        return this.editText;
    }

    public void setMaxLength(int i) {
        this.editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    public void setHintText(String str) {
        this.editText.setHint(str);
    }

    public void setKeyListen(KeyListener keyListener) {
        this.editText.setKeyListener(keyListener);
    }
}
