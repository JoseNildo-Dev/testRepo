package sunmi.sunmiui.window;

import android.content.Context;
import android.graphics.Color;
import android.view.WindowManager;
import android.widget.TextView;

/* loaded from: classes.dex */
public class VersionView {
    private boolean isAdded = false;
    private Context mContext;
    private TextView mText;
    private WindowManager windowManager;
    private WindowManager.LayoutParams windowParams;

    public VersionView(Context context) {
        this.mContext = context;
        initView();
    }

    private void initView() {
        this.mText = new TextView(this.mContext);
        this.mText.setText("release");
        this.mText.setTextColor(Color.parseColor("#ffffff"));
        this.mText.setWidth(80);
        this.mText.setHeight(50);
        this.mText.setGravity(17);
        this.mText.setBackgroundColor(Color.parseColor("#cc000000"));
        if (this.windowManager == null) {
            setWindowParams(0, 0);
            this.windowManager = (WindowManager) this.mContext.getSystemService("window");
        }
    }

    public void showInfo(String str) {
        TextView textView = this.mText;
        textView.setText("" + str);
        if (this.isAdded) {
            return;
        }
        this.windowManager.addView(this.mText, this.windowParams);
        this.isAdded = true;
    }

    public void hide() {
        TextView textView;
        WindowManager windowManager = this.windowManager;
        if (windowManager == null || (textView = this.mText) == null || !this.isAdded) {
            return;
        }
        windowManager.removeView(textView);
        this.isAdded = false;
    }

    private void setWindowParams(int i, int i2) {
        this.windowParams = new WindowManager.LayoutParams();
        WindowManager.LayoutParams layoutParams = this.windowParams;
        layoutParams.gravity = 85;
        layoutParams.x = i;
        layoutParams.y = i2;
        layoutParams.width = 80;
        layoutParams.height = 50;
        layoutParams.flags = 408;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 0;
    }
}
