package com.apollographql.apollo.network.websocket;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.network.NetworkTransport;
import com.apollographql.apollo.network.websocket.internal.WebSocketPool;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ContextKt;

/* compiled from: WebSocketNetworkTransport.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fBC\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u00150\u0014\"\b\b\u0000\u0010\u0016*\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/apollographql/apollo/network/websocket/WebSocketNetworkTransport;", "Lcom/apollographql/apollo/network/NetworkTransport;", "webSocketEngine", "Lcom/apollographql/apollo/network/websocket/WebSocketEngine;", "serverUrl", "", "wsProtocol", "Lcom/apollographql/apollo/network/websocket/WsProtocol;", "connectionAcknowledgeTimeout", "Lkotlin/time/Duration;", "pingInterval", "idleTimeout", "parserFactory", "Lcom/apollographql/apollo/network/websocket/SubscriptionParserFactory;", "<init>", "(Lcom/apollographql/apollo/network/websocket/WebSocketEngine;Ljava/lang/String;Lcom/apollographql/apollo/network/websocket/WsProtocol;JLkotlin/time/Duration;JLcom/apollographql/apollo/network/websocket/SubscriptionParserFactory;)V", "J", "pool", "Lcom/apollographql/apollo/network/websocket/internal/WebSocketPool;", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "request", "Lcom/apollographql/apollo/api/ApolloRequest;", "dispose", "", "closeConnection", "reason", "Lcom/apollographql/apollo/exception/ApolloException;", "Builder", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WebSocketNetworkTransport implements NetworkTransport {
    private final long connectionAcknowledgeTimeout;
    private final long idleTimeout;
    private final SubscriptionParserFactory parserFactory;
    private final Duration pingInterval;
    private final WebSocketPool pool;
    private final String serverUrl;
    private final WebSocketEngine webSocketEngine;
    private final WsProtocol wsProtocol;

    public /* synthetic */ WebSocketNetworkTransport(WebSocketEngine webSocketEngine, String str, WsProtocol wsProtocol, long j, Duration duration, long j2, SubscriptionParserFactory subscriptionParserFactory, DefaultConstructorMarker defaultConstructorMarker) {
        this(webSocketEngine, str, wsProtocol, j, duration, j2, subscriptionParserFactory);
    }

    private WebSocketNetworkTransport(WebSocketEngine webSocketEngine, String str, WsProtocol wsProtocol, long j, Duration duration, long j2, SubscriptionParserFactory subscriptionParserFactory) {
        this.webSocketEngine = webSocketEngine;
        this.serverUrl = str;
        this.wsProtocol = wsProtocol;
        this.connectionAcknowledgeTimeout = j;
        this.pingInterval = duration;
        this.idleTimeout = j2;
        this.parserFactory = subscriptionParserFactory;
        this.pool = new WebSocketPool(webSocketEngine, str, wsProtocol, j, duration, j2, null);
    }

    @Override // com.apollographql.apollo.network.NetworkTransport
    public <D extends Operation.Data> Flow<ApolloResponse<D>> execute(ApolloRequest<D> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return FlowKt__ContextKt.buffer$default(FlowKt.callbackFlow(new WebSocketNetworkTransport$execute$flow$1(new Ref.BooleanRef(), request, this, null)), Integer.MAX_VALUE, null, 2, null);
    }

    @Override // com.apollographql.apollo.network.NetworkTransport
    public void dispose() {
        this.pool.close();
    }

    public final void closeConnection(ApolloException reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.pool.closeAllConnections(reason);
    }

    /* compiled from: WebSocketNetworkTransport.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0015\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\b\u0010J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\b\u0011J\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\b\u0012J\u0012\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0006\u0010\u0013\u001a\u00020\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/apollographql/apollo/network/websocket/WebSocketNetworkTransport$Builder;", "", "<init>", "()V", "serverUrl", "", "webSocketEngine", "Lcom/apollographql/apollo/network/websocket/WebSocketEngine;", "wsProtocol", "Lcom/apollographql/apollo/network/websocket/WsProtocol;", "connectionAcknowledgeTimeout", "Lkotlin/time/Duration;", "pingInterval", "idleTimeout", "parserFactory", "Lcom/apollographql/apollo/network/websocket/SubscriptionParserFactory;", "idleTimeout-BwNAW2A", "pingInterval-BwNAW2A", "connectionAcknowledgeTimeout-BwNAW2A", InAppPurchaseConstants.METHOD_BUILD, "Lcom/apollographql/apollo/network/websocket/WebSocketNetworkTransport;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private Duration connectionAcknowledgeTimeout;
        private Duration idleTimeout;
        private SubscriptionParserFactory parserFactory;
        private Duration pingInterval;
        private String serverUrl;
        private WebSocketEngine webSocketEngine;
        private WsProtocol wsProtocol;

        public final Builder serverUrl(String serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }

        public final Builder webSocketEngine(WebSocketEngine webSocketEngine) {
            this.webSocketEngine = webSocketEngine;
            return this;
        }

        /* renamed from: idleTimeout-BwNAW2A, reason: not valid java name */
        public final Builder m9341idleTimeoutBwNAW2A(Duration idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }

        public final Builder wsProtocol(WsProtocol wsProtocol) {
            this.wsProtocol = wsProtocol;
            return this;
        }

        /* renamed from: pingInterval-BwNAW2A, reason: not valid java name */
        public final Builder m9342pingIntervalBwNAW2A(Duration pingInterval) {
            this.pingInterval = pingInterval;
            return this;
        }

        /* renamed from: connectionAcknowledgeTimeout-BwNAW2A, reason: not valid java name */
        public final Builder m9340connectionAcknowledgeTimeoutBwNAW2A(Duration connectionAcknowledgeTimeout) {
            this.connectionAcknowledgeTimeout = connectionAcknowledgeTimeout;
            return this;
        }

        public final Builder parserFactory(SubscriptionParserFactory parserFactory) {
            this.parserFactory = parserFactory;
            return this;
        }

        public final WebSocketNetworkTransport build() {
            long duration;
            long duration2;
            WebSocketEngine webSocketEngine = this.webSocketEngine;
            if (webSocketEngine == null) {
                webSocketEngine = WebSocketEngine_jvmKt.WebSocketEngine();
            }
            WebSocketEngine webSocketEngine2 = webSocketEngine;
            String str = this.serverUrl;
            if (str == null) {
                throw new IllegalStateException("Apollo: 'serverUrl' is required".toString());
            }
            Duration duration3 = this.idleTimeout;
            if (duration3 != null) {
                duration = duration3.getRawValue();
            } else {
                Duration.Companion companion = Duration.INSTANCE;
                duration = DurationKt.toDuration(60, DurationUnit.SECONDS);
            }
            long j = duration;
            GraphQLWsProtocol graphQLWsProtocol = this.wsProtocol;
            if (graphQLWsProtocol == null) {
                graphQLWsProtocol = new GraphQLWsProtocol(new WebSocketNetworkTransport$Builder$build$1(null));
            }
            WsProtocol wsProtocol = graphQLWsProtocol;
            Duration duration4 = this.pingInterval;
            Duration duration5 = this.connectionAcknowledgeTimeout;
            if (duration5 != null) {
                duration2 = duration5.getRawValue();
            } else {
                Duration.Companion companion2 = Duration.INSTANCE;
                duration2 = DurationKt.toDuration(10, DurationUnit.SECONDS);
            }
            long j2 = duration2;
            DefaultSubscriptionParserFactory defaultSubscriptionParserFactory = this.parserFactory;
            if (defaultSubscriptionParserFactory == null) {
                defaultSubscriptionParserFactory = DefaultSubscriptionParserFactory.INSTANCE;
            }
            return new WebSocketNetworkTransport(webSocketEngine2, str, wsProtocol, j2, duration4, j, defaultSubscriptionParserFactory, null);
        }
    }
}
