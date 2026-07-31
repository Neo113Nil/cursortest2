package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class Jg {
    public static final Jg a;
    public static final Jg b;
    public static final Jg c;
    public static final Jg d;
    public static final Jg e;
    public static final Jg f;
    public static final Jg g;
    public static final Jg h;
    public static final /* synthetic */ Jg[] i;

    static {
        Jg jg = new Jg("STATE_INITIALIZED", 0);
        a = jg;
        Jg jg2 = new Jg("STATE_PREPARING", 1);
        b = jg2;
        Jg jg3 = new Jg("STATE_PREPARED", 2);
        c = jg3;
        Jg jg4 = new Jg("STATE_PLAYING", 3);
        d = jg4;
        Jg jg5 = new Jg("STATE_PAUSED", 4);
        e = jg5;
        Jg jg6 = new Jg("STATE_PLAYBACK_COMPLETED", 5);
        f = jg6;
        Jg jg7 = new Jg("STATE_ERROR", 6);
        g = jg7;
        Jg jg8 = new Jg("STATE_DESTROYED", 7);
        h = jg8;
        Jg[] jgArr = {jg, jg2, jg3, jg4, jg5, jg6, jg7, jg8};
        i = jgArr;
        EnumEntriesKt.enumEntries(jgArr);
    }

    public Jg(String str, int i2) {
    }

    public static Jg valueOf(String str) {
        return (Jg) Enum.valueOf(Jg.class, str);
    }

    public static Jg[] values() {
        return (Jg[]) i.clone();
    }
}
