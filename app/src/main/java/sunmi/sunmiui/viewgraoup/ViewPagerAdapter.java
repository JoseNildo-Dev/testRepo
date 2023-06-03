package sunmi.sunmiui.viewgraoup;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ViewPagerAdapter extends PagerAdapter {
    private List<String> stringList;
    private List<View> views;

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public ViewPagerAdapter(List<String> list, List<View> list2) {
        this.stringList = list;
        this.views = list2;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        return this.views.size();
    }

    @Override // android.support.v4.view.PagerAdapter
    public CharSequence getPageTitle(int i) {
        return this.stringList.get(i);
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(View view, int i, Object obj) {
        ((ViewPager) view).removeView(this.views.get(i));
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(View view, int i) {
        ((ViewPager) view).addView(this.views.get(i));
        return this.views.get(i);
    }

    public boolean insert(View view) {
        if (this.views == null) {
            this.views = new ArrayList();
        }
        return this.views.add(view);
    }
}
