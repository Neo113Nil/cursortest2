package yads;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes6.dex */
public final class a52 implements CoroutineExceptionHandler {
    public final uz1 b;
    public final CoroutineExceptionHandler.Key c = CoroutineExceptionHandler.Key;

    public a52(uz1 uz1Var) {
        this.b = uz1Var;
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
        return this.c;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        th.getClass();
        boolean z = ob1.a;
        this.b.a(e8.w);
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
