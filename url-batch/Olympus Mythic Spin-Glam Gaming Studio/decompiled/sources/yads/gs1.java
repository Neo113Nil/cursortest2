package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class gs1 {
    public static final gs1 b;
    public static final gs1 c;
    public static final /* synthetic */ gs1[] d;

    static {
        gs1 gs1Var = new gs1(0, "INFO");
        b = gs1Var;
        gs1 gs1Var2 = new gs1(1, "ERROR");
        c = gs1Var2;
        gs1[] gs1VarArr = {gs1Var, gs1Var2};
        d = gs1VarArr;
        EnumEntriesKt.enumEntries(gs1VarArr);
    }

    public gs1(int i, String str) {
    }

    public static gs1 valueOf(String str) {
        return (gs1) Enum.valueOf(gs1.class, str);
    }

    public static gs1[] values() {
        return (gs1[]) d.clone();
    }
}
