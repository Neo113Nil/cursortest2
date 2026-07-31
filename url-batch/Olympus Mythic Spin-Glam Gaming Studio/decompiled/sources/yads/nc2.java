package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class nc2 {
    public static final nc2 b;
    public static final nc2 c;
    public static final nc2 d;
    public static final /* synthetic */ nc2[] e;

    static {
        nc2 nc2Var = new nc2(0, "INVALIDATED");
        b = nc2Var;
        nc2 nc2Var2 = new nc2(1, "ACTIVE");
        c = nc2Var2;
        nc2 nc2Var3 = new nc2(2, "PAUSED");
        d = nc2Var3;
        nc2[] nc2VarArr = {nc2Var, nc2Var2, nc2Var3};
        e = nc2VarArr;
        EnumEntriesKt.enumEntries(nc2VarArr);
    }

    public nc2(int i, String str) {
    }

    public static nc2 valueOf(String str) {
        return (nc2) Enum.valueOf(nc2.class, str);
    }

    public static nc2[] values() {
        return (nc2[]) e.clone();
    }
}
