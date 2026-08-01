package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ek {
    public static final ek d;
    public static final ek e;
    public static final ek f;
    public static final ek g;
    public static final /* synthetic */ ek[] h;

    static {
        ek ekVar = new ek("DEFAULT", 0);
        d = ekVar;
        ek ekVar2 = new ek("LAZY", 1);
        e = ekVar2;
        ek ekVar3 = new ek("ATOMIC", 2);
        f = ekVar3;
        ek ekVar4 = new ek("UNDISPATCHED", 3);
        g = ekVar4;
        h = new ek[]{ekVar, ekVar2, ekVar3, ekVar4};
    }

    public static ek valueOf(String str) {
        return (ek) Enum.valueOf(ek.class, str);
    }

    public static ek[] values() {
        return (ek[]) h.clone();
    }
}
