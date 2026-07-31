package com.apollographql.apollo.network.websocket;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket;
import com.apollographql.apollo.network.websocket.internal.WebSocketPool;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: Add missing generic type declarations: [D] */
/* compiled from: WebSocketNetworkTransport.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.websocket.WebSocketNetworkTransport$execute$flow$1", f = "WebSocketNetworkTransport.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class WebSocketNetworkTransport$execute$flow$1<D> extends SuspendLambda implements Function2<ProducerScope<? super ApolloResponse<D>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.BooleanRef $renewUuid;
    final /* synthetic */ ApolloRequest<D> $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WebSocketNetworkTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketNetworkTransport$execute$flow$1(Ref.BooleanRef booleanRef, ApolloRequest<D> apolloRequest, WebSocketNetworkTransport webSocketNetworkTransport, Continuation<? super WebSocketNetworkTransport$execute$flow$1> continuation) {
        super(2, continuation);
        this.$renewUuid = booleanRef;
        this.$request = apolloRequest;
        this.this$0 = webSocketNetworkTransport;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WebSocketNetworkTransport$execute$flow$1 webSocketNetworkTransport$execute$flow$1 = new WebSocketNetworkTransport$execute$flow$1(this.$renewUuid, this.$request, this.this$0, continuation);
        webSocketNetworkTransport$execute$flow$1.L$0 = obj;
        return webSocketNetworkTransport$execute$flow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super ApolloResponse<D>> producerScope, Continuation<? super Unit> continuation) {
        return ((WebSocketNetworkTransport$execute$flow$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final ApolloRequest<D> apolloRequest;
        SubscriptionParserFactory subscriptionParserFactory;
        WebSocketPool webSocketPool;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            if (this.$renewUuid.element) {
                ApolloRequest.Builder<D> newBuilder = this.$request.newBuilder();
                UUID randomUUID = UUID.randomUUID();
                Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID(...)");
                apolloRequest = newBuilder.requestUuid(randomUUID).build();
            } else {
                apolloRequest = this.$request;
            }
            this.$renewUuid.element = true;
            subscriptionParserFactory = this.this$0.parserFactory;
            DefaultOperationListener defaultOperationListener = new DefaultOperationListener(apolloRequest, producerScope, subscriptionParserFactory.createParser(this.$request));
            webSocketPool = this.this$0.pool;
            List<HttpHeader> httpHeaders = apolloRequest.getHttpHeaders();
            if (httpHeaders == null) {
                httpHeaders = CollectionsKt.emptyList();
            }
            final SubscribableWebSocket acquire = webSocketPool.acquire(httpHeaders);
            acquire.startOperation(apolloRequest, defaultOperationListener);
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, new Function0() { // from class: com.apollographql.apollo.network.websocket.WebSocketNetworkTransport$execute$flow$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = WebSocketNetworkTransport$execute$flow$1.invokeSuspend$lambda$0(SubscribableWebSocket.this, apolloRequest);
                    return invokeSuspend$lambda$0;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(SubscribableWebSocket subscribableWebSocket, ApolloRequest apolloRequest) {
        subscribableWebSocket.stopOperation(apolloRequest);
        return Unit.INSTANCE;
    }
}
