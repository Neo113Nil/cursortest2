package t;

import q.AbstractC0286e;
import s.C0295c;
import s.C0296d;

/* renamed from: t.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0313o implements InterfaceC0302d {

    /* renamed from: a, reason: collision with root package name */
    public int f3801a;

    /* renamed from: b, reason: collision with root package name */
    public C0296d f3802b;

    /* renamed from: c, reason: collision with root package name */
    public C0310l f3803c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final C0305g f3804e = new C0305g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f3805f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3806g = false;
    public final C0304f h = new C0304f(this);
    public final C0304f i = new C0304f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f3807j = 1;

    public AbstractC0313o(C0296d c0296d) {
        this.f3802b = c0296d;
    }

    public static void b(C0304f c0304f, C0304f c0304f2, int i) {
        c0304f.f3788l.add(c0304f2);
        c0304f.f3784f = i;
        c0304f2.f3787k.add(c0304f);
    }

    public static C0304f h(C0295c c0295c) {
        C0295c c0295c2 = c0295c.f3619f;
        if (c0295c2 == null) {
            return null;
        }
        int a2 = AbstractC0286e.a(c0295c2.f3618e);
        C0296d c0296d = c0295c2.d;
        if (a2 == 1) {
            return c0296d.d.h;
        }
        if (a2 == 2) {
            return c0296d.f3653e.h;
        }
        if (a2 == 3) {
            return c0296d.d.i;
        }
        if (a2 == 4) {
            return c0296d.f3653e.i;
        }
        if (a2 != 5) {
            return null;
        }
        return c0296d.f3653e.f3794k;
    }

    public static C0304f i(C0295c c0295c, int i) {
        C0295c c0295c2 = c0295c.f3619f;
        if (c0295c2 == null) {
            return null;
        }
        C0296d c0296d = c0295c2.d;
        AbstractC0313o abstractC0313o = i == 0 ? c0296d.d : c0296d.f3653e;
        int a2 = AbstractC0286e.a(c0295c2.f3618e);
        if (a2 == 1 || a2 == 2) {
            return abstractC0313o.h;
        }
        if (a2 == 3 || a2 == 4) {
            return abstractC0313o.i;
        }
        return null;
    }

    public final void c(C0304f c0304f, C0304f c0304f2, int i, C0305g c0305g) {
        c0304f.f3788l.add(c0304f2);
        c0304f.f3788l.add(this.f3804e);
        c0304f.h = i;
        c0304f.i = c0305g;
        c0304f2.f3787k.add(c0304f);
        c0305g.f3787k.add(c0304f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            C0296d c0296d = this.f3802b;
            int i3 = c0296d.f3679v;
            max = Math.max(c0296d.f3678u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C0296d c0296d2 = this.f3802b;
            int i4 = c0296d2.f3682y;
            max = Math.max(c0296d2.f3681x, i);
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
        if (this.f3804e.f3786j) {
            return r0.f3785g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f3801a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(C0295c c0295c, C0295c c0295c2, int i) {
        C0304f h = h(c0295c);
        C0304f h2 = h(c0295c2);
        if (h.f3786j && h2.f3786j) {
            int e2 = c0295c.e() + h.f3785g;
            int e3 = h2.f3785g - c0295c2.e();
            int i2 = e3 - e2;
            C0305g c0305g = this.f3804e;
            if (!c0305g.f3786j && this.d == 3) {
                int i3 = this.f3801a;
                if (i3 == 0) {
                    c0305g.d(g(i2, i));
                } else if (i3 == 1) {
                    c0305g.d(Math.min(g(c0305g.f3789m, i), i2));
                } else if (i3 == 2) {
                    C0296d c0296d = this.f3802b;
                    C0296d c0296d2 = c0296d.f3639T;
                    if (c0296d2 != null) {
                        if ((i == 0 ? c0296d2.d : c0296d2.f3653e).f3804e.f3786j) {
                            c0305g.d(g((int) ((r6.f3785g * (i == 0 ? c0296d.f3680w : c0296d.f3683z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    C0296d c0296d3 = this.f3802b;
                    AbstractC0313o abstractC0313o = c0296d3.d;
                    if (abstractC0313o.d == 3 && abstractC0313o.f3801a == 3) {
                        C0311m c0311m = c0296d3.f3653e;
                        if (c0311m.d == 3) {
                        }
                    }
                    if (i == 0) {
                        abstractC0313o = c0296d3.f3653e;
                    }
                    if (abstractC0313o.f3804e.f3786j) {
                        float f2 = c0296d3.f3642W;
                        c0305g.d(i == 1 ? (int) ((r6.f3785g / f2) + 0.5f) : (int) ((f2 * r6.f3785g) + 0.5f));
                    }
                }
            }
            if (c0305g.f3786j) {
                int i4 = c0305g.f3785g;
                C0304f c0304f = this.i;
                C0304f c0304f2 = this.h;
                if (i4 == i2) {
                    c0304f2.d(e2);
                    c0304f.d(e3);
                    return;
                }
                C0296d c0296d4 = this.f3802b;
                float f3 = i == 0 ? c0296d4.f3652d0 : c0296d4.f3654e0;
                if (h == h2) {
                    e2 = h.f3785g;
                    e3 = h2.f3785g;
                    f3 = 0.5f;
                }
                c0304f2.d((int) ((((e3 - e2) - i4) * f3) + e2 + 0.5f));
                c0304f.d(c0304f2.f3785g + c0305g.f3785g);
            }
        }
    }
}
