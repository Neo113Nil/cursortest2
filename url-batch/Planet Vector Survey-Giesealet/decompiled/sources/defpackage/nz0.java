package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class nz0 {
    public static final nz0 d;
    public static final /* synthetic */ nz0[] e;

    static {
        nz0 nz0Var = new nz0("Lsq2", 0);
        d = nz0Var;
        e = new nz0[]{nz0Var, new nz0("Impulse", 1)};
    }

    public static nz0 valueOf(String str) {
        return (nz0) Enum.valueOf(nz0.class, str);
    }

    public static nz0[] values() {
        return (nz0[]) e.clone();
    }
}
