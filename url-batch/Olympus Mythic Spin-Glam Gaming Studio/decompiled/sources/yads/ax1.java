package yads;

import java.util.Map;

/* loaded from: classes15.dex */
public final class ax1 implements t01 {
    public final xw1 a;
    public final mw1 b;
    public final vh3 c;
    public final bo3 d;
    public final iw1 e;
    public final o01 f;
    public final bu2 g;
    public av h;
    public boolean i;

    public ax1(xw1 xw1Var, mw1 mw1Var) {
        vw2 vw2Var;
        vh3 vh3Var = new vh3();
        bo3 bo3Var = new bo3(xw1Var);
        iw1 iw1Var = new iw1();
        o01 o01Var = new o01();
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a = vw2Var2.a(xw1Var.b);
        this.a = xw1Var;
        this.b = mw1Var;
        this.c = vh3Var;
        this.d = bo3Var;
        this.e = iw1Var;
        this.f = o01Var;
        this.g = a;
    }

    @Override // yads.t01
    public final void a(String str) {
        bu2 bu2Var = this.g;
        if (bu2Var == null || !bu2Var.F0 || this.i) {
            av avVar = this.h;
            if (avVar != null) {
                xw1 xw1Var = this.a;
                fw1 fw1Var = (fw1) avVar;
                kf1 kf1Var = fw1Var.a;
                kf1 kf1Var2 = new kf1(kf1Var.a, kf1Var.b, kf1Var.c, str, kf1Var.e, false);
                dv dvVar = fw1Var.b;
                a22 a22Var = dvVar.c;
                ev evVar = a22Var.a;
                ph phVar = dvVar.a;
                r3 r3Var = dvVar.b;
                mn2 mn2Var = dvVar.d;
                t41 t41Var = dvVar.e;
                evVar.getClass();
                new h02(phVar, r3Var, a22Var, mn2Var, kf1Var2, t41Var).onClick(xw1Var);
            }
            this.i = false;
        }
    }

    @Override // yads.t01
    public final void a(xw1 xw1Var, Map map) {
    }

    @Override // yads.t01
    public final void a(boolean z) {
    }

    @Override // yads.t01
    public final void a() {
        this.i = true;
    }
}
