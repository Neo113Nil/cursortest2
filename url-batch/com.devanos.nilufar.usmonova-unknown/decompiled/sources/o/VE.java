package o;

import java.util.List;

/* loaded from: classes.dex */
public final class VE extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C1334k i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VE(C1334k c1334k, int i) {
        super(1);
        this.h = i;
        this.i = c1334k;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        InterfaceC1836rb interfaceC1836rb;
        switch (this.h) {
            case 0:
                TE te = (TE) obj;
                AbstractC0048Bt.n(te, "<name for destructuring parameter 0>");
                C1639ob c1639ob = te.a;
                List list = te.b;
                if (c1639ob.c) {
                    throw new UnsupportedOperationException("Unresolved local class: " + c1639ob);
                }
                C1639ob f = c1639ob.f();
                C1334k c1334k = this.i;
                if (f != null) {
                    interfaceC1836rb = c1334k.x(f, AbstractC0720ac.k0(list));
                } else {
                    PA pa = (PA) c1334k.k;
                    C2245xo g = c1639ob.g();
                    AbstractC0048Bt.m(g, "classId.packageFqName");
                    interfaceC1836rb = (InterfaceC1836rb) pa.invoke(g);
                }
                InterfaceC1836rb interfaceC1836rb2 = interfaceC1836rb;
                boolean z = !c1639ob.b.e().d();
                VA va = (VA) c1334k.i;
                C0827cE i = c1639ob.i();
                AbstractC0048Bt.m(i, "classId.shortClassName");
                Integer num = (Integer) AbstractC0720ac.p0(list);
                return new UE(va, interfaceC1836rb2, i, z, num != null ? num.intValue() : 0);
            default:
                C2245xo c2245xo = (C2245xo) obj;
                AbstractC0048Bt.n(c2245xo, "fqName");
                return new C1450lk((InterfaceC0761bD) this.i.j, c2245xo, 0);
        }
    }
}
