package yads;

import android.content.Context;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes14.dex */
public final class h10 {
    public final nt3 a;
    public final Context b;
    public final CoroutineScope c;
    public final f12 d;

    public h10(Context context, nt3 nt3Var) {
        d00 d00Var = e00.c;
        Context applicationContext = context.getApplicationContext();
        Context context2 = nt3Var.a;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getDefault()).plus(new b20(pr.a(context2, context2))));
        f12 f12Var = new f12(applicationContext, nt3Var);
        this.a = nt3Var;
        this.b = applicationContext;
        this.c = CoroutineScope;
        this.d = f12Var;
    }
}
