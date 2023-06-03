package com.sunmi.sunmisecurityservice.base;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import com.sunmi.sunmisecurityservice.base.BasePresenter;
import com.sunmi.sunmisecurityservice_v3.R;

/* loaded from: classes.dex */
public abstract class MVPBaseActivity<V, T extends BasePresenter<V>> extends AppCompatActivity {
    protected T mPresenter;
    private ProgressDialog mProgressDialog;

    protected abstract T createPresenter();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mPresenter = createPresenter();
        this.mPresenter.attachView(this);
        initDialog();
    }

    private void initDialog() {
        this.mProgressDialog = new ProgressDialog(this);
        this.mProgressDialog.setProgressStyle(0);
        this.mProgressDialog.setTitle(R.string.tip);
        this.mProgressDialog.setCancelable(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void showProgress(String str) {
        this.mProgressDialog.setMessage(str);
        this.mProgressDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void dismissProgress() {
        this.mProgressDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void showToast(int i) {
        showToast(getString(i));
    }

    protected void showToast(String str) {
        Toast.makeText(this, str, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mPresenter.detachView();
    }
}
