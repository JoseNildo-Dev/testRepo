package sunmi.sunmiui.button;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import sunmi.sunmiui.R;
import sunmi.sunmiui.TitleView;

/* loaded from: classes.dex */
public class ButtonRoundCorner extends TitleView {
    @Override // sunmi.sunmiui.TitleView, android.view.View
    @Deprecated
    public void setBackground(Drawable drawable) {
    }

    public ButtonRoundCorner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ButtonRoundCorner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ButtonRoundCorner(Context context) {
        super(context);
    }

    @Override // sunmi.sunmiui.TitleView
    protected View createView() {
        return View.inflate(getContext(), R.layout.button_rounded_corrner_9_16, this);
    }

    public void setBackgroundColor(int i, int i2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(10.0f);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(i2);
        gradientDrawable2.setCornerRadius(10.0f);
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable);
        stateListDrawable.addState(new int[]{16842910}, gradientDrawable2);
        this.bg.setBackground(stateListDrawable);
    }
}
