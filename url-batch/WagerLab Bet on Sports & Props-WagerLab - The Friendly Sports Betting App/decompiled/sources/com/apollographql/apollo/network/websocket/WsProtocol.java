package com.apollographql.apollo.network.websocket;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.Operation;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: WsProtocol.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ&\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH¦@¢\u0006\u0002\u0010\u000eJ \u0010\u000f\u001a\u00020\u0007\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH&J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0007H&J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/websocket/WsProtocol;", "", "name", "", "getName", "()Ljava/lang/String;", "connectionInit", "Lcom/apollographql/apollo/network/websocket/ClientMessage;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "operationStart", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "request", "Lcom/apollographql/apollo/api/ApolloRequest;", "(Lcom/apollographql/apollo/api/ApolloRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "operationStop", "ping", "pong", "parseServerMessage", "Lcom/apollographql/apollo/network/websocket/ServerMessage;", "text", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface WsProtocol {
    Object connectionInit(Continuation<? super ClientMessage> continuation);

    String getName();

    <D extends Operation.Data> Object operationStart(ApolloRequest<D> apolloRequest, Continuation<? super ClientMessage> continuation);

    <D extends Operation.Data> ClientMessage operationStop(ApolloRequest<D> request);

    ServerMessage parseServerMessage(String text);

    ClientMessage ping();

    ClientMessage pong();
}
