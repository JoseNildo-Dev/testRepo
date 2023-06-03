package com.sunmi.sunmisecurityservice.wifi.adapter;

import android.content.Context;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseListAdapter<T> extends BaseAdapter {
    private Context mContext;
    private List<T> mList = new ArrayList();

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public BaseListAdapter(Context context) {
        this.mContext = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.mList.size();
    }

    @Override // android.widget.Adapter
    public T getItem(int i) {
        return this.mList.get(i);
    }

    public Context getContext() {
        return this.mContext;
    }

    public void setData(List<T> list) {
        this.mList.clear();
        if (!isEmptyList(list)) {
            this.mList.addAll(list);
        }
        notifyDataSetChanged();
    }

    public void setData(int i, T t) {
        this.mList.set(i, t);
        notifyDataSetChanged();
    }

    public void addData(T t) {
        this.mList.add(t);
        notifyDataSetChanged();
    }

    public void addData(int i, T t) {
        this.mList.add(i, t);
        notifyDataSetChanged();
    }

    public void addData(List<T> list) {
        if (!isEmptyList(list)) {
            this.mList.addAll(list);
        }
        notifyDataSetChanged();
    }

    public void addData(int i, List<T> list) {
        if (!isEmptyList(list)) {
            this.mList.addAll(i, list);
        }
        notifyDataSetChanged();
    }

    public boolean removeData(T t) {
        boolean remove = this.mList.remove(t);
        if (remove) {
            notifyDataSetChanged();
        }
        return remove;
    }

    public T removeData(int i) {
        T remove = this.mList.remove(i);
        notifyDataSetChanged();
        return remove;
    }

    public boolean removeData(List<T> list) {
        boolean removeAll = !isEmptyList(list) ? this.mList.removeAll(list) : true;
        if (removeAll) {
            notifyDataSetChanged();
        }
        return removeAll;
    }

    public List<T> getData() {
        return this.mList;
    }

    public void clearData() {
        this.mList.clear();
        notifyDataSetChanged();
    }

    private boolean isEmptyList(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }
}
