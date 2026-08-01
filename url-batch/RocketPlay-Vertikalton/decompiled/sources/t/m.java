package t;

import androidx.recyclerview.widget.RecyclerView;
import q.AbstractC0332e;

/* loaded from: classes.dex */
public final class m extends p {

    /* renamed from: k, reason: collision with root package name */
    public f f4148k;

    /* renamed from: l, reason: collision with root package name */
    public C0364a f4149l;

    @Override // t.InterfaceC0367d
    public final void a(InterfaceC0367d interfaceC0367d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0332e.a(this.f4161j) == 3) {
            s.d dVar = this.f4156b;
            l(dVar.f3962J, dVar.f3964L, 1);
            return;
        }
        g gVar = this.f4158e;
        if (gVar.f4136c && !gVar.f4140j && this.d == 3) {
            s.d dVar2 = this.f4156b;
            int i2 = dVar2.f4009s;
            if (i2 == 2) {
                s.d dVar3 = dVar2.f3972T;
                if (dVar3 != null) {
                    if (dVar3.f3986e.f4158e.f4140j) {
                        gVar.d((int) ((r5.f4139g * dVar2.f4016z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                g gVar2 = dVar2.d.f4158e;
                if (gVar2.f4140j) {
                    int i3 = dVar2.f3976X;
                    if (i3 == -1) {
                        f2 = gVar2.f4139g;
                        f3 = dVar2.f3975W;
                    } else if (i3 == 0) {
                        f4 = gVar2.f4139g * dVar2.f3975W;
                        i = (int) (f4 + 0.5f);
                        gVar.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        gVar.d(i);
                    } else {
                        f2 = gVar2.f4139g;
                        f3 = dVar2.f3975W;
                    }
                    f4 = f2 / f3;
                    i = (int) (f4 + 0.5f);
                    gVar.d(i);
                }
            }
        }
        f fVar = this.h;
        if (fVar.f4136c) {
            f fVar2 = this.i;
            if (fVar2.f4136c) {
                if (fVar.f4140j && fVar2.f4140j && gVar.f4140j) {
                    return;
                }
                if (!gVar.f4140j && this.d == 3) {
                    s.d dVar4 = this.f4156b;
                    if (dVar4.f4008r == 0 && !dVar4.y()) {
                        f fVar3 = (f) fVar.f4142l.get(0);
                        f fVar4 = (f) fVar2.f4142l.get(0);
                        int i4 = fVar3.f4139g + fVar.f4138f;
                        int i5 = fVar4.f4139g + fVar2.f4138f;
                        fVar.d(i4);
                        fVar2.d(i5);
                        gVar.d(i5 - i4);
                        return;
                    }
                }
                if (!gVar.f4140j && this.d == 3 && this.f4155a == 1 && fVar.f4142l.size() > 0 && fVar2.f4142l.size() > 0) {
                    f fVar5 = (f) fVar.f4142l.get(0);
                    int i6 = (((f) fVar2.f4142l.get(0)).f4139g + fVar2.f4138f) - (fVar5.f4139g + fVar.f4138f);
                    int i7 = gVar.f4143m;
                    if (i6 < i7) {
                        gVar.d(i6);
                    } else {
                        gVar.d(i7);
                    }
                }
                if (gVar.f4140j && fVar.f4142l.size() > 0 && fVar2.f4142l.size() > 0) {
                    f fVar6 = (f) fVar.f4142l.get(0);
                    f fVar7 = (f) fVar2.f4142l.get(0);
                    int i8 = fVar6.f4139g;
                    int i9 = fVar.f4138f + i8;
                    int i10 = fVar7.f4139g;
                    int i11 = fVar2.f4138f + i10;
                    float f5 = this.f4156b.f3987e0;
                    if (fVar6 == fVar7) {
                        f5 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    fVar.d((int) ((((i10 - i8) - gVar.f4139g) * f5) + i8 + 0.5f));
                    fVar2.d(fVar.f4139g + gVar.f4139g);
                }
            }
        }
    }

    @Override // t.p
    public final void d() {
        s.d dVar;
        s.d dVar2;
        s.d dVar3;
        s.d dVar4;
        s.d dVar5 = this.f4156b;
        boolean z2 = dVar5.f3979a;
        g gVar = this.f4158e;
        if (z2) {
            gVar.d(dVar5.k());
        }
        boolean z3 = gVar.f4140j;
        f fVar = this.i;
        f fVar2 = this.h;
        if (!z3) {
            s.d dVar6 = this.f4156b;
            this.d = dVar6.f4006p0[1];
            if (dVar6.f3958E) {
                this.f4149l = new C0364a(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (dVar4 = this.f4156b.f3972T) != null && dVar4.f4006p0[1] == 1) {
                    int k2 = (dVar4.k() - this.f4156b.f3962J.e()) - this.f4156b.f3964L.e();
                    p.b(fVar2, dVar4.f3986e.h, this.f4156b.f3962J.e());
                    p.b(fVar, dVar4.f3986e.i, -this.f4156b.f3964L.e());
                    gVar.d(k2);
                    return;
                }
                if (i == 1) {
                    gVar.d(this.f4156b.k());
                }
            }
        } else if (this.d == 4 && (dVar2 = (dVar = this.f4156b).f3972T) != null && dVar2.f4006p0[1] == 1) {
            p.b(fVar2, dVar2.f3986e.h, dVar.f3962J.e());
            p.b(fVar, dVar2.f3986e.i, -this.f4156b.f3964L.e());
            return;
        }
        boolean z4 = gVar.f4140j;
        f fVar3 = this.f4148k;
        if (z4) {
            s.d dVar7 = this.f4156b;
            if (dVar7.f3979a) {
                s.c[] cVarArr = dVar7.f3969Q;
                s.c cVar = cVarArr[2];
                s.c cVar2 = cVar.f3952f;
                if (cVar2 != null && cVarArr[3].f3952f != null) {
                    if (dVar7.y()) {
                        fVar2.f4138f = this.f4156b.f3969Q[2].e();
                        fVar.f4138f = -this.f4156b.f3969Q[3].e();
                    } else {
                        f h = p.h(this.f4156b.f3969Q[2]);
                        if (h != null) {
                            p.b(fVar2, h, this.f4156b.f3969Q[2].e());
                        }
                        f h2 = p.h(this.f4156b.f3969Q[3]);
                        if (h2 != null) {
                            p.b(fVar, h2, -this.f4156b.f3969Q[3].e());
                        }
                        fVar2.f4135b = true;
                        fVar.f4135b = true;
                    }
                    s.d dVar8 = this.f4156b;
                    if (dVar8.f3958E) {
                        p.b(fVar3, fVar2, dVar8.f3980a0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f h3 = p.h(cVar);
                    if (h3 != null) {
                        p.b(fVar2, h3, this.f4156b.f3969Q[2].e());
                        p.b(fVar, fVar2, gVar.f4139g);
                        s.d dVar9 = this.f4156b;
                        if (dVar9.f3958E) {
                            p.b(fVar3, fVar2, dVar9.f3980a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                s.c cVar3 = cVarArr[3];
                if (cVar3.f3952f != null) {
                    f h4 = p.h(cVar3);
                    if (h4 != null) {
                        p.b(fVar, h4, -this.f4156b.f3969Q[3].e());
                        p.b(fVar2, fVar, -gVar.f4139g);
                    }
                    s.d dVar10 = this.f4156b;
                    if (dVar10.f3958E) {
                        p.b(fVar3, fVar2, dVar10.f3980a0);
                        return;
                    }
                    return;
                }
                s.c cVar4 = cVarArr[4];
                if (cVar4.f3952f != null) {
                    f h5 = p.h(cVar4);
                    if (h5 != null) {
                        p.b(fVar3, h5, 0);
                        p.b(fVar2, fVar3, -this.f4156b.f3980a0);
                        p.b(fVar, fVar2, gVar.f4139g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof s.i) || dVar7.f3972T == null || dVar7.i(7).f3952f != null) {
                    return;
                }
                s.d dVar11 = this.f4156b;
                p.b(fVar2, dVar11.f3972T.f3986e.h, dVar11.s());
                p.b(fVar, fVar2, gVar.f4139g);
                s.d dVar12 = this.f4156b;
                if (dVar12.f3958E) {
                    p.b(fVar3, fVar2, dVar12.f3980a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.d != 3) {
            gVar.b(this);
        } else {
            s.d dVar13 = this.f4156b;
            int i2 = dVar13.f4009s;
            if (i2 == 2) {
                s.d dVar14 = dVar13.f3972T;
                if (dVar14 != null) {
                    g gVar2 = dVar14.f3986e.f4158e;
                    gVar.f4142l.add(gVar2);
                    gVar2.f4141k.add(gVar);
                    gVar.f4135b = true;
                    gVar.f4141k.add(fVar2);
                    gVar.f4141k.add(fVar);
                }
            } else if (i2 == 3 && !dVar13.y()) {
                s.d dVar15 = this.f4156b;
                if (dVar15.f4008r != 3) {
                    g gVar3 = dVar15.d.f4158e;
                    gVar.f4142l.add(gVar3);
                    gVar3.f4141k.add(gVar);
                    gVar.f4135b = true;
                    gVar.f4141k.add(fVar2);
                    gVar.f4141k.add(fVar);
                }
            }
        }
        s.d dVar16 = this.f4156b;
        s.c[] cVarArr2 = dVar16.f3969Q;
        s.c cVar5 = cVarArr2[2];
        s.c cVar6 = cVar5.f3952f;
        if (cVar6 != null && cVarArr2[3].f3952f != null) {
            if (dVar16.y()) {
                fVar2.f4138f = this.f4156b.f3969Q[2].e();
                fVar.f4138f = -this.f4156b.f3969Q[3].e();
            } else {
                f h6 = p.h(this.f4156b.f3969Q[2]);
                f h7 = p.h(this.f4156b.f3969Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.f4161j = 4;
            }
            if (this.f4156b.f3958E) {
                c(fVar3, fVar2, 1, this.f4149l);
            }
        } else if (cVar6 != null) {
            f h8 = p.h(cVar5);
            if (h8 != null) {
                p.b(fVar2, h8, this.f4156b.f3969Q[2].e());
                c(fVar, fVar2, 1, gVar);
                if (this.f4156b.f3958E) {
                    c(fVar3, fVar2, 1, this.f4149l);
                }
                if (this.d == 3) {
                    s.d dVar17 = this.f4156b;
                    if (dVar17.f3975W > RecyclerView.f1949A0) {
                        k kVar = dVar17.d;
                        if (kVar.d == 3) {
                            kVar.f4158e.f4141k.add(gVar);
                            gVar.f4142l.add(this.f4156b.d.f4158e);
                            gVar.f4134a = this;
                        }
                    }
                }
            }
        } else {
            s.c cVar7 = cVarArr2[3];
            if (cVar7.f3952f != null) {
                f h9 = p.h(cVar7);
                if (h9 != null) {
                    p.b(fVar, h9, -this.f4156b.f3969Q[3].e());
                    c(fVar2, fVar, -1, gVar);
                    if (this.f4156b.f3958E) {
                        c(fVar3, fVar2, 1, this.f4149l);
                    }
                }
            } else {
                s.c cVar8 = cVarArr2[4];
                if (cVar8.f3952f != null) {
                    f h10 = p.h(cVar8);
                    if (h10 != null) {
                        p.b(fVar3, h10, 0);
                        c(fVar2, fVar3, -1, this.f4149l);
                        c(fVar, fVar2, 1, gVar);
                    }
                } else if (!(dVar16 instanceof s.i) && (dVar3 = dVar16.f3972T) != null) {
                    p.b(fVar2, dVar3.f3986e.h, dVar16.s());
                    c(fVar, fVar2, 1, gVar);
                    if (this.f4156b.f3958E) {
                        c(fVar3, fVar2, 1, this.f4149l);
                    }
                    if (this.d == 3) {
                        s.d dVar18 = this.f4156b;
                        if (dVar18.f3975W > RecyclerView.f1949A0) {
                            k kVar2 = dVar18.d;
                            if (kVar2.d == 3) {
                                kVar2.f4158e.f4141k.add(gVar);
                                gVar.f4142l.add(this.f4156b.d.f4158e);
                                gVar.f4134a = this;
                            }
                        }
                    }
                }
            }
        }
        if (gVar.f4142l.size() == 0) {
            gVar.f4136c = true;
        }
    }

    @Override // t.p
    public final void e() {
        f fVar = this.h;
        if (fVar.f4140j) {
            this.f4156b.f3978Z = fVar.f4139g;
        }
    }

    @Override // t.p
    public final void f() {
        this.f4157c = null;
        this.h.c();
        this.i.c();
        this.f4148k.c();
        this.f4158e.c();
        this.f4160g = false;
    }

    @Override // t.p
    public final boolean k() {
        return this.d != 3 || this.f4156b.f4009s == 0;
    }

    public final void m() {
        this.f4160g = false;
        f fVar = this.h;
        fVar.c();
        fVar.f4140j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.f4140j = false;
        f fVar3 = this.f4148k;
        fVar3.c();
        fVar3.f4140j = false;
        this.f4158e.f4140j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f4156b.f3992h0;
    }
}
