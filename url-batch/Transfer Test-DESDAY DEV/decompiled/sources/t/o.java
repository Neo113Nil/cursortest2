package t;

import q.AbstractC0321e;

/* loaded from: classes.dex */
public abstract class o implements InterfaceC0333d {

    /* renamed from: a, reason: collision with root package name */
    public int f3760a;

    /* renamed from: b, reason: collision with root package name */
    public s.d f3761b;

    /* renamed from: c, reason: collision with root package name */
    public l f3762c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final g f3763e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f3764f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3765g = false;
    public final C0335f h = new C0335f(this);
    public final C0335f i = new C0335f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f3766j = 1;

    public o(s.d dVar) {
        this.f3761b = dVar;
    }

    public static void b(C0335f c0335f, C0335f c0335f2, int i) {
        c0335f.f3747l.add(c0335f2);
        c0335f.f3743f = i;
        c0335f2.f3746k.add(c0335f);
    }

    public static C0335f h(s.c cVar) {
        s.c cVar2 = cVar.f3501f;
        if (cVar2 == null) {
            return null;
        }
        int a2 = AbstractC0321e.a(cVar2.f3500e);
        s.d dVar = cVar2.d;
        if (a2 == 1) {
            return dVar.d.h;
        }
        if (a2 == 2) {
            return dVar.f3535e.h;
        }
        if (a2 == 3) {
            return dVar.d.i;
        }
        if (a2 == 4) {
            return dVar.f3535e.i;
        }
        if (a2 != 5) {
            return null;
        }
        return dVar.f3535e.f3753k;
    }

    public static C0335f i(s.c cVar, int i) {
        s.c cVar2 = cVar.f3501f;
        if (cVar2 == null) {
            return null;
        }
        s.d dVar = cVar2.d;
        o oVar = i == 0 ? dVar.d : dVar.f3535e;
        int a2 = AbstractC0321e.a(cVar2.f3500e);
        if (a2 == 1 || a2 == 2) {
            return oVar.h;
        }
        if (a2 == 3 || a2 == 4) {
            return oVar.i;
        }
        return null;
    }

    public final void c(C0335f c0335f, C0335f c0335f2, int i, g gVar) {
        c0335f.f3747l.add(c0335f2);
        c0335f.f3747l.add(this.f3763e);
        c0335f.h = i;
        c0335f.i = gVar;
        c0335f2.f3746k.add(c0335f);
        gVar.f3746k.add(c0335f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            s.d dVar = this.f3761b;
            int i3 = dVar.f3561v;
            max = Math.max(dVar.f3560u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            s.d dVar2 = this.f3761b;
            int i4 = dVar2.f3564y;
            max = Math.max(dVar2.f3563x, i);
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
        if (this.f3763e.f3745j) {
            return r0.f3744g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f3760a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(s.c cVar, s.c cVar2, int i) {
        C0335f h = h(cVar);
        C0335f h2 = h(cVar2);
        if (h.f3745j && h2.f3745j) {
            int e2 = cVar.e() + h.f3744g;
            int e3 = h2.f3744g - cVar2.e();
            int i2 = e3 - e2;
            g gVar = this.f3763e;
            if (!gVar.f3745j && this.d == 3) {
                int i3 = this.f3760a;
                if (i3 == 0) {
                    gVar.d(g(i2, i));
                } else if (i3 == 1) {
                    gVar.d(Math.min(g(gVar.f3748m, i), i2));
                } else if (i3 == 2) {
                    s.d dVar = this.f3761b;
                    s.d dVar2 = dVar.f3521T;
                    if (dVar2 != null) {
                        if ((i == 0 ? dVar2.d : dVar2.f3535e).f3763e.f3745j) {
                            gVar.d(g((int) ((r6.f3744g * (i == 0 ? dVar.f3562w : dVar.f3565z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    s.d dVar3 = this.f3761b;
                    o oVar = dVar3.d;
                    if (oVar.d == 3 && oVar.f3760a == 3) {
                        m mVar = dVar3.f3535e;
                        if (mVar.d == 3) {
                        }
                    }
                    if (i == 0) {
                        oVar = dVar3.f3535e;
                    }
                    if (oVar.f3763e.f3745j) {
                        float f2 = dVar3.f3524W;
                        gVar.d(i == 1 ? (int) ((r6.f3744g / f2) + 0.5f) : (int) ((f2 * r6.f3744g) + 0.5f));
                    }
                }
            }
            if (gVar.f3745j) {
                int i4 = gVar.f3744g;
                C0335f c0335f = this.i;
                C0335f c0335f2 = this.h;
                if (i4 == i2) {
                    c0335f2.d(e2);
                    c0335f.d(e3);
                    return;
                }
                s.d dVar4 = this.f3761b;
                float f3 = i == 0 ? dVar4.f3534d0 : dVar4.f3536e0;
                if (h == h2) {
                    e2 = h.f3744g;
                    e3 = h2.f3744g;
                    f3 = 0.5f;
                }
                c0335f2.d((int) ((((e3 - e2) - i4) * f3) + e2 + 0.5f));
                c0335f.d(c0335f2.f3744g + gVar.f3744g);
            }
        }
    }
}
