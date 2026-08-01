package t;

import java.util.ArrayList;
import q.AbstractC0332e;

/* loaded from: classes.dex */
public final class k extends p {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f4145k = new int[2];

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
    @Override // t.InterfaceC0367d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0367d interfaceC0367d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0332e.a(this.f4161j) == 3) {
            s.d dVar = this.f4156b;
            l(dVar.f3961I, dVar.f3963K, 0);
            return;
        }
        g gVar = this.f4158e;
        boolean z2 = gVar.f4140j;
        f fVar = this.h;
        f fVar2 = this.i;
        if (!z2 && this.d == 3) {
            s.d dVar2 = this.f4156b;
            int i2 = dVar2.f4008r;
            if (i2 == 2) {
                s.d dVar3 = dVar2.f3972T;
                if (dVar3 != null) {
                    if (dVar3.d.f4158e.f4140j) {
                        gVar.d((int) ((r3.f4139g * dVar2.f4013w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = dVar2.f4009s;
                if (i3 == 0 || i3 == 3) {
                    m mVar = dVar2.f3986e;
                    f fVar3 = mVar.h;
                    f fVar4 = mVar.i;
                    boolean z3 = dVar2.f3961I.f3952f != null;
                    boolean z4 = dVar2.f3962J.f3952f != null;
                    boolean z5 = dVar2.f3963K.f3952f != null;
                    boolean z6 = dVar2.f3964L.f3952f != null;
                    int i4 = dVar2.f3976X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = dVar2.f3975W;
                        boolean z7 = fVar3.f4140j;
                        int[] iArr = f4145k;
                        if (z7 && fVar4.f4140j) {
                            if (fVar.f4136c && fVar2.f4136c) {
                                m(iArr, ((f) fVar.f4142l.get(0)).f4139g + fVar.f4138f, ((f) fVar2.f4142l.get(0)).f4139g - fVar2.f4138f, fVar3.f4139g + fVar3.f4138f, fVar4.f4139g - fVar4.f4138f, f5, i4);
                                gVar.d(iArr[0]);
                                this.f4156b.f3986e.f4158e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = fVar.f4140j;
                        ArrayList arrayList = fVar3.f4142l;
                        if (z8 && fVar2.f4140j) {
                            if (!fVar3.f4136c || !fVar4.f4136c) {
                                return;
                            }
                            m(iArr, fVar.f4139g + fVar.f4138f, fVar2.f4139g - fVar2.f4138f, ((f) arrayList.get(0)).f4139g + fVar3.f4138f, ((f) fVar4.f4142l.get(0)).f4139g - fVar4.f4138f, f5, i4);
                            gVar.d(iArr[0]);
                            this.f4156b.f3986e.f4158e.d(iArr[1]);
                        }
                        if (!fVar.f4136c || !fVar2.f4136c || !fVar3.f4136c || !fVar4.f4136c) {
                            return;
                        }
                        m(iArr, ((f) fVar.f4142l.get(0)).f4139g + fVar.f4138f, ((f) fVar2.f4142l.get(0)).f4139g - fVar2.f4138f, ((f) arrayList.get(0)).f4139g + fVar3.f4138f, ((f) fVar4.f4142l.get(0)).f4139g - fVar4.f4138f, f5, i4);
                        gVar.d(iArr[0]);
                        this.f4156b.f3986e.f4158e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!fVar.f4136c || !fVar2.f4136c) {
                            return;
                        }
                        float f6 = dVar2.f3975W;
                        int i5 = ((f) fVar.f4142l.get(0)).f4139g + fVar.f4138f;
                        int i6 = ((f) fVar2.f4142l.get(0)).f4139g - fVar2.f4138f;
                        if (i4 == -1 || i4 == 0) {
                            int g2 = g(i6 - i5, 0);
                            int i7 = (int) ((g2 * f6) + 0.5f);
                            int g3 = g(i7, 1);
                            if (i7 != g3) {
                                g2 = (int) ((g3 / f6) + 0.5f);
                            }
                            gVar.d(g2);
                            this.f4156b.f3986e.f4158e.d(g3);
                        } else if (i4 == 1) {
                            int g4 = g(i6 - i5, 0);
                            int i8 = (int) ((g4 / f6) + 0.5f);
                            int g5 = g(i8, 1);
                            if (i8 != g5) {
                                g4 = (int) ((g5 * f6) + 0.5f);
                            }
                            gVar.d(g4);
                            this.f4156b.f3986e.f4158e.d(g5);
                        }
                    } else if (z4 && z6) {
                        if (!fVar3.f4136c || !fVar4.f4136c) {
                            return;
                        }
                        float f7 = dVar2.f3975W;
                        int i9 = ((f) fVar3.f4142l.get(0)).f4139g + fVar3.f4138f;
                        int i10 = ((f) fVar4.f4142l.get(0)).f4139g - fVar4.f4138f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g6 = g(i10 - i9, 1);
                                int i11 = (int) ((g6 * f7) + 0.5f);
                                int g7 = g(i11, 0);
                                if (i11 != g7) {
                                    g6 = (int) ((g7 / f7) + 0.5f);
                                }
                                gVar.d(g7);
                                this.f4156b.f3986e.f4158e.d(g6);
                            }
                        }
                        int g8 = g(i10 - i9, 1);
                        int i12 = (int) ((g8 / f7) + 0.5f);
                        int g9 = g(i12, 0);
                        if (i12 != g9) {
                            g8 = (int) ((g9 * f7) + 0.5f);
                        }
                        gVar.d(g9);
                        this.f4156b.f3986e.f4158e.d(g8);
                    }
                } else {
                    int i13 = dVar2.f3976X;
                    if (i13 == -1) {
                        f2 = dVar2.f3986e.f4158e.f4139g;
                        f3 = dVar2.f3975W;
                    } else if (i13 == 0) {
                        f4 = dVar2.f3986e.f4158e.f4139g / dVar2.f3975W;
                        i = (int) (f4 + 0.5f);
                        gVar.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        gVar.d(i);
                    } else {
                        f2 = dVar2.f3986e.f4158e.f4139g;
                        f3 = dVar2.f3975W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    gVar.d(i);
                }
            }
        }
        if (fVar.f4136c && fVar2.f4136c) {
            if (fVar.f4140j && fVar2.f4140j && gVar.f4140j) {
                return;
            }
            if (!gVar.f4140j && this.d == 3) {
                s.d dVar4 = this.f4156b;
                if (dVar4.f4008r == 0 && !dVar4.x()) {
                    f fVar5 = (f) fVar.f4142l.get(0);
                    f fVar6 = (f) fVar2.f4142l.get(0);
                    int i14 = fVar5.f4139g + fVar.f4138f;
                    int i15 = fVar6.f4139g + fVar2.f4138f;
                    fVar.d(i14);
                    fVar2.d(i15);
                    gVar.d(i15 - i14);
                    return;
                }
            }
            if (!gVar.f4140j && this.d == 3 && this.f4155a == 1 && fVar.f4142l.size() > 0 && fVar2.f4142l.size() > 0) {
                int min = Math.min((((f) fVar2.f4142l.get(0)).f4139g + fVar2.f4138f) - (((f) fVar.f4142l.get(0)).f4139g + fVar.f4138f), gVar.f4143m);
                s.d dVar5 = this.f4156b;
                int i16 = dVar5.f4012v;
                int max = Math.max(dVar5.f4011u, min);
                if (i16 > 0) {
                    max = Math.min(i16, max);
                }
                gVar.d(max);
            }
            if (gVar.f4140j) {
                f fVar7 = (f) fVar.f4142l.get(0);
                f fVar8 = (f) fVar2.f4142l.get(0);
                int i17 = fVar7.f4139g;
                int i18 = fVar.f4138f + i17;
                int i19 = fVar8.f4139g;
                int i20 = fVar2.f4138f + i19;
                float f8 = this.f4156b.f3985d0;
                if (fVar7 == fVar8) {
                    f8 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                fVar.d((int) ((((i19 - i17) - gVar.f4139g) * f8) + i17 + 0.5f));
                fVar2.d(fVar.f4139g + gVar.f4139g);
            }
        }
    }

    @Override // t.p
    public final void d() {
        s.d dVar;
        s.d dVar2;
        int i;
        s.d dVar3;
        s.d dVar4;
        int i2;
        s.d dVar5 = this.f4156b;
        boolean z2 = dVar5.f3979a;
        g gVar = this.f4158e;
        if (z2) {
            gVar.d(dVar5.q());
        }
        boolean z3 = gVar.f4140j;
        f fVar = this.i;
        f fVar2 = this.h;
        if (!z3) {
            s.d dVar6 = this.f4156b;
            int i3 = dVar6.f4006p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (dVar4 = dVar6.f3972T) != null && ((i2 = dVar4.f4006p0[0]) == 1 || i2 == 4)) {
                    int q2 = (dVar4.q() - this.f4156b.f3961I.e()) - this.f4156b.f3963K.e();
                    p.b(fVar2, dVar4.d.h, this.f4156b.f3961I.e());
                    p.b(fVar, dVar4.d.i, -this.f4156b.f3963K.e());
                    gVar.d(q2);
                    return;
                }
                if (i3 == 1) {
                    gVar.d(dVar6.q());
                }
            }
        } else if (this.d == 4 && (dVar2 = (dVar = this.f4156b).f3972T) != null && ((i = dVar2.f4006p0[0]) == 1 || i == 4)) {
            p.b(fVar2, dVar2.d.h, dVar.f3961I.e());
            p.b(fVar, dVar2.d.i, -this.f4156b.f3963K.e());
            return;
        }
        if (gVar.f4140j) {
            s.d dVar7 = this.f4156b;
            if (dVar7.f3979a) {
                s.c[] cVarArr = dVar7.f3969Q;
                s.c cVar = cVarArr[0];
                s.c cVar2 = cVar.f3952f;
                if (cVar2 != null && cVarArr[1].f3952f != null) {
                    if (dVar7.x()) {
                        fVar2.f4138f = this.f4156b.f3969Q[0].e();
                        fVar.f4138f = -this.f4156b.f3969Q[1].e();
                        return;
                    }
                    f h = p.h(this.f4156b.f3969Q[0]);
                    if (h != null) {
                        p.b(fVar2, h, this.f4156b.f3969Q[0].e());
                    }
                    f h2 = p.h(this.f4156b.f3969Q[1]);
                    if (h2 != null) {
                        p.b(fVar, h2, -this.f4156b.f3969Q[1].e());
                    }
                    fVar2.f4135b = true;
                    fVar.f4135b = true;
                    return;
                }
                if (cVar2 != null) {
                    f h3 = p.h(cVar);
                    if (h3 != null) {
                        p.b(fVar2, h3, this.f4156b.f3969Q[0].e());
                        p.b(fVar, fVar2, gVar.f4139g);
                        return;
                    }
                    return;
                }
                s.c cVar3 = cVarArr[1];
                if (cVar3.f3952f != null) {
                    f h4 = p.h(cVar3);
                    if (h4 != null) {
                        p.b(fVar, h4, -this.f4156b.f3969Q[1].e());
                        p.b(fVar2, fVar, -gVar.f4139g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof s.i) || dVar7.f3972T == null || dVar7.i(7).f3952f != null) {
                    return;
                }
                s.d dVar8 = this.f4156b;
                p.b(fVar2, dVar8.f3972T.d.h, dVar8.r());
                p.b(fVar, fVar2, gVar.f4139g);
                return;
            }
        }
        if (this.d == 3) {
            s.d dVar9 = this.f4156b;
            int i4 = dVar9.f4008r;
            if (i4 == 2) {
                s.d dVar10 = dVar9.f3972T;
                if (dVar10 != null) {
                    g gVar2 = dVar10.f3986e.f4158e;
                    gVar.f4142l.add(gVar2);
                    gVar2.f4141k.add(gVar);
                    gVar.f4135b = true;
                    gVar.f4141k.add(fVar2);
                    gVar.f4141k.add(fVar);
                }
            } else if (i4 == 3) {
                if (dVar9.f4009s == 3) {
                    fVar2.f4134a = this;
                    fVar.f4134a = this;
                    m mVar = dVar9.f3986e;
                    mVar.h.f4134a = this;
                    mVar.i.f4134a = this;
                    gVar.f4134a = this;
                    if (dVar9.y()) {
                        gVar.f4142l.add(this.f4156b.f3986e.f4158e);
                        this.f4156b.f3986e.f4158e.f4141k.add(gVar);
                        m mVar2 = this.f4156b.f3986e;
                        mVar2.f4158e.f4134a = this;
                        gVar.f4142l.add(mVar2.h);
                        gVar.f4142l.add(this.f4156b.f3986e.i);
                        this.f4156b.f3986e.h.f4141k.add(gVar);
                        this.f4156b.f3986e.i.f4141k.add(gVar);
                    } else if (this.f4156b.x()) {
                        this.f4156b.f3986e.f4158e.f4142l.add(gVar);
                        gVar.f4141k.add(this.f4156b.f3986e.f4158e);
                    } else {
                        this.f4156b.f3986e.f4158e.f4142l.add(gVar);
                    }
                } else {
                    g gVar3 = dVar9.f3986e.f4158e;
                    gVar.f4142l.add(gVar3);
                    gVar3.f4141k.add(gVar);
                    this.f4156b.f3986e.h.f4141k.add(gVar);
                    this.f4156b.f3986e.i.f4141k.add(gVar);
                    gVar.f4135b = true;
                    gVar.f4141k.add(fVar2);
                    gVar.f4141k.add(fVar);
                    fVar2.f4142l.add(gVar);
                    fVar.f4142l.add(gVar);
                }
            }
        }
        s.d dVar11 = this.f4156b;
        s.c[] cVarArr2 = dVar11.f3969Q;
        s.c cVar4 = cVarArr2[0];
        s.c cVar5 = cVar4.f3952f;
        if (cVar5 != null && cVarArr2[1].f3952f != null) {
            if (dVar11.x()) {
                fVar2.f4138f = this.f4156b.f3969Q[0].e();
                fVar.f4138f = -this.f4156b.f3969Q[1].e();
                return;
            }
            f h5 = p.h(this.f4156b.f3969Q[0]);
            f h6 = p.h(this.f4156b.f3969Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.f4161j = 4;
            return;
        }
        if (cVar5 != null) {
            f h7 = p.h(cVar4);
            if (h7 != null) {
                p.b(fVar2, h7, this.f4156b.f3969Q[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        s.c cVar6 = cVarArr2[1];
        if (cVar6.f3952f != null) {
            f h8 = p.h(cVar6);
            if (h8 != null) {
                p.b(fVar, h8, -this.f4156b.f3969Q[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof s.i) || (dVar3 = dVar11.f3972T) == null) {
            return;
        }
        p.b(fVar2, dVar3.d.h, dVar11.r());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // t.p
    public final void e() {
        f fVar = this.h;
        if (fVar.f4140j) {
            this.f4156b.f3977Y = fVar.f4139g;
        }
    }

    @Override // t.p
    public final void f() {
        this.f4157c = null;
        this.h.c();
        this.i.c();
        this.f4158e.c();
        this.f4160g = false;
    }

    @Override // t.p
    public final boolean k() {
        return this.d != 3 || this.f4156b.f4008r == 0;
    }

    public final void n() {
        this.f4160g = false;
        f fVar = this.h;
        fVar.c();
        fVar.f4140j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.f4140j = false;
        this.f4158e.f4140j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f4156b.f3992h0;
    }
}
