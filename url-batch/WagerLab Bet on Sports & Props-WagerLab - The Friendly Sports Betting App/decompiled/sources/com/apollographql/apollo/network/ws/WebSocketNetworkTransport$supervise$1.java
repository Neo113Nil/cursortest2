package com.apollographql.apollo.network.ws;

import com.facebook.internal.FacebookRequestErrorClassification;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WebSocketNetworkTransport.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport", f = "WebSocketNetworkTransport.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8}, l = {149, 154, 156, 191, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 200, 210, 214, 241}, m = "supervise", n = {"scope", "idleJob", "connectionJob", "protocol", "activeMessages", "reopenAttemptCount", "scope", "idleJob", "connectionJob", "protocol", "activeMessages", "message", "reopenAttemptCount", "scope", "idleJob", "connectionJob", "protocol", "activeMessages", "reopenAttemptCount", "scope", "idleJob", "connectionJob", "protocol", "activeMessages", "message", "reopenAttemptCount", "scope", "idleJob", "connectionJob", "protocol", "activeMessages", "message", "reopenAttemptCount", "scope", "idleJob", "connectionJob", "protocol", "activeMessages", "reopenAttemptCount", "scope", "idleJob", "connectionJob", "protocol", "activeMessages", "message", "reopenAttemptCount", "scope", "idleJob", "connectionJob", "protocol", "activeMessages", "reopenAttemptCount", "scope", "idleJob", "connectionJob", "protocol", "activeMessages", "reopenAttemptCount"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0"})
/* loaded from: classes3.dex */
final class WebSocketNetworkTransport$supervise$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebSocketNetworkTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketNetworkTransport$supervise$1(WebSocketNetworkTransport webSocketNetworkTransport, Continuation<? super WebSocketNetworkTransport$supervise$1> continuation) {
        super(continuation);
        this.this$0 = webSocketNetworkTransport;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.supervise(null, this);
    }
}
