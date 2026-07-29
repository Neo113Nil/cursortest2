package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.uD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2010uD {
    public static final EnumC2010uD h;
    public static final EnumC2010uD i;
    public static final /* synthetic */ EnumC2010uD[] j;

    static {
        EnumC2010uD enumC2010uD = new EnumC2010uD("READ_ONLY", 0);
        h = enumC2010uD;
        EnumC2010uD enumC2010uD2 = new EnumC2010uD("MUTABLE", 1);
        i = enumC2010uD2;
        j = new EnumC2010uD[]{enumC2010uD, enumC2010uD2};
    }

    public static EnumC2010uD valueOf(String str) {
        return (EnumC2010uD) Enum.valueOf(EnumC2010uD.class, str);
    }

    public static EnumC2010uD[] values() {
        return (EnumC2010uD[]) j.clone();
    }
}
