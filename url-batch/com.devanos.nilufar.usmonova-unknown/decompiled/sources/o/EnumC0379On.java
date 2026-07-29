package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.On, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0379On {
    public static final EnumC0379On h;
    public static final EnumC0379On i;
    public static final EnumC0379On j;
    public static final /* synthetic */ EnumC0379On[] k;

    static {
        EnumC0379On enumC0379On = new EnumC0379On("Active", 0);
        h = enumC0379On;
        EnumC0379On enumC0379On2 = new EnumC0379On("ActiveParent", 1);
        i = enumC0379On2;
        EnumC0379On enumC0379On3 = new EnumC0379On("Captured", 2);
        EnumC0379On enumC0379On4 = new EnumC0379On("Inactive", 3);
        j = enumC0379On4;
        k = new EnumC0379On[]{enumC0379On, enumC0379On2, enumC0379On3, enumC0379On4};
    }

    public static EnumC0379On valueOf(String str) {
        return (EnumC0379On) Enum.valueOf(EnumC0379On.class, str);
    }

    public static EnumC0379On[] values() {
        return (EnumC0379On[]) k.clone();
    }
}
