package sunmi.sunmiui.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import sunmi.sunmiui.R;
import sunmi.sunmiui.utils.Adaptation;

/* loaded from: classes.dex */
public class DialogCreater {
    private static Dialog getHintDialog(Context context) {
        return setHintDialogContentView(context);
    }

    public static HintDialog createHintDialog(Context context, int i, String str, String str2, String str3, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, boolean z) {
        HintDialog hintDialog = HintDialog.getInstance();
        if (hintDialog.hasDialog()) {
            Dialog dialog = hintDialog.getDialog();
            if (Build.VERSION.SDK_INT < 17 || dialog.getOwnerActivity() == null || !dialog.getOwnerActivity().isDestroyed()) {
                return hintDialog;
            }
            hintDialog.onDestory();
        }
        initHintDialog(i, str, str2, str3, onClickListener, onClickListener2, z, hintDialog, getHintDialog(context));
        return hintDialog;
    }

    private static void initHintDialog(int i, String str, String str2, String str3, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, boolean z, HintDialog hintDialog, Dialog dialog) {
        ((ImageView) dialog.findViewById(R.id.img)).setImageResource(i);
        TextView textView = (TextView) dialog.findViewById(R.id.left);
        TextView textView2 = (TextView) dialog.findViewById(R.id.right);
        ((TextView) dialog.findViewById(R.id.content)).setText(str3);
        textView.setText(str);
        textView.setOnClickListener(onClickListener);
        if (z) {
            hintDialog.setSystemDialog(dialog);
        } else {
            hintDialog.setDialog(dialog);
        }
        View findViewById = dialog.findViewById(R.id.line2);
        if (TextUtils.isEmpty(str2)) {
            textView2.setVisibility(8);
            findViewById.setVisibility(8);
            if (Adaptation.proportion == 1) {
                textView.setBackgroundResource(R.drawable.ripple_bg_bottom);
            } else if (Adaptation.proportion == 4) {
                textView.setBackgroundResource(R.drawable.ripple_bg_bottom_t1);
            }
            textView.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 2.0f));
            return;
        }
        textView2.setVisibility(0);
        findViewById.setVisibility(0);
        if (Adaptation.proportion == 1) {
            textView.setBackgroundResource(R.drawable.ripple_bg_left_bottom);
        } else if (Adaptation.proportion == 4) {
            textView.setBackgroundResource(R.drawable.ripple_bg_left_bottom_t1);
        }
        textView2.setText(str2);
        textView2.setOnClickListener(onClickListener2);
    }

    public static TextHintDialog createTextHintDialog(Context context, String str, String str2, String str3, String str4, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, boolean z) {
        TextHintDialog textHintDialog = TextHintDialog.getInstance();
        if (textHintDialog.hasDialog()) {
            return textHintDialog;
        }
        Dialog textHintDialogContentView = setTextHintDialogContentView(context);
        TextView textView = (TextView) textHintDialogContentView.findViewById(R.id.dialog_title);
        TextView textView2 = (TextView) textHintDialogContentView.findViewById(R.id.dialog_msg);
        TextView textView3 = (TextView) textHintDialogContentView.findViewById(R.id.left);
        TextView textView4 = (TextView) textHintDialogContentView.findViewById(R.id.right);
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        textView2.setText(str4);
        textView3.setText(str2);
        textView3.setOnClickListener(onClickListener);
        if (z) {
            textHintDialog.setSystemDialog(textHintDialogContentView);
        } else {
            textHintDialog.setDialog(textHintDialogContentView);
        }
        View findViewById = textHintDialogContentView.findViewById(R.id.line_view);
        if (TextUtils.isEmpty(str3)) {
            textView4.setVisibility(8);
            findViewById.setVisibility(8);
            if (Adaptation.proportion == 1) {
                textView3.setBackgroundResource(R.drawable.ripple_bg_bottom);
            } else if (Adaptation.proportion == 4) {
                textView3.setBackgroundResource(R.drawable.ripple_bg_bottom_t1);
            }
            textView3.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 2.0f));
        } else {
            textView4.setVisibility(0);
            findViewById.setVisibility(0);
            if (Adaptation.proportion == 1) {
                textView3.setBackgroundResource(R.drawable.ripple_bg_left_bottom);
            } else if (Adaptation.proportion == 4) {
                textView3.setBackgroundResource(R.drawable.ripple_bg_left_bottom_t1);
            }
            textView4.setText(str3);
            textView4.setOnClickListener(onClickListener2);
        }
        return textHintDialog;
    }

    public static EditTextDialog createEditTextDialog(Context context, String str, String str2, String str3, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, DialogInterface.OnShowListener onShowListener) {
        EditTextDialog editTextDialog = EditTextDialog.getInstance();
        if (editTextDialog.hasDialog()) {
            return editTextDialog;
        }
        Dialog editTextDialogContentView = setEditTextDialogContentView(context);
        TextView textView = (TextView) editTextDialogContentView.findViewById(R.id.left);
        TextView textView2 = (TextView) editTextDialogContentView.findViewById(R.id.right);
        ((TextView) editTextDialogContentView.findViewById(R.id.title)).setText(str3);
        textView.setText(str);
        textView2.setText(str2);
        textView.setOnClickListener(onClickListener);
        textView2.setOnClickListener(onClickListener2);
        editTextDialogContentView.setOnShowListener(onShowListener);
        editTextDialogContentView.findViewById(R.id.clear).setVisibility(4);
        editTextDialog.setDialog(editTextDialogContentView);
        return editTextDialog;
    }

    public static EditPwdDialog createEditPwdDialog(Context context, String str, String str2, String str3, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, DialogInterface.OnShowListener onShowListener) {
        EditPwdDialog editPwdDialog = EditPwdDialog.getInstance();
        if (editPwdDialog.hasDialog()) {
            return editPwdDialog;
        }
        Dialog editPwdDialogContentView = setEditPwdDialogContentView(context);
        TextView textView = (TextView) editPwdDialogContentView.findViewById(R.id.left);
        TextView textView2 = (TextView) editPwdDialogContentView.findViewById(R.id.right);
        ((TextView) editPwdDialogContentView.findViewById(R.id.title)).setText(str3);
        textView.setText(str);
        textView2.setText(str2);
        textView.setOnClickListener(onClickListener);
        textView2.setOnClickListener(onClickListener2);
        editPwdDialogContentView.setOnShowListener(onShowListener);
        editPwdDialog.setDialog(editPwdDialogContentView);
        return editPwdDialog;
    }

    public static ListDialog createListDialog(Context context, String str, String str2, String[] strArr) {
        ListDialog listDialog = ListDialog.getInstance();
        if (listDialog.hasDialog()) {
            return listDialog;
        }
        Dialog listDialogContentView = setListDialogContentView(context);
        ((TextView) listDialogContentView.findViewById(R.id.title)).setText(str);
        ((TextView) listDialogContentView.findViewById(R.id.btn_cancel)).setText(str2);
        listDialog.setDialog(listDialogContentView);
        listDialog.setData(strArr);
        return listDialog;
    }

    public static LoadingDialog createLoadingDialog(Context context, String str) {
        LoadingDialog loadingDialog = LoadingDialog.getInstance();
        if (loadingDialog.hasDialog()) {
            return loadingDialog;
        }
        Dialog loadingDialogContentView = setLoadingDialogContentView(context);
        ((TextView) loadingDialogContentView.findViewById(R.id.msg)).setText(str);
        loadingDialog.setDialog(loadingDialogContentView);
        return loadingDialog;
    }

    public static HintOneBtnDialog createHintOneBtnDialog(Context context, String str, String str2, String str3, View.OnClickListener onClickListener) {
        HintOneBtnDialog hintOneBtnDialog = HintOneBtnDialog.getInstance();
        if (hintOneBtnDialog.hasDialog()) {
            return hintOneBtnDialog;
        }
        Dialog hintOneBtnDialogContentView = setHintOneBtnDialogContentView(context);
        TextView textView = (TextView) hintOneBtnDialogContentView.findViewById(R.id.head);
        TextView textView2 = (TextView) hintOneBtnDialogContentView.findViewById(R.id.msg);
        TextView textView3 = (TextView) hintOneBtnDialogContentView.findViewById(R.id.btnTxt);
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
        if (TextUtils.isEmpty(str2)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(str2);
        }
        if (TextUtils.isEmpty(str3)) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            textView3.setText(str3);
        }
        textView3.setOnClickListener(onClickListener);
        hintOneBtnDialog.setDialog(hintOneBtnDialogContentView);
        return hintOneBtnDialog;
    }

    private static Dialog setHintOneBtnDialogContentView(Context context) {
        int i = Adaptation.proportion;
        if (i == 1) {
            String str = Build.MODEL;
            if (str.contains("m1") || str.contains("M1")) {
                return getDialog(context, R.layout.dialog_hint_one_btn_9_16_m1);
            }
            return getDialog(context, R.layout.dialog_hint_one_btn_9_16);
        } else if (i == 2 || i == 3) {
            return null;
        } else {
            if (i == 4) {
                return getDialog(context, R.layout.dialog_hint_one_btn_16_9);
            }
            return getDialog(context, R.layout.dialog_hint_one_btn_16_9);
        }
    }

    public static CodeDialog createCodeDialog(Context context) {
        CodeDialog codeDialog = CodeDialog.getInstance();
        if (codeDialog.hasDialog()) {
            return codeDialog;
        }
        Dialog codeDialogContentView = setCodeDialogContentView(context);
        codeDialogContentView.setCanceledOnTouchOutside(false);
        codeDialogContentView.setCancelable(true);
        codeDialog.setDialog(codeDialogContentView);
        return codeDialog;
    }

    private static Dialog setCodeDialogContentView(Context context) {
        int i = Adaptation.proportion;
        if (i == 1) {
            String str = Build.MODEL;
            if (str.contains("M1") || str.contains("m1")) {
                return getDialog(context, R.layout.dialog_code_9_16_m1);
            }
            return getDialog(context, R.layout.dialog_code_9_16);
        } else if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    return getDialog(context, R.layout.dialog_code_16_9);
                }
                return getDialog(context, R.layout.dialog_code_9_16);
            }
            return getDialog(context, R.layout.dialog_code_16_9);
        } else {
            return getDialog(context, R.layout.dialog_code_9_16);
        }
    }

    private static Dialog getDialog(Context context, int i) {
        Dialog dialog = new Dialog(context, R.style.defaultDialogStyle);
        dialog.setContentView(i);
        dialog.getWindow().getAttributes().gravity = 17;
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(false);
        if (context instanceof Activity) {
            dialog.setOwnerActivity((Activity) context);
        }
        return dialog;
    }

    private static Dialog setEditPwdDialogContentView(Context context) {
        int i = Adaptation.proportion;
        if (i != 1) {
            if (i == 2 || i == 3 || i != 4) {
                return null;
            }
            return getDialog(context, R.layout.dialog_edit_pwd_16_9);
        }
        String str = Build.MODEL;
        if (str.contains("M1") || str.equals("m1")) {
            return getDialog(context, R.layout.dialog_edit_pwd_9_16_m1);
        }
        return getDialog(context, R.layout.dialog_edit_pwd_9_16);
    }

    private static Dialog setEditTextDialogContentView(Context context) {
        int i = Adaptation.proportion;
        if (i == 1) {
            if (Build.MODEL.toLowerCase().contains("m1")) {
                return getDialog(context, R.layout.dialog_edit_text_9_16_m1);
            }
            return getDialog(context, R.layout.dialog_edit_text_9_16);
        } else if (i == 2 || i == 3 || i != 4) {
            return null;
        } else {
            return getDialog(context, R.layout.dialog_edit_text_16_9);
        }
    }

    private static Dialog setListDialogContentView(Context context) {
        int i = Adaptation.proportion;
        if (i != 1) {
            if (i == 2 || i == 3 || i != 4) {
                return null;
            }
            return getDialog(context, R.layout.dialog_item_select_16_9);
        }
        return getDialog(context, R.layout.dialog_item_select_9_16);
    }

    private static Dialog setLoadingDialogContentView(Context context) {
        int i = Adaptation.proportion;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return getDialog(context, R.layout.dialog_loading_16_9);
                    }
                    return getDialog(context, R.layout.dialog_loading_9_16);
                }
                return getDialog(context, R.layout.dialog_loading_16_9);
            }
            return getDialog(context, R.layout.dialog_loading_9_16);
        }
        return getDialog(context, R.layout.dialog_loading_9_16);
    }

    private static Dialog setHintDialogContentView(Context context) {
        int i = Adaptation.proportion;
        if (i == 1) {
            String str = Build.MODEL;
            if (str.contains("M1") || str.contains("m1")) {
                return getDialog(context, R.layout.dialog_hint_9_16_m1);
            }
            return getDialog(context, R.layout.dialog_hint_9_16);
        } else if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    return getDialog(context, R.layout.dialog_hint_16_9);
                }
                return getDialog(context, R.layout.dialog_hint_9_16);
            }
            return getDialog(context, R.layout.dialog_hint_16_9);
        } else {
            return getDialog(context, R.layout.dialog_hint_9_16);
        }
    }

    private static Dialog setTextHintDialogContentView(Context context) {
        int i = Adaptation.proportion;
        if (i == 1) {
            String str = Build.MODEL;
            if (str.contains("m1") || str.contains("M1")) {
                return getDialog(context, R.layout.dialog_text_hint_9_16_m1);
            }
            return getDialog(context, R.layout.dialog_text_hint_9_16);
        } else if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    return getDialog(context, R.layout.dialog_text_hint_4_3);
                }
                return getDialog(context, R.layout.dialog_text_hint_9_16);
            }
            return getDialog(context, R.layout.dialog_text_hint_4_3);
        } else {
            return getDialog(context, R.layout.dialog_text_hint_9_16);
        }
    }
}
