package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class sc0 {
    public static final sc0 d;
    public static final sc0 e;
    public static final /* synthetic */ sc0[] f;

    static {
        sc0 sc0Var = new sc0("Vertical", 0);
        d = sc0Var;
        sc0 sc0Var2 = new sc0("Horizontal", 1);
        e = sc0Var2;
        f = new sc0[]{sc0Var, sc0Var2};
    }

    public static sc0 valueOf(String str) {
        return (sc0) Enum.valueOf(sc0.class, str);
    }

    public static sc0[] values() {
        return (sc0[]) f.clone();
    }
}
