package com.sunmi.sunmisecurityservice.view.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sunmi.sunmisecurityservice.util.Util;
import com.sunmi.sunmisecurityservice.view.widget.ImeDelBugFixedEditText;
import com.sunmi.sunmisecurityservice_v3.R;

/* loaded from: classes.dex */
public class GridPasswordView extends LinearLayout implements PasswordView {
    private static final int DEFAULT_GRIDCOLOR = -1;
    private static final int DEFAULT_LINECOLOR = -1433892728;
    private static final int DEFAULT_PASSWORDLENGTH = 6;
    private static final int DEFAULT_TEXTSIZE = 16;
    private static final String DEFAULT_TRANSFORMATION = "●";
    private int mGridColor;
    public ImeDelBugFixedEditText mInputView;
    private int mLineColor;
    private Drawable mLineDrawable;
    private int mLineWidth;
    private OnPasswordChangedListener mListener;
    private View.OnClickListener mOnClickListener;
    private Drawable mOuterLineDrawable;
    private String[] mPasswordArr;
    private int mPasswordLength;
    private String mPasswordTransformation;
    private int mPasswordType;
    private ColorStateList mTextColor;
    private int mTextSize;
    private PasswordTransformationMethod mTransformationMethod;
    private TextView[] mViewArr;
    private ImeDelBugFixedEditText.OnDelKeyEventListener onDelKeyEventListener;
    @Deprecated
    private View.OnKeyListener onKeyListener;
    private TextWatcher textWatcher;

    /* loaded from: classes.dex */
    public interface OnPasswordChangedListener {
        void onInputFinish(String str);

        void onTextChanged(String str);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    public GridPasswordView(Context context) {
        super(context);
        this.mTextSize = 16;
        this.mOnClickListener = new View.OnClickListener() { // from class: com.sunmi.sunmisecurityservice.view.widget.GridPasswordView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GridPasswordView.this.forceInputViewGetFocus();
            }
        };
        this.onDelKeyEventListener = new ImeDelBugFixedEditText.OnDelKeyEventListener() { // from class: com.sunmi.sunmisecurityservice.view.widget.GridPasswordView.2
            @Override // com.sunmi.sunmisecurityservice.view.widget.ImeDelBugFixedEditText.OnDelKeyEventListener
            public void onDeleteClick() {
                for (int length = GridPasswordView.this.mPasswordArr.length - 1; length >= 0; length--) {
                    if (GridPasswordView.this.mPasswordArr[length] != null) {
                        GridPasswordView.this.mPasswordArr[length] = null;
                        GridPasswordView.this.mViewArr[length].setText((CharSequence) null);
                        GridPasswordView.this.notifyTextChanged();
                        return;
                    }
                    GridPasswordView.this.mViewArr[length].setText((CharSequence) null);
                }
            }
        };
        this.textWatcher = new TextWatcher() { // from class: com.sunmi.sunmisecurityservice.view.widget.GridPasswordView.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence == null) {
                    return;
                }
                String charSequence2 = charSequence.toString();
                if (charSequence2.length() == 1) {
                    GridPasswordView.this.mPasswordArr[0] = charSequence2;
                    GridPasswordView.this.notifyTextChanged();
                } else if (charSequence2.length() == 2) {
                    String substring = charSequence2.substring(1);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= GridPasswordView.this.mPasswordArr.length) {
                            break;
                        } else if (GridPasswordView.this.mPasswordArr[i4] == null) {
                            GridPasswordView.this.mPasswordArr[i4] = substring;
                            GridPasswordView.this.mViewArr[i4].setText(substring);
                            GridPasswordView.this.notifyTextChanged();
                            break;
                        } else {
                            i4++;
                        }
                    }
                    GridPasswordView.this.mInputView.removeTextChangedListener(this);
                    GridPasswordView.this.mInputView.setText(GridPasswordView.this.mPasswordArr[0]);
                    if (GridPasswordView.this.mInputView.getText().length() >= 1) {
                        GridPasswordView.this.mInputView.setSelection(1);
                    }
                    GridPasswordView.this.mInputView.setOnKeyListener(GridPasswordView.this.onKeyListener);
                    GridPasswordView.this.mInputView.addTextChangedListener(this);
                }
            }
        };
        this.onKeyListener = new View.OnKeyListener() { // from class: com.sunmi.sunmisecurityservice.view.widget.GridPasswordView.4
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
                    GridPasswordView.this.onDelKeyEventListener.onDeleteClick();
                    return true;
                }
                return false;
            }
        };
        initViews(context);
        init(context, null, 0);
    }

    public GridPasswordView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTextSize = 16;
        this.mOnClickListener = new View.OnClickListener() { // from class: com.sunmi.sunmisecurityservice.view.widget.GridPasswordView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GridPasswordView.this.forceInputViewGetFocus();
            }
        };
        this.onDelKeyEventListener = new ImeDelBugFixedEditText.OnDelKeyEventListener() { // from class: com.sunmi.sunmisecurityservice.view.widget.GridPasswordView.2
            @Override // com.sunmi.sunmisecurityservice.view.widget.ImeDelBugFixedEditText.OnDelKeyEventListener
            public void onDeleteClick() {
                for (int length = GridPasswordView.this.mPasswordArr.length - 1; length >= 0; length--) {
                    if (GridPasswordView.this.mPasswordArr[length] != null) {
                        GridPasswordView.this.mPasswordArr[length] = null;
                        GridPasswordView.this.mViewArr[length].setText((CharSequence) null);
                        GridPasswordView.this.notifyTextChanged();
                        return;
                    }
                    GridPasswordView.this.mViewArr[length].setText((CharSequence) null);
                }
            }
        };
        this.textWatcher = new TextWatcher() { // from class: com.sunmi.sunmisecurityservice.view.widget.GridPasswordView.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence == null) {
                    return;
                }
                String charSequence2 = charSequence.toString();
                if (charSequence2.length() == 1) {
                    GridPasswordView.this.mPasswordArr[0] = charSequence2;
                    GridPasswordView.this.notifyTextChanged();
                } else if (charSequence2.length() == 2) {
                    String substring = charSequence2.substring(1);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= GridPasswordView.this.mPasswordArr.length) {
                            break;
                        } else if (GridPasswordView.this.mPasswordArr[i4] == null) {
                            GridPasswordView.this.mPasswordArr[i4] = substring;
                            GridPasswordView.this.mViewArr[i4].setText(substring);
                            GridPasswordView.this.notifyTextChanged();
                            break;
                        } else {
                            i4++;
                        }
                    }
                    GridPasswordView.this.mInputView.removeTextChangedListener(this);
                    GridPasswordView.this.mInputView.setText(GridPasswordView.this.mPasswordArr[0]);
                    if (GridPasswordView.this.mInputView.getText().length() >= 1) {
                        GridPasswordView.this.mInputView.setSelection(1);
                    }
                    GridPasswordView.this.mInputView.setOnKeyListener(GridPasswordView.this.onKeyListener);
                    GridPasswordView.this.mInputView.addTextChangedListener(this);
                }
            }
        };
        this.onKeyListener = new View.OnKeyListener() { // from class: com.sunmi.sunmisecurityservice.view.widget.GridPasswordView.4
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
                    GridPasswordView.this.onDelKeyEventListener.onDeleteClick();
                    return true;
                }
                return false;
            }
        };
        init(context, attributeSet, 0);
    }

    public GridPasswordView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTextSize = 16;
        this.mOnClickListener = new View.OnClickListener() { // from class: com.sunmi.sunmisecurityservice.view.widget.GridPasswordView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GridPasswordView.this.forceInputViewGetFocus();
            }
        };
        this.onDelKeyEventListener = new ImeDelBugFixedEditText.OnDelKeyEventListener() { // from class: com.sunmi.sunmisecurityservice.view.widget.GridPasswordView.2
            @Override // com.sunmi.sunmisecurityservice.view.widget.ImeDelBugFixedEditText.OnDelKeyEventListener
            public void onDeleteClick() {
                for (int length = GridPasswordView.this.mPasswordArr.length - 1; length >= 0; length--) {
                    if (GridPasswordView.this.mPasswordArr[length] != null) {
                        GridPasswordView.this.mPasswordArr[length] = null;
                        GridPasswordView.this.mViewArr[length].setText((CharSequence) null);
                        GridPasswordView.this.notifyTextChanged();
                        return;
                    }
                    GridPasswordView.this.mViewArr[length].setText((CharSequence) null);
                }
            }
        };
        this.textWatcher = new TextWatcher() { // from class: com.sunmi.sunmisecurityservice.view.widget.GridPasswordView.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i22, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i22, int i3) {
                if (charSequence == null) {
                    return;
                }
                String charSequence2 = charSequence.toString();
                if (charSequence2.length() == 1) {
                    GridPasswordView.this.mPasswordArr[0] = charSequence2;
                    GridPasswordView.this.notifyTextChanged();
                } else if (charSequence2.length() == 2) {
                    String substring = charSequence2.substring(1);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= GridPasswordView.this.mPasswordArr.length) {
                            break;
                        } else if (GridPasswordView.this.mPasswordArr[i4] == null) {
                            GridPasswordView.this.mPasswordArr[i4] = substring;
                            GridPasswordView.this.mViewArr[i4].setText(substring);
                            GridPasswordView.this.notifyTextChanged();
                            break;
                        } else {
                            i4++;
                        }
                    }
                    GridPasswordView.this.mInputView.removeTextChangedListener(this);
                    GridPasswordView.this.mInputView.setText(GridPasswordView.this.mPasswordArr[0]);
                    if (GridPasswordView.this.mInputView.getText().length() >= 1) {
                        GridPasswordView.this.mInputView.setSelection(1);
                    }
                    GridPasswordView.this.mInputView.setOnKeyListener(GridPasswordView.this.onKeyListener);
                    GridPasswordView.this.mInputView.addTextChangedListener(this);
                }
            }
        };
        this.onKeyListener = new View.OnKeyListener() { // from class: com.sunmi.sunmisecurityservice.view.widget.GridPasswordView.4
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i2, KeyEvent keyEvent) {
                if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
                    GridPasswordView.this.onDelKeyEventListener.onDeleteClick();
                    return true;
                }
                return false;
            }
        };
        init(context, attributeSet, i);
    }

    public GridPasswordView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mTextSize = 16;
        this.mOnClickListener = new View.OnClickListener() { // from class: com.sunmi.sunmisecurityservice.view.widget.GridPasswordView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GridPasswordView.this.forceInputViewGetFocus();
            }
        };
        this.onDelKeyEventListener = new ImeDelBugFixedEditText.OnDelKeyEventListener() { // from class: com.sunmi.sunmisecurityservice.view.widget.GridPasswordView.2
            @Override // com.sunmi.sunmisecurityservice.view.widget.ImeDelBugFixedEditText.OnDelKeyEventListener
            public void onDeleteClick() {
                for (int length = GridPasswordView.this.mPasswordArr.length - 1; length >= 0; length--) {
                    if (GridPasswordView.this.mPasswordArr[length] != null) {
                        GridPasswordView.this.mPasswordArr[length] = null;
                        GridPasswordView.this.mViewArr[length].setText((CharSequence) null);
                        GridPasswordView.this.notifyTextChanged();
                        return;
                    }
                    GridPasswordView.this.mViewArr[length].setText((CharSequence) null);
                }
            }
        };
        this.textWatcher = new TextWatcher() { // from class: com.sunmi.sunmisecurityservice.view.widget.GridPasswordView.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i22, int i222, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i22, int i222, int i3) {
                if (charSequence == null) {
                    return;
                }
                String charSequence2 = charSequence.toString();
                if (charSequence2.length() == 1) {
                    GridPasswordView.this.mPasswordArr[0] = charSequence2;
                    GridPasswordView.this.notifyTextChanged();
                } else if (charSequence2.length() == 2) {
                    String substring = charSequence2.substring(1);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= GridPasswordView.this.mPasswordArr.length) {
                            break;
                        } else if (GridPasswordView.this.mPasswordArr[i4] == null) {
                            GridPasswordView.this.mPasswordArr[i4] = substring;
                            GridPasswordView.this.mViewArr[i4].setText(substring);
                            GridPasswordView.this.notifyTextChanged();
                            break;
                        } else {
                            i4++;
                        }
                    }
                    GridPasswordView.this.mInputView.removeTextChangedListener(this);
                    GridPasswordView.this.mInputView.setText(GridPasswordView.this.mPasswordArr[0]);
                    if (GridPasswordView.this.mInputView.getText().length() >= 1) {
                        GridPasswordView.this.mInputView.setSelection(1);
                    }
                    GridPasswordView.this.mInputView.setOnKeyListener(GridPasswordView.this.onKeyListener);
                    GridPasswordView.this.mInputView.addTextChangedListener(this);
                }
            }
        };
        this.onKeyListener = new View.OnKeyListener() { // from class: com.sunmi.sunmisecurityservice.view.widget.GridPasswordView.4
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i22, KeyEvent keyEvent) {
                if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
                    GridPasswordView.this.onDelKeyEventListener.onDeleteClick();
                    return true;
                }
                return false;
            }
        };
        init(context, attributeSet, i);
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        initAttrs(context, attributeSet, i);
        initViews(context);
    }

    private void initAttrs(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.gridPasswordView, i, 0);
        this.mTextColor = obtainStyledAttributes.getColorStateList(6);
        if (this.mTextColor == null) {
            this.mTextColor = ColorStateList.valueOf(getResources().getColor(17170435));
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        if (dimensionPixelSize != -1) {
            this.mTextSize = Util.px2sp(context, dimensionPixelSize);
        }
        this.mLineWidth = (int) obtainStyledAttributes.getDimension(2, Util.dp2px(getContext(), 1));
        this.mLineColor = obtainStyledAttributes.getColor(1, DEFAULT_LINECOLOR);
        this.mGridColor = obtainStyledAttributes.getColor(0, -1);
        this.mLineDrawable = obtainStyledAttributes.getDrawable(1);
        if (this.mLineDrawable == null) {
            this.mLineDrawable = new ColorDrawable(this.mLineColor);
        }
        this.mPasswordLength = obtainStyledAttributes.getInt(3, 6);
        this.mPasswordTransformation = obtainStyledAttributes.getString(4);
        if (TextUtils.isEmpty(this.mPasswordTransformation)) {
            this.mPasswordTransformation = DEFAULT_TRANSFORMATION;
        }
        this.mPasswordType = obtainStyledAttributes.getInt(5, 0);
        obtainStyledAttributes.recycle();
        int i2 = this.mPasswordLength;
        this.mPasswordArr = new String[i2];
        this.mViewArr = new TextView[i2];
    }

    private void initViews(Context context) {
        super.setBackgroundDrawable(this.mOuterLineDrawable);
        setShowDividers(0);
        setOrientation(0);
        this.mTransformationMethod = new CustomPasswordTransformationMethod(this.mPasswordTransformation);
        inflaterViews(context);
    }

    private void inflaterViews(Context context) {
        LayoutInflater.from(context).inflate(R.layout.gridpasswordview, this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(130, 130);
        this.mInputView = (ImeDelBugFixedEditText) findViewById(R.id.inputView);
        this.mInputView.setLayoutParams(layoutParams);
        this.mInputView.setMaxEms(this.mPasswordLength);
        this.mInputView.addTextChangedListener(this.textWatcher);
        this.mInputView.setDelKeyEventListener(this.onDelKeyEventListener);
        setCustomAttr(this.mInputView);
        this.mViewArr[0] = this.mInputView;
        for (int i = 1; i < this.mPasswordLength; i++) {
            TextView textView = new TextView(context);
            textView.setBackground(getResources().getDrawable(R.drawable.textbackground));
            textView.setGravity(17);
            layoutParams.setMargins(15, 0, 15, 0);
            layoutParams.gravity = 17;
            setCustomAttr(textView);
            addView(textView, layoutParams);
            this.mViewArr[i] = textView;
        }
        setOnClickListener(this.mOnClickListener);
    }

    private void setCustomAttr(TextView textView) {
        ColorStateList colorStateList = this.mTextColor;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        textView.setTextSize(this.mTextSize);
        int i = 18;
        int i2 = this.mPasswordType;
        if (i2 == 1) {
            i = 129;
        } else if (i2 == 2) {
            i = 145;
        } else if (i2 == 3) {
            i = 225;
        }
        textView.setInputType(i);
    }

    private GradientDrawable generateBackgroundDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.mGridColor);
        gradientDrawable.setStroke(this.mLineWidth, this.mLineColor);
        return gradientDrawable;
    }

    public void forceInputViewGetFocus() {
        this.mInputView.setFocusable(true);
        this.mInputView.setFocusableInTouchMode(true);
        this.mInputView.requestFocus();
        ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this.mInputView, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyTextChanged() {
        if (this.mListener == null) {
            return;
        }
        String passWord = getPassWord();
        this.mListener.onTextChanged(passWord);
        if (passWord.length() == this.mPasswordLength) {
            this.mListener.onInputFinish(passWord);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putStringArray("passwordArr", this.mPasswordArr);
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.mPasswordArr = bundle.getStringArray("passwordArr");
            parcelable = bundle.getParcelable("instanceState");
            this.mInputView.removeTextChangedListener(this.textWatcher);
            setPassword(getPassWord());
            this.mInputView.addTextChangedListener(this.textWatcher);
        }
        super.onRestoreInstanceState(parcelable);
    }

    private void setError(String str) {
        this.mInputView.setError(str);
    }

    @Override // com.sunmi.sunmisecurityservice.view.widget.PasswordView
    public String getPassWord() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            String[] strArr = this.mPasswordArr;
            if (i < strArr.length) {
                if (strArr[i] != null) {
                    sb.append(strArr[i]);
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override // com.sunmi.sunmisecurityservice.view.widget.PasswordView
    public void clearPassword() {
        int i = 0;
        while (true) {
            String[] strArr = this.mPasswordArr;
            if (i >= strArr.length) {
                return;
            }
            strArr[i] = null;
            this.mViewArr[i].setText((CharSequence) null);
            i++;
        }
    }

    @Override // com.sunmi.sunmisecurityservice.view.widget.PasswordView
    public void setPassword(String str) {
        clearPassword();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            String[] strArr = this.mPasswordArr;
            if (i < strArr.length) {
                strArr[i] = charArray[i] + "";
                this.mViewArr[i].setText(this.mPasswordArr[i]);
            }
        }
    }

    @Override // com.sunmi.sunmisecurityservice.view.widget.PasswordView
    public void setPasswordVisibility(boolean z) {
        TextView[] textViewArr;
        for (TextView textView : this.mViewArr) {
            textView.setTransformationMethod(z ? null : this.mTransformationMethod);
            if (textView instanceof EditText) {
                EditText editText = (EditText) textView;
                editText.setSelection(editText.getText().length());
            }
        }
    }

    @Override // com.sunmi.sunmisecurityservice.view.widget.PasswordView
    public void togglePasswordVisibility() {
        setPasswordVisibility(!getPassWordVisibility());
    }

    private boolean getPassWordVisibility() {
        return this.mViewArr[0].getTransformationMethod() == null;
    }

    @Override // com.sunmi.sunmisecurityservice.view.widget.PasswordView
    public void setOnPasswordChangedListener(OnPasswordChangedListener onPasswordChangedListener) {
        this.mListener = onPasswordChangedListener;
    }

    @Override // com.sunmi.sunmisecurityservice.view.widget.PasswordView
    public void setPasswordType(PasswordType passwordType) {
        boolean passWordVisibility = getPassWordVisibility();
        int i = AnonymousClass5.$SwitchMap$com$sunmi$sunmisecurityservice$view$widget$PasswordType[passwordType.ordinal()];
        int i2 = i != 1 ? i != 2 ? i != 3 ? 18 : 225 : 145 : 129;
        for (TextView textView : this.mViewArr) {
            textView.setInputType(i2);
        }
        setPasswordVisibility(passWordVisibility);
    }

    /* renamed from: com.sunmi.sunmisecurityservice.view.widget.GridPasswordView$5  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$com$sunmi$sunmisecurityservice$view$widget$PasswordType = new int[PasswordType.values().length];

        static {
            try {
                $SwitchMap$com$sunmi$sunmisecurityservice$view$widget$PasswordType[PasswordType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$sunmi$sunmisecurityservice$view$widget$PasswordType[PasswordType.TEXTVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$sunmi$sunmisecurityservice$view$widget$PasswordType[PasswordType.TEXTWEB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
