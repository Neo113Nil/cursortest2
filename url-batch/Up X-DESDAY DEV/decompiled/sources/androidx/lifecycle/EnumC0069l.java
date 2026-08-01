package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0069l {
    private static final /* synthetic */ EnumC0069l[] $VALUES;
    public static final C0067j Companion;
    public static final EnumC0069l ON_ANY;
    public static final EnumC0069l ON_CREATE;
    public static final EnumC0069l ON_DESTROY;
    public static final EnumC0069l ON_PAUSE;
    public static final EnumC0069l ON_RESUME;
    public static final EnumC0069l ON_START;
    public static final EnumC0069l ON_STOP;

    static {
        EnumC0069l enumC0069l = new EnumC0069l("ON_CREATE", 0);
        ON_CREATE = enumC0069l;
        EnumC0069l enumC0069l2 = new EnumC0069l("ON_START", 1);
        ON_START = enumC0069l2;
        EnumC0069l enumC0069l3 = new EnumC0069l("ON_RESUME", 2);
        ON_RESUME = enumC0069l3;
        EnumC0069l enumC0069l4 = new EnumC0069l("ON_PAUSE", 3);
        ON_PAUSE = enumC0069l4;
        EnumC0069l enumC0069l5 = new EnumC0069l("ON_STOP", 4);
        ON_STOP = enumC0069l5;
        EnumC0069l enumC0069l6 = new EnumC0069l("ON_DESTROY", 5);
        ON_DESTROY = enumC0069l6;
        EnumC0069l enumC0069l7 = new EnumC0069l("ON_ANY", 6);
        ON_ANY = enumC0069l7;
        $VALUES = new EnumC0069l[]{enumC0069l, enumC0069l2, enumC0069l3, enumC0069l4, enumC0069l5, enumC0069l6, enumC0069l7};
        Companion = new C0067j();
    }

    public static EnumC0069l valueOf(String str) {
        return (EnumC0069l) Enum.valueOf(EnumC0069l.class, str);
    }

    public static EnumC0069l[] values() {
        return (EnumC0069l[]) $VALUES.clone();
    }

    public final EnumC0070m a() {
        switch (AbstractC0068k.f1359a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0070m.f1362c;
            case 3:
            case 4:
                return EnumC0070m.d;
            case 5:
                return EnumC0070m.f1363e;
            case 6:
                return EnumC0070m.f1360a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
