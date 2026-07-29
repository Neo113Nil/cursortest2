package o;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: o.kW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1370kW implements InterfaceC0597Wx, InterfaceC2374zl {
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;

    @Override // o.InterfaceC1557nL
    public Object get() {
        return new AY((Context) ((InterfaceC1557nL) this.h).get(), (JC) ((InterfaceC1557nL) this.i).get(), (InterfaceC0480Sk) ((InterfaceC1557nL) this.j).get(), (C0153Fu) ((C0950e6) this.k).get(), (Executor) ((InterfaceC1557nL) this.l).get(), (AU) ((InterfaceC1557nL) this.m).get(), new CU(), new GU(4), (InterfaceC0082Db) ((InterfaceC1557nL) this.n).get());
    }

    @Override // o.InterfaceC0597Wx
    public void h() {
        C1343k5 c1343k5 = (C1343k5) this.j;
        C1639ob c1639ob = (C1639ob) this.l;
        HashMap hashMap = (HashMap) this.i;
        AbstractC0048Bt.n(hashMap, "arguments");
        boolean z = false;
        if (c1639ob.equals(XS.b)) {
            Object obj = hashMap.get(C0827cE.e("value"));
            C1002ew c1002ew = obj instanceof C1002ew ? (C1002ew) obj : null;
            if (c1002ew != null) {
                Object obj2 = c1002ew.a;
                C0871cw c0871cw = obj2 instanceof C0871cw ? (C0871cw) obj2 : null;
                if (c0871cw != null) {
                    z = c1343k5.u(c0871cw.a.a);
                }
            }
        }
        if (z || c1343k5.u(c1639ob)) {
            return;
        }
        ((List) this.m).add(new C1014f4(((InterfaceC1245ib) this.k).i(), hashMap, (IS) this.n));
    }

    @Override // o.InterfaceC0597Wx
    public InterfaceC0623Xx j(C0827cE c0827cE) {
        return new C1334k((C1343k5) this.h, c0827cE, this);
    }

    @Override // o.InterfaceC0597Wx
    public void k(C0827cE c0827cE, C1705pb c1705pb) {
        ((HashMap) this.i).put(c0827cE, new C1002ew(new C0871cw(c1705pb)));
    }

    @Override // o.InterfaceC0597Wx
    public void l(C0827cE c0827cE, C1639ob c1639ob, C0827cE c0827cE2) {
        ((HashMap) this.i).put(c0827cE, new C2175wk(c1639ob, c0827cE2));
    }

    @Override // o.InterfaceC0597Wx
    public void m(C0827cE c0827cE, Object obj) {
        ((HashMap) this.i).put(c0827cE, C1343k5.a((C1343k5) this.h, c0827cE, obj));
    }

    @Override // o.InterfaceC0597Wx
    public InterfaceC0597Wx n(C1639ob c1639ob, C0827cE c0827cE) {
        ArrayList arrayList = new ArrayList();
        return new C1216i8(((C1343k5) this.h).v(c1639ob, IS.e, arrayList), this, c0827cE, arrayList);
    }
}
