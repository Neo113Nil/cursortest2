package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ap0 {
    public static final ap0 d;
    public static final /* synthetic */ ap0[] e;

    static {
        ap0 ap0Var = new ap0("Inherit", 0);
        d = ap0Var;
        e = new ap0[]{ap0Var, new ap0("SecureOn", 1), new ap0("SecureOff", 2)};
    }

    public static ap0 valueOf(String str) {
        return (ap0) Enum.valueOf(ap0.class, str);
    }

    public static ap0[] values() {
        return (ap0[]) e.clone();
    }
}
