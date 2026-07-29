package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class J10 {
    public static final B10 j;
    public static final D10 k;
    public static final F10 l;
    public static final /* synthetic */ J10[] m;
    public final L10 h;
    public final int i;

    /* JADX INFO: Fake field, exist only in values array */
    J10 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    J10 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    J10 EF2;

    static {
        J10 j10 = new J10("DOUBLE", 0, L10.DOUBLE, 1);
        J10 j102 = new J10("FLOAT", 1, L10.FLOAT, 5);
        L10 l10 = L10.LONG;
        J10 j103 = new J10("INT64", 2, l10, 0);
        J10 j104 = new J10("UINT64", 3, l10, 0);
        L10 l102 = L10.INT;
        J10 j105 = new J10("INT32", 4, l102, 0);
        J10 j106 = new J10("FIXED64", 5, l10, 1);
        J10 j107 = new J10("FIXED32", 6, l102, 5);
        J10 j108 = new J10("BOOL", 7, L10.BOOLEAN, 0);
        B10 b10 = new B10("STRING", 8, L10.STRING, 2);
        j = b10;
        L10 l103 = L10.MESSAGE;
        D10 d10 = new D10("GROUP", 9, l103, 3);
        k = d10;
        F10 f10 = new F10("MESSAGE", 10, l103, 2);
        l = f10;
        m = new J10[]{j10, j102, j103, j104, j105, j106, j107, j108, b10, d10, f10, new H10("BYTES", 11, L10.BYTE_STRING, 2), new J10("UINT32", 12, l102, 0), new J10("ENUM", 13, L10.ENUM, 0), new J10("SFIXED32", 14, l102, 5), new J10("SFIXED64", 15, l10, 1), new J10("SINT32", 16, l102, 0), new J10("SINT64", 17, l10, 0)};
    }

    public J10(String str, int i, L10 l10, int i2) {
        this.h = l10;
        this.i = i2;
    }

    public static J10 valueOf(String str) {
        return (J10) Enum.valueOf(J10.class, str);
    }

    public static J10[] values() {
        return (J10[]) m.clone();
    }
}
