package com.verve.atom.sdk;

import android.content.Context;
import com.smaato.sdk.ng.BuildConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes14.dex */
public class Atom {
    private static String b;
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private static final HashMap c = new HashMap();

    public interface AtomInitialisationListener {
        void onInitialised(boolean z);
    }

    public interface AtomStopListener {
        void onStopped(boolean z);
    }

    private static String a() {
        return "apikey";
    }

    public static HashMap<String, String> getAtomJSData() {
        return c;
    }

    public static String getJSData(String str) {
        return (String) c.get(str);
    }

    public static String getSDKVersion() {
        return BuildConfig.HVER;
    }

    public static boolean isAtomDisabled() {
        return true;
    }

    public static boolean isConfigurationFetchSuccessful() {
        return false;
    }

    public static boolean isDbUploadSuccessful() {
        return a.get();
    }

    public static void sendAdSessionData(Map<String, Object> map) {
    }

    public static void setJSData(String str, String str2) {
        c.put(str, str2);
    }

    public static void setTestURL(String str) {
        b = str;
    }

    public static void start(Context context, String str, boolean z, AtomInitialisationListener atomInitialisationListener) {
        if (atomInitialisationListener != null) {
            atomInitialisationListener.onInitialised(false);
        }
    }

    public static void stop(AtomStopListener atomStopListener) {
        if (atomStopListener != null) {
            atomStopListener.onStopped(true);
        }
    }

    public static void start(Context context, boolean z, AtomInitialisationListener atomInitialisationListener) {
        start(context, a(), z, atomInitialisationListener);
    }
}
