package com.apollographql.apollo.network.websocket;

import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloWebSocketForceCloseException;
import com.apollographql.apollo.network.NetworkTransport;
import expo.modules.notifications.service.NotificationsService;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebSocketNetworkTransport.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0002\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0007¨\u0006\n"}, d2 = {"isDeferred", "", "", "", "", "closeConnection", "", "Lcom/apollographql/apollo/network/NetworkTransport;", NotificationsService.EXCEPTION_KEY, "Lcom/apollographql/apollo/exception/ApolloException;", "apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WebSocketNetworkTransportKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isDeferred(Map<String, ? extends Object> map) {
        return map.keySet().contains("hasNext");
    }

    public static final void closeConnection(NetworkTransport networkTransport, ApolloException exception) {
        Intrinsics.checkNotNullParameter(networkTransport, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        WebSocketNetworkTransport webSocketNetworkTransport = networkTransport instanceof WebSocketNetworkTransport ? (WebSocketNetworkTransport) networkTransport : null;
        if (webSocketNetworkTransport == null) {
            throw new IllegalArgumentException("'" + networkTransport + "' is not an instance of com.apollographql.apollo.websocket.WebSocketNetworkTransport");
        }
        webSocketNetworkTransport.closeConnection(exception);
    }

    public static final void closeConnection(NetworkTransport networkTransport) {
        Intrinsics.checkNotNullParameter(networkTransport, "<this>");
        WebSocketNetworkTransport webSocketNetworkTransport = networkTransport instanceof WebSocketNetworkTransport ? (WebSocketNetworkTransport) networkTransport : null;
        if (webSocketNetworkTransport == null) {
            throw new IllegalArgumentException("'" + networkTransport + "' is not an instance of com.apollographql.apollo.websocket.WebSocketNetworkTransport");
        }
        webSocketNetworkTransport.closeConnection(ApolloWebSocketForceCloseException.INSTANCE);
    }
}
