package com.ogury.ad.internal;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class di {
    public static final di a;
    public static final /* synthetic */ di[] b;
    public static final /* synthetic */ EnumEntries c;

    static {
        di diVar = new di(0, "PROD");
        a = diVar;
        di[] diVarArr = {diVar, new di(1, "STAGING"), new di(2, "DEV_A"), new di(3, "DEV_C")};
        b = diVarArr;
        c = EnumEntriesKt.enumEntries(diVarArr);
    }

    public di(int i, String str) {
    }

    public static di valueOf(String str) {
        return (di) Enum.valueOf(di.class, str);
    }

    public static di[] values() {
        return (di[]) b.clone();
    }
}
