package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ga0 {
    public static final ga0 b;
    public static final /* synthetic */ ga0[] c;

    static {
        ga0 ga0Var = new ga0();
        b = ga0Var;
        ga0[] ga0VarArr = {ga0Var};
        c = ga0VarArr;
        EnumEntriesKt.enumEntries(ga0VarArr);
    }

    public static ga0 valueOf(String str) {
        return (ga0) Enum.valueOf(ga0.class, str);
    }

    public static ga0[] values() {
        return (ga0[]) c.clone();
    }
}
