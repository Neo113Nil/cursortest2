package o;

/* renamed from: o.Uy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0546Uy extends AbstractC1027fH {
    public static final /* synthetic */ InterfaceC0937dx[] t;
    public final HM n;

    /* renamed from: o, reason: collision with root package name */
    public final C1216i8 f117o;
    public final SA p;
    public final C1725pv q;
    public final NA r;
    public final InterfaceC1738q4 s;

    static {
        VM vm = UM.a;
        t = new InterfaceC0937dx[]{vm.g(new UJ(vm.b(C0546Uy.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), vm.g(new UJ(vm.b(C0546Uy.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0546Uy(C1216i8 c1216i8, HM hm) {
        super(r0.f177o, hm.a);
        AbstractC0048Bt.n(c1216i8, "outerContext");
        C1198hu c1198hu = (C1198hu) c1216i8.i;
        this.n = hm;
        C1216i8 p = AbstractC0048Bt.p(c1216i8, this, null, 6);
        this.f117o = p;
        AbstractC0048Bt.n(c1198hu.d.c().c, "<this>");
        C1527mv c1527mv = C1527mv.g;
        C1198hu c1198hu2 = (C1198hu) p.i;
        OT ot = c1198hu2.a;
        C0520Ty c0520Ty = new C0520Ty(this, 0);
        VA va = (VA) ot;
        va.getClass();
        this.p = new SA(va, c0520Ty);
        this.q = new C1725pv(p, hm, this);
        C0520Ty c0520Ty2 = new C0520Ty(this, 2);
        VA va2 = (VA) ot;
        va2.getClass();
        this.r = new NA(va2, c0520Ty2);
        this.s = c1198hu2.v.b ? C0460Rq.t : AbstractC0022At.G(p, hm);
        ((VA) ot).a(new C0520Ty(this, 1));
    }

    @Override // o.AbstractC1027fH, o.AbstractC1314jg, o.InterfaceC1249ig
    public final IS d() {
        return new C1590ns(9, this);
    }

    @Override // o.L, o.W3
    public final InterfaceC1738q4 getAnnotations() {
        return this.s;
    }

    @Override // o.InterfaceC0961eH
    public final WB r0() {
        return this.q;
    }

    @Override // o.AbstractC1027fH, o.AbstractC1184hg
    public final String toString() {
        return "Lazy Java package fragment: " + this.l + " of module " + ((C1198hu) this.f117o.i).f177o;
    }
}
