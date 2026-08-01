package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class w10 {
    public static final w10 d;
    public static final /* synthetic */ w10[] e;

    /* JADX INFO: Fake field, exist only in values array */
    w10 EF0;

    static {
        w10 w10Var = new w10("SYNCHRONIZED", 0);
        w10 w10Var2 = new w10("PUBLICATION", 1);
        w10 w10Var3 = new w10("NONE", 2);
        d = w10Var3;
        e = new w10[]{w10Var, w10Var2, w10Var3};
    }

    public static w10 valueOf(String str) {
        return (w10) Enum.valueOf(w10.class, str);
    }

    public static w10[] values() {
        return (w10[]) e.clone();
    }
}
