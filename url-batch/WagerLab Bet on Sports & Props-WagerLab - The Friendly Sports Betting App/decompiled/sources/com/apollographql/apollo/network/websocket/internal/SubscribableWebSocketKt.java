package com.apollographql.apollo.network.websocket.internal;

import com.apollographql.apollo.network.websocket.ClientMessage;
import com.apollographql.apollo.network.websocket.DataClientMessage;
import com.apollographql.apollo.network.websocket.TextClientMessage;
import com.apollographql.apollo.network.websocket.WebSocket;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SubscribableWebSocket.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"send", "", "Lcom/apollographql/apollo/network/websocket/WebSocket;", "clientMessage", "Lcom/apollographql/apollo/network/websocket/ClientMessage;", "apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscribableWebSocketKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void send(WebSocket webSocket, ClientMessage clientMessage) {
        if (clientMessage instanceof TextClientMessage) {
            webSocket.send(((TextClientMessage) clientMessage).getText());
        } else {
            if (!(clientMessage instanceof DataClientMessage)) {
                throw new NoWhenBranchMatchedException();
            }
            webSocket.send(((DataClientMessage) clientMessage).getData());
        }
    }
}
