package sunmi.sunmiui.button;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import sunmi.sunmiui.R;
import sunmi.sunmiui.TitleView;

/* loaded from: classes.dex */
public class ButtonRectangular extends TitleView {
    private Drawable bgDisenabled;
    private Drawable bgEnabled;
    private int colorDisenabled;
    private int colorEnabled;

    public ButtonRectangular(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ButtonRectangular(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ButtonRectangular(Context context) {
        super(context);
    }

    @Override // sunmi.sunmiui.TitleView
    protected View createView() {
        View inflate = View.inflate(getContext(), R.layout.button_rectangular_9_16, this);
        this.colorEnabled = getResources().getColor(R.color.FF3C00);
        this.colorDisenabled = getResources().getColor(R.color.AEAEAE);
        this.bgEnabled = getResources().getDrawable(R.drawable.ripple_bg_item, null);
        this.bgDisenabled = getResources().getDrawable(R.color.EEEEEE, null);
        return inflate;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            this.bg.setBackground(this.bgEnabled);
            this.textView.setTextColor(this.colorEnabled);
            return;
        }
        this.bg.setBackground(this.bgDisenabled);
        this.textView.setTextColor(this.colorDisenabled);
    }

    public void setBackgroundEnabled(Drawable drawable) {
        this.bgEnabled = drawable;
        if (isEnabled()) {
            this.bg.setBackground(this.bgEnabled);
        }
    }

    public void setTextColorEnabled(int i) {
        this.colorEnabled = i;
        if (isEnabled()) {
            this.textView.setTextColor(this.colorEnabled);
        }
    }

    public void setBackgroundDisenabled(Drawable drawable) {
        this.bgDisenabled = drawable;
        if (isEnabled()) {
            return;
        }
        this.bg.setBackground(this.bgDisenabled);
    }

    public void setTextColorDisennabled(int i) {
        this.colorDisenabled = i;
        if (isEnabled()) {
            return;
        }
        this.textView.setTextColor(this.colorDisenabled);
    }
}
