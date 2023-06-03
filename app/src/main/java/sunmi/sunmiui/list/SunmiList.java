package sunmi.sunmiui.list;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.List;
import sunmi.sunmiui.R;
import sunmi.sunmiui.utils.Adaptation;

/* loaded from: classes.dex */
public class SunmiList extends LinearLayout {
    private ListView mListView;
    private TextView mTvTitle;

    public SunmiList(Context context) {
        super(context);
        initView();
    }

    public SunmiList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView();
    }

    public SunmiList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView();
    }

    private void initView() {
        View adapterView = getAdapterView();
        addView(adapterView);
        this.mTvTitle = (TextView) adapterView.findViewById(R.id.tv_title);
        this.mListView = (ListView) adapterView.findViewById(R.id.list_view);
    }

    private View getAdapterView() {
        int i = Adaptation.proportion;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return View.inflate(getContext(), R.layout.list_t1_16_9, null);
                    }
                    return View.inflate(getContext(), R.layout.list_v1_9_16, null);
                }
                return View.inflate(getContext(), R.layout.list_t1_16_9, null);
            }
            return View.inflate(getContext(), R.layout.list_v1_9_16, null);
        }
        return View.inflate(getContext(), R.layout.list_v1_9_16, null);
    }

    public void setTitleText(String str) {
        this.mTvTitle.setText(str);
    }

    public void setListAdapter(List<SunmiListBean> list) {
        this.mListView.setAdapter((ListAdapter) new SunmiListAdapter(getContext(), list));
    }

    public void onItemClick(AdapterView.OnItemClickListener onItemClickListener) {
        this.mListView.setOnItemClickListener(onItemClickListener);
    }
}
