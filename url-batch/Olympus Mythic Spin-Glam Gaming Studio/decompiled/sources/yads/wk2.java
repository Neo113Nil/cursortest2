package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class wk2 implements cx0 {
    public final ac1 a;
    public final Handler b;
    public final k5 c;
    public u00 d;
    public sb1 e;
    public String f;

    public wk2(Context context, v3 v3Var, yu2 yu2Var, i5 i5Var, ac1 ac1Var) {
        Handler handler = new Handler(Looper.getMainLooper());
        k5 k5Var = new k5(context, v3Var, i5Var, yu2Var);
        this.a = ac1Var;
        this.b = handler;
        this.c = k5Var;
    }

    @Override // yads.cx0
    public final void onAdFailedToLoad(d4 d4Var) {
        this.c.a(d4Var.b, d4Var.c);
        final d4 d4Var2 = new d4(d4Var.a, d4Var.b, d4Var.c, this.f);
        this.b.post(new Runnable() { // from class: yads.wk2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                wk2.a(wk2.this, d4Var2);
            }
        });
    }

    @Override // yads.cx0
    public final void a(qb1 qb1Var) {
        this.c.a();
        ac1 ac1Var = this.a;
        final zb1 zb1Var = new zb1(ac1Var.b, qb1Var, ac1Var.a);
        this.b.post(new Runnable() { // from class: yads.wk2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                wk2.a(wk2.this, zb1Var);
            }
        });
    }

    public static final void a(wk2 wk2Var, zb1 zb1Var) {
        u00 u00Var = wk2Var.d;
        if (u00Var != null) {
            u00Var.a(zb1Var);
        }
        sb1 sb1Var = wk2Var.e;
        if (sb1Var != null) {
            sb1Var.a.a(sb1Var.b);
        }
    }

    public static final void a(wk2 wk2Var, d4 d4Var) {
        u00 u00Var = wk2Var.d;
        if (u00Var != null) {
            u00Var.onAdFailedToLoad(d4Var);
        }
        sb1 sb1Var = wk2Var.e;
        if (sb1Var != null) {
            sb1Var.a.a(sb1Var.b);
        }
    }
}
