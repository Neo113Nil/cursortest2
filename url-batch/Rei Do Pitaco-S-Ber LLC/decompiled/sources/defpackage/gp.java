package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class gp {
    public static final gp f;
    public static final gp g;
    public static final gp h;
    public static final gp i;
    public static final gp j;
    public static final /* synthetic */ gp[] k;

    static {
        gp gpVar = new gp("DESTROYED", 0);
        f = gpVar;
        gp gpVar2 = new gp("INITIALIZED", 1);
        g = gpVar2;
        gp gpVar3 = new gp("CREATED", 2);
        h = gpVar3;
        gp gpVar4 = new gp("STARTED", 3);
        i = gpVar4;
        gp gpVar5 = new gp("RESUMED", 4);
        j = gpVar5;
        k = new gp[]{gpVar, gpVar2, gpVar3, gpVar4, gpVar5};
    }

    public static gp valueOf(String str) {
        return (gp) Enum.valueOf(gp.class, str);
    }

    public static gp[] values() {
        return (gp[]) k.clone();
    }
}
