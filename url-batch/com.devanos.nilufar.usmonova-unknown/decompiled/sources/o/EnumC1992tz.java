package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.tz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1992tz {
    public static final EnumC1992tz h;
    public static final EnumC1992tz i;
    public static final /* synthetic */ EnumC1992tz[] j;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1992tz EF0;

    static {
        EnumC1992tz enumC1992tz = new EnumC1992tz("SYNCHRONIZED", 0);
        EnumC1992tz enumC1992tz2 = new EnumC1992tz("PUBLICATION", 1);
        h = enumC1992tz2;
        EnumC1992tz enumC1992tz3 = new EnumC1992tz("NONE", 2);
        i = enumC1992tz3;
        j = new EnumC1992tz[]{enumC1992tz, enumC1992tz2, enumC1992tz3};
    }

    public static EnumC1992tz valueOf(String str) {
        return (EnumC1992tz) Enum.valueOf(EnumC1992tz.class, str);
    }

    public static EnumC1992tz[] values() {
        return (EnumC1992tz[]) j.clone();
    }
}
