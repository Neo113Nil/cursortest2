package com.apollographql.apollo.network.websocket;

import kotlin.Metadata;

/* compiled from: ServerMessage.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0018\u00010\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0018\u00010\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/apollographql/apollo/network/websocket/ConnectionErrorServerMessage;", "Lcom/apollographql/apollo/network/websocket/ServerMessage;", "payload", "", "Lcom/apollographql/apollo/api/json/ApolloJsonElement;", "<init>", "(Ljava/lang/Object;)V", "getPayload", "()Ljava/lang/Object;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConnectionErrorServerMessage implements ServerMessage {
    private final Object payload;

    public ConnectionErrorServerMessage(Object obj) {
        this.payload = obj;
    }

    public final Object getPayload() {
        return this.payload;
    }
}
