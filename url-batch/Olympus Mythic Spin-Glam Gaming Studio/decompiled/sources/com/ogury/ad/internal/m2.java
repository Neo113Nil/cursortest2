package com.ogury.ad.internal;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m2 {
    public static final m2 b;
    public static final m2 c;
    public static final /* synthetic */ m2[] d;
    public final String a;

    static {
        m2 m2Var = new m2("IMMEDIATE_DISPATCH", 0, "immediate");
        b = m2Var;
        m2 m2Var2 = new m2("DEFERRED_DISPATCH", 1, "deferred");
        c = m2Var2;
        m2[] m2VarArr = {m2Var, m2Var2};
        d = m2VarArr;
        EnumEntriesKt.enumEntries(m2VarArr);
    }

    public m2(String str, int i, String str2) {
        this.a = str2;
    }

    public static m2 valueOf(String str) {
        return (m2) Enum.valueOf(m2.class, str);
    }

    public static m2[] values() {
        return (m2[]) d.clone();
    }
}
