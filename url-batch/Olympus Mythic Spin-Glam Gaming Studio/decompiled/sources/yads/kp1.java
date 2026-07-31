package yads;

import android.content.Context;

/* loaded from: classes4.dex */
public final class kp1 implements l32 {
    public final wn1 a;
    public final r22 b;

    public kp1(Context context, x02 x02Var, km kmVar, t8 t8Var, vq1 vq1Var) {
        v3 v3Var = kmVar.b;
        yu2 yu2Var = kmVar.c;
        ap1 ap1Var = new ap1(v3Var);
        so1 so1Var = new so1(v3Var, yu2Var, t8Var);
        hp1 hp1Var = new hp1(new go1(vq1Var.b, ap1Var, so1Var, null, 24));
        wn1 wn1Var = new wn1(context, v3Var, yu2Var, t8Var, kmVar.a, new ip1(), so1Var, hp1Var, new gc2(x02Var, vq1Var));
        r22 r22Var = new r22(context, t8Var, yu2Var, x02Var, kmVar, wn1Var);
        this.a = wn1Var;
        this.b = r22Var;
    }

    @Override // yads.l32
    public final void a(Context context, t8 t8Var) {
        this.a.a(context, this.b);
    }
}
