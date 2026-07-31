package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class Tf {
    public static final Tf a;
    public static final Tf b;
    public static final Tf c;
    public static final Tf d;
    public static final /* synthetic */ Tf[] e;

    static {
        Tf tf = new Tf("PORTRAIT", 0);
        a = tf;
        Tf tf2 = new Tf("LANDSCAPE", 1);
        b = tf2;
        Tf tf3 = new Tf("REVERSE_PORTRAIT", 2);
        c = tf3;
        Tf tf4 = new Tf("REVERSE_LANDSCAPE", 3);
        d = tf4;
        Tf[] tfArr = {tf, tf2, tf3, tf4};
        e = tfArr;
        EnumEntriesKt.enumEntries(tfArr);
    }

    public Tf(String str, int i) {
    }

    public static Tf valueOf(String str) {
        return (Tf) Enum.valueOf(Tf.class, str);
    }

    public static Tf[] values() {
        return (Tf[]) e.clone();
    }
}
