package com.ogury.ad.internal;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class x {
    public static final w c;
    public static final x d;
    public static final x e;
    public static final x f;
    public static final x g;
    public static final /* synthetic */ x[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String a;
    public final String b;

    static {
        x xVar = new x("INTERSTITIAL", 0, "interstitial", "Interstitial");
        d = xVar;
        x xVar2 = new x(BrandSafetyUtils.k, 1, "optin_video", "Rewarded");
        e = xVar2;
        x xVar3 = new x("OVERLAY_THUMBNAIL", 2, "overlay_thumbnail", "Thumbnail");
        f = xVar3;
        x xVar4 = new x("STANDARD_BANNERS", 3, "standard_banners", "Standard Banners");
        g = xVar4;
        x[] xVarArr = {xVar, xVar2, xVar3, xVar4};
        h = xVarArr;
        i = EnumEntriesKt.enumEntries(xVarArr);
        c = new w();
    }

    public x(String str, int i2, String str2, String str3) {
        this.a = str2;
        this.b = str3;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) h.clone();
    }

    public final boolean a() {
        return this == g;
    }

    public final boolean b() {
        return this == d || this == e;
    }
}
