package t;

import java.util.ArrayList;
import q.AbstractC0321e;

/* loaded from: classes.dex */
public final class k extends o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3750k = new int[2];

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
    @Override // t.InterfaceC0333d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0333d interfaceC0333d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0321e.a(this.f3766j) == 3) {
            s.d dVar = this.f3761b;
            l(dVar.f3510I, dVar.f3512K, 0);
            return;
        }
        g gVar = this.f3763e;
        boolean z2 = gVar.f3745j;
        C0335f c0335f = this.h;
        C0335f c0335f2 = this.i;
        if (!z2 && this.d == 3) {
            s.d dVar2 = this.f3761b;
            int i2 = dVar2.f3557r;
            if (i2 == 2) {
                s.d dVar3 = dVar2.f3521T;
                if (dVar3 != null) {
                    if (dVar3.d.f3763e.f3745j) {
                        gVar.d((int) ((r3.f3744g * dVar2.f3562w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = dVar2.f3558s;
                if (i3 == 0 || i3 == 3) {
                    m mVar = dVar2.f3535e;
                    C0335f c0335f3 = mVar.h;
                    C0335f c0335f4 = mVar.i;
                    boolean z3 = dVar2.f3510I.f3501f != null;
                    boolean z4 = dVar2.f3511J.f3501f != null;
                    boolean z5 = dVar2.f3512K.f3501f != null;
                    boolean z6 = dVar2.f3513L.f3501f != null;
                    int i4 = dVar2.f3525X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = dVar2.f3524W;
                        boolean z7 = c0335f3.f3745j;
                        int[] iArr = f3750k;
                        if (z7 && c0335f4.f3745j) {
                            if (c0335f.f3741c && c0335f2.f3741c) {
                                m(iArr, ((C0335f) c0335f.f3747l.get(0)).f3744g + c0335f.f3743f, ((C0335f) c0335f2.f3747l.get(0)).f3744g - c0335f2.f3743f, c0335f3.f3744g + c0335f3.f3743f, c0335f4.f3744g - c0335f4.f3743f, f5, i4);
                                gVar.d(iArr[0]);
                                this.f3761b.f3535e.f3763e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = c0335f.f3745j;
                        ArrayList arrayList = c0335f3.f3747l;
                        if (z8 && c0335f2.f3745j) {
                            if (!c0335f3.f3741c || !c0335f4.f3741c) {
                                return;
                            }
                            m(iArr, c0335f.f3744g + c0335f.f3743f, c0335f2.f3744g - c0335f2.f3743f, ((C0335f) arrayList.get(0)).f3744g + c0335f3.f3743f, ((C0335f) c0335f4.f3747l.get(0)).f3744g - c0335f4.f3743f, f5, i4);
                            gVar.d(iArr[0]);
                            this.f3761b.f3535e.f3763e.d(iArr[1]);
                        }
                        if (!c0335f.f3741c || !c0335f2.f3741c || !c0335f3.f3741c || !c0335f4.f3741c) {
                            return;
                        }
                        m(iArr, ((C0335f) c0335f.f3747l.get(0)).f3744g + c0335f.f3743f, ((C0335f) c0335f2.f3747l.get(0)).f3744g - c0335f2.f3743f, ((C0335f) arrayList.get(0)).f3744g + c0335f3.f3743f, ((C0335f) c0335f4.f3747l.get(0)).f3744g - c0335f4.f3743f, f5, i4);
                        gVar.d(iArr[0]);
                        this.f3761b.f3535e.f3763e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!c0335f.f3741c || !c0335f2.f3741c) {
                            return;
                        }
                        float f6 = dVar2.f3524W;
                        int i5 = ((C0335f) c0335f.f3747l.get(0)).f3744g + c0335f.f3743f;
                        int i6 = ((C0335f) c0335f2.f3747l.get(0)).f3744g - c0335f2.f3743f;
                        if (i4 == -1 || i4 == 0) {
                            int g2 = g(i6 - i5, 0);
                            int i7 = (int) ((g2 * f6) + 0.5f);
                            int g3 = g(i7, 1);
                            if (i7 != g3) {
                                g2 = (int) ((g3 / f6) + 0.5f);
                            }
                            gVar.d(g2);
                            this.f3761b.f3535e.f3763e.d(g3);
                        } else if (i4 == 1) {
                            int g4 = g(i6 - i5, 0);
                            int i8 = (int) ((g4 / f6) + 0.5f);
                            int g5 = g(i8, 1);
                            if (i8 != g5) {
                                g4 = (int) ((g5 * f6) + 0.5f);
                            }
                            gVar.d(g4);
                            this.f3761b.f3535e.f3763e.d(g5);
                        }
                    } else if (z4 && z6) {
                        if (!c0335f3.f3741c || !c0335f4.f3741c) {
                            return;
                        }
                        float f7 = dVar2.f3524W;
                        int i9 = ((C0335f) c0335f3.f3747l.get(0)).f3744g + c0335f3.f3743f;
                        int i10 = ((C0335f) c0335f4.f3747l.get(0)).f3744g - c0335f4.f3743f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g6 = g(i10 - i9, 1);
                                int i11 = (int) ((g6 * f7) + 0.5f);
                                int g7 = g(i11, 0);
                                if (i11 != g7) {
                                    g6 = (int) ((g7 / f7) + 0.5f);
                                }
                                gVar.d(g7);
                                this.f3761b.f3535e.f3763e.d(g6);
                            }
                        }
                        int g8 = g(i10 - i9, 1);
                        int i12 = (int) ((g8 / f7) + 0.5f);
                        int g9 = g(i12, 0);
                        if (i12 != g9) {
                            g8 = (int) ((g9 * f7) + 0.5f);
                        }
                        gVar.d(g9);
                        this.f3761b.f3535e.f3763e.d(g8);
                    }
                } else {
                    int i13 = dVar2.f3525X;
                    if (i13 == -1) {
                        f2 = dVar2.f3535e.f3763e.f3744g;
                        f3 = dVar2.f3524W;
                    } else if (i13 == 0) {
                        f4 = dVar2.f3535e.f3763e.f3744g / dVar2.f3524W;
                        i = (int) (f4 + 0.5f);
                        gVar.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        gVar.d(i);
                    } else {
                        f2 = dVar2.f3535e.f3763e.f3744g;
                        f3 = dVar2.f3524W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    gVar.d(i);
                }
            }
        }
        if (c0335f.f3741c && c0335f2.f3741c) {
            if (c0335f.f3745j && c0335f2.f3745j && gVar.f3745j) {
                return;
            }
            if (!gVar.f3745j && this.d == 3) {
                s.d dVar4 = this.f3761b;
                if (dVar4.f3557r == 0 && !dVar4.x()) {
                    C0335f c0335f5 = (C0335f) c0335f.f3747l.get(0);
                    C0335f c0335f6 = (C0335f) c0335f2.f3747l.get(0);
                    int i14 = c0335f5.f3744g + c0335f.f3743f;
                    int i15 = c0335f6.f3744g + c0335f2.f3743f;
                    c0335f.d(i14);
                    c0335f2.d(i15);
                    gVar.d(i15 - i14);
                    return;
                }
            }
            if (!gVar.f3745j && this.d == 3 && this.f3760a == 1 && c0335f.f3747l.size() > 0 && c0335f2.f3747l.size() > 0) {
                int min = Math.min((((C0335f) c0335f2.f3747l.get(0)).f3744g + c0335f2.f3743f) - (((C0335f) c0335f.f3747l.get(0)).f3744g + c0335f.f3743f), gVar.f3748m);
                s.d dVar5 = this.f3761b;
                int i16 = dVar5.f3561v;
                int max = Math.max(dVar5.f3560u, min);
                if (i16 > 0) {
                    max = Math.min(i16, max);
                }
                gVar.d(max);
            }
            if (gVar.f3745j) {
                C0335f c0335f7 = (C0335f) c0335f.f3747l.get(0);
                C0335f c0335f8 = (C0335f) c0335f2.f3747l.get(0);
                int i17 = c0335f7.f3744g;
                int i18 = c0335f.f3743f + i17;
                int i19 = c0335f8.f3744g;
                int i20 = c0335f2.f3743f + i19;
                float f8 = this.f3761b.f3534d0;
                if (c0335f7 == c0335f8) {
                    f8 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                c0335f.d((int) ((((i19 - i17) - gVar.f3744g) * f8) + i17 + 0.5f));
                c0335f2.d(c0335f.f3744g + gVar.f3744g);
            }
        }
    }

    @Override // t.o
    public final void d() {
        s.d dVar;
        s.d dVar2;
        int i;
        s.d dVar3;
        s.d dVar4;
        int i2;
        s.d dVar5 = this.f3761b;
        boolean z2 = dVar5.f3528a;
        g gVar = this.f3763e;
        if (z2) {
            gVar.d(dVar5.q());
        }
        boolean z3 = gVar.f3745j;
        C0335f c0335f = this.i;
        C0335f c0335f2 = this.h;
        if (!z3) {
            s.d dVar6 = this.f3761b;
            int i3 = dVar6.f3555p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (dVar4 = dVar6.f3521T) != null && ((i2 = dVar4.f3555p0[0]) == 1 || i2 == 4)) {
                    int q2 = (dVar4.q() - this.f3761b.f3510I.e()) - this.f3761b.f3512K.e();
                    o.b(c0335f2, dVar4.d.h, this.f3761b.f3510I.e());
                    o.b(c0335f, dVar4.d.i, -this.f3761b.f3512K.e());
                    gVar.d(q2);
                    return;
                }
                if (i3 == 1) {
                    gVar.d(dVar6.q());
                }
            }
        } else if (this.d == 4 && (dVar2 = (dVar = this.f3761b).f3521T) != null && ((i = dVar2.f3555p0[0]) == 1 || i == 4)) {
            o.b(c0335f2, dVar2.d.h, dVar.f3510I.e());
            o.b(c0335f, dVar2.d.i, -this.f3761b.f3512K.e());
            return;
        }
        if (gVar.f3745j) {
            s.d dVar7 = this.f3761b;
            if (dVar7.f3528a) {
                s.c[] cVarArr = dVar7.f3518Q;
                s.c cVar = cVarArr[0];
                s.c cVar2 = cVar.f3501f;
                if (cVar2 != null && cVarArr[1].f3501f != null) {
                    if (dVar7.x()) {
                        c0335f2.f3743f = this.f3761b.f3518Q[0].e();
                        c0335f.f3743f = -this.f3761b.f3518Q[1].e();
                        return;
                    }
                    C0335f h = o.h(this.f3761b.f3518Q[0]);
                    if (h != null) {
                        o.b(c0335f2, h, this.f3761b.f3518Q[0].e());
                    }
                    C0335f h2 = o.h(this.f3761b.f3518Q[1]);
                    if (h2 != null) {
                        o.b(c0335f, h2, -this.f3761b.f3518Q[1].e());
                    }
                    c0335f2.f3740b = true;
                    c0335f.f3740b = true;
                    return;
                }
                if (cVar2 != null) {
                    C0335f h3 = o.h(cVar);
                    if (h3 != null) {
                        o.b(c0335f2, h3, this.f3761b.f3518Q[0].e());
                        o.b(c0335f, c0335f2, gVar.f3744g);
                        return;
                    }
                    return;
                }
                s.c cVar3 = cVarArr[1];
                if (cVar3.f3501f != null) {
                    C0335f h4 = o.h(cVar3);
                    if (h4 != null) {
                        o.b(c0335f, h4, -this.f3761b.f3518Q[1].e());
                        o.b(c0335f2, c0335f, -gVar.f3744g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof s.i) || dVar7.f3521T == null || dVar7.i(7).f3501f != null) {
                    return;
                }
                s.d dVar8 = this.f3761b;
                o.b(c0335f2, dVar8.f3521T.d.h, dVar8.r());
                o.b(c0335f, c0335f2, gVar.f3744g);
                return;
            }
        }
        if (this.d == 3) {
            s.d dVar9 = this.f3761b;
            int i4 = dVar9.f3557r;
            if (i4 == 2) {
                s.d dVar10 = dVar9.f3521T;
                if (dVar10 != null) {
                    g gVar2 = dVar10.f3535e.f3763e;
                    gVar.f3747l.add(gVar2);
                    gVar2.f3746k.add(gVar);
                    gVar.f3740b = true;
                    gVar.f3746k.add(c0335f2);
                    gVar.f3746k.add(c0335f);
                }
            } else if (i4 == 3) {
                if (dVar9.f3558s == 3) {
                    c0335f2.f3739a = this;
                    c0335f.f3739a = this;
                    m mVar = dVar9.f3535e;
                    mVar.h.f3739a = this;
                    mVar.i.f3739a = this;
                    gVar.f3739a = this;
                    if (dVar9.y()) {
                        gVar.f3747l.add(this.f3761b.f3535e.f3763e);
                        this.f3761b.f3535e.f3763e.f3746k.add(gVar);
                        m mVar2 = this.f3761b.f3535e;
                        mVar2.f3763e.f3739a = this;
                        gVar.f3747l.add(mVar2.h);
                        gVar.f3747l.add(this.f3761b.f3535e.i);
                        this.f3761b.f3535e.h.f3746k.add(gVar);
                        this.f3761b.f3535e.i.f3746k.add(gVar);
                    } else if (this.f3761b.x()) {
                        this.f3761b.f3535e.f3763e.f3747l.add(gVar);
                        gVar.f3746k.add(this.f3761b.f3535e.f3763e);
                    } else {
                        this.f3761b.f3535e.f3763e.f3747l.add(gVar);
                    }
                } else {
                    g gVar3 = dVar9.f3535e.f3763e;
                    gVar.f3747l.add(gVar3);
                    gVar3.f3746k.add(gVar);
                    this.f3761b.f3535e.h.f3746k.add(gVar);
                    this.f3761b.f3535e.i.f3746k.add(gVar);
                    gVar.f3740b = true;
                    gVar.f3746k.add(c0335f2);
                    gVar.f3746k.add(c0335f);
                    c0335f2.f3747l.add(gVar);
                    c0335f.f3747l.add(gVar);
                }
            }
        }
        s.d dVar11 = this.f3761b;
        s.c[] cVarArr2 = dVar11.f3518Q;
        s.c cVar4 = cVarArr2[0];
        s.c cVar5 = cVar4.f3501f;
        if (cVar5 != null && cVarArr2[1].f3501f != null) {
            if (dVar11.x()) {
                c0335f2.f3743f = this.f3761b.f3518Q[0].e();
                c0335f.f3743f = -this.f3761b.f3518Q[1].e();
                return;
            }
            C0335f h5 = o.h(this.f3761b.f3518Q[0]);
            C0335f h6 = o.h(this.f3761b.f3518Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.f3766j = 4;
            return;
        }
        if (cVar5 != null) {
            C0335f h7 = o.h(cVar4);
            if (h7 != null) {
                o.b(c0335f2, h7, this.f3761b.f3518Q[0].e());
                c(c0335f, c0335f2, 1, gVar);
                return;
            }
            return;
        }
        s.c cVar6 = cVarArr2[1];
        if (cVar6.f3501f != null) {
            C0335f h8 = o.h(cVar6);
            if (h8 != null) {
                o.b(c0335f, h8, -this.f3761b.f3518Q[1].e());
                c(c0335f2, c0335f, -1, gVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof s.i) || (dVar3 = dVar11.f3521T) == null) {
            return;
        }
        o.b(c0335f2, dVar3.d.h, dVar11.r());
        c(c0335f, c0335f2, 1, gVar);
    }

    @Override // t.o
    public final void e() {
        C0335f c0335f = this.h;
        if (c0335f.f3745j) {
            this.f3761b.f3526Y = c0335f.f3744g;
        }
    }

    @Override // t.o
    public final void f() {
        this.f3762c = null;
        this.h.c();
        this.i.c();
        this.f3763e.c();
        this.f3765g = false;
    }

    @Override // t.o
    public final boolean k() {
        return this.d != 3 || this.f3761b.f3557r == 0;
    }

    public final void n() {
        this.f3765g = false;
        C0335f c0335f = this.h;
        c0335f.c();
        c0335f.f3745j = false;
        C0335f c0335f2 = this.i;
        c0335f2.c();
        c0335f2.f3745j = false;
        this.f3763e.f3745j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f3761b.f3541h0;
    }
}
