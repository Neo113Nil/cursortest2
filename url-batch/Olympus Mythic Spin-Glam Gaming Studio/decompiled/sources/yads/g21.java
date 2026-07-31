package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g21 {
    public static final g21 b;
    public static final /* synthetic */ g21[] c;

    static {
        g21 g21Var = new g21(0, "PROD");
        b = g21Var;
        g21[] g21VarArr = {g21Var, new g21(1, "PREDEFINED")};
        c = g21VarArr;
        EnumEntriesKt.enumEntries(g21VarArr);
    }

    public g21(int i, String str) {
    }

    public static g21 valueOf(String str) {
        return (g21) Enum.valueOf(g21.class, str);
    }

    public static g21[] values() {
        return (g21[]) c.clone();
    }
}
