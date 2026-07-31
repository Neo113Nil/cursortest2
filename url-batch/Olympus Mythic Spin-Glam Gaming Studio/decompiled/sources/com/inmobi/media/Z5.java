package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class Z5 {
    public static final Z5 a;
    public static final /* synthetic */ Z5[] b;

    static {
        Z5 z5 = new Z5("URL", 0);
        a = z5;
        Z5[] z5Arr = {z5, new Z5("HTML", 1)};
        b = z5Arr;
        EnumEntriesKt.enumEntries(z5Arr);
    }

    public Z5(String str, int i) {
    }

    public static Z5 valueOf(String str) {
        return (Z5) Enum.valueOf(Z5.class, str);
    }

    public static Z5[] values() {
        return (Z5[]) b.clone();
    }
}
