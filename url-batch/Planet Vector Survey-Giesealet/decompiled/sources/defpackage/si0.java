package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class si0 {
    public static final si0 d;
    public static final si0 e;
    public static final si0 f;
    public static final si0 g;
    public static final si0 h;
    public static final si0 i;
    public static final /* synthetic */ si0[] j;

    static {
        si0 si0Var = new si0("ShutDown", 0);
        d = si0Var;
        si0 si0Var2 = new si0("ShuttingDown", 1);
        e = si0Var2;
        si0 si0Var3 = new si0("Inactive", 2);
        f = si0Var3;
        si0 si0Var4 = new si0("InactivePendingWork", 3);
        g = si0Var4;
        si0 si0Var5 = new si0("Idle", 4);
        h = si0Var5;
        si0 si0Var6 = new si0("PendingWork", 5);
        i = si0Var6;
        j = new si0[]{si0Var, si0Var2, si0Var3, si0Var4, si0Var5, si0Var6};
    }

    public static si0 valueOf(String str) {
        return (si0) Enum.valueOf(si0.class, str);
    }

    public static si0[] values() {
        return (si0[]) j.clone();
    }
}
