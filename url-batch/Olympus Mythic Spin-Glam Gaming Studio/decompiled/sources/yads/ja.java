package yads;

import android.view.View;

/* loaded from: classes4.dex */
public final class ja implements hk3 {
    public final a22 a;
    public final cv b;

    public ja(a22 a22Var, cv cvVar) {
        this.a = a22Var;
        this.b = cvVar;
    }

    @Override // yads.hk3
    public final void a(View view, ph phVar) {
    }

    @Override // yads.hk3
    public final void a(ph phVar, bv bvVar) {
        kf1 kf1Var = phVar.d;
        cv cvVar = this.b;
        a22 a22Var = this.a;
        cvVar.getClass();
        if (!phVar.e || kf1Var == null) {
            return;
        }
        bvVar.a(kf1Var, new dv(phVar, cvVar.a, a22Var, cvVar.b, cvVar.c));
    }
}
