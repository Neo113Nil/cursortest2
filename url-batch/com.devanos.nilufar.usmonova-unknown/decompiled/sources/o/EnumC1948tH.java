package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.tH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1948tH {
    public static final EnumC1948tH h;
    public static final EnumC1948tH i;
    public static final EnumC1948tH j;
    public static final /* synthetic */ EnumC1948tH[] k;

    static {
        EnumC1948tH enumC1948tH = new EnumC1948tH("ALL", 0);
        h = enumC1948tH;
        EnumC1948tH enumC1948tH2 = new EnumC1948tH("ONLY_NON_SYNTHESIZED", 1);
        i = enumC1948tH2;
        EnumC1948tH enumC1948tH3 = new EnumC1948tH("NONE", 2);
        j = enumC1948tH3;
        k = new EnumC1948tH[]{enumC1948tH, enumC1948tH2, enumC1948tH3};
    }

    public static EnumC1948tH valueOf(String str) {
        return (EnumC1948tH) Enum.valueOf(EnumC1948tH.class, str);
    }

    public static EnumC1948tH[] values() {
        return (EnumC1948tH[]) k.clone();
    }
}
