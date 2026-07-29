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
public class I10 {
    public static final I10 j;
    public static final I10 k;
    public static final C10 l;
    public static final E10 m;
    public static final I10 n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ I10[] f47o;
    public final K10 h;
    public final int i;

    /* JADX INFO: Fake field, exist only in values array */
    I10 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    I10 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    I10 EF2;

    static {
        I10 i10 = new I10("DOUBLE", 0, K10.l, 1);
        I10 i102 = new I10("FLOAT", 1, K10.k, 5);
        K10 k10 = K10.j;
        I10 i103 = new I10("INT64", 2, k10, 0);
        I10 i104 = new I10("UINT64", 3, k10, 0);
        K10 k102 = K10.i;
        I10 i105 = new I10("INT32", 4, k102, 0);
        j = i105;
        I10 i106 = new I10("FIXED64", 5, k10, 1);
        I10 i107 = new I10("FIXED32", 6, k102, 5);
        I10 i108 = new I10("BOOL", 7, K10.m, 0);
        k = i108;
        A10 a10 = new A10("STRING", 8, K10.n, 2);
        K10 k103 = K10.q;
        C10 c10 = new C10("GROUP", 9, k103, 3);
        l = c10;
        E10 e10 = new E10("MESSAGE", 10, k103, 2);
        m = e10;
        G10 g10 = new G10("BYTES", 11, K10.f54o, 2);
        I10 i109 = new I10("UINT32", 12, k102, 0);
        I10 i1010 = new I10("ENUM", 13, K10.p, 0);
        n = i1010;
        f47o = new I10[]{i10, i102, i103, i104, i105, i106, i107, i108, a10, c10, e10, g10, i109, i1010, new I10("SFIXED32", 14, k102, 5), new I10("SFIXED64", 15, k10, 1), new I10("SINT32", 16, k102, 0), new I10("SINT64", 17, k10, 0)};
    }

    public I10(String str, int i, K10 k10, int i2) {
        this.h = k10;
        this.i = i2;
    }

    public static I10 valueOf(String str) {
        return (I10) Enum.valueOf(I10.class, str);
    }

    public static I10[] values() {
        return (I10[]) f47o.clone();
    }

    public boolean a() {
        return !(this instanceof A10);
    }
}
