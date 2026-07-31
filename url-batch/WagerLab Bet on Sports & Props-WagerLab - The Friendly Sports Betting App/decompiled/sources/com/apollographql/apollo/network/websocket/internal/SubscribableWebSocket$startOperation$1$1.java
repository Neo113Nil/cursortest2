package com.apollographql.apollo.network.websocket.internal;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.network.websocket.ClientMessage;
import com.apollographql.apollo.network.websocket.WebSocket;
import com.apollographql.apollo.network.websocket.WsProtocol;
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
@DebugMetadata(c = "com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$startOperation$1$1", f = "SubscribableWebSocket.kt", i = {}, l = {260}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SubscribableWebSocket$startOperation$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ApolloRequest<D> $request;
    Object L$0;
    int label;
    final /* synthetic */ SubscribableWebSocket this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscribableWebSocket$startOperation$1$1(SubscribableWebSocket subscribableWebSocket, ApolloRequest<D> apolloRequest, Continuation<? super SubscribableWebSocket$startOperation$1$1> continuation) {
        super(2, continuation);
        this.this$0 = subscribableWebSocket;
        this.$request = apolloRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubscribableWebSocket$startOperation$1$1(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SubscribableWebSocket$startOperation$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WebSocket webSocket;
        WsProtocol wsProtocol;
        WebSocket webSocket2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            webSocket = this.this$0.webSocket;
            wsProtocol = this.this$0.wsProtocol;
            this.L$0 = webSocket;
            this.label = 1;
            Object operationStart = wsProtocol.operationStart(this.$request, this);
            if (operationStart == coroutine_suspended) {
                return coroutine_suspended;
            }
            webSocket2 = webSocket;
            obj = operationStart;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            webSocket2 = (WebSocket) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        SubscribableWebSocketKt.send(webSocket2, (ClientMessage) obj);
        return Unit.INSTANCE;
    }
}
