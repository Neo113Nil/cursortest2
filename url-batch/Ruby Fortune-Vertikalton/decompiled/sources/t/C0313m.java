package t;

import q.AbstractC0290e;
import s.C0297c;
import s.C0298d;

/* renamed from: t.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313m extends AbstractC0315o {

    /* renamed from: k, reason: collision with root package name */
    public C0306f f3784k;

    /* renamed from: l, reason: collision with root package name */
    public C0301a f3785l;

    @Override // t.InterfaceC0304d
    public final void a(InterfaceC0304d interfaceC0304d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0290e.a(this.f3797j) == 3) {
            C0298d c0298d = this.f3792b;
            l(c0298d.f3618J, c0298d.f3620L, 1);
            return;
        }
        C0307g c0307g = this.f3794e;
        if (c0307g.f3772c && !c0307g.f3776j && this.d == 3) {
            C0298d c0298d2 = this.f3792b;
            int i2 = c0298d2.f3665s;
            if (i2 == 2) {
                C0298d c0298d3 = c0298d2.f3628T;
                if (c0298d3 != null) {
                    if (c0298d3.f3642e.f3794e.f3776j) {
                        c0307g.d((int) ((r5.f3775g * c0298d2.f3672z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0307g c0307g2 = c0298d2.d.f3794e;
                if (c0307g2.f3776j) {
                    int i3 = c0298d2.f3632X;
                    if (i3 == -1) {
                        f2 = c0307g2.f3775g;
                        f3 = c0298d2.f3631W;
                    } else if (i3 == 0) {
                        f4 = c0307g2.f3775g * c0298d2.f3631W;
                        i = (int) (f4 + 0.5f);
                        c0307g.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c0307g.d(i);
                    } else {
                        f2 = c0307g2.f3775g;
                        f3 = c0298d2.f3631W;
                    }
                    f4 = f2 / f3;
                    i = (int) (f4 + 0.5f);
                    c0307g.d(i);
                }
            }
        }
        C0306f c0306f = this.h;
        if (c0306f.f3772c) {
            C0306f c0306f2 = this.i;
            if (c0306f2.f3772c) {
                if (c0306f.f3776j && c0306f2.f3776j && c0307g.f3776j) {
                    return;
                }
                if (!c0307g.f3776j && this.d == 3) {
                    C0298d c0298d4 = this.f3792b;
                    if (c0298d4.f3664r == 0 && !c0298d4.y()) {
                        C0306f c0306f3 = (C0306f) c0306f.f3778l.get(0);
                        C0306f c0306f4 = (C0306f) c0306f2.f3778l.get(0);
                        int i4 = c0306f3.f3775g + c0306f.f3774f;
                        int i5 = c0306f4.f3775g + c0306f2.f3774f;
                        c0306f.d(i4);
                        c0306f2.d(i5);
                        c0307g.d(i5 - i4);
                        return;
                    }
                }
                if (!c0307g.f3776j && this.d == 3 && this.f3791a == 1 && c0306f.f3778l.size() > 0 && c0306f2.f3778l.size() > 0) {
                    C0306f c0306f5 = (C0306f) c0306f.f3778l.get(0);
                    int i6 = (((C0306f) c0306f2.f3778l.get(0)).f3775g + c0306f2.f3774f) - (c0306f5.f3775g + c0306f.f3774f);
                    int i7 = c0307g.f3779m;
                    if (i6 < i7) {
                        c0307g.d(i6);
                    } else {
                        c0307g.d(i7);
                    }
                }
                if (c0307g.f3776j && c0306f.f3778l.size() > 0 && c0306f2.f3778l.size() > 0) {
                    C0306f c0306f6 = (C0306f) c0306f.f3778l.get(0);
                    C0306f c0306f7 = (C0306f) c0306f2.f3778l.get(0);
                    int i8 = c0306f6.f3775g;
                    int i9 = c0306f.f3774f + i8;
                    int i10 = c0306f7.f3775g;
                    int i11 = c0306f2.f3774f + i10;
                    float f5 = this.f3792b.f3643e0;
                    if (c0306f6 == c0306f7) {
                        f5 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c0306f.d((int) ((((i10 - i8) - c0307g.f3775g) * f5) + i8 + 0.5f));
                    c0306f2.d(c0306f.f3775g + c0307g.f3775g);
                }
            }
        }
    }

    @Override // t.AbstractC0315o
    public final void d() {
        C0298d c0298d;
        C0298d c0298d2;
        C0298d c0298d3;
        C0298d c0298d4;
        C0298d c0298d5 = this.f3792b;
        boolean z2 = c0298d5.f3635a;
        C0307g c0307g = this.f3794e;
        if (z2) {
            c0307g.d(c0298d5.k());
        }
        boolean z3 = c0307g.f3776j;
        C0306f c0306f = this.i;
        C0306f c0306f2 = this.h;
        if (!z3) {
            C0298d c0298d6 = this.f3792b;
            this.d = c0298d6.f3662p0[1];
            if (c0298d6.f3614E) {
                this.f3785l = new C0301a(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (c0298d4 = this.f3792b.f3628T) != null && c0298d4.f3662p0[1] == 1) {
                    int k2 = (c0298d4.k() - this.f3792b.f3618J.e()) - this.f3792b.f3620L.e();
                    AbstractC0315o.b(c0306f2, c0298d4.f3642e.h, this.f3792b.f3618J.e());
                    AbstractC0315o.b(c0306f, c0298d4.f3642e.i, -this.f3792b.f3620L.e());
                    c0307g.d(k2);
                    return;
                }
                if (i == 1) {
                    c0307g.d(this.f3792b.k());
                }
            }
        } else if (this.d == 4 && (c0298d2 = (c0298d = this.f3792b).f3628T) != null && c0298d2.f3662p0[1] == 1) {
            AbstractC0315o.b(c0306f2, c0298d2.f3642e.h, c0298d.f3618J.e());
            AbstractC0315o.b(c0306f, c0298d2.f3642e.i, -this.f3792b.f3620L.e());
            return;
        }
        boolean z4 = c0307g.f3776j;
        C0306f c0306f3 = this.f3784k;
        if (z4) {
            C0298d c0298d7 = this.f3792b;
            if (c0298d7.f3635a) {
                C0297c[] c0297cArr = c0298d7.f3625Q;
                C0297c c0297c = c0297cArr[2];
                C0297c c0297c2 = c0297c.f3608f;
                if (c0297c2 != null && c0297cArr[3].f3608f != null) {
                    if (c0298d7.y()) {
                        c0306f2.f3774f = this.f3792b.f3625Q[2].e();
                        c0306f.f3774f = -this.f3792b.f3625Q[3].e();
                    } else {
                        C0306f h = AbstractC0315o.h(this.f3792b.f3625Q[2]);
                        if (h != null) {
                            AbstractC0315o.b(c0306f2, h, this.f3792b.f3625Q[2].e());
                        }
                        C0306f h2 = AbstractC0315o.h(this.f3792b.f3625Q[3]);
                        if (h2 != null) {
                            AbstractC0315o.b(c0306f, h2, -this.f3792b.f3625Q[3].e());
                        }
                        c0306f2.f3771b = true;
                        c0306f.f3771b = true;
                    }
                    C0298d c0298d8 = this.f3792b;
                    if (c0298d8.f3614E) {
                        AbstractC0315o.b(c0306f3, c0306f2, c0298d8.f3636a0);
                        return;
                    }
                    return;
                }
                if (c0297c2 != null) {
                    C0306f h3 = AbstractC0315o.h(c0297c);
                    if (h3 != null) {
                        AbstractC0315o.b(c0306f2, h3, this.f3792b.f3625Q[2].e());
                        AbstractC0315o.b(c0306f, c0306f2, c0307g.f3775g);
                        C0298d c0298d9 = this.f3792b;
                        if (c0298d9.f3614E) {
                            AbstractC0315o.b(c0306f3, c0306f2, c0298d9.f3636a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0297c c0297c3 = c0297cArr[3];
                if (c0297c3.f3608f != null) {
                    C0306f h4 = AbstractC0315o.h(c0297c3);
                    if (h4 != null) {
                        AbstractC0315o.b(c0306f, h4, -this.f3792b.f3625Q[3].e());
                        AbstractC0315o.b(c0306f2, c0306f, -c0307g.f3775g);
                    }
                    C0298d c0298d10 = this.f3792b;
                    if (c0298d10.f3614E) {
                        AbstractC0315o.b(c0306f3, c0306f2, c0298d10.f3636a0);
                        return;
                    }
                    return;
                }
                C0297c c0297c4 = c0297cArr[4];
                if (c0297c4.f3608f != null) {
                    C0306f h5 = AbstractC0315o.h(c0297c4);
                    if (h5 != null) {
                        AbstractC0315o.b(c0306f3, h5, 0);
                        AbstractC0315o.b(c0306f2, c0306f3, -this.f3792b.f3636a0);
                        AbstractC0315o.b(c0306f, c0306f2, c0307g.f3775g);
                        return;
                    }
                    return;
                }
                if ((c0298d7 instanceof s.i) || c0298d7.f3628T == null || c0298d7.i(7).f3608f != null) {
                    return;
                }
                C0298d c0298d11 = this.f3792b;
                AbstractC0315o.b(c0306f2, c0298d11.f3628T.f3642e.h, c0298d11.s());
                AbstractC0315o.b(c0306f, c0306f2, c0307g.f3775g);
                C0298d c0298d12 = this.f3792b;
                if (c0298d12.f3614E) {
                    AbstractC0315o.b(c0306f3, c0306f2, c0298d12.f3636a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.d != 3) {
            c0307g.b(this);
        } else {
            C0298d c0298d13 = this.f3792b;
            int i2 = c0298d13.f3665s;
            if (i2 == 2) {
                C0298d c0298d14 = c0298d13.f3628T;
                if (c0298d14 != null) {
                    C0307g c0307g2 = c0298d14.f3642e.f3794e;
                    c0307g.f3778l.add(c0307g2);
                    c0307g2.f3777k.add(c0307g);
                    c0307g.f3771b = true;
                    c0307g.f3777k.add(c0306f2);
                    c0307g.f3777k.add(c0306f);
                }
            } else if (i2 == 3 && !c0298d13.y()) {
                C0298d c0298d15 = this.f3792b;
                if (c0298d15.f3664r != 3) {
                    C0307g c0307g3 = c0298d15.d.f3794e;
                    c0307g.f3778l.add(c0307g3);
                    c0307g3.f3777k.add(c0307g);
                    c0307g.f3771b = true;
                    c0307g.f3777k.add(c0306f2);
                    c0307g.f3777k.add(c0306f);
                }
            }
        }
        C0298d c0298d16 = this.f3792b;
        C0297c[] c0297cArr2 = c0298d16.f3625Q;
        C0297c c0297c5 = c0297cArr2[2];
        C0297c c0297c6 = c0297c5.f3608f;
        if (c0297c6 != null && c0297cArr2[3].f3608f != null) {
            if (c0298d16.y()) {
                c0306f2.f3774f = this.f3792b.f3625Q[2].e();
                c0306f.f3774f = -this.f3792b.f3625Q[3].e();
            } else {
                C0306f h6 = AbstractC0315o.h(this.f3792b.f3625Q[2]);
                C0306f h7 = AbstractC0315o.h(this.f3792b.f3625Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.f3797j = 4;
            }
            if (this.f3792b.f3614E) {
                c(c0306f3, c0306f2, 1, this.f3785l);
            }
        } else if (c0297c6 != null) {
            C0306f h8 = AbstractC0315o.h(c0297c5);
            if (h8 != null) {
                AbstractC0315o.b(c0306f2, h8, this.f3792b.f3625Q[2].e());
                c(c0306f, c0306f2, 1, c0307g);
                if (this.f3792b.f3614E) {
                    c(c0306f3, c0306f2, 1, this.f3785l);
                }
                if (this.d == 3) {
                    C0298d c0298d17 = this.f3792b;
                    if (c0298d17.f3631W > 0.0f) {
                        C0311k c0311k = c0298d17.d;
                        if (c0311k.d == 3) {
                            c0311k.f3794e.f3777k.add(c0307g);
                            c0307g.f3778l.add(this.f3792b.d.f3794e);
                            c0307g.f3770a = this;
                        }
                    }
                }
            }
        } else {
            C0297c c0297c7 = c0297cArr2[3];
            if (c0297c7.f3608f != null) {
                C0306f h9 = AbstractC0315o.h(c0297c7);
                if (h9 != null) {
                    AbstractC0315o.b(c0306f, h9, -this.f3792b.f3625Q[3].e());
                    c(c0306f2, c0306f, -1, c0307g);
                    if (this.f3792b.f3614E) {
                        c(c0306f3, c0306f2, 1, this.f3785l);
                    }
                }
            } else {
                C0297c c0297c8 = c0297cArr2[4];
                if (c0297c8.f3608f != null) {
                    C0306f h10 = AbstractC0315o.h(c0297c8);
                    if (h10 != null) {
                        AbstractC0315o.b(c0306f3, h10, 0);
                        c(c0306f2, c0306f3, -1, this.f3785l);
                        c(c0306f, c0306f2, 1, c0307g);
                    }
                } else if (!(c0298d16 instanceof s.i) && (c0298d3 = c0298d16.f3628T) != null) {
                    AbstractC0315o.b(c0306f2, c0298d3.f3642e.h, c0298d16.s());
                    c(c0306f, c0306f2, 1, c0307g);
                    if (this.f3792b.f3614E) {
                        c(c0306f3, c0306f2, 1, this.f3785l);
                    }
                    if (this.d == 3) {
                        C0298d c0298d18 = this.f3792b;
                        if (c0298d18.f3631W > 0.0f) {
                            C0311k c0311k2 = c0298d18.d;
                            if (c0311k2.d == 3) {
                                c0311k2.f3794e.f3777k.add(c0307g);
                                c0307g.f3778l.add(this.f3792b.d.f3794e);
                                c0307g.f3770a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c0307g.f3778l.size() == 0) {
            c0307g.f3772c = true;
        }
    }

    @Override // t.AbstractC0315o
    public final void e() {
        C0306f c0306f = this.h;
        if (c0306f.f3776j) {
            this.f3792b.f3634Z = c0306f.f3775g;
        }
    }

    @Override // t.AbstractC0315o
    public final void f() {
        this.f3793c = null;
        this.h.c();
        this.i.c();
        this.f3784k.c();
        this.f3794e.c();
        this.f3796g = false;
    }

    @Override // t.AbstractC0315o
    public final boolean k() {
        return this.d != 3 || this.f3792b.f3665s == 0;
    }

    public final void m() {
        this.f3796g = false;
        C0306f c0306f = this.h;
        c0306f.c();
        c0306f.f3776j = false;
        C0306f c0306f2 = this.i;
        c0306f2.c();
        c0306f2.f3776j = false;
        C0306f c0306f3 = this.f3784k;
        c0306f3.c();
        c0306f3.f3776j = false;
        this.f3794e.f3776j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f3792b.f3648h0;
    }
}
