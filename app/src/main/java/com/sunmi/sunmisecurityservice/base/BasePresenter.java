package com.sunmi.sunmisecurityservice.base;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class BasePresenter<T> {
    protected Reference<T> mViewRef;

    public void attachView(T t) {
        this.mViewRef = new WeakReference(t);
    }

    protected T getView() {
        return this.mViewRef.get();
    }

    public boolean isViewAttached() {
        Reference<T> reference = this.mViewRef;
        return (reference == null || reference.get() == null) ? false : true;
    }

    public void detachView() {
        Reference<T> reference = this.mViewRef;
        if (reference != null) {
            reference.clear();
            this.mViewRef = null;
        }
    }
}
