package sunmi.sunmiui.list;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;
import sunmi.sunmiui.R;
import sunmi.sunmiui.utils.Adaptation;

/* loaded from: classes.dex */
public class SunmiListAdapter extends BaseAdapter {
    private List<SunmiListBean> list;
    private Context mContext;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public SunmiListAdapter(Context context, List<SunmiListBean> list) {
        this.mContext = context;
        this.list = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.list.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = getAdapterView();
        }
        ((TextView) view.findViewById(R.id.tv_title)).setText(this.list.get(i).title);
        ((TextView) view.findViewById(R.id.tv_content)).setText(this.list.get(i).content);
        return view;
    }

    public View getAdapterView() {
        int i = Adaptation.proportion;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return View.inflate(this.mContext, R.layout.item_list_t1_16_9, null);
                    }
                    return View.inflate(this.mContext, R.layout.item_list_v1_9_16, null);
                }
                return View.inflate(this.mContext, R.layout.item_list_t1_16_9, null);
            }
            return View.inflate(this.mContext, R.layout.item_list_v1_9_16, null);
        }
        return View.inflate(this.mContext, R.layout.item_list_v1_9_16, null);
    }
}
