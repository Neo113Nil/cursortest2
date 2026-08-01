package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class b4 {
    public static final b4 d;
    public static final b4 e;
    public static final /* synthetic */ b4[] f;

    static {
        b4 b4Var = new b4("SHOW_ORIGINAL", 0);
        d = b4Var;
        b4 b4Var2 = new b4("SHOW_TRANSLATED", 1);
        e = b4Var2;
        f = new b4[]{b4Var, b4Var2};
    }

    public static b4 valueOf(String str) {
        return (b4) Enum.valueOf(b4.class, str);
    }

    public static b4[] values() {
        return (b4[]) f.clone();
    }
}
