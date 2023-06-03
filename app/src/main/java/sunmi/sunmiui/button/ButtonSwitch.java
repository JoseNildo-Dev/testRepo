package sunmi.sunmiui.button;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.Switch;
import sunmi.sunmiui.R;

/* loaded from: classes.dex */
public class ButtonSwitch extends FrameLayout {
    protected Switch mSwitch;
    protected Resources resources;

    public ButtonSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public ButtonSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ButtonSwitch(Context context) {
        super(context);
        init();
    }

    protected View createView() {
        return View.inflate(getContext(), R.layout.button_switch_9_16, null);
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.mSwitch.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public void setOnCheck(boolean z) {
        this.mSwitch.setChecked(z);
    }

    public boolean isChecked() {
        return this.mSwitch.isChecked();
    }

    public void setWidth(int i) {
        ViewGroup.LayoutParams layoutParams = this.mSwitch.getLayoutParams();
        layoutParams.width = i;
        this.mSwitch.setLayoutParams(layoutParams);
    }

    public void setHeight(int i) {
        ViewGroup.LayoutParams layoutParams = this.mSwitch.getLayoutParams();
        layoutParams.height = i;
        this.mSwitch.setLayoutParams(layoutParams);
    }

    void init() {
        this.resources = getResources();
        View createView = createView();
        addView(createView);
        this.mSwitch = (Switch) createView.findViewById(R.id.set_switch);
    }

    public void setOnTouch(View.OnTouchListener onTouchListener) {
        this.mSwitch.setOnTouchListener(onTouchListener);
    }
}
