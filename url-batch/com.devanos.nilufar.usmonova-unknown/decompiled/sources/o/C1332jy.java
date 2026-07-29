package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: o.jy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1332jy {
    public static final C1332jy a = new C1332jy();

    /* JADX WARN: Multi-variable type inference failed */
    public static JR b(JR jr) {
        AbstractC1004ey b;
        SW B0 = jr.B0();
        InterfaceC1437lX interfaceC1437lX = null;
        if (B0 instanceof C1506ma) {
            C1506ma c1506ma = (C1506ma) B0;
            AbstractC1701pX abstractC1701pX = c1506ma.a;
            if (abstractC1701pX.a() != 2) {
                abstractC1701pX = null;
            }
            AbstractC2097vY E0 = (abstractC1701pX == null || (b = abstractC1701pX.b()) == null) ? null : b.E0();
            if (c1506ma.b == null) {
                AbstractC1701pX abstractC1701pX2 = c1506ma.a;
                Collection d = c1506ma.d();
                ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(d));
                Iterator it = d.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC1004ey) it.next()).E0());
                }
                AbstractC0048Bt.n(abstractC1701pX2, "projection");
                c1506ma.b = new C2077vE(abstractC1701pX2, new C0425Qh(1, arrayList), interfaceC1437lX, 8);
            }
            C2077vE c2077vE = c1506ma.b;
            AbstractC0048Bt.k(c2077vE);
            return new C2011uE(1, c2077vE, E0, jr.A0(), jr.C0(), 32);
        }
        if (!(B0 instanceof C2382zt) || !jr.C0()) {
            return jr;
        }
        C2382zt c2382zt = (C2382zt) B0;
        LinkedHashSet linkedHashSet = c2382zt.b;
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(linkedHashSet));
        Iterator it2 = linkedHashSet.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            arrayList2.add(AbstractC0772bO.u((AbstractC1004ey) it2.next()));
            z = true;
        }
        if (z) {
            AbstractC1004ey abstractC1004ey = c2382zt.a;
            AbstractC2097vY u = abstractC1004ey != null ? AbstractC0772bO.u(abstractC1004ey) : null;
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            C2382zt c2382zt2 = new C2382zt(linkedHashSet2);
            c2382zt2.a = u;
            interfaceC1437lX = c2382zt2;
        }
        if (interfaceC1437lX != null) {
            c2382zt = interfaceC1437lX;
        }
        return c2382zt.e();
    }

    public final AbstractC2097vY a(InterfaceC1266iy interfaceC1266iy) {
        AbstractC2097vY m;
        AbstractC0048Bt.n(interfaceC1266iy, "type");
        if (!(interfaceC1266iy instanceof AbstractC1004ey)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        AbstractC2097vY E0 = ((AbstractC1004ey) interfaceC1266iy).E0();
        if (E0 instanceof JR) {
            m = b((JR) E0);
        } else {
            if (!(E0 instanceof AbstractC1782qm)) {
                throw new C0057Cc();
            }
            AbstractC1782qm abstractC1782qm = (AbstractC1782qm) E0;
            JR jr = abstractC1782qm.j;
            JR jr2 = abstractC1782qm.i;
            JR b = b(jr2);
            JR b2 = b(jr);
            m = (b == jr2 && b2 == jr) ? E0 : HO.m(b, b2);
        }
        U8 u8 = new U8(1, 4, this);
        AbstractC1004ey e = AbstractC1494mO.e(E0);
        return AbstractC1494mO.n(m, e != null ? (AbstractC1004ey) u8.invoke(e) : null);
    }
}
