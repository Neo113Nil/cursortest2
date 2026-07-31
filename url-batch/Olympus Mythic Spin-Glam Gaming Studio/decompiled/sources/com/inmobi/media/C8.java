package com.inmobi.media;

import kotlin.Lazy;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes11.dex */
public final class C8 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public final /* synthetic */ D8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8(CoroutineExceptionHandler.Key key, D8 d8) {
        super(key);
        this.a = d8;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        InterfaceC4466x9 interfaceC4466x9 = this.a.c;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).b("HybridVideoPlayerHandler", "Unhandled exception: " + th.getMessage());
        }
        Lazy lazy = AbstractC3861aa.a;
        AbstractC3861aa.a(new Q2(th));
    }
}
