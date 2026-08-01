package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class cw0 extends t50 implements i10, no, pp0 {
    public bw0 A;
    public aw0 B;
    public String r;
    public dw0 s;
    public ct t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public Map y;
    public vd0 z;

    @Override // defpackage.pp0
    public final /* synthetic */ boolean M() {
        return false;
    }

    @Override // defpackage.pp0
    public final /* synthetic */ boolean O() {
        return false;
    }

    @Override // defpackage.no
    public final void b(r10 r10Var) {
        vd0 j0;
        if (this.q) {
            aw0 aw0Var = this.B;
            if (aw0Var == null || !aw0Var.c || (j0 = aw0Var.d) == null) {
                j0 = j0();
                j0.b(r10Var);
            } else {
                j0.b(r10Var);
            }
            a5 a5Var = j0.j;
            if (a5Var == null) {
                StringBuilder sb = new StringBuilder("no paragraph (layoutCache=");
                sb.append(this.z);
                aw0 aw0Var2 = this.B;
                sb.append(", textSubstitution=");
                sb.append(aw0Var2);
                sb.append(')');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            kc p = r10Var.d.e.p();
            boolean z = j0.k;
            if (z) {
                long j = j0.l;
                p.i();
                p.d(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                ns0 ns0Var = this.s.a;
                gv0 gv0Var = ns0Var.m;
                if (gv0Var == null) {
                    gv0Var = gv0.b;
                }
                pq0 pq0Var = ns0Var.n;
                if (pq0Var == null) {
                    pq0Var = pq0.d;
                }
                nz nzVar = ns0Var.o;
                if (nzVar == null) {
                    nzVar = ar.o;
                }
                px0 e = ns0Var.a.e();
                if (e != null) {
                    float a = this.s.a.a.a();
                    l5 l5Var = a5Var.a.j;
                    int i = l5Var.c;
                    l5Var.c(e, (Float.floatToRawIntBits(a5Var.c()) << 32) | (Float.floatToRawIntBits(a5Var.b()) & 4294967295L), a);
                    l5Var.f(pq0Var);
                    l5Var.g(gv0Var);
                    l5Var.e(nzVar);
                    l5Var.b(3);
                    a5Var.d(p);
                    l5Var.b(i);
                } else {
                    long j2 = ge.g;
                    if (j2 == 16) {
                        j2 = this.s.b() != 16 ? this.s.b() : ge.b;
                    }
                    l5 l5Var2 = a5Var.a.j;
                    int i2 = l5Var2.c;
                    l5Var2.d(j2);
                    l5Var2.f(pq0Var);
                    l5Var2.g(gv0Var);
                    l5Var2.e(nzVar);
                    l5Var2.b(3);
                    a5Var.d(p);
                    l5Var2.b(i2);
                }
                if (z) {
                    p.g();
                }
            } catch (Throwable th) {
                if (z) {
                    p.g();
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0100, code lost:
    
        if (r4.d.d != false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x020e  */
    @Override // defpackage.i10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e40 d(f40 f40Var, b50 b50Var, long j) {
        vd0 j0;
        long j2;
        td0 td0Var;
        long j3;
        boolean z;
        td0 td0Var2;
        int i;
        aw0 aw0Var = this.B;
        if (aw0Var == null || !aw0Var.c || (j0 = aw0Var.d) == null) {
            j0 = j0();
            j0.b(f40Var);
        } else {
            j0.b(f40Var);
        }
        c10 layoutDirection = f40Var.getLayoutDirection();
        if (j0.g > 1) {
            o50 o50Var = j0.m;
            dw0 dw0Var = j0.b;
            sl slVar = j0.i;
            slVar.getClass();
            o50 z2 = px0.z(o50Var, layoutDirection, dw0Var, slVar, j0.c);
            j0.m = z2;
            int i2 = j0.g;
            float f = z2.g;
            float f2 = z2.f;
            if (Float.isNaN(f) || Float.isNaN(f2)) {
                float b = ud0.a(p50.a, z2.e, vi.b(0, 0, 15), z2.c, z2.d, 1).b();
                float b2 = ud0.a(p50.b, z2.e, vi.b(0, 0, 15), z2.c, z2.d, 2).b() - b;
                z2.g = b;
                z2.f = b2;
                f2 = b2;
                f = b;
            }
            if (i2 != 1) {
                i = Math.round((f2 * (i2 - 1)) + f);
                if (i < 0) {
                    i = 0;
                }
                int g = ui.g(j);
                if (i > g) {
                    i = g;
                }
            } else {
                i = ui.i(j);
            }
            j2 = vi.a(ui.j(j), ui.h(j), i, ui.g(j));
        } else {
            j2 = j;
        }
        a5 a5Var = j0.j;
        if (a5Var != null && (td0Var = j0.n) != null && !td0Var.b() && layoutDirection == j0.o) {
            if (ui.b(j2, j0.p)) {
                j3 = 4294967295L;
            } else {
                j3 = 4294967295L;
                if (ui.h(j2) == ui.h(j0.p)) {
                    if (ui.g(j2) >= a5Var.b()) {
                    }
                }
            }
            if (!ui.b(j2, j0.p)) {
                a5 a5Var2 = j0.j;
                a5Var2.getClass();
                long d = vi.d(j2, px0.c(yc0.b(Math.min(a5Var2.a.l.c(), a5Var2.c())), yc0.b(a5Var2.b())));
                j0.l = d;
                j0.k = j0.d != 3 && (((float) ((int) (d >> 32))) < a5Var2.c() || ((float) ((int) (d & j3))) < a5Var2.b());
                j0.p = j2;
            }
            z = false;
            td0Var2 = j0.n;
            if (td0Var2 != null) {
                td0Var2.b();
            }
            a5 a5Var3 = j0.j;
            a5Var3.getClass();
            qv0 qv0Var = a5Var3.d;
            long j4 = j0.l;
            if (z) {
                nz.Y(this, 2).C0();
                Map map = this.y;
                if (map == null) {
                    map = new LinkedHashMap(2);
                }
                map.put(e2.a, Integer.valueOf(Math.round(qv0Var.c(0))));
                map.put(e2.b, Integer.valueOf(Math.round(qv0Var.c(qv0Var.f - 1))));
                this.y = map;
            }
            int i3 = (int) (j4 >> 32);
            int i4 = (int) (j4 & j3);
            yf0 d2 = b50Var.d(px0.y(i3, i3, i4, i4));
            Map map2 = this.y;
            map2.getClass();
            return f40Var.h0(i3, i4, map2, new hq(d2, 7));
        }
        j3 = 4294967295L;
        td0 td0Var3 = j0.n;
        if (td0Var3 == null || layoutDirection != j0.o || td0Var3.b()) {
            j0.o = layoutDirection;
            String str = j0.a;
            dw0 q = ud0.q(j0.b, layoutDirection);
            sl slVar2 = j0.i;
            slVar2.getClass();
            ct ctVar = j0.c;
            wp wpVar = wp.d;
            td0Var3 = new d5(str, q, wpVar, wpVar, ctVar, slVar2);
        }
        j0.n = td0Var3;
        long q2 = d31.q(j2, j0.e, j0.d, td0Var3.c());
        boolean z3 = j0.e;
        int i5 = j0.d;
        int i6 = j0.f;
        a5 a5Var4 = new a5((d5) td0Var3, ((z3 || i5 != 2) && i6 >= 1) ? i6 : 1, i5 == 2 ? 2 : 1, q2);
        j0.p = j2;
        long d3 = vi.d(j2, px0.c(yc0.b(a5Var4.c()), yc0.b(a5Var4.b())));
        j0.l = d3;
        j0.k = j0.d != 3 && (((float) ((int) (d3 >> 32))) < a5Var4.c() || ((float) ((int) (d3 & j3))) < a5Var4.b());
        j0.j = a5Var4;
        z = true;
        td0Var2 = j0.n;
        if (td0Var2 != null) {
        }
        a5 a5Var32 = j0.j;
        a5Var32.getClass();
        qv0 qv0Var2 = a5Var32.d;
        long j42 = j0.l;
        if (z) {
        }
        int i32 = (int) (j42 >> 32);
        int i42 = (int) (j42 & j3);
        yf0 d22 = b50Var.d(px0.y(i32, i32, i42, i42));
        Map map22 = this.y;
        map22.getClass();
        return f40Var.h0(i32, i42, map22, new hq(d22, 7));
    }

    @Override // defpackage.pp0
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final vd0 j0() {
        if (this.z == null) {
            this.z = new vd0(this.r, this.s, this.t, this.u, this.v, this.w, this.x);
        }
        vd0 vd0Var = this.z;
        vd0Var.getClass();
        return vd0Var;
    }

    @Override // defpackage.pp0
    public final void v(np0 np0Var) {
        bw0 bw0Var = this.A;
        if (bw0Var == null) {
            bw0Var = new bw0(this, 0);
            this.A = bw0Var;
        }
        l7 l7Var = new l7(this.r);
        n00[] n00VarArr = xp0.a;
        np0Var.d(vp0.z, px0.H(l7Var));
        aw0 aw0Var = this.B;
        if (aw0Var != null) {
            boolean z = aw0Var.c;
            yp0 yp0Var = vp0.B;
            n00[] n00VarArr2 = xp0.a;
            n00 n00Var = n00VarArr2[16];
            np0Var.d(yp0Var, Boolean.valueOf(z));
            l7 l7Var2 = new l7(aw0Var.b);
            yp0 yp0Var2 = vp0.A;
            n00 n00Var2 = n00VarArr2[15];
            np0Var.d(yp0Var2, l7Var2);
        }
        np0Var.d(mp0.j, new h0(null, new bw0(this, 1)));
        np0Var.d(mp0.k, new h0(null, new bw0(this, 2)));
        np0Var.d(mp0.l, new h0(null, new b(20, this)));
        np0Var.d(mp0.a, new h0(null, bw0Var));
    }

    @Override // defpackage.no
    public final /* synthetic */ void R() {
    }
}
