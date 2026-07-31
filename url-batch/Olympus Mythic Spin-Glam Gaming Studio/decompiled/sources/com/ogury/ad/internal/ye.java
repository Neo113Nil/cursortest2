package com.ogury.ad.internal;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ye {
    public static final xe b;
    public static final ye c;
    public static final ye d;
    public static final /* synthetic */ ye[] e;
    public static final /* synthetic */ EnumEntries f;
    public final String a;

    static {
        ye yeVar = new ye("UNIFORM_COLOR_RECT", 0, "UNIFORM_COLOR_RECT");
        c = yeVar;
        ye yeVar2 = new ye("UNKNOWN", 1, "unknown");
        d = yeVar2;
        ye[] yeVarArr = {yeVar, yeVar2};
        e = yeVarArr;
        f = EnumEntriesKt.enumEntries(yeVarArr);
        b = new xe();
    }

    public ye(String str, int i, String str2) {
        this.a = str2;
    }

    public static ye valueOf(String str) {
        return (ye) Enum.valueOf(ye.class, str);
    }

    public static ye[] values() {
        return (ye[]) e.clone();
    }
}
