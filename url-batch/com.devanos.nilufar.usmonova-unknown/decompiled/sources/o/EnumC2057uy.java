package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.uy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2057uy {
    public static final EnumC2057uy h;
    public static final EnumC2057uy i;
    public static final /* synthetic */ EnumC2057uy[] j;

    static {
        EnumC2057uy enumC2057uy = new EnumC2057uy("Ltr", 0);
        h = enumC2057uy;
        EnumC2057uy enumC2057uy2 = new EnumC2057uy("Rtl", 1);
        i = enumC2057uy2;
        j = new EnumC2057uy[]{enumC2057uy, enumC2057uy2};
    }

    public static EnumC2057uy valueOf(String str) {
        return (EnumC2057uy) Enum.valueOf(EnumC2057uy.class, str);
    }

    public static EnumC2057uy[] values() {
        return (EnumC2057uy[]) j.clone();
    }
}
