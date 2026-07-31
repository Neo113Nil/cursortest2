package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class v {
    public static final v a = new v("CreativeView", 0);
    public static final v b = new v("Start", 1);
    public static final v c = new v("FirstQuartile", 2);
    public static final v d = new v("Midpoint", 3);
    public static final v e = new v("ThirdQuartile", 4);
    public static final v f = new v("Complete", 5);
    public static final v g = new v(VastTagName.MUTE, 6);
    public static final v h = new v("UnMute", 7);
    public static final v i = new v("Pause", 8);
    public static final v j = new v("Rewind", 9);
    public static final v k = new v("Resume", 10);
    public static final v l = new v("CloseLinear", 11);
    public static final v m = new v("Skip", 12);
    public static final v n = new v(VastTagName.PROGRESS, 13);
    public static final /* synthetic */ v[] o;
    public static final /* synthetic */ EnumEntries p;

    static {
        v[] a2 = a();
        o = a2;
        p = EnumEntriesKt.enumEntries(a2);
    }

    public v(String str, int i2) {
    }

    public static final /* synthetic */ v[] a() {
        return new v[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n};
    }

    @NotNull
    public static EnumEntries b() {
        return p;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) o.clone();
    }
}
