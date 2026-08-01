package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class cb {
    public static final cb d;
    public static final cb e;
    public static final cb f;
    public static final /* synthetic */ cb[] g;

    static {
        cb cbVar = new cb("SUSPEND", 0);
        d = cbVar;
        cb cbVar2 = new cb("DROP_OLDEST", 1);
        e = cbVar2;
        cb cbVar3 = new cb("DROP_LATEST", 2);
        f = cbVar3;
        g = new cb[]{cbVar, cbVar2, cbVar3};
    }

    public static cb valueOf(String str) {
        return (cb) Enum.valueOf(cb.class, str);
    }

    public static cb[] values() {
        return (cb[]) g.clone();
    }
}
