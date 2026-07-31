package com.apollographql.apollo.network.ws;

import com.apollographql.apollo.network.NetworkTransport;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebSocketNetworkTransport.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"closeConnection", "", "Lcom/apollographql/apollo/network/NetworkTransport;", "reason", "", "apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WebSocketNetworkTransportKt {
    public static final void closeConnection(NetworkTransport networkTransport, Throwable reason) {
        Intrinsics.checkNotNullParameter(networkTransport, "<this>");
        Intrinsics.checkNotNullParameter(reason, "reason");
        WebSocketNetworkTransport webSocketNetworkTransport = networkTransport instanceof WebSocketNetworkTransport ? (WebSocketNetworkTransport) networkTransport : null;
        if (webSocketNetworkTransport == null) {
            throw new IllegalArgumentException("'" + networkTransport + "' is not an instance of com.apollographql.apollo.ws.WebSocketNetworkTransport");
        }
        webSocketNetworkTransport.closeConnection(reason);
    }
}
