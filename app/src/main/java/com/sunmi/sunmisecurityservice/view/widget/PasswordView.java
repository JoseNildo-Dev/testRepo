package com.sunmi.sunmisecurityservice.view.widget;

import com.sunmi.sunmisecurityservice.view.widget.GridPasswordView;

/* loaded from: classes.dex */
interface PasswordView {
    void clearPassword();

    String getPassWord();

    void setOnPasswordChangedListener(GridPasswordView.OnPasswordChangedListener onPasswordChangedListener);

    void setPassword(String str);

    void setPasswordType(PasswordType passwordType);

    void setPasswordVisibility(boolean z);

    void togglePasswordVisibility();
}
