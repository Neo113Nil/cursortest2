package o;

/* loaded from: classes.dex */
public final class W7 extends TC implements InterfaceC1055fj, InterfaceC2342zF {
    public long n;

    /* renamed from: o, reason: collision with root package name */
    public C0140Fh f122o;
    public long p;
    public EnumC2057uy q;
    public RG r;
    public C0140Fh s;

    @Override // o.InterfaceC1055fj
    public final void b(C0079Cy c0079Cy) {
        C0079Cy c0079Cy2;
        C1112ga c1112ga = c0079Cy.b;
        if (this.f122o != AbstractC1305jX.k) {
            C1360kM c1360kM = new C1360kM();
            if (c1112ga.m() == this.p && c1112ga.b.b == this.q && AbstractC0048Bt.h(this.s, this.f122o)) {
                RG rg = this.r;
                AbstractC0048Bt.k(rg);
                c1360kM.h = rg;
            } else {
                AbstractC1305jX.B(this, new V7(c1360kM, this, c0079Cy, 0));
            }
            this.r = (RG) c1360kM.h;
            this.p = c1112ga.m();
            this.q = c1112ga.b.b;
            this.s = this.f122o;
            Object obj = c1360kM.h;
            AbstractC0048Bt.k(obj);
            RG rg2 = (RG) obj;
            if (!C1114gc.b(this.n, C1114gc.f)) {
                long j = this.n;
                C0559Vl c0559Vl = C0559Vl.i;
                if (rg2 instanceof PG) {
                    C1032fM c1032fM = ((PG) rg2).a;
                    c0079Cy2 = c0079Cy;
                    c0079Cy2.k(j, PX.h(c1032fM.a, c1032fM.b), AbstractC1035fP.a(c1032fM.c(), c1032fM.b()), c0559Vl);
                } else {
                    c0079Cy2 = c0079Cy;
                    if (rg2 instanceof QG) {
                        ((QG) rg2).getClass();
                        Object obj2 = null;
                        obj2.getClass();
                        c1112ga.b.c.l(null, C1112ga.a(c1112ga, j, c0559Vl));
                    } else {
                        if (!(rg2 instanceof OG)) {
                            throw new C0057Cc();
                        }
                        ((OG) rg2).getClass();
                        c1112ga.b.c.l(null, C1112ga.a(c1112ga, j, c0559Vl));
                    }
                }
                c0079Cy2.a();
            }
        } else if (!C1114gc.b(this.n, C1114gc.f)) {
            InterfaceC1121gj.t(c0079Cy, this.n);
        }
        c0079Cy2 = c0079Cy;
        c0079Cy2.a();
    }

    @Override // o.InterfaceC2342zF
    public final void c() {
        this.p = 9205357640488583168L;
        this.q = null;
        this.r = null;
        this.s = null;
        AbstractC1473m3.M(this);
    }
}
