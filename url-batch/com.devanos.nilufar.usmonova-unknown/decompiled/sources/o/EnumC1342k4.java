package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.k4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1342k4 {
    public static final EnumC1342k4 h;
    public static final EnumC1342k4 i;
    public static final EnumC1342k4 j;
    public static final EnumC1342k4 k;
    public static final EnumC1342k4 l;
    public static final EnumC1342k4 m;
    public static final EnumC1342k4 n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ EnumC1342k4[] f188o;

    static {
        EnumC1342k4 enumC1342k4 = new EnumC1342k4("Paragraph", 0);
        h = enumC1342k4;
        EnumC1342k4 enumC1342k42 = new EnumC1342k4("Span", 1);
        i = enumC1342k42;
        EnumC1342k4 enumC1342k43 = new EnumC1342k4("VerbatimTts", 2);
        j = enumC1342k43;
        EnumC1342k4 enumC1342k44 = new EnumC1342k4("Url", 3);
        k = enumC1342k44;
        EnumC1342k4 enumC1342k45 = new EnumC1342k4("Link", 4);
        l = enumC1342k45;
        EnumC1342k4 enumC1342k46 = new EnumC1342k4("Clickable", 5);
        m = enumC1342k46;
        EnumC1342k4 enumC1342k47 = new EnumC1342k4("String", 6);
        n = enumC1342k47;
        f188o = new EnumC1342k4[]{enumC1342k4, enumC1342k42, enumC1342k43, enumC1342k44, enumC1342k45, enumC1342k46, enumC1342k47};
    }

    public static EnumC1342k4 valueOf(String str) {
        return (EnumC1342k4) Enum.valueOf(EnumC1342k4.class, str);
    }

    public static EnumC1342k4[] values() {
        return (EnumC1342k4[]) f188o.clone();
    }
}
