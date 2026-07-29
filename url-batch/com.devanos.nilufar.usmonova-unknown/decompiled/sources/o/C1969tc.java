package o;

import java.io.Serializable;

/* renamed from: o.tc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1969tc implements InterfaceC0189He, Serializable {
    public final InterfaceC0189He h;
    public final InterfaceC0137Fe i;

    public C1969tc(InterfaceC0137Fe interfaceC0137Fe, InterfaceC0189He interfaceC0189He) {
        AbstractC0048Bt.n(interfaceC0189He, "left");
        AbstractC0048Bt.n(interfaceC0137Fe, "element");
        this.h = interfaceC0189He;
        this.i = interfaceC0137Fe;
    }

    @Override // o.InterfaceC0189He
    public final InterfaceC0189He D(InterfaceC0189He interfaceC0189He) {
        AbstractC0048Bt.n(interfaceC0189He, "context");
        return interfaceC0189He == C1188hk.h ? this : (InterfaceC0189He) interfaceC0189He.I(this, new C1903sc(1));
    }

    @Override // o.InterfaceC0189He
    public final Object I(Object obj, InterfaceC2312yp interfaceC2312yp) {
        return interfaceC2312yp.invoke(this.h.I(obj, interfaceC2312yp), this.i);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1969tc) {
            C1969tc c1969tc = (C1969tc) obj;
            c1969tc.getClass();
            int i = 2;
            C1969tc c1969tc2 = c1969tc;
            int i2 = 2;
            while (true) {
                InterfaceC0189He interfaceC0189He = c1969tc2.h;
                c1969tc2 = interfaceC0189He instanceof C1969tc ? (C1969tc) interfaceC0189He : null;
                if (c1969tc2 == null) {
                    break;
                }
                i2++;
            }
            C1969tc c1969tc3 = this;
            while (true) {
                InterfaceC0189He interfaceC0189He2 = c1969tc3.h;
                c1969tc3 = interfaceC0189He2 instanceof C1969tc ? (C1969tc) interfaceC0189He2 : null;
                if (c1969tc3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                C1969tc c1969tc4 = this;
                while (true) {
                    InterfaceC0137Fe interfaceC0137Fe = c1969tc4.i;
                    if (!AbstractC0048Bt.h(c1969tc.k(interfaceC0137Fe.getKey()), interfaceC0137Fe)) {
                        z = false;
                        break;
                    }
                    InterfaceC0189He interfaceC0189He3 = c1969tc4.h;
                    if (!(interfaceC0189He3 instanceof C1969tc)) {
                        AbstractC0048Bt.l(interfaceC0189He3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        InterfaceC0137Fe interfaceC0137Fe2 = (InterfaceC0137Fe) interfaceC0189He3;
                        z = AbstractC0048Bt.h(c1969tc.k(interfaceC0137Fe2.getKey()), interfaceC0137Fe2);
                        break;
                    }
                    c1969tc4 = (C1969tc) interfaceC0189He3;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode() + this.h.hashCode();
    }

    @Override // o.InterfaceC0189He
    public final InterfaceC0189He j(InterfaceC0163Ge interfaceC0163Ge) {
        AbstractC0048Bt.n(interfaceC0163Ge, "key");
        InterfaceC0137Fe interfaceC0137Fe = this.i;
        InterfaceC0137Fe k = interfaceC0137Fe.k(interfaceC0163Ge);
        InterfaceC0189He interfaceC0189He = this.h;
        if (k != null) {
            return interfaceC0189He;
        }
        InterfaceC0189He j = interfaceC0189He.j(interfaceC0163Ge);
        return j == interfaceC0189He ? this : j == C1188hk.h ? interfaceC0137Fe : new C1969tc(interfaceC0137Fe, j);
    }

    @Override // o.InterfaceC0189He
    public final InterfaceC0137Fe k(InterfaceC0163Ge interfaceC0163Ge) {
        AbstractC0048Bt.n(interfaceC0163Ge, "key");
        C1969tc c1969tc = this;
        while (true) {
            InterfaceC0137Fe k = c1969tc.i.k(interfaceC0163Ge);
            if (k != null) {
                return k;
            }
            InterfaceC0189He interfaceC0189He = c1969tc.h;
            if (!(interfaceC0189He instanceof C1969tc)) {
                return interfaceC0189He.k(interfaceC0163Ge);
            }
            c1969tc = (C1969tc) interfaceC0189He;
        }
    }

    public final String toString() {
        return AbstractC2188wx.h(new StringBuilder("["), (String) I("", new C1903sc(0)), ']');
    }
}
