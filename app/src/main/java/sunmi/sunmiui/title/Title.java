package sunmi.sunmiui.title;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import sunmi.sunmiui.R;
import sunmi.sunmiui.TitleView;
import sunmi.sunmiui.utils.Adaptation;

/* loaded from: classes.dex */
public class Title extends TitleView {
    private View add;
    private View btnBack;
    private View headBg;
    private ImageView imgAdd;
    private ImageView imgBack;
    private ImageView imgMenu;
    private ImageView imgReduce;
    private View menu;
    private View reduce;

    public Title(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public Title(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Title(Context context) {
        super(context);
    }

    @Override // sunmi.sunmiui.TitleView
    protected View createView() {
        View adapterView = adapterView();
        this.btnBack = adapterView.findViewById(R.id.back);
        this.headBg = adapterView.findViewById(R.id.bg);
        this.menu = adapterView.findViewById(R.id.rel_menu);
        this.add = adapterView.findViewById(R.id.rel_add);
        this.reduce = adapterView.findViewById(R.id.rel_reduce);
        this.imgBack = (ImageView) adapterView.findViewById(R.id.back_ib);
        this.imgMenu = (ImageView) adapterView.findViewById(R.id.btn_menu);
        this.imgReduce = (ImageView) adapterView.findViewById(R.id.btn_reduce);
        this.imgAdd = (ImageView) adapterView.findViewById(R.id.btn_add);
        return adapterView;
    }

    public void setButtonVisibility(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            this.add.setVisibility(8);
        } else {
            this.add.setVisibility(0);
        }
        if (z4) {
            this.menu.setVisibility(8);
        } else {
            this.menu.setVisibility(0);
        }
        if (z3) {
            this.reduce.setVisibility(8);
        } else {
            this.reduce.setVisibility(0);
        }
        if (z) {
            this.btnBack.setVisibility(8);
        } else {
            this.btnBack.setVisibility(0);
        }
    }

    public void setAllWhite() {
        this.imgReduce.setImageResource(R.drawable.ic_j_white);
        this.imgAdd.setImageResource(R.drawable.ic_add_white);
        this.imgMenu.setImageResource(R.drawable.ic_more_white);
        this.imgBack.setImageResource(R.drawable.ic_back_white);
    }

    public void setAllBlack() {
        this.imgReduce.setImageResource(R.drawable.ic_j_black);
        this.imgAdd.setImageResource(R.drawable.ic_add_black);
        this.imgMenu.setImageResource(R.drawable.ic_more_black);
        this.imgBack.setImageResource(R.drawable.ic_back_black);
    }

    public void setImageViewBackDrawable(int i) {
        this.imgBack.setImageResource(i);
    }

    public void setImageViewMenuDrawable(int i) {
        this.imgMenu.setImageResource(i);
    }

    public void setImageViewAddDrawable(int i) {
        this.imgAdd.setImageResource(i);
    }

    public void setImageVireReduceDrawable(int i) {
        this.imgReduce.setImageResource(i);
    }

    public void setMenuClickListener(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4) {
        this.menu.setOnClickListener(onClickListener4);
        this.reduce.setOnClickListener(onClickListener3);
        this.add.setOnClickListener(onClickListener2);
        this.btnBack.setOnClickListener(onClickListener);
    }

    public void setHeadBgColor(int i) {
        this.headBg.setBackgroundColor(i);
    }

    private View adapterView() {
        int i = Adaptation.proportion;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return View.inflate(getContext(), R.layout.title_16_9, this);
                    }
                    return View.inflate(getContext(), R.layout.title_9_16, this);
                }
                return View.inflate(getContext(), R.layout.title_16_9, this);
            }
            return View.inflate(getContext(), R.layout.title_9_16, this);
        }
        return View.inflate(getContext(), R.layout.title_9_16, this);
    }
}
