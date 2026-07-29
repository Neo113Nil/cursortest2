package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: o.fi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1054fi extends XB {
    public static final /* synthetic */ InterfaceC0937dx[] f;
    public final C0321Mh b;
    public final C0923di c;
    public final SA d;
    public final RA e;

    static {
        VM vm = UM.a;
        f = new InterfaceC0937dx[]{vm.g(new UJ(vm.b(AbstractC1054fi.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), vm.g(new UJ(vm.b(AbstractC1054fi.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    }

    public AbstractC1054fi(C0321Mh c0321Mh, List list, List list2, List list3, InterfaceC1455lp interfaceC1455lp) {
        AbstractC0048Bt.n(c0321Mh, "c");
        AbstractC0048Bt.n(list, "functionList");
        AbstractC0048Bt.n(list2, "propertyList");
        AbstractC0048Bt.n(list3, "typeAliasList");
        this.b = c0321Mh;
        C0296Lh c0296Lh = c0321Mh.a;
        c0296Lh.c.getClass();
        this.c = new C0923di(this, list, list2, list3);
        VA va = c0296Lh.a;
        C0988ei c0988ei = new C0988ei(interfaceC1455lp, 0);
        va.getClass();
        this.d = new SA(va, c0988ei);
        C1139h0 c1139h0 = new C1139h0(7, this);
        va.getClass();
        this.e = new RA(va, c1139h0);
    }

    @Override // o.XB, o.WB
    public Collection a(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        C0923di c0923di = this.c;
        c0923di.getClass();
        AbstractC0048Bt.n(c0827cE, "name");
        return !((Set) AbstractC0772bO.o(c0923di.g, C0923di.j[0])).contains(c0827cE) ? C1318jk.h : (Collection) c0923di.d.invoke(c0827cE);
    }

    @Override // o.XB, o.WB
    public Collection c(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        C0923di c0923di = this.c;
        c0923di.getClass();
        AbstractC0048Bt.n(c0827cE, "name");
        return !((Set) AbstractC0772bO.o(c0923di.h, C0923di.j[1])).contains(c0827cE) ? C1318jk.h : (Collection) c0923di.e.invoke(c0827cE);
    }

    @Override // o.XB, o.WB
    public final Set d() {
        return (Set) AbstractC0772bO.o(this.c.g, C0923di.j[0]);
    }

    @Override // o.XB, o.WB
    public final Set e() {
        return (Set) AbstractC0772bO.o(this.c.h, C0923di.j[1]);
    }

    @Override // o.XB, o.WB
    public final Set f() {
        InterfaceC0937dx interfaceC0937dx = f[1];
        RA ra = this.e;
        AbstractC0048Bt.n(ra, "<this>");
        AbstractC0048Bt.n(interfaceC0937dx, "p");
        return (Set) ra.invoke();
    }

    @Override // o.XB, o.PN
    public InterfaceC2364zb g(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        AbstractC0048Bt.n(de, "location");
        if (q(c0827cE)) {
            return this.b.a.b(l(c0827cE));
        }
        C0923di c0923di = this.c;
        if (!c0923di.c.keySet().contains(c0827cE)) {
            return null;
        }
        c0923di.getClass();
        return (C1316ji) c0923di.f.invoke(c0827cE);
    }

    public abstract void h(ArrayList arrayList, InterfaceC2114vp interfaceC2114vp);

    public final List i(C2106vh c2106vh, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        ArrayList arrayList = new ArrayList(0);
        if (c2106vh.a(C2106vh.f)) {
            h(arrayList, interfaceC2114vp);
        }
        C0923di c0923di = this.c;
        c0923di.getClass();
        SA sa = c0923di.g;
        SA sa2 = c0923di.h;
        C0685a3 c0685a3 = C0685a3.f;
        boolean a = c2106vh.a(C2106vh.j);
        C1318jk c1318jk = C1318jk.h;
        if (a) {
            Set<C0827cE> set = (Set) AbstractC0772bO.o(sa2, C0923di.j[1]);
            ArrayList arrayList2 = new ArrayList();
            for (C0827cE c0827cE : set) {
                if (((Boolean) interfaceC2114vp.invoke(c0827cE)).booleanValue()) {
                    AbstractC0048Bt.n(c0827cE, "name");
                    arrayList2.addAll(!((Set) AbstractC0772bO.o(sa2, C0923di.j[1])).contains(c0827cE) ? c1318jk : (Collection) c0923di.e.invoke(c0827cE));
                }
            }
            AbstractC0982ec.e0(arrayList2, c0685a3);
            arrayList.addAll(arrayList2);
        }
        if (c2106vh.a(C2106vh.i)) {
            Set<C0827cE> set2 = (Set) AbstractC0772bO.o(sa, C0923di.j[0]);
            ArrayList arrayList3 = new ArrayList();
            for (C0827cE c0827cE2 : set2) {
                if (((Boolean) interfaceC2114vp.invoke(c0827cE2)).booleanValue()) {
                    AbstractC0048Bt.n(c0827cE2, "name");
                    arrayList3.addAll(!((Set) AbstractC0772bO.o(sa, C0923di.j[0])).contains(c0827cE2) ? c1318jk : (Collection) c0923di.d.invoke(c0827cE2));
                }
            }
            AbstractC0982ec.e0(arrayList3, c0685a3);
            arrayList.addAll(arrayList3);
        }
        if (c2106vh.a(C2106vh.l)) {
            for (C0827cE c0827cE3 : m()) {
                if (((Boolean) interfaceC2114vp.invoke(c0827cE3)).booleanValue()) {
                    AbstractC1052fg.e(arrayList, this.b.a.b(l(c0827cE3)));
                }
            }
        }
        if (c2106vh.a(C2106vh.g)) {
            for (C0827cE c0827cE4 : c0923di.c.keySet()) {
                if (((Boolean) interfaceC2114vp.invoke(c0827cE4)).booleanValue()) {
                    c0923di.getClass();
                    AbstractC0048Bt.n(c0827cE4, "name");
                    AbstractC1052fg.e(arrayList, (C1316ji) c0923di.f.invoke(c0827cE4));
                }
            }
        }
        return AbstractC1052fg.i(arrayList);
    }

    public void j(ArrayList arrayList, C0827cE c0827cE) {
        AbstractC0048Bt.n(c0827cE, "name");
    }

    public void k(ArrayList arrayList, C0827cE c0827cE) {
        AbstractC0048Bt.n(c0827cE, "name");
    }

    public abstract C1639ob l(C0827cE c0827cE);

    public final Set m() {
        return (Set) AbstractC0772bO.o(this.d, f[0]);
    }

    public abstract Set n();

    public abstract Set o();

    public abstract Set p();

    public boolean q(C0827cE c0827cE) {
        AbstractC0048Bt.n(c0827cE, "name");
        return m().contains(c0827cE);
    }

    public boolean r(C1251ii c1251ii) {
        return true;
    }
}
