package com.apollographql.apollo.network.ws.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WsMessage.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/apollographql/apollo/network/ws/internal/OperationResponse;", "Lcom/apollographql/apollo/network/ws/internal/Event;", "id", "", "payload", "", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getPayload", "()Ljava/util/Map;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OperationResponse implements Event {
    private final String id;
    private final Map<String, Object> payload;

    public OperationResponse(String str, Map<String, ? extends Object> payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.id = str;
        this.payload = payload;
    }

    @Override // com.apollographql.apollo.network.ws.internal.Event
    public String getId() {
        return this.id;
    }

    public final Map<String, Object> getPayload() {
        return this.payload;
    }
}
