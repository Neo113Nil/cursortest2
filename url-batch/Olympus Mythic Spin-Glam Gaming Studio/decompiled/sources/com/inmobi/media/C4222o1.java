package com.inmobi.media;

import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: com.inmobi.media.o1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4222o1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public final /* synthetic */ C4248p1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4222o1(CoroutineExceptionHandler.Key key, C4248p1 c4248p1) {
        super(key);
        this.a = c4248p1;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        C4493y9 c4493y9 = this.a.c;
        if (c4493y9 != null) {
            c4493y9.b("AdUnitManager", "Exception: " + ExceptionsKt.stackTraceToString(th));
        }
        Lazy lazy = AbstractC3861aa.a;
        AbstractC3861aa.a(new Q2(th));
    }
}
