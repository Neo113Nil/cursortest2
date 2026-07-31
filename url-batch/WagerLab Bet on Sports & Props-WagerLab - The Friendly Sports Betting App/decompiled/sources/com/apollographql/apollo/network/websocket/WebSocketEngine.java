package com.apollographql.apollo.network.websocket;

import com.apollographql.apollo.api.http.HttpHeader;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: WebSocketEngine.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00060\u0001j\u0002`\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/websocket/WebSocketEngine;", "Ljava/io/Closeable;", "Lokio/Closeable;", "newWebSocket", "Lcom/apollographql/apollo/network/websocket/WebSocket;", "url", "", "headers", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/apollographql/apollo/network/websocket/WebSocketListener;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface WebSocketEngine extends Closeable {
    WebSocket newWebSocket(String url, List<HttpHeader> headers, WebSocketListener listener);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ WebSocket newWebSocket$default(WebSocketEngine webSocketEngine, String str, List list, WebSocketListener webSocketListener, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newWebSocket");
        }
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        return webSocketEngine.newWebSocket(str, list, webSocketListener);
    }
}
