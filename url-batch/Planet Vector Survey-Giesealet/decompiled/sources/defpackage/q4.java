package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class q4 implements bd0 {
    public ra0 d;
    public final to e;
    public final ce0 f;
    public final boolean g;
    public boolean h;
    public long i;
    public vg0 j;
    public final u50 k;

    public q4(Context context, zc0 zc0Var) {
        to toVar = new to(context, d31.I(zc0Var.a));
        this.e = toVar;
        b2 b2Var = b2.G;
        ky0 ky0Var = ky0.a;
        this.f = new ce0(ky0Var, b2Var);
        this.g = true;
        this.i = 0L;
        this.k = y6.d(new SuspendPointerInputElement(ky0Var, null, new gu0(new c(this, null, 3)), 6), Build.VERSION.SDK_INT >= 31 ? new lo(this, toVar) : new lo(this, toVar, zc0Var));
    }

    public final void a() {
        boolean z;
        to toVar = this.e;
        EdgeEffect edgeEffect = toVar.d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = toVar.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = toVar.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = toVar.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z = edgeEffect4.isFinished() || z;
        }
        if (z) {
            c();
        }
    }

    public final long b() {
        ra0 ra0Var = this.d;
        long l = ra0Var != null ? ra0Var.a : rg0.l(this.i);
        return mz.o(ra0.d(l) / fr0.e(this.i), ra0.e(l) / fr0.c(this.i));
    }

    public final void c() {
        if (this.g) {
            this.f.setValue(ky0.a);
        }
    }

    public final float d(long j) {
        float d = ra0.d(b());
        float e = ra0.e(j) / fr0.c(this.i);
        EdgeEffect b = this.e.b();
        float f = -e;
        float f2 = 1.0f - d;
        int i = Build.VERSION.SDK_INT;
        r7 r7Var = r7.a;
        if (i >= 31) {
            f = r7Var.c(b, f, f2);
        } else {
            b.onPull(f, f2);
        }
        return (i >= 31 ? r7Var.b(b) : 0.0f) == 0.0f ? fr0.c(this.i) * (-f) : ra0.e(j);
    }

    public final float e(long j) {
        float e = ra0.e(b());
        float d = ra0.d(j) / fr0.e(this.i);
        EdgeEffect c = this.e.c();
        float f = 1.0f - e;
        int i = Build.VERSION.SDK_INT;
        r7 r7Var = r7.a;
        if (i >= 31) {
            d = r7Var.c(c, d, f);
        } else {
            c.onPull(d, f);
        }
        return (i >= 31 ? r7Var.b(c) : 0.0f) == 0.0f ? fr0.e(this.i) * d : ra0.d(j);
    }

    @Override // defpackage.bd0
    public final boolean f() {
        to toVar = this.e;
        EdgeEffect edgeEffect = toVar.d;
        r7 r7Var = r7.a;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? r7Var.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = toVar.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? r7Var.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = toVar.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? r7Var.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = toVar.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? r7Var.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final float g(long j) {
        float e = ra0.e(b());
        float d = ra0.d(j) / fr0.e(this.i);
        EdgeEffect d2 = this.e.d();
        float f = -d;
        int i = Build.VERSION.SDK_INT;
        r7 r7Var = r7.a;
        if (i >= 31) {
            f = r7Var.c(d2, f, e);
        } else {
            d2.onPull(f, e);
        }
        return (i >= 31 ? r7Var.b(d2) : 0.0f) == 0.0f ? fr0.e(this.i) * (-f) : ra0.d(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0253 A[ADDED_TO_REGION] */
    @Override // defpackage.bd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(long j, int i, f2 f2Var) {
        float d;
        float g;
        long o;
        boolean z;
        boolean z2;
        EdgeEffect b;
        EdgeEffect e;
        EdgeEffect d2;
        boolean z3;
        boolean z4;
        if (fr0.f(this.i)) {
            f2Var.getClass();
            zo0 zo0Var = (zo0) f2Var.f;
            return new ra0(zo0.a(zo0Var, zo0Var.h, j, zo0Var.g)).a;
        }
        boolean z5 = this.h;
        boolean z6 = true;
        to toVar = this.e;
        if (!z5) {
            if (to.g(toVar.f)) {
                e(0L);
            }
            if (to.g(toVar.g)) {
                g(0L);
            }
            if (to.g(toVar.d)) {
                k(0L);
            }
            if (to.g(toVar.e)) {
                d(0L);
            }
            this.h = true;
        }
        if (ra0.e(j) != 0.0f) {
            if (to.g(toVar.d)) {
                d = k(j);
                if (!to.g(toVar.d)) {
                    toVar.e().onRelease();
                }
            } else if (to.g(toVar.e)) {
                d = d(j);
                if (!to.g(toVar.e)) {
                    toVar.b().onRelease();
                }
            }
            if (ra0.d(j) != 0.0f) {
                if (to.g(toVar.f)) {
                    g = e(j);
                    if (!to.g(toVar.f)) {
                        toVar.c().onRelease();
                    }
                } else if (to.g(toVar.g)) {
                    g = g(j);
                    if (!to.g(toVar.g)) {
                        toVar.d().onRelease();
                    }
                }
                o = mz.o(g, d);
                if (!ra0.b(o, 0L)) {
                    c();
                }
                long g2 = ra0.g(j, o);
                f2Var.getClass();
                zo0 zo0Var2 = (zo0) f2Var.f;
                long j2 = new ra0(zo0.a(zo0Var2, zo0Var2.h, g2, zo0Var2.g)).a;
                long g3 = ra0.g(g2, j2);
                if (i == 1) {
                    if (ra0.d(g3) > 0.5f) {
                        e(g3);
                    } else {
                        if (ra0.d(g3) >= -0.5f) {
                            z3 = false;
                            if (ra0.e(g3) <= 0.5f) {
                                k(g3);
                            } else if (ra0.e(g3) < -0.5f) {
                                d(g3);
                            } else {
                                z4 = false;
                                if (!z3 || z4) {
                                    z = true;
                                    if (to.f(toVar.f) || ra0.d(j) >= 0.0f) {
                                        z2 = false;
                                    } else {
                                        EdgeEffect c = toVar.c();
                                        float d3 = ra0.d(j);
                                        if (c instanceof lv) {
                                            lv lvVar = (lv) c;
                                            float f = lvVar.b + d3;
                                            lvVar.b = f;
                                            if (Math.abs(f) > lvVar.a) {
                                                lvVar.onRelease();
                                            }
                                        } else {
                                            c.onRelease();
                                        }
                                        z2 = !to.f(toVar.f);
                                    }
                                    if (to.f(toVar.g) && ra0.d(j) > 0.0f) {
                                        d2 = toVar.d();
                                        float d4 = ra0.d(j);
                                        if (d2 instanceof lv) {
                                            d2.onRelease();
                                        } else {
                                            lv lvVar2 = (lv) d2;
                                            float f2 = lvVar2.b + d4;
                                            lvVar2.b = f2;
                                            if (Math.abs(f2) > lvVar2.a) {
                                                lvVar2.onRelease();
                                            }
                                        }
                                        z2 = (z2 && to.f(toVar.g)) ? false : true;
                                    }
                                    if (to.f(toVar.d) && ra0.e(j) < 0.0f) {
                                        e = toVar.e();
                                        float e2 = ra0.e(j);
                                        if (e instanceof lv) {
                                            e.onRelease();
                                        } else {
                                            lv lvVar3 = (lv) e;
                                            float f3 = lvVar3.b + e2;
                                            lvVar3.b = f3;
                                            if (Math.abs(f3) > lvVar3.a) {
                                                lvVar3.onRelease();
                                            }
                                        }
                                        z2 = (z2 && to.f(toVar.d)) ? false : true;
                                    }
                                    if (to.f(toVar.e) && ra0.e(j) > 0.0f) {
                                        b = toVar.b();
                                        float e3 = ra0.e(j);
                                        if (b instanceof lv) {
                                            b.onRelease();
                                        } else {
                                            lv lvVar4 = (lv) b;
                                            float f4 = lvVar4.b + e3;
                                            lvVar4.b = f4;
                                            if (Math.abs(f4) > lvVar4.a) {
                                                lvVar4.onRelease();
                                            }
                                        }
                                        z2 = (z2 && to.f(toVar.e)) ? false : true;
                                    }
                                    if (!z2 && !z) {
                                        z6 = false;
                                    }
                                    if (z6) {
                                        c();
                                    }
                                    return ra0.h(o, j2);
                                }
                            }
                            z4 = true;
                            if (!z3) {
                            }
                            z = true;
                            if (to.f(toVar.f)) {
                            }
                            z2 = false;
                            if (to.f(toVar.g)) {
                                d2 = toVar.d();
                                float d42 = ra0.d(j);
                                if (d2 instanceof lv) {
                                }
                                if (z2) {
                                }
                            }
                            if (to.f(toVar.d)) {
                                e = toVar.e();
                                float e22 = ra0.e(j);
                                if (e instanceof lv) {
                                }
                                if (z2) {
                                }
                            }
                            if (to.f(toVar.e)) {
                                b = toVar.b();
                                float e32 = ra0.e(j);
                                if (b instanceof lv) {
                                }
                                if (z2) {
                                }
                            }
                            if (!z2) {
                                z6 = false;
                            }
                            if (z6) {
                            }
                            return ra0.h(o, j2);
                        }
                        g(g3);
                    }
                    z3 = true;
                    if (ra0.e(g3) <= 0.5f) {
                    }
                    z4 = true;
                    if (!z3) {
                    }
                    z = true;
                    if (to.f(toVar.f)) {
                    }
                    z2 = false;
                    if (to.f(toVar.g)) {
                    }
                    if (to.f(toVar.d)) {
                    }
                    if (to.f(toVar.e)) {
                    }
                    if (!z2) {
                    }
                    if (z6) {
                    }
                    return ra0.h(o, j2);
                }
                z = false;
                if (to.f(toVar.f)) {
                }
                z2 = false;
                if (to.f(toVar.g)) {
                }
                if (to.f(toVar.d)) {
                }
                if (to.f(toVar.e)) {
                }
                if (!z2) {
                }
                if (z6) {
                }
                return ra0.h(o, j2);
            }
            g = 0.0f;
            o = mz.o(g, d);
            if (!ra0.b(o, 0L)) {
            }
            long g22 = ra0.g(j, o);
            f2Var.getClass();
            zo0 zo0Var22 = (zo0) f2Var.f;
            long j22 = new ra0(zo0.a(zo0Var22, zo0Var22.h, g22, zo0Var22.g)).a;
            long g32 = ra0.g(g22, j22);
            if (i == 1) {
            }
            z = false;
            if (to.f(toVar.f)) {
            }
            z2 = false;
            if (to.f(toVar.g)) {
            }
            if (to.f(toVar.d)) {
            }
            if (to.f(toVar.e)) {
            }
            if (!z2) {
            }
            if (z6) {
            }
            return ra0.h(o, j22);
        }
        d = 0.0f;
        if (ra0.d(j) != 0.0f) {
        }
        g = 0.0f;
        o = mz.o(g, d);
        if (!ra0.b(o, 0L)) {
        }
        long g222 = ra0.g(j, o);
        f2Var.getClass();
        zo0 zo0Var222 = (zo0) f2Var.f;
        long j222 = new ra0(zo0.a(zo0Var222, zo0Var222.h, g222, zo0Var222.g)).a;
        long g322 = ra0.g(g222, j222);
        if (i == 1) {
        }
        z = false;
        if (to.f(toVar.f)) {
        }
        z2 = false;
        if (to.f(toVar.g)) {
        }
        if (to.f(toVar.d)) {
        }
        if (to.f(toVar.e)) {
        }
        if (!z2) {
        }
        if (z6) {
        }
        return ra0.h(o, j222);
    }

    @Override // defpackage.bd0
    public final u50 i() {
        return this.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0166, code lost:
    
        if (r4 == r6) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // defpackage.bd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(long j, yo0 yo0Var, kj kjVar) {
        o4 o4Var;
        int i;
        float f;
        float f2;
        long d;
        long d2;
        q4 q4Var = this;
        if (kjVar instanceof o4) {
            o4Var = (o4) kjVar;
            int i2 = o4Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o4Var.h = i2 - Integer.MIN_VALUE;
                Object obj = o4Var.f;
                i = o4Var.h;
                ky0 ky0Var = ky0.a;
                if (i != 0) {
                    rg0.u(obj);
                    boolean f3 = fr0.f(q4Var.i);
                    ck ckVar = ck.d;
                    if (f3) {
                        o4Var.h = 1;
                        yo0Var.getClass();
                        yo0 yo0Var2 = new yo0(yo0Var.g, o4Var);
                        yo0Var2.f = j;
                        if (yo0Var2.invokeSuspend(ky0Var) != ckVar) {
                            return ky0Var;
                        }
                    } else {
                        float b = mz0.b(j);
                        to toVar = q4Var.e;
                        if (b > 0.0f && to.g(toVar.f)) {
                            EdgeEffect c = toVar.c();
                            int H = a50.H(mz0.b(j));
                            if (Build.VERSION.SDK_INT >= 31) {
                                c.onAbsorb(H);
                            } else if (c.isFinished()) {
                                c.onAbsorb(H);
                            }
                            f = mz0.b(j);
                        } else if (mz0.b(j) >= 0.0f || !to.g(toVar.g)) {
                            f = 0.0f;
                        } else {
                            EdgeEffect d3 = toVar.d();
                            int i3 = -a50.H(mz0.b(j));
                            if (Build.VERSION.SDK_INT >= 31) {
                                d3.onAbsorb(i3);
                            } else if (d3.isFinished()) {
                                d3.onAbsorb(i3);
                            }
                            f = mz0.b(j);
                        }
                        if (mz0.c(j) > 0.0f && to.g(toVar.d)) {
                            EdgeEffect e = toVar.e();
                            int H2 = a50.H(mz0.c(j));
                            if (Build.VERSION.SDK_INT >= 31) {
                                e.onAbsorb(H2);
                            } else if (e.isFinished()) {
                                e.onAbsorb(H2);
                            }
                            f2 = mz0.c(j);
                        } else if (mz0.c(j) >= 0.0f || !to.g(toVar.e)) {
                            f2 = 0.0f;
                        } else {
                            EdgeEffect b2 = toVar.b();
                            int i4 = -a50.H(mz0.c(j));
                            if (Build.VERSION.SDK_INT >= 31) {
                                b2.onAbsorb(i4);
                            } else if (b2.isFinished()) {
                                b2.onAbsorb(i4);
                            }
                            f2 = mz0.c(j);
                        }
                        long b3 = rg0.b(f, f2);
                        if (b3 != 0) {
                            q4Var.c();
                        }
                        d = mz0.d(j, b3);
                        o4Var.d = q4Var;
                        o4Var.e = d;
                        o4Var.h = 2;
                        yo0Var.getClass();
                        yo0 yo0Var3 = new yo0(yo0Var.g, o4Var);
                        yo0Var3.f = d;
                        obj = yo0Var3.invokeSuspend(ky0Var);
                    }
                    return ckVar;
                }
                if (i == 1) {
                    rg0.u(obj);
                    return ky0Var;
                }
                if (i != 2) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j2 = o4Var.e;
                q4 q4Var2 = o4Var.d;
                rg0.u(obj);
                q4Var = q4Var2;
                d = j2;
                d2 = mz0.d(d, ((mz0) obj).a);
                q4Var.h = false;
                to toVar2 = q4Var.e;
                if (mz0.b(d2) <= 0.0f) {
                    EdgeEffect c2 = toVar2.c();
                    int H3 = a50.H(mz0.b(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        c2.onAbsorb(H3);
                    } else if (c2.isFinished()) {
                        c2.onAbsorb(H3);
                    }
                } else if (mz0.b(d2) < 0.0f) {
                    EdgeEffect d4 = toVar2.d();
                    int i5 = -a50.H(mz0.b(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        d4.onAbsorb(i5);
                    } else if (d4.isFinished()) {
                        d4.onAbsorb(i5);
                    }
                }
                if (mz0.c(d2) <= 0.0f) {
                    EdgeEffect e2 = toVar2.e();
                    int H4 = a50.H(mz0.c(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        e2.onAbsorb(H4);
                    } else if (e2.isFinished()) {
                        e2.onAbsorb(H4);
                    }
                } else if (mz0.c(d2) < 0.0f) {
                    EdgeEffect b4 = toVar2.b();
                    int i6 = -a50.H(mz0.c(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        b4.onAbsorb(i6);
                    } else if (b4.isFinished()) {
                        b4.onAbsorb(i6);
                    }
                }
                if (d2 != 0) {
                    q4Var.c();
                }
                q4Var.a();
                return ky0Var;
            }
        }
        o4Var = new o4(q4Var, (lj) kjVar);
        Object obj2 = o4Var.f;
        i = o4Var.h;
        ky0 ky0Var2 = ky0.a;
        if (i != 0) {
        }
        d2 = mz0.d(d, ((mz0) obj2).a);
        q4Var.h = false;
        to toVar22 = q4Var.e;
        if (mz0.b(d2) <= 0.0f) {
        }
        if (mz0.c(d2) <= 0.0f) {
        }
        if (d2 != 0) {
        }
        q4Var.a();
        return ky0Var2;
    }

    public final float k(long j) {
        float d = ra0.d(b());
        float e = ra0.e(j) / fr0.c(this.i);
        EdgeEffect e2 = this.e.e();
        int i = Build.VERSION.SDK_INT;
        r7 r7Var = r7.a;
        if (i >= 31) {
            e = r7Var.c(e2, e, d);
        } else {
            e2.onPull(e, d);
        }
        return (i >= 31 ? r7Var.b(e2) : 0.0f) == 0.0f ? fr0.c(this.i) * e : ra0.e(j);
    }

    public final void l(long j) {
        boolean b = fr0.b(this.i, 0L);
        boolean b2 = fr0.b(j, this.i);
        this.i = j;
        if (!b2) {
            long c = px0.c(a50.H(fr0.e(j)), a50.H(fr0.c(j)));
            to toVar = this.e;
            toVar.c = c;
            EdgeEffect edgeEffect = toVar.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (c >> 32), (int) (c & 4294967295L));
            }
            EdgeEffect edgeEffect2 = toVar.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (c >> 32), (int) (c & 4294967295L));
            }
            EdgeEffect edgeEffect3 = toVar.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (c & 4294967295L), (int) (c >> 32));
            }
            EdgeEffect edgeEffect4 = toVar.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (c & 4294967295L), (int) (c >> 32));
            }
            EdgeEffect edgeEffect5 = toVar.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (c >> 32), (int) (c & 4294967295L));
            }
            EdgeEffect edgeEffect6 = toVar.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (c >> 32), (int) (c & 4294967295L));
            }
            EdgeEffect edgeEffect7 = toVar.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (c & 4294967295L), (int) (c >> 32));
            }
            EdgeEffect edgeEffect8 = toVar.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & c), (int) (c >> 32));
            }
        }
        if (b || b2) {
            return;
        }
        c();
        a();
    }
}
