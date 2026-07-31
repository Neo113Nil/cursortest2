package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class cd1 {
    public static final cd1 b;
    public static final cd1 c;
    public static final cd1 d;
    public static final /* synthetic */ cd1[] e;

    static {
        cd1 cd1Var = new cd1(0, "LOAD");
        b = cd1Var;
        cd1 cd1Var2 = new cd1(1, "SHOW");
        c = cd1Var2;
        cd1 cd1Var3 = new cd1(2, "RETURN_TO_APP");
        d = cd1Var3;
        cd1[] cd1VarArr = {cd1Var, cd1Var2, cd1Var3};
        e = cd1VarArr;
        EnumEntriesKt.enumEntries(cd1VarArr);
    }

    public cd1(int i, String str) {
    }

    public static cd1 valueOf(String str) {
        return (cd1) Enum.valueOf(cd1.class, str);
    }

    public static cd1[] values() {
        return (cd1[]) e.clone();
    }
}
