package com.ogury.ad.internal;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class hb {
    public static final hb a;
    public static final hb b;
    public static final hb c;
    public static final /* synthetic */ hb[] d;

    static {
        hb hbVar = new hb(0, "NONE");
        a = hbVar;
        hb hbVar2 = new hb(1, "AD_SYNC");
        b = hbVar2;
        hb hbVar3 = new hb(2, "TRACKERS");
        c = hbVar3;
        hb[] hbVarArr = {hbVar, hbVar2, hbVar3};
        d = hbVarArr;
        EnumEntriesKt.enumEntries(hbVarArr);
    }

    public hb(int i, String str) {
    }

    public static hb valueOf(String str) {
        return (hb) Enum.valueOf(hb.class, str);
    }

    public static hb[] values() {
        return (hb[]) d.clone();
    }
}
