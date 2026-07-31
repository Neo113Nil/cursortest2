package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class k03 {
    public static final k03 c;
    public static final k03 d;
    public static final k03 e;
    public static final /* synthetic */ k03[] f;
    public final String b;

    static {
        k03 k03Var = new k03(0, "FIXED", "fixed");
        c = k03Var;
        k03 k03Var2 = new k03(1, "FLEXIBLE", "flexible");
        d = k03Var2;
        k03 k03Var3 = new k03(2, "SCREEN", "screen");
        k03 k03Var4 = new k03(3, "STICKY", "sticky");
        e = k03Var4;
        k03[] k03VarArr = {k03Var, k03Var2, k03Var3, k03Var4};
        f = k03VarArr;
        EnumEntriesKt.enumEntries(k03VarArr);
    }

    public k03(int i, String str, String str2) {
        this.b = str2;
    }

    public static k03 valueOf(String str) {
        return (k03) Enum.valueOf(k03.class, str);
    }

    public static k03[] values() {
        return (k03[]) f.clone();
    }
}
