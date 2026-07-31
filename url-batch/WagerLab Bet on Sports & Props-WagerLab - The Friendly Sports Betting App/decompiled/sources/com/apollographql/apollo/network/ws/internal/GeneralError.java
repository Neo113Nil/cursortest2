package com.apollographql.apollo.network.ws.internal;

import java.util.Map;
import kotlin.Metadata;

/* compiled from: WsMessage.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/apollographql/apollo/network/ws/internal/GeneralError;", "Lcom/apollographql/apollo/network/ws/internal/Event;", "payload", "", "", "", "<init>", "(Ljava/util/Map;)V", "getPayload", "()Ljava/util/Map;", "id", "getId", "()Ljava/lang/String;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GeneralError implements Event {
    private final String id;
    private final Map<String, Object> payload;

    public GeneralError(Map<String, ? extends Object> map) {
        this.payload = map;
    }

    public final Map<String, Object> getPayload() {
        return this.payload;
    }

    @Override // com.apollographql.apollo.network.ws.internal.Event
    public String getId() {
        return this.id;
    }
}
