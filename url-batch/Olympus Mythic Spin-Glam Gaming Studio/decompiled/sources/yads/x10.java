package yads;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes13.dex */
public final class x10 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public final /* synthetic */ om b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x10(CoroutineExceptionHandler.Key key, om omVar) {
        super(key);
        this.b = omVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        this.b.invoke(th);
    }
}
