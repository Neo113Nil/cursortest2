package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class Nb {
    public static final Nb a;
    public static final Nb b;
    public static final Nb c;
    public static final Nb d;
    public static final /* synthetic */ Nb[] e;

    static {
        Nb nb = new Nb("INFO", 0);
        a = nb;
        Nb nb2 = new Nb("DEBUG", 1);
        b = nb2;
        Nb nb3 = new Nb("ERROR", 2);
        c = nb3;
        Nb nb4 = new Nb("STATE", 3);
        d = nb4;
        Nb[] nbArr = {nb, nb2, nb3, nb4};
        e = nbArr;
        EnumEntriesKt.enumEntries(nbArr);
    }

    public Nb(String str, int i) {
    }

    public static Nb valueOf(String str) {
        return (Nb) Enum.valueOf(Nb.class, str);
    }

    public static Nb[] values() {
        return (Nb[]) e.clone();
    }
}
