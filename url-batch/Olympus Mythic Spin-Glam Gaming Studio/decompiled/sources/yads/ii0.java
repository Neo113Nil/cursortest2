package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class ii0 {
    public static final ii0 b;
    public static final ii0 c;
    public static final /* synthetic */ ii0[] d;

    static {
        ii0 ii0Var = new ii0(0, "BLOCK");
        b = ii0Var;
        ii0 ii0Var2 = new ii0(1, "BLOCK_INNER_AD");
        c = ii0Var2;
        ii0[] ii0VarArr = {ii0Var, ii0Var2};
        d = ii0VarArr;
        EnumEntriesKt.enumEntries(ii0VarArr);
    }

    public ii0(int i, String str) {
    }

    public static ii0 valueOf(String str) {
        return (ii0) Enum.valueOf(ii0.class, str);
    }

    public static ii0[] values() {
        return (ii0[]) d.clone();
    }
}
