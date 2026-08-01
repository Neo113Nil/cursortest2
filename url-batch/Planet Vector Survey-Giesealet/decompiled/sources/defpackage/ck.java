package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ck {
    public static final ck d;
    public static final ck e;
    public static final ck f;
    public static final /* synthetic */ ck[] g;

    static {
        ck ckVar = new ck("COROUTINE_SUSPENDED", 0);
        d = ckVar;
        ck ckVar2 = new ck("UNDECIDED", 1);
        e = ckVar2;
        ck ckVar3 = new ck("RESUMED", 2);
        f = ckVar3;
        g = new ck[]{ckVar, ckVar2, ckVar3};
    }

    public static ck valueOf(String str) {
        return (ck) Enum.valueOf(ck.class, str);
    }

    public static ck[] values() {
        return (ck[]) g.clone();
    }
}
