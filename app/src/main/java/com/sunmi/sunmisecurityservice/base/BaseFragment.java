package com.sunmi.sunmisecurityservice.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sunmi.sunmisecurityservice.base.BasePresenter;

/* loaded from: classes.dex */
public abstract class BaseFragment<V, T extends BasePresenter<V>> extends Fragment {
    protected T mPresenter;

    protected abstract T createPresenter();

    protected abstract int getLayoutRes();

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(getLayoutRes(), (ViewGroup) null);
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mPresenter = createPresenter();
        this.mPresenter.attachView(this);
    }

    protected void startActivity(Class cls) {
        startActivity(cls, true);
    }

    protected void startActivity(Class cls, boolean z) {
        startActivity(new Intent(getContext(), cls));
        if (z) {
            getActivity().finish();
        }
    }

    protected void startActivity(Class cls, String str, String str2) {
        Intent intent = new Intent(getContext(), cls);
        intent.putExtra(str, str2);
        startActivity(intent);
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mPresenter.detachView();
    }
}
