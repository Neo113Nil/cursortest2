package defpackage;

import android.view.KeyEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class qd extends ol implements zg0, s00, cs, pp0, ix0 {
    public static final b2 J = new b2(23);
    public ku0 A;
    public nl B;
    public qh0 C;
    public ow D;
    public r60 G;
    public boolean H;
    public final b2 I;
    public r60 t;
    public vx u;
    public tl0 v;
    public boolean w;
    public bu x;
    public final xs z;
    public final vs y = new vs();
    public final LinkedHashMap E = new LinkedHashMap();
    public long F = 0;

    public qd(r60 r60Var, vx vxVar, boolean z, tl0 tl0Var, bu buVar) {
        this.t = r60Var;
        this.u = vxVar;
        this.v = tl0Var;
        this.w = z;
        this.x = buVar;
        this.z = new xs(r60Var);
        r60 r60Var2 = this.t;
        this.G = r60Var2;
        this.H = r60Var2 == null && this.u != null;
        this.I = J;
    }

    @Override // defpackage.s00
    public final boolean B(KeyEvent keyEvent) {
        int f;
        n0();
        boolean z = this.w;
        LinkedHashMap linkedHashMap = this.E;
        if (z) {
            int i = rd.b;
            if (d31.z(keyEvent) == 2 && ((f = (int) (x40.f(keyEvent.getKeyCode()) >> 32)) == 23 || f == 66 || f == 160)) {
                if (!linkedHashMap.containsKey(new p00(x40.f(keyEvent.getKeyCode())))) {
                    qh0 qh0Var = new qh0(this.F);
                    linkedHashMap.put(new p00(x40.f(keyEvent.getKeyCode())), qh0Var);
                    if (this.t != null) {
                        d31.E(V(), null, new f(this, qh0Var, null, 0), 3);
                    }
                    return true;
                }
                return false;
            }
        }
        if (this.w) {
            int i2 = rd.b;
            if (d31.z(keyEvent) == 1) {
                int f2 = (int) (x40.f(keyEvent.getKeyCode()) >> 32);
                if (f2 != 23 && f2 != 66 && f2 != 160) {
                    return false;
                }
                qh0 qh0Var2 = (qh0) linkedHashMap.remove(new p00(x40.f(keyEvent.getKeyCode())));
                if (qh0Var2 != null && this.t != null) {
                    d31.E(V(), null, new f(this, qh0Var2, null, 1), 3);
                }
                this.x.a();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cs
    public final void C(rs rsVar) {
        if (rsVar.a()) {
            n0();
        }
        if (this.w) {
            this.z.C(rsVar);
        }
    }

    @Override // defpackage.zg0
    public final /* synthetic */ boolean E() {
        return false;
    }

    @Override // defpackage.zg0
    public final void H() {
        L();
    }

    @Override // defpackage.zg0
    public final void L() {
        ow owVar;
        r60 r60Var = this.t;
        if (r60Var != null && (owVar = this.D) != null) {
            r60Var.b(new pw(owVar));
        }
        this.D = null;
        ku0 ku0Var = this.A;
        if (ku0Var != null) {
            ku0Var.L();
        }
    }

    @Override // defpackage.pp0
    public final /* synthetic */ boolean M() {
        return false;
    }

    @Override // defpackage.pp0
    public final boolean O() {
        return true;
    }

    @Override // defpackage.zg0
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // defpackage.t50
    public final boolean W() {
        return false;
    }

    @Override // defpackage.t50
    public final void Z() {
        if (!this.H) {
            n0();
        }
        if (this.w) {
            j0(this.y);
            j0(this.z);
        }
    }

    @Override // defpackage.t50
    public final void a0() {
        L();
    }

    @Override // defpackage.t50
    public final void b0() {
        m0();
        if (this.G == null) {
            this.t = null;
        }
        nl nlVar = this.B;
        if (nlVar != null) {
            k0(nlVar);
        }
        this.B = null;
    }

    @Override // defpackage.pp0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // defpackage.s00
    public final boolean g(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.ix0
    public final Object j() {
        return this.I;
    }

    @Override // defpackage.zg0
    public final long l() {
        return nz.m;
    }

    public final void m0() {
        r60 r60Var = this.t;
        LinkedHashMap linkedHashMap = this.E;
        if (r60Var != null) {
            qh0 qh0Var = this.C;
            if (qh0Var != null) {
                r60Var.b(new ph0(qh0Var));
            }
            ow owVar = this.D;
            if (owVar != null) {
                r60Var.b(new pw(owVar));
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                r60Var.b(new ph0((qh0) it.next()));
            }
        }
        this.C = null;
        this.D = null;
        linkedHashMap.clear();
    }

    public final void n0() {
        vx vxVar;
        if (this.B == null && (vxVar = this.u) != null) {
            if (this.t == null) {
                this.t = new r60();
            }
            this.z.m0(this.t);
            r60 r60Var = this.t;
            r60Var.getClass();
            nl b = vxVar.b(r60Var);
            j0(b);
            this.B = b;
        }
    }

    @Override // defpackage.zg0
    public final void s(qg0 qg0Var, sg0 sg0Var, long j) {
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.F = mz.o((int) (j2 >> 32), (int) (j2 & 4294967295L));
        n0();
        kj kjVar = null;
        if (this.w && sg0Var == sg0.e) {
            int i = qg0Var.b;
            if (i == 4) {
                d31.E(V(), null, new g(this, kjVar, 0), 3);
            } else if (i == 5) {
                d31.E(V(), null, new g(this, kjVar, 1), 3);
            }
        }
        if (this.A == null) {
            c cVar = new c(this, kjVar, 2);
            qg0 qg0Var2 = hu0.a;
            ku0 ku0Var = new ku0(null, null, iu0.a);
            ku0Var.t = cVar;
            j0(ku0Var);
            this.A = ku0Var;
        }
        ku0 ku0Var2 = this.A;
        if (ku0Var2 != null) {
            ku0Var2.s(qg0Var, sg0Var, j);
        }
    }

    @Override // defpackage.pp0
    public final void v(np0 np0Var) {
        tl0 tl0Var = this.v;
        if (tl0Var != null) {
            xp0.a(np0Var, tl0Var.a);
        }
        b bVar = new b(0, this);
        n00[] n00VarArr = xp0.a;
        np0Var.d(mp0.b, new h0(null, bVar));
        if (this.w) {
            this.z.v(np0Var);
        } else {
            np0Var.d(vp0.i, ky0.a);
        }
    }
}
