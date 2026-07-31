package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class Rg {
    public static final Rg a;
    public static final Rg b;
    public static final /* synthetic */ Rg[] c;

    static {
        Rg rg = new Rg("HIGHEST", 0);
        a = rg;
        Rg rg2 = new Rg("REGULAR", 1);
        b = rg2;
        Rg[] rgArr = {rg, rg2};
        c = rgArr;
        EnumEntriesKt.enumEntries(rgArr);
    }

    public Rg(String str, int i) {
    }

    public static Rg valueOf(String str) {
        return (Rg) Enum.valueOf(Rg.class, str);
    }

    public static Rg[] values() {
        return (Rg[]) c.clone();
    }
}
