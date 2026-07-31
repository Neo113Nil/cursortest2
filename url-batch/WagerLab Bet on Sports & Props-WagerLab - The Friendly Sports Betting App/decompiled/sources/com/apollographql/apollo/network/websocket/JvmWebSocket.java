package com.apollographql.apollo.network.websocket;

import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.invertase.firebase.functions.UniversalFirebaseFunctionsModule;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okio.ByteString;

/* compiled from: WebSocketEngine.jvm.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J\"\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J \u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0006H\u0016J \u0010#\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0006H\u0016J\u0012\u0010$\u001a\u00020%*\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J\u0018\u0010)\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0006H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/apollographql/apollo/network/websocket/JvmWebSocket;", "Lcom/apollographql/apollo/network/websocket/WebSocket;", "Lokhttp3/WebSocketListener;", "webSocketFactory", "Lokhttp3/WebSocket$Factory;", "url", "", "headers", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/apollographql/apollo/network/websocket/WebSocketListener;", "<init>", "(Lokhttp3/WebSocket$Factory;Ljava/lang/String;Ljava/util/List;Lcom/apollographql/apollo/network/websocket/WebSocketListener;)V", "platformWebSocket", "Ljava/util/concurrent/atomic/AtomicReference;", "Lokhttp3/WebSocket;", "disposed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "onOpen", "", "webSocket", "response", "Lokhttp3/Response;", "onMessage", "bytes", "Lokio/ByteString;", "text", "onFailure", "t", "", "onClosing", UniversalFirebaseFunctionsModule.CODE_KEY, "", "reason", "onClosed", "toOkHttpHeaders", "Lokhttp3/Headers;", "send", "data", "", "close", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JvmWebSocket extends okhttp3.WebSocketListener implements WebSocket {
    private final AtomicBoolean disposed;
    private final WebSocketListener listener;
    private final AtomicReference<okhttp3.WebSocket> platformWebSocket;

    @Override // okhttp3.WebSocketListener
    public void onClosed(okhttp3.WebSocket webSocket, int code, String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
    }

    public JvmWebSocket(WebSocket.Factory webSocketFactory, String url, List<HttpHeader> headers, WebSocketListener listener) {
        Intrinsics.checkNotNullParameter(webSocketFactory, "webSocketFactory");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        AtomicReference<okhttp3.WebSocket> atomicReference = new AtomicReference<>();
        this.platformWebSocket = atomicReference;
        this.disposed = new AtomicBoolean(false);
        atomicReference.set(webSocketFactory.newWebSocket(new Request.Builder().url(url).headers(toOkHttpHeaders(headers)).build(), this));
    }

    @Override // okhttp3.WebSocketListener
    public void onOpen(okhttp3.WebSocket webSocket, Response response) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(response, "response");
        this.listener.onOpen();
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(okhttp3.WebSocket webSocket, ByteString bytes) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.listener.onMessage(bytes.toByteArray());
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(okhttp3.WebSocket webSocket, String text) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(text, "text");
        this.listener.onMessage(text);
    }

    @Override // okhttp3.WebSocketListener
    public void onFailure(okhttp3.WebSocket webSocket, Throwable t, Response response) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(t, "t");
        if (this.disposed.compareAndSet(false, true)) {
            this.listener.onError(new ApolloNetworkException(t.getMessage(), t));
            okhttp3.WebSocket webSocket2 = this.platformWebSocket.get();
            if (webSocket2 != null) {
                webSocket2.cancel();
            }
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onClosing(okhttp3.WebSocket webSocket, int code, String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (this.disposed.compareAndSet(false, true)) {
            this.listener.onClosed(Integer.valueOf(code), reason);
            okhttp3.WebSocket webSocket2 = this.platformWebSocket.get();
            if (webSocket2 != null) {
                webSocket2.close(code, reason);
            }
        }
    }

    private final Headers toOkHttpHeaders(List<HttpHeader> list) {
        Headers.Builder builder = new Headers.Builder();
        for (HttpHeader httpHeader : list) {
            builder.add(httpHeader.getName(), httpHeader.getValue());
        }
        return builder.build();
    }

    @Override // com.apollographql.apollo.network.websocket.WebSocket
    public void send(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        okhttp3.WebSocket webSocket = this.platformWebSocket.get();
        if (webSocket != null) {
            webSocket.send(ByteString.Companion.of$default(ByteString.INSTANCE, data, 0, 0, 3, null));
        }
    }

    @Override // com.apollographql.apollo.network.websocket.WebSocket
    public void send(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        okhttp3.WebSocket webSocket = this.platformWebSocket.get();
        if (webSocket != null) {
            webSocket.send(text);
        }
    }

    @Override // com.apollographql.apollo.network.websocket.WebSocket
    public void close(int code, String reason) {
        okhttp3.WebSocket webSocket;
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (!this.disposed.compareAndSet(false, true) || (webSocket = this.platformWebSocket.get()) == null) {
            return;
        }
        webSocket.close(code, reason);
    }
}
