package com.apollographql.apollo.network.websocket.internal;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloWebSocketClosedException;
import com.apollographql.apollo.exception.DefaultApolloException;
import com.apollographql.apollo.exception.SubscriptionConnectionException;
import com.apollographql.apollo.network.websocket.ClientMessage;
import com.apollographql.apollo.network.websocket.CompleteServerMessage;
import com.apollographql.apollo.network.websocket.ConnectionAckServerMessage;
import com.apollographql.apollo.network.websocket.ConnectionErrorServerMessage;
import com.apollographql.apollo.network.websocket.ConnectionKeepAliveServerMessage;
import com.apollographql.apollo.network.websocket.OperationErrorServerMessage;
import com.apollographql.apollo.network.websocket.ParseErrorServerMessage;
import com.apollographql.apollo.network.websocket.PingServerMessage;
import com.apollographql.apollo.network.websocket.PongServerMessage;
import com.apollographql.apollo.network.websocket.ResponseServerMessage;
import com.apollographql.apollo.network.websocket.ServerMessage;
import com.apollographql.apollo.network.websocket.WebSocket;
import com.apollographql.apollo.network.websocket.WebSocketEngine;
import com.apollographql.apollo.network.websocket.WebSocketListener;
import com.apollographql.apollo.network.websocket.WsProtocol;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.net.HttpHeaders;
import io.invertase.firebase.functions.UniversalFirebaseFunctionsModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* compiled from: SubscribableWebSocket.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'J\b\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u001dH\u0002J\u001e\u0010-\u001a\u00020*2\u0006\u0010,\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0005J\b\u00101\u001a\u00020*H\u0016J\u0010\u00102\u001a\u00020*2\u0006\u00103\u001a\u00020\u0005H\u0016J\u0010\u00102\u001a\u00020*2\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020*2\u0006\u0010,\u001a\u00020\u001dH\u0016J!\u00107\u001a\u00020*2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u00108J&\u00109\u001a\u00020*\"\b\b\u0000\u0010:*\u00020;2\f\u0010<\u001a\b\u0012\u0004\u0012\u0002H:0#2\u0006\u0010=\u001a\u00020 J\u001e\u0010>\u001a\u00020*\"\b\b\u0000\u0010:*\u00020;2\f\u0010<\u001a\b\u0012\u0004\u0012\u0002H:0#R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0010\u0010\u000e\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0012\u0010\u0012\u001a\u00060\u0013j\u0002`\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020 0\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030#0\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/apollographql/apollo/network/websocket/internal/SubscribableWebSocket;", "Lcom/apollographql/apollo/network/websocket/WebSocketListener;", "webSocketEngine", "Lcom/apollographql/apollo/network/websocket/WebSocketEngine;", "serverUrl", "", "httpHeaders", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "wsProtocol", "Lcom/apollographql/apollo/network/websocket/WsProtocol;", "pingInterval", "Lkotlin/time/Duration;", "connectionAcknowledgeTimeout", "idleTimeout", "<init>", "(Lcom/apollographql/apollo/network/websocket/WebSocketEngine;Ljava/lang/String;Ljava/util/List;Lcom/apollographql/apollo/network/websocket/WsProtocol;Lkotlin/time/Duration;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/atomicfu/locks/ReentrantLock;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "idleTimeoutJob", "Lkotlinx/coroutines/Job;", "ackTimeoutJob", "state", "Lcom/apollographql/apollo/network/websocket/internal/SocketState;", "shutdownCause", "Lcom/apollographql/apollo/exception/ApolloException;", "activeListeners", "", "Lcom/apollographql/apollo/network/websocket/internal/OperationListener;", "pending", "", "Lcom/apollographql/apollo/api/ApolloRequest;", "webSocket", "Lcom/apollographql/apollo/network/websocket/WebSocket;", "isShutdown", "", "markActive", "restartIdleTimeout", "", "shutdownInternal", "cause", "shutdown", UniversalFirebaseFunctionsModule.CODE_KEY, "", "reason", "onOpen", "onMessage", "text", "data", "", "onError", "onClosed", "(Ljava/lang/Integer;Ljava/lang/String;)V", "startOperation", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "request", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "stopOperation", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscribableWebSocket implements WebSocketListener {
    private Job ackTimeoutJob;
    private Map<String, OperationListener> activeListeners;
    private final long connectionAcknowledgeTimeout;
    private final long idleTimeout;
    private Job idleTimeoutJob;
    private ReentrantLock lock;
    private List<ApolloRequest<?>> pending;
    private final Duration pingInterval;
    private final CoroutineScope scope;
    private ApolloException shutdownCause;
    private SocketState state;
    private WebSocket webSocket;
    private final WsProtocol wsProtocol;

    /* compiled from: SubscribableWebSocket.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SocketState.values().length];
            try {
                iArr[SocketState.AwaitOpen.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SocketState.AwaitAck.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SocketState.Connected.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SocketState.ShutDown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ SubscribableWebSocket(WebSocketEngine webSocketEngine, String str, List list, WsProtocol wsProtocol, Duration duration, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(webSocketEngine, str, list, wsProtocol, duration, j, j2);
    }

    private SubscribableWebSocket(WebSocketEngine webSocketEngine, String serverUrl, List<HttpHeader> httpHeaders, WsProtocol wsProtocol, Duration duration, long j, long j2) {
        Intrinsics.checkNotNullParameter(webSocketEngine, "webSocketEngine");
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(httpHeaders, "httpHeaders");
        Intrinsics.checkNotNullParameter(wsProtocol, "wsProtocol");
        this.wsProtocol = wsProtocol;
        this.pingInterval = duration;
        this.connectionAcknowledgeTimeout = j;
        this.idleTimeout = j2;
        this.lock = new ReentrantLock();
        this.scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault());
        this.state = SocketState.AwaitOpen;
        this.activeListeners = new LinkedHashMap();
        this.pending = new ArrayList();
        List<HttpHeader> list = httpHeaders;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String lowerCase = ((HttpHeader) it.next()).getName().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (Intrinsics.areEqual(lowerCase, "sec-websocket-protocol")) {
                    break;
                }
            }
        }
        httpHeaders = CollectionsKt.plus((Collection<? extends HttpHeader>) httpHeaders, new HttpHeader(HttpHeaders.SEC_WEBSOCKET_PROTOCOL, this.wsProtocol.getName()));
        this.webSocket = webSocketEngine.newWebSocket(serverUrl, httpHeaders, this);
    }

    public final boolean isShutdown(boolean markActive) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean z = this.state == SocketState.ShutDown;
            if (!z && markActive) {
                Job job = this.idleTimeoutJob;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                this.idleTimeoutJob = null;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void restartIdleTimeout() {
        Job launch$default;
        Job job = this.idleTimeoutJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SubscribableWebSocket$restartIdleTimeout$1(this, null), 3, null);
        this.idleTimeoutJob = launch$default;
    }

    private final void shutdownInternal(ApolloException cause) {
        ArrayList arrayList = new ArrayList();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.state == SocketState.ShutDown) {
                return;
            }
            this.state = SocketState.ShutDown;
            CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
            this.shutdownCause = cause;
            arrayList.addAll(this.activeListeners.values());
            this.activeListeners.clear();
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((OperationListener) it.next()).onTransportError(cause);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void shutdown(ApolloException cause, int code, String reason) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(reason, "reason");
        shutdownInternal(cause);
        this.webSocket.close(code, reason);
    }

    @Override // com.apollographql.apollo.network.websocket.WebSocketListener
    public void onOpen() {
        Job launch$default;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()] == 1) {
                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SubscribableWebSocket$onOpen$1$1(this, null), 3, null);
                launch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SubscribableWebSocket$onOpen$1$2(this, null), 3, null);
                this.ackTimeoutJob = launch$default;
                this.state = SocketState.AwaitAck;
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.apollographql.apollo.network.websocket.WebSocketListener
    public void onMessage(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ServerMessage parseServerMessage = this.wsProtocol.parseServerMessage(text);
        if (Intrinsics.areEqual(parseServerMessage, ConnectionAckServerMessage.INSTANCE)) {
            Job job = this.ackTimeoutJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.ackTimeoutJob = null;
            this.lock.lock();
            try {
                if (this.state != SocketState.AwaitAck) {
                    return;
                }
                this.state = SocketState.Connected;
                if (this.pingInterval != null) {
                    BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SubscribableWebSocket$onMessage$1$1(this, null), 3, null);
                }
                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SubscribableWebSocket$onMessage$1$2(this, null), 3, null);
                return;
            } finally {
            }
        }
        if (parseServerMessage instanceof ConnectionErrorServerMessage) {
            shutdown(new SubscriptionConnectionException(((ConnectionErrorServerMessage) parseServerMessage).getPayload()), 1001, "Connection error");
            return;
        }
        if (parseServerMessage instanceof ResponseServerMessage) {
            this.lock.lock();
            try {
                OperationListener operationListener = this.activeListeners.get(((ResponseServerMessage) parseServerMessage).getId());
                if (operationListener != null) {
                    operationListener.onResponse(((ResponseServerMessage) parseServerMessage).getResponse());
                    return;
                }
                return;
            } finally {
            }
        }
        if (parseServerMessage instanceof CompleteServerMessage) {
            this.lock.lock();
            try {
                OperationListener operationListener2 = this.activeListeners.get(((CompleteServerMessage) parseServerMessage).getId());
                if (operationListener2 != null) {
                    operationListener2.onComplete();
                    return;
                }
                return;
            } finally {
            }
        }
        if (parseServerMessage instanceof OperationErrorServerMessage) {
            this.lock.lock();
            try {
                OperationListener operationListener3 = this.activeListeners.get(((OperationErrorServerMessage) parseServerMessage).getId());
                if (operationListener3 != null) {
                    operationListener3.onError(((OperationErrorServerMessage) parseServerMessage).getPayload());
                    return;
                }
                return;
            } finally {
            }
        }
        if (parseServerMessage instanceof ParseErrorServerMessage) {
            System.out.println((Object) ("Cannot parse message: '" + ((ParseErrorServerMessage) parseServerMessage).getErrorMessage() + "'"));
        } else {
            if (Intrinsics.areEqual(parseServerMessage, PingServerMessage.INSTANCE)) {
                ClientMessage pong = this.wsProtocol.pong();
                if (pong != null) {
                    SubscribableWebSocketKt.send(this.webSocket, pong);
                    return;
                }
                return;
            }
            if (!Intrinsics.areEqual(parseServerMessage, PongServerMessage.INSTANCE) && !Intrinsics.areEqual(parseServerMessage, ConnectionKeepAliveServerMessage.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // com.apollographql.apollo.network.websocket.WebSocketListener
    public void onMessage(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        onMessage(StringsKt.decodeToString(data));
    }

    @Override // com.apollographql.apollo.network.websocket.WebSocketListener
    public void onError(ApolloException cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        shutdownInternal(cause);
    }

    @Override // com.apollographql.apollo.network.websocket.WebSocketListener
    public void onClosed(Integer code, String reason) {
        shutdownInternal(new ApolloWebSocketClosedException(code != null ? code.intValue() : 1001, reason, null, 4, null));
    }

    public final <D extends Operation.Data> void startOperation(ApolloRequest<D> request, OperationListener listener) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(listener, "listener");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Job job = this.idleTimeoutJob;
            DefaultApolloException defaultApolloException = null;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.idleTimeoutJob = null;
            int i = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
            if (i == 1 || i == 2) {
                Map<String, OperationListener> map = this.activeListeners;
                String uuid = request.getRequestUuid().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                map.put(uuid, listener);
                Boolean.valueOf(this.pending.add(request));
            } else if (i == 3) {
                Map<String, OperationListener> map2 = this.activeListeners;
                String uuid2 = request.getRequestUuid().toString();
                Intrinsics.checkNotNullExpressionValue(uuid2, "toString(...)");
                map2.put(uuid2, listener);
                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SubscribableWebSocket$startOperation$1$1(this, request, null), 3, null);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                defaultApolloException = new DefaultApolloException("Apollo: the WebSocket is shut down", this.shutdownCause);
                Unit unit = Unit.INSTANCE;
            }
            if (defaultApolloException != null) {
                listener.onTransportError(defaultApolloException);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final <D extends Operation.Data> void stopOperation(ApolloRequest<D> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        String uuid = request.getRequestUuid().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.activeListeners.containsKey(uuid)) {
                this.activeListeners.remove(uuid);
                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SubscribableWebSocket$stopOperation$1$1(this, request, null), 3, null);
                if (this.activeListeners.isEmpty()) {
                    restartIdleTimeout();
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
