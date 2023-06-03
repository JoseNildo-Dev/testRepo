package sunmi.sunmiui.title;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import sunmi.sunmiui.R;
import sunmi.sunmiui.utils.Adaptation;

/* loaded from: classes.dex */
public class TitleHead extends FrameLayout {
    private View mView;
    private TextView title;

    public TitleHead(Context context) {
        super(context);
        init();
    }

    public TitleHead(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public TitleHead(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        this.mView = getView();
        this.title = (TextView) this.mView.findViewById(R.id.txt);
    }

    private View getView() {
        int i = Adaptation.proportion;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return View.inflate(getContext(), R.layout.title_head_16_9, this);
                    }
                    return View.inflate(getContext(), R.layout.title_head_9_16, this);
                }
                return View.inflate(getContext(), R.layout.title_head_16_9, this);
            }
            return View.inflate(getContext(), R.layout.title_head_9_16, this);
        }
        return View.inflate(getContext(), R.layout.title_head_9_16, this);
    }

    public void setTextColor(int i) {
        this.title.setTextColor(i);
    }

    public void setBackground(int i) {
        this.mView.setBackgroundColor(i);
    }
}
