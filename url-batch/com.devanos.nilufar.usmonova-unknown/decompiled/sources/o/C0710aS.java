package o;

/* renamed from: o.aS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0710aS extends TC implements InterfaceC2123vy {
    public float n;

    /* renamed from: o, reason: collision with root package name */
    public float f139o;
    public float p;
    public float q;
    public boolean r;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r5 != Integer.MAX_VALUE) goto L24;
     */
    @Override // o.InterfaceC2123vy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final M5 d(AbstractC1415lB abstractC1415lB, IB ib, long j) {
        int i;
        int i2;
        int i3;
        int f;
        int d;
        int e;
        int c;
        long b;
        int i4 = 0;
        if (AbstractC0556Vi.a(this.p, Float.NaN)) {
            i = Integer.MAX_VALUE;
        } else {
            i = abstractC1415lB.p(this.p);
            if (i < 0) {
                i = 0;
            }
        }
        if (AbstractC0556Vi.a(this.q, Float.NaN)) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = abstractC1415lB.p(this.q);
            if (i2 < 0) {
                i2 = 0;
            }
        }
        if (!AbstractC0556Vi.a(this.n, Float.NaN)) {
            i3 = abstractC1415lB.p(this.n);
            if (i3 > i) {
                i3 = i;
            }
            if (i3 < 0) {
                i3 = 0;
            }
        }
        i3 = 0;
        if (!AbstractC0556Vi.a(this.f139o, Float.NaN)) {
            int p = abstractC1415lB.p(this.f139o);
            if (p > i2) {
                p = i2;
            }
            if (p < 0) {
                p = 0;
            }
            if (p != Integer.MAX_VALUE) {
                i4 = p;
            }
        }
        long b2 = AbstractC0868ct.b(i3, i, i4, i2);
        if (this.r) {
            b = AbstractC0868ct.b(AbstractC1807r8.q(C0603Xd.f(b2), C0603Xd.f(j), C0603Xd.d(j)), AbstractC1807r8.q(C0603Xd.d(b2), C0603Xd.f(j), C0603Xd.d(j)), AbstractC1807r8.q(C0603Xd.e(b2), C0603Xd.e(j), C0603Xd.c(j)), AbstractC1807r8.q(C0603Xd.c(b2), C0603Xd.e(j), C0603Xd.c(j)));
        } else {
            if (AbstractC0556Vi.a(this.n, Float.NaN)) {
                f = C0603Xd.f(j);
                int d2 = C0603Xd.d(b2);
                if (f > d2) {
                    f = d2;
                }
            } else {
                f = C0603Xd.f(b2);
            }
            if (AbstractC0556Vi.a(this.p, Float.NaN)) {
                d = C0603Xd.d(j);
                int f2 = C0603Xd.f(b2);
                if (d < f2) {
                    d = f2;
                }
            } else {
                d = C0603Xd.d(b2);
            }
            if (AbstractC0556Vi.a(this.f139o, Float.NaN)) {
                e = C0603Xd.e(j);
                int c2 = C0603Xd.c(b2);
                if (e > c2) {
                    e = c2;
                }
            } else {
                e = C0603Xd.e(b2);
            }
            if (AbstractC0556Vi.a(this.q, Float.NaN)) {
                c = C0603Xd.c(j);
                int e2 = C0603Xd.e(b2);
                if (c < e2) {
                    c = e2;
                }
            } else {
                c = C0603Xd.c(b2);
            }
            b = AbstractC0868ct.b(f, d, e, c);
        }
        AbstractC0700aI a = ib.a(b);
        return abstractC1415lB.T(a.b, a.c, new C0585Wl(a, 2));
    }
}
