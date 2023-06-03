package sunmi.sunmiui.edit;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import sunmi.sunmiui.R;

/* loaded from: classes.dex */
public class Edit extends BaseEdit implements TextWatcher, View.OnClickListener {
    private RelativeLayout clear;
    private EditText edittext;

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public Edit(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public Edit(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Edit(Context context) {
        super(context);
    }

    @Override // sunmi.sunmiui.edit.BaseEdit
    protected View createView() {
        View inflate = View.inflate(getContext(), R.layout.edit_text_9_16, this);
        this.edittext = (EditText) inflate.findViewById(R.id.edit);
        this.edittext.addTextChangedListener(this);
        this.clear = (RelativeLayout) inflate.findViewById(R.id.rel_clear);
        this.clear.setOnClickListener(this);
        this.clear.setVisibility(8);
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

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.edittext.setText("");
    }
}
