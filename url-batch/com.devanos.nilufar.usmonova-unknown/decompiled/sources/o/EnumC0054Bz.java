package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.Bz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0054Bz {
    private static final /* synthetic */ EnumC0054Bz[] $VALUES;
    public static final C2388zz Companion;
    public static final EnumC0054Bz ON_ANY;
    public static final EnumC0054Bz ON_CREATE;
    public static final EnumC0054Bz ON_DESTROY;
    public static final EnumC0054Bz ON_PAUSE;
    public static final EnumC0054Bz ON_RESUME;
    public static final EnumC0054Bz ON_START;
    public static final EnumC0054Bz ON_STOP;

    static {
        EnumC0054Bz enumC0054Bz = new EnumC0054Bz("ON_CREATE", 0);
        ON_CREATE = enumC0054Bz;
        EnumC0054Bz enumC0054Bz2 = new EnumC0054Bz("ON_START", 1);
        ON_START = enumC0054Bz2;
        EnumC0054Bz enumC0054Bz3 = new EnumC0054Bz("ON_RESUME", 2);
        ON_RESUME = enumC0054Bz3;
        EnumC0054Bz enumC0054Bz4 = new EnumC0054Bz("ON_PAUSE", 3);
        ON_PAUSE = enumC0054Bz4;
        EnumC0054Bz enumC0054Bz5 = new EnumC0054Bz("ON_STOP", 4);
        ON_STOP = enumC0054Bz5;
        EnumC0054Bz enumC0054Bz6 = new EnumC0054Bz("ON_DESTROY", 5);
        ON_DESTROY = enumC0054Bz6;
        EnumC0054Bz enumC0054Bz7 = new EnumC0054Bz("ON_ANY", 6);
        ON_ANY = enumC0054Bz7;
        $VALUES = new EnumC0054Bz[]{enumC0054Bz, enumC0054Bz2, enumC0054Bz3, enumC0054Bz4, enumC0054Bz5, enumC0054Bz6, enumC0054Bz7};
        Companion = new C2388zz();
    }

    public static EnumC0054Bz valueOf(String str) {
        return (EnumC0054Bz) Enum.valueOf(EnumC0054Bz.class, str);
    }

    public static EnumC0054Bz[] values() {
        return (EnumC0054Bz[]) $VALUES.clone();
    }

    public final EnumC0080Cz a() {
        switch (AbstractC0028Az.a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0080Cz.j;
            case 3:
            case 4:
                return EnumC0080Cz.k;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                return EnumC0080Cz.l;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                return EnumC0080Cz.h;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
