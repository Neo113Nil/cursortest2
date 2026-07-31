package com.apollographql.apollo.network.websocket;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ServerMessage.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0018\u00010\u0005j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0018\u00010\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/apollographql/apollo/network/websocket/OperationErrorServerMessage;", "Lcom/apollographql/apollo/network/websocket/ServerMessage;", "id", "", "payload", "", "Lcom/apollographql/apollo/api/json/ApolloJsonElement;", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "getId", "()Ljava/lang/String;", "getPayload", "()Ljava/lang/Object;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OperationErrorServerMessage implements ServerMessage {
    private final String id;
    private final Object payload;

    public OperationErrorServerMessage(String id, Object obj) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.payload = obj;
    }

    public final String getId() {
        return this.id;
    }

    public final Object getPayload() {
        return this.payload;
    }
}
