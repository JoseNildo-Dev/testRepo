package com.sunmi.sunmisecurityservice.wifi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sunmi.sunmisecurityservice.wifi.WifiListItemView;
import com.sunmi.sunmisecurityservice.wifi.bean.ScanResultBean;
import com.sunmi.sunmisecurityservice_v3.R;

/* loaded from: classes.dex */
public class WifiListAdapter extends BaseListAdapter<ScanResultBean> {
    public WifiListAdapter(Context context) {
        super(context);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        ViewHolder viewHolder;
        if (view == null) {
            viewHolder = new ViewHolder();
            view2 = LayoutInflater.from(getContext()).inflate(R.layout.item_view, (ViewGroup) null);
            viewHolder.wifiListItem = (WifiListItemView) view2.findViewById(R.id.item);
            view2.setTag(viewHolder);
        } else {
            view2 = view;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.wifiListItem.loadWifiData(getItem(i));
        return view2;
    }

    /* loaded from: classes.dex */
    private static class ViewHolder {
        private WifiListItemView wifiListItem;

        private ViewHolder() {
        }
    }
}
