package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class zj {
    public static final zj d;
    public static final zj e;
    public static final zj f;
    public static final zj g;
    public static final zj h;
    public static final /* synthetic */ zj[] i;

    static {
        zj zjVar = new zj("CPU_ACQUIRED", 0);
        d = zjVar;
        zj zjVar2 = new zj("BLOCKING", 1);
        e = zjVar2;
        zj zjVar3 = new zj("PARKING", 2);
        f = zjVar3;
        zj zjVar4 = new zj("DORMANT", 3);
        g = zjVar4;
        zj zjVar5 = new zj("TERMINATED", 4);
        h = zjVar5;
        i = new zj[]{zjVar, zjVar2, zjVar3, zjVar4, zjVar5};
    }

    public static zj valueOf(String str) {
        return (zj) Enum.valueOf(zj.class, str);
    }

    public static zj[] values() {
        return (zj[]) i.clone();
    }
}
