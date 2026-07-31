package com.ogury.ad.internal;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class nh {
    public static final nh a;
    public static final nh b;
    public static final nh c;
    public static final nh d;
    public static final /* synthetic */ nh[] e;

    static {
        nh nhVar = new nh(0, "REQUEST_FAILURE");
        a = nhVar;
        nh nhVar2 = new nh(1, "PARSING_ERROR");
        b = nhVar2;
        nh nhVar3 = new nh(2, "AD_NOT_AVAILABLE");
        c = nhVar3;
        nh nhVar4 = new nh(3, "UNKNOWN");
        d = nhVar4;
        nh[] nhVarArr = {nhVar, nhVar2, nhVar3, nhVar4};
        e = nhVarArr;
        EnumEntriesKt.enumEntries(nhVarArr);
    }

    public nh(int i, String str) {
    }

    public static nh valueOf(String str) {
        return (nh) Enum.valueOf(nh.class, str);
    }

    public static nh[] values() {
        return (nh[]) e.clone();
    }
}
