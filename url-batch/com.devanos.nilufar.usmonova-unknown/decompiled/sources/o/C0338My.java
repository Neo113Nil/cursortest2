package o;

import java.util.Iterator;

/* renamed from: o.My, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0338My implements InterfaceC1738q4 {
    public final C1216i8 h;
    public final InterfaceC0489St i;
    public final boolean j;
    public final TA k;

    public C0338My(C1216i8 c1216i8, InterfaceC0489St interfaceC0489St, boolean z) {
        AbstractC0048Bt.n(c1216i8, "c");
        AbstractC0048Bt.n(interfaceC0489St, "annotationOwner");
        this.h = c1216i8;
        this.i = interfaceC0489St;
        this.j = z;
        this.k = ((VA) ((C1198hu) c1216i8.i).a).c(new C1400l(22, this));
    }

    @Override // o.InterfaceC1738q4
    public final InterfaceC0948e4 c(C2245xo c2245xo) {
        InterfaceC0948e4 interfaceC0948e4;
        AbstractC0048Bt.n(c2245xo, "fqName");
        InterfaceC0489St interfaceC0489St = this.i;
        C1558nM a = interfaceC0489St.a(c2245xo);
        if (a != null && (interfaceC0948e4 = (InterfaceC0948e4) this.k.invoke(a)) != null) {
            return interfaceC0948e4;
        }
        C0827cE c0827cE = AbstractC0463Rt.a;
        return AbstractC0463Rt.a(c2245xo, interfaceC0489St, this.h);
    }

    @Override // o.InterfaceC1738q4
    public final boolean i(C2245xo c2245xo) {
        return AbstractC1052fg.F(this, c2245xo);
    }

    @Override // o.InterfaceC1738q4
    public final boolean isEmpty() {
        return this.i.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC0489St interfaceC0489St = this.i;
        C1831rW z = PQ.z(AbstractC0720ac.i0(interfaceC0489St.getAnnotations()), this.k);
        C0827cE c0827cE = AbstractC0463Rt.a;
        int i = 3;
        return new C0663Zl(new C0730am(PQ.w(P6.X(new NQ[]{z, new T6(i, AbstractC0463Rt.a(AbstractC1433lT.m, interfaceC0489St, this.h))})), false, new C0215Ie(i)));
    }
}
