package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: o.Yl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0637Yl implements InterfaceC1738q4 {
    public final InterfaceC1738q4 h;
    public final C2311yo i;

    public C0637Yl(InterfaceC1738q4 interfaceC1738q4, C2311yo c2311yo) {
        this.h = interfaceC1738q4;
        this.i = c2311yo;
    }

    @Override // o.InterfaceC1738q4
    public final InterfaceC0948e4 c(C2245xo c2245xo) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        if (((Boolean) this.i.invoke(c2245xo)).booleanValue()) {
            return this.h.c(c2245xo);
        }
        return null;
    }

    @Override // o.InterfaceC1738q4
    public final boolean i(C2245xo c2245xo) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        if (((Boolean) this.i.invoke(c2245xo)).booleanValue()) {
            return this.h.i(c2245xo);
        }
        return false;
    }

    @Override // o.InterfaceC1738q4
    public final boolean isEmpty() {
        InterfaceC1738q4 interfaceC1738q4 = this.h;
        if ((interfaceC1738q4 instanceof Collection) && ((Collection) interfaceC1738q4).isEmpty()) {
            return false;
        }
        Iterator it = interfaceC1738q4.iterator();
        while (it.hasNext()) {
            C2245xo e = ((InterfaceC0948e4) it.next()).e();
            if (e != null && ((Boolean) this.i.invoke(e)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.h) {
            C2245xo e = ((InterfaceC0948e4) obj).e();
            if (e != null && ((Boolean) this.i.invoke(e)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }
}
