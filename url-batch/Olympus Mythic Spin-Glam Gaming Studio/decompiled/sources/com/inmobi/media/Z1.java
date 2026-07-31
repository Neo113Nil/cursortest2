package com.inmobi.media;

import android.util.SparseArray;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class Z1 {
    public static final Y1 b;
    public static final SparseArray c;
    public static final Z1 d;
    public static final Z1 e;
    public static final /* synthetic */ Z1[] f;
    public final int a;

    static {
        Z1 z1 = new Z1(0, 0, "UNKNOWN");
        d = z1;
        Z1 z12 = new Z1(1, 1, "PLAYING");
        e = z12;
        Z1[] z1Arr = {z1, z12, new Z1(2, 2, "PAUSED"), new Z1(3, 3, "COMPLETED")};
        f = z1Arr;
        EnumEntriesKt.enumEntries(z1Arr);
        b = new Y1();
        c = new SparseArray();
        for (Z1 z13 : values()) {
            c.put(z13.a, z13);
        }
    }

    public Z1(int i, int i2, String str) {
        this.a = i2;
    }

    public static Z1 valueOf(String str) {
        return (Z1) Enum.valueOf(Z1.class, str);
    }

    public static Z1[] values() {
        return (Z1[]) f.clone();
    }
}
