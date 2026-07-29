package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.Cz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0080Cz {
    public static final EnumC0080Cz h;
    public static final EnumC0080Cz i;
    public static final EnumC0080Cz j;
    public static final EnumC0080Cz k;
    public static final EnumC0080Cz l;
    public static final /* synthetic */ EnumC0080Cz[] m;

    static {
        EnumC0080Cz enumC0080Cz = new EnumC0080Cz("DESTROYED", 0);
        h = enumC0080Cz;
        EnumC0080Cz enumC0080Cz2 = new EnumC0080Cz("INITIALIZED", 1);
        i = enumC0080Cz2;
        EnumC0080Cz enumC0080Cz3 = new EnumC0080Cz("CREATED", 2);
        j = enumC0080Cz3;
        EnumC0080Cz enumC0080Cz4 = new EnumC0080Cz("STARTED", 3);
        k = enumC0080Cz4;
        EnumC0080Cz enumC0080Cz5 = new EnumC0080Cz("RESUMED", 4);
        l = enumC0080Cz5;
        m = new EnumC0080Cz[]{enumC0080Cz, enumC0080Cz2, enumC0080Cz3, enumC0080Cz4, enumC0080Cz5};
    }

    public static EnumC0080Cz valueOf(String str) {
        return (EnumC0080Cz) Enum.valueOf(EnumC0080Cz.class, str);
    }

    public static EnumC0080Cz[] values() {
        return (EnumC0080Cz[]) m.clone();
    }
}
