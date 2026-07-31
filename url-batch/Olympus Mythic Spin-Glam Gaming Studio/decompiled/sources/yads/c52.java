package yads;

import android.content.Context;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes15.dex */
public final class c52 {
    public final dw2 a;
    public final zz1 b;

    public c52(Context context, v3 v3Var, i5 i5Var, yu2 yu2Var) {
        Context context2 = ((nt3) yu2Var).a;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO()).plus(new b20(pr.a(context2, context2))));
        Context applicationContext = context.getApplicationContext();
        dw2 dw2Var = new dw2(yu2Var);
        zz1 zz1Var = new zz1(applicationContext, CoroutineScope, v3Var, i5Var, yu2Var);
        this.a = dw2Var;
        this.b = zz1Var;
        v3Var.f = e52.c;
    }

    public final void a(t8 t8Var, b52 b52Var, bq2 bq2Var) {
        s12 s12Var = (s12) t8Var.t;
        if (s12Var == null) {
            b52Var.a(e8.c);
            bq2Var.a();
            return;
        }
        bq2Var.a(s12Var);
        dw2 dw2Var = this.a;
        hx2 hx2Var = new hx2();
        yu2 yu2Var = dw2Var.a;
        l02 l02Var = new l02(new jt2(t8Var), new it2(yu2Var), hx2Var, new tv2(yu2Var, t8Var), new yw2());
        n32 n32Var = new n32(b52Var);
        zz1 zz1Var = this.b;
        BuildersKt__Builders_commonKt.launch$default(zz1Var.d, null, null, new yz1(zz1Var, t8Var, s12Var, l02Var, n32Var, null), 3, null);
    }
}
