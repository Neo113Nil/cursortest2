package t;

import q.AbstractC0286e;
import s.C0295c;
import s.C0296d;

/* renamed from: t.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311m extends AbstractC0313o {

    /* renamed from: k, reason: collision with root package name */
    public C0304f f3794k;

    /* renamed from: l, reason: collision with root package name */
    public C0299a f3795l;

    @Override // t.InterfaceC0302d
    public final void a(InterfaceC0302d interfaceC0302d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0286e.a(this.f3807j) == 3) {
            C0296d c0296d = this.f3802b;
            l(c0296d.f3629J, c0296d.f3631L, 1);
            return;
        }
        C0305g c0305g = this.f3804e;
        if (c0305g.f3782c && !c0305g.f3786j && this.d == 3) {
            C0296d c0296d2 = this.f3802b;
            int i2 = c0296d2.f3676s;
            if (i2 == 2) {
                C0296d c0296d3 = c0296d2.f3639T;
                if (c0296d3 != null) {
                    if (c0296d3.f3653e.f3804e.f3786j) {
                        c0305g.d((int) ((r5.f3785g * c0296d2.f3683z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0305g c0305g2 = c0296d2.d.f3804e;
                if (c0305g2.f3786j) {
                    int i3 = c0296d2.f3643X;
                    if (i3 == -1) {
                        f2 = c0305g2.f3785g;
                        f3 = c0296d2.f3642W;
                    } else if (i3 == 0) {
                        f4 = c0305g2.f3785g * c0296d2.f3642W;
                        i = (int) (f4 + 0.5f);
                        c0305g.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c0305g.d(i);
                    } else {
                        f2 = c0305g2.f3785g;
                        f3 = c0296d2.f3642W;
                    }
                    f4 = f2 / f3;
                    i = (int) (f4 + 0.5f);
                    c0305g.d(i);
                }
            }
        }
        C0304f c0304f = this.h;
        if (c0304f.f3782c) {
            C0304f c0304f2 = this.i;
            if (c0304f2.f3782c) {
                if (c0304f.f3786j && c0304f2.f3786j && c0305g.f3786j) {
                    return;
                }
                if (!c0305g.f3786j && this.d == 3) {
                    C0296d c0296d4 = this.f3802b;
                    if (c0296d4.f3675r == 0 && !c0296d4.y()) {
                        C0304f c0304f3 = (C0304f) c0304f.f3788l.get(0);
                        C0304f c0304f4 = (C0304f) c0304f2.f3788l.get(0);
                        int i4 = c0304f3.f3785g + c0304f.f3784f;
                        int i5 = c0304f4.f3785g + c0304f2.f3784f;
                        c0304f.d(i4);
                        c0304f2.d(i5);
                        c0305g.d(i5 - i4);
                        return;
                    }
                }
                if (!c0305g.f3786j && this.d == 3 && this.f3801a == 1 && c0304f.f3788l.size() > 0 && c0304f2.f3788l.size() > 0) {
                    C0304f c0304f5 = (C0304f) c0304f.f3788l.get(0);
                    int i6 = (((C0304f) c0304f2.f3788l.get(0)).f3785g + c0304f2.f3784f) - (c0304f5.f3785g + c0304f.f3784f);
                    int i7 = c0305g.f3789m;
                    if (i6 < i7) {
                        c0305g.d(i6);
                    } else {
                        c0305g.d(i7);
                    }
                }
                if (c0305g.f3786j && c0304f.f3788l.size() > 0 && c0304f2.f3788l.size() > 0) {
                    C0304f c0304f6 = (C0304f) c0304f.f3788l.get(0);
                    C0304f c0304f7 = (C0304f) c0304f2.f3788l.get(0);
                    int i8 = c0304f6.f3785g;
                    int i9 = c0304f.f3784f + i8;
                    int i10 = c0304f7.f3785g;
                    int i11 = c0304f2.f3784f + i10;
                    float f5 = this.f3802b.f3654e0;
                    if (c0304f6 == c0304f7) {
                        f5 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c0304f.d((int) ((((i10 - i8) - c0305g.f3785g) * f5) + i8 + 0.5f));
                    c0304f2.d(c0304f.f3785g + c0305g.f3785g);
                }
            }
        }
    }

    @Override // t.AbstractC0313o
    public final void d() {
        C0296d c0296d;
        C0296d c0296d2;
        C0296d c0296d3;
        C0296d c0296d4;
        C0296d c0296d5 = this.f3802b;
        boolean z2 = c0296d5.f3646a;
        C0305g c0305g = this.f3804e;
        if (z2) {
            c0305g.d(c0296d5.k());
        }
        boolean z3 = c0305g.f3786j;
        C0304f c0304f = this.i;
        C0304f c0304f2 = this.h;
        if (!z3) {
            C0296d c0296d6 = this.f3802b;
            this.d = c0296d6.f3673p0[1];
            if (c0296d6.f3625E) {
                this.f3795l = new C0299a(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (c0296d4 = this.f3802b.f3639T) != null && c0296d4.f3673p0[1] == 1) {
                    int k2 = (c0296d4.k() - this.f3802b.f3629J.e()) - this.f3802b.f3631L.e();
                    AbstractC0313o.b(c0304f2, c0296d4.f3653e.h, this.f3802b.f3629J.e());
                    AbstractC0313o.b(c0304f, c0296d4.f3653e.i, -this.f3802b.f3631L.e());
                    c0305g.d(k2);
                    return;
                }
                if (i == 1) {
                    c0305g.d(this.f3802b.k());
                }
            }
        } else if (this.d == 4 && (c0296d2 = (c0296d = this.f3802b).f3639T) != null && c0296d2.f3673p0[1] == 1) {
            AbstractC0313o.b(c0304f2, c0296d2.f3653e.h, c0296d.f3629J.e());
            AbstractC0313o.b(c0304f, c0296d2.f3653e.i, -this.f3802b.f3631L.e());
            return;
        }
        boolean z4 = c0305g.f3786j;
        C0304f c0304f3 = this.f3794k;
        if (z4) {
            C0296d c0296d7 = this.f3802b;
            if (c0296d7.f3646a) {
                C0295c[] c0295cArr = c0296d7.f3636Q;
                C0295c c0295c = c0295cArr[2];
                C0295c c0295c2 = c0295c.f3619f;
                if (c0295c2 != null && c0295cArr[3].f3619f != null) {
                    if (c0296d7.y()) {
                        c0304f2.f3784f = this.f3802b.f3636Q[2].e();
                        c0304f.f3784f = -this.f3802b.f3636Q[3].e();
                    } else {
                        C0304f h = AbstractC0313o.h(this.f3802b.f3636Q[2]);
                        if (h != null) {
                            AbstractC0313o.b(c0304f2, h, this.f3802b.f3636Q[2].e());
                        }
                        C0304f h2 = AbstractC0313o.h(this.f3802b.f3636Q[3]);
                        if (h2 != null) {
                            AbstractC0313o.b(c0304f, h2, -this.f3802b.f3636Q[3].e());
                        }
                        c0304f2.f3781b = true;
                        c0304f.f3781b = true;
                    }
                    C0296d c0296d8 = this.f3802b;
                    if (c0296d8.f3625E) {
                        AbstractC0313o.b(c0304f3, c0304f2, c0296d8.f3647a0);
                        return;
                    }
                    return;
                }
                if (c0295c2 != null) {
                    C0304f h3 = AbstractC0313o.h(c0295c);
                    if (h3 != null) {
                        AbstractC0313o.b(c0304f2, h3, this.f3802b.f3636Q[2].e());
                        AbstractC0313o.b(c0304f, c0304f2, c0305g.f3785g);
                        C0296d c0296d9 = this.f3802b;
                        if (c0296d9.f3625E) {
                            AbstractC0313o.b(c0304f3, c0304f2, c0296d9.f3647a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0295c c0295c3 = c0295cArr[3];
                if (c0295c3.f3619f != null) {
                    C0304f h4 = AbstractC0313o.h(c0295c3);
                    if (h4 != null) {
                        AbstractC0313o.b(c0304f, h4, -this.f3802b.f3636Q[3].e());
                        AbstractC0313o.b(c0304f2, c0304f, -c0305g.f3785g);
                    }
                    C0296d c0296d10 = this.f3802b;
                    if (c0296d10.f3625E) {
                        AbstractC0313o.b(c0304f3, c0304f2, c0296d10.f3647a0);
                        return;
                    }
                    return;
                }
                C0295c c0295c4 = c0295cArr[4];
                if (c0295c4.f3619f != null) {
                    C0304f h5 = AbstractC0313o.h(c0295c4);
                    if (h5 != null) {
                        AbstractC0313o.b(c0304f3, h5, 0);
                        AbstractC0313o.b(c0304f2, c0304f3, -this.f3802b.f3647a0);
                        AbstractC0313o.b(c0304f, c0304f2, c0305g.f3785g);
                        return;
                    }
                    return;
                }
                if ((c0296d7 instanceof s.i) || c0296d7.f3639T == null || c0296d7.i(7).f3619f != null) {
                    return;
                }
                C0296d c0296d11 = this.f3802b;
                AbstractC0313o.b(c0304f2, c0296d11.f3639T.f3653e.h, c0296d11.s());
                AbstractC0313o.b(c0304f, c0304f2, c0305g.f3785g);
                C0296d c0296d12 = this.f3802b;
                if (c0296d12.f3625E) {
                    AbstractC0313o.b(c0304f3, c0304f2, c0296d12.f3647a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.d != 3) {
            c0305g.b(this);
        } else {
            C0296d c0296d13 = this.f3802b;
            int i2 = c0296d13.f3676s;
            if (i2 == 2) {
                C0296d c0296d14 = c0296d13.f3639T;
                if (c0296d14 != null) {
                    C0305g c0305g2 = c0296d14.f3653e.f3804e;
                    c0305g.f3788l.add(c0305g2);
                    c0305g2.f3787k.add(c0305g);
                    c0305g.f3781b = true;
                    c0305g.f3787k.add(c0304f2);
                    c0305g.f3787k.add(c0304f);
                }
            } else if (i2 == 3 && !c0296d13.y()) {
                C0296d c0296d15 = this.f3802b;
                if (c0296d15.f3675r != 3) {
                    C0305g c0305g3 = c0296d15.d.f3804e;
                    c0305g.f3788l.add(c0305g3);
                    c0305g3.f3787k.add(c0305g);
                    c0305g.f3781b = true;
                    c0305g.f3787k.add(c0304f2);
                    c0305g.f3787k.add(c0304f);
                }
            }
        }
        C0296d c0296d16 = this.f3802b;
        C0295c[] c0295cArr2 = c0296d16.f3636Q;
        C0295c c0295c5 = c0295cArr2[2];
        C0295c c0295c6 = c0295c5.f3619f;
        if (c0295c6 != null && c0295cArr2[3].f3619f != null) {
            if (c0296d16.y()) {
                c0304f2.f3784f = this.f3802b.f3636Q[2].e();
                c0304f.f3784f = -this.f3802b.f3636Q[3].e();
            } else {
                C0304f h6 = AbstractC0313o.h(this.f3802b.f3636Q[2]);
                C0304f h7 = AbstractC0313o.h(this.f3802b.f3636Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.f3807j = 4;
            }
            if (this.f3802b.f3625E) {
                c(c0304f3, c0304f2, 1, this.f3795l);
            }
        } else if (c0295c6 != null) {
            C0304f h8 = AbstractC0313o.h(c0295c5);
            if (h8 != null) {
                AbstractC0313o.b(c0304f2, h8, this.f3802b.f3636Q[2].e());
                c(c0304f, c0304f2, 1, c0305g);
                if (this.f3802b.f3625E) {
                    c(c0304f3, c0304f2, 1, this.f3795l);
                }
                if (this.d == 3) {
                    C0296d c0296d17 = this.f3802b;
                    if (c0296d17.f3642W > 0.0f) {
                        C0309k c0309k = c0296d17.d;
                        if (c0309k.d == 3) {
                            c0309k.f3804e.f3787k.add(c0305g);
                            c0305g.f3788l.add(this.f3802b.d.f3804e);
                            c0305g.f3780a = this;
                        }
                    }
                }
            }
        } else {
            C0295c c0295c7 = c0295cArr2[3];
            if (c0295c7.f3619f != null) {
                C0304f h9 = AbstractC0313o.h(c0295c7);
                if (h9 != null) {
                    AbstractC0313o.b(c0304f, h9, -this.f3802b.f3636Q[3].e());
                    c(c0304f2, c0304f, -1, c0305g);
                    if (this.f3802b.f3625E) {
                        c(c0304f3, c0304f2, 1, this.f3795l);
                    }
                }
            } else {
                C0295c c0295c8 = c0295cArr2[4];
                if (c0295c8.f3619f != null) {
                    C0304f h10 = AbstractC0313o.h(c0295c8);
                    if (h10 != null) {
                        AbstractC0313o.b(c0304f3, h10, 0);
                        c(c0304f2, c0304f3, -1, this.f3795l);
                        c(c0304f, c0304f2, 1, c0305g);
                    }
                } else if (!(c0296d16 instanceof s.i) && (c0296d3 = c0296d16.f3639T) != null) {
                    AbstractC0313o.b(c0304f2, c0296d3.f3653e.h, c0296d16.s());
                    c(c0304f, c0304f2, 1, c0305g);
                    if (this.f3802b.f3625E) {
                        c(c0304f3, c0304f2, 1, this.f3795l);
                    }
                    if (this.d == 3) {
                        C0296d c0296d18 = this.f3802b;
                        if (c0296d18.f3642W > 0.0f) {
                            C0309k c0309k2 = c0296d18.d;
                            if (c0309k2.d == 3) {
                                c0309k2.f3804e.f3787k.add(c0305g);
                                c0305g.f3788l.add(this.f3802b.d.f3804e);
                                c0305g.f3780a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c0305g.f3788l.size() == 0) {
            c0305g.f3782c = true;
        }
    }

    @Override // t.AbstractC0313o
    public final void e() {
        C0304f c0304f = this.h;
        if (c0304f.f3786j) {
            this.f3802b.f3645Z = c0304f.f3785g;
        }
    }

    @Override // t.AbstractC0313o
    public final void f() {
        this.f3803c = null;
        this.h.c();
        this.i.c();
        this.f3794k.c();
        this.f3804e.c();
        this.f3806g = false;
    }

    @Override // t.AbstractC0313o
    public final boolean k() {
        return this.d != 3 || this.f3802b.f3676s == 0;
    }

    public final void m() {
        this.f3806g = false;
        C0304f c0304f = this.h;
        c0304f.c();
        c0304f.f3786j = false;
        C0304f c0304f2 = this.i;
        c0304f2.c();
        c0304f2.f3786j = false;
        C0304f c0304f3 = this.f3794k;
        c0304f3.c();
        c0304f3.f3786j = false;
        this.f3804e.f3786j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f3802b.f3659h0;
    }
}
