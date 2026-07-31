package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.TrafficStats;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ח, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC0608 {

    /* renamed from: ゥ, reason: contains not printable characters */
    public static JSONObject f1044;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f1070 = StringFog.decrypt("6u2kUTvUzlPH5KE=\n", "rojSOFixmyc=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String f1069 = StringFog.decrypt("PTrwcA==\n", "U02DAH2L7ME=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f1068 = StringFog.decrypt("1JFDIQ==\n", "uuYxWfXgfOg=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f1067 = StringFog.decrypt("Bhztvw==\n", "a3GMyfPEADU=\n");

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f1066 = StringFog.decrypt("vlXCGQ==\n", "0zi2ccvD63E=\n");

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f1065 = StringFog.decrypt("ymwl6w==\n", "pwFJnLPy3ag=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f1064 = StringFog.decrypt("1ZOkXA==\n", "uP7QKL2E6XE=\n");

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final String f1063 = StringFog.decrypt("jg==\n", "+W/l7I/172c=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f1062 = StringFog.decrypt("NA==\n", "XIlA4B7KMCU=\n");

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static final String f1061 = StringFog.decrypt("Hr2LkA==\n", "bdTx9bPkl4s=\n");

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final String f1060 = StringFog.decrypt("ROZ/TQ==\n", "M4AMOWPtpvc=\n");

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f1059 = StringFog.decrypt("5TYgIA==\n", "klBSUz6Vsj8=\n");

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static final String f1058 = StringFog.decrypt("FJZZPg==\n", "Y/AqTqqNw1Q=\n");

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static final String f1057 = StringFog.decrypt("JwE75A==\n", "SmNIkCG8g3o=\n");

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static final String f1056 = StringFog.decrypt("Ysi7zLg=\n", "D6rPvNEYGpM=\n");

    /* renamed from: ףּ, reason: contains not printable characters */
    public static final String f1055 = StringFog.decrypt("msIvuQ==\n", "96BbyeMqvmQ=\n");

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f1054 = StringFog.decrypt("JIWoqDY=\n", "Sefb2F8lGKY=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f1053 = StringFog.decrypt("JVWu/g==\n", "SDfdjjeE9pQ=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f1052 = StringFog.decrypt("7pMTgg==\n", "g/F97aTARwo=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f1051 = StringFog.decrypt("K1cLnQ==\n", "RjVk82BWBbk=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f1050 = StringFog.decrypt("2hM7bw==\n", "t3FYDN75W9c=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f1049 = StringFog.decrypt("VlEspA==\n", "OzNfywjr7DE=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f1048 = StringFog.decrypt("C4TxFw==\n", "ZuaCeUiL1hk=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f1047 = StringFog.decrypt("4kLpfw==\n", "gDaZE97BgHg=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f1046 = StringFog.decrypt("wNznVQ==\n", "oqiLI8ijjGQ=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static JSONObject f1045 = null;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m4111(JSONObject jSONObject) {
        try {
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            long currentTimeMillis = System.currentTimeMillis();
            long currentTimeMillis2 = System.currentTimeMillis();
            if (totalRxBytes != -1) {
                long totalRxBytes2 = TrafficStats.getTotalRxBytes();
                jSONObject.put(f1069, Math.round((1000.0f / (currentTimeMillis2 - currentTimeMillis)) * (totalRxBytes2 - totalRxBytes)));
                jSONObject.put(f1068, totalRxBytes2);
            }
        } catch (Throwable th) {
            String str = f1070;
            AbstractC0580.m4080(str, str, StringFog.decrypt("KHGyklBBbW4Zd6mTRUFpexgjoZNGQWRuGXSvj0lBf3gMZKU=\n", "bQPA/SJhCgs=\n"), th, null, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized JSONObject m4112() {
        JSONObject jSONObject;
        synchronized (AbstractC0608.class) {
            if (f1045 == null) {
                JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
                f1045 = jsonObjectInit;
                try {
                    jsonObjectInit.put(f1063, -1);
                    f1045.put(f1062, -1);
                } catch (JSONException unused) {
                }
            }
            jSONObject = f1045;
        }
        return jSONObject;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized void m4114(Activity activity) {
        synchronized (AbstractC0608.class) {
            if (activity != null) {
                m4115(activity.getApplicationContext());
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized void m4115(Context context) {
        DisplayMetrics displayMetrics;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        synchronized (AbstractC0608.class) {
            if (context != null) {
                try {
                    WindowManager windowManager = (WindowManager) context.getSystemService(StringFog.decrypt("K24ShU/J\n", "XAd84SC+FfQ=\n"));
                    if (windowManager != null && Build.VERSION.SDK_INT >= 30) {
                        try {
                            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                            bounds = currentWindowMetrics.getBounds();
                            if (bounds != null) {
                                m4113(bounds.height(), bounds.width());
                                return;
                            }
                        } catch (Throwable th) {
                            String str = f1070;
                            AbstractC0580.m4080(str, str, StringFog.decrypt("CiVQkWrCDw9vMEeKbIsIBm8gS5B8jREsKiNQl3uRRgc9OE/eb4sIBSAgb592hQMT\n", "T1ci/hjiZmE=\n"), th, null, false);
                        }
                    }
                    Resources resources = context.getResources();
                    if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                        m4113(displayMetrics.heightPixels, displayMetrics.widthPixels);
                    }
                } finally {
                    String str2 = f1070;
                    AbstractC0580.m4080(str2, str2, StringFog.decrypt("wRvzgxDb8AGkDuSYFpL3CKQt6J8Sl/gWyQz1nguY6k/iG+6BQpj2AfAM+Zg=\n", "hGmB7GL7mW8=\n"), th, null, false);
                }
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4113(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        try {
            JSONObject m4112 = m4112();
            m4112.put(f1063, i2);
            m4112.put(f1062, i);
        } catch (Throwable th) {
            String str = f1070;
            AbstractC0580.m4080(str, str, StringFog.decrypt("od9vcTuuQr6Q2XRwLq5CuJbIeHBp/VihgQ==\n", "5K0dHkmOMds=\n"), th, null, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4116(Context context, JSONObject jSONObject) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(StringFog.decrypt("QQERX3gcvJo=\n", "IGJlNg51yOM=\n"));
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j = 1048576;
            jSONObject.put(f1067, memoryInfo.availMem / j);
            jSONObject.put(f1066, memoryInfo.threshold / j);
            boolean z = memoryInfo.lowMemory;
            if (z) {
                jSONObject.put(f1065, z);
            }
            jSONObject.put(f1064, memoryInfo.totalMem / j);
        } catch (Throwable th) {
            AbstractC0580.m4072(f1070, StringFog.decrypt("3weIsHFVK/DuAZOxZFUh8PcaiKYjAD/0/RDA/w==\n", "mnX63wN1TJU=\n") + th.getLocalizedMessage());
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4117(JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (AbstractC0608.class) {
            jSONObject2 = f1044;
        }
        AbstractC1006.m4293(jSONObject, AbstractC1006.m4291(jSONObject2, false), false);
    }
}
