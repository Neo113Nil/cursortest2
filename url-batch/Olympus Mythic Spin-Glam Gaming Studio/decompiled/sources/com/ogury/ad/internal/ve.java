package com.ogury.ad.internal;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ve {
    public static final ue b;
    public static final ve c;
    public static final ve d;
    public static final ve e;
    public static final ve f;
    public static final ve g;
    public static final ve h;
    public static final /* synthetic */ ve[] i;
    public static final /* synthetic */ EnumEntries j;
    public final String a;

    static {
        ve veVar = new ve("INTERSTITIAL", 0, "interstitial");
        c = veVar;
        ve veVar2 = new ve(BrandSafetyUtils.k, 1, "optin_video");
        d = veVar2;
        ve veVar3 = new ve("OVERLAY_THUMBNAIL", 2, "overlay_thumbnail");
        e = veVar3;
        ve veVar4 = new ve("STANDARD_BANNERS_320X50", 3, "standard_banners_320x50");
        f = veVar4;
        ve veVar5 = new ve("STANDARD_BANNERS_300X250", 4, "standard_banners_300x250");
        g = veVar5;
        ve veVar6 = new ve("UNKNOWN", 5, "unknown");
        h = veVar6;
        ve[] veVarArr = {veVar, veVar2, veVar3, veVar4, veVar5, veVar6};
        i = veVarArr;
        j = EnumEntriesKt.enumEntries(veVarArr);
        b = new ue();
    }

    public ve(String str, int i2, String str2) {
        this.a = str2;
    }

    public static ve valueOf(String str) {
        return (ve) Enum.valueOf(ve.class, str);
    }

    public static ve[] values() {
        return (ve[]) i.clone();
    }
}
