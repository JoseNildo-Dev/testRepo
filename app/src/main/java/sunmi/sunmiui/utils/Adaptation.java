package sunmi.sunmiui.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;

/* loaded from: classes.dex */
public class Adaptation {
    public static final float AVERAGE1 = 0.655f;
    public static final float AVERAGE2 = 1.04f;
    public static final float AVERAGE3 = 1.55f;
    public static final int SCREEN_16_9 = 4;
    public static final int SCREEN_3_4 = 2;
    public static final int SCREEN_4_3 = 3;
    public static final int SCREEN_9_16 = 1;
    public static int densityDpi = 0;
    public static int proportion = 1;
    public static float screenDensity;
    public static int screenHeight;
    public static int screenWidth;

    public static void init(Context context) {
        if (screenDensity == 0.0f || screenWidth == 0 || screenHeight == 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            screenDensity = displayMetrics.density;
            screenHeight = displayMetrics.heightPixels;
            screenWidth = displayMetrics.widthPixels;
            densityDpi = displayMetrics.densityDpi;
        }
        float f = screenWidth / screenHeight;
        if (f <= 0.655f) {
            proportion = 1;
        } else if (f <= 1.04f) {
            proportion = 2;
        } else if (f <= 1.55f) {
            proportion = 3;
        } else if (f > 1.55f) {
            proportion = 4;
        }
        Log.i("SCREEN CONFIG", "screenHeight:" + screenHeight + ";screenWidth:" + screenWidth + ";screenDensity:" + screenDensity + ";densityDpi:" + densityDpi);
    }
}
