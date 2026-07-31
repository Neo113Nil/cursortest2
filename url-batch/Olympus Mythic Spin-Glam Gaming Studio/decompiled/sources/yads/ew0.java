package yads;

import android.content.Context;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes3.dex */
public final class ew0 {
    public final pv0 a;
    public final CoroutineScope b;

    public ew0(Context context, mt1 mt1Var) {
        pv0 pv0Var = new pv0(context.getApplicationContext());
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO()).plus(new b20(mt1Var)));
        this.a = pv0Var;
        this.b = CoroutineScope;
    }
}
