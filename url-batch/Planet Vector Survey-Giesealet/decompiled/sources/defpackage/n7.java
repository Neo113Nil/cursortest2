package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class n7 {
    public static final n7 d;
    public static final n7 e;
    public static final n7 f;
    public static final n7 g;
    public static final n7 h;
    public static final n7 i;
    public static final n7 j;
    public static final /* synthetic */ n7[] k;

    static {
        n7 n7Var = new n7("Paragraph", 0);
        d = n7Var;
        n7 n7Var2 = new n7("Span", 1);
        e = n7Var2;
        n7 n7Var3 = new n7("VerbatimTts", 2);
        f = n7Var3;
        n7 n7Var4 = new n7("Url", 3);
        g = n7Var4;
        n7 n7Var5 = new n7("Link", 4);
        h = n7Var5;
        n7 n7Var6 = new n7("Clickable", 5);
        i = n7Var6;
        n7 n7Var7 = new n7("String", 6);
        j = n7Var7;
        k = new n7[]{n7Var, n7Var2, n7Var3, n7Var4, n7Var5, n7Var6, n7Var7};
    }

    public static n7 valueOf(String str) {
        return (n7) Enum.valueOf(n7.class, str);
    }

    public static n7[] values() {
        return (n7[]) k.clone();
    }
}
