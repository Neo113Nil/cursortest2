package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class br0 {
    public static final br0 d;
    public static final br0 e;
    public static final br0 f;
    public static final /* synthetic */ br0[] g;

    static {
        br0 br0Var = new br0("START", 0);
        d = br0Var;
        br0 br0Var2 = new br0("STOP", 1);
        e = br0Var2;
        br0 br0Var3 = new br0("STOP_AND_RESET_REPLAY_CACHE", 2);
        f = br0Var3;
        g = new br0[]{br0Var, br0Var2, br0Var3};
    }

    public static br0 valueOf(String str) {
        return (br0) Enum.valueOf(br0.class, str);
    }

    public static br0[] values() {
        return (br0[]) g.clone();
    }
}
