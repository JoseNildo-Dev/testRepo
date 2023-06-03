package com.sunmi.sunmisecurityservice.util;

import android.content.Context;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class I18NUtils {
    public static String getCurrentTimeZone() {
        return TimeZone.getDefault().getDisplayName(false, 0);
    }

    public static String getCurrentLanguage(Context context) {
        Locale locale = context.getResources().getConfiguration().locale;
        String language = locale.getLanguage();
        String country = locale.getCountry();
        return language + "_" + country;
    }
}
