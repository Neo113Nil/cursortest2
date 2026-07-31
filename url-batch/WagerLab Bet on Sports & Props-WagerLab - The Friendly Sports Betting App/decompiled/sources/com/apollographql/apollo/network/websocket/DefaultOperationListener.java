package com.apollographql.apollo.network.websocket;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Operation.Data;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.SubscriptionOperationException;
import com.apollographql.apollo.network.websocket.internal.OperationListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;

/* compiled from: WebSocketNetworkTransport.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0018\u00010\u0010j\u0002`\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0016\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0018\u00010\u0010j\u0002`\u0011H\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/apollographql/apollo/network/websocket/DefaultOperationListener;", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lcom/apollographql/apollo/network/websocket/internal/OperationListener;", "request", "Lcom/apollographql/apollo/api/ApolloRequest;", "producerScope", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/apollographql/apollo/api/ApolloResponse;", "parser", "Lcom/apollographql/apollo/network/websocket/SubscriptionParser;", "<init>", "(Lcom/apollographql/apollo/api/ApolloRequest;Lkotlinx/coroutines/channels/ProducerScope;Lcom/apollographql/apollo/network/websocket/SubscriptionParser;)V", "onResponse", "", "response", "", "Lcom/apollographql/apollo/api/json/ApolloJsonElement;", "onComplete", "errorResponse", "cause", "Lcom/apollographql/apollo/exception/ApolloException;", "onError", "payload", "onTransportError", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DefaultOperationListener<D extends Operation.Data> implements OperationListener {
    private final SubscriptionParser<D> parser;
    private final ProducerScope<ApolloResponse<D>> producerScope;
    private final ApolloRequest<D> request;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultOperationListener(ApolloRequest<D> request, ProducerScope<? super ApolloResponse<D>> producerScope, SubscriptionParser<D> parser) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(producerScope, "producerScope");
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.request = request;
        this.producerScope = producerScope;
        this.parser = parser;
    }

    @Override // com.apollographql.apollo.network.websocket.internal.OperationListener
    public void onResponse(Object response) {
        ApolloResponse<D> parse = this.parser.parse(response);
        if (parse != null) {
            ChannelResult.m13901boximpl(this.producerScope.mo8997trySendJP2dKIU(parse));
        }
    }

    @Override // com.apollographql.apollo.network.websocket.internal.OperationListener
    public void onComplete() {
        SendChannel.DefaultImpls.close$default(this.producerScope, null, 1, null);
    }

    private final ApolloResponse<D> errorResponse(ApolloException cause) {
        return new ApolloResponse.Builder(this.request.getOperation(), this.request.getRequestUuid()).exception(cause).build();
    }

    @Override // com.apollographql.apollo.network.websocket.internal.OperationListener
    public void onError(Object payload) {
        this.producerScope.mo8997trySendJP2dKIU(errorResponse(new SubscriptionOperationException(this.request.getOperation().name(), payload)));
        SendChannel.DefaultImpls.close$default(this.producerScope, null, 1, null);
    }

    @Override // com.apollographql.apollo.network.websocket.internal.OperationListener
    public void onTransportError(ApolloException cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.producerScope.mo8997trySendJP2dKIU(errorResponse(cause));
        SendChannel.DefaultImpls.close$default(this.producerScope, null, 1, null);
    }
}
