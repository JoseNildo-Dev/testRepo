package com.sunmi.sunmisecurityservice.view.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.TextView;
import com.sunmi.sunmisecurityservice_v3.R;

/* loaded from: classes.dex */
public class PasswordInputView extends TextView {
    private int borderColor;
    private Paint borderPaint;
    private final int defaultContMargin;
    private final int defaultSplitLineWidth;
    private StringBuilder inputPassword;
    private InputCallback mInputCallback;
    private int passwordColor;
    Bitmap passwordDef;
    Bitmap passwordInput;
    private int passwordLength;
    private Paint passwordPaint;
    private final int space;
    private int textLength;

    /* loaded from: classes.dex */
    public interface InputCallback {
        void onSuccess();
    }

    public void setInputCallback(InputCallback inputCallback) {
        this.mInputCallback = inputCallback;
    }

    public PasswordInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.textLength = 0;
        this.passwordLength = 6;
        this.passwordPaint = new Paint(1);
        this.borderPaint = new Paint(1);
        this.defaultContMargin = 1;
        this.defaultSplitLineWidth = 1;
        this.space = 15;
        Resources resources = getResources();
        this.passwordInput = BitmapFactory.decodeResource(resources, R.mipmap.password_inputed);
        this.passwordDef = BitmapFactory.decodeResource(resources, R.mipmap.password_def);
        this.passwordColor = getResources().getColor(R.color.black);
        this.passwordPaint.setTextSize(34.0f);
        this.passwordPaint.setColor(this.passwordColor);
        this.borderColor = getResources().getColor(R.color.white);
        this.borderPaint.setStrokeWidth(1.0f);
        this.borderPaint.setColor(this.borderColor);
        this.inputPassword = new StringBuilder();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int i;
        int width = getWidth() - ((this.passwordLength - 1) * 15);
        int height = getHeight();
        int i2 = width / this.passwordLength;
        RectF rectF = new RectF();
        int i3 = 1;
        while (true) {
            i = this.passwordLength;
            if (i3 > i) {
                break;
            }
            if (i3 <= this.textLength) {
                this.borderColor = getResources().getColor(R.color.F0F0F0);
                this.borderPaint.setColor(this.borderColor);
            } else {
                this.borderColor = getResources().getColor(R.color.default_edit_color);
                this.borderPaint.setColor(this.borderColor);
            }
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            float f = i2;
            rectF.right = f + 0.0f;
            rectF.bottom = 100.0f;
            if (i3 > 1) {
                int i4 = i3 - 1;
                float f2 = ((width * i4) / this.passwordLength) + (i4 * 15);
                rectF.left = f2;
                rectF.top = 0.0f;
                rectF.right = f2 + f;
                rectF.bottom = 100.0f;
            }
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, this.borderPaint);
            i3++;
        }
        float f3 = height / 2;
        float f4 = (width / i) / 2;
        int i5 = 0;
        while (i5 < this.textLength) {
            canvas.drawText("*", ((((width * i5) / this.passwordLength) + f4) + ((i5 == 0 ? 0 : 15) * i5)) - 5.0f, 15.0f + f3, this.passwordPaint);
            i5++;
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        InputCallback inputCallback;
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.inputPassword == null) {
            return;
        }
        this.textLength = charSequence.toString().length();
        if (this.textLength == this.passwordLength && (inputCallback = this.mInputCallback) != null) {
            inputCallback.onSuccess();
        }
        invalidate();
    }

    public synchronized void addText(String str) {
        if (this.inputPassword.length() == this.passwordLength) {
            return;
        }
        this.inputPassword.append(str);
        setText(this.inputPassword.toString());
    }

    public void deleteAll() {
        if (this.inputPassword.length() == 0) {
            return;
        }
        StringBuilder sb = this.inputPassword;
        sb.delete(0, sb.length());
        setText(this.inputPassword.toString());
    }

    public void deleteLast() {
        if (this.inputPassword.length() == 0) {
            return;
        }
        StringBuilder sb = this.inputPassword;
        sb.deleteCharAt(sb.length() - 1);
        setText(this.inputPassword.toString());
    }

    public int getBorderColor() {
        return this.borderColor;
    }

    public void setBorderColor(int i) {
        this.borderColor = i;
        this.borderPaint.setColor(i);
        invalidate();
    }

    public void setBorderWidth(float f) {
        this.borderPaint.setStrokeWidth(f);
        invalidate();
    }

    public int getPasswordLength() {
        return this.passwordLength;
    }

    public void setPasswordLength(int i) {
        this.passwordLength = i;
        invalidate();
    }

    public int getPasswordColor() {
        return this.passwordColor;
    }

    public void setPasswordColor(int i) {
        this.passwordColor = i;
        this.passwordPaint.setColor(i);
        invalidate();
    }

    public boolean isCompleteInput() {
        return this.textLength == this.passwordLength;
    }

    public String getPassword() {
        StringBuilder sb = this.inputPassword;
        if (sb == null) {
            return null;
        }
        return sb.toString();
    }
}
