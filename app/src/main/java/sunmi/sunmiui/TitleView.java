package sunmi.sunmiui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class TitleView extends FrameLayout {
    protected View bg;
    protected TextView textView;

    protected abstract View createView();

    public TitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public TitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public TitleView(Context context) {
        super(context);
        init();
    }

    void init() {
        View createView = createView();
        this.textView = (TextView) createView.findViewById(R.id.text);
        this.bg = createView.findViewById(R.id.bg);
    }

    public void setTitleText(String str) {
        this.textView.setText(str);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        this.bg.setBackground(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.bg.setBackgroundColor(i);
    }

    public void setTextColor(int i) {
        this.textView.setTextColor(i);
    }

    public void setTextSize(float f) {
        this.textView.setTextSize(f);
    }

    public void setWidth(int i) {
        ViewGroup.LayoutParams layoutParams = this.bg.getLayoutParams();
        layoutParams.width = i;
        this.bg.setLayoutParams(layoutParams);
    }

    public void setHeight(int i) {
        ViewGroup.LayoutParams layoutParams = this.bg.getLayoutParams();
        layoutParams.height = i;
        this.bg.setLayoutParams(layoutParams);
    }

    public void addTitleRule(int i) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(i);
        this.textView.setLayoutParams(layoutParams);
    }
}
