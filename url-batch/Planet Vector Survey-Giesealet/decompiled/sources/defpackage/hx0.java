package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class hx0 {
    public static final hx0 d;
    public static final hx0 e;
    public static final hx0 f;
    public static final /* synthetic */ hx0[] g;

    static {
        hx0 hx0Var = new hx0("ContinueTraversal", 0);
        d = hx0Var;
        hx0 hx0Var2 = new hx0("SkipSubtreeAndContinueTraversal", 1);
        e = hx0Var2;
        hx0 hx0Var3 = new hx0("CancelTraversal", 2);
        f = hx0Var3;
        g = new hx0[]{hx0Var, hx0Var2, hx0Var3};
    }

    public static hx0 valueOf(String str) {
        return (hx0) Enum.valueOf(hx0.class, str);
    }

    public static hx0[] values() {
        return (hx0[]) g.clone();
    }
}
