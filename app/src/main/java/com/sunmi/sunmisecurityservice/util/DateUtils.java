package com.sunmi.sunmisecurityservice.util;

import com.sunmi.sunmisecurityservice.app.MyApplication;
import com.sunmi.sunmisecurityservice_v3.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class DateUtils {
    public static String[] WEEK = MyApplication.app.getResources().getStringArray(R.array.week);
    public static final int WEEKDAYS = 7;

    public static long getGMTime() {
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Etc/Greenwich"));
        try {
            date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(simpleDateFormat.format(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
            date = null;
        }
        return date.getTime() / 1000;
    }

    public static long _getGMTime() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    public static String getCurrentTime() {
        String[] split = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf((System.currentTimeMillis() / 1000) * 1000)).split("\\s");
        if (split.length > 1) {
            return split[1];
        }
        return null;
    }

    public static String getYestoryDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -1);
        return new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
    }

    public static String getTomorrowDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, 1);
        return new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
    }

    public static String getTodayDate() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    public static String convertTime(long j, String str) {
        if (j == 0) {
            return "";
        }
        return new SimpleDateFormat(str).format(new Date(j * 1000));
    }

    public static String timeStampToStr(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(j * 1000));
    }

    public static String timeStampToStr1(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm").format(Long.valueOf(j * 1000));
    }

    public static String timeStampToStr2(long j) {
        return new SimpleDateFormat("yyyy-MM-dd").format(Long.valueOf(j * 1000));
    }

    public static String timeStampToTime(long j) {
        return new SimpleDateFormat("HH:mm").format(Long.valueOf(j * 1000));
    }

    public static long getStringToDate(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        try {
            date = simpleDateFormat.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date.getTime() / 1000;
    }

    public static long getString2Date(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        try {
            date = simpleDateFormat.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date.getTime() / 1000;
    }

    public static boolean judgeCurrTime(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        new Date();
        try {
            return simpleDateFormat.parse(str).getTime() - System.currentTimeMillis() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean judgeCurrTime(long j) {
        return j - System.currentTimeMillis() > 0;
    }

    public static boolean judgeTime2Time(String str, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            return (simpleDateFormat.parse(str2).getTime() / 1000) - (simpleDateFormat.parse(str).getTime() / 1000) > 0;
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static long getZeroDate(long j) {
        return getStringToDate(timeStampToStr2(j / 1000) + " 00:00:00") * 1000;
    }

    public static String formatDate(long j) {
        return new SimpleDateFormat("yyyy-MM-dd").format(Long.valueOf(j * 1000));
    }

    public static String getTime(long j) {
        String[] split = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(j * 1000)).split("\\s");
        if (split.length > 1) {
            return split[1];
        }
        return null;
    }

    public static String convertTimeToFormat(long j) {
        long currentTimeMillis = (System.currentTimeMillis() / 1000) - j;
        int i = (currentTimeMillis > 60L ? 1 : (currentTimeMillis == 60L ? 0 : -1));
        if (i >= 0 || currentTimeMillis < 0) {
            if (i >= 0 && currentTimeMillis < 3600) {
                return (currentTimeMillis / 60) + "分钟前";
            } else if (currentTimeMillis >= 3600 && currentTimeMillis < 86400) {
                return (currentTimeMillis / 3600) + "小时前";
            } else if (currentTimeMillis >= 86400 && currentTimeMillis < 2592000) {
                return ((currentTimeMillis / 3600) / 24) + "天前";
            } else if (currentTimeMillis >= 2592000 && currentTimeMillis < 31104000) {
                return (((currentTimeMillis / 3600) / 24) / 30) + "个月前";
            } else if (currentTimeMillis >= 31104000) {
                return ((((currentTimeMillis / 3600) / 24) / 30) / 12) + "年前";
            } else {
                return "刚刚";
            }
        }
        return "刚刚";
    }

    public static String timeStampToFormat(long j) {
        long currentTimeMillis = (System.currentTimeMillis() / 1000) - j;
        return (currentTimeMillis / 60) + "";
    }

    public static int nowCurrentTime(long j) {
        return (int) (System.currentTimeMillis() - j);
    }

    public static String nowCurrentPoint(boolean z) {
        String[] split = new SimpleDateFormat("HH:mm").format(Long.valueOf(System.currentTimeMillis())).split(":");
        if (z) {
            if (split.length > 1) {
                return split[0];
            }
            return null;
        } else if (split.length > 1) {
            return split[1];
        } else {
            return null;
        }
    }

    public static String StandardFormatStr(String str) {
        try {
            long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str).getTime();
            return (((System.currentTimeMillis() / 1000) - (time / 1000)) / 60) + "";
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String DateToWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(7);
        if (i < 1 || i > 7) {
            return null;
        }
        return WEEK[i - 1];
    }

    public static String DateToWeek(long j) {
        Date date = new Date(j);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(7);
        if (i < 1 || i > 7) {
            return null;
        }
        return WEEK[i - 1];
    }

    public static String getCurrentDateString() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss", Locale.getDefault()).format(new Date());
    }
}
