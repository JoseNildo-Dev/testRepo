package sunmi.sunmiui.edit;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import sunmi.sunmiui.R;

/* loaded from: classes.dex */
public abstract class BaseEdit extends FrameLayout {
    protected EditText editText;
    protected Resources resources;

    protected abstract View createView();

    public BaseEdit(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public BaseEdit(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public BaseEdit(Context context) {
        super(context);
        init();
    }

    void init() {
        this.resources = getResources();
        this.editText = (EditText) createView().findViewById(R.id.edit);
    }

    public void setHintText(String str) {
        this.editText.setHint(str);
    }

    public void setTextColor(int i) {
        this.editText.setTextColor(i);
    }

    public void setHintTextColor(int i) {
        this.editText.setHintTextColor(i);
    }

    public void setTextSize(float f) {
        this.editText.setTextSize(f);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        this.editText.setBackground(drawable);
    }

    public void setWidth(int i) {
        ViewGroup.LayoutParams layoutParams = this.editText.getLayoutParams();
        layoutParams.width = i;
        this.editText.setLayoutParams(layoutParams);
    }

    public void setHeight(int i) {
        ViewGroup.LayoutParams layoutParams = this.editText.getLayoutParams();
        layoutParams.height = i;
        this.editText.setLayoutParams(layoutParams);
    }

    public String getText() {
        return this.editText.getText().toString();
    }
}
