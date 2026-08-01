package t;

import java.util.ArrayList;
import q.AbstractC0291e;
import s.C0298c;
import s.C0299d;

/* renamed from: t.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0312k extends AbstractC0316o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3787k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f2, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f2) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f2) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f2) + 0.5f);
        int i9 = (int) ((i6 / f2) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0244, code lost:
    
        if (r3 != 1) goto L128;
     */
    @Override // t.InterfaceC0305d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0305d interfaceC0305d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0291e.a(this.f3803j) == 3) {
            C0299d c0299d = this.f3798b;
            l(c0299d.f3623I, c0299d.f3625K, 0);
            return;
        }
        C0308g c0308g = this.f3800e;
        boolean z2 = c0308g.f3782j;
        C0307f c0307f = this.h;
        C0307f c0307f2 = this.i;
        if (!z2 && this.d == 3) {
            C0299d c0299d2 = this.f3798b;
            int i2 = c0299d2.f3670r;
            if (i2 == 2) {
                C0299d c0299d3 = c0299d2.f3634T;
                if (c0299d3 != null) {
                    if (c0299d3.d.f3800e.f3782j) {
                        c0308g.d((int) ((r3.f3781g * c0299d2.f3675w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = c0299d2.f3671s;
                if (i3 == 0 || i3 == 3) {
                    C0314m c0314m = c0299d2.f3648e;
                    C0307f c0307f3 = c0314m.h;
                    C0307f c0307f4 = c0314m.i;
                    boolean z3 = c0299d2.f3623I.f3614f != null;
                    boolean z4 = c0299d2.f3624J.f3614f != null;
                    boolean z5 = c0299d2.f3625K.f3614f != null;
                    boolean z6 = c0299d2.f3626L.f3614f != null;
                    int i4 = c0299d2.f3638X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = c0299d2.f3637W;
                        boolean z7 = c0307f3.f3782j;
                        int[] iArr = f3787k;
                        if (z7 && c0307f4.f3782j) {
                            if (c0307f.f3778c && c0307f2.f3778c) {
                                m(iArr, ((C0307f) c0307f.f3784l.get(0)).f3781g + c0307f.f3780f, ((C0307f) c0307f2.f3784l.get(0)).f3781g - c0307f2.f3780f, c0307f3.f3781g + c0307f3.f3780f, c0307f4.f3781g - c0307f4.f3780f, f5, i4);
                                c0308g.d(iArr[0]);
                                this.f3798b.f3648e.f3800e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = c0307f.f3782j;
                        ArrayList arrayList = c0307f3.f3784l;
                        if (z8 && c0307f2.f3782j) {
                            if (!c0307f3.f3778c || !c0307f4.f3778c) {
                                return;
                            }
                            m(iArr, c0307f.f3781g + c0307f.f3780f, c0307f2.f3781g - c0307f2.f3780f, ((C0307f) arrayList.get(0)).f3781g + c0307f3.f3780f, ((C0307f) c0307f4.f3784l.get(0)).f3781g - c0307f4.f3780f, f5, i4);
                            c0308g.d(iArr[0]);
                            this.f3798b.f3648e.f3800e.d(iArr[1]);
                        }
                        if (!c0307f.f3778c || !c0307f2.f3778c || !c0307f3.f3778c || !c0307f4.f3778c) {
                            return;
                        }
                        m(iArr, ((C0307f) c0307f.f3784l.get(0)).f3781g + c0307f.f3780f, ((C0307f) c0307f2.f3784l.get(0)).f3781g - c0307f2.f3780f, ((C0307f) arrayList.get(0)).f3781g + c0307f3.f3780f, ((C0307f) c0307f4.f3784l.get(0)).f3781g - c0307f4.f3780f, f5, i4);
                        c0308g.d(iArr[0]);
                        this.f3798b.f3648e.f3800e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!c0307f.f3778c || !c0307f2.f3778c) {
                            return;
                        }
                        float f6 = c0299d2.f3637W;
                        int i5 = ((C0307f) c0307f.f3784l.get(0)).f3781g + c0307f.f3780f;
                        int i6 = ((C0307f) c0307f2.f3784l.get(0)).f3781g - c0307f2.f3780f;
                        if (i4 == -1 || i4 == 0) {
                            int g2 = g(i6 - i5, 0);
                            int i7 = (int) ((g2 * f6) + 0.5f);
                            int g3 = g(i7, 1);
                            if (i7 != g3) {
                                g2 = (int) ((g3 / f6) + 0.5f);
                            }
                            c0308g.d(g2);
                            this.f3798b.f3648e.f3800e.d(g3);
                        } else if (i4 == 1) {
                            int g4 = g(i6 - i5, 0);
                            int i8 = (int) ((g4 / f6) + 0.5f);
                            int g5 = g(i8, 1);
                            if (i8 != g5) {
                                g4 = (int) ((g5 * f6) + 0.5f);
                            }
                            c0308g.d(g4);
                            this.f3798b.f3648e.f3800e.d(g5);
                        }
                    } else if (z4 && z6) {
                        if (!c0307f3.f3778c || !c0307f4.f3778c) {
                            return;
                        }
                        float f7 = c0299d2.f3637W;
                        int i9 = ((C0307f) c0307f3.f3784l.get(0)).f3781g + c0307f3.f3780f;
                        int i10 = ((C0307f) c0307f4.f3784l.get(0)).f3781g - c0307f4.f3780f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g6 = g(i10 - i9, 1);
                                int i11 = (int) ((g6 * f7) + 0.5f);
                                int g7 = g(i11, 0);
                                if (i11 != g7) {
                                    g6 = (int) ((g7 / f7) + 0.5f);
                                }
                                c0308g.d(g7);
                                this.f3798b.f3648e.f3800e.d(g6);
                            }
                        }
                        int g8 = g(i10 - i9, 1);
                        int i12 = (int) ((g8 / f7) + 0.5f);
                        int g9 = g(i12, 0);
                        if (i12 != g9) {
                            g8 = (int) ((g9 * f7) + 0.5f);
                        }
                        c0308g.d(g9);
                        this.f3798b.f3648e.f3800e.d(g8);
                    }
                } else {
                    int i13 = c0299d2.f3638X;
                    if (i13 == -1) {
                        f2 = c0299d2.f3648e.f3800e.f3781g;
                        f3 = c0299d2.f3637W;
                    } else if (i13 == 0) {
                        f4 = c0299d2.f3648e.f3800e.f3781g / c0299d2.f3637W;
                        i = (int) (f4 + 0.5f);
                        c0308g.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        c0308g.d(i);
                    } else {
                        f2 = c0299d2.f3648e.f3800e.f3781g;
                        f3 = c0299d2.f3637W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    c0308g.d(i);
                }
            }
        }
        if (c0307f.f3778c && c0307f2.f3778c) {
            if (c0307f.f3782j && c0307f2.f3782j && c0308g.f3782j) {
                return;
            }
            if (!c0308g.f3782j && this.d == 3) {
                C0299d c0299d4 = this.f3798b;
                if (c0299d4.f3670r == 0 && !c0299d4.x()) {
                    C0307f c0307f5 = (C0307f) c0307f.f3784l.get(0);
                    C0307f c0307f6 = (C0307f) c0307f2.f3784l.get(0);
                    int i14 = c0307f5.f3781g + c0307f.f3780f;
                    int i15 = c0307f6.f3781g + c0307f2.f3780f;
                    c0307f.d(i14);
                    c0307f2.d(i15);
                    c0308g.d(i15 - i14);
                    return;
                }
            }
            if (!c0308g.f3782j && this.d == 3 && this.f3797a == 1 && c0307f.f3784l.size() > 0 && c0307f2.f3784l.size() > 0) {
                int min = Math.min((((C0307f) c0307f2.f3784l.get(0)).f3781g + c0307f2.f3780f) - (((C0307f) c0307f.f3784l.get(0)).f3781g + c0307f.f3780f), c0308g.f3785m);
                C0299d c0299d5 = this.f3798b;
                int i16 = c0299d5.f3674v;
                int max = Math.max(c0299d5.f3673u, min);
                if (i16 > 0) {
                    max = Math.min(i16, max);
                }
                c0308g.d(max);
            }
            if (c0308g.f3782j) {
                C0307f c0307f7 = (C0307f) c0307f.f3784l.get(0);
                C0307f c0307f8 = (C0307f) c0307f2.f3784l.get(0);
                int i17 = c0307f7.f3781g;
                int i18 = c0307f.f3780f + i17;
                int i19 = c0307f8.f3781g;
                int i20 = c0307f2.f3780f + i19;
                float f8 = this.f3798b.f3647d0;
                if (c0307f7 == c0307f8) {
                    f8 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                c0307f.d((int) ((((i19 - i17) - c0308g.f3781g) * f8) + i17 + 0.5f));
                c0307f2.d(c0307f.f3781g + c0308g.f3781g);
            }
        }
    }

    @Override // t.AbstractC0316o
    public final void d() {
        C0299d c0299d;
        C0299d c0299d2;
        int i;
        C0299d c0299d3;
        C0299d c0299d4;
        int i2;
        C0299d c0299d5 = this.f3798b;
        boolean z2 = c0299d5.f3641a;
        C0308g c0308g = this.f3800e;
        if (z2) {
            c0308g.d(c0299d5.q());
        }
        boolean z3 = c0308g.f3782j;
        C0307f c0307f = this.i;
        C0307f c0307f2 = this.h;
        if (!z3) {
            C0299d c0299d6 = this.f3798b;
            int i3 = c0299d6.f3668p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c0299d4 = c0299d6.f3634T) != null && ((i2 = c0299d4.f3668p0[0]) == 1 || i2 == 4)) {
                    int q2 = (c0299d4.q() - this.f3798b.f3623I.e()) - this.f3798b.f3625K.e();
                    AbstractC0316o.b(c0307f2, c0299d4.d.h, this.f3798b.f3623I.e());
                    AbstractC0316o.b(c0307f, c0299d4.d.i, -this.f3798b.f3625K.e());
                    c0308g.d(q2);
                    return;
                }
                if (i3 == 1) {
                    c0308g.d(c0299d6.q());
                }
            }
        } else if (this.d == 4 && (c0299d2 = (c0299d = this.f3798b).f3634T) != null && ((i = c0299d2.f3668p0[0]) == 1 || i == 4)) {
            AbstractC0316o.b(c0307f2, c0299d2.d.h, c0299d.f3623I.e());
            AbstractC0316o.b(c0307f, c0299d2.d.i, -this.f3798b.f3625K.e());
            return;
        }
        if (c0308g.f3782j) {
            C0299d c0299d7 = this.f3798b;
            if (c0299d7.f3641a) {
                C0298c[] c0298cArr = c0299d7.f3631Q;
                C0298c c0298c = c0298cArr[0];
                C0298c c0298c2 = c0298c.f3614f;
                if (c0298c2 != null && c0298cArr[1].f3614f != null) {
                    if (c0299d7.x()) {
                        c0307f2.f3780f = this.f3798b.f3631Q[0].e();
                        c0307f.f3780f = -this.f3798b.f3631Q[1].e();
                        return;
                    }
                    C0307f h = AbstractC0316o.h(this.f3798b.f3631Q[0]);
                    if (h != null) {
                        AbstractC0316o.b(c0307f2, h, this.f3798b.f3631Q[0].e());
                    }
                    C0307f h2 = AbstractC0316o.h(this.f3798b.f3631Q[1]);
                    if (h2 != null) {
                        AbstractC0316o.b(c0307f, h2, -this.f3798b.f3631Q[1].e());
                    }
                    c0307f2.f3777b = true;
                    c0307f.f3777b = true;
                    return;
                }
                if (c0298c2 != null) {
                    C0307f h3 = AbstractC0316o.h(c0298c);
                    if (h3 != null) {
                        AbstractC0316o.b(c0307f2, h3, this.f3798b.f3631Q[0].e());
                        AbstractC0316o.b(c0307f, c0307f2, c0308g.f3781g);
                        return;
                    }
                    return;
                }
                C0298c c0298c3 = c0298cArr[1];
                if (c0298c3.f3614f != null) {
                    C0307f h4 = AbstractC0316o.h(c0298c3);
                    if (h4 != null) {
                        AbstractC0316o.b(c0307f, h4, -this.f3798b.f3631Q[1].e());
                        AbstractC0316o.b(c0307f2, c0307f, -c0308g.f3781g);
                        return;
                    }
                    return;
                }
                if ((c0299d7 instanceof s.i) || c0299d7.f3634T == null || c0299d7.i(7).f3614f != null) {
                    return;
                }
                C0299d c0299d8 = this.f3798b;
                AbstractC0316o.b(c0307f2, c0299d8.f3634T.d.h, c0299d8.r());
                AbstractC0316o.b(c0307f, c0307f2, c0308g.f3781g);
                return;
            }
        }
        if (this.d == 3) {
            C0299d c0299d9 = this.f3798b;
            int i4 = c0299d9.f3670r;
            if (i4 == 2) {
                C0299d c0299d10 = c0299d9.f3634T;
                if (c0299d10 != null) {
                    C0308g c0308g2 = c0299d10.f3648e.f3800e;
                    c0308g.f3784l.add(c0308g2);
                    c0308g2.f3783k.add(c0308g);
                    c0308g.f3777b = true;
                    c0308g.f3783k.add(c0307f2);
                    c0308g.f3783k.add(c0307f);
                }
            } else if (i4 == 3) {
                if (c0299d9.f3671s == 3) {
                    c0307f2.f3776a = this;
                    c0307f.f3776a = this;
                    C0314m c0314m = c0299d9.f3648e;
                    c0314m.h.f3776a = this;
                    c0314m.i.f3776a = this;
                    c0308g.f3776a = this;
                    if (c0299d9.y()) {
                        c0308g.f3784l.add(this.f3798b.f3648e.f3800e);
                        this.f3798b.f3648e.f3800e.f3783k.add(c0308g);
                        C0314m c0314m2 = this.f3798b.f3648e;
                        c0314m2.f3800e.f3776a = this;
                        c0308g.f3784l.add(c0314m2.h);
                        c0308g.f3784l.add(this.f3798b.f3648e.i);
                        this.f3798b.f3648e.h.f3783k.add(c0308g);
                        this.f3798b.f3648e.i.f3783k.add(c0308g);
                    } else if (this.f3798b.x()) {
                        this.f3798b.f3648e.f3800e.f3784l.add(c0308g);
                        c0308g.f3783k.add(this.f3798b.f3648e.f3800e);
                    } else {
                        this.f3798b.f3648e.f3800e.f3784l.add(c0308g);
                    }
                } else {
                    C0308g c0308g3 = c0299d9.f3648e.f3800e;
                    c0308g.f3784l.add(c0308g3);
                    c0308g3.f3783k.add(c0308g);
                    this.f3798b.f3648e.h.f3783k.add(c0308g);
                    this.f3798b.f3648e.i.f3783k.add(c0308g);
                    c0308g.f3777b = true;
                    c0308g.f3783k.add(c0307f2);
                    c0308g.f3783k.add(c0307f);
                    c0307f2.f3784l.add(c0308g);
                    c0307f.f3784l.add(c0308g);
                }
            }
        }
        C0299d c0299d11 = this.f3798b;
        C0298c[] c0298cArr2 = c0299d11.f3631Q;
        C0298c c0298c4 = c0298cArr2[0];
        C0298c c0298c5 = c0298c4.f3614f;
        if (c0298c5 != null && c0298cArr2[1].f3614f != null) {
            if (c0299d11.x()) {
                c0307f2.f3780f = this.f3798b.f3631Q[0].e();
                c0307f.f3780f = -this.f3798b.f3631Q[1].e();
                return;
            }
            C0307f h5 = AbstractC0316o.h(this.f3798b.f3631Q[0]);
            C0307f h6 = AbstractC0316o.h(this.f3798b.f3631Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.f3803j = 4;
            return;
        }
        if (c0298c5 != null) {
            C0307f h7 = AbstractC0316o.h(c0298c4);
            if (h7 != null) {
                AbstractC0316o.b(c0307f2, h7, this.f3798b.f3631Q[0].e());
                c(c0307f, c0307f2, 1, c0308g);
                return;
            }
            return;
        }
        C0298c c0298c6 = c0298cArr2[1];
        if (c0298c6.f3614f != null) {
            C0307f h8 = AbstractC0316o.h(c0298c6);
            if (h8 != null) {
                AbstractC0316o.b(c0307f, h8, -this.f3798b.f3631Q[1].e());
                c(c0307f2, c0307f, -1, c0308g);
                return;
            }
            return;
        }
        if ((c0299d11 instanceof s.i) || (c0299d3 = c0299d11.f3634T) == null) {
            return;
        }
        AbstractC0316o.b(c0307f2, c0299d3.d.h, c0299d11.r());
        c(c0307f, c0307f2, 1, c0308g);
    }

    @Override // t.AbstractC0316o
    public final void e() {
        C0307f c0307f = this.h;
        if (c0307f.f3782j) {
            this.f3798b.f3639Y = c0307f.f3781g;
        }
    }

    @Override // t.AbstractC0316o
    public final void f() {
        this.f3799c = null;
        this.h.c();
        this.i.c();
        this.f3800e.c();
        this.f3802g = false;
    }

    @Override // t.AbstractC0316o
    public final boolean k() {
        return this.d != 3 || this.f3798b.f3670r == 0;
    }

    public final void n() {
        this.f3802g = false;
        C0307f c0307f = this.h;
        c0307f.c();
        c0307f.f3782j = false;
        C0307f c0307f2 = this.i;
        c0307f2.c();
        c0307f2.f3782j = false;
        this.f3800e.f3782j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f3798b.f3654h0;
    }
}
