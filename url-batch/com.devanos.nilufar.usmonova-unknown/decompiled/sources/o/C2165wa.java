package o;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: o.wa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2165wa implements WB {
    public final String b;
    public final WB[] c;

    public C2165wa(String str, WB[] wbArr) {
        this.b = str;
        this.c = wbArr;
    }

    @Override // o.WB
    public final Collection a(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        WB[] wbArr = this.c;
        int length = wbArr.length;
        if (length == 0) {
            return C1318jk.h;
        }
        if (length == 1) {
            return wbArr[0].a(c0827cE, de);
        }
        Collection collection = null;
        for (WB wb : wbArr) {
            collection = ON.e(collection, wb.a(c0827cE, de));
        }
        return collection == null ? C1648ok.h : collection;
    }

    @Override // o.PN
    public final Collection b(C2106vh c2106vh, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        WB[] wbArr = this.c;
        int length = wbArr.length;
        if (length == 0) {
            return C1318jk.h;
        }
        if (length == 1) {
            return wbArr[0].b(c2106vh, interfaceC2114vp);
        }
        Collection collection = null;
        for (WB wb : wbArr) {
            collection = ON.e(collection, wb.b(c2106vh, interfaceC2114vp));
        }
        return collection == null ? C1648ok.h : collection;
    }

    @Override // o.WB
    public final Collection c(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        WB[] wbArr = this.c;
        int length = wbArr.length;
        if (length == 0) {
            return C1318jk.h;
        }
        if (length == 1) {
            return wbArr[0].c(c0827cE, de);
        }
        Collection collection = null;
        for (WB wb : wbArr) {
            collection = ON.e(collection, wb.c(c0827cE, de));
        }
        return collection == null ? C1648ok.h : collection;
    }

    @Override // o.WB
    public final Set d() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (WB wb : this.c) {
            AbstractC1048fc.f0(linkedHashSet, wb.d());
        }
        return linkedHashSet;
    }

    @Override // o.WB
    public final Set e() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (WB wb : this.c) {
            AbstractC1048fc.f0(linkedHashSet, wb.e());
        }
        return linkedHashSet;
    }

    @Override // o.WB
    public final Set f() {
        WB[] wbArr = this.c;
        AbstractC0048Bt.n(wbArr, "<this>");
        return AbstractC0022At.q(wbArr.length == 0 ? C1318jk.h : new S6(0, wbArr));
    }

    @Override // o.PN
    public final InterfaceC2364zb g(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        AbstractC0048Bt.n(de, "location");
        InterfaceC2364zb interfaceC2364zb = null;
        for (WB wb : this.c) {
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

    public final String toString() {
        return this.b;
    }
}
