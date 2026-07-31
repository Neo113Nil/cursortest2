package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class Zm {
    public static final Zm b;
    public static final Zm c;
    public static final Zm d;
    public static final Zm e;
    public static final Zm f;
    public static final /* synthetic */ Zm[] g;
    public final EnumC4019g8 a;

    static {
        Zm zm = new Zm("UNKNOWN", 0, EnumC4019g8.b);
        b = zm;
        Zm zm2 = new Zm("MALFORMED_URL", 1, EnumC4019g8.d);
        c = zm2;
        Zm zm3 = new Zm("TIMEOUT", 2, EnumC4019g8.e);
        Zm zm4 = new Zm("NETWORK", 3, EnumC4019g8.f);
        d = zm4;
        Zm zm5 = new Zm("NO_URL_FOUND", 4, EnumC4019g8.g);
        e = zm5;
        Zm zm6 = new Zm("INVALID_STATE", 5, EnumC4019g8.c);
        f = zm6;
        Zm[] zmArr = {zm, zm2, zm3, zm4, zm5, zm6};
        g = zmArr;
        EnumEntriesKt.enumEntries(zmArr);
    }

    public Zm(String str, int i, EnumC4019g8 enumC4019g8) {
        this.a = enumC4019g8;
    }

    public static Zm valueOf(String str) {
        return (Zm) Enum.valueOf(Zm.class, str);
    }

    public static Zm[] values() {
        return (Zm[]) g.clone();
    }
}
