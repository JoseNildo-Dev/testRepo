package sunmi.sunmiui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class SettingItemView extends FrameLayout {
    protected View bg;
    protected TextView bottomTextView;
    protected LinearLayout linearLayout;
    protected TextView topTextView;

    protected abstract View createView();

    public SettingItemView(Context context) {
        super(context);
        init();
    }

    public SettingItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public SettingItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    void init() {
        View createView = createView();
        this.topTextView = (TextView) createView.findViewById(R.id.text_top);
        this.bottomTextView = (TextView) createView.findViewById(R.id.text_bottom);
        this.bg = createView.findViewById(R.id.bg);
        this.linearLayout = (LinearLayout) createView.findViewById(R.id.linearlayout);
    }

    public void setText(String str, String str2) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        this.linearLayout.setLayoutParams(layoutParams);
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.topTextView.setVisibility(8);
            this.bottomTextView.setText(str2);
        } else if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            this.bottomTextView.setVisibility(8);
            this.topTextView.setText(str);
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            this.topTextView.setText(str);
            this.bottomTextView.setText(str2);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        this.bg.setBackground(drawable);
    }

    public void setTextColor(int i, int i2) {
        this.topTextView.setTextColor(i);
        this.bottomTextView.setTextColor(i2);
    }

    public void setTextSize(float f, float f2) {
        this.topTextView.setTextSize(f);
        this.bottomTextView.setTextSize(f2);
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

    public void setOnclickListener(View.OnClickListener onClickListener) {
        this.bg.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        this.bg.setClickable(z);
    }
}
