package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: o.gH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1093gH implements InterfaceC1159hH {
    public final ArrayList a;

    public C1093gH(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // o.InterfaceC1159hH
    public final boolean a(C2245xo c2245xo) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (AbstractC0048Bt.h(((AbstractC1027fH) ((InterfaceC0961eH) it.next())).l, c2245xo)) {
                return false;
            }
        }
        return true;
    }

    @Override // o.InterfaceC1159hH
    public final void b(C2245xo c2245xo, ArrayList arrayList) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        for (Object obj : this.a) {
            if (AbstractC0048Bt.h(((AbstractC1027fH) ((InterfaceC0961eH) obj)).l, c2245xo)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // o.InterfaceC1159hH
    public final Collection f(C2245xo c2245xo, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        return PQ.B(new C0730am(PQ.z(AbstractC0720ac.i0(this.a), C2316yt.K), true, new C1641od(c2245xo, 1)));
    }
}
