package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class qk0 {
    public static final qk0 d;
    public static final qk0 e;
    public static final /* synthetic */ qk0[] f;

    static {
        qk0 qk0Var = new qk0("Ltr", 0);
        d = qk0Var;
        qk0 qk0Var2 = new qk0("Rtl", 1);
        e = qk0Var2;
        f = new qk0[]{qk0Var, qk0Var2};
    }

    public static qk0 valueOf(String str) {
        return (qk0) Enum.valueOf(qk0.class, str);
    }

    public static qk0[] values() {
        return (qk0[]) f.clone();
    }
}
