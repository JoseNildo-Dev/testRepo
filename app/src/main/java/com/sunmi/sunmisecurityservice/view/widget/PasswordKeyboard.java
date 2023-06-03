package com.sunmi.sunmisecurityservice.view.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.sunmi.sunmisecurityservice_v3.R;

/* loaded from: classes.dex */
public class PasswordKeyboard extends ViewGroup {
    private int hSpacing;
    int lineFlag;
    private KeyClickCallback mKeyClickCallback;
    private int mKeyWidth;
    private int mLineHeight;
    int position;
    private int screenHeight;
    private int screenWidth;
    private int textSize;
    private int vSpacing;

    /* loaded from: classes.dex */
    public interface KeyClickCallback {
        void onDelAll();

        void onDelClick();

        void onNumClick(String str);
    }

    public void setKeyClickCallback(KeyClickCallback keyClickCallback) {
        this.mKeyClickCallback = keyClickCallback;
    }

    public PasswordKeyboard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.hSpacing = 0;
        this.vSpacing = 0;
        this.lineFlag = 1;
        this.position = -1;
        init();
    }

    public PasswordKeyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.hSpacing = 0;
        this.vSpacing = 0;
        this.lineFlag = 1;
        this.position = -1;
        init();
    }

    public PasswordKeyboard(Context context) {
        super(context);
        this.hSpacing = 0;
        this.vSpacing = 0;
        this.lineFlag = 1;
        this.position = -1;
        init();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void init() {
        /*
            r11 = this;
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.content.Context r1 = r11.getContext()
            android.app.Activity r1 = (android.app.Activity) r1
            android.view.WindowManager r1 = r1.getWindowManager()
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getMetrics(r0)
            int r1 = r0.heightPixels
            r11.screenHeight = r1
            int r0 = r0.widthPixels
            r11.screenWidth = r0
            int r0 = r11.screenWidth
            r1 = 3
            int r0 = r0 / r1
            r11.mKeyWidth = r0
            int r0 = r11.screenHeight
            int r0 = r0 * 130
            int r0 = r0 / 1184
            r11.mLineHeight = r0
            r0 = 18
            r11.textSize = r0
            r0 = 0
            r11.hSpacing = r0
            r11.vSpacing = r0
            r2 = 1
            r3 = r2
        L37:
            r4 = 12
            if (r3 > r4) goto La8
            android.content.Context r4 = r11.getContext()
            r5 = 2131361884(0x7f0a005c, float:1.8343533E38)
            r6 = 0
            android.view.View r4 = inflate(r4, r5, r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            int r5 = r11.textSize
            float r5 = (float) r5
            r4.setTextSize(r5)
            int r5 = r11.lineFlag
            r7 = 4
            r8 = -1
            if (r5 != r7) goto L79
            r5 = 10
            if (r3 != r5) goto L67
            android.content.Context r5 = r11.getContext()
            r7 = 2131361886(0x7f0a005e, float:1.8343537E38)
            android.view.View r5 = inflate(r5, r7, r6)
        L64:
            r6 = r5
            r5 = r8
            goto L7b
        L67:
            r5 = 11
            if (r3 != r5) goto L6d
            r5 = r0
            goto L7a
        L6d:
            android.content.Context r5 = r11.getContext()
            r7 = 2131361887(0x7f0a005f, float:1.834354E38)
            android.view.View r5 = inflate(r5, r7, r6)
            goto L64
        L79:
            r5 = r3
        L7a:
            r6 = r4
        L7b:
            android.view.ViewGroup$LayoutParams r7 = new android.view.ViewGroup$LayoutParams
            int r9 = r11.mKeyWidth
            int r9 = r9 + (-2)
            int r10 = r11.mLineHeight
            int r10 = r10 + (-2)
            r7.<init>(r9, r10)
            if (r5 == r8) goto L91
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.setText(r5)
        L91:
            r6.setLayoutParams(r7)
            r11.addView(r6)
            if (r3 == r1) goto La0
            r4 = 6
            if (r3 == r4) goto La0
            r4 = 9
            if (r3 != r4) goto La5
        La0:
            int r4 = r11.lineFlag
            int r4 = r4 + r2
            r11.lineFlag = r4
        La5:
            int r3 = r3 + 1
            goto L37
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sunmi.sunmisecurityservice.view.widget.PasswordKeyboard.init():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
        if ((r3 + r12) < r1) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            int r11 = r10.mKeyWidth
            r0 = 3
            int r11 = r11 * r0
            int r1 = r10.hSpacing
            int r1 = r1 * r0
            int r11 = r11 + r1
            int r1 = android.view.View.MeasureSpec.getSize(r12)
            int r2 = r10.getPaddingBottom()
            int r1 = r1 + r2
            int r2 = r10.getPaddingTop()
            int r1 = r1 + r2
            int r2 = r10.getChildCount()
            r10.getPaddingLeft()
            int r3 = r10.getPaddingTop()
            r4 = 0
            r5 = r4
        L23:
            if (r4 >= r2) goto L68
            android.view.View r6 = r10.getChildAt(r4)
            int r7 = r6.getVisibility()
            r8 = 8
            if (r7 == r8) goto L65
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            int r8 = r7.width
            r9 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r7 = r7.height
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            r6.measure(r8, r7)
            r6.getMeasuredWidth()
            int r6 = r6.getMeasuredHeight()
            int r7 = r10.vSpacing
            int r6 = r6 + r7
            int r5 = java.lang.Math.max(r5, r6)
            if (r4 == r0) goto L5d
            r6 = 6
            if (r4 == r6) goto L5d
            r6 = 9
            if (r4 != r6) goto L63
        L5d:
            r10.getPaddingLeft()
            int r6 = r10.mLineHeight
            int r3 = r3 + r6
        L63:
            int r6 = r10.hSpacing
        L65:
            int r4 = r4 + 1
            goto L23
        L68:
            int r0 = android.view.View.MeasureSpec.getMode(r12)
            if (r0 != 0) goto L73
            int r12 = r10.mLineHeight
        L70:
            int r1 = r3 + r12
            goto L85
        L73:
            int r12 = android.view.View.MeasureSpec.getMode(r12)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 != r0) goto L82
            int r12 = r10.mLineHeight
            int r0 = r3 + r12
            if (r0 >= r1) goto L85
            goto L70
        L82:
            int r12 = r10.mLineHeight
            goto L70
        L85:
            r10.setMeasuredDimension(r11, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sunmi.sunmisecurityservice.view.widget.PasswordKeyboard.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (i5 == 3 || i5 == 6 || i5 == 9) {
                paddingLeft = getPaddingLeft();
                paddingTop += this.mLineHeight;
            }
            childAt.layout(paddingLeft + 2, paddingTop + 2, paddingLeft + measuredWidth, measuredHeight + paddingTop + 2);
            paddingLeft += measuredWidth + this.hSpacing;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int i = this.position;
        if (i != -1 && i != pointToPosition(x, y)) {
            getChildAt(this.position).setBackgroundColor(getResources().getColor(R.color.white));
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.position = pointToPosition(x, y);
            View childAt = getChildAt(this.position);
            if (childAt == null) {
                return true;
            }
            childAt.setBackgroundColor(getResources().getColor(R.color.F0F0F0));
        } else if (action == 1) {
            this.position = pointToPosition(x, y);
            View childAt2 = getChildAt(this.position);
            if (childAt2 == null) {
                return true;
            }
            childAt2.setBackgroundColor(getResources().getColor(R.color.white));
            KeyClickCallback keyClickCallback = this.mKeyClickCallback;
            if (keyClickCallback != null) {
                int i2 = this.position;
                if (i2 + 1 == 10) {
                    keyClickCallback.onDelClick();
                } else if (i2 + 1 == 12) {
                    keyClickCallback.onDelAll();
                } else {
                    this.mKeyClickCallback.onNumClick(((TextView) childAt2).getText().toString());
                }
            }
        }
        return true;
    }

    public int pointToPosition(int i, int i2) {
        Rect rect = new Rect();
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            getChildAt(childCount).getHitRect(rect);
            if (rect.contains(i, i2)) {
                return childCount;
            }
        }
        return -1;
    }
}
