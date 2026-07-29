package o;

/* renamed from: o.Cs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0073Cs implements U3 {
    public final InterfaceC2042uj h;
    public final long i;

    public C0073Cs(InterfaceC2042uj interfaceC2042uj, long j) {
        this.h = interfaceC2042uj;
        this.i = j;
    }

    @Override // o.U3
    public final YY a(C0208Hx c0208Hx) {
        return new C0717aZ(this.h.a(c0208Hx), this.i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0073Cs)) {
            return false;
        }
        C0073Cs c0073Cs = (C0073Cs) obj;
        return c0073Cs.h.equals(this.h) && c0073Cs.i == this.i;
    }

    public final int hashCode() {
        return Long.hashCode(this.i) + ((AbstractC1888sN.v(1) + (this.h.hashCode() * 31)) * 31);
    }
}
