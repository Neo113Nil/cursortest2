package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes6.dex */
public final class uk2 implements cx0 {
    public final Handler a;
    public final k5 b;
    public final sg c;
    public g00 d;
    public ig e;

    public uk2(Context context, v3 v3Var, yu2 yu2Var, i5 i5Var, dx0 dx0Var) {
        Handler handler = new Handler(Looper.getMainLooper());
        k5 k5Var = new k5(context, v3Var, i5Var, yu2Var);
        sg sgVar = new sg(context, dx0Var);
        this.a = handler;
        this.b = k5Var;
        this.c = sgVar;
    }

    @Override // yads.cx0
    public final void onAdFailedToLoad(final d4 d4Var) {
        this.b.a(d4Var.b, d4Var.c);
        this.a.post(new Runnable() { // from class: yads.uk2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                uk2.a(uk2.this, d4Var);
            }
        });
    }

    public static final void a(uk2 uk2Var, d4 d4Var) {
        g00 g00Var = uk2Var.d;
        if (g00Var != null) {
            g00Var.onAdFailedToLoad(d4Var);
        }
        ig igVar = uk2Var.e;
        if (igVar != null) {
            igVar.a.a(igVar.b);
        }
    }

    @Override // yads.cx0
    public final void a(gg ggVar) {
        this.b.a();
        sg sgVar = this.c;
        final rg rgVar = new rg(sgVar.b, sgVar.a, ggVar);
        this.a.post(new Runnable() { // from class: yads.uk2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                uk2.a(uk2.this, rgVar);
            }
        });
    }

    public static final void a(uk2 uk2Var, rg rgVar) {
        g00 g00Var = uk2Var.d;
        if (g00Var != null) {
            g00Var.a(rgVar);
        }
        ig igVar = uk2Var.e;
        if (igVar != null) {
            igVar.a.a(igVar.b);
        }
    }
}
