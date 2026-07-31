package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class qv0 {
    public static final qv0 b;
    public static final qv0 c;
    public static final qv0 d;
    public static final qv0 e;
    public static final /* synthetic */ qv0[] f;

    static {
        qv0 qv0Var = new qv0(0, "YS_BOLD");
        b = qv0Var;
        qv0 qv0Var2 = new qv0(1, "YS_LIGHT");
        c = qv0Var2;
        qv0 qv0Var3 = new qv0(2, "YS_MEDIUM");
        d = qv0Var3;
        qv0 qv0Var4 = new qv0(3, "YS_REGULAR");
        e = qv0Var4;
        qv0[] qv0VarArr = {qv0Var, qv0Var2, qv0Var3, qv0Var4};
        f = qv0VarArr;
        EnumEntriesKt.enumEntries(qv0VarArr);
    }

    public qv0(int i, String str) {
    }

    public static qv0 valueOf(String str) {
        return (qv0) Enum.valueOf(qv0.class, str);
    }

    public static qv0[] values() {
        return (qv0[]) f.clone();
    }
}
