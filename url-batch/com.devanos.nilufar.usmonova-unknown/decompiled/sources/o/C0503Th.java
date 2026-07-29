package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: o.Th, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0503Th extends AbstractC1054fi {
    public final C1398ky g;
    public final SA h;
    public final SA i;
    public final /* synthetic */ C0581Wh j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0503Th(C0581Wh c0581Wh, C1398ky c1398ky) {
        super(r2, r3, r4, r5, new C0425Qh(0, r1));
        AbstractC0048Bt.n(c1398ky, "kotlinTypeRefiner");
        this.j = c0581Wh;
        C0321Mh c0321Mh = c0581Wh.s;
        C1030fK c1030fK = c0581Wh.l;
        List list = c1030fK.x;
        AbstractC0048Bt.m(list, "classProto.functionList");
        List list2 = c1030fK.y;
        AbstractC0048Bt.m(list2, "classProto.propertyList");
        List list3 = c1030fK.z;
        AbstractC0048Bt.m(list3, "classProto.typeAliasList");
        List list4 = c1030fK.r;
        AbstractC0048Bt.m(list4, "classProto.nestedClassNameList");
        InterfaceC0893dE interfaceC0893dE = c0581Wh.s.b;
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(list4));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC1052fg.C(interfaceC0893dE, ((Number) it.next()).intValue()));
        }
        C0296Lh c0296Lh = c0321Mh.a;
        this.g = c1398ky;
        VA va = c0296Lh.a;
        C0451Rh c0451Rh = new C0451Rh(this, 0);
        va.getClass();
        this.h = new SA(va, c0451Rh);
        VA va2 = c0296Lh.a;
        C0451Rh c0451Rh2 = new C0451Rh(this, 1);
        va2.getClass();
        this.i = new SA(va2, c0451Rh2);
    }

    @Override // o.AbstractC1054fi, o.XB, o.WB
    public final Collection a(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        s(c0827cE, de);
        return super.a(c0827cE, de);
    }

    @Override // o.XB, o.PN
    public final Collection b(C2106vh c2106vh, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        return (Collection) this.h.invoke();
    }

    @Override // o.AbstractC1054fi, o.XB, o.WB
    public final Collection c(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        s(c0827cE, de);
        return super.c(c0827cE, de);
    }

    @Override // o.AbstractC1054fi, o.XB, o.PN
    public final InterfaceC2364zb g(C0827cE c0827cE, DE de) {
        InterfaceC1245ib interfaceC1245ib;
        AbstractC0048Bt.n(c0827cE, "name");
        AbstractC0048Bt.n(de, "location");
        s(c0827cE, de);
        C1334k c1334k = this.j.w;
        return (c1334k == null || (interfaceC1245ib = (InterfaceC1245ib) ((TA) c1334k.j).invoke(c0827cE)) == null) ? super.g(c0827cE, de) : interfaceC1245ib;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [o.jk] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // o.AbstractC1054fi
    public final void h(ArrayList arrayList, InterfaceC2114vp interfaceC2114vp) {
        ?? r1;
        C1334k c1334k = this.j.w;
        if (c1334k != null) {
            Set<C0827cE> keySet = ((LinkedHashMap) c1334k.i).keySet();
            r1 = new ArrayList();
            for (C0827cE c0827cE : keySet) {
                AbstractC0048Bt.n(c0827cE, "name");
                InterfaceC1245ib interfaceC1245ib = (InterfaceC1245ib) ((TA) c1334k.j).invoke(c0827cE);
                if (interfaceC1245ib != null) {
                    r1.add(interfaceC1245ib);
                }
            }
        } else {
            r1 = 0;
        }
        if (r1 == 0) {
            r1 = C1318jk.h;
        }
        arrayList.addAll(r1);
    }

    @Override // o.AbstractC1054fi
    public final void j(ArrayList arrayList, C0827cE c0827cE) {
        AbstractC0048Bt.n(c0827cE, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC1004ey) it.next()).r0().a(c0827cE, DE.j));
        }
        C0321Mh c0321Mh = this.b;
        arrayList.addAll(c0321Mh.a.n.c(c0827cE, this.j));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((AE) c0321Mh.a.q).d.h(c0827cE, arrayList2, arrayList3, this.j, new C0477Sh(arrayList, 0));
    }

    @Override // o.AbstractC1054fi
    public final void k(ArrayList arrayList, C0827cE c0827cE) {
        AbstractC0048Bt.n(c0827cE, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC1004ey) it.next()).r0().c(c0827cE, DE.j));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((AE) this.b.a.q).d.h(c0827cE, arrayList2, arrayList3, this.j, new C0477Sh(arrayList, 0));
    }

    @Override // o.AbstractC1054fi
    public final C1639ob l(C0827cE c0827cE) {
        AbstractC0048Bt.n(c0827cE, "name");
        return this.j.f125o.d(c0827cE);
    }

    @Override // o.AbstractC1054fi
    public final Set n() {
        List d = this.j.u.d();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            Set f = ((AbstractC1004ey) it.next()).r0().f();
            if (f == null) {
                return null;
            }
            AbstractC1048fc.f0(linkedHashSet, f);
        }
        return linkedHashSet;
    }

    @Override // o.AbstractC1054fi
    public final Set o() {
        C0581Wh c0581Wh = this.j;
        List d = c0581Wh.u.d();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            AbstractC1048fc.f0(linkedHashSet, ((AbstractC1004ey) it.next()).r0().d());
        }
        linkedHashSet.addAll(this.b.a.n.g(c0581Wh));
        return linkedHashSet;
    }

    @Override // o.AbstractC1054fi
    public final Set p() {
        List d = this.j.u.d();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            AbstractC1048fc.f0(linkedHashSet, ((AbstractC1004ey) it.next()).r0().e());
        }
        return linkedHashSet;
    }

    @Override // o.AbstractC1054fi
    public final boolean r(C1251ii c1251ii) {
        return this.b.a.f64o.a(this.j, c1251ii);
    }

    public final void s(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        AbstractC0048Bt.n(de, "location");
        AbstractC0048Bt.n(this.b.a.i, "<this>");
        AbstractC0048Bt.n(this.j, "scopeOwner");
    }
}
