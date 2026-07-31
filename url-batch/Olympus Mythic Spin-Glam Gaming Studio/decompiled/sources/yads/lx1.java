package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class lx1 {
    public static final lx1 b;
    public static final lx1 c;
    public static final /* synthetic */ lx1[] d;

    static {
        lx1 lx1Var = new lx1(0, "LEFT");
        b = lx1Var;
        lx1 lx1Var2 = new lx1(1, "RIGHT");
        c = lx1Var2;
        lx1[] lx1VarArr = {lx1Var, lx1Var2};
        d = lx1VarArr;
        EnumEntriesKt.enumEntries(lx1VarArr);
    }

    public lx1(int i, String str) {
    }

    public static lx1 valueOf(String str) {
        return (lx1) Enum.valueOf(lx1.class, str);
    }

    public static lx1[] values() {
        return (lx1[]) d.clone();
    }
}
