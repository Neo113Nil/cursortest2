package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: o.az, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0743az extends AbstractC1203hz {
    public final HM n;

    /* renamed from: o, reason: collision with root package name */
    public final C0546Uy f140o;
    public final RA p;
    public final TA q;

    public C0743az(C1216i8 c1216i8, HM hm, C0546Uy c0546Uy) {
        super(c1216i8, null);
        this.n = hm;
        this.f140o = c0546Uy;
        OT ot = ((C1198hu) c1216i8.i).a;
        K2 k2 = new K2(c1216i8, 16, this);
        VA va = (VA) ot;
        va.getClass();
        this.p = new RA(va, k2);
        this.q = ((VA) ot).c(new C0810c0(this, 13, c1216i8));
    }

    @Override // o.AbstractC1005ez, o.XB, o.PN
    public final Collection b(C2106vh c2106vh, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        if (!c2106vh.a(C2106vh.l | C2106vh.e)) {
            return C1318jk.h;
        }
        Iterable iterable = (Iterable) this.d.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            InterfaceC1118gg interfaceC1118gg = (InterfaceC1118gg) obj;
            if (interfaceC1118gg instanceof InterfaceC1245ib) {
                C0827cE name = ((InterfaceC1245ib) interfaceC1118gg).getName();
                AbstractC0048Bt.m(name, "it.name");
                if (((Boolean) interfaceC2114vp.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // o.AbstractC1005ez, o.XB, o.WB
    public final Collection c(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        return C1318jk.h;
    }

    @Override // o.XB, o.PN
    public final InterfaceC2364zb g(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        AbstractC0048Bt.n(de, "location");
        return v(c0827cE, null);
    }

    @Override // o.AbstractC1005ez
    public final Set h(C2106vh c2106vh, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        if (!c2106vh.a(C2106vh.e)) {
            return C1648ok.h;
        }
        Set set = (Set) this.p.invoke();
        if (set == null) {
            this.n.getClass();
            return new LinkedHashSet();
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(C0827cE.e((String) it.next()));
        }
        return hashSet;
    }

    @Override // o.AbstractC1005ez
    public final Set i(C2106vh c2106vh, C2316yt c2316yt) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        return C1648ok.h;
    }

    @Override // o.AbstractC1005ez
    public final InterfaceC1578ng k() {
        return C1512mg.a;
    }

    @Override // o.AbstractC1005ez
    public final void m(LinkedHashSet linkedHashSet, C0827cE c0827cE) {
        AbstractC0048Bt.n(c0827cE, "name");
    }

    @Override // o.AbstractC1005ez
    public final Set o(C2106vh c2106vh) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        return C1648ok.h;
    }

    @Override // o.AbstractC1005ez
    public final InterfaceC1118gg q() {
        return this.f140o;
    }

    public final InterfaceC1245ib v(C0827cE c0827cE, C2217xM c2217xM) {
        C0827cE c0827cE2 = YS.a;
        AbstractC0048Bt.n(c0827cE, "name");
        String b = c0827cE.b();
        AbstractC0048Bt.m(b, "name.asString()");
        if (b.length() <= 0 || c0827cE.i) {
            return null;
        }
        Set set = (Set) this.p.invoke();
        if (c2217xM == null && set != null && !set.contains(c0827cE.b())) {
            return null;
        }
        return (InterfaceC1245ib) this.q.invoke(new C0598Wy(c0827cE, c2217xM));
    }
}
