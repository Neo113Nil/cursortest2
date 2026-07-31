package yads;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes11.dex */
public final class b20 implements CoroutineExceptionHandler {
    public final lo2 b;

    public b20(lo2 lo2Var) {
        this.b = lo2Var;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ Object fold(Object obj, Function2 function2) {
        return CoroutineExceptionHandler.DefaultImpls.fold(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final /* bridge */ CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineExceptionHandler.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key getKey() {
        return CoroutineExceptionHandler.Key;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        try {
            Result.Companion companion = Result.INSTANCE;
            String message = th.getMessage();
            if (message == null) {
                message = "Unknown";
            }
            boolean z = ob1.a;
            this.b.reportError(message, th);
            Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineExceptionHandler.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineExceptionHandler.DefaultImpls.plus(this, coroutineContext);
    }
}
