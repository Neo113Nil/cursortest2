package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class cq {
    public static final cq d;
    public static final cq e;
    public static final cq f;
    public static final /* synthetic */ cq[] g;

    static {
        cq cqVar = new cq("PreEnter", 0);
        d = cqVar;
        cq cqVar2 = new cq("Visible", 1);
        e = cqVar2;
        cq cqVar3 = new cq("PostExit", 2);
        f = cqVar3;
        g = new cq[]{cqVar, cqVar2, cqVar3};
    }

    public static cq valueOf(String str) {
        return (cq) Enum.valueOf(cq.class, str);
    }

    public static cq[] values() {
        return (cq[]) g.clone();
    }
}
