package t;

import q.AbstractC0291e;
import s.C0298c;
import s.C0299d;

/* renamed from: t.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0314m extends AbstractC0316o {

    /* renamed from: k, reason: collision with root package name */
    public C0307f f3768k;

    /* renamed from: l, reason: collision with root package name */
    public C0302a f3769l;

    @Override // t.InterfaceC0305d
    public final void a(InterfaceC0305d interfaceC0305d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0291e.a(this.f3781j) == 3) {
            C0299d c0299d = this.f3776b;
            l(c0299d.f3602J, c0299d.f3604L, 1);
            return;
        }
        C0308g c0308g = this.f3778e;
        if (c0308g.f3756c && !c0308g.f3760j && this.d == 3) {
            C0299d c0299d2 = this.f3776b;
            int i2 = c0299d2.f3649s;
            if (i2 == 2) {
                C0299d c0299d3 = c0299d2.f3612T;
                if (c0299d3 != null) {
                    if (c0299d3.f3626e.f3778e.f3760j) {
                        c0308g.d((int) ((r5.f3759g * c0299d2.f3656z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0308g c0308g2 = c0299d2.d.f3778e;
                if (c0308g2.f3760j) {
                    int i3 = c0299d2.f3616X;
                    if (i3 == -1) {
                        f2 = c0308g2.f3759g;
                        f3 = c0299d2.f3615W;
                    } else if (i3 == 0) {
                        f4 = c0308g2.f3759g * c0299d2.f3615W;
                        i = (int) (f4 + 0.5f);
                        c0308g.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c0308g.d(i);
                    } else {
                        f2 = c0308g2.f3759g;
                        f3 = c0299d2.f3615W;
                    }
                    f4 = f2 / f3;
                    i = (int) (f4 + 0.5f);
                    c0308g.d(i);
                }
            }
        }
        C0307f c0307f = this.h;
        if (c0307f.f3756c) {
            C0307f c0307f2 = this.i;
            if (c0307f2.f3756c) {
                if (c0307f.f3760j && c0307f2.f3760j && c0308g.f3760j) {
                    return;
                }
                if (!c0308g.f3760j && this.d == 3) {
                    C0299d c0299d4 = this.f3776b;
                    if (c0299d4.f3648r == 0 && !c0299d4.y()) {
                        C0307f c0307f3 = (C0307f) c0307f.f3762l.get(0);
                        C0307f c0307f4 = (C0307f) c0307f2.f3762l.get(0);
                        int i4 = c0307f3.f3759g + c0307f.f3758f;
                        int i5 = c0307f4.f3759g + c0307f2.f3758f;
                        c0307f.d(i4);
                        c0307f2.d(i5);
                        c0308g.d(i5 - i4);
                        return;
                    }
                }
                if (!c0308g.f3760j && this.d == 3 && this.f3775a == 1 && c0307f.f3762l.size() > 0 && c0307f2.f3762l.size() > 0) {
                    C0307f c0307f5 = (C0307f) c0307f.f3762l.get(0);
                    int i6 = (((C0307f) c0307f2.f3762l.get(0)).f3759g + c0307f2.f3758f) - (c0307f5.f3759g + c0307f.f3758f);
                    int i7 = c0308g.f3763m;
                    if (i6 < i7) {
                        c0308g.d(i6);
                    } else {
                        c0308g.d(i7);
                    }
                }
                if (c0308g.f3760j && c0307f.f3762l.size() > 0 && c0307f2.f3762l.size() > 0) {
                    C0307f c0307f6 = (C0307f) c0307f.f3762l.get(0);
                    C0307f c0307f7 = (C0307f) c0307f2.f3762l.get(0);
                    int i8 = c0307f6.f3759g;
                    int i9 = c0307f.f3758f + i8;
                    int i10 = c0307f7.f3759g;
                    int i11 = c0307f2.f3758f + i10;
                    float f5 = this.f3776b.f3627e0;
                    if (c0307f6 == c0307f7) {
                        f5 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c0307f.d((int) ((((i10 - i8) - c0308g.f3759g) * f5) + i8 + 0.5f));
                    c0307f2.d(c0307f.f3759g + c0308g.f3759g);
                }
            }
        }
    }

    @Override // t.AbstractC0316o
    public final void d() {
        C0299d c0299d;
        C0299d c0299d2;
        C0299d c0299d3;
        C0299d c0299d4;
        C0299d c0299d5 = this.f3776b;
        boolean z2 = c0299d5.f3619a;
        C0308g c0308g = this.f3778e;
        if (z2) {
            c0308g.d(c0299d5.k());
        }
        boolean z3 = c0308g.f3760j;
        C0307f c0307f = this.i;
        C0307f c0307f2 = this.h;
        if (!z3) {
            C0299d c0299d6 = this.f3776b;
            this.d = c0299d6.f3646p0[1];
            if (c0299d6.f3598E) {
                this.f3769l = new C0302a(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (c0299d4 = this.f3776b.f3612T) != null && c0299d4.f3646p0[1] == 1) {
                    int k2 = (c0299d4.k() - this.f3776b.f3602J.e()) - this.f3776b.f3604L.e();
                    AbstractC0316o.b(c0307f2, c0299d4.f3626e.h, this.f3776b.f3602J.e());
                    AbstractC0316o.b(c0307f, c0299d4.f3626e.i, -this.f3776b.f3604L.e());
                    c0308g.d(k2);
                    return;
                }
                if (i == 1) {
                    c0308g.d(this.f3776b.k());
                }
            }
        } else if (this.d == 4 && (c0299d2 = (c0299d = this.f3776b).f3612T) != null && c0299d2.f3646p0[1] == 1) {
            AbstractC0316o.b(c0307f2, c0299d2.f3626e.h, c0299d.f3602J.e());
            AbstractC0316o.b(c0307f, c0299d2.f3626e.i, -this.f3776b.f3604L.e());
            return;
        }
        boolean z4 = c0308g.f3760j;
        C0307f c0307f3 = this.f3768k;
        if (z4) {
            C0299d c0299d7 = this.f3776b;
            if (c0299d7.f3619a) {
                C0298c[] c0298cArr = c0299d7.f3609Q;
                C0298c c0298c = c0298cArr[2];
                C0298c c0298c2 = c0298c.f3592f;
                if (c0298c2 != null && c0298cArr[3].f3592f != null) {
                    if (c0299d7.y()) {
                        c0307f2.f3758f = this.f3776b.f3609Q[2].e();
                        c0307f.f3758f = -this.f3776b.f3609Q[3].e();
                    } else {
                        C0307f h = AbstractC0316o.h(this.f3776b.f3609Q[2]);
                        if (h != null) {
                            AbstractC0316o.b(c0307f2, h, this.f3776b.f3609Q[2].e());
                        }
                        C0307f h2 = AbstractC0316o.h(this.f3776b.f3609Q[3]);
                        if (h2 != null) {
                            AbstractC0316o.b(c0307f, h2, -this.f3776b.f3609Q[3].e());
                        }
                        c0307f2.f3755b = true;
                        c0307f.f3755b = true;
                    }
                    C0299d c0299d8 = this.f3776b;
                    if (c0299d8.f3598E) {
                        AbstractC0316o.b(c0307f3, c0307f2, c0299d8.f3620a0);
                        return;
                    }
                    return;
                }
                if (c0298c2 != null) {
                    C0307f h3 = AbstractC0316o.h(c0298c);
                    if (h3 != null) {
                        AbstractC0316o.b(c0307f2, h3, this.f3776b.f3609Q[2].e());
                        AbstractC0316o.b(c0307f, c0307f2, c0308g.f3759g);
                        C0299d c0299d9 = this.f3776b;
                        if (c0299d9.f3598E) {
                            AbstractC0316o.b(c0307f3, c0307f2, c0299d9.f3620a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0298c c0298c3 = c0298cArr[3];
                if (c0298c3.f3592f != null) {
                    C0307f h4 = AbstractC0316o.h(c0298c3);
                    if (h4 != null) {
                        AbstractC0316o.b(c0307f, h4, -this.f3776b.f3609Q[3].e());
                        AbstractC0316o.b(c0307f2, c0307f, -c0308g.f3759g);
                    }
                    C0299d c0299d10 = this.f3776b;
                    if (c0299d10.f3598E) {
                        AbstractC0316o.b(c0307f3, c0307f2, c0299d10.f3620a0);
                        return;
                    }
                    return;
                }
                C0298c c0298c4 = c0298cArr[4];
                if (c0298c4.f3592f != null) {
                    C0307f h5 = AbstractC0316o.h(c0298c4);
                    if (h5 != null) {
                        AbstractC0316o.b(c0307f3, h5, 0);
                        AbstractC0316o.b(c0307f2, c0307f3, -this.f3776b.f3620a0);
                        AbstractC0316o.b(c0307f, c0307f2, c0308g.f3759g);
                        return;
                    }
                    return;
                }
                if ((c0299d7 instanceof s.i) || c0299d7.f3612T == null || c0299d7.i(7).f3592f != null) {
                    return;
                }
                C0299d c0299d11 = this.f3776b;
                AbstractC0316o.b(c0307f2, c0299d11.f3612T.f3626e.h, c0299d11.s());
                AbstractC0316o.b(c0307f, c0307f2, c0308g.f3759g);
                C0299d c0299d12 = this.f3776b;
                if (c0299d12.f3598E) {
                    AbstractC0316o.b(c0307f3, c0307f2, c0299d12.f3620a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.d != 3) {
            c0308g.b(this);
        } else {
            C0299d c0299d13 = this.f3776b;
            int i2 = c0299d13.f3649s;
            if (i2 == 2) {
                C0299d c0299d14 = c0299d13.f3612T;
                if (c0299d14 != null) {
                    C0308g c0308g2 = c0299d14.f3626e.f3778e;
                    c0308g.f3762l.add(c0308g2);
                    c0308g2.f3761k.add(c0308g);
                    c0308g.f3755b = true;
                    c0308g.f3761k.add(c0307f2);
                    c0308g.f3761k.add(c0307f);
                }
            } else if (i2 == 3 && !c0299d13.y()) {
                C0299d c0299d15 = this.f3776b;
                if (c0299d15.f3648r != 3) {
                    C0308g c0308g3 = c0299d15.d.f3778e;
                    c0308g.f3762l.add(c0308g3);
                    c0308g3.f3761k.add(c0308g);
                    c0308g.f3755b = true;
                    c0308g.f3761k.add(c0307f2);
                    c0308g.f3761k.add(c0307f);
                }
            }
        }
        C0299d c0299d16 = this.f3776b;
        C0298c[] c0298cArr2 = c0299d16.f3609Q;
        C0298c c0298c5 = c0298cArr2[2];
        C0298c c0298c6 = c0298c5.f3592f;
        if (c0298c6 != null && c0298cArr2[3].f3592f != null) {
            if (c0299d16.y()) {
                c0307f2.f3758f = this.f3776b.f3609Q[2].e();
                c0307f.f3758f = -this.f3776b.f3609Q[3].e();
            } else {
                C0307f h6 = AbstractC0316o.h(this.f3776b.f3609Q[2]);
                C0307f h7 = AbstractC0316o.h(this.f3776b.f3609Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.f3781j = 4;
            }
            if (this.f3776b.f3598E) {
                c(c0307f3, c0307f2, 1, this.f3769l);
            }
        } else if (c0298c6 != null) {
            C0307f h8 = AbstractC0316o.h(c0298c5);
            if (h8 != null) {
                AbstractC0316o.b(c0307f2, h8, this.f3776b.f3609Q[2].e());
                c(c0307f, c0307f2, 1, c0308g);
                if (this.f3776b.f3598E) {
                    c(c0307f3, c0307f2, 1, this.f3769l);
                }
                if (this.d == 3) {
                    C0299d c0299d17 = this.f3776b;
                    if (c0299d17.f3615W > 0.0f) {
                        C0312k c0312k = c0299d17.d;
                        if (c0312k.d == 3) {
                            c0312k.f3778e.f3761k.add(c0308g);
                            c0308g.f3762l.add(this.f3776b.d.f3778e);
                            c0308g.f3754a = this;
                        }
                    }
                }
            }
        } else {
            C0298c c0298c7 = c0298cArr2[3];
            if (c0298c7.f3592f != null) {
                C0307f h9 = AbstractC0316o.h(c0298c7);
                if (h9 != null) {
                    AbstractC0316o.b(c0307f, h9, -this.f3776b.f3609Q[3].e());
                    c(c0307f2, c0307f, -1, c0308g);
                    if (this.f3776b.f3598E) {
                        c(c0307f3, c0307f2, 1, this.f3769l);
                    }
                }
            } else {
                C0298c c0298c8 = c0298cArr2[4];
                if (c0298c8.f3592f != null) {
                    C0307f h10 = AbstractC0316o.h(c0298c8);
                    if (h10 != null) {
                        AbstractC0316o.b(c0307f3, h10, 0);
                        c(c0307f2, c0307f3, -1, this.f3769l);
                        c(c0307f, c0307f2, 1, c0308g);
                    }
                } else if (!(c0299d16 instanceof s.i) && (c0299d3 = c0299d16.f3612T) != null) {
                    AbstractC0316o.b(c0307f2, c0299d3.f3626e.h, c0299d16.s());
                    c(c0307f, c0307f2, 1, c0308g);
                    if (this.f3776b.f3598E) {
                        c(c0307f3, c0307f2, 1, this.f3769l);
                    }
                    if (this.d == 3) {
                        C0299d c0299d18 = this.f3776b;
                        if (c0299d18.f3615W > 0.0f) {
                            C0312k c0312k2 = c0299d18.d;
                            if (c0312k2.d == 3) {
                                c0312k2.f3778e.f3761k.add(c0308g);
                                c0308g.f3762l.add(this.f3776b.d.f3778e);
                                c0308g.f3754a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c0308g.f3762l.size() == 0) {
            c0308g.f3756c = true;
        }
    }

    @Override // t.AbstractC0316o
    public final void e() {
        C0307f c0307f = this.h;
        if (c0307f.f3760j) {
            this.f3776b.f3618Z = c0307f.f3759g;
        }
    }

    @Override // t.AbstractC0316o
    public final void f() {
        this.f3777c = null;
        this.h.c();
        this.i.c();
        this.f3768k.c();
        this.f3778e.c();
        this.f3780g = false;
    }

    @Override // t.AbstractC0316o
    public final boolean k() {
        return this.d != 3 || this.f3776b.f3649s == 0;
    }

    public final void m() {
        this.f3780g = false;
        C0307f c0307f = this.h;
        c0307f.c();
        c0307f.f3760j = false;
        C0307f c0307f2 = this.i;
        c0307f2.c();
        c0307f2.f3760j = false;
        C0307f c0307f3 = this.f3768k;
        c0307f3.c();
        c0307f3.f3760j = false;
        this.f3778e.f3760j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f3776b.f3632h0;
    }
}
