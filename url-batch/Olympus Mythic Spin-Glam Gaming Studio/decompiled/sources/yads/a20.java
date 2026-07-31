package yads;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes6.dex */
public final class a20 implements CoroutineExceptionHandler {
    public final CoroutineExceptionHandler.Key b = CoroutineExceptionHandler.Key;

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
        return this.b;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        th.getClass();
        boolean z = ob1.a;
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
