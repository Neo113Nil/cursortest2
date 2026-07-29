package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: o.gi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1120gi extends AbstractC1054fi {
    public final InterfaceC0961eH g;
    public final String h;
    public final C2245xo i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1120gi(InterfaceC0961eH interfaceC0961eH, C2281yK c2281yK, InterfaceC0893dE interfaceC0893dE, AbstractC1478m8 abstractC1478m8, C1659ov c1659ov, C0296Lh c0296Lh, String str, InterfaceC1455lp interfaceC1455lp) {
        super(r0, r2, r3, r4, interfaceC1455lp);
        C1097gL c1097gL;
        AbstractC0048Bt.n(c2281yK, "proto");
        AbstractC0048Bt.n(interfaceC0893dE, "nameResolver");
        AbstractC0048Bt.n(abstractC1478m8, "metadataVersion");
        AbstractC0048Bt.n(c0296Lh, "components");
        AbstractC0048Bt.n(str, "debugName");
        SK sk = c2281yK.n;
        AbstractC0048Bt.m(sk, "proto.typeTable");
        C0695aD c0695aD = new C0695aD(sk);
        ZK zk = c2281yK.f246o;
        AbstractC0048Bt.m(zk, "proto.versionRequirementTable");
        if (zk.i.size() == 0) {
            c1097gL = C1097gL.p;
        } else {
            AbstractC0048Bt.m(zk.i, "table.requirementList");
            c1097gL = new C1097gL(9);
        }
        C0321Mh a = c0296Lh.a(interfaceC0961eH, interfaceC0893dE, c0695aD, c1097gL, abstractC1478m8, c1659ov);
        List list = c2281yK.k;
        AbstractC0048Bt.m(list, "proto.functionList");
        List list2 = c2281yK.l;
        AbstractC0048Bt.m(list2, "proto.propertyList");
        List list3 = c2281yK.m;
        AbstractC0048Bt.m(list3, "proto.typeAliasList");
        this.g = interfaceC0961eH;
        this.h = str;
        this.i = ((AbstractC1027fH) interfaceC0961eH).l;
    }

    @Override // o.XB, o.PN
    public final Collection b(C2106vh c2106vh, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        List i = i(c2106vh, interfaceC2114vp);
        Iterable iterable = this.b.a.k;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC1048fc.f0(arrayList, ((InterfaceC1375kb) it.next()).b(this.i));
        }
        return AbstractC0720ac.A0(i, arrayList);
    }

    @Override // o.AbstractC1054fi, o.XB, o.PN
    public final InterfaceC2364zb g(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        AbstractC0048Bt.n(de, "location");
        AbstractC0773bP.g(this.b.a.i, de, this.g, c0827cE);
        return super.g(c0827cE, de);
    }

    @Override // o.AbstractC1054fi
    public final C1639ob l(C0827cE c0827cE) {
        AbstractC0048Bt.n(c0827cE, "name");
        return new C1639ob(this.i, c0827cE);
    }

    @Override // o.AbstractC1054fi
    public final Set n() {
        return C1648ok.h;
    }

    @Override // o.AbstractC1054fi
    public final Set o() {
        return C1648ok.h;
    }

    @Override // o.AbstractC1054fi
    public final Set p() {
        return C1648ok.h;
    }

    @Override // o.AbstractC1054fi
    public final boolean q(C0827cE c0827cE) {
        AbstractC0048Bt.n(c0827cE, "name");
        if (super.q(c0827cE)) {
            return true;
        }
        Iterable iterable = this.b.a.k;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((InterfaceC1375kb) it.next()).c(this.i, c0827cE)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.h;
    }

    @Override // o.AbstractC1054fi
    public final void h(ArrayList arrayList, InterfaceC2114vp interfaceC2114vp) {
    }
}
