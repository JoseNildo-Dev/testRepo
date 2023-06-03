package sunmi.sunmiui.edit;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import sunmi.sunmiui.R;

/* loaded from: classes.dex */
public class EditPwd extends BaseEdit implements TextWatcher {
    private RelativeLayout clear;
    private EditText editText;
    private ImageView eye;
    private Drawable eyeNo;
    private View eyeRegion;
    private Drawable eyeYes;
    private boolean pwdVisible;

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public EditPwd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.pwdVisible = false;
    }

    public EditPwd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.pwdVisible = false;
    }

    public EditPwd(Context context) {
        super(context);
        this.pwdVisible = false;
    }

    @Override // sunmi.sunmiui.edit.BaseEdit
    protected View createView() {
        this.eyeNo = this.resources.getDrawable(R.drawable.eye_no);
        this.eyeYes = this.resources.getDrawable(R.drawable.eye_yes);
        View inflate = View.inflate(getContext(), R.layout.edit_pwd_9_16, this);
        this.clear = (RelativeLayout) inflate.findViewById(R.id.rel_clear);
        this.editText = (EditText) inflate.findViewById(R.id.edit);
        this.eye = (ImageView) inflate.findViewById(R.id.eye);
        this.eyeRegion = inflate.findViewById(R.id.eye_region);
        this.editText.addTextChangedListener(this);
        this.clear.setOnClickListener(new View.OnClickListener() { // from class: sunmi.sunmiui.edit.EditPwd.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EditPwd.this.editText.setText("");
            }
        });
        this.clear.setVisibility(8);
        this.eyeRegion.setOnClickListener(new View.OnClickListener() { // from class: sunmi.sunmiui.edit.EditPwd.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (EditPwd.this.pwdVisible) {
                    EditPwd.this.pwdVisible = false;
                    EditPwd.this.eye.setImageDrawable(EditPwd.this.eyeNo);
                    EditPwd.this.editText.setInputType(129);
                } else {
                    EditPwd.this.pwdVisible = true;
                    EditPwd.this.eye.setImageDrawable(EditPwd.this.eyeYes);
                    EditPwd.this.editText.setInputType(144);
                }
                EditPwd.this.editText.setSelection(EditPwd.this.editText.getText().length());
            }
        });
        return inflate;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable.length() > 0) {
            this.clear.setVisibility(0);
        } else {
            this.clear.setVisibility(8);
        }
    }
}
