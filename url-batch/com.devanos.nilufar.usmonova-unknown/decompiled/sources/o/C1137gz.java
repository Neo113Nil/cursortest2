package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: o.gz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1137gz extends AbstractC1203hz {
    public static final /* synthetic */ int p = 0;
    public final C2217xM n;

    /* renamed from: o, reason: collision with root package name */
    public final C0390Oy f171o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1137gz(C1216i8 c1216i8, C2217xM c2217xM, C0390Oy c0390Oy) {
        super(c1216i8, null);
        AbstractC0048Bt.n(c2217xM, "jClass");
        this.n = c2217xM;
        this.f171o = c0390Oy;
    }

    public static PJ v(PJ pj) {
        if (pj.M() != 2) {
            return pj;
        }
        Collection o2 = pj.o();
        AbstractC0048Bt.m(o2, "this.overriddenDescriptors");
        Collection<PJ> collection = o2;
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(collection));
        for (PJ pj2 : collection) {
            AbstractC0048Bt.m(pj2, "it");
            arrayList.add(v(pj2));
        }
        return (PJ) AbstractC0720ac.D0(AbstractC0720ac.J0(AbstractC0720ac.L0(arrayList)));
    }

    @Override // o.XB, o.PN
    public final InterfaceC2364zb g(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        AbstractC0048Bt.n(de, "location");
        return null;
    }

    @Override // o.AbstractC1005ez
    public final Set h(C2106vh c2106vh, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        return C1648ok.h;
    }

    @Override // o.AbstractC1005ez
    public final Set i(C2106vh c2106vh, C2316yt c2316yt) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        Set L0 = AbstractC0720ac.L0(((InterfaceC1578ng) this.e.invoke()).a());
        C0390Oy c0390Oy = this.f171o;
        C1137gz g = AbstractC1494mO.g(c0390Oy);
        Set d = g != null ? g.d() : null;
        if (d == null) {
            d = C1648ok.h;
        }
        L0.addAll(d);
        if (this.n.a.isEnum()) {
            L0.addAll(AbstractC0868ct.K(AbstractC1499mT.c, AbstractC1499mT.a));
        }
        C1216i8 c1216i8 = this.b;
        ((C1097gL) ((C1198hu) c1216i8.i).x).getClass();
        AbstractC0048Bt.n(c1216i8, "_context_receiver_0");
        AbstractC0048Bt.n(c0390Oy, "thisDescriptor");
        L0.addAll(new ArrayList());
        return L0;
    }

    @Override // o.AbstractC1005ez
    public final void j(ArrayList arrayList, C0827cE c0827cE) {
        AbstractC0048Bt.n(c0827cE, "name");
        C1216i8 c1216i8 = this.b;
        ((C1097gL) ((C1198hu) c1216i8.i).x).getClass();
        AbstractC0048Bt.n(c1216i8, "_context_receiver_0");
        AbstractC0048Bt.n(this.f171o, "thisDescriptor");
        AbstractC0048Bt.n(c0827cE, "name");
    }

    @Override // o.AbstractC1005ez
    public final InterfaceC1578ng k() {
        return new C1179hb(this.n, C2316yt.r);
    }

    @Override // o.AbstractC1005ez
    public final void m(LinkedHashSet linkedHashSet, C0827cE c0827cE) {
        AbstractC0048Bt.n(c0827cE, "name");
        C0390Oy c0390Oy = this.f171o;
        C1137gz g = AbstractC1494mO.g(c0390Oy);
        Collection M0 = g == null ? C1648ok.h : AbstractC0720ac.M0(g.a(c0827cE, DE.l));
        C1198hu c1198hu = (C1198hu) this.b.i;
        linkedHashSet.addAll(AbstractC1052fg.O(c0827cE, M0, linkedHashSet, this.f171o, c1198hu.f, ((AE) c1198hu.u).d));
        if (this.n.a.isEnum()) {
            if (c0827cE.equals(AbstractC1499mT.c)) {
                linkedHashSet.add(AbstractC1807r8.y(c0390Oy));
            } else if (c0827cE.equals(AbstractC1499mT.a)) {
                linkedHashSet.add(AbstractC1807r8.z(c0390Oy));
            }
        }
    }

    @Override // o.AbstractC1203hz, o.AbstractC1005ez
    public final void n(ArrayList arrayList, C0827cE c0827cE) {
        AbstractC0048Bt.n(c0827cE, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C0646Yu c0646Yu = new C0646Yu(c0827cE, 1);
        C0390Oy c0390Oy = this.f171o;
        AbstractC0022At.l(AbstractC0868ct.J(c0390Oy), C0460Rq.L, new C1071fz(c0390Oy, linkedHashSet, c0646Yu));
        boolean isEmpty = arrayList.isEmpty();
        C1216i8 c1216i8 = this.b;
        if (isEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                PJ v = v((PJ) obj);
                Object obj2 = linkedHashMap.get(v);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(v, obj2);
                }
                ((List) obj2).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                C1198hu c1198hu = (C1198hu) c1216i8.i;
                AbstractC1048fc.f0(arrayList2, AbstractC1052fg.O(c0827cE, collection, arrayList, this.f171o, c1198hu.f, ((AE) c1198hu.u).d));
            }
            arrayList.addAll(arrayList2);
        } else {
            C1198hu c1198hu2 = (C1198hu) c1216i8.i;
            arrayList.addAll(AbstractC1052fg.O(c0827cE, linkedHashSet, arrayList, this.f171o, c1198hu2.f, ((AE) c1198hu2.u).d));
        }
        if (this.n.a.isEnum() && c0827cE.equals(AbstractC1499mT.b)) {
            AbstractC1052fg.e(arrayList, AbstractC1807r8.x(c0390Oy));
        }
    }

    @Override // o.AbstractC1005ez
    public final Set o(C2106vh c2106vh) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        Set L0 = AbstractC0720ac.L0(((InterfaceC1578ng) this.e.invoke()).e());
        C2316yt c2316yt = C2316yt.s;
        C0390Oy c0390Oy = this.f171o;
        AbstractC0022At.l(AbstractC0868ct.J(c0390Oy), C0460Rq.L, new C1071fz(c0390Oy, L0, c2316yt));
        if (this.n.a.isEnum()) {
            L0.add(AbstractC1499mT.b);
        }
        return L0;
    }

    @Override // o.AbstractC1005ez
    public final InterfaceC1118gg q() {
        return this.f171o;
    }
}
