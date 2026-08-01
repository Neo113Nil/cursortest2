package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class fp {
    private static final /* synthetic */ fp[] $VALUES;
    public static final dp Companion;
    public static final fp ON_ANY;
    public static final fp ON_CREATE;
    public static final fp ON_DESTROY;
    public static final fp ON_PAUSE;
    public static final fp ON_RESUME;
    public static final fp ON_START;
    public static final fp ON_STOP;

    static {
        fp fpVar = new fp("ON_CREATE", 0);
        ON_CREATE = fpVar;
        fp fpVar2 = new fp("ON_START", 1);
        ON_START = fpVar2;
        fp fpVar3 = new fp("ON_RESUME", 2);
        ON_RESUME = fpVar3;
        fp fpVar4 = new fp("ON_PAUSE", 3);
        ON_PAUSE = fpVar4;
        fp fpVar5 = new fp("ON_STOP", 4);
        ON_STOP = fpVar5;
        fp fpVar6 = new fp("ON_DESTROY", 5);
        ON_DESTROY = fpVar6;
        fp fpVar7 = new fp("ON_ANY", 6);
        ON_ANY = fpVar7;
        $VALUES = new fp[]{fpVar, fpVar2, fpVar3, fpVar4, fpVar5, fpVar6, fpVar7};
        Companion = new dp();
    }

    public static fp valueOf(String str) {
        return (fp) Enum.valueOf(fp.class, str);
    }

    public static fp[] values() {
        return (fp[]) $VALUES.clone();
    }

    public final gp a() {
        switch (ep.a[ordinal()]) {
            case 1:
            case 2:
                return gp.h;
            case 3:
            case 4:
                return gp.i;
            case 5:
                return gp.j;
            case 6:
                return gp.f;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
