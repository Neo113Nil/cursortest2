package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class sg0 {
    public static final sg0 d;
    public static final sg0 e;
    public static final sg0 f;
    public static final /* synthetic */ sg0[] g;

    static {
        sg0 sg0Var = new sg0("Initial", 0);
        d = sg0Var;
        sg0 sg0Var2 = new sg0("Main", 1);
        e = sg0Var2;
        sg0 sg0Var3 = new sg0("Final", 2);
        f = sg0Var3;
        g = new sg0[]{sg0Var, sg0Var2, sg0Var3};
    }

    public static sg0 valueOf(String str) {
        return (sg0) Enum.valueOf(sg0.class, str);
    }

    public static sg0[] values() {
        return (sg0[]) g.clone();
    }
}
