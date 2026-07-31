package yads;

import android.content.Context;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes15.dex */
public abstract class l01 extends wm {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l01(Context context, v3 v3Var, i5 i5Var, yu2 yu2Var) {
        super(context, i5Var, v3Var, yu2Var, CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO()).plus(new b20(pr.a(r0, r0)))), new j01(context, v3Var, i5Var, yu2Var));
        Context context2 = ((nt3) yu2Var).a;
    }
}
