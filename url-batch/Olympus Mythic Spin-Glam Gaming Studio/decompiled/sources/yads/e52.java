package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class e52 {
    public static final e52 c;
    public static final e52 d;
    public static final e52 e;
    public static final /* synthetic */ e52[] f;
    public final String b;

    static {
        e52 e52Var = new e52(0, "AD", "ad");
        c = e52Var;
        e52 e52Var2 = new e52(1, "BULK", "bulk");
        d = e52Var2;
        e52 e52Var3 = new e52(2, "SLIDER", "ad_unit");
        e = e52Var3;
        e52[] e52VarArr = {e52Var, e52Var2, e52Var3};
        f = e52VarArr;
        EnumEntriesKt.enumEntries(e52VarArr);
    }

    public e52(int i, String str, String str2) {
        this.b = str2;
    }

    public static e52 valueOf(String str) {
        return (e52) Enum.valueOf(e52.class, str);
    }

    public static e52[] values() {
        return (e52[]) f.clone();
    }
}
