package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.eI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0962eI {
    public static final EnumC0962eI h;
    public static final /* synthetic */ EnumC0962eI[] i;

    static {
        EnumC0962eI enumC0962eI = new EnumC0962eI("PLAIN_TEXT", 0);
        h = enumC0962eI;
        i = new EnumC0962eI[]{enumC0962eI};
    }

    public static EnumC0962eI a(String str) {
        for (EnumC0962eI enumC0962eI : values()) {
            enumC0962eI.getClass();
            if ("text/plain".equals(str)) {
                return enumC0962eI;
            }
        }
        throw new NoSuchFieldException(AbstractC1888sN.s("No such ClipboardContentFormat: ", str));
    }

    public static EnumC0962eI valueOf(String str) {
        return (EnumC0962eI) Enum.valueOf(EnumC0962eI.class, str);
    }

    public static EnumC0962eI[] values() {
        return (EnumC0962eI[]) i.clone();
    }
}
