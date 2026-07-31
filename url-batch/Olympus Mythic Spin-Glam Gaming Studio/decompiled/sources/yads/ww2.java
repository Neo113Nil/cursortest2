package yads;

import android.content.Context;

/* loaded from: classes15.dex */
public final class ww2 {
    public final nt3 a;

    public ww2(rh1 rh1Var, nt3 nt3Var) {
        this.a = nt3Var;
    }

    public final void a(Context context) {
        Boolean bool = (Boolean) rh1.a(context, sh1.c.b);
        if (bool != null ? bool.booleanValue() : true) {
            nt3 nt3Var = this.a;
            k00 k00Var = new k00() { // from class: yads.ww2$$ExternalSyntheticLambda0
                @Override // yads.k00
                public final void onInitializationCompleted() {
                    ww2.a();
                }
            };
            new pq0().a(new gv1(context, nt3Var, k00Var), new hv1(context, nt3Var, k00Var));
        }
    }

    public static final void a() {
        boolean z = ob1.a;
    }
}
