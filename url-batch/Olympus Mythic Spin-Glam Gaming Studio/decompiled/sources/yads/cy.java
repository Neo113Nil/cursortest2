package yads;

import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes5.dex */
public final class cy implements CoroutineExceptionHandler {
    public final List b;
    public final CoroutineExceptionHandler.Key c = CoroutineExceptionHandler.Key;

    public cy(List list) {
        this.b = list;
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
        Object m8023constructorimpl;
        for (CoroutineExceptionHandler coroutineExceptionHandler : this.b) {
            try {
                Result.Companion companion = Result.INSTANCE;
                coroutineExceptionHandler.handleException(coroutineContext, th);
                m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
                boolean z = ob1.a;
            }
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
