package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.Rp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0459Rp extends HR {
    public C0459Rp(InterfaceC1118gg interfaceC1118gg, C0459Rp c0459Rp, int i, boolean z) {
        super(interfaceC1118gg, c0459Rp, C0460Rq.t, MG.g, i, IS.e);
        this.t = true;
        this.B = z;
        this.C = false;
    }

    @Override // o.HR, o.AbstractC0433Qp
    public final AbstractC0433Qp J0(int i, InterfaceC1738q4 interfaceC1738q4, InterfaceC1118gg interfaceC1118gg, InterfaceC0381Op interfaceC0381Op, C0827cE c0827cE, IS is) {
        AbstractC0048Bt.n(interfaceC1118gg, "newOwner");
        AbstractC1888sN.p(i, "kind");
        AbstractC0048Bt.n(interfaceC1738q4, "annotations");
        return new C0459Rp(interfaceC1118gg, (C0459Rp) interfaceC0381Op, i, this.B);
    }

    @Override // o.AbstractC0433Qp
    public final AbstractC0433Qp K0(C0407Pp c0407Pp) {
        C0827cE c0827cE;
        C0459Rp c0459Rp = (C0459Rp) super.K0(c0407Pp);
        if (c0459Rp == null) {
            return null;
        }
        List t0 = c0459Rp.t0();
        AbstractC0048Bt.m(t0, "substituted.valueParameters");
        if (t0.isEmpty()) {
            return c0459Rp;
        }
        Iterator it = t0.iterator();
        while (it.hasNext()) {
            AbstractC1004ey c = ((RY) it.next()).c();
            AbstractC0048Bt.m(c, "it.type");
            if (AbstractC0946e20.r(c) != null) {
                List t02 = c0459Rp.t0();
                AbstractC0048Bt.m(t02, "substituted.valueParameters");
                ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(t02));
                Iterator it2 = t02.iterator();
                while (it2.hasNext()) {
                    AbstractC1004ey c2 = ((RY) it2.next()).c();
                    AbstractC0048Bt.m(c2, "it.type");
                    arrayList.add(AbstractC0946e20.r(c2));
                }
                int size = c0459Rp.t0().size() - arrayList.size();
                boolean z = true;
                if (size == 0) {
                    List t03 = c0459Rp.t0();
                    AbstractC0048Bt.m(t03, "valueParameters");
                    ArrayList O0 = AbstractC0720ac.O0(arrayList, t03);
                    if (O0.isEmpty()) {
                        return c0459Rp;
                    }
                    Iterator it3 = O0.iterator();
                    while (it3.hasNext()) {
                        C1619oH c1619oH = (C1619oH) it3.next();
                        if (!AbstractC0048Bt.h((C0827cE) c1619oH.h, ((RY) c1619oH.i).getName())) {
                        }
                    }
                    return c0459Rp;
                }
                List<RY> t04 = c0459Rp.t0();
                AbstractC0048Bt.m(t04, "valueParameters");
                ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(t04));
                for (RY ry : t04) {
                    C0827cE name = ry.getName();
                    AbstractC0048Bt.m(name, "it.name");
                    int i = ry.m;
                    int i2 = i - size;
                    if (i2 >= 0 && (c0827cE = (C0827cE) arrayList.get(i2)) != null) {
                        name = c0827cE;
                    }
                    arrayList2.add(ry.H0(c0459Rp, name, i));
                }
                C0407Pp N0 = c0459Rp.N0(C2096vX.b);
                if (!arrayList.isEmpty()) {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        if (((C0827cE) it4.next()) == null) {
                            break;
                        }
                    }
                }
                z = false;
                N0.C = Boolean.valueOf(z);
                N0.n = arrayList2;
                N0.l = c0459Rp.a();
                AbstractC0433Qp K0 = super.K0(N0);
                AbstractC0048Bt.k(K0);
                return K0;
            }
        }
        return c0459Rp;
    }

    @Override // o.AbstractC0433Qp, o.InterfaceC0381Op
    public final boolean e0() {
        return false;
    }

    @Override // o.AbstractC0433Qp, o.InterfaceC0381Op
    public final boolean m() {
        return false;
    }

    @Override // o.AbstractC0433Qp, o.OB
    public final boolean w() {
        return false;
    }
}
