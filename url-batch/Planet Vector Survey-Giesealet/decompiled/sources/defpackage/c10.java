package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class c10 {
    public static final c10 d;
    public static final c10 e;
    public static final /* synthetic */ c10[] f;

    static {
        c10 c10Var = new c10("Ltr", 0);
        d = c10Var;
        c10 c10Var2 = new c10("Rtl", 1);
        e = c10Var2;
        f = new c10[]{c10Var, c10Var2};
    }

    public static c10 valueOf(String str) {
        return (c10) Enum.valueOf(c10.class, str);
    }

    public static c10[] values() {
        return (c10[]) f.clone();
    }
}
