package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import com.pubmatic.sdk.common.POBCommonConstants;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class r {
    public static final r b = new r("Inline", 0, POBCommonConstants.BANNER_PLACEMENT_TYPE);
    public static final r c = new r("Interstitial", 1, "interstitial");
    public static final /* synthetic */ r[] d;
    public static final /* synthetic */ EnumEntries e;

    @NotNull
    public final String a;

    static {
        r[] a = a();
        d = a;
        e = EnumEntriesKt.enumEntries(a);
    }

    public r(String str, int i, String str2) {
        this.a = str2;
    }

    public static final /* synthetic */ r[] a() {
        return new r[]{b, c};
    }

    @NotNull
    public static EnumEntries b() {
        return e;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) d.clone();
    }

    @NotNull
    public final String c() {
        return this.a;
    }
}
