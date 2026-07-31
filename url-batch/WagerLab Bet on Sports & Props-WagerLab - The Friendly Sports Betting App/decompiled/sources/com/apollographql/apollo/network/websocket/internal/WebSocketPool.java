package com.apollographql.apollo.network.websocket.internal;

import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.network.websocket.WebSocketEngine;
import com.apollographql.apollo.network.websocket.WsProtocol;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* compiled from: WebSocketPool.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0018J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0014\u0010\u001f\u001a\u00020\u00162\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0012\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/apollographql/apollo/network/websocket/internal/WebSocketPool;", "", "webSocketEngine", "Lcom/apollographql/apollo/network/websocket/WebSocketEngine;", "serverUrl", "", "wsProtocol", "Lcom/apollographql/apollo/network/websocket/WsProtocol;", "connectionAcknowledgeTimeout", "Lkotlin/time/Duration;", "pingInterval", "idleTimeout", "<init>", "(Lcom/apollographql/apollo/network/websocket/WebSocketEngine;Ljava/lang/String;Lcom/apollographql/apollo/network/websocket/WsProtocol;JLkotlin/time/Duration;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/atomicfu/locks/ReentrantLock;", "subscribableWebSockets", "", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "Lcom/apollographql/apollo/network/websocket/internal/SubscribableWebSocket;", "cleanupLocked", "", "key", "closeAllConnections", "cause", "Lcom/apollographql/apollo/exception/ApolloException;", "close", "closeAllConnectionsLocked", "acquire", "httpHeaders", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WebSocketPool {
    private final long connectionAcknowledgeTimeout;
    private final long idleTimeout;
    private ReentrantLock lock;
    private final Duration pingInterval;
    private final String serverUrl;
    private final Map<List<HttpHeader>, SubscribableWebSocket> subscribableWebSockets;
    private final WebSocketEngine webSocketEngine;
    private final WsProtocol wsProtocol;

    public /* synthetic */ WebSocketPool(WebSocketEngine webSocketEngine, String str, WsProtocol wsProtocol, long j, Duration duration, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(webSocketEngine, str, wsProtocol, j, duration, j2);
    }

    private WebSocketPool(WebSocketEngine webSocketEngine, String serverUrl, WsProtocol wsProtocol, long j, Duration duration, long j2) {
        Intrinsics.checkNotNullParameter(webSocketEngine, "webSocketEngine");
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(wsProtocol, "wsProtocol");
        this.webSocketEngine = webSocketEngine;
        this.serverUrl = serverUrl;
        this.wsProtocol = wsProtocol;
        this.connectionAcknowledgeTimeout = j;
        this.pingInterval = duration;
        this.idleTimeout = j2;
        this.lock = new ReentrantLock();
        this.subscribableWebSockets = new LinkedHashMap();
    }

    private final void cleanupLocked(List<HttpHeader> key) {
        Iterator<Map.Entry<List<HttpHeader>, SubscribableWebSocket>> it = this.subscribableWebSockets.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<List<HttpHeader>, SubscribableWebSocket> next = it.next();
            if (next.getValue().isShutdown(Intrinsics.areEqual(next.getKey(), key))) {
                it.remove();
            }
        }
    }

    public final void closeAllConnections(ApolloException cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            closeAllConnectionsLocked(cause);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void close() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            closeAllConnectionsLocked(new ApolloNetworkException("WebSocketNetworkTransport was closed", null, 2, null));
            this.webSocketEngine.close();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void closeAllConnectionsLocked(ApolloException cause) {
        Iterator<Map.Entry<List<HttpHeader>, SubscribableWebSocket>> it = this.subscribableWebSockets.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().shutdown(cause, 1001, "Client requested closing the connection");
            it.remove();
        }
    }

    public final SubscribableWebSocket acquire(List<HttpHeader> httpHeaders) {
        Intrinsics.checkNotNullParameter(httpHeaders, "httpHeaders");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            cleanupLocked(httpHeaders);
            SubscribableWebSocket subscribableWebSocket = this.subscribableWebSockets.get(httpHeaders);
            if (subscribableWebSocket == null) {
                SubscribableWebSocket subscribableWebSocket2 = new SubscribableWebSocket(this.webSocketEngine, this.serverUrl, httpHeaders, this.wsProtocol, this.pingInterval, this.connectionAcknowledgeTimeout, this.idleTimeout, null);
                this.subscribableWebSockets.put(httpHeaders, subscribableWebSocket2);
                subscribableWebSocket = subscribableWebSocket2;
            }
            return subscribableWebSocket;
        } finally {
            reentrantLock.unlock();
        }
    }
}
