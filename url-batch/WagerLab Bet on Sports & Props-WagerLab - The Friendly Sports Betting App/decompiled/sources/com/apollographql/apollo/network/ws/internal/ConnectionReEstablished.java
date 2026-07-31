package com.apollographql.apollo.network.ws.internal;

import kotlin.Metadata;

/* compiled from: WsMessage.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/apollographql/apollo/network/ws/internal/ConnectionReEstablished;", "Lcom/apollographql/apollo/network/ws/internal/Event;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConnectionReEstablished implements Event {
    private final String id;

    @Override // com.apollographql.apollo.network.ws.internal.Event
    public String getId() {
        return this.id;
    }
}
