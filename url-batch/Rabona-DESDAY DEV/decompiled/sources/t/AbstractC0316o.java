package t;

import q.AbstractC0291e;
import s.C0298c;
import s.C0299d;

/* renamed from: t.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0316o implements InterfaceC0305d {

    /* renamed from: a, reason: collision with root package name */
    public int f3797a;

    /* renamed from: b, reason: collision with root package name */
    public C0299d f3798b;

    /* renamed from: c, reason: collision with root package name */
    public C0313l f3799c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final C0308g f3800e = new C0308g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f3801f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3802g = false;
    public final C0307f h = new C0307f(this);
    public final C0307f i = new C0307f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f3803j = 1;

    public AbstractC0316o(C0299d c0299d) {
        this.f3798b = c0299d;
    }

    public static void b(C0307f c0307f, C0307f c0307f2, int i) {
        c0307f.f3784l.add(c0307f2);
        c0307f.f3780f = i;
        c0307f2.f3783k.add(c0307f);
    }

    public static C0307f h(C0298c c0298c) {
        C0298c c0298c2 = c0298c.f3614f;
        if (c0298c2 == null) {
            return null;
        }
        int a2 = AbstractC0291e.a(c0298c2.f3613e);
        C0299d c0299d = c0298c2.d;
        if (a2 == 1) {
            return c0299d.d.h;
        }
        if (a2 == 2) {
            return c0299d.f3648e.h;
        }
        if (a2 == 3) {
            return c0299d.d.i;
        }
        if (a2 == 4) {
            return c0299d.f3648e.i;
        }
        if (a2 != 5) {
            return null;
        }
        return c0299d.f3648e.f3790k;
    }

    public static C0307f i(C0298c c0298c, int i) {
        C0298c c0298c2 = c0298c.f3614f;
        if (c0298c2 == null) {
            return null;
        }
        C0299d c0299d = c0298c2.d;
        AbstractC0316o abstractC0316o = i == 0 ? c0299d.d : c0299d.f3648e;
        int a2 = AbstractC0291e.a(c0298c2.f3613e);
        if (a2 == 1 || a2 == 2) {
            return abstractC0316o.h;
        }
        if (a2 == 3 || a2 == 4) {
            return abstractC0316o.i;
        }
        return null;
    }

    public final void c(C0307f c0307f, C0307f c0307f2, int i, C0308g c0308g) {
        c0307f.f3784l.add(c0307f2);
        c0307f.f3784l.add(this.f3800e);
        c0307f.h = i;
        c0307f.i = c0308g;
        c0307f2.f3783k.add(c0307f);
        c0308g.f3783k.add(c0307f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            C0299d c0299d = this.f3798b;
            int i3 = c0299d.f3674v;
            max = Math.max(c0299d.f3673u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C0299d c0299d2 = this.f3798b;
            int i4 = c0299d2.f3677y;
            max = Math.max(c0299d2.f3676x, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    public long j() {
        if (this.f3800e.f3782j) {
            return r0.f3781g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f3797a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(C0298c c0298c, C0298c c0298c2, int i) {
        C0307f h = h(c0298c);
        C0307f h2 = h(c0298c2);
        if (h.f3782j && h2.f3782j) {
            int e2 = c0298c.e() + h.f3781g;
            int e3 = h2.f3781g - c0298c2.e();
            int i2 = e3 - e2;
            C0308g c0308g = this.f3800e;
            if (!c0308g.f3782j && this.d == 3) {
                int i3 = this.f3797a;
                if (i3 == 0) {
                    c0308g.d(g(i2, i));
                } else if (i3 == 1) {
                    c0308g.d(Math.min(g(c0308g.f3785m, i), i2));
                } else if (i3 == 2) {
                    C0299d c0299d = this.f3798b;
                    C0299d c0299d2 = c0299d.f3634T;
                    if (c0299d2 != null) {
                        if ((i == 0 ? c0299d2.d : c0299d2.f3648e).f3800e.f3782j) {
                            c0308g.d(g((int) ((r6.f3781g * (i == 0 ? c0299d.f3675w : c0299d.f3678z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    C0299d c0299d3 = this.f3798b;
                    AbstractC0316o abstractC0316o = c0299d3.d;
                    if (abstractC0316o.d == 3 && abstractC0316o.f3797a == 3) {
                        C0314m c0314m = c0299d3.f3648e;
                        if (c0314m.d == 3) {
                        }
                    }
                    if (i == 0) {
                        abstractC0316o = c0299d3.f3648e;
                    }
                    if (abstractC0316o.f3800e.f3782j) {
                        float f2 = c0299d3.f3637W;
                        c0308g.d(i == 1 ? (int) ((r6.f3781g / f2) + 0.5f) : (int) ((f2 * r6.f3781g) + 0.5f));
                    }
                }
            }
            if (c0308g.f3782j) {
                int i4 = c0308g.f3781g;
                C0307f c0307f = this.i;
                C0307f c0307f2 = this.h;
                if (i4 == i2) {
                    c0307f2.d(e2);
                    c0307f.d(e3);
                    return;
                }
                C0299d c0299d4 = this.f3798b;
                float f3 = i == 0 ? c0299d4.f3647d0 : c0299d4.f3649e0;
                if (h == h2) {
                    e2 = h.f3781g;
                    e3 = h2.f3781g;
                    f3 = 0.5f;
                }
                c0307f2.d((int) ((((e3 - e2) - i4) * f3) + e2 + 0.5f));
                c0307f.d(c0307f2.f3781g + c0308g.f3781g);
            }
        }
    }
}
