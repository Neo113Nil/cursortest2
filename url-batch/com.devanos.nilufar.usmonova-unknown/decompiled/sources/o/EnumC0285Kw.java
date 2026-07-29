package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.Kw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0285Kw {
    public static final EnumC0285Kw h;
    public static final EnumC0285Kw i;
    public static final EnumC0285Kw j;
    public static final /* synthetic */ EnumC0285Kw[] k;

    static {
        EnumC0285Kw enumC0285Kw = new EnumC0285Kw("INSTANCE", 0);
        h = enumC0285Kw;
        EnumC0285Kw enumC0285Kw2 = new EnumC0285Kw("CONTEXT", 1);
        EnumC0285Kw enumC0285Kw3 = new EnumC0285Kw("EXTENSION_RECEIVER", 2);
        i = enumC0285Kw3;
        EnumC0285Kw enumC0285Kw4 = new EnumC0285Kw("VALUE", 3);
        j = enumC0285Kw4;
        k = new EnumC0285Kw[]{enumC0285Kw, enumC0285Kw2, enumC0285Kw3, enumC0285Kw4};
    }

    public static EnumC0285Kw valueOf(String str) {
        return (EnumC0285Kw) Enum.valueOf(EnumC0285Kw.class, str);
    }

    public static EnumC0285Kw[] values() {
        return (EnumC0285Kw[]) k.clone();
    }
}
