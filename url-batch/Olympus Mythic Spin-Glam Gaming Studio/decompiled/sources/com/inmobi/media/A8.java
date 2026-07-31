package com.inmobi.media;

import com.pubmatic.sdk.omsdk.POBOMSDKLogConstants;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class A8 {
    public static final A8 a;
    public static final A8 b;
    public static final A8 c;
    public static final A8 d;
    public static final A8 e;
    public static final A8 f;
    public static final A8 g;
    public static final A8 h;
    public static final A8 i;
    public static final /* synthetic */ A8[] j;

    static {
        A8 a8 = new A8("INIT", 0);
        a = a8;
        A8 a82 = new A8("LOADING", 1);
        b = a82;
        A8 a83 = new A8(POBOMSDKLogConstants.MSG_OMSDK_LOADED_EVENT, 2);
        c = a83;
        A8 a84 = new A8("LOAD_FAILED", 3);
        d = a84;
        A8 a85 = new A8("PLAYING", 4);
        e = a85;
        A8 a86 = new A8("PAUSED", 5);
        f = a86;
        A8 a87 = new A8("COMPLETED", 6);
        g = a87;
        A8 a88 = new A8("ERROR", 7);
        h = a88;
        A8 a89 = new A8("DESTROYED", 8);
        i = a89;
        A8[] a8Arr = {a8, a82, a83, a84, a85, a86, a87, a88, a89};
        j = a8Arr;
        EnumEntriesKt.enumEntries(a8Arr);
    }

    public A8(String str, int i2) {
    }

    public static A8 valueOf(String str) {
        return (A8) Enum.valueOf(A8.class, str);
    }

    public static A8[] values() {
        return (A8[]) j.clone();
    }
}
