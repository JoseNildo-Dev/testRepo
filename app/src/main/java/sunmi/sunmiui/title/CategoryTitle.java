package sunmi.sunmiui.title;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import sunmi.sunmiui.R;
import sunmi.sunmiui.TitleView;

/* loaded from: classes.dex */
public class CategoryTitle extends TitleView {
    public CategoryTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CategoryTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CategoryTitle(Context context) {
        super(context);
    }

    @Override // sunmi.sunmiui.TitleView
    protected View createView() {
        return View.inflate(getContext(), R.layout.title_category_9_16, this);
    }
}
