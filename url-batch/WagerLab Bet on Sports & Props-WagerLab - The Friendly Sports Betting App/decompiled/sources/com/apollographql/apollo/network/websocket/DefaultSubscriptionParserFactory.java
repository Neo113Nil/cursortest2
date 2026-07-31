package com.apollographql.apollo.network.websocket;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.Operation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebSocketNetworkTransport.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016¨\u0006\n"}, d2 = {"Lcom/apollographql/apollo/network/websocket/DefaultSubscriptionParserFactory;", "Lcom/apollographql/apollo/network/websocket/SubscriptionParserFactory;", "<init>", "()V", "createParser", "Lcom/apollographql/apollo/network/websocket/SubscriptionParser;", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "request", "Lcom/apollographql/apollo/api/ApolloRequest;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DefaultSubscriptionParserFactory implements SubscriptionParserFactory {
    public static final DefaultSubscriptionParserFactory INSTANCE = new DefaultSubscriptionParserFactory();

    private DefaultSubscriptionParserFactory() {
    }

    @Override // com.apollographql.apollo.network.websocket.SubscriptionParserFactory
    public <D extends Operation.Data> SubscriptionParser<D> createParser(ApolloRequest<D> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new DefaultSubscriptionParser(request);
    }
}
