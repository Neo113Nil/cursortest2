package o;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: o.av, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0739av implements InterfaceC1159hH {
    public final VA a;
    public final C0826cD b;
    public C0296Lh c;
    public final TA d;

    public C0739av(VA va, C0853ce c0853ce, C0826cD c0826cD) {
        this.a = va;
        this.b = c0826cD;
        this.d = va.c(new C1400l(1, this));
    }

    @Override // o.InterfaceC1159hH
    public final boolean a(C2245xo c2245xo) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        TA ta = this.d;
        Object obj = ta.i.get(c2245xo);
        return ((obj == null || obj == UA.i) ? c(c2245xo) : (InterfaceC0961eH) ta.invoke(c2245xo)) == null;
    }

    @Override // o.InterfaceC1159hH
    public final void b(C2245xo c2245xo, ArrayList arrayList) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        AbstractC1052fg.e(arrayList, this.d.invoke(c2245xo));
    }

    public final W8 c(C2245xo c2245xo) {
        InputStream a;
        AbstractC0048Bt.n(c2245xo, "fqName");
        if (c2245xo.h(AbstractC1499mT.i)) {
            Q8.m.getClass();
            a = Y8.a(Q8.a(c2245xo));
        } else {
            a = null;
        }
        if (a != null) {
            return AbstractC0048Bt.z(c2245xo, this.a, this.b, a);
        }
        return null;
    }

    @Override // o.InterfaceC1159hH
    public final Collection f(C2245xo c2245xo, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        return C1648ok.h;
    }
}
