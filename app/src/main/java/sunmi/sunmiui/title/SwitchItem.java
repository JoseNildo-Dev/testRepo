package sunmi.sunmiui.title;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import sunmi.sunmiui.R;
import sunmi.sunmiui.SettingItemView;
import sunmi.sunmiui.button.ButtonSwitch;

/* loaded from: classes.dex */
public class SwitchItem extends SettingItemView {
    protected ButtonSwitch buttonSwitch;

    public SwitchItem(Context context) {
        super(context);
    }

    public SwitchItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SwitchItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // sunmi.sunmiui.SettingItemView
    protected View createView() {
        View inflate = View.inflate(getContext(), R.layout.view_switch_9_16, this);
        this.buttonSwitch = (ButtonSwitch) inflate.findViewById(R.id.set_switch);
        return inflate;
    }

    public void setOncheckChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.buttonSwitch.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public boolean isChecked() {
        return this.buttonSwitch.isChecked();
    }

    public void setChecked(boolean z) {
        this.buttonSwitch.setOnCheck(z);
    }
}
