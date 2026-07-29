package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'm' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: o.Lp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0304Lp {
    public static final C0218Ih j;
    public static final EnumC0304Lp k;
    public static final EnumC0304Lp l;
    public static final EnumC0304Lp m;
    public static final EnumC0304Lp n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ EnumC0304Lp[] f65o;
    public final C2245xo h;
    public final String i;

    static {
        EnumC0304Lp enumC0304Lp = new EnumC0304Lp("Function", 0, AbstractC1499mT.j, "Function");
        k = enumC0304Lp;
        EnumC0304Lp enumC0304Lp2 = new EnumC0304Lp("SuspendFunction", 1, AbstractC1499mT.e, "SuspendFunction");
        l = enumC0304Lp2;
        C2245xo c2245xo = AbstractC1499mT.h;
        EnumC0304Lp enumC0304Lp3 = new EnumC0304Lp("KFunction", 2, c2245xo, "KFunction");
        m = enumC0304Lp3;
        EnumC0304Lp enumC0304Lp4 = new EnumC0304Lp("KSuspendFunction", 3, c2245xo, "KSuspendFunction");
        n = enumC0304Lp4;
        f65o = new EnumC0304Lp[]{enumC0304Lp, enumC0304Lp2, enumC0304Lp3, enumC0304Lp4};
        j = new C0218Ih(7);
    }

    public EnumC0304Lp(String str, int i, C2245xo c2245xo, String str2) {
        this.h = c2245xo;
        this.i = str2;
    }

    public static EnumC0304Lp valueOf(String str) {
        return (EnumC0304Lp) Enum.valueOf(EnumC0304Lp.class, str);
    }

    public static EnumC0304Lp[] values() {
        return (EnumC0304Lp[]) f65o.clone();
    }

    public final C0827cE a(int i) {
        return C0827cE.e(this.i + i);
    }
}
