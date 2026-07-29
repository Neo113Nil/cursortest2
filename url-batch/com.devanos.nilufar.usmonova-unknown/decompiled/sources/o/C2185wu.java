package o;

/* renamed from: o.wu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2185wu extends AbstractC2325z00 {
    public static final C2185wu c = new C2185wu("package", false);

    @Override // o.AbstractC2325z00
    public final Integer a(AbstractC2325z00 abstractC2325z00) {
        AbstractC0048Bt.n(abstractC2325z00, "visibility");
        if (this == abstractC2325z00) {
            return 0;
        }
        C2140wB c2140wB = AbstractC2259y00.a;
        return (abstractC2325z00 == C1929t00.c || abstractC2325z00 == C1995u00.c) ? 1 : -1;
    }

    @Override // o.AbstractC2325z00
    public final String b() {
        return "public/*package*/";
    }

    @Override // o.AbstractC2325z00
    public final AbstractC2325z00 c() {
        return C2061v00.c;
    }
}
