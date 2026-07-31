package com.apollographql.apollo;

import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.ExecutionContext;
import com.apollographql.apollo.api.ExecutionOptions;
import com.apollographql.apollo.api.MutableExecutionOptions;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.Subscription;
import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.api.http.HttpMethod;
import com.apollographql.apollo.interceptor.ApolloInterceptor;
import com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor;
import com.apollographql.apollo.interceptor.DefaultInterceptorChain;
import com.apollographql.apollo.interceptor.NetworkInterceptor;
import com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt;
import com.apollographql.apollo.internal.ApolloClientListener;
import com.apollographql.apollo.internal.Dispatchers_concurrentKt;
import com.apollographql.apollo.network.NetworkTransport;
import com.apollographql.apollo.network.http.BatchingHttpInterceptor;
import com.apollographql.apollo.network.http.HttpEngine;
import com.apollographql.apollo.network.http.HttpInterceptor;
import com.apollographql.apollo.network.http.HttpNetworkTransport;
import com.apollographql.apollo.network.ws.WebSocketEngine;
import com.apollographql.apollo.network.ws.WebSocketNetworkTransport;
import com.apollographql.apollo.network.ws.WsProtocol;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ContextKt;

/* compiled from: ApolloClient.kt */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 W2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0002VWB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010;\u001a\b\u0012\u0004\u0012\u0002H=0<\"\b\b\u0000\u0010=*\u00020>2\f\u0010;\u001a\b\u0012\u0004\u0012\u0002H=0?J$\u0010@\u001a\b\u0012\u0004\u0012\u0002H=0<\"\b\b\u0000\u0010=*\u00020A2\f\u0010@\u001a\b\u0012\u0004\u0012\u0002H=0BJ$\u0010C\u001a\b\u0012\u0004\u0012\u0002H=0<\"\b\b\u0000\u0010=*\u00020D2\f\u0010C\u001a\b\u0012\u0004\u0012\u0002H=0EJ\b\u0010F\u001a\u00020GH\u0007J\b\u0010H\u001a\u00020GH\u0016J*\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H=0M0L\"\b\b\u0000\u0010=*\u00020N2\f\u0010O\u001a\b\u0012\u0004\u0012\u0002H=0\u001fJ9\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H=0M0L\"\b\b\u0000\u0010=*\u00020N2\f\u0010O\u001a\b\u0012\u0004\u0012\u0002H=0\u001f2\u0006\u0010Q\u001a\u00020 H\u0000¢\u0006\u0002\bRJ9\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H=0M0L\"\b\b\u0000\u0010=*\u00020N2\f\u0010O\u001a\b\u0012\u0004\u0012\u0002H=0\u001f2\u0006\u0010Q\u001a\u00020 H\u0000¢\u0006\u0002\bTJ\u0006\u0010U\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001d\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\"\u001a\u0004\u0018\u00010 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010#R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020(X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010+\u001a\u0004\u0018\u00010,X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001c\u0010/\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0014R\u0018\u00102\u001a\u0004\u0018\u00010 X\u0096\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010 X\u0096\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b6\u00104R\u0018\u00107\u001a\u0004\u0018\u00010 X\u0096\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b8\u00104R\u0018\u00109\u001a\u0004\u0018\u00010 X\u0096\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b:\u00104R\u000e\u0010I\u001a\u00020JX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"Lcom/apollographql/apollo/ApolloClient;", "Lcom/apollographql/apollo/api/ExecutionOptions;", "Ljava/io/Closeable;", "Lokio/Closeable;", "builder", "Lcom/apollographql/apollo/ApolloClient$Builder;", "<init>", "(Lcom/apollographql/apollo/ApolloClient$Builder;)V", "concurrencyInfo", "Lcom/apollographql/apollo/ConcurrencyInfo;", "networkTransport", "Lcom/apollographql/apollo/network/NetworkTransport;", "getNetworkTransport", "()Lcom/apollographql/apollo/network/NetworkTransport;", "subscriptionNetworkTransport", "getSubscriptionNetworkTransport", "interceptors", "", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "getInterceptors", "()Ljava/util/List;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "getCustomScalarAdapters", "()Lcom/apollographql/apollo/api/CustomScalarAdapters;", "cacheInterceptor", "getCacheInterceptor", "()Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "autoPersistedQueryInterceptor", "retryOnError", "Lkotlin/Function1;", "Lcom/apollographql/apollo/api/ApolloRequest;", "", "retryOnErrorInterceptor", "failFastIfOffline", "Ljava/lang/Boolean;", "listeners", "Lcom/apollographql/apollo/internal/ApolloClientListener;", "sendEnhancedClientAwareness", "executionContext", "Lcom/apollographql/apollo/api/ExecutionContext;", "getExecutionContext", "()Lcom/apollographql/apollo/api/ExecutionContext;", "httpMethod", "Lcom/apollographql/apollo/api/http/HttpMethod;", "getHttpMethod", "()Lcom/apollographql/apollo/api/http/HttpMethod;", "httpHeaders", "Lcom/apollographql/apollo/api/http/HttpHeader;", "getHttpHeaders", "sendApqExtensions", "getSendApqExtensions", "()Ljava/lang/Boolean;", "sendDocument", "getSendDocument", "enableAutoPersistedQueries", "getEnableAutoPersistedQueries", "canBeBatched", "getCanBeBatched", SearchIntents.EXTRA_QUERY, "Lcom/apollographql/apollo/ApolloCall;", "D", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/apollographql/apollo/api/Query;", "mutation", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/apollographql/apollo/api/Mutation;", "subscription", "Lcom/apollographql/apollo/api/Subscription$Data;", "Lcom/apollographql/apollo/api/Subscription;", "dispose", "", "close", "networkInterceptor", "Lcom/apollographql/apollo/interceptor/NetworkInterceptor;", "executeAsFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "Lcom/apollographql/apollo/api/Operation$Data;", "apolloRequest", "executeAsFlowInternal", "throwing", "executeAsFlowInternal$apollo_runtime_release", "apolloResponses", "apolloResponses$apollo_runtime_release", InAppPurchaseConstants.METHOD_NEW_BUILDER, "Builder", "Companion", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApolloClient implements ExecutionOptions, Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ApolloInterceptor autoPersistedQueryInterceptor;
    private final Builder builder;
    private final ApolloInterceptor cacheInterceptor;
    private final Boolean canBeBatched;
    private final ConcurrencyInfo concurrencyInfo;
    private final CustomScalarAdapters customScalarAdapters;
    private final Boolean enableAutoPersistedQueries;
    private final ExecutionContext executionContext;
    private final Boolean failFastIfOffline;
    private final List<HttpHeader> httpHeaders;
    private final HttpMethod httpMethod;
    private final List<ApolloInterceptor> interceptors;
    private final List<ApolloClientListener> listeners;
    private final NetworkInterceptor networkInterceptor;
    private final NetworkTransport networkTransport;
    private final Function1<ApolloRequest<?>, Boolean> retryOnError;
    private final ApolloInterceptor retryOnErrorInterceptor;
    private final Boolean sendApqExtensions;
    private final Boolean sendDocument;
    private final boolean sendEnhancedClientAwareness;
    private final NetworkTransport subscriptionNetworkTransport;

    public /* synthetic */ ApolloClient(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Used for backward compatibility with 2.x", replaceWith = @ReplaceWith(expression = "ApolloClient.Builder()", imports = {}))
    @JvmStatic
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    private ApolloClient(Builder builder) {
        HttpNetworkTransport build;
        WebSocketNetworkTransport build2;
        this.builder = builder;
        this.interceptors = builder.getInterceptors();
        this.customScalarAdapters = builder.getCustomScalarAdapters();
        this.cacheInterceptor = builder.getCacheInterceptor();
        this.autoPersistedQueryInterceptor = builder.getAutoPersistedQueryInterceptor();
        this.retryOnError = builder.getRetryOnError();
        this.retryOnErrorInterceptor = builder.getRetryOnErrorInterceptor();
        this.failFastIfOffline = builder.getFailFastIfOffline();
        this.listeners = builder.getListeners$apollo_runtime_release();
        this.sendEnhancedClientAwareness = builder.getSendEnhancedClientAwareness();
        this.executionContext = builder.getExecutionContext();
        this.httpMethod = builder.getHttpMethod();
        this.httpHeaders = builder.getHttpHeaders();
        this.sendApqExtensions = builder.getSendApqExtensions();
        this.sendDocument = builder.getSendDocument();
        this.enableAutoPersistedQueries = builder.getEnableAutoPersistedQueries();
        this.canBeBatched = builder.getCanBeBatched();
        if (builder.getNetworkTransport() != null) {
            if (builder.getHttpServerUrl() != null) {
                throw new IllegalStateException("Apollo: 'httpServerUrl' has no effect if 'networkTransport' is set. Configure httpServerUrl on the networkTransport directly.".toString());
            }
            if (builder.getHttpEngine() != null) {
                throw new IllegalStateException("Apollo: 'httpEngine' or 'okHttpClient' has no effect if 'networkTransport' is set. Configure httpEngine on the networkTransport directly.".toString());
            }
            if (!builder.getHttpInterceptors().isEmpty()) {
                throw new IllegalStateException("Apollo: 'addHttpInterceptor' has no effect if 'networkTransport' is set. Configure the interceptors on the networkTransport directly.".toString());
            }
            if (builder.getHttpExposeErrorBody() != null) {
                throw new IllegalStateException("Apollo: 'httpExposeErrorBody' has no effect if 'networkTransport' is set. Configure httpExposeErrorBody on the networkTransport directly.".toString());
            }
            build = builder.getNetworkTransport();
            Intrinsics.checkNotNull(build);
        } else {
            if (builder.getHttpServerUrl() == null) {
                throw new IllegalStateException("Apollo: 'serverUrl' is required".toString());
            }
            HttpNetworkTransport.Builder builder2 = new HttpNetworkTransport.Builder();
            String httpServerUrl = builder.getHttpServerUrl();
            Intrinsics.checkNotNull(httpServerUrl);
            HttpNetworkTransport.Builder serverUrl = builder2.serverUrl(httpServerUrl);
            if (builder.getHttpEngine() != null) {
                HttpEngine httpEngine = builder.getHttpEngine();
                Intrinsics.checkNotNull(httpEngine);
                serverUrl.httpEngine(httpEngine);
            }
            if (builder.getHttpExposeErrorBody() != null) {
                Boolean httpExposeErrorBody = builder.getHttpExposeErrorBody();
                Intrinsics.checkNotNull(httpExposeErrorBody);
                serverUrl.exposeErrorBody(httpExposeErrorBody.booleanValue());
            }
            build = serverUrl.interceptors(builder.getHttpInterceptors()).build();
        }
        this.networkTransport = build;
        if (builder.getSubscriptionNetworkTransport() != null) {
            if (builder.getWebSocketServerUrl() != null) {
                throw new IllegalStateException("Apollo: 'webSocketServerUrl' has no effect if 'subscriptionNetworkTransport' is set. Configure webSocketServerUrl on the subscriptionNetworkTransport directly.".toString());
            }
            if (builder.getWebSocketEngine() != null) {
                throw new IllegalStateException("Apollo: 'webSocketEngine' or 'okHttpClient' has no effect if 'subscriptionNetworkTransport' is set. Configure webSocketEngine on the subscriptionNetworkTransport directly.".toString());
            }
            if (builder.getWebSocketIdleTimeoutMillis() != null) {
                throw new IllegalStateException("Apollo: 'webSocketIdleTimeoutMillis' has no effect if 'subscriptionNetworkTransport' is set. Configure webSocketIdleTimeoutMillis on the subscriptionNetworkTransport directly.".toString());
            }
            if (builder.getWsProtocolFactory() != null) {
                throw new IllegalStateException("Apollo: 'wsProtocolFactory' has no effect if 'subscriptionNetworkTransport' is set. Configure wsProtocolFactory on the subscriptionNetworkTransport directly.".toString());
            }
            if (builder.getWebSocketReopenWhen() != null) {
                throw new IllegalStateException("Apollo: 'webSocketReopenWhen' has no effect if 'subscriptionNetworkTransport' is set. Configure webSocketReopenWhen on the subscriptionNetworkTransport directly.".toString());
            }
            if (builder.getWebSocketReopenServerUrl() != null) {
                throw new IllegalStateException("Apollo: 'webSocketReopenServerUrl' has no effect if 'subscriptionNetworkTransport' is set. Configure webSocketReopenServerUrl on the subscriptionNetworkTransport directly.".toString());
            }
            build2 = builder.getSubscriptionNetworkTransport();
            Intrinsics.checkNotNull(build2);
        } else {
            String webSocketServerUrl = builder.getWebSocketServerUrl();
            webSocketServerUrl = webSocketServerUrl == null ? builder.getHttpServerUrl() : webSocketServerUrl;
            if (webSocketServerUrl == null) {
                build2 = build;
            } else {
                WebSocketNetworkTransport.Builder serverUrl2 = new WebSocketNetworkTransport.Builder().serverUrl(webSocketServerUrl);
                if (builder.getWebSocketEngine() != null) {
                    WebSocketEngine webSocketEngine = builder.getWebSocketEngine();
                    Intrinsics.checkNotNull(webSocketEngine);
                    serverUrl2.webSocketEngine(webSocketEngine);
                }
                if (builder.getWebSocketIdleTimeoutMillis() != null) {
                    Long webSocketIdleTimeoutMillis = builder.getWebSocketIdleTimeoutMillis();
                    Intrinsics.checkNotNull(webSocketIdleTimeoutMillis);
                    serverUrl2.idleTimeoutMillis(webSocketIdleTimeoutMillis.longValue());
                }
                if (builder.getWsProtocolFactory() != null) {
                    WsProtocol.Factory wsProtocolFactory = builder.getWsProtocolFactory();
                    Intrinsics.checkNotNull(wsProtocolFactory);
                    serverUrl2.protocol(wsProtocolFactory);
                }
                if (builder.getWebSocketReopenWhen() != null) {
                    serverUrl2.reopenWhen(builder.getWebSocketReopenWhen());
                }
                if (builder.getWebSocketReopenServerUrl() != null) {
                    serverUrl2.serverUrl(builder.getWebSocketReopenServerUrl());
                }
                build2 = serverUrl2.build();
            }
        }
        this.subscriptionNetworkTransport = build2;
        CoroutineDispatcher dispatcher = builder.getDispatcher();
        dispatcher = dispatcher == null ? Dispatchers_concurrentKt.getDefaultDispatcher() : dispatcher;
        this.concurrencyInfo = new ConcurrencyInfo(dispatcher, CoroutineScopeKt.CoroutineScope(dispatcher));
        this.networkInterceptor = new NetworkInterceptor(build, build2);
    }

    public final NetworkTransport getNetworkTransport() {
        return this.networkTransport;
    }

    public final NetworkTransport getSubscriptionNetworkTransport() {
        return this.subscriptionNetworkTransport;
    }

    public final List<ApolloInterceptor> getInterceptors() {
        return this.interceptors;
    }

    public final CustomScalarAdapters getCustomScalarAdapters() {
        return this.customScalarAdapters;
    }

    public final ApolloInterceptor getCacheInterceptor() {
        return this.cacheInterceptor;
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public ExecutionContext getExecutionContext() {
        return this.executionContext;
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public List<HttpHeader> getHttpHeaders() {
        return this.httpHeaders;
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public Boolean getSendApqExtensions() {
        return this.sendApqExtensions;
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public Boolean getSendDocument() {
        return this.sendDocument;
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public Boolean getEnableAutoPersistedQueries() {
        return this.enableAutoPersistedQueries;
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public Boolean getCanBeBatched() {
        return this.canBeBatched;
    }

    public final <D extends Query.Data> ApolloCall<D> query(Query<D> query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return new ApolloCall<>(this, query);
    }

    public final <D extends Mutation.Data> ApolloCall<D> mutation(Mutation<D> mutation) {
        Intrinsics.checkNotNullParameter(mutation, "mutation");
        return new ApolloCall<>(this, mutation);
    }

    public final <D extends Subscription.Data> ApolloCall<D> subscription(Subscription<D> subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        return new ApolloCall<>(this, subscription);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use close() instead", replaceWith = @ReplaceWith(expression = "close()", imports = {}))
    public final void dispose() {
        close();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        CoroutineScopeKt.cancel$default(this.concurrencyInfo.getCoroutineScope(), null, 1, null);
        this.networkTransport.dispose();
        this.subscriptionNetworkTransport.dispose();
    }

    public final <D extends Operation.Data> Flow<ApolloResponse<D>> executeAsFlow(ApolloRequest<D> apolloRequest) {
        Intrinsics.checkNotNullParameter(apolloRequest, "apolloRequest");
        return executeAsFlowInternal$apollo_runtime_release(apolloRequest, false);
    }

    public final <D extends Operation.Data> Flow<ApolloResponse<D>> executeAsFlowInternal$apollo_runtime_release(ApolloRequest<D> apolloRequest, boolean throwing) {
        Intrinsics.checkNotNullParameter(apolloRequest, "apolloRequest");
        return FlowKt__ContextKt.buffer$default(FlowKt.flowOn(FlowKt.channelFlow(new ApolloClient$executeAsFlowInternal$flow$1(this, apolloRequest, throwing, null)), Dispatchers.getUnconfined()), Integer.MAX_VALUE, null, 2, null);
    }

    public final <D extends Operation.Data> Flow<ApolloResponse<D>> apolloResponses$apollo_runtime_release(ApolloRequest<D> apolloRequest, boolean throwing) {
        Intrinsics.checkNotNullParameter(apolloRequest, "apolloRequest");
        ApolloRequest.Builder<D> newBuilder = apolloRequest.newBuilder();
        newBuilder.executionContext(this.concurrencyInfo.plus(this.customScalarAdapters).plus(getExecutionContext()).plus(newBuilder.getExecutionContext()));
        HttpMethod httpMethod = newBuilder.getHttpMethod();
        if (httpMethod == null) {
            httpMethod = getHttpMethod();
        }
        newBuilder.httpMethod(httpMethod);
        Boolean sendApqExtensions = newBuilder.getSendApqExtensions();
        if (sendApqExtensions == null) {
            sendApqExtensions = getSendApqExtensions();
        }
        newBuilder.sendApqExtensions(sendApqExtensions);
        Boolean sendDocument = newBuilder.getSendDocument();
        if (sendDocument == null) {
            sendDocument = getSendDocument();
        }
        newBuilder.sendDocument(sendDocument);
        Boolean enableAutoPersistedQueries = newBuilder.getEnableAutoPersistedQueries();
        if (enableAutoPersistedQueries == null) {
            enableAutoPersistedQueries = getEnableAutoPersistedQueries();
        }
        newBuilder.enableAutoPersistedQueries(enableAutoPersistedQueries);
        List createListBuilder = CollectionsKt.createListBuilder();
        if (!Intrinsics.areEqual((Object) newBuilder.getIgnoreApolloClientHttpHeaders(), (Object) true)) {
            List<HttpHeader> httpHeaders = getHttpHeaders();
            if (httpHeaders == null) {
                httpHeaders = CollectionsKt.emptyList();
            }
            createListBuilder.addAll(httpHeaders);
        }
        List<HttpHeader> httpHeaders2 = newBuilder.getHttpHeaders();
        if (httpHeaders2 == null) {
            httpHeaders2 = CollectionsKt.emptyList();
        }
        createListBuilder.addAll(httpHeaders2);
        newBuilder.httpHeaders(CollectionsKt.build(createListBuilder));
        Boolean canBeBatched = newBuilder.getCanBeBatched();
        if (canBeBatched == null) {
            canBeBatched = getCanBeBatched();
        }
        if (canBeBatched != null) {
            newBuilder.addHttpHeader("X-APOLLO-CAN-BE-BATCHED", canBeBatched.toString());
        }
        Boolean retryOnError = newBuilder.getRetryOnError();
        if (retryOnError == null) {
            Function1<ApolloRequest<?>, Boolean> function1 = this.retryOnError;
            retryOnError = function1 != null ? function1.invoke(apolloRequest) : null;
        }
        newBuilder.retryOnError(retryOnError);
        Boolean failFastIfOffline = newBuilder.getFailFastIfOffline();
        if (failFastIfOffline == null) {
            failFastIfOffline = this.failFastIfOffline;
        }
        newBuilder.failFastIfOffline(failFastIfOffline);
        newBuilder.sendEnhancedClientAwareness(this.sendEnhancedClientAwareness);
        ApolloRequest<D> build = newBuilder.build();
        List createListBuilder2 = CollectionsKt.createListBuilder();
        createListBuilder2.addAll(this.interceptors);
        ApolloInterceptor apolloInterceptor = this.cacheInterceptor;
        if (apolloInterceptor != null) {
            createListBuilder2.add(apolloInterceptor);
        }
        ApolloInterceptor apolloInterceptor2 = this.autoPersistedQueryInterceptor;
        if (apolloInterceptor2 != null) {
            createListBuilder2.add(apolloInterceptor2);
        }
        ApolloInterceptor apolloInterceptor3 = this.retryOnErrorInterceptor;
        if (apolloInterceptor3 == null) {
            apolloInterceptor3 = RetryOnErrorInterceptorKt.RetryOnErrorInterceptor();
        }
        createListBuilder2.add(apolloInterceptor3);
        createListBuilder2.add(this.networkInterceptor);
        Flow<ApolloResponse<D>> proceed = new DefaultInterceptorChain(CollectionsKt.build(createListBuilder2), 0).proceed(build);
        return throwing ? FlowKt.onEach(proceed, new ApolloClient$apolloResponses$1$1(null)) : proceed;
    }

    public final Builder newBuilder() {
        return this.builder.copy();
    }

    /* compiled from: ApolloClient.kt */
    @Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010r\u001a\u00020\u00002\u0006\u0010r\u001a\u00020%J\u0017\u0010k\u001a\u00020\u00002\b\u0010k\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0002\u0010uJ\"\u0010d\u001a\u00020\u00002\u0018\u0010d\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030c\u0012\u0004\u0012\u00020%\u0018\u00010^H\u0007J\u0012\u0010g\u001a\u00020\u00002\b\u0010g\u001a\u0004\u0018\u00010\fH\u0007J\u0010\u0010n\u001a\u00020\u00002\b\u0010n\u001a\u0004\u0018\u00010\fJ\u0010\u0010v\u001a\u00020\u00002\b\u0010p\u001a\u0004\u0018\u00010\fJ\u0012\u0010\u001f\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J\u0018\u0010#\u001a\u00020\u00002\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000eH\u0016J\u0018\u0010w\u001a\u00020\u00002\u0006\u0010V\u001a\u00020:2\u0006\u0010\u0019\u001a\u00020:H\u0016J\u0017\u0010&\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0002\u0010uJ\u0017\u0010*\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0002\u0010uJ\u0017\u0010,\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0002\u0010uJ\u0017\u0010.\u001a\u00020\u00002\b\u0010.\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0002\u0010uJ\u000e\u0010x\u001a\u00020\u00002\u0006\u0010x\u001a\u00020:J\u0010\u0010;\u001a\u00020\u00002\b\u0010;\u001a\u0004\u0018\u00010:J\u0010\u0010?\u001a\u00020\u00002\b\u0010?\u001a\u0004\u0018\u00010>J\u0015\u0010M\u001a\u00020\u00002\b\u0010M\u001a\u0004\u0018\u00010%¢\u0006\u0002\u0010uJ\u0014\u0010\u0013\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eJ\u000e\u0010y\u001a\u00020\u00002\u0006\u0010z\u001a\u00020\u0012J\u000e\u0010{\u001a\u00020\u00002\u0006\u0010z\u001a\u00020\u0012J\u0010\u0010B\u001a\u00020\u00002\b\u0010B\u001a\u0004\u0018\u00010:J+\u0010B\u001a\u00020\u00002\u001e\u0010B\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0X\u0012\u0006\u0012\u0004\u0018\u00010Y\u0018\u00010^¢\u0006\u0002\u0010|J\u0015\u0010E\u001a\u00020\u00002\b\u0010E\u001a\u0004\u0018\u00010D¢\u0006\u0002\u0010}J\u0010\u0010~\u001a\u00020\u00002\b\u0010J\u001a\u0004\u0018\u00010IJ\u0010\u0010P\u001a\u00020\u00002\b\u0010P\u001a\u0004\u0018\u00010OJF\u0010Z\u001a\u00020\u000029\u0010Z\u001a5\b\u0001\u0012\u0004\u0012\u00020T\u0012\u0013\u0012\u00110D¢\u0006\f\bU\u0012\b\bV\u0012\u0004\b\b(W\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0X\u0012\u0006\u0012\u0004\u0018\u00010Y\u0018\u00010S¢\u0006\u0002\u0010\u007fJ\u0010\u00101\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u000100J\u0010\u00104\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u000100J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J)\u0010\u0080\u0001\u001a\u00020\u0000\"\u0005\b\u0000\u0010\u0081\u00012\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u000f\u0010\u0084\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0081\u00010\u0085\u0001J\u0012\u0010\u0086\u0001\u001a\u00020\u00002\u0007\u0010\u0087\u0001\u001a\u00020\u0016H\u0007J\u0016\u0010\u0017\u001a\u00020\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000eH\u0007J\u0010\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\fJ\u0010\u0010\u008a\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\fJ\u0017\u0010\u008b\u0001\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0007J\u0014\u0010\r\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eJ\u0010\u00107\u001a\u00020\u00002\b\u00107\u001a\u0004\u0018\u000106J\u0011\u0010\u008c\u0001\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aJ*\u0010\u008d\u0001\u001a\u00020\u00002\t\b\u0002\u0010\u008e\u0001\u001a\u00020\u001e2\t\b\u0002\u0010\u008f\u0001\u001a\u00020\u001e2\t\b\u0002\u0010\u0090\u0001\u001a\u00020%H\u0007J+\u0010\u0091\u0001\u001a\u00020\u00002\t\b\u0002\u0010\u0092\u0001\u001a\u00020D2\n\b\u0002\u0010\u0093\u0001\u001a\u00030\u0094\u00012\t\b\u0002\u0010\u0090\u0001\u001a\u00020%H\u0007J\b\u0010\u0095\u0001\u001a\u00030\u0096\u0001J\u0007\u0010\u0097\u0001\u001a\u00020\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u001e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001e@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R.\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000e2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000e@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0010R$\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u0019\u001a\u0004\u0018\u00010%@RX\u0096\u000e¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R$\u0010*\u001a\u0004\u0018\u00010%2\b\u0010\u0019\u001a\u0004\u0018\u00010%@RX\u0096\u000e¢\u0006\n\n\u0002\u0010)\u001a\u0004\b+\u0010(R$\u0010,\u001a\u0004\u0018\u00010%2\b\u0010\u0019\u001a\u0004\u0018\u00010%@RX\u0096\u000e¢\u0006\n\n\u0002\u0010)\u001a\u0004\b-\u0010(R$\u0010.\u001a\u0004\u0018\u00010%2\b\u0010\u0019\u001a\u0004\u0018\u00010%@RX\u0096\u000e¢\u0006\n\n\u0002\u0010)\u001a\u0004\b/\u0010(R\"\u00101\u001a\u0004\u0018\u0001002\b\u0010\u0019\u001a\u0004\u0018\u000100@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\"\u00104\u001a\u0004\u0018\u0001002\b\u0010\u0019\u001a\u0004\u0018\u000100@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u00103R\"\u00107\u001a\u0004\u0018\u0001062\b\u0010\u0019\u001a\u0004\u0018\u000106@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\"\u0010;\u001a\u0004\u0018\u00010:2\b\u0010\u0019\u001a\u0004\u0018\u00010:@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\"\u0010?\u001a\u0004\u0018\u00010>2\b\u0010\u0019\u001a\u0004\u0018\u00010>@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\"\u0010B\u001a\u0004\u0018\u00010:2\b\u0010\u0019\u001a\u0004\u0018\u00010:@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bC\u0010=R$\u0010E\u001a\u0004\u0018\u00010D2\b\u0010\u0019\u001a\u0004\u0018\u00010D@BX\u0086\u000e¢\u0006\n\n\u0002\u0010H\u001a\u0004\bF\u0010GR\"\u0010J\u001a\u0004\u0018\u00010I2\b\u0010\u0019\u001a\u0004\u0018\u00010I@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR$\u0010M\u001a\u0004\u0018\u00010%2\b\u0010\u0019\u001a\u0004\u0018\u00010%@BX\u0086\u000e¢\u0006\n\n\u0002\u0010)\u001a\u0004\bN\u0010(R\"\u0010P\u001a\u0004\u0018\u00010O2\b\u0010\u0019\u001a\u0004\u0018\u00010O@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0086\u0001\u0010Z\u001a5\b\u0001\u0012\u0004\u0012\u00020T\u0012\u0013\u0012\u00110D¢\u0006\f\bU\u0012\b\bV\u0012\u0004\b\b(W\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0X\u0012\u0006\u0012\u0004\u0018\u00010Y\u0018\u00010S29\u0010\u0019\u001a5\b\u0001\u0012\u0004\u0012\u00020T\u0012\u0013\u0012\u00110D¢\u0006\f\bU\u0012\b\bV\u0012\u0004\b\b(W\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0X\u0012\u0006\u0012\u0004\u0018\u00010Y\u0018\u00010S@BX\u0086\u000e¢\u0006\n\n\u0002\u0010]\u001a\u0004\b[\u0010\\RP\u0010_\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0X\u0012\u0006\u0012\u0004\u0018\u00010Y\u0018\u00010^2\u001e\u0010\u0019\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0X\u0012\u0006\u0012\u0004\u0018\u00010Y\u0018\u00010^@BX\u0086\u000e¢\u0006\n\n\u0002\u0010b\u001a\u0004\b`\u0010aRJ\u0010d\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030c\u0012\u0004\u0012\u00020%\u0018\u00010^2\u0018\u0010\u0019\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030c\u0012\u0004\u0012\u00020%\u0018\u00010^8\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0000\u0012\u0004\be\u0010\u0003\u001a\u0004\bf\u0010aR*\u0010g\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0000\u0012\u0004\bh\u0010\u0003\u001a\u0004\bi\u0010jR,\u0010k\u001a\u0004\u0018\u00010%2\b\u0010\u0019\u001a\u0004\u0018\u00010%8\u0006@BX\u0087\u000e¢\u0006\u0010\n\u0002\u0010)\u0012\u0004\bl\u0010\u0003\u001a\u0004\bm\u0010(R\"\u0010n\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bo\u0010jR\"\u0010p\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bq\u0010jR\u001e\u0010r\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020%@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bs\u0010t¨\u0006\u0098\u0001"}, d2 = {"Lcom/apollographql/apollo/ApolloClient$Builder;", "Lcom/apollographql/apollo/api/MutableExecutionOptions;", "<init>", "()V", "_customScalarAdaptersBuilder", "Lcom/apollographql/apollo/api/CustomScalarAdapters$Builder;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "getCustomScalarAdapters", "()Lcom/apollographql/apollo/api/CustomScalarAdapters;", "_interceptors", "", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "interceptors", "", "getInterceptors", "()Ljava/util/List;", "_httpInterceptors", "Lcom/apollographql/apollo/network/http/HttpInterceptor;", "httpInterceptors", "getHttpInterceptors", "_listeners", "Lcom/apollographql/apollo/internal/ApolloClientListener;", "listeners", "getListeners$apollo_runtime_release", "value", "Lcom/apollographql/apollo/api/ExecutionContext;", "executionContext", "getExecutionContext", "()Lcom/apollographql/apollo/api/ExecutionContext;", "Lcom/apollographql/apollo/api/http/HttpMethod;", "httpMethod", "getHttpMethod", "()Lcom/apollographql/apollo/api/http/HttpMethod;", "Lcom/apollographql/apollo/api/http/HttpHeader;", "httpHeaders", "getHttpHeaders", "", "sendApqExtensions", "getSendApqExtensions", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "sendDocument", "getSendDocument", "enableAutoPersistedQueries", "getEnableAutoPersistedQueries", "canBeBatched", "getCanBeBatched", "Lcom/apollographql/apollo/network/NetworkTransport;", "networkTransport", "getNetworkTransport", "()Lcom/apollographql/apollo/network/NetworkTransport;", "subscriptionNetworkTransport", "getSubscriptionNetworkTransport", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "", "httpServerUrl", "getHttpServerUrl", "()Ljava/lang/String;", "Lcom/apollographql/apollo/network/http/HttpEngine;", "httpEngine", "getHttpEngine", "()Lcom/apollographql/apollo/network/http/HttpEngine;", "webSocketServerUrl", "getWebSocketServerUrl", "", "webSocketIdleTimeoutMillis", "getWebSocketIdleTimeoutMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "Lcom/apollographql/apollo/network/ws/WsProtocol$Factory;", "wsProtocolFactory", "getWsProtocolFactory", "()Lcom/apollographql/apollo/network/ws/WsProtocol$Factory;", "httpExposeErrorBody", "getHttpExposeErrorBody", "Lcom/apollographql/apollo/network/ws/WebSocketEngine;", "webSocketEngine", "getWebSocketEngine", "()Lcom/apollographql/apollo/network/ws/WebSocketEngine;", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "attempt", "Lkotlin/coroutines/Continuation;", "", "webSocketReopenWhen", "getWebSocketReopenWhen", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function3;", "Lkotlin/Function1;", "webSocketReopenServerUrl", "getWebSocketReopenServerUrl", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function1;", "Lcom/apollographql/apollo/api/ApolloRequest;", "retryOnError", "getRetryOnError$annotations", "getRetryOnError", "retryOnErrorInterceptor", "getRetryOnErrorInterceptor$annotations", "getRetryOnErrorInterceptor", "()Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "failFastIfOffline", "getFailFastIfOffline$annotations", "getFailFastIfOffline", "cacheInterceptor", "getCacheInterceptor", "autoPersistedQueryInterceptor", "getAutoPersistedQueryInterceptor", "sendEnhancedClientAwareness", "getSendEnhancedClientAwareness", "()Z", "(Ljava/lang/Boolean;)Lcom/apollographql/apollo/ApolloClient$Builder;", "autoPersistedQueriesInterceptor", "addHttpHeader", "serverUrl", "addHttpInterceptor", "httpInterceptor", "removeHttpInterceptor", "(Lkotlin/jvm/functions/Function1;)Lcom/apollographql/apollo/ApolloClient$Builder;", "(Ljava/lang/Long;)Lcom/apollographql/apollo/ApolloClient$Builder;", "wsProtocol", "(Lkotlin/jvm/functions/Function3;)Lcom/apollographql/apollo/ApolloClient$Builder;", "addCustomScalarAdapter", "T", "customScalarType", "Lcom/apollographql/apollo/api/CustomScalarType;", "customScalarAdapter", "Lcom/apollographql/apollo/api/Adapter;", "addListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addInterceptor", "interceptor", "removeInterceptor", "addInterceptors", "addExecutionContext", "autoPersistedQueries", "httpMethodForHashedQueries", "httpMethodForDocumentQueries", "enableByDefault", "httpBatching", "batchIntervalMillis", "maxBatchSize", "", InAppPurchaseConstants.METHOD_BUILD, "Lcom/apollographql/apollo/ApolloClient;", "copy", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder implements MutableExecutionOptions<Builder> {
        private final CustomScalarAdapters.Builder _customScalarAdaptersBuilder = new CustomScalarAdapters.Builder();
        private final List<HttpInterceptor> _httpInterceptors;
        private final List<ApolloInterceptor> _interceptors;
        private final List<ApolloClientListener> _listeners;
        private ApolloInterceptor autoPersistedQueryInterceptor;
        private ApolloInterceptor cacheInterceptor;
        private Boolean canBeBatched;
        private CoroutineDispatcher dispatcher;
        private Boolean enableAutoPersistedQueries;
        private ExecutionContext executionContext;
        private Boolean failFastIfOffline;
        private HttpEngine httpEngine;
        private Boolean httpExposeErrorBody;
        private List<HttpHeader> httpHeaders;
        private final List<HttpInterceptor> httpInterceptors;
        private HttpMethod httpMethod;
        private String httpServerUrl;
        private final List<ApolloInterceptor> interceptors;
        private final List<ApolloClientListener> listeners;
        private NetworkTransport networkTransport;
        private Function1<? super ApolloRequest<?>, Boolean> retryOnError;
        private ApolloInterceptor retryOnErrorInterceptor;
        private Boolean sendApqExtensions;
        private Boolean sendDocument;
        private boolean sendEnhancedClientAwareness;
        private NetworkTransport subscriptionNetworkTransport;
        private WebSocketEngine webSocketEngine;
        private Long webSocketIdleTimeoutMillis;
        private Function1<? super Continuation<? super String>, ? extends Object> webSocketReopenServerUrl;
        private Function3<? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> webSocketReopenWhen;
        private String webSocketServerUrl;
        private WsProtocol.Factory wsProtocolFactory;

        public static /* synthetic */ void getFailFastIfOffline$annotations() {
        }

        public static /* synthetic */ void getRetryOnError$annotations() {
        }

        public static /* synthetic */ void getRetryOnErrorInterceptor$annotations() {
        }

        public final Builder autoPersistedQueries() {
            return autoPersistedQueries$default(this, null, null, false, 7, null);
        }

        public final Builder autoPersistedQueries(HttpMethod httpMethodForHashedQueries) {
            Intrinsics.checkNotNullParameter(httpMethodForHashedQueries, "httpMethodForHashedQueries");
            return autoPersistedQueries$default(this, httpMethodForHashedQueries, null, false, 6, null);
        }

        public final Builder autoPersistedQueries(HttpMethod httpMethodForHashedQueries, HttpMethod httpMethodForDocumentQueries) {
            Intrinsics.checkNotNullParameter(httpMethodForHashedQueries, "httpMethodForHashedQueries");
            Intrinsics.checkNotNullParameter(httpMethodForDocumentQueries, "httpMethodForDocumentQueries");
            return autoPersistedQueries$default(this, httpMethodForHashedQueries, httpMethodForDocumentQueries, false, 4, null);
        }

        public final Builder httpBatching() {
            return httpBatching$default(this, 0L, 0, false, 7, null);
        }

        public final Builder httpBatching(long j) {
            return httpBatching$default(this, j, 0, false, 6, null);
        }

        public final Builder httpBatching(long j, int i) {
            return httpBatching$default(this, j, i, false, 4, null);
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this._interceptors = arrayList;
            this.interceptors = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this._httpInterceptors = arrayList2;
            this.httpInterceptors = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this._listeners = arrayList3;
            this.listeners = arrayList3;
            this.executionContext = ExecutionContext.Empty;
            this.sendEnhancedClientAwareness = true;
        }

        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public /* bridge */ /* synthetic */ Builder httpHeaders(List list) {
            return httpHeaders((List<HttpHeader>) list);
        }

        public final CustomScalarAdapters getCustomScalarAdapters() {
            return this._customScalarAdaptersBuilder.build();
        }

        public final List<ApolloInterceptor> getInterceptors() {
            return this.interceptors;
        }

        public final List<HttpInterceptor> getHttpInterceptors() {
            return this.httpInterceptors;
        }

        public final List<ApolloClientListener> getListeners$apollo_runtime_release() {
            return this.listeners;
        }

        @Override // com.apollographql.apollo.api.ExecutionOptions
        public ExecutionContext getExecutionContext() {
            return this.executionContext;
        }

        @Override // com.apollographql.apollo.api.ExecutionOptions
        public HttpMethod getHttpMethod() {
            return this.httpMethod;
        }

        @Override // com.apollographql.apollo.api.ExecutionOptions
        public List<HttpHeader> getHttpHeaders() {
            return this.httpHeaders;
        }

        @Override // com.apollographql.apollo.api.ExecutionOptions
        public Boolean getSendApqExtensions() {
            return this.sendApqExtensions;
        }

        @Override // com.apollographql.apollo.api.ExecutionOptions
        public Boolean getSendDocument() {
            return this.sendDocument;
        }

        @Override // com.apollographql.apollo.api.ExecutionOptions
        public Boolean getEnableAutoPersistedQueries() {
            return this.enableAutoPersistedQueries;
        }

        @Override // com.apollographql.apollo.api.ExecutionOptions
        public Boolean getCanBeBatched() {
            return this.canBeBatched;
        }

        public final NetworkTransport getNetworkTransport() {
            return this.networkTransport;
        }

        public final NetworkTransport getSubscriptionNetworkTransport() {
            return this.subscriptionNetworkTransport;
        }

        public final CoroutineDispatcher getDispatcher() {
            return this.dispatcher;
        }

        public final String getHttpServerUrl() {
            return this.httpServerUrl;
        }

        public final HttpEngine getHttpEngine() {
            return this.httpEngine;
        }

        public final String getWebSocketServerUrl() {
            return this.webSocketServerUrl;
        }

        public final Long getWebSocketIdleTimeoutMillis() {
            return this.webSocketIdleTimeoutMillis;
        }

        public final WsProtocol.Factory getWsProtocolFactory() {
            return this.wsProtocolFactory;
        }

        public final Boolean getHttpExposeErrorBody() {
            return this.httpExposeErrorBody;
        }

        public final WebSocketEngine getWebSocketEngine() {
            return this.webSocketEngine;
        }

        public final Function3<Throwable, Long, Continuation<? super Boolean>, Object> getWebSocketReopenWhen() {
            return this.webSocketReopenWhen;
        }

        public final Function1<Continuation<? super String>, Object> getWebSocketReopenServerUrl() {
            return this.webSocketReopenServerUrl;
        }

        public final Function1<ApolloRequest<?>, Boolean> getRetryOnError() {
            return this.retryOnError;
        }

        public final ApolloInterceptor getRetryOnErrorInterceptor() {
            return this.retryOnErrorInterceptor;
        }

        public final Boolean getFailFastIfOffline() {
            return this.failFastIfOffline;
        }

        public final ApolloInterceptor getCacheInterceptor() {
            return this.cacheInterceptor;
        }

        public final ApolloInterceptor getAutoPersistedQueryInterceptor() {
            return this.autoPersistedQueryInterceptor;
        }

        public final boolean getSendEnhancedClientAwareness() {
            return this.sendEnhancedClientAwareness;
        }

        public final Builder sendEnhancedClientAwareness(boolean sendEnhancedClientAwareness) {
            this.sendEnhancedClientAwareness = sendEnhancedClientAwareness;
            return this;
        }

        public final Builder failFastIfOffline(Boolean failFastIfOffline) {
            this.failFastIfOffline = failFastIfOffline;
            return this;
        }

        public final Builder retryOnError(Function1<? super ApolloRequest<?>, Boolean> retryOnError) {
            this.retryOnError = retryOnError;
            return this;
        }

        public final Builder retryOnErrorInterceptor(ApolloInterceptor retryOnErrorInterceptor) {
            this.retryOnErrorInterceptor = retryOnErrorInterceptor;
            return this;
        }

        public final Builder cacheInterceptor(ApolloInterceptor cacheInterceptor) {
            this.cacheInterceptor = cacheInterceptor;
            return this;
        }

        public final Builder autoPersistedQueriesInterceptor(ApolloInterceptor autoPersistedQueryInterceptor) {
            this.autoPersistedQueryInterceptor = autoPersistedQueryInterceptor;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public Builder httpMethod(HttpMethod httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public Builder httpHeaders(List<HttpHeader> httpHeaders) {
            this.httpHeaders = httpHeaders;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public Builder addHttpHeader(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            List<HttpHeader> httpHeaders = getHttpHeaders();
            if (httpHeaders == null) {
                httpHeaders = CollectionsKt.emptyList();
            }
            this.httpHeaders = CollectionsKt.plus((Collection<? extends HttpHeader>) httpHeaders, new HttpHeader(name, value));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public Builder sendApqExtensions(Boolean sendApqExtensions) {
            this.sendApqExtensions = sendApqExtensions;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public Builder sendDocument(Boolean sendDocument) {
            this.sendDocument = sendDocument;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public Builder enableAutoPersistedQueries(Boolean enableAutoPersistedQueries) {
            this.enableAutoPersistedQueries = enableAutoPersistedQueries;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public Builder canBeBatched(Boolean canBeBatched) {
            this.canBeBatched = canBeBatched;
            return this;
        }

        public final Builder serverUrl(String serverUrl) {
            Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
            this.httpServerUrl = serverUrl;
            return this;
        }

        public final Builder httpServerUrl(String httpServerUrl) {
            this.httpServerUrl = httpServerUrl;
            return this;
        }

        public final Builder httpEngine(HttpEngine httpEngine) {
            this.httpEngine = httpEngine;
            return this;
        }

        public final Builder httpExposeErrorBody(Boolean httpExposeErrorBody) {
            this.httpExposeErrorBody = httpExposeErrorBody;
            return this;
        }

        public final Builder httpInterceptors(List<? extends HttpInterceptor> httpInterceptors) {
            Intrinsics.checkNotNullParameter(httpInterceptors, "httpInterceptors");
            this._httpInterceptors.clear();
            this._httpInterceptors.addAll(httpInterceptors);
            return this;
        }

        public final Builder addHttpInterceptor(HttpInterceptor httpInterceptor) {
            Intrinsics.checkNotNullParameter(httpInterceptor, "httpInterceptor");
            this._httpInterceptors.add(httpInterceptor);
            return this;
        }

        public final Builder removeHttpInterceptor(HttpInterceptor httpInterceptor) {
            Intrinsics.checkNotNullParameter(httpInterceptor, "httpInterceptor");
            this._httpInterceptors.remove(httpInterceptor);
            return this;
        }

        public final Builder webSocketServerUrl(String webSocketServerUrl) {
            this.webSocketServerUrl = webSocketServerUrl;
            return this;
        }

        public final Builder webSocketServerUrl(Function1<? super Continuation<? super String>, ? extends Object> webSocketServerUrl) {
            this.webSocketReopenServerUrl = webSocketServerUrl;
            return this;
        }

        public final Builder webSocketIdleTimeoutMillis(Long webSocketIdleTimeoutMillis) {
            this.webSocketIdleTimeoutMillis = webSocketIdleTimeoutMillis;
            return this;
        }

        public final Builder wsProtocol(WsProtocol.Factory wsProtocolFactory) {
            this.wsProtocolFactory = wsProtocolFactory;
            return this;
        }

        public final Builder webSocketEngine(WebSocketEngine webSocketEngine) {
            this.webSocketEngine = webSocketEngine;
            return this;
        }

        public final Builder webSocketReopenWhen(Function3<? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> webSocketReopenWhen) {
            this.webSocketReopenWhen = webSocketReopenWhen;
            return this;
        }

        public final Builder networkTransport(NetworkTransport networkTransport) {
            this.networkTransport = networkTransport;
            return this;
        }

        public final Builder subscriptionNetworkTransport(NetworkTransport subscriptionNetworkTransport) {
            this.subscriptionNetworkTransport = subscriptionNetworkTransport;
            return this;
        }

        public final Builder customScalarAdapters(CustomScalarAdapters customScalarAdapters) {
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            this._customScalarAdaptersBuilder.clear();
            this._customScalarAdaptersBuilder.addAll(customScalarAdapters);
            return this;
        }

        public final <T> Builder addCustomScalarAdapter(CustomScalarType customScalarType, Adapter<T> customScalarAdapter) {
            Intrinsics.checkNotNullParameter(customScalarType, "customScalarType");
            Intrinsics.checkNotNullParameter(customScalarAdapter, "customScalarAdapter");
            this._customScalarAdaptersBuilder.add(customScalarType, customScalarAdapter);
            return this;
        }

        public final Builder addListener(ApolloClientListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this._listeners.add(listener);
            return this;
        }

        public final Builder listeners(List<? extends ApolloClientListener> listeners) {
            Intrinsics.checkNotNullParameter(listeners, "listeners");
            this._listeners.clear();
            this._listeners.addAll(listeners);
            return this;
        }

        public final Builder addInterceptor(ApolloInterceptor interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this._interceptors.add(interceptor);
            return this;
        }

        public final Builder removeInterceptor(ApolloInterceptor interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this._interceptors.remove(interceptor);
            return this;
        }

        @Deprecated(message = "Use addInterceptor() or interceptors()")
        public final Builder addInterceptors(List<? extends ApolloInterceptor> interceptors) {
            Intrinsics.checkNotNullParameter(interceptors, "interceptors");
            CollectionsKt.addAll(this._interceptors, interceptors);
            return this;
        }

        public final Builder interceptors(List<? extends ApolloInterceptor> interceptors) {
            Intrinsics.checkNotNullParameter(interceptors, "interceptors");
            this._interceptors.clear();
            CollectionsKt.addAll(this._interceptors, interceptors);
            return this;
        }

        public final Builder dispatcher(CoroutineDispatcher dispatcher) {
            this.dispatcher = dispatcher;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public Builder addExecutionContext(ExecutionContext executionContext) {
            Intrinsics.checkNotNullParameter(executionContext, "executionContext");
            this.executionContext = getExecutionContext().plus(executionContext);
            return this;
        }

        public final Builder executionContext(ExecutionContext executionContext) {
            Intrinsics.checkNotNullParameter(executionContext, "executionContext");
            this.executionContext = executionContext;
            return this;
        }

        public static /* synthetic */ Builder autoPersistedQueries$default(Builder builder, HttpMethod httpMethod, HttpMethod httpMethod2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                httpMethod = HttpMethod.Get;
            }
            if ((i & 2) != 0) {
                httpMethod2 = HttpMethod.Post;
            }
            if ((i & 4) != 0) {
                z = true;
            }
            return builder.autoPersistedQueries(httpMethod, httpMethod2, z);
        }

        public final Builder autoPersistedQueries(HttpMethod httpMethodForHashedQueries, HttpMethod httpMethodForDocumentQueries, boolean enableByDefault) {
            Intrinsics.checkNotNullParameter(httpMethodForHashedQueries, "httpMethodForHashedQueries");
            Intrinsics.checkNotNullParameter(httpMethodForDocumentQueries, "httpMethodForDocumentQueries");
            CollectionsKt.removeAll((List) this._interceptors, new Function1() { // from class: com.apollographql.apollo.ApolloClient$Builder$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean autoPersistedQueries$lambda$40$lambda$39;
                    autoPersistedQueries$lambda$40$lambda$39 = ApolloClient.Builder.autoPersistedQueries$lambda$40$lambda$39((ApolloInterceptor) obj);
                    return Boolean.valueOf(autoPersistedQueries$lambda$40$lambda$39);
                }
            });
            addInterceptor(new AutoPersistedQueryInterceptor(httpMethodForHashedQueries, httpMethodForDocumentQueries));
            enableAutoPersistedQueries(Boolean.valueOf(enableByDefault));
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean autoPersistedQueries$lambda$40$lambda$39(ApolloInterceptor it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it instanceof AutoPersistedQueryInterceptor;
        }

        public static /* synthetic */ Builder httpBatching$default(Builder builder, long j, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = 10;
            }
            if ((i2 & 2) != 0) {
                i = 10;
            }
            if ((i2 & 4) != 0) {
                z = true;
            }
            return builder.httpBatching(j, i, z);
        }

        public final Builder httpBatching(long batchIntervalMillis, int maxBatchSize, boolean enableByDefault) {
            CollectionsKt.removeAll((List) this._httpInterceptors, new Function1() { // from class: com.apollographql.apollo.ApolloClient$Builder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean httpBatching$lambda$42$lambda$41;
                    httpBatching$lambda$42$lambda$41 = ApolloClient.Builder.httpBatching$lambda$42$lambda$41((HttpInterceptor) obj);
                    return Boolean.valueOf(httpBatching$lambda$42$lambda$41);
                }
            });
            addHttpInterceptor(new BatchingHttpInterceptor(batchIntervalMillis, maxBatchSize, false, 4, null));
            canBeBatched(Boolean.valueOf(enableByDefault));
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean httpBatching$lambda$42$lambda$41(HttpInterceptor it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it instanceof BatchingHttpInterceptor;
        }

        public final ApolloClient build() {
            return new ApolloClient(copy(), null);
        }

        public final Builder copy() {
            return new Builder().customScalarAdapters(this._customScalarAdaptersBuilder.build()).interceptors(this.interceptors).dispatcher(this.dispatcher).executionContext(getExecutionContext()).httpMethod(getHttpMethod()).httpHeaders(getHttpHeaders()).httpServerUrl(this.httpServerUrl).httpEngine(this.httpEngine).httpExposeErrorBody(this.httpExposeErrorBody).httpInterceptors(this.httpInterceptors).sendApqExtensions(getSendApqExtensions()).sendDocument(getSendDocument()).enableAutoPersistedQueries(getEnableAutoPersistedQueries()).canBeBatched(getCanBeBatched()).networkTransport(this.networkTransport).subscriptionNetworkTransport(this.subscriptionNetworkTransport).webSocketServerUrl(this.webSocketServerUrl).webSocketServerUrl(this.webSocketReopenServerUrl).webSocketEngine(this.webSocketEngine).webSocketReopenWhen(this.webSocketReopenWhen).webSocketIdleTimeoutMillis(this.webSocketIdleTimeoutMillis).wsProtocol(this.wsProtocolFactory).retryOnError(this.retryOnError).retryOnErrorInterceptor(this.retryOnErrorInterceptor).cacheInterceptor(this.cacheInterceptor).autoPersistedQueriesInterceptor(this.autoPersistedQueryInterceptor).failFastIfOffline(this.failFastIfOffline).listeners(this.listeners).sendEnhancedClientAwareness(this.sendEnhancedClientAwareness);
        }
    }

    /* compiled from: ApolloClient.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/apollographql/apollo/ApolloClient$Companion;", "", "<init>", "()V", "builder", "Lcom/apollographql/apollo/ApolloClient$Builder;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Used for backward compatibility with 2.x", replaceWith = @ReplaceWith(expression = "ApolloClient.Builder()", imports = {}))
        @JvmStatic
        public final Builder builder() {
            return new Builder();
        }
    }
}
