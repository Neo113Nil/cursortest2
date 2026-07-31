package com.apollographql.apollo.network.websocket.internal;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.network.websocket.ClientMessage;
import com.apollographql.apollo.network.websocket.WebSocket;
import com.apollographql.apollo.network.websocket.WsProtocol;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SubscribableWebSocket.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$onMessage$1$2", f = "SubscribableWebSocket.kt", i = {}, l = {FacebookRequestErrorClassification.EC_INVALID_TOKEN}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SubscribableWebSocket$onMessage$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ SubscribableWebSocket this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscribableWebSocket$onMessage$1$2(SubscribableWebSocket subscribableWebSocket, Continuation<? super SubscribableWebSocket$onMessage$1$2> continuation) {
        super(2, continuation);
        this.this$0 = subscribableWebSocket;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubscribableWebSocket$onMessage$1$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SubscribableWebSocket$onMessage$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0056 -> B:5:0x0059). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        Iterator it;
        SubscribableWebSocket subscribableWebSocket;
        WsProtocol wsProtocol;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            list = this.this$0.pending;
            SubscribableWebSocket subscribableWebSocket2 = this.this$0;
            it = list.iterator();
            subscribableWebSocket = subscribableWebSocket2;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            WebSocket webSocket = (WebSocket) this.L$2;
            it = (Iterator) this.L$1;
            subscribableWebSocket = (SubscribableWebSocket) this.L$0;
            ResultKt.throwOnFailure(obj);
            SubscribableWebSocketKt.send(webSocket, (ClientMessage) obj);
            if (it.hasNext()) {
                ApolloRequest apolloRequest = (ApolloRequest) it.next();
                webSocket = subscribableWebSocket.webSocket;
                wsProtocol = subscribableWebSocket.wsProtocol;
                this.L$0 = subscribableWebSocket;
                this.L$1 = it;
                this.L$2 = webSocket;
                this.label = 1;
                obj = wsProtocol.operationStart(apolloRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                SubscribableWebSocketKt.send(webSocket, (ClientMessage) obj);
                if (it.hasNext()) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
