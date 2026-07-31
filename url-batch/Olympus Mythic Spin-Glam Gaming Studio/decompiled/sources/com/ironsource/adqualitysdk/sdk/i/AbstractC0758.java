package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ⴡ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC0758 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f1704 = StringFog.decrypt("Sw6SCrTqrSA=\n", "Cn7iX8CDwVM=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String f1703 = StringFog.decrypt("jw8=\n", "/2GHZA39W5I=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f1702 = StringFog.decrypt("Rug=\n", "JY6A1aenaBM=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f1701 = StringFog.decrypt("Vew=\n", "I48OLOOtxkY=\n");

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f1700 = StringFog.decrypt("4oQ=\n", "lOpqxAKJHtY=\n");

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f1699 = StringFog.decrypt("V9k=\n", "M7eDeY9MRMk=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f1698 = StringFog.decrypt("GA==\n", "bT6BJJDlnPQ=\n");

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final String f1697 = StringFog.decrypt("lA==\n", "9RPebUKJ2tE=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f1696 = StringFog.decrypt("RA==\n", "Ki6pgf11src=\n");

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4158(Context context, JSONObject jSONObject) {
        String packageName = context.getPackageName();
        try {
            jSONObject.put(f1703, packageName);
        } catch (JSONException e) {
            String str = f1704;
            AbstractC0580.m4080(str, str, StringFog.decrypt("xfYG3hy6riCm+BfWWLb8OuL1Fvsc9OA64PZTxhf04yfp9w==\n", "hplzsnjUiVQ=\n"), e, null, false);
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            jSONObject.put(f1702, packageManager.getInstallerPackageName(packageName));
        } catch (JSONException e2) {
            AbstractC0580.m4073(f1704, StringFog.decrypt("xO4XJPTEj62n4AYssMPGqvPgDiT12Iip5uIJKffPiLfm7Ado5MWIs/TuDGawz9qr6PNYaA==\n", "h4FiSJCqqNk=\n") + e2.getLocalizedMessage());
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            jSONObject.put(f1701, Integer.toString(packageInfo.versionCode));
            jSONObject.put(f1700, packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException e3) {
            String str2 = f1704;
            StringBuilder m4006 = AbstractC0446.m4006("avCW7QZiNHMJ+Ib1QnxyZEL+hORCYXJpSPiG80JqfHUJ\n", "KZ/jgWIMEwc=\n", new StringBuilder(), packageName);
            m4006.append(StringFog.decrypt("cTvhMqGAEahrNg==\n", "URbBV9Pyfto=\n"));
            m4006.append(e3.getLocalizedMessage());
            AbstractC0580.m4073(str2, m4006.toString());
        } catch (JSONException e4) {
            AbstractC0580.m4073(f1704, StringFog.decrypt("P3P6O/rEsq5cfeszvsvlqlxq6iXtw/q0XHXhMfGK4bVcdvw48IS1vw5u4CWkig==\n", "fByPV56qldo=\n") + e4.getLocalizedMessage());
        }
        try {
            jSONObject.put(f1699, packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString());
        } catch (PackageManager.NameNotFoundException e5) {
            String str3 = f1704;
            StringBuilder m40062 = AbstractC0446.m4006("IkcRyDGidUFBTwHQdbwzVgpJA8F1oTNbAE8B1nWqPUdB\n", "YShkpFXMUjU=\n", new StringBuilder(), packageName);
            m40062.append(StringFog.decrypt("WiZeaRom/6dAKw==\n", "egt+DGhUkNU=\n"));
            m40062.append(e5.getLocalizedMessage());
            AbstractC0580.m4073(str3, m40062.toString());
        } catch (JSONException e6) {
            AbstractC0580.m4073(f1704, StringFog.decrypt("DoIf8o2mZpltjA76yakxnW2DC/OM6CiDK4JK6oboK54ig0S+jLozgj/XSg==\n", "Te1qnunIQe0=\n") + e6.getLocalizedMessage());
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m4157(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            return packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            String str = f1704;
            StringBuilder m4006 = AbstractC0446.m4006("8lcUAFluWWiRXwQYHXAff9pZBgkdbR9y0F8EHh1mEW6R\n", "sThhbD0Afhw=\n", new StringBuilder(), packageName);
            m4006.append(StringFog.decrypt("jvli3ZYdOOKU9A==\n", "rtRCuORvV5A=\n"));
            m4006.append(e.getLocalizedMessage());
            AbstractC0580.m4073(str, m4006.toString());
            return null;
        }
    }
}
