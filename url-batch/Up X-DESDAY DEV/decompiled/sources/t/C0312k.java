package t;

import java.util.ArrayList;
import q.AbstractC0291e;
import s.C0298c;
import s.C0299d;

/* renamed from: t.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0312k extends AbstractC0316o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3765k = new int[2];

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
        if (AbstractC0291e.a(this.f3781j) == 3) {
            C0299d c0299d = this.f3776b;
            l(c0299d.f3601I, c0299d.f3603K, 0);
            return;
        }
        C0308g c0308g = this.f3778e;
        boolean z2 = c0308g.f3760j;
        C0307f c0307f = this.h;
        C0307f c0307f2 = this.i;
        if (!z2 && this.d == 3) {
            C0299d c0299d2 = this.f3776b;
            int i2 = c0299d2.f3648r;
            if (i2 == 2) {
                C0299d c0299d3 = c0299d2.f3612T;
                if (c0299d3 != null) {
                    if (c0299d3.d.f3778e.f3760j) {
                        c0308g.d((int) ((r3.f3759g * c0299d2.f3653w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = c0299d2.f3649s;
                if (i3 == 0 || i3 == 3) {
                    C0314m c0314m = c0299d2.f3626e;
                    C0307f c0307f3 = c0314m.h;
                    C0307f c0307f4 = c0314m.i;
                    boolean z3 = c0299d2.f3601I.f3592f != null;
                    boolean z4 = c0299d2.f3602J.f3592f != null;
                    boolean z5 = c0299d2.f3603K.f3592f != null;
                    boolean z6 = c0299d2.f3604L.f3592f != null;
                    int i4 = c0299d2.f3616X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = c0299d2.f3615W;
                        boolean z7 = c0307f3.f3760j;
                        int[] iArr = f3765k;
                        if (z7 && c0307f4.f3760j) {
                            if (c0307f.f3756c && c0307f2.f3756c) {
                                m(iArr, ((C0307f) c0307f.f3762l.get(0)).f3759g + c0307f.f3758f, ((C0307f) c0307f2.f3762l.get(0)).f3759g - c0307f2.f3758f, c0307f3.f3759g + c0307f3.f3758f, c0307f4.f3759g - c0307f4.f3758f, f5, i4);
                                c0308g.d(iArr[0]);
                                this.f3776b.f3626e.f3778e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = c0307f.f3760j;
                        ArrayList arrayList = c0307f3.f3762l;
                        if (z8 && c0307f2.f3760j) {
                            if (!c0307f3.f3756c || !c0307f4.f3756c) {
                                return;
                            }
                            m(iArr, c0307f.f3759g + c0307f.f3758f, c0307f2.f3759g - c0307f2.f3758f, ((C0307f) arrayList.get(0)).f3759g + c0307f3.f3758f, ((C0307f) c0307f4.f3762l.get(0)).f3759g - c0307f4.f3758f, f5, i4);
                            c0308g.d(iArr[0]);
                            this.f3776b.f3626e.f3778e.d(iArr[1]);
                        }
                        if (!c0307f.f3756c || !c0307f2.f3756c || !c0307f3.f3756c || !c0307f4.f3756c) {
                            return;
                        }
                        m(iArr, ((C0307f) c0307f.f3762l.get(0)).f3759g + c0307f.f3758f, ((C0307f) c0307f2.f3762l.get(0)).f3759g - c0307f2.f3758f, ((C0307f) arrayList.get(0)).f3759g + c0307f3.f3758f, ((C0307f) c0307f4.f3762l.get(0)).f3759g - c0307f4.f3758f, f5, i4);
                        c0308g.d(iArr[0]);
                        this.f3776b.f3626e.f3778e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!c0307f.f3756c || !c0307f2.f3756c) {
                            return;
                        }
                        float f6 = c0299d2.f3615W;
                        int i5 = ((C0307f) c0307f.f3762l.get(0)).f3759g + c0307f.f3758f;
                        int i6 = ((C0307f) c0307f2.f3762l.get(0)).f3759g - c0307f2.f3758f;
                        if (i4 == -1 || i4 == 0) {
                            int g2 = g(i6 - i5, 0);
                            int i7 = (int) ((g2 * f6) + 0.5f);
                            int g3 = g(i7, 1);
                            if (i7 != g3) {
                                g2 = (int) ((g3 / f6) + 0.5f);
                            }
                            c0308g.d(g2);
                            this.f3776b.f3626e.f3778e.d(g3);
                        } else if (i4 == 1) {
                            int g4 = g(i6 - i5, 0);
                            int i8 = (int) ((g4 / f6) + 0.5f);
                            int g5 = g(i8, 1);
                            if (i8 != g5) {
                                g4 = (int) ((g5 * f6) + 0.5f);
                            }
                            c0308g.d(g4);
                            this.f3776b.f3626e.f3778e.d(g5);
                        }
                    } else if (z4 && z6) {
                        if (!c0307f3.f3756c || !c0307f4.f3756c) {
                            return;
                        }
                        float f7 = c0299d2.f3615W;
                        int i9 = ((C0307f) c0307f3.f3762l.get(0)).f3759g + c0307f3.f3758f;
                        int i10 = ((C0307f) c0307f4.f3762l.get(0)).f3759g - c0307f4.f3758f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g6 = g(i10 - i9, 1);
                                int i11 = (int) ((g6 * f7) + 0.5f);
                                int g7 = g(i11, 0);
                                if (i11 != g7) {
                                    g6 = (int) ((g7 / f7) + 0.5f);
                                }
                                c0308g.d(g7);
                                this.f3776b.f3626e.f3778e.d(g6);
                            }
                        }
                        int g8 = g(i10 - i9, 1);
                        int i12 = (int) ((g8 / f7) + 0.5f);
                        int g9 = g(i12, 0);
                        if (i12 != g9) {
                            g8 = (int) ((g9 * f7) + 0.5f);
                        }
                        c0308g.d(g9);
                        this.f3776b.f3626e.f3778e.d(g8);
                    }
                } else {
                    int i13 = c0299d2.f3616X;
                    if (i13 == -1) {
                        f2 = c0299d2.f3626e.f3778e.f3759g;
                        f3 = c0299d2.f3615W;
                    } else if (i13 == 0) {
                        f4 = c0299d2.f3626e.f3778e.f3759g / c0299d2.f3615W;
                        i = (int) (f4 + 0.5f);
                        c0308g.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        c0308g.d(i);
                    } else {
                        f2 = c0299d2.f3626e.f3778e.f3759g;
                        f3 = c0299d2.f3615W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    c0308g.d(i);
                }
            }
        }
        if (c0307f.f3756c && c0307f2.f3756c) {
            if (c0307f.f3760j && c0307f2.f3760j && c0308g.f3760j) {
                return;
            }
            if (!c0308g.f3760j && this.d == 3) {
                C0299d c0299d4 = this.f3776b;
                if (c0299d4.f3648r == 0 && !c0299d4.x()) {
                    C0307f c0307f5 = (C0307f) c0307f.f3762l.get(0);
                    C0307f c0307f6 = (C0307f) c0307f2.f3762l.get(0);
                    int i14 = c0307f5.f3759g + c0307f.f3758f;
                    int i15 = c0307f6.f3759g + c0307f2.f3758f;
                    c0307f.d(i14);
                    c0307f2.d(i15);
                    c0308g.d(i15 - i14);
                    return;
                }
            }
            if (!c0308g.f3760j && this.d == 3 && this.f3775a == 1 && c0307f.f3762l.size() > 0 && c0307f2.f3762l.size() > 0) {
                int min = Math.min((((C0307f) c0307f2.f3762l.get(0)).f3759g + c0307f2.f3758f) - (((C0307f) c0307f.f3762l.get(0)).f3759g + c0307f.f3758f), c0308g.f3763m);
                C0299d c0299d5 = this.f3776b;
                int i16 = c0299d5.f3652v;
                int max = Math.max(c0299d5.f3651u, min);
                if (i16 > 0) {
                    max = Math.min(i16, max);
                }
                c0308g.d(max);
            }
            if (c0308g.f3760j) {
                C0307f c0307f7 = (C0307f) c0307f.f3762l.get(0);
                C0307f c0307f8 = (C0307f) c0307f2.f3762l.get(0);
                int i17 = c0307f7.f3759g;
                int i18 = c0307f.f3758f + i17;
                int i19 = c0307f8.f3759g;
                int i20 = c0307f2.f3758f + i19;
                float f8 = this.f3776b.f3625d0;
                if (c0307f7 == c0307f8) {
                    f8 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                c0307f.d((int) ((((i19 - i17) - c0308g.f3759g) * f8) + i17 + 0.5f));
                c0307f2.d(c0307f.f3759g + c0308g.f3759g);
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
        C0299d c0299d5 = this.f3776b;
        boolean z2 = c0299d5.f3619a;
        C0308g c0308g = this.f3778e;
        if (z2) {
            c0308g.d(c0299d5.q());
        }
        boolean z3 = c0308g.f3760j;
        C0307f c0307f = this.i;
        C0307f c0307f2 = this.h;
        if (!z3) {
            C0299d c0299d6 = this.f3776b;
            int i3 = c0299d6.f3646p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c0299d4 = c0299d6.f3612T) != null && ((i2 = c0299d4.f3646p0[0]) == 1 || i2 == 4)) {
                    int q2 = (c0299d4.q() - this.f3776b.f3601I.e()) - this.f3776b.f3603K.e();
                    AbstractC0316o.b(c0307f2, c0299d4.d.h, this.f3776b.f3601I.e());
                    AbstractC0316o.b(c0307f, c0299d4.d.i, -this.f3776b.f3603K.e());
                    c0308g.d(q2);
                    return;
                }
                if (i3 == 1) {
                    c0308g.d(c0299d6.q());
                }
            }
        } else if (this.d == 4 && (c0299d2 = (c0299d = this.f3776b).f3612T) != null && ((i = c0299d2.f3646p0[0]) == 1 || i == 4)) {
            AbstractC0316o.b(c0307f2, c0299d2.d.h, c0299d.f3601I.e());
            AbstractC0316o.b(c0307f, c0299d2.d.i, -this.f3776b.f3603K.e());
            return;
        }
        if (c0308g.f3760j) {
            C0299d c0299d7 = this.f3776b;
            if (c0299d7.f3619a) {
                C0298c[] c0298cArr = c0299d7.f3609Q;
                C0298c c0298c = c0298cArr[0];
                C0298c c0298c2 = c0298c.f3592f;
                if (c0298c2 != null && c0298cArr[1].f3592f != null) {
                    if (c0299d7.x()) {
                        c0307f2.f3758f = this.f3776b.f3609Q[0].e();
                        c0307f.f3758f = -this.f3776b.f3609Q[1].e();
                        return;
                    }
                    C0307f h = AbstractC0316o.h(this.f3776b.f3609Q[0]);
                    if (h != null) {
                        AbstractC0316o.b(c0307f2, h, this.f3776b.f3609Q[0].e());
                    }
                    C0307f h2 = AbstractC0316o.h(this.f3776b.f3609Q[1]);
                    if (h2 != null) {
                        AbstractC0316o.b(c0307f, h2, -this.f3776b.f3609Q[1].e());
                    }
                    c0307f2.f3755b = true;
                    c0307f.f3755b = true;
                    return;
                }
                if (c0298c2 != null) {
                    C0307f h3 = AbstractC0316o.h(c0298c);
                    if (h3 != null) {
                        AbstractC0316o.b(c0307f2, h3, this.f3776b.f3609Q[0].e());
                        AbstractC0316o.b(c0307f, c0307f2, c0308g.f3759g);
                        return;
                    }
                    return;
                }
                C0298c c0298c3 = c0298cArr[1];
                if (c0298c3.f3592f != null) {
                    C0307f h4 = AbstractC0316o.h(c0298c3);
                    if (h4 != null) {
                        AbstractC0316o.b(c0307f, h4, -this.f3776b.f3609Q[1].e());
                        AbstractC0316o.b(c0307f2, c0307f, -c0308g.f3759g);
                        return;
                    }
                    return;
                }
                if ((c0299d7 instanceof s.i) || c0299d7.f3612T == null || c0299d7.i(7).f3592f != null) {
                    return;
                }
                C0299d c0299d8 = this.f3776b;
                AbstractC0316o.b(c0307f2, c0299d8.f3612T.d.h, c0299d8.r());
                AbstractC0316o.b(c0307f, c0307f2, c0308g.f3759g);
                return;
            }
        }
        if (this.d == 3) {
            C0299d c0299d9 = this.f3776b;
            int i4 = c0299d9.f3648r;
            if (i4 == 2) {
                C0299d c0299d10 = c0299d9.f3612T;
                if (c0299d10 != null) {
                    C0308g c0308g2 = c0299d10.f3626e.f3778e;
                    c0308g.f3762l.add(c0308g2);
                    c0308g2.f3761k.add(c0308g);
                    c0308g.f3755b = true;
                    c0308g.f3761k.add(c0307f2);
                    c0308g.f3761k.add(c0307f);
                }
            } else if (i4 == 3) {
                if (c0299d9.f3649s == 3) {
                    c0307f2.f3754a = this;
                    c0307f.f3754a = this;
                    C0314m c0314m = c0299d9.f3626e;
                    c0314m.h.f3754a = this;
                    c0314m.i.f3754a = this;
                    c0308g.f3754a = this;
                    if (c0299d9.y()) {
                        c0308g.f3762l.add(this.f3776b.f3626e.f3778e);
                        this.f3776b.f3626e.f3778e.f3761k.add(c0308g);
                        C0314m c0314m2 = this.f3776b.f3626e;
                        c0314m2.f3778e.f3754a = this;
                        c0308g.f3762l.add(c0314m2.h);
                        c0308g.f3762l.add(this.f3776b.f3626e.i);
                        this.f3776b.f3626e.h.f3761k.add(c0308g);
                        this.f3776b.f3626e.i.f3761k.add(c0308g);
                    } else if (this.f3776b.x()) {
                        this.f3776b.f3626e.f3778e.f3762l.add(c0308g);
                        c0308g.f3761k.add(this.f3776b.f3626e.f3778e);
                    } else {
                        this.f3776b.f3626e.f3778e.f3762l.add(c0308g);
                    }
                } else {
                    C0308g c0308g3 = c0299d9.f3626e.f3778e;
                    c0308g.f3762l.add(c0308g3);
                    c0308g3.f3761k.add(c0308g);
                    this.f3776b.f3626e.h.f3761k.add(c0308g);
                    this.f3776b.f3626e.i.f3761k.add(c0308g);
                    c0308g.f3755b = true;
                    c0308g.f3761k.add(c0307f2);
                    c0308g.f3761k.add(c0307f);
                    c0307f2.f3762l.add(c0308g);
                    c0307f.f3762l.add(c0308g);
                }
            }
        }
        C0299d c0299d11 = this.f3776b;
        C0298c[] c0298cArr2 = c0299d11.f3609Q;
        C0298c c0298c4 = c0298cArr2[0];
        C0298c c0298c5 = c0298c4.f3592f;
        if (c0298c5 != null && c0298cArr2[1].f3592f != null) {
            if (c0299d11.x()) {
                c0307f2.f3758f = this.f3776b.f3609Q[0].e();
                c0307f.f3758f = -this.f3776b.f3609Q[1].e();
                return;
            }
            C0307f h5 = AbstractC0316o.h(this.f3776b.f3609Q[0]);
            C0307f h6 = AbstractC0316o.h(this.f3776b.f3609Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.f3781j = 4;
            return;
        }
        if (c0298c5 != null) {
            C0307f h7 = AbstractC0316o.h(c0298c4);
            if (h7 != null) {
                AbstractC0316o.b(c0307f2, h7, this.f3776b.f3609Q[0].e());
                c(c0307f, c0307f2, 1, c0308g);
                return;
            }
            return;
        }
        C0298c c0298c6 = c0298cArr2[1];
        if (c0298c6.f3592f != null) {
            C0307f h8 = AbstractC0316o.h(c0298c6);
            if (h8 != null) {
                AbstractC0316o.b(c0307f, h8, -this.f3776b.f3609Q[1].e());
                c(c0307f2, c0307f, -1, c0308g);
                return;
            }
            return;
        }
        if ((c0299d11 instanceof s.i) || (c0299d3 = c0299d11.f3612T) == null) {
            return;
        }
        AbstractC0316o.b(c0307f2, c0299d3.d.h, c0299d11.r());
        c(c0307f, c0307f2, 1, c0308g);
    }

    @Override // t.AbstractC0316o
    public final void e() {
        C0307f c0307f = this.h;
        if (c0307f.f3760j) {
            this.f3776b.f3617Y = c0307f.f3759g;
        }
    }

    @Override // t.AbstractC0316o
    public final void f() {
        this.f3777c = null;
        this.h.c();
        this.i.c();
        this.f3778e.c();
        this.f3780g = false;
    }

    @Override // t.AbstractC0316o
    public final boolean k() {
        return this.d != 3 || this.f3776b.f3648r == 0;
    }

    public final void n() {
        this.f3780g = false;
        C0307f c0307f = this.h;
        c0307f.c();
        c0307f.f3760j = false;
        C0307f c0307f2 = this.i;
        c0307f2.c();
        c0307f2.f3760j = false;
        this.f3778e.f3760j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f3776b.f3632h0;
    }
}
