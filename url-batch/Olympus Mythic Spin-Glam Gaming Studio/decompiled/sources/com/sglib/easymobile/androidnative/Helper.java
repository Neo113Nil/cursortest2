package com.sglib.easymobile.androidnative;

import android.os.Build;
import android.util.Log;

/* loaded from: classes14.dex */
public class Helper {
    public static void Log(String str) {
        Log.i(GlobalDefines.LOGGING_TAG, str);
    }

    public static void LogError(String str) {
        Log.e(GlobalDefines.LOGGING_TAG, str);
    }

    public static void LogError(String str, Throwable th) {
        Log.e(GlobalDefines.LOGGING_TAG, str, th);
    }

    public static boolean IsNullOrEmptyString(String str) {
        return str == null || str.isEmpty();
    }

    public static String IntToString(int i) {
        return String.valueOf(i);
    }

    public static int GetSystemSDKLevel() {
        return Build.VERSION.SDK_INT;
    }
}
