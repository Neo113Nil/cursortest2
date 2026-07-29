package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.Oe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0370Oe {
    public static final EnumC0370Oe h;
    public static final EnumC0370Oe i;
    public static final EnumC0370Oe j;
    public static final EnumC0370Oe k;
    public static final EnumC0370Oe l;
    public static final /* synthetic */ EnumC0370Oe[] m;

    static {
        EnumC0370Oe enumC0370Oe = new EnumC0370Oe("CPU_ACQUIRED", 0);
        h = enumC0370Oe;
        EnumC0370Oe enumC0370Oe2 = new EnumC0370Oe("BLOCKING", 1);
        i = enumC0370Oe2;
        EnumC0370Oe enumC0370Oe3 = new EnumC0370Oe("PARKING", 2);
        j = enumC0370Oe3;
        EnumC0370Oe enumC0370Oe4 = new EnumC0370Oe("DORMANT", 3);
        k = enumC0370Oe4;
        EnumC0370Oe enumC0370Oe5 = new EnumC0370Oe("TERMINATED", 4);
        l = enumC0370Oe5;
        m = new EnumC0370Oe[]{enumC0370Oe, enumC0370Oe2, enumC0370Oe3, enumC0370Oe4, enumC0370Oe5};
    }

    public static EnumC0370Oe valueOf(String str) {
        return (EnumC0370Oe) Enum.valueOf(EnumC0370Oe.class, str);
    }

    public static EnumC0370Oe[] values() {
        return (EnumC0370Oe[]) m.clone();
    }
}
