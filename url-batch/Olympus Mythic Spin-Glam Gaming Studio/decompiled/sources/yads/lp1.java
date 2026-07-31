package yads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class lp1 implements m32 {
    public final t8 a;
    public final vq1 b;
    public final Context c;

    public lp1(Context context, t8 t8Var, vq1 vq1Var) {
        this.a = t8Var;
        this.b = vq1Var;
        this.c = pz.a(context);
    }

    @Override // yads.m32
    public final l32 a(x02 x02Var, km kmVar) {
        return new kp1(this.c, x02Var, kmVar, this.a, this.b);
    }
}
