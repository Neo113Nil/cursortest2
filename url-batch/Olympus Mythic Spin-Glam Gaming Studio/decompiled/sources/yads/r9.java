package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class r9 {
    public static final r9 b;
    public static final r9 c;
    public static final r9 d;
    public static final /* synthetic */ r9[] e;

    static {
        r9 r9Var = new r9(0, "SINGLE");
        b = r9Var;
        r9 r9Var2 = new r9(1, "BLOCK");
        c = r9Var2;
        r9 r9Var3 = new r9(2, "BLOCK_INNER_CREATIVE");
        d = r9Var3;
        r9[] r9VarArr = {r9Var, r9Var2, r9Var3};
        e = r9VarArr;
        EnumEntriesKt.enumEntries(r9VarArr);
    }

    public r9(int i, String str) {
    }

    public static r9 valueOf(String str) {
        return (r9) Enum.valueOf(r9.class, str);
    }

    public static r9[] values() {
        return (r9[]) e.clone();
    }
}
