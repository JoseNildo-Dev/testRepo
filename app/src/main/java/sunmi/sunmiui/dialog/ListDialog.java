package sunmi.sunmiui.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import sunmi.sunmiui.R;
import sunmi.sunmiui.utils.Adaptation;
import sunmi.sunmiui.utils.LogUtil;

/* loaded from: classes.dex */
public class ListDialog extends BaseDialog {
    private static ListDialog instance;
    private ItemClickListener itemClickListener;
    private LinearLayout list;
    private ScrollView scrollView;

    /* loaded from: classes.dex */
    public interface ItemClickListener {
        void OnItemClick(int i);
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog, android.content.DialogInterface
    public /* bridge */ /* synthetic */ void cancel() {
        super.cancel();
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog, android.content.DialogInterface
    public /* bridge */ /* synthetic */ void dismiss() {
        super.dismiss();
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    public /* bridge */ /* synthetic */ Dialog getDialog() {
        return super.getDialog();
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    public /* bridge */ /* synthetic */ boolean hasDialog() {
        return super.hasDialog();
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    public /* bridge */ /* synthetic */ void onDestory() {
        super.onDestory();
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    public /* bridge */ /* synthetic */ void setCancelable(boolean z) {
        super.setCancelable(z);
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    public /* bridge */ /* synthetic */ void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    public /* bridge */ /* synthetic */ void setDialog(Dialog dialog) {
        super.setDialog(dialog);
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    public /* bridge */ /* synthetic */ void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        super.setOnCancelListener(onCancelListener);
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    public /* bridge */ /* synthetic */ void setSystemDialog(Dialog dialog) {
        super.setSystemDialog(dialog);
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    public /* bridge */ /* synthetic */ void show() {
        super.show();
    }

    private ListDialog() {
    }

    public static ListDialog getInstance() {
        if (instance == null) {
            instance = new ListDialog();
        }
        return instance;
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    protected void init() {
        this.scrollView = (ScrollView) this.dialog.findViewById(R.id.scrollView);
        this.list = (LinearLayout) this.dialog.findViewById(R.id.list);
        this.dialog.findViewById(R.id.btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: sunmi.sunmiui.dialog.ListDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ListDialog.this.cancel();
            }
        });
    }

    @Override // sunmi.sunmiui.dialog.BaseDialog
    protected void onDialogCancel() {
        this.dialog = null;
        instance = null;
    }

    public void setData(String[] strArr) {
        this.list.removeAllViews();
        float height = getHeight();
        LogUtil.d("ListDialog", height + "");
        ViewGroup.LayoutParams layoutParams = this.scrollView.getLayoutParams();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < strArr.length; i3++) {
            String str = strArr[i3];
            View inflatView = inflatView();
            ((TextView) inflatView.findViewById(R.id.text)).setText(str);
            inflatView.setTag(Integer.valueOf(i3));
            inflatView.setOnClickListener(new ItemClick());
            this.list.addView(inflatView);
            if (i3 <= 3) {
                i = (int) (i + height);
                i2 = i3;
            }
        }
        layoutParams.height = i + i2 + 1;
        this.scrollView.setLayoutParams(layoutParams);
    }

    /* loaded from: classes.dex */
    class ItemClick implements View.OnClickListener {
        ItemClick() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int intValue = ((Integer) view.getTag()).intValue();
            if (ListDialog.this.itemClickListener != null) {
                ListDialog.this.itemClickListener.OnItemClick(intValue);
            }
        }
    }

    private float getHeight() {
        int i = Adaptation.proportion;
        if (i != 1) {
            if (i == 2 || i == 3 || i != 4) {
                return 0.0f;
            }
            return this.resources.getDimension(R.dimen.itemHeightT1);
        }
        return this.resources.getDimension(R.dimen.itemHeight);
    }

    private View inflatView() {
        int i = Adaptation.proportion;
        if (i != 1) {
            if (i == 2 || i == 3 || i != 4) {
                return null;
            }
            return View.inflate(this.dialog.getContext(), R.layout.item_text_16_9, null);
        }
        return View.inflate(this.dialog.getContext(), R.layout.item_text_9_16, null);
    }
}
