package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class pw0 {
    public static final pw0 d;
    public static final pw0 e;
    public static final /* synthetic */ pw0[] f;

    static {
        pw0 pw0Var = new pw0("On", 0);
        d = pw0Var;
        pw0 pw0Var2 = new pw0("Off", 1);
        e = pw0Var2;
        f = new pw0[]{pw0Var, pw0Var2, new pw0("Indeterminate", 2)};
    }

    public static pw0 valueOf(String str) {
        return (pw0) Enum.valueOf(pw0.class, str);
    }

    public static pw0[] values() {
        return (pw0[]) f.clone();
    }
}
