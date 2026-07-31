package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ma0 {
    public static final ma0 b;
    public static final /* synthetic */ ma0[] c;

    static {
        ma0 ma0Var = new ma0();
        b = ma0Var;
        ma0[] ma0VarArr = {ma0Var};
        c = ma0VarArr;
        EnumEntriesKt.enumEntries(ma0VarArr);
    }

    public static ma0 valueOf(String str) {
        return (ma0) Enum.valueOf(ma0.class, str);
    }

    public static ma0[] values() {
        return (ma0[]) c.clone();
    }
}
