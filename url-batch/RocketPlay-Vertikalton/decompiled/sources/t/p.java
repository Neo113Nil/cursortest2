package t;

import q.AbstractC0332e;

/* loaded from: classes.dex */
public abstract class p implements InterfaceC0367d {

    /* renamed from: a, reason: collision with root package name */
    public int f4155a;

    /* renamed from: b, reason: collision with root package name */
    public s.d f4156b;

    /* renamed from: c, reason: collision with root package name */
    public l f4157c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final g f4158e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f4159f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4160g = false;
    public final f h = new f(this);
    public final f i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f4161j = 1;

    public p(s.d dVar) {
        this.f4156b = dVar;
    }

    public static void b(f fVar, f fVar2, int i) {
        fVar.f4142l.add(fVar2);
        fVar.f4138f = i;
        fVar2.f4141k.add(fVar);
    }

    public static f h(s.c cVar) {
        s.c cVar2 = cVar.f3952f;
        if (cVar2 == null) {
            return null;
        }
        int a2 = AbstractC0332e.a(cVar2.f3951e);
        s.d dVar = cVar2.d;
        if (a2 == 1) {
            return dVar.d.h;
        }
        if (a2 == 2) {
            return dVar.f3986e.h;
        }
        if (a2 == 3) {
            return dVar.d.i;
        }
        if (a2 == 4) {
            return dVar.f3986e.i;
        }
        if (a2 != 5) {
            return null;
        }
        return dVar.f3986e.f4148k;
    }

    public static f i(s.c cVar, int i) {
        s.c cVar2 = cVar.f3952f;
        if (cVar2 == null) {
            return null;
        }
        s.d dVar = cVar2.d;
        p pVar = i == 0 ? dVar.d : dVar.f3986e;
        int a2 = AbstractC0332e.a(cVar2.f3951e);
        if (a2 == 1 || a2 == 2) {
            return pVar.h;
        }
        if (a2 == 3 || a2 == 4) {
            return pVar.i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i, g gVar) {
        fVar.f4142l.add(fVar2);
        fVar.f4142l.add(this.f4158e);
        fVar.h = i;
        fVar.i = gVar;
        fVar2.f4141k.add(fVar);
        gVar.f4141k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            s.d dVar = this.f4156b;
            int i3 = dVar.f4012v;
            max = Math.max(dVar.f4011u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            s.d dVar2 = this.f4156b;
            int i4 = dVar2.f4015y;
            max = Math.max(dVar2.f4014x, i);
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
        if (this.f4158e.f4140j) {
            return r0.f4139g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f4155a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(s.c cVar, s.c cVar2, int i) {
        f h = h(cVar);
        f h2 = h(cVar2);
        if (h.f4140j && h2.f4140j) {
            int e2 = cVar.e() + h.f4139g;
            int e3 = h2.f4139g - cVar2.e();
            int i2 = e3 - e2;
            g gVar = this.f4158e;
            if (!gVar.f4140j && this.d == 3) {
                int i3 = this.f4155a;
                if (i3 == 0) {
                    gVar.d(g(i2, i));
                } else if (i3 == 1) {
                    gVar.d(Math.min(g(gVar.f4143m, i), i2));
                } else if (i3 == 2) {
                    s.d dVar = this.f4156b;
                    s.d dVar2 = dVar.f3972T;
                    if (dVar2 != null) {
                        if ((i == 0 ? dVar2.d : dVar2.f3986e).f4158e.f4140j) {
                            gVar.d(g((int) ((r6.f4139g * (i == 0 ? dVar.f4013w : dVar.f4016z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    s.d dVar3 = this.f4156b;
                    p pVar = dVar3.d;
                    if (pVar.d == 3 && pVar.f4155a == 3) {
                        m mVar = dVar3.f3986e;
                        if (mVar.d == 3) {
                        }
                    }
                    if (i == 0) {
                        pVar = dVar3.f3986e;
                    }
                    if (pVar.f4158e.f4140j) {
                        float f2 = dVar3.f3975W;
                        gVar.d(i == 1 ? (int) ((r6.f4139g / f2) + 0.5f) : (int) ((f2 * r6.f4139g) + 0.5f));
                    }
                }
            }
            if (gVar.f4140j) {
                int i4 = gVar.f4139g;
                f fVar = this.i;
                f fVar2 = this.h;
                if (i4 == i2) {
                    fVar2.d(e2);
                    fVar.d(e3);
                    return;
                }
                s.d dVar4 = this.f4156b;
                float f3 = i == 0 ? dVar4.f3985d0 : dVar4.f3987e0;
                if (h == h2) {
                    e2 = h.f4139g;
                    e3 = h2.f4139g;
                    f3 = 0.5f;
                }
                fVar2.d((int) ((((e3 - e2) - i4) * f3) + e2 + 0.5f));
                fVar.d(fVar2.f4139g + gVar.f4139g);
            }
        }
    }
}
