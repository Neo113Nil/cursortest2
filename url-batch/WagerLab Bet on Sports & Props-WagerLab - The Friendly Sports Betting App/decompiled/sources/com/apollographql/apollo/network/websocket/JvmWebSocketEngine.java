package com.apollographql.apollo.network.websocket;

import com.apollographql.apollo.api.http.HttpHeader;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.WebSocket;

/* compiled from: WebSocketEngine.jvm.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0007J&\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u001b\u0010\u0002\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/apollographql/apollo/network/websocket/JvmWebSocketEngine;", "Lcom/apollographql/apollo/network/websocket/WebSocketEngine;", "webSocketFactory", "Lkotlin/Function0;", "Lokhttp3/WebSocket$Factory;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "(Lokhttp3/WebSocket$Factory;)V", "getWebSocketFactory", "()Lokhttp3/WebSocket$Factory;", "webSocketFactory$delegate", "Lkotlin/Lazy;", "closed", "", "getClosed", "()Z", "setClosed", "(Z)V", "newWebSocket", "Lcom/apollographql/apollo/network/websocket/WebSocket;", "url", "", "headers", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/apollographql/apollo/network/websocket/WebSocketListener;", "close", "", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JvmWebSocketEngine implements WebSocketEngine {
    private boolean closed;

    /* renamed from: webSocketFactory$delegate, reason: from kotlin metadata */
    private final Lazy webSocketFactory;

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebSocket.Factory _init_$lambda$1(WebSocket.Factory factory) {
        return factory;
    }

    public JvmWebSocketEngine(final Function0<? extends WebSocket.Factory> webSocketFactory) {
        Intrinsics.checkNotNullParameter(webSocketFactory, "webSocketFactory");
        this.webSocketFactory = LazyKt.lazy(new Function0() { // from class: com.apollographql.apollo.network.websocket.JvmWebSocketEngine$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WebSocket.Factory webSocketFactory_delegate$lambda$0;
                webSocketFactory_delegate$lambda$0 = JvmWebSocketEngine.webSocketFactory_delegate$lambda$0(Function0.this);
                return webSocketFactory_delegate$lambda$0;
            }
        });
    }

    private final WebSocket.Factory getWebSocketFactory() {
        return (WebSocket.Factory) this.webSocketFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebSocket.Factory webSocketFactory_delegate$lambda$0(Function0 function0) {
        return (WebSocket.Factory) function0.invoke();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JvmWebSocketEngine(final WebSocket.Factory webSocketFactory) {
        this((Function0<? extends WebSocket.Factory>) new Function0() { // from class: com.apollographql.apollo.network.websocket.JvmWebSocketEngine$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WebSocket.Factory _init_$lambda$1;
                _init_$lambda$1 = JvmWebSocketEngine._init_$lambda$1(WebSocket.Factory.this);
                return _init_$lambda$1;
            }
        });
        Intrinsics.checkNotNullParameter(webSocketFactory, "webSocketFactory");
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final void setClosed(boolean z) {
        this.closed = z;
    }

    @Override // com.apollographql.apollo.network.websocket.WebSocketEngine
    public WebSocket newWebSocket(String url, List<HttpHeader> headers, WebSocketListener listener) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.closed) {
            throw new IllegalArgumentException("JvmWebSocketEngine is closed".toString());
        }
        return new JvmWebSocket(getWebSocketFactory(), url, headers, listener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }
}
