package com.sunmi.sunmisecurityservice.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;

/* loaded from: classes.dex */
public class ImeDelBugFixedEditText extends EditText {
    private OnDelKeyEventListener delKeyEventListener;

    /* loaded from: classes.dex */
    public interface OnDelKeyEventListener {
        void onDeleteClick();
    }

    public ImeDelBugFixedEditText(Context context) {
        super(context);
    }

    public ImeDelBugFixedEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ImeDelBugFixedEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new ZanyInputConnection(super.onCreateInputConnection(editorInfo), true);
    }

    /* loaded from: classes.dex */
    private class ZanyInputConnection extends InputConnectionWrapper {
        public ZanyInputConnection(InputConnection inputConnection, boolean z) {
            super(inputConnection, z);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean sendKeyEvent(KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67 && ImeDelBugFixedEditText.this.delKeyEventListener != null) {
                ImeDelBugFixedEditText.this.delKeyEventListener.onDeleteClick();
                return true;
            }
            return super.sendKeyEvent(keyEvent);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int i, int i2) {
            if (i == 1 && i2 == 0) {
                return sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67));
            }
            return super.deleteSurroundingText(i, i2);
        }
    }

    public void setDelKeyEventListener(OnDelKeyEventListener onDelKeyEventListener) {
        this.delKeyEventListener = onDelKeyEventListener;
    }
}
