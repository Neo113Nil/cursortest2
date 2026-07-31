package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class yk2 implements cx0 {
    public final lr2 a;
    public final Handler b;
    public final k5 c;
    public String d;
    public o10 e;
    public dr2 f;

    public yk2(Context context, v3 v3Var, yu2 yu2Var, i5 i5Var, lr2 lr2Var) {
        Handler handler = new Handler(Looper.getMainLooper());
        k5 k5Var = new k5(context, v3Var, i5Var, yu2Var);
        this.a = lr2Var;
        this.b = handler;
        this.c = k5Var;
    }

    @Override // yads.cx0
    public final void onAdFailedToLoad(final d4 d4Var) {
        this.c.a(d4Var.b, d4Var.c);
        this.b.post(new Runnable() { // from class: yads.yk2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                yk2.a(d4.this, this);
            }
        });
    }

    @Override // yads.cx0
    public final void a(br2 br2Var) {
        this.c.a();
        lr2 lr2Var = this.a;
        final kr2 kr2Var = new kr2(lr2Var.b, br2Var, lr2Var.a);
        this.b.post(new Runnable() { // from class: yads.yk2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                yk2.a(yk2.this, kr2Var);
            }
        });
    }

    public static final void a(yk2 yk2Var, kr2 kr2Var) {
        o10 o10Var = yk2Var.e;
        if (o10Var != null) {
            o10Var.a(kr2Var);
        }
        dr2 dr2Var = yk2Var.f;
        if (dr2Var != null) {
            dr2Var.a.a(dr2Var.b);
        }
    }

    public static final void a(d4 d4Var, yk2 yk2Var) {
        d4 d4Var2 = new d4(d4Var.a, d4Var.b, d4Var.c, yk2Var.d);
        o10 o10Var = yk2Var.e;
        if (o10Var != null) {
            o10Var.onAdFailedToLoad(d4Var2);
        }
        dr2 dr2Var = yk2Var.f;
        if (dr2Var != null) {
            dr2Var.a.a(dr2Var.b);
        }
    }
}
