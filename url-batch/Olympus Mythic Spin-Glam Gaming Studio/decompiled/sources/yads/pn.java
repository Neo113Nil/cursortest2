package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public abstract class pn {
    public final Context a;
    public final yu2 b;
    public final v0 c;
    public final CoroutineScope d;

    public pn(Context context, yu2 yu2Var, v0 v0Var, CoroutineScope coroutineScope) {
        this.a = context;
        this.b = yu2Var;
        this.c = v0Var;
        this.d = coroutineScope;
    }

    public abstract Object a(d8 d8Var, Object obj, on onVar);

    public final Object a(d8 d8Var, wx0 wx0Var) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(wx0Var), 1);
        cancellableContinuationImpl.initCancellability();
        ln lnVar = new ln(cancellableContinuationImpl, d8Var, this.d, this.c, new on(this, null));
        cancellableContinuationImpl.invokeOnCancellation(new nn(lnVar, a(d8Var, lnVar), this, d8Var));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(wx0Var);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public abstract bx0 a(d8 d8Var, ln lnVar);
}
