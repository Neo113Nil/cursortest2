package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class vz {
    public static final vz d;
    public static final vz e;
    public static final vz f;
    public static final vz g;
    public static final /* synthetic */ vz[] h;

    static {
        vz vzVar = new vz("IGNORED", 0);
        d = vzVar;
        vz vzVar2 = new vz("SCHEDULED", 1);
        e = vzVar2;
        vz vzVar3 = new vz("DEFERRED", 2);
        f = vzVar3;
        vz vzVar4 = new vz("IMMINENT", 3);
        g = vzVar4;
        h = new vz[]{vzVar, vzVar2, vzVar3, vzVar4};
    }

    public static vz valueOf(String str) {
        return (vz) Enum.valueOf(vz.class, str);
    }

    public static vz[] values() {
        return (vz[]) h.clone();
    }
}
