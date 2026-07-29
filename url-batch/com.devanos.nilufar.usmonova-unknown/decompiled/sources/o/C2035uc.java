package o;

/* renamed from: o.uc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2035uc implements UC {
    public final UC a;
    public final UC b;

    public C2035uc(UC uc, UC uc2) {
        this.a = uc;
        this.b = uc2;
    }

    @Override // o.UC
    public final boolean a(InterfaceC2114vp interfaceC2114vp) {
        return this.a.a(interfaceC2114vp) && this.b.a(interfaceC2114vp);
    }

    @Override // o.UC
    public final Object b(Object obj, InterfaceC2312yp interfaceC2312yp) {
        return this.b.b(this.a.b(obj, interfaceC2312yp), interfaceC2312yp);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2035uc)) {
            return false;
        }
        C2035uc c2035uc = (C2035uc) obj;
        return AbstractC0048Bt.h(this.a, c2035uc.a) && AbstractC0048Bt.h(this.b, c2035uc.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return AbstractC2188wx.h(new StringBuilder("["), (String) b("", C1268j.k), ']');
    }
}
