package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.vF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2078vF {
    public static final EnumC2078vF h;
    public static final EnumC2078vF i;
    public static final EnumC2078vF j;
    public static final /* synthetic */ EnumC2078vF[] k;

    static {
        EnumC2078vF enumC2078vF = new EnumC2078vF("FORCE_FLEXIBILITY", 0);
        h = enumC2078vF;
        EnumC2078vF enumC2078vF2 = new EnumC2078vF("NULLABLE", 1);
        i = enumC2078vF2;
        EnumC2078vF enumC2078vF3 = new EnumC2078vF("NOT_NULL", 2);
        j = enumC2078vF3;
        k = new EnumC2078vF[]{enumC2078vF, enumC2078vF2, enumC2078vF3};
    }

    public static EnumC2078vF valueOf(String str) {
        return (EnumC2078vF) Enum.valueOf(EnumC2078vF.class, str);
    }

    public static EnumC2078vF[] values() {
        return (EnumC2078vF[]) k.clone();
    }
}
