package o;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: o.pv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1725pv implements WB {
    public static final /* synthetic */ InterfaceC0937dx[] f;
    public final C1216i8 b;
    public final C0546Uy c;
    public final C0743az d;
    public final SA e;

    static {
        VM vm = UM.a;
        f = new InterfaceC0937dx[]{vm.g(new UJ(vm.b(C1725pv.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    }

    public C1725pv(C1216i8 c1216i8, HM hm, C0546Uy c0546Uy) {
        this.b = c1216i8;
        this.c = c0546Uy;
        this.d = new C0743az(c1216i8, hm, c0546Uy);
        OT ot = ((C1198hu) c1216i8.i).a;
        C1139h0 c1139h0 = new C1139h0(18, this);
        VA va = (VA) ot;
        va.getClass();
        this.e = new SA(va, c1139h0);
    }

    @Override // o.WB
    public final Collection a(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        i(c0827cE, de);
        WB[] h = h();
        Collection a = this.d.a(c0827cE, de);
        for (WB wb : h) {
            a = ON.e(a, wb.a(c0827cE, de));
        }
        return a == null ? C1648ok.h : a;
    }

    @Override // o.PN
    public final Collection b(C2106vh c2106vh, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        WB[] h = h();
        Collection b = this.d.b(c2106vh, interfaceC2114vp);
        for (WB wb : h) {
            b = ON.e(b, wb.b(c2106vh, interfaceC2114vp));
        }
        return b == null ? C1648ok.h : b;
    }

    @Override // o.WB
    public final Collection c(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        i(c0827cE, de);
        WB[] h = h();
        this.d.getClass();
        Collection collection = C1318jk.h;
        for (WB wb : h) {
            collection = ON.e(collection, wb.c(c0827cE, de));
        }
        return collection == null ? C1648ok.h : collection;
    }

    @Override // o.WB
    public final Set d() {
        WB[] h = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (WB wb : h) {
            AbstractC1048fc.f0(linkedHashSet, wb.d());
        }
        linkedHashSet.addAll(this.d.d());
        return linkedHashSet;
    }

    @Override // o.WB
    public final Set e() {
        WB[] h = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (WB wb : h) {
            AbstractC1048fc.f0(linkedHashSet, wb.e());
        }
        linkedHashSet.addAll(this.d.e());
        return linkedHashSet;
    }

    @Override // o.WB
    public final Set f() {
        WB[] h = h();
        AbstractC0048Bt.n(h, "<this>");
        HashSet q = AbstractC0022At.q(h.length == 0 ? C1318jk.h : new S6(0, h));
        if (q == null) {
            return null;
        }
        q.addAll(this.d.f());
        return q;
    }

    @Override // o.PN
    public final InterfaceC2364zb g(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        AbstractC0048Bt.n(de, "location");
        i(c0827cE, de);
        C0743az c0743az = this.d;
        c0743az.getClass();
        InterfaceC2364zb interfaceC2364zb = null;
        InterfaceC1245ib v = c0743az.v(c0827cE, null);
        if (v != null) {
            return v;
        }
        for (WB wb : h()) {
            InterfaceC2364zb g = wb.g(c0827cE, de);
            if (g != null) {
                if (!(g instanceof InterfaceC0004Ab) || !((InterfaceC0004Ab) g).X()) {
                    return g;
                }
                if (interfaceC2364zb == null) {
                    interfaceC2364zb = g;
                }
            }
        }
        return interfaceC2364zb;
    }

    public final WB[] h() {
        return (WB[]) AbstractC0772bO.o(this.e, f[0]);
    }

    public final void i(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        AbstractC0048Bt.n(de, "location");
        AbstractC0773bP.g(((C1198hu) this.b.i).n, de, this.c, c0827cE);
    }

    public final String toString() {
        return "scope for " + this.c;
    }
}
