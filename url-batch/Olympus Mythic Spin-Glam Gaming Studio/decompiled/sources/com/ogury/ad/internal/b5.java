package com.ogury.ad.internal;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class b5 {
    public static final b5 a;
    public static final b5 b;
    public static final /* synthetic */ b5[] c;

    static {
        b5 b5Var = new b5(0, "LOADED_SOURCE_FORMAT");
        a = b5Var;
        b5 b5Var2 = new b5(1, "LOADED_SOURCE_SDK");
        b = b5Var2;
        b5[] b5VarArr = {b5Var, b5Var2};
        c = b5VarArr;
        EnumEntriesKt.enumEntries(b5VarArr);
    }

    public b5(int i, String str) {
    }

    public static b5 valueOf(String str) {
        return (b5) Enum.valueOf(b5.class, str);
    }

    public static b5[] values() {
        return (b5[]) c.clone();
    }
}
