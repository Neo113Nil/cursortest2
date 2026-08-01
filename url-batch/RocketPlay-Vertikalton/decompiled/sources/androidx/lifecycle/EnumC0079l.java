package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0079l {
    private static final /* synthetic */ EnumC0079l[] $VALUES;
    public static final C0077j Companion;
    public static final EnumC0079l ON_ANY;
    public static final EnumC0079l ON_CREATE;
    public static final EnumC0079l ON_DESTROY;
    public static final EnumC0079l ON_PAUSE;
    public static final EnumC0079l ON_RESUME;
    public static final EnumC0079l ON_START;
    public static final EnumC0079l ON_STOP;

    static {
        EnumC0079l enumC0079l = new EnumC0079l("ON_CREATE", 0);
        ON_CREATE = enumC0079l;
        EnumC0079l enumC0079l2 = new EnumC0079l("ON_START", 1);
        ON_START = enumC0079l2;
        EnumC0079l enumC0079l3 = new EnumC0079l("ON_RESUME", 2);
        ON_RESUME = enumC0079l3;
        EnumC0079l enumC0079l4 = new EnumC0079l("ON_PAUSE", 3);
        ON_PAUSE = enumC0079l4;
        EnumC0079l enumC0079l5 = new EnumC0079l("ON_STOP", 4);
        ON_STOP = enumC0079l5;
        EnumC0079l enumC0079l6 = new EnumC0079l("ON_DESTROY", 5);
        ON_DESTROY = enumC0079l6;
        EnumC0079l enumC0079l7 = new EnumC0079l("ON_ANY", 6);
        ON_ANY = enumC0079l7;
        $VALUES = new EnumC0079l[]{enumC0079l, enumC0079l2, enumC0079l3, enumC0079l4, enumC0079l5, enumC0079l6, enumC0079l7};
        Companion = new C0077j();
    }

    public static EnumC0079l valueOf(String str) {
        return (EnumC0079l) Enum.valueOf(EnumC0079l.class, str);
    }

    public static EnumC0079l[] values() {
        return (EnumC0079l[]) $VALUES.clone();
    }

    public final EnumC0080m a() {
        switch (AbstractC0078k.f1895a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0080m.f1898c;
            case 3:
            case 4:
                return EnumC0080m.d;
            case 5:
                return EnumC0080m.f1899e;
            case 6:
                return EnumC0080m.f1896a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
