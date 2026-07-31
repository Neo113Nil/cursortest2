package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i90 {
    public static final i90 b;
    public static final i90 c;
    public static final i90 d;
    public static final /* synthetic */ i90[] e;

    static {
        i90 i90Var = new i90(0, "SUCCESS");
        b = i90Var;
        i90 i90Var2 = new i90(1, "WARNING");
        c = i90Var2;
        i90 i90Var3 = new i90(2, "ERROR");
        d = i90Var3;
        i90[] i90VarArr = {i90Var, i90Var2, i90Var3};
        e = i90VarArr;
        EnumEntriesKt.enumEntries(i90VarArr);
    }

    public i90(int i, String str) {
    }

    public static i90 valueOf(String str) {
        return (i90) Enum.valueOf(i90.class, str);
    }

    public static i90[] values() {
        return (i90[]) e.clone();
    }
}
