package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class P8 implements InterfaceC1375kb {
    public final VA a;
    public final InterfaceC0761bD b;

    public P8(VA va, C0826cD c0826cD) {
        AbstractC0048Bt.n(c0826cD, "module");
        this.a = va;
        this.b = c0826cD;
    }

    @Override // o.InterfaceC1375kb
    public final InterfaceC1245ib a(C1639ob c1639ob) {
        AbstractC0048Bt.n(c1639ob, "classId");
        if (c1639ob.c || !c1639ob.b.e().d()) {
            return null;
        }
        String b = c1639ob.h().b();
        if (!UT.E(b, "Function")) {
            return null;
        }
        C2245xo g = c1639ob.g();
        AbstractC0048Bt.m(g, "classId.packageFqName");
        EnumC0304Lp.j.getClass();
        C0278Kp t = C0218Ih.t(b, g);
        if (t == null) {
            return null;
        }
        EnumC0304Lp enumC0304Lp = t.a;
        int i = t.b;
        List list = (List) AbstractC0772bO.o(((C1465lz) this.b.S(g)).l, C1465lz.f196o[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof W8) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (AbstractC0720ac.p0(arrayList2) != null) {
            throw new ClassCastException();
        }
        return new C0252Jp(this.a, (W8) AbstractC0720ac.n0(arrayList), enumC0304Lp, i);
    }

    @Override // o.InterfaceC1375kb
    public final Collection b(C2245xo c2245xo) {
        AbstractC0048Bt.n(c2245xo, "packageFqName");
        return C1648ok.h;
    }

    @Override // o.InterfaceC1375kb
    public final boolean c(C2245xo c2245xo, C0827cE c0827cE) {
        AbstractC0048Bt.n(c2245xo, "packageFqName");
        AbstractC0048Bt.n(c0827cE, "name");
        String b = c0827cE.b();
        AbstractC0048Bt.m(b, "name.asString()");
        if (AbstractC0778bU.B(b, "Function", false) || AbstractC0778bU.B(b, "KFunction", false) || AbstractC0778bU.B(b, "SuspendFunction", false) || AbstractC0778bU.B(b, "KSuspendFunction", false)) {
            EnumC0304Lp.j.getClass();
            if (C0218Ih.t(b, c2245xo) != null) {
                return true;
            }
        }
        return false;
    }
}
