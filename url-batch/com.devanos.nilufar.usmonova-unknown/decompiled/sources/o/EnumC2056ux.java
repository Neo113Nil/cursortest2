package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.ux, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2056ux {
    public static final EnumC2056ux h;
    public static final EnumC2056ux i;
    public static final EnumC2056ux j;
    public static final /* synthetic */ EnumC2056ux[] k;

    static {
        EnumC2056ux enumC2056ux = new EnumC2056ux("INVARIANT", 0);
        h = enumC2056ux;
        EnumC2056ux enumC2056ux2 = new EnumC2056ux("IN", 1);
        i = enumC2056ux2;
        EnumC2056ux enumC2056ux3 = new EnumC2056ux("OUT", 2);
        j = enumC2056ux3;
        k = new EnumC2056ux[]{enumC2056ux, enumC2056ux2, enumC2056ux3};
    }

    public static EnumC2056ux valueOf(String str) {
        return (EnumC2056ux) Enum.valueOf(EnumC2056ux.class, str);
    }

    public static EnumC2056ux[] values() {
        return (EnumC2056ux[]) k.clone();
    }
}
