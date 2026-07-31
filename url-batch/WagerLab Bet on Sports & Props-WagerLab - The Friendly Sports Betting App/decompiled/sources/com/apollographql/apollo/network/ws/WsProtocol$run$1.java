package com.apollographql.apollo.network.ws;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WsProtocol.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.ws.WsProtocol", f = "WsProtocol.kt", i = {0}, l = {143}, m = "run$suspendImpl", n = {"$this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class WsProtocol$run$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WsProtocol this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WsProtocol$run$1(WsProtocol wsProtocol, Continuation<? super WsProtocol$run$1> continuation) {
        super(continuation);
        this.this$0 = wsProtocol;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return WsProtocol.run$suspendImpl(this.this$0, this);
    }
}
