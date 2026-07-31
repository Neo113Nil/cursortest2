package com.vungle.ads.internal.network;

import android.os.Build;
import com.vungle.ads.BuildConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class d0 {
    public static String a = a();
    public static String b;
    public static String c;

    public static void a(String str) {
        b = str;
    }

    public static String b() {
        return b;
    }

    public static void c(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        a = str;
    }

    public static String d() {
        return a;
    }

    public static String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(Intrinsics.areEqual("Amazon", Build.MANUFACTURER) ? "VungleAmazon/" : "VungleDroid/");
        sb.append(BuildConfig.VERSION_NAME);
        return sb.toString();
    }

    public static void b(String str) {
        c = str;
    }

    public static String c() {
        return c;
    }
}
