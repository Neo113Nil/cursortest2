package com.apollographql.apollo.network.ws;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.network.ws.WsProtocol;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SubscriptionWsProtocolAdapter.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\u00020\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000fH\u0016J \u0010\u0012\u001a\u00020\u000b\"\b\b\u0000\u0010\u0013*\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0016H\u0016J \u0010\u0017\u001a\u00020\u000b\"\b\b\u0000\u0010\u0013*\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0016H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/apollographql/apollo/network/ws/SubscriptionWsProtocolAdapter;", "Lcom/apollographql/apollo/network/ws/WsProtocol;", "webSocketConnection", "Lcom/apollographql/apollo/network/ws/WebSocketConnection;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;", "<init>", "(Lcom/apollographql/apollo/network/ws/WebSocketConnection;Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;)V", "delegate", "Lcom/apollographql/apollo/network/ws/SubscriptionWsProtocol;", "connectionInit", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleServerMessage", "messageMap", "", "", "", "startOperation", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "request", "Lcom/apollographql/apollo/api/ApolloRequest;", "stopOperation", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class SubscriptionWsProtocolAdapter extends WsProtocol {
    private final SubscriptionWsProtocol delegate;

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public Object connectionInit(Continuation<? super Unit> continuation) {
        return connectionInit$suspendImpl(this, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionWsProtocolAdapter(WebSocketConnection webSocketConnection, WsProtocol.Listener listener) {
        super(webSocketConnection, listener);
        Intrinsics.checkNotNullParameter(webSocketConnection, "webSocketConnection");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.delegate = new SubscriptionWsProtocol(webSocketConnection, listener, 0L, null, null, 28, null);
    }

    static /* synthetic */ Object connectionInit$suspendImpl(SubscriptionWsProtocolAdapter subscriptionWsProtocolAdapter, Continuation<? super Unit> continuation) {
        Object connectionInit = subscriptionWsProtocolAdapter.delegate.connectionInit(continuation);
        return connectionInit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? connectionInit : Unit.INSTANCE;
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public void handleServerMessage(Map<String, ? extends Object> messageMap) {
        Intrinsics.checkNotNullParameter(messageMap, "messageMap");
        this.delegate.handleServerMessage(messageMap);
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public <D extends Operation.Data> void startOperation(ApolloRequest<D> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.delegate.startOperation(request);
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public <D extends Operation.Data> void stopOperation(ApolloRequest<D> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.delegate.stopOperation(request);
    }
}
