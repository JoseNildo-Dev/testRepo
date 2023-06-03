package sunmi.sunmiui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import sunmi.sunmiui.R;

/* loaded from: classes.dex */
public class ErrorView extends FrameLayout {
    private ImageView imgError;
    private View mView;
    private TextView textMsg;
    private TextView textT;

    /* loaded from: classes.dex */
    public enum ErroType {
        NET_ERROR,
        SERVER_ERROR,
        NO_ORDER
    }

    public ErrorView(Context context) {
        super(context);
        init();
    }

    public ErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        this.mView = View.inflate(getContext(), R.layout.view_error, this);
        this.imgError = (ImageView) this.mView.findViewById(R.id.img_error);
        this.textMsg = (TextView) this.mView.findViewById(R.id.text_error);
        this.textT = (TextView) this.mView.findViewById(R.id.text_on);
    }

    /* renamed from: sunmi.sunmiui.view.ErrorView$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$sunmi$sunmiui$view$ErrorView$ErroType = new int[ErroType.values().length];

        static {
            try {
                $SwitchMap$sunmi$sunmiui$view$ErrorView$ErroType[ErroType.NET_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$sunmi$sunmiui$view$ErrorView$ErroType[ErroType.SERVER_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$sunmi$sunmiui$view$ErrorView$ErroType[ErroType.NO_ORDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public void setErrorTypr(ErroType erroType) {
        int i = AnonymousClass1.$SwitchMap$sunmi$sunmiui$view$ErrorView$ErroType[erroType.ordinal()];
        if (i == 1) {
            set(R.drawable.img_no_net, getContext().getString(R.string.net_error), getContext().getString(R.string.click_screen_try));
        } else if (i == 2) {
            set(R.drawable.img_server_error, getContext().getString(R.string.server_error), getContext().getString(R.string.click_screen_try));
        } else if (i != 3) {
        } else {
            set(R.drawable.img_no_order, getContext().getString(R.string.no_order), "");
        }
    }

    private void set(int i, CharSequence charSequence, CharSequence charSequence2) {
        this.imgError.setImageResource(i);
        this.textMsg.setText(charSequence);
        this.textT.setText(charSequence2);
    }

    public void setMsg(CharSequence charSequence) {
        this.textMsg.setText(charSequence);
    }

    public void setImgError(int i) {
        this.imgError.setImageResource(i);
    }

    public void setClickText(CharSequence charSequence) {
        this.textT.setText(charSequence);
    }
}
