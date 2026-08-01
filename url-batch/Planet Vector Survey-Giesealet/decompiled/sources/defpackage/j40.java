package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class j40 {
    public static final j40 d;
    public static final j40 e;
    public static final j40 f;
    public static final /* synthetic */ j40[] g;

    static {
        j40 j40Var = new j40("IsPlacedInLookahead", 0);
        d = j40Var;
        j40 j40Var2 = new j40("IsPlacedInApproach", 1);
        e = j40Var2;
        j40 j40Var3 = new j40("IsNotPlaced", 2);
        f = j40Var3;
        g = new j40[]{j40Var, j40Var2, j40Var3};
    }

    public static j40 valueOf(String str) {
        return (j40) Enum.valueOf(j40.class, str);
    }

    public static j40[] values() {
        return (j40[]) g.clone();
    }
}
