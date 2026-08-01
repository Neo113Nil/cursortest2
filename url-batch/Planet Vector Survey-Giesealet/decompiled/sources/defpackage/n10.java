package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class n10 {
    public static final n10 d;
    public static final n10 e;
    public static final n10 f;
    public static final /* synthetic */ n10[] g;

    static {
        n10 n10Var = new n10("InMeasureBlock", 0);
        d = n10Var;
        n10 n10Var2 = new n10("InLayoutBlock", 1);
        e = n10Var2;
        n10 n10Var3 = new n10("NotUsed", 2);
        f = n10Var3;
        g = new n10[]{n10Var, n10Var2, n10Var3};
    }

    public static n10 valueOf(String str) {
        return (n10) Enum.valueOf(n10.class, str);
    }

    public static n10[] values() {
        return (n10[]) g.clone();
    }
}
