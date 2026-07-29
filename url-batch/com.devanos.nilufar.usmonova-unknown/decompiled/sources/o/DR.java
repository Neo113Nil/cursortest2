package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class DR {
    public final W3 a;
    public final boolean b;
    public final C1216i8 c;
    public final EnumC1212i4 d;
    public final boolean e;

    public DR(W3 w3, boolean z, C1216i8 c1216i8, EnumC1212i4 enumC1212i4, boolean z2) {
        AbstractC0048Bt.n(c1216i8, "containerContext");
        this.a = w3;
        this.b = z;
        this.c = c1216i8;
        this.d = enumC1212i4;
        this.e = z2;
    }

    public static void a(Object obj, ArrayList arrayList, C1400l c1400l) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) c1400l.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next(), arrayList, c1400l);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C2144wF b(InterfaceC1437lX interfaceC1437lX) {
        ArrayList arrayList;
        EnumC2078vF enumC2078vF;
        AbstractC0048Bt.n(interfaceC1437lX, "<this>");
        if (!(interfaceC1437lX instanceof C1267iz)) {
            return null;
        }
        List<InterfaceC1266iy> upperBounds = interfaceC1437lX.getUpperBounds();
        AbstractC0048Bt.m(upperBounds, "this.upperBounds");
        if (upperBounds.isEmpty()) {
            return null;
        }
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            if (!PX.h0((InterfaceC1266iy) it.next())) {
                if (!upperBounds.isEmpty()) {
                    Iterator it2 = upperBounds.iterator();
                    while (it2.hasNext()) {
                        if (d((InterfaceC1266iy) it2.next()) != null) {
                            arrayList = upperBounds;
                            break;
                        }
                    }
                }
                if (upperBounds.isEmpty()) {
                    return null;
                }
                for (InterfaceC1266iy interfaceC1266iy : upperBounds) {
                    AbstractC0048Bt.n(interfaceC1266iy, "<this>");
                    if (AbstractC1494mO.e((AbstractC1004ey) interfaceC1266iy) != null) {
                        arrayList = new ArrayList();
                        for (InterfaceC1266iy interfaceC1266iy2 : upperBounds) {
                            AbstractC0048Bt.n(interfaceC1266iy2, "<this>");
                            AbstractC1004ey e = AbstractC1494mO.e((AbstractC1004ey) interfaceC1266iy2);
                            if (e != null) {
                                arrayList.add(e);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                if (!PX.n0((InterfaceC1266iy) it3.next())) {
                                    enumC2078vF = EnumC2078vF.j;
                                    break;
                                }
                            }
                        }
                        enumC2078vF = EnumC2078vF.i;
                        return new C2144wF(enumC2078vF, arrayList != upperBounds);
                    }
                }
                return null;
            }
        }
        return null;
    }

    public static C2377zo c(JR jr) {
        C0195Hk c0195Hk = AbstractC2228xX.a;
        InterfaceC2364zb c = jr.B0().c();
        InterfaceC1245ib interfaceC1245ib = c instanceof InterfaceC1245ib ? (InterfaceC1245ib) c : null;
        if (interfaceC1245ib != null) {
            return AbstractC0114Eh.g(interfaceC1245ib);
        }
        return null;
    }

    public static EnumC2078vF d(InterfaceC1266iy interfaceC1266iy) {
        JR q;
        JR q2;
        AbstractC0048Bt.n(interfaceC1266iy, "<this>");
        AbstractC1782qm p = PX.p(interfaceC1266iy);
        if (p == null || (q = PX.v0(p)) == null) {
            q = PX.q(interfaceC1266iy);
            AbstractC0048Bt.k(q);
        }
        if (PX.l0(q)) {
            return EnumC2078vF.i;
        }
        AbstractC1782qm p2 = PX.p(interfaceC1266iy);
        if (p2 == null || (q2 = PX.S0(p2)) == null) {
            q2 = PX.q(interfaceC1266iy);
            AbstractC0048Bt.k(q2);
        }
        if (PX.l0(q2)) {
            return null;
        }
        return EnumC2078vF.j;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, o.Iy] */
    public final ArrayList e(InterfaceC1266iy interfaceC1266iy) {
        C1216i8 c1216i8 = this.c;
        C1987tu c1987tu = (C1987tu) c1216i8.l.getValue();
        C1408l4 c1408l4 = ((C1198hu) c1216i8.i).q;
        AbstractC0048Bt.n(interfaceC1266iy, "<this>");
        C0745b0 c0745b0 = new C0745b0(interfaceC1266iy, c1408l4.b(c1987tu, ((AbstractC1004ey) interfaceC1266iy).getAnnotations()), null);
        C1400l c1400l = new C1400l(2, this);
        ArrayList arrayList = new ArrayList(1);
        a(c0745b0, arrayList, c1400l);
        return arrayList;
    }
}
