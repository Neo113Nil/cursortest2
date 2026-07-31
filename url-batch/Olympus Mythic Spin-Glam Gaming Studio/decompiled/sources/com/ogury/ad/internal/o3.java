package com.ogury.ad.internal;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class o3 {
    public static final o3 a;
    public static final o3 b;
    public static final /* synthetic */ o3[] c;

    static {
        o3 o3Var = new o3(0, "IMPRESSION_SOURCE_FORMAT");
        a = o3Var;
        o3 o3Var2 = new o3(1, "IMPRESSION_SOURCE_SDK");
        b = o3Var2;
        o3[] o3VarArr = {o3Var, o3Var2};
        c = o3VarArr;
        EnumEntriesKt.enumEntries(o3VarArr);
    }

    public o3(int i, String str) {
    }

    public static o3 valueOf(String str) {
        return (o3) Enum.valueOf(o3.class, str);
    }

    public static o3[] values() {
        return (o3[]) c.clone();
    }
}
