package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class pr {
    public static final pr f;
    public static final pr g;
    public static final pr h;
    public static final pr i;
    public static final /* synthetic */ pr[] j;

    static {
        pr prVar = new pr("NONE", 0);
        f = prVar;
        pr prVar2 = new pr("START", 1);
        g = prVar2;
        pr prVar3 = new pr("END", 2);
        h = prVar3;
        pr prVar4 = new pr("BOTH", 3);
        i = prVar4;
        j = new pr[]{prVar, prVar2, prVar3, prVar4};
    }

    public static pr valueOf(String str) {
        return (pr) Enum.valueOf(pr.class, str);
    }

    public static pr[] values() {
        return (pr[]) j.clone();
    }
}
