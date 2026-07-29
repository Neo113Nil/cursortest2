package o;

/* renamed from: o.Xl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0611Xl extends TC implements InterfaceC2123vy {
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public float f130o;

    @Override // o.InterfaceC2123vy
    public final M5 d(AbstractC1415lB abstractC1415lB, IB ib, long j) {
        int f;
        int d;
        int c;
        int i;
        int i2 = (int) (3 & j);
        int i3 = (((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1);
        if ((((1 << (i3 + 13)) - 1) & ((int) (j >> 33))) == 0 || this.n == 1) {
            f = C0603Xd.f(j);
            d = C0603Xd.d(j);
        } else {
            f = AbstractC1807r8.q(Math.round(C0603Xd.d(j) * this.f130o), C0603Xd.f(j), C0603Xd.d(j));
            d = f;
        }
        if ((((int) (j >> (i3 + 46))) & ((1 << (18 - i3)) - 1)) == 0 || this.n == 2) {
            int e = C0603Xd.e(j);
            c = C0603Xd.c(j);
            i = e;
        } else {
            i = AbstractC1807r8.q(Math.round(C0603Xd.c(j) * this.f130o), C0603Xd.e(j), C0603Xd.c(j));
            c = i;
        }
        AbstractC0700aI a = ib.a(AbstractC0868ct.b(f, d, i, c));
        return abstractC1415lB.T(a.b, a.c, new C0585Wl(a, 0));
    }
}
