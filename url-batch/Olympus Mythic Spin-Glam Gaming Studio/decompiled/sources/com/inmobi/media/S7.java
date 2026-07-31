package com.inmobi.media;

import kotlin.Lazy;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes13.dex */
public final class S7 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public final /* synthetic */ V7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S7(CoroutineExceptionHandler.Key key, V7 v7) {
        super(key);
        this.a = v7;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        InterfaceC4466x9 interfaceC4466x9 = this.a.b;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).b("HtmlMediaPlayer", "Unhandled exception: " + th.getMessage());
        }
        Lazy lazy = AbstractC3861aa.a;
        AbstractC3861aa.a(new Q2(th));
    }
}
