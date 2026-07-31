package com.apollographql.apollo.network.ws;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SubscriptionWsProtocol.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.ws.SubscriptionWsProtocol", f = "SubscriptionWsProtocol.kt", i = {0}, l = {31, 38}, m = "connectionInit", n = {"message"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class SubscriptionWsProtocol$connectionInit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubscriptionWsProtocol this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionWsProtocol$connectionInit$1(SubscriptionWsProtocol subscriptionWsProtocol, Continuation<? super SubscriptionWsProtocol$connectionInit$1> continuation) {
        super(continuation);
        this.this$0 = subscriptionWsProtocol;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.connectionInit(this);
    }
}
