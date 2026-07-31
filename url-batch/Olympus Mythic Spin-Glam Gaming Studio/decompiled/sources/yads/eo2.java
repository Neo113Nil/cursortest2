package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class eo2 {
    public static final eo2 c;
    public static final eo2 d;
    public static final eo2 e;
    public static final /* synthetic */ eo2[] f;
    public final String b;

    static {
        eo2 eo2Var = new eo2(0, com.ironsource.mediationsdk.j.f, "custom");
        c = eo2Var;
        eo2 eo2Var2 = new eo2(1, "DEFAULT", "default");
        d = eo2Var2;
        eo2 eo2Var3 = new eo2(2, "UNKNOWN", "unknown");
        e = eo2Var3;
        eo2[] eo2VarArr = {eo2Var, eo2Var2, eo2Var3};
        f = eo2VarArr;
        EnumEntriesKt.enumEntries(eo2VarArr);
    }

    public eo2(int i, String str, String str2) {
        this.b = str2;
    }

    public static eo2 valueOf(String str) {
        return (eo2) Enum.valueOf(eo2.class, str);
    }

    public static eo2[] values() {
        return (eo2[]) f.clone();
    }
}
