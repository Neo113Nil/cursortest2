package t;

import androidx.recyclerview.widget.RecyclerView;
import q.AbstractC0321e;

/* loaded from: classes.dex */
public final class m extends o {

    /* renamed from: k, reason: collision with root package name */
    public C0335f f3753k;

    /* renamed from: l, reason: collision with root package name */
    public C0330a f3754l;

    @Override // t.InterfaceC0333d
    public final void a(InterfaceC0333d interfaceC0333d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0321e.a(this.f3766j) == 3) {
            s.d dVar = this.f3761b;
            l(dVar.f3511J, dVar.f3513L, 1);
            return;
        }
        g gVar = this.f3763e;
        if (gVar.f3741c && !gVar.f3745j && this.d == 3) {
            s.d dVar2 = this.f3761b;
            int i2 = dVar2.f3558s;
            if (i2 == 2) {
                s.d dVar3 = dVar2.f3521T;
                if (dVar3 != null) {
                    if (dVar3.f3535e.f3763e.f3745j) {
                        gVar.d((int) ((r5.f3744g * dVar2.f3565z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                g gVar2 = dVar2.d.f3763e;
                if (gVar2.f3745j) {
                    int i3 = dVar2.f3525X;
                    if (i3 == -1) {
                        f2 = gVar2.f3744g;
                        f3 = dVar2.f3524W;
                    } else if (i3 == 0) {
                        f4 = gVar2.f3744g * dVar2.f3524W;
                        i = (int) (f4 + 0.5f);
                        gVar.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        gVar.d(i);
                    } else {
                        f2 = gVar2.f3744g;
                        f3 = dVar2.f3524W;
                    }
                    f4 = f2 / f3;
                    i = (int) (f4 + 0.5f);
                    gVar.d(i);
                }
            }
        }
        C0335f c0335f = this.h;
        if (c0335f.f3741c) {
            C0335f c0335f2 = this.i;
            if (c0335f2.f3741c) {
                if (c0335f.f3745j && c0335f2.f3745j && gVar.f3745j) {
                    return;
                }
                if (!gVar.f3745j && this.d == 3) {
                    s.d dVar4 = this.f3761b;
                    if (dVar4.f3557r == 0 && !dVar4.y()) {
                        C0335f c0335f3 = (C0335f) c0335f.f3747l.get(0);
                        C0335f c0335f4 = (C0335f) c0335f2.f3747l.get(0);
                        int i4 = c0335f3.f3744g + c0335f.f3743f;
                        int i5 = c0335f4.f3744g + c0335f2.f3743f;
                        c0335f.d(i4);
                        c0335f2.d(i5);
                        gVar.d(i5 - i4);
                        return;
                    }
                }
                if (!gVar.f3745j && this.d == 3 && this.f3760a == 1 && c0335f.f3747l.size() > 0 && c0335f2.f3747l.size() > 0) {
                    C0335f c0335f5 = (C0335f) c0335f.f3747l.get(0);
                    int i6 = (((C0335f) c0335f2.f3747l.get(0)).f3744g + c0335f2.f3743f) - (c0335f5.f3744g + c0335f.f3743f);
                    int i7 = gVar.f3748m;
                    if (i6 < i7) {
                        gVar.d(i6);
                    } else {
                        gVar.d(i7);
                    }
                }
                if (gVar.f3745j && c0335f.f3747l.size() > 0 && c0335f2.f3747l.size() > 0) {
                    C0335f c0335f6 = (C0335f) c0335f.f3747l.get(0);
                    C0335f c0335f7 = (C0335f) c0335f2.f3747l.get(0);
                    int i8 = c0335f6.f3744g;
                    int i9 = c0335f.f3743f + i8;
                    int i10 = c0335f7.f3744g;
                    int i11 = c0335f2.f3743f + i10;
                    float f5 = this.f3761b.f3536e0;
                    if (c0335f6 == c0335f7) {
                        f5 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c0335f.d((int) ((((i10 - i8) - gVar.f3744g) * f5) + i8 + 0.5f));
                    c0335f2.d(c0335f.f3744g + gVar.f3744g);
                }
            }
        }
    }

    @Override // t.o
    public final void d() {
        s.d dVar;
        s.d dVar2;
        s.d dVar3;
        s.d dVar4;
        s.d dVar5 = this.f3761b;
        boolean z2 = dVar5.f3528a;
        g gVar = this.f3763e;
        if (z2) {
            gVar.d(dVar5.k());
        }
        boolean z3 = gVar.f3745j;
        C0335f c0335f = this.i;
        C0335f c0335f2 = this.h;
        if (!z3) {
            s.d dVar6 = this.f3761b;
            this.d = dVar6.f3555p0[1];
            if (dVar6.f3507E) {
                this.f3754l = new C0330a(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (dVar4 = this.f3761b.f3521T) != null && dVar4.f3555p0[1] == 1) {
                    int k2 = (dVar4.k() - this.f3761b.f3511J.e()) - this.f3761b.f3513L.e();
                    o.b(c0335f2, dVar4.f3535e.h, this.f3761b.f3511J.e());
                    o.b(c0335f, dVar4.f3535e.i, -this.f3761b.f3513L.e());
                    gVar.d(k2);
                    return;
                }
                if (i == 1) {
                    gVar.d(this.f3761b.k());
                }
            }
        } else if (this.d == 4 && (dVar2 = (dVar = this.f3761b).f3521T) != null && dVar2.f3555p0[1] == 1) {
            o.b(c0335f2, dVar2.f3535e.h, dVar.f3511J.e());
            o.b(c0335f, dVar2.f3535e.i, -this.f3761b.f3513L.e());
            return;
        }
        boolean z4 = gVar.f3745j;
        C0335f c0335f3 = this.f3753k;
        if (z4) {
            s.d dVar7 = this.f3761b;
            if (dVar7.f3528a) {
                s.c[] cVarArr = dVar7.f3518Q;
                s.c cVar = cVarArr[2];
                s.c cVar2 = cVar.f3501f;
                if (cVar2 != null && cVarArr[3].f3501f != null) {
                    if (dVar7.y()) {
                        c0335f2.f3743f = this.f3761b.f3518Q[2].e();
                        c0335f.f3743f = -this.f3761b.f3518Q[3].e();
                    } else {
                        C0335f h = o.h(this.f3761b.f3518Q[2]);
                        if (h != null) {
                            o.b(c0335f2, h, this.f3761b.f3518Q[2].e());
                        }
                        C0335f h2 = o.h(this.f3761b.f3518Q[3]);
                        if (h2 != null) {
                            o.b(c0335f, h2, -this.f3761b.f3518Q[3].e());
                        }
                        c0335f2.f3740b = true;
                        c0335f.f3740b = true;
                    }
                    s.d dVar8 = this.f3761b;
                    if (dVar8.f3507E) {
                        o.b(c0335f3, c0335f2, dVar8.f3529a0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    C0335f h3 = o.h(cVar);
                    if (h3 != null) {
                        o.b(c0335f2, h3, this.f3761b.f3518Q[2].e());
                        o.b(c0335f, c0335f2, gVar.f3744g);
                        s.d dVar9 = this.f3761b;
                        if (dVar9.f3507E) {
                            o.b(c0335f3, c0335f2, dVar9.f3529a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                s.c cVar3 = cVarArr[3];
                if (cVar3.f3501f != null) {
                    C0335f h4 = o.h(cVar3);
                    if (h4 != null) {
                        o.b(c0335f, h4, -this.f3761b.f3518Q[3].e());
                        o.b(c0335f2, c0335f, -gVar.f3744g);
                    }
                    s.d dVar10 = this.f3761b;
                    if (dVar10.f3507E) {
                        o.b(c0335f3, c0335f2, dVar10.f3529a0);
                        return;
                    }
                    return;
                }
                s.c cVar4 = cVarArr[4];
                if (cVar4.f3501f != null) {
                    C0335f h5 = o.h(cVar4);
                    if (h5 != null) {
                        o.b(c0335f3, h5, 0);
                        o.b(c0335f2, c0335f3, -this.f3761b.f3529a0);
                        o.b(c0335f, c0335f2, gVar.f3744g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof s.i) || dVar7.f3521T == null || dVar7.i(7).f3501f != null) {
                    return;
                }
                s.d dVar11 = this.f3761b;
                o.b(c0335f2, dVar11.f3521T.f3535e.h, dVar11.s());
                o.b(c0335f, c0335f2, gVar.f3744g);
                s.d dVar12 = this.f3761b;
                if (dVar12.f3507E) {
                    o.b(c0335f3, c0335f2, dVar12.f3529a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.d != 3) {
            gVar.b(this);
        } else {
            s.d dVar13 = this.f3761b;
            int i2 = dVar13.f3558s;
            if (i2 == 2) {
                s.d dVar14 = dVar13.f3521T;
                if (dVar14 != null) {
                    g gVar2 = dVar14.f3535e.f3763e;
                    gVar.f3747l.add(gVar2);
                    gVar2.f3746k.add(gVar);
                    gVar.f3740b = true;
                    gVar.f3746k.add(c0335f2);
                    gVar.f3746k.add(c0335f);
                }
            } else if (i2 == 3 && !dVar13.y()) {
                s.d dVar15 = this.f3761b;
                if (dVar15.f3557r != 3) {
                    g gVar3 = dVar15.d.f3763e;
                    gVar.f3747l.add(gVar3);
                    gVar3.f3746k.add(gVar);
                    gVar.f3740b = true;
                    gVar.f3746k.add(c0335f2);
                    gVar.f3746k.add(c0335f);
                }
            }
        }
        s.d dVar16 = this.f3761b;
        s.c[] cVarArr2 = dVar16.f3518Q;
        s.c cVar5 = cVarArr2[2];
        s.c cVar6 = cVar5.f3501f;
        if (cVar6 != null && cVarArr2[3].f3501f != null) {
            if (dVar16.y()) {
                c0335f2.f3743f = this.f3761b.f3518Q[2].e();
                c0335f.f3743f = -this.f3761b.f3518Q[3].e();
            } else {
                C0335f h6 = o.h(this.f3761b.f3518Q[2]);
                C0335f h7 = o.h(this.f3761b.f3518Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.f3766j = 4;
            }
            if (this.f3761b.f3507E) {
                c(c0335f3, c0335f2, 1, this.f3754l);
            }
        } else if (cVar6 != null) {
            C0335f h8 = o.h(cVar5);
            if (h8 != null) {
                o.b(c0335f2, h8, this.f3761b.f3518Q[2].e());
                c(c0335f, c0335f2, 1, gVar);
                if (this.f3761b.f3507E) {
                    c(c0335f3, c0335f2, 1, this.f3754l);
                }
                if (this.d == 3) {
                    s.d dVar17 = this.f3761b;
                    if (dVar17.f3524W > RecyclerView.f1570A0) {
                        k kVar = dVar17.d;
                        if (kVar.d == 3) {
                            kVar.f3763e.f3746k.add(gVar);
                            gVar.f3747l.add(this.f3761b.d.f3763e);
                            gVar.f3739a = this;
                        }
                    }
                }
            }
        } else {
            s.c cVar7 = cVarArr2[3];
            if (cVar7.f3501f != null) {
                C0335f h9 = o.h(cVar7);
                if (h9 != null) {
                    o.b(c0335f, h9, -this.f3761b.f3518Q[3].e());
                    c(c0335f2, c0335f, -1, gVar);
                    if (this.f3761b.f3507E) {
                        c(c0335f3, c0335f2, 1, this.f3754l);
                    }
                }
            } else {
                s.c cVar8 = cVarArr2[4];
                if (cVar8.f3501f != null) {
                    C0335f h10 = o.h(cVar8);
                    if (h10 != null) {
                        o.b(c0335f3, h10, 0);
                        c(c0335f2, c0335f3, -1, this.f3754l);
                        c(c0335f, c0335f2, 1, gVar);
                    }
                } else if (!(dVar16 instanceof s.i) && (dVar3 = dVar16.f3521T) != null) {
                    o.b(c0335f2, dVar3.f3535e.h, dVar16.s());
                    c(c0335f, c0335f2, 1, gVar);
                    if (this.f3761b.f3507E) {
                        c(c0335f3, c0335f2, 1, this.f3754l);
                    }
                    if (this.d == 3) {
                        s.d dVar18 = this.f3761b;
                        if (dVar18.f3524W > RecyclerView.f1570A0) {
                            k kVar2 = dVar18.d;
                            if (kVar2.d == 3) {
                                kVar2.f3763e.f3746k.add(gVar);
                                gVar.f3747l.add(this.f3761b.d.f3763e);
                                gVar.f3739a = this;
                            }
                        }
                    }
                }
            }
        }
        if (gVar.f3747l.size() == 0) {
            gVar.f3741c = true;
        }
    }

    @Override // t.o
    public final void e() {
        C0335f c0335f = this.h;
        if (c0335f.f3745j) {
            this.f3761b.f3527Z = c0335f.f3744g;
        }
    }

    @Override // t.o
    public final void f() {
        this.f3762c = null;
        this.h.c();
        this.i.c();
        this.f3753k.c();
        this.f3763e.c();
        this.f3765g = false;
    }

    @Override // t.o
    public final boolean k() {
        return this.d != 3 || this.f3761b.f3558s == 0;
    }

    public final void m() {
        this.f3765g = false;
        C0335f c0335f = this.h;
        c0335f.c();
        c0335f.f3745j = false;
        C0335f c0335f2 = this.i;
        c0335f2.c();
        c0335f2.f3745j = false;
        C0335f c0335f3 = this.f3753k;
        c0335f3.c();
        c0335f3.f3745j = false;
        this.f3763e.f3745j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f3761b.f3541h0;
    }
}
