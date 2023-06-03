package sunmi.sunmiui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import sunmi.sunmiui.R;
import sunmi.sunmiui.utils.Adaptation;

/* loaded from: classes.dex */
public class LoadView extends FrameLayout {
    private ImageView img;
    private TextView mText;
    private View mView;

    public LoadView(Context context) {
        super(context);
        init();
    }

    public LoadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public LoadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        this.mView = getView();
        this.mText = (TextView) this.mView.findViewById(R.id.txt);
        this.img = (ImageView) this.mView.findViewById(R.id.img);
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.loading_anim);
        loadAnimation.setInterpolator(new LinearInterpolator());
        this.img.setAnimation(loadAnimation);
        this.img.startAnimation(loadAnimation);
    }

    private View getView() {
        int i = Adaptation.proportion;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return View.inflate(getContext(), R.layout.view_load_16_9, this);
                    }
                    return View.inflate(getContext(), R.layout.view_load_9_16, this);
                }
                return View.inflate(getContext(), R.layout.view_load_16_9, this);
            }
            return View.inflate(getContext(), R.layout.view_load_9_16, this);
        }
        return View.inflate(getContext(), R.layout.view_load_9_16, this);
    }

    public void setText(CharSequence charSequence) {
        this.mText.setText(charSequence);
    }
}
