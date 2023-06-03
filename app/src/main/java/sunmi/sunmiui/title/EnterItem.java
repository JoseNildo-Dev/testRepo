package sunmi.sunmiui.title;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import sunmi.sunmiui.R;
import sunmi.sunmiui.SettingItemView;

/* loaded from: classes.dex */
public class EnterItem extends SettingItemView {
    public EnterItem(Context context) {
        super(context);
    }

    public EnterItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EnterItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // sunmi.sunmiui.SettingItemView
    protected View createView() {
        return View.inflate(getContext(), R.layout.view_setting_9_16, this);
    }
}
