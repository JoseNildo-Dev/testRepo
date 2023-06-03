package sunmi.sunmiui.viewgraoup;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.List;
import sunmi.sunmiui.R;
import sunmi.sunmiui.utils.Adaptation;

/* loaded from: classes.dex */
public class TabViewPager extends FrameLayout {
    private View mView;
    private RelativeLayout rel_tab;
    private PagerSlidingTabStrip tab;
    private int textSize;
    private ViewPager viewPager;

    public TabViewPager(Context context) {
        super(context);
        init();
    }

    public TabViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public TabViewPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        this.mView = adapterView();
        this.viewPager = (ViewPager) this.mView.findViewById(R.id.view_pager);
        this.tab = (PagerSlidingTabStrip) this.mView.findViewById(R.id.tab);
        this.rel_tab = (RelativeLayout) this.mView.findViewById(R.id.rel_tab);
        this.tab.setTextSize(this.textSize);
        this.tab.setBackgroundColor(Color.parseColor("#2878f0"));
    }

    public void setSelectedTabTextColorResource(int i) {
        this.tab.setSelectedTabTextColorResource(i);
    }

    public void setSelectedTabTextColor(int i) {
        this.tab.setSelectedTabTextColor(i);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        this.tab.setBackgroundResource(i);
        this.rel_tab.setBackgroundResource(i);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.tab.setBackgroundColor(i);
        this.rel_tab.setBackgroundColor(i);
    }

    public void setIndicatorColorResource(int i) {
        this.tab.setIndicatorColorResource(i);
    }

    public void setIndicatorColor(int i) {
        this.tab.setIndicatorColor(i);
    }

    public void setTextColorResource(int i) {
        this.tab.setTextColorResource(i);
    }

    public void setTextColor(int i) {
        this.tab.setTextColor(i);
    }

    public void setData(List<String> list, List<View> list2) throws Exception {
        String str = (list2 == null || list == null) ? "参数都不能为null" : null;
        if ((list2 != null && list2.size() == 0) || (list != null && list.size() == 0)) {
            str = "参数的size必须大于0";
        }
        if (list2 != null && list != null && list2.size() == 0 && list.size() == 0 && list2.size() != list.size()) {
            str = "参数的size必须相等";
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                throw new Exception(str);
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        this.viewPager.setAdapter(new ViewPagerAdapter(list, list2));
        this.tab.setViewPager(this.viewPager);
    }

    private View adapterView() {
        int i = Adaptation.proportion;
        if (i == 1) {
            this.textSize = 13;
            return View.inflate(getContext(), R.layout.view_tab_view_pager_9_16, this);
        } else if (i == 2) {
            this.textSize = 13;
            return View.inflate(getContext(), R.layout.view_tab_view_pager_9_16, this);
        } else if (i == 3) {
            this.textSize = 16;
            return View.inflate(getContext(), R.layout.view_tab_view_pager_16_9, this);
        } else if (i == 4) {
            this.textSize = 16;
            return View.inflate(getContext(), R.layout.view_tab_view_pager_16_9, this);
        } else {
            this.textSize = 13;
            return View.inflate(getContext(), R.layout.view_tab_view_pager_9_16, this);
        }
    }
}
