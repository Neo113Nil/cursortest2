package o;

/* renamed from: o.xu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2251xu extends AbstractC2325z00 {
    public static final C2251xu c = new C2251xu("protected_and_package", true);

    @Override // o.AbstractC2325z00
    public final Integer a(AbstractC2325z00 abstractC2325z00) {
        AbstractC0048Bt.n(abstractC2325z00, "visibility");
        if (equals(abstractC2325z00)) {
            return 0;
        }
        if (abstractC2325z00 == C1732q00.c) {
            return null;
        }
        C2140wB c2140wB = AbstractC2259y00.a;
        return (abstractC2325z00 == C1929t00.c || abstractC2325z00 == C1995u00.c) ? 1 : -1;
    }

    @Override // o.AbstractC2325z00
    public final String b() {
        return "protected/*protected and package*/";
    }

    @Override // o.AbstractC2325z00
    public final AbstractC2325z00 c() {
        return C2061v00.c;
    }
}
