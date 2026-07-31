package com.moloco.sdk.internal.publisher;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class t {
    public static final t a = new t("BANNER", 0);
    public static final t b = new t("BANNER_TABLET", 1);
    public static final t c = new t(BrandSafetyUtils.o, 2);
    public static final t d = new t("NATIVE_AD_MEDIATION", 3);
    public static final t e = new t("NATIVE_BANNER", 4);
    public static final t f = new t("INTERSTITIAL", 5);
    public static final t g = new t(BrandSafetyUtils.k, 6);
    public static final /* synthetic */ t[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        t[] a2 = a();
        h = a2;
        i = EnumEntriesKt.enumEntries(a2);
    }

    public t(String str, int i2) {
    }

    public static final /* synthetic */ t[] a() {
        return new t[]{a, b, c, d, e, f, g};
    }

    @NotNull
    public static EnumEntries b() {
        return i;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) h.clone();
    }
}
