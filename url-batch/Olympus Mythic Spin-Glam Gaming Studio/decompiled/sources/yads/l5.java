package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class l5 {
    public static final l5 b;
    public static final l5 c;
    public static final l5 d;
    public static final l5 e;
    public static final l5 f;
    public static final /* synthetic */ l5[] g;

    static {
        l5 l5Var = new l5(0, "CANCELLED");
        b = l5Var;
        l5 l5Var2 = new l5(1, "NOT_STARTED");
        c = l5Var2;
        l5 l5Var3 = new l5(2, "LOADING");
        d = l5Var3;
        l5 l5Var4 = new l5(3, "SUCCESSFULLY_LOADED");
        e = l5Var4;
        l5 l5Var5 = new l5(4, "ERRONEOUSLY_LOADED");
        f = l5Var5;
        l5[] l5VarArr = {l5Var, l5Var2, l5Var3, l5Var4, l5Var5};
        g = l5VarArr;
        EnumEntriesKt.enumEntries(l5VarArr);
    }

    public l5(int i, String str) {
    }

    public static l5 valueOf(String str) {
        return (l5) Enum.valueOf(l5.class, str);
    }

    public static l5[] values() {
        return (l5[]) g.clone();
    }
}
