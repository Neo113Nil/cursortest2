package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class fj1 {
    public static final fj1 b;
    public static final fj1 c;
    public static final fj1 d;
    public static final /* synthetic */ fj1[] e;

    static {
        fj1 fj1Var = new fj1(0, "EXACTLY");
        b = fj1Var;
        fj1 fj1Var2 = new fj1(1, "AT_MOST");
        c = fj1Var2;
        fj1 fj1Var3 = new fj1(2, "UNSPECIFIED");
        d = fj1Var3;
        fj1[] fj1VarArr = {fj1Var, fj1Var2, fj1Var3};
        e = fj1VarArr;
        EnumEntriesKt.enumEntries(fj1VarArr);
    }

    public fj1(int i, String str) {
    }

    public static fj1 valueOf(String str) {
        return (fj1) Enum.valueOf(fj1.class, str);
    }

    public static fj1[] values() {
        return (fj1[]) e.clone();
    }
}
