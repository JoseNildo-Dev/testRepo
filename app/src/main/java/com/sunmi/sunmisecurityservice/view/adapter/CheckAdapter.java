package com.sunmi.sunmisecurityservice.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sunmi.sunmisecurityservice.model.entity.AlarmReason;
import com.sunmi.sunmisecurityservice_v3.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class CheckAdapter extends RecyclerView.Adapter<CheckViewHolder> {
    private List<AlarmReason> mAlarmReasonList;
    private Context mContext;

    public CheckAdapter(Context context, List<AlarmReason> list) {
        this.mAlarmReasonList = new ArrayList();
        this.mContext = context;
        this.mAlarmReasonList = list;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public CheckViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new CheckViewHolder(LayoutInflater.from(this.mContext).inflate(R.layout.item_check, viewGroup, false));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(CheckViewHolder checkViewHolder, int i) {
        AlarmReason alarmReason = this.mAlarmReasonList.get(i);
        checkViewHolder.typeTv.setText(alarmReason.type);
        if (alarmReason.currentStatus != 0) {
            if (alarmReason.currentStatus == 1) {
                checkViewHolder.typeTv.setTextColor(this.mContext.getResources().getColor(R.color.red_text));
                checkViewHolder.currentIv.setImageResource(R.drawable.error);
                checkViewHolder.itemLinear.setBackgroundResource(R.color.red_bg);
            } else {
                checkViewHolder.typeTv.setTextColor(this.mContext.getResources().getColor(R.color.black));
                checkViewHolder.itemLinear.setBackgroundResource(R.color.white);
                checkViewHolder.currentIv.setImageResource(R.drawable.no_data);
            }
        } else {
            checkViewHolder.typeTv.setTextColor(this.mContext.getResources().getColor(R.color.black));
            checkViewHolder.itemLinear.setBackgroundResource(R.color.white);
            checkViewHolder.currentIv.setImageResource(R.drawable.right);
        }
        if (alarmReason.historyStatus != 0) {
            if (alarmReason.historyStatus == 1) {
                checkViewHolder.lastIv.setImageResource(R.drawable.error);
                return;
            } else {
                checkViewHolder.lastIv.setImageResource(R.drawable.no_data);
                return;
            }
        }
        checkViewHolder.lastIv.setImageResource(R.drawable.right);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mAlarmReasonList.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class CheckViewHolder extends RecyclerView.ViewHolder {
        private ImageView currentIv;
        private LinearLayout itemLinear;
        private ImageView lastIv;
        private TextView typeTv;

        private CheckViewHolder(View view) {
            super(view);
            this.typeTv = (TextView) view.findViewById(R.id.tv_check_type);
            this.itemLinear = (LinearLayout) view.findViewById(R.id.ll_check_item);
            this.currentIv = (ImageView) view.findViewById(R.id.tv_current_status);
            this.lastIv = (ImageView) view.findViewById(R.id.tv_history_status);
        }
    }
}
