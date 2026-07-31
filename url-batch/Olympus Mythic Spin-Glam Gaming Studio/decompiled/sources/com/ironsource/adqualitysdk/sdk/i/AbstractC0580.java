package com.ironsource.adqualitysdk.sdk.i;

import android.util.Log;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ӟ, reason: contains not printable characters */
/* loaded from: classes8.dex */
public abstract class AbstractC0580 {
    static {
        StringFog.decrypt("neMgVnQN9VW39G95QzP1Rrj4O0E=\n", "1JFPOCdigCc=\n");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m4072(String str, String str2) {
        m4080(str, str, str2, null, null, false);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m4073(String str, String str2) {
        m4079(str, str, str2, null, false);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m4075() {
        boolean z;
        C1213 m4452 = C1213.m4452();
        synchronized (m4452) {
            z = m4452.f3196;
        }
        return z;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ISAdQualityLogLevel m4076() {
        ISAdQualityLogLevel iSAdQualityLogLevel;
        C1213 m4452 = C1213.m4452();
        synchronized (m4452) {
            iSAdQualityLogLevel = m4452.f3195;
        }
        return iSAdQualityLogLevel;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m4074(String str, String str2) {
        m4080(str, str, str2, null, null, true);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4082(String str, String str2, boolean z) {
        m4080(str, str, str2, null, null, z);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4080(String str, String str2, String str3, Throwable th, AbstractC0441 abstractC0441, boolean z) {
        if (m4075()) {
            String m4077 = m4077(str);
            if (abstractC0441 != null) {
                str3 = str3 + "\n" + abstractC0441;
            }
            Log.e(m4077, str3, th);
            return;
        }
        if (z && m4076().shouldPrintLog(ISAdQualityLogLevel.ERROR)) {
            String m40772 = m4077(str2);
            if (abstractC0441 != null) {
                str3 = str3 + "\n" + abstractC0441;
            }
            Log.e(m40772, str3, th);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4081(String str, String str2, String str3, boolean z) {
        if (m4075()) {
            Log.i(m4077(str), str3);
        } else if (z && m4076().shouldPrintLog(ISAdQualityLogLevel.INFO)) {
            Log.i(m4077(str2), str3);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4078(String str, String str2) {
        m4079(str, str, str2, null, true);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4079(String str, String str2, String str3, Object obj, boolean z) {
        if (obj != null) {
            str3 = str3 + "\n" + obj.toString();
        }
        if (m4075()) {
            Log.d(m4077(str), str3);
        } else if (z && m4076().shouldPrintLog(ISAdQualityLogLevel.DEBUG)) {
            Log.d(m4077(str2), str3);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m4077(String str) {
        return AbstractC0584.m4083("ooAORsRbbiqIl0Fp82VuOYebFVGtFA==\n", "6/JhKJc0G1g=\n", new StringBuilder(), str);
    }
}
