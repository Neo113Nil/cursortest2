package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class uj3 {
    public static final uj3 b;
    public static final uj3 c;
    public static final uj3 d;
    public static final /* synthetic */ uj3[] e;

    static {
        uj3 uj3Var = new uj3(0, "FIRST_QUARTILE");
        b = uj3Var;
        uj3 uj3Var2 = new uj3(1, "MIDPOINT");
        c = uj3Var2;
        uj3 uj3Var3 = new uj3(2, "THIRD_QUARTILE");
        d = uj3Var3;
        uj3[] uj3VarArr = {uj3Var, uj3Var2, uj3Var3};
        e = uj3VarArr;
        EnumEntriesKt.enumEntries(uj3VarArr);
    }

    public uj3(int i, String str) {
    }

    public static uj3 valueOf(String str) {
        return (uj3) Enum.valueOf(uj3.class, str);
    }

    public static uj3[] values() {
        return (uj3[]) e.clone();
    }
}
