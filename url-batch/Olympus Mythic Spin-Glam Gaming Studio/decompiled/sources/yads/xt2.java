package yads;

import android.content.Context;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes5.dex */
public final class xt2 {
    public final CoroutineScope a;
    public final Context b;
    public final i5 c;
    public final pm0 d;
    public final ic e;
    public final pv2 f;
    public final y43 g;
    public final ot2 h;
    public final bb2 i;

    public xt2(Context context, nt3 nt3Var) {
        pm0 pm0Var;
        pm0 pm0Var2;
        Context context2 = nt3Var.a;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO()).plus(new b20(pr.a(context2, context2))));
        Context applicationContext = context.getApplicationContext();
        i5 i5Var = new i5();
        pm0 pm0Var3 = pm0.c;
        if (pm0Var3 == null) {
            synchronized (pm0.d) {
                pm0Var2 = pm0.c;
                if (pm0Var2 == null) {
                    pm0Var2 = new pm0(applicationContext.getApplicationContext());
                    pm0.c = pm0Var2;
                }
            }
            pm0Var = pm0Var2;
        } else {
            pm0Var = pm0Var3;
        }
        ic icVar = new ic();
        pv2 pv2Var = new pv2(applicationContext, nt3Var, CoroutineScope, i5Var, pm0Var, icVar, 4194240);
        y43 a = x43.a();
        ot2 ot2Var = new ot2(i5Var);
        Context context3 = nt3Var.a;
        bb2 bb2Var = new bb2(i5Var, pr.a(context3, context3));
        this.a = CoroutineScope;
        this.b = applicationContext;
        this.c = i5Var;
        this.d = pm0Var;
        this.e = icVar;
        this.f = pv2Var;
        this.g = a;
        this.h = ot2Var;
        this.i = bb2Var;
    }
}
