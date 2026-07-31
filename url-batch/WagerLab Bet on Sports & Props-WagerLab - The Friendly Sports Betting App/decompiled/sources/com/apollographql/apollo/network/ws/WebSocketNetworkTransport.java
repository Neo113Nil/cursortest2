package com.apollographql.apollo.network.ws;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.ExecutionContext;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Operations;
import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.api.json.JsonReaders;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.SubscriptionOperationException;
import com.apollographql.apollo.internal.DeferredJsonMerger;
import com.apollographql.apollo.internal.DeferredJsonMergerKt;
import com.apollographql.apollo.internal.FlowsKt;
import com.apollographql.apollo.network.NetworkTransport;
import com.apollographql.apollo.network.ws.SubscriptionWsProtocol;
import com.apollographql.apollo.network.ws.WsProtocol;
import com.apollographql.apollo.network.ws.internal.Command;
import com.apollographql.apollo.network.ws.internal.ConnectionReEstablished;
import com.apollographql.apollo.network.ws.internal.Dispose;
import com.apollographql.apollo.network.ws.internal.Event;
import com.apollographql.apollo.network.ws.internal.GeneralError;
import com.apollographql.apollo.network.ws.internal.Message;
import com.apollographql.apollo.network.ws.internal.NetworkError;
import com.apollographql.apollo.network.ws.internal.OperationComplete;
import com.apollographql.apollo.network.ws.internal.OperationError;
import com.apollographql.apollo.network.ws.internal.OperationResponse;
import com.apollographql.apollo.network.ws.internal.RestartConnection;
import com.apollographql.apollo.network.ws.internal.StartOperation;
import com.apollographql.apollo.network.ws.internal.StopOperation;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.net.HttpHeaders;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: WebSocketNetworkTransport.kt */
@Metadata(d1 = {"\u0000±\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001-\u0018\u00002\u00020\u0001:\u0001@B\u008e\u0001\b\u0002\u0012\u001c\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u00129\u0010\u0010\u001a5\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020+H\u0082@¢\u0006\u0002\u00102J,\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H60504\"\b\b\u0000\u00106*\u0002072\f\u00108\u001a\b\u0012\u0004\u0012\u0002H609H\u0016J.\u0010:\u001a\b\u0012\u0004\u0012\u0002H605\"\b\b\u0000\u00106*\u0002072\f\u00108\u001a\b\u0012\u0004\u0012\u0002H6092\u0006\u0010;\u001a\u00020<H\u0002J\b\u0010=\u001a\u000200H\u0016J\u000e\u0010>\u001a\u0002002\u0006\u0010?\u001a\u00020\u0012R&\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0019R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000RC\u0010\u0010\u001a5\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0004\n\u0002\u0010.¨\u0006A"}, d2 = {"Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport;", "Lcom/apollographql/apollo/network/NetworkTransport;", "serverUrl", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "headers", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "webSocketEngine", "Lcom/apollographql/apollo/network/ws/WebSocketEngine;", "idleTimeoutMillis", "", "protocolFactory", "Lcom/apollographql/apollo/network/ws/WsProtocol$Factory;", "reopenWhen", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "attempt", "", "<init>", "(Lkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/apollographql/apollo/network/ws/WebSocketEngine;JLcom/apollographql/apollo/network/ws/WsProtocol$Factory;Lkotlin/jvm/functions/Function3;)V", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function3;", "messages", "Lkotlinx/coroutines/channels/Channel;", "Lcom/apollographql/apollo/network/ws/internal/Message;", "mutableEvents", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/apollographql/apollo/network/ws/internal/Event;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "subscriptionCount", "Lkotlinx/coroutines/flow/StateFlow;", "", "getSubscriptionCount", "()Lkotlinx/coroutines/flow/StateFlow;", "backgroundDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "com/apollographql/apollo/network/ws/WebSocketNetworkTransport$listener$1", "Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport$listener$1;", "supervise", "", "scope", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "request", "Lcom/apollographql/apollo/api/ApolloRequest;", "errorResponse", "apolloException", "Lcom/apollographql/apollo/exception/ApolloException;", "dispose", "closeConnection", "reason", "Builder", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WebSocketNetworkTransport implements NetworkTransport {
    private final CoroutineDispatcher backgroundDispatcher;
    private final CoroutineScope coroutineScope;
    private final SharedFlow<Event> events;
    private final List<HttpHeader> headers;
    private final long idleTimeoutMillis;
    private final WebSocketNetworkTransport$listener$1 listener;
    private final Channel<Message> messages;
    private final MutableSharedFlow<Event> mutableEvents;
    private final WsProtocol.Factory protocolFactory;
    private final Function3<Throwable, Long, Continuation<? super Boolean>, Object> reopenWhen;
    private final Function1<Continuation<? super String>, Object> serverUrl;
    private final StateFlow<Integer> subscriptionCount;
    private final WebSocketEngine webSocketEngine;

    public /* synthetic */ WebSocketNetworkTransport(Function1 function1, List list, WebSocketEngine webSocketEngine, long j, WsProtocol.Factory factory, Function3 function3, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, list, webSocketEngine, j, factory, function3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [com.apollographql.apollo.network.ws.WebSocketNetworkTransport$listener$1] */
    private WebSocketNetworkTransport(Function1<? super Continuation<? super String>, ? extends Object> function1, List<HttpHeader> list, WebSocketEngine webSocketEngine, long j, WsProtocol.Factory factory, Function3<? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> function3) {
        this.serverUrl = function1;
        this.headers = list;
        this.webSocketEngine = webSocketEngine;
        this.idleTimeoutMillis = j;
        this.protocolFactory = factory;
        this.reopenWhen = function3;
        this.messages = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        MutableSharedFlow<Event> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(0, Integer.MAX_VALUE, BufferOverflow.SUSPEND);
        this.mutableEvents = MutableSharedFlow;
        this.events = FlowKt.asSharedFlow(MutableSharedFlow);
        this.subscriptionCount = MutableSharedFlow.getSubscriptionCount();
        CoroutineDispatcher limitedParallelism$default = CoroutineDispatcher.limitedParallelism$default(Dispatchers.getDefault(), 1, null, 2, null);
        this.backgroundDispatcher = limitedParallelism$default;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(limitedParallelism$default);
        this.coroutineScope = CoroutineScope;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass1(null), 3, null);
        this.listener = new WsProtocol.Listener() { // from class: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$listener$1
            @Override // com.apollographql.apollo.network.ws.WsProtocol.Listener
            public void operationResponse(String id, Map<String, ? extends Object> payload) {
                Channel channel;
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(payload, "payload");
                channel = WebSocketNetworkTransport.this.messages;
                channel.mo8997trySendJP2dKIU(new OperationResponse(id, payload));
            }

            @Override // com.apollographql.apollo.network.ws.WsProtocol.Listener
            public void operationError(String id, Map<String, ? extends Object> payload) {
                Channel channel;
                Intrinsics.checkNotNullParameter(id, "id");
                channel = WebSocketNetworkTransport.this.messages;
                channel.mo8997trySendJP2dKIU(new OperationError(id, payload));
            }

            @Override // com.apollographql.apollo.network.ws.WsProtocol.Listener
            public void operationComplete(String id) {
                Channel channel;
                Intrinsics.checkNotNullParameter(id, "id");
                channel = WebSocketNetworkTransport.this.messages;
                channel.mo8997trySendJP2dKIU(new OperationComplete(id));
            }

            @Override // com.apollographql.apollo.network.ws.WsProtocol.Listener
            public void generalError(Map<String, ? extends Object> payload) {
                Channel channel;
                channel = WebSocketNetworkTransport.this.messages;
                channel.mo8997trySendJP2dKIU(new GeneralError(payload));
            }

            @Override // com.apollographql.apollo.network.ws.WsProtocol.Listener
            public void networkError(Throwable cause) {
                Channel channel;
                Intrinsics.checkNotNullParameter(cause, "cause");
                channel = WebSocketNetworkTransport.this.messages;
                channel.mo8997trySendJP2dKIU(new NetworkError(cause));
            }
        };
    }

    /* synthetic */ WebSocketNetworkTransport(Function1 function1, List list, WebSocketEngine webSocketEngine, long j, WsProtocol.Factory factory, Function3 function3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, list, (i & 4) != 0 ? new DefaultWebSocketEngine() : webSocketEngine, (i & 8) != 0 ? 60000L : j, (i & 16) != 0 ? new SubscriptionWsProtocol.Factory(0L, null, null, 7, null) : factory, function3);
    }

    public final StateFlow<Integer> getSubscriptionCount() {
        return this.subscriptionCount;
    }

    /* compiled from: WebSocketNetworkTransport.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$1", f = "WebSocketNetworkTransport.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = WebSocketNetworkTransport.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                this.label = 1;
                if (WebSocketNetworkTransport.this.supervise(coroutineScope, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:64|65|66|67|(3:117|(3:120|(5:122|123|76|77|(6:79|80|81|82|83|84))(1:124)|118)|125)(1:71)|72|73|74|75|76|77|(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:79|80|81|82|83|84) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0387, code lost:
    
        r5 = r12;
        r12 = r13;
        r13 = r14;
        r14 = r15;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03c1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x03c2, code lost:
    
        r6 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x03c6, code lost:
    
        r5 = r12;
        r7 = r13;
        r12 = r14;
        r13 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0365, code lost:
    
        if (((com.apollographql.apollo.network.ws.WsProtocol) r0).connectionInit(r2) != r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x046f, code lost:
    
        if (r0.send(r7, r2) == r6) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0386, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f0 A[Catch: Exception -> 0x03c5, TryCatch #5 {Exception -> 0x03c5, blocks: (B:66:0x02d0, B:69:0x02dc, B:72:0x0305, B:117:0x02e6, B:118:0x02ea, B:120:0x02f0, B:123:0x0300), top: B:65:0x02d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x042d  */
    /* JADX WARN: Type inference failed for: r0v39, types: [T, com.apollographql.apollo.network.ws.WsProtocol] */
    /* JADX WARN: Type inference failed for: r0v87, types: [T, kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r8v13, types: [T, kotlinx.coroutines.Job] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0244 -> B:16:0x01a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0410 -> B:12:0x0472). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x0431 -> B:12:0x0472). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x044f -> B:12:0x0472). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x046f -> B:12:0x0472). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object supervise(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        WebSocketNetworkTransport$supervise$1 webSocketNetworkTransport$supervise$1;
        Map linkedHashMap;
        long j;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        WebSocketNetworkTransport$supervise$1 webSocketNetworkTransport$supervise$12;
        Ref.ObjectRef objectRef3;
        CoroutineScope coroutineScope2;
        CoroutineScope coroutineScope3;
        long j2;
        Message message;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        Ref.ObjectRef objectRef6;
        CoroutineScope coroutineScope4;
        long j3;
        WebSocketEngine webSocketEngine;
        Message message2;
        Map map;
        Ref.ObjectRef objectRef7;
        Ref.ObjectRef objectRef8;
        Map map2;
        Ref.ObjectRef objectRef9;
        Ref.ObjectRef objectRef10;
        Ref.ObjectRef objectRef11;
        CoroutineScope coroutineScope5;
        Ref.ObjectRef objectRef12;
        Message message3;
        CoroutineScope coroutineScope6;
        Ref.ObjectRef objectRef13;
        Ref.ObjectRef objectRef14;
        Channel<Message> channel;
        NetworkError networkError;
        CoroutineScope coroutineScope7;
        Ref.ObjectRef objectRef15;
        Ref.ObjectRef objectRef16;
        Ref.ObjectRef objectRef17;
        Map map3;
        Message message4;
        Command command;
        ?? launch$default;
        List<HttpHeader> list;
        Iterator<T> it;
        List<HttpHeader> list2;
        Object obj;
        int i;
        Object receive;
        Map map4;
        int i2;
        Object obj2;
        ?? launch$default2;
        WebSocketNetworkTransport webSocketNetworkTransport = this;
        if (continuation instanceof WebSocketNetworkTransport$supervise$1) {
            webSocketNetworkTransport$supervise$1 = (WebSocketNetworkTransport$supervise$1) continuation;
            if ((webSocketNetworkTransport$supervise$1.label & Integer.MIN_VALUE) != 0) {
                webSocketNetworkTransport$supervise$1.label -= Integer.MIN_VALUE;
                Object obj3 = webSocketNetworkTransport$supervise$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = 1;
                Object obj4 = null;
                switch (webSocketNetworkTransport$supervise$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj3);
                        Ref.ObjectRef objectRef18 = new Ref.ObjectRef();
                        Ref.ObjectRef objectRef19 = new Ref.ObjectRef();
                        Ref.ObjectRef objectRef20 = new Ref.ObjectRef();
                        linkedHashMap = new LinkedHashMap();
                        j = 0;
                        objectRef = objectRef20;
                        objectRef2 = objectRef19;
                        webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$1;
                        objectRef3 = objectRef18;
                        coroutineScope2 = coroutineScope;
                        Channel<Message> channel2 = webSocketNetworkTransport.messages;
                        webSocketNetworkTransport$supervise$12.L$0 = coroutineScope2;
                        webSocketNetworkTransport$supervise$12.L$1 = objectRef3;
                        webSocketNetworkTransport$supervise$12.L$2 = objectRef2;
                        webSocketNetworkTransport$supervise$12.L$3 = objectRef;
                        webSocketNetworkTransport$supervise$12.L$4 = linkedHashMap;
                        webSocketNetworkTransport$supervise$12.L$5 = obj4;
                        webSocketNetworkTransport$supervise$12.J$0 = j;
                        webSocketNetworkTransport$supervise$12.label = i3;
                        receive = channel2.receive(webSocketNetworkTransport$supervise$12);
                        if (receive != coroutine_suspended) {
                            coroutineScope3 = coroutineScope2;
                            obj3 = receive;
                            message4 = (Message) obj3;
                            if (message4 instanceof Event) {
                                if (message4 instanceof NetworkError) {
                                    supervise$closeProtocol(objectRef, objectRef2, objectRef3);
                                    Function3<Throwable, Long, Continuation<? super Boolean>, Object> function3 = webSocketNetworkTransport.reopenWhen;
                                    if (function3 != null) {
                                        Throwable cause = ((NetworkError) message4).getCause();
                                        Long boxLong = Boxing.boxLong(j);
                                        webSocketNetworkTransport$supervise$12.L$0 = coroutineScope3;
                                        webSocketNetworkTransport$supervise$12.L$1 = objectRef3;
                                        webSocketNetworkTransport$supervise$12.L$2 = objectRef2;
                                        webSocketNetworkTransport$supervise$12.L$3 = objectRef;
                                        webSocketNetworkTransport$supervise$12.L$4 = linkedHashMap;
                                        webSocketNetworkTransport$supervise$12.L$5 = message4;
                                        webSocketNetworkTransport$supervise$12.J$0 = j;
                                        webSocketNetworkTransport$supervise$12.label = 2;
                                        Object invoke = function3.invoke(cause, boxLong, webSocketNetworkTransport$supervise$12);
                                        if (invoke != coroutine_suspended) {
                                            coroutineScope4 = coroutineScope3;
                                            objectRef6 = objectRef3;
                                            webSocketNetworkTransport$supervise$1 = webSocketNetworkTransport$supervise$12;
                                            Ref.ObjectRef objectRef21 = objectRef;
                                            message = message4;
                                            obj3 = invoke;
                                            long j4 = j;
                                            objectRef5 = objectRef2;
                                            objectRef4 = objectRef21;
                                            j2 = j4;
                                            if (((Boolean) obj3).booleanValue() != i3) {
                                                message4 = message;
                                                i = i3;
                                                objectRef = objectRef4;
                                            } else {
                                                message4 = message;
                                                objectRef = objectRef4;
                                                i = 0;
                                            }
                                            long j5 = j2;
                                            webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$1;
                                            objectRef2 = objectRef5;
                                            objectRef3 = objectRef6;
                                            j = j5;
                                            if (i != 0) {
                                                j++;
                                                Channel<Message> channel3 = webSocketNetworkTransport.messages;
                                                RestartConnection restartConnection = RestartConnection.INSTANCE;
                                                webSocketNetworkTransport$supervise$12.L$0 = coroutineScope4;
                                                webSocketNetworkTransport$supervise$12.L$1 = objectRef3;
                                                webSocketNetworkTransport$supervise$12.L$2 = objectRef2;
                                                webSocketNetworkTransport$supervise$12.L$3 = objectRef;
                                                webSocketNetworkTransport$supervise$12.L$4 = linkedHashMap;
                                                webSocketNetworkTransport$supervise$12.L$5 = null;
                                                webSocketNetworkTransport$supervise$12.J$0 = j;
                                                webSocketNetworkTransport$supervise$12.label = 3;
                                                if (channel3.send(restartConnection, webSocketNetworkTransport$supervise$12) != coroutine_suspended) {
                                                    coroutineScope2 = coroutineScope4;
                                                    obj4 = null;
                                                    Channel<Message> channel22 = webSocketNetworkTransport.messages;
                                                    webSocketNetworkTransport$supervise$12.L$0 = coroutineScope2;
                                                    webSocketNetworkTransport$supervise$12.L$1 = objectRef3;
                                                    webSocketNetworkTransport$supervise$12.L$2 = objectRef2;
                                                    webSocketNetworkTransport$supervise$12.L$3 = objectRef;
                                                    webSocketNetworkTransport$supervise$12.L$4 = linkedHashMap;
                                                    webSocketNetworkTransport$supervise$12.L$5 = obj4;
                                                    webSocketNetworkTransport$supervise$12.J$0 = j;
                                                    webSocketNetworkTransport$supervise$12.label = i3;
                                                    receive = channel22.receive(webSocketNetworkTransport$supervise$12);
                                                    if (receive != coroutine_suspended) {
                                                    }
                                                }
                                            } else {
                                                Boxing.boxBoolean(webSocketNetworkTransport.mutableEvents.tryEmit(message4));
                                                coroutineScope2 = coroutineScope4;
                                                j = 0;
                                                obj4 = null;
                                                Channel<Message> channel222 = webSocketNetworkTransport.messages;
                                                webSocketNetworkTransport$supervise$12.L$0 = coroutineScope2;
                                                webSocketNetworkTransport$supervise$12.L$1 = objectRef3;
                                                webSocketNetworkTransport$supervise$12.L$2 = objectRef2;
                                                webSocketNetworkTransport$supervise$12.L$3 = objectRef;
                                                webSocketNetworkTransport$supervise$12.L$4 = linkedHashMap;
                                                webSocketNetworkTransport$supervise$12.L$5 = obj4;
                                                webSocketNetworkTransport$supervise$12.J$0 = j;
                                                webSocketNetworkTransport$supervise$12.label = i3;
                                                receive = channel222.receive(webSocketNetworkTransport$supervise$12);
                                                if (receive != coroutine_suspended) {
                                                }
                                            }
                                        }
                                    } else {
                                        coroutineScope4 = coroutineScope3;
                                        i = 0;
                                        if (i != 0) {
                                        }
                                    }
                                } else {
                                    if (!(message4 instanceof ConnectionReEstablished)) {
                                        Boxing.boxBoolean(webSocketNetworkTransport.mutableEvents.tryEmit(message4));
                                    } else {
                                        Iterator it2 = linkedHashMap.values().iterator();
                                        while (it2.hasNext()) {
                                            webSocketNetworkTransport.messages.mo8997trySendJP2dKIU((StartOperation) it2.next());
                                        }
                                    }
                                    coroutineScope2 = coroutineScope3;
                                    j = 0;
                                    obj4 = null;
                                    Channel<Message> channel2222 = webSocketNetworkTransport.messages;
                                    webSocketNetworkTransport$supervise$12.L$0 = coroutineScope2;
                                    webSocketNetworkTransport$supervise$12.L$1 = objectRef3;
                                    webSocketNetworkTransport$supervise$12.L$2 = objectRef2;
                                    webSocketNetworkTransport$supervise$12.L$3 = objectRef;
                                    webSocketNetworkTransport$supervise$12.L$4 = linkedHashMap;
                                    webSocketNetworkTransport$supervise$12.L$5 = obj4;
                                    webSocketNetworkTransport$supervise$12.J$0 = j;
                                    webSocketNetworkTransport$supervise$12.label = i3;
                                    receive = channel2222.receive(webSocketNetworkTransport$supervise$12);
                                    if (receive != coroutine_suspended) {
                                    }
                                }
                            } else {
                                if (!(message4 instanceof Command)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (message4 instanceof Dispose) {
                                    supervise$closeProtocol(objectRef, objectRef2, objectRef3);
                                    return Unit.INSTANCE;
                                }
                                if (objectRef.element == 0) {
                                    if (message4 instanceof StopOperation) {
                                        linkedHashMap.remove(((StopOperation) message4).getRequest().getRequestUuid());
                                        coroutineScope2 = coroutineScope3;
                                        obj4 = null;
                                        Channel<Message> channel22222 = webSocketNetworkTransport.messages;
                                        webSocketNetworkTransport$supervise$12.L$0 = coroutineScope2;
                                        webSocketNetworkTransport$supervise$12.L$1 = objectRef3;
                                        webSocketNetworkTransport$supervise$12.L$2 = objectRef2;
                                        webSocketNetworkTransport$supervise$12.L$3 = objectRef;
                                        webSocketNetworkTransport$supervise$12.L$4 = linkedHashMap;
                                        webSocketNetworkTransport$supervise$12.L$5 = obj4;
                                        webSocketNetworkTransport$supervise$12.J$0 = j;
                                        webSocketNetworkTransport$supervise$12.label = i3;
                                        receive = channel22222.receive(webSocketNetworkTransport$supervise$12);
                                        if (receive != coroutine_suspended) {
                                        }
                                    } else {
                                        try {
                                        } catch (Exception e) {
                                            e = e;
                                            Map map5 = linkedHashMap;
                                            objectRef9 = objectRef;
                                            map2 = map5;
                                            objectRef11 = objectRef3;
                                            webSocketNetworkTransport$supervise$1 = webSocketNetworkTransport$supervise$12;
                                            coroutineScope5 = coroutineScope3;
                                            objectRef10 = objectRef2;
                                            j3 = j;
                                            channel = webSocketNetworkTransport.messages;
                                            networkError = new NetworkError(e);
                                            webSocketNetworkTransport$supervise$1.L$0 = coroutineScope5;
                                            webSocketNetworkTransport$supervise$1.L$1 = objectRef11;
                                            webSocketNetworkTransport$supervise$1.L$2 = objectRef10;
                                            webSocketNetworkTransport$supervise$1.L$3 = objectRef9;
                                            webSocketNetworkTransport$supervise$1.L$4 = map2;
                                            webSocketNetworkTransport$supervise$1.L$5 = null;
                                            webSocketNetworkTransport$supervise$1.L$6 = null;
                                            webSocketNetworkTransport$supervise$1.J$0 = j3;
                                            webSocketNetworkTransport$supervise$1.label = 6;
                                            if (channel.send(networkError, webSocketNetworkTransport$supervise$1) != coroutine_suspended) {
                                            }
                                            return coroutine_suspended;
                                        }
                                        WebSocketEngine webSocketEngine2 = webSocketNetworkTransport.webSocketEngine;
                                        Function1<Continuation<? super String>, Object> function1 = webSocketNetworkTransport.serverUrl;
                                        webSocketNetworkTransport$supervise$12.L$0 = coroutineScope3;
                                        webSocketNetworkTransport$supervise$12.L$1 = objectRef3;
                                        webSocketNetworkTransport$supervise$12.L$2 = objectRef2;
                                        webSocketNetworkTransport$supervise$12.L$3 = objectRef;
                                        webSocketNetworkTransport$supervise$12.L$4 = linkedHashMap;
                                        webSocketNetworkTransport$supervise$12.L$5 = message4;
                                        webSocketNetworkTransport$supervise$12.L$6 = webSocketEngine2;
                                        webSocketNetworkTransport$supervise$12.J$0 = j;
                                        webSocketNetworkTransport$supervise$12.label = 4;
                                        Object invoke2 = function1.invoke(webSocketNetworkTransport$supervise$12);
                                        if (invoke2 != coroutine_suspended) {
                                            objectRef8 = objectRef2;
                                            coroutineScope5 = coroutineScope3;
                                            map = linkedHashMap;
                                            message2 = message4;
                                            obj3 = invoke2;
                                            objectRef7 = objectRef;
                                            webSocketEngine = webSocketEngine2;
                                            long j6 = j;
                                            objectRef12 = objectRef3;
                                            webSocketNetworkTransport$supervise$1 = webSocketNetworkTransport$supervise$12;
                                            j3 = j6;
                                            try {
                                            } catch (Exception e2) {
                                                e = e2;
                                                break;
                                            }
                                            String str = (String) obj3;
                                            list = webSocketNetworkTransport.headers;
                                            if ((list instanceof Collection) || !list.isEmpty()) {
                                                it = list.iterator();
                                                while (it.hasNext()) {
                                                    if (Intrinsics.areEqual(((HttpHeader) it.next()).getName(), HttpHeaders.SEC_WEBSOCKET_PROTOCOL)) {
                                                        list2 = webSocketNetworkTransport.headers;
                                                        obj = coroutine_suspended;
                                                        webSocketNetworkTransport$supervise$1.L$0 = coroutineScope5;
                                                        webSocketNetworkTransport$supervise$1.L$1 = objectRef12;
                                                        webSocketNetworkTransport$supervise$1.L$2 = objectRef8;
                                                        webSocketNetworkTransport$supervise$1.L$3 = objectRef7;
                                                        webSocketNetworkTransport$supervise$1.L$4 = map;
                                                        webSocketNetworkTransport$supervise$1.L$5 = message2;
                                                        webSocketNetworkTransport$supervise$1.L$6 = null;
                                                        webSocketNetworkTransport$supervise$1.J$0 = j3;
                                                        webSocketNetworkTransport$supervise$1.label = 5;
                                                        obj3 = webSocketEngine.open(str, list2, webSocketNetworkTransport$supervise$1);
                                                        coroutine_suspended = obj;
                                                        if (obj3 != coroutine_suspended) {
                                                            message3 = message2;
                                                            coroutineScope6 = coroutineScope5;
                                                            objectRef13 = objectRef12;
                                                            try {
                                                            } catch (Exception e3) {
                                                                e = e3;
                                                                Ref.ObjectRef objectRef22 = objectRef13;
                                                                coroutineScope5 = coroutineScope6;
                                                                objectRef9 = objectRef7;
                                                                objectRef11 = objectRef22;
                                                                map2 = map;
                                                                objectRef10 = objectRef8;
                                                                channel = webSocketNetworkTransport.messages;
                                                                networkError = new NetworkError(e);
                                                                webSocketNetworkTransport$supervise$1.L$0 = coroutineScope5;
                                                                webSocketNetworkTransport$supervise$1.L$1 = objectRef11;
                                                                webSocketNetworkTransport$supervise$1.L$2 = objectRef10;
                                                                webSocketNetworkTransport$supervise$1.L$3 = objectRef9;
                                                                webSocketNetworkTransport$supervise$1.L$4 = map2;
                                                                webSocketNetworkTransport$supervise$1.L$5 = null;
                                                                webSocketNetworkTransport$supervise$1.L$6 = null;
                                                                webSocketNetworkTransport$supervise$1.J$0 = j3;
                                                                webSocketNetworkTransport$supervise$1.label = 6;
                                                                if (channel.send(networkError, webSocketNetworkTransport$supervise$1) != coroutine_suspended) {
                                                                }
                                                                return coroutine_suspended;
                                                            }
                                                            objectRef7.element = webSocketNetworkTransport.protocolFactory.create((WebSocketConnection) obj3, webSocketNetworkTransport.listener, coroutineScope6);
                                                            T t = objectRef7.element;
                                                            Intrinsics.checkNotNull(t);
                                                            webSocketNetworkTransport$supervise$1.L$0 = coroutineScope6;
                                                            webSocketNetworkTransport$supervise$1.L$1 = objectRef13;
                                                            webSocketNetworkTransport$supervise$1.L$2 = objectRef8;
                                                            webSocketNetworkTransport$supervise$1.L$3 = objectRef7;
                                                            webSocketNetworkTransport$supervise$1.L$4 = map;
                                                            webSocketNetworkTransport$supervise$1.L$5 = message3;
                                                            webSocketNetworkTransport$supervise$1.J$0 = j3;
                                                            webSocketNetworkTransport$supervise$1.label = 7;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            obj = coroutine_suspended;
                                            list2 = CollectionsKt.plus((Collection<? extends HttpHeader>) webSocketNetworkTransport.headers, new HttpHeader(HttpHeaders.SEC_WEBSOCKET_PROTOCOL, webSocketNetworkTransport.protocolFactory.getName()));
                                            webSocketNetworkTransport$supervise$1.L$0 = coroutineScope5;
                                            webSocketNetworkTransport$supervise$1.L$1 = objectRef12;
                                            webSocketNetworkTransport$supervise$1.L$2 = objectRef8;
                                            webSocketNetworkTransport$supervise$1.L$3 = objectRef7;
                                            webSocketNetworkTransport$supervise$1.L$4 = map;
                                            webSocketNetworkTransport$supervise$1.L$5 = message2;
                                            webSocketNetworkTransport$supervise$1.L$6 = null;
                                            webSocketNetworkTransport$supervise$1.J$0 = j3;
                                            webSocketNetworkTransport$supervise$1.label = 5;
                                            obj3 = webSocketEngine.open(str, list2, webSocketNetworkTransport$supervise$1);
                                            coroutine_suspended = obj;
                                            if (obj3 != coroutine_suspended) {
                                            }
                                        }
                                    }
                                } else {
                                    objectRef15 = objectRef3;
                                    webSocketNetworkTransport$supervise$1 = webSocketNetworkTransport$supervise$12;
                                    objectRef16 = objectRef2;
                                    j3 = j;
                                    coroutineScope7 = coroutineScope3;
                                    objectRef17 = objectRef;
                                    map3 = linkedHashMap;
                                    command = (Command) message4;
                                    if (command instanceof StartOperation) {
                                        StartOperation startOperation = (StartOperation) message4;
                                        map3.put(startOperation.getRequest().getRequestUuid(), message4);
                                        T t2 = objectRef17.element;
                                        Intrinsics.checkNotNull(t2);
                                        ((WsProtocol) t2).startOperation(startOperation.getRequest());
                                    } else if (command instanceof StopOperation) {
                                        StopOperation stopOperation = (StopOperation) message4;
                                        map3.remove(stopOperation.getRequest().getRequestUuid());
                                        T t3 = objectRef17.element;
                                        Intrinsics.checkNotNull(t3);
                                        ((WsProtocol) t3).stopOperation(stopOperation.getRequest());
                                    } else if (command instanceof RestartConnection) {
                                        Channel<Message> channel4 = webSocketNetworkTransport.messages;
                                        ConnectionReEstablished connectionReEstablished = new ConnectionReEstablished();
                                        webSocketNetworkTransport$supervise$1.L$0 = coroutineScope7;
                                        webSocketNetworkTransport$supervise$1.L$1 = objectRef15;
                                        webSocketNetworkTransport$supervise$1.L$2 = objectRef16;
                                        webSocketNetworkTransport$supervise$1.L$3 = objectRef17;
                                        webSocketNetworkTransport$supervise$1.L$4 = map3;
                                        webSocketNetworkTransport$supervise$1.L$5 = null;
                                        webSocketNetworkTransport$supervise$1.J$0 = j3;
                                        webSocketNetworkTransport$supervise$1.label = 9;
                                        break;
                                    }
                                    WebSocketNetworkTransport$supervise$1 webSocketNetworkTransport$supervise$13 = webSocketNetworkTransport$supervise$1;
                                    j = j3;
                                    map4 = map3;
                                    Ref.ObjectRef objectRef23 = objectRef17;
                                    Ref.ObjectRef objectRef24 = objectRef16;
                                    Ref.ObjectRef objectRef25 = objectRef15;
                                    CoroutineScope coroutineScope8 = coroutineScope7;
                                    if (map4.isEmpty()) {
                                        launch$default2 = BuildersKt__Builders_commonKt.launch$default(coroutineScope8, null, null, new WebSocketNetworkTransport$supervise$4(webSocketNetworkTransport, objectRef23, objectRef24, objectRef25, null), 3, null);
                                        objectRef25.element = launch$default2;
                                        i2 = 1;
                                        obj2 = null;
                                    } else {
                                        Job job = (Job) objectRef25.element;
                                        i2 = 1;
                                        obj2 = null;
                                        if (job != null) {
                                            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                        }
                                        objectRef25.element = null;
                                    }
                                    objectRef = objectRef23;
                                    objectRef3 = objectRef25;
                                    obj4 = obj2;
                                    coroutineScope2 = coroutineScope8;
                                    objectRef2 = objectRef24;
                                    webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$13;
                                    linkedHashMap = map4;
                                    i3 = i2;
                                    webSocketNetworkTransport = this;
                                    Channel<Message> channel222222 = webSocketNetworkTransport.messages;
                                    webSocketNetworkTransport$supervise$12.L$0 = coroutineScope2;
                                    webSocketNetworkTransport$supervise$12.L$1 = objectRef3;
                                    webSocketNetworkTransport$supervise$12.L$2 = objectRef2;
                                    webSocketNetworkTransport$supervise$12.L$3 = objectRef;
                                    webSocketNetworkTransport$supervise$12.L$4 = linkedHashMap;
                                    webSocketNetworkTransport$supervise$12.L$5 = obj4;
                                    webSocketNetworkTransport$supervise$12.J$0 = j;
                                    webSocketNetworkTransport$supervise$12.label = i3;
                                    receive = channel222222.receive(webSocketNetworkTransport$supervise$12);
                                    if (receive != coroutine_suspended) {
                                    }
                                }
                            }
                        }
                        return coroutine_suspended;
                    case 1:
                        long j7 = webSocketNetworkTransport$supervise$1.J$0;
                        Map map6 = (Map) webSocketNetworkTransport$supervise$1.L$4;
                        Ref.ObjectRef objectRef26 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$3;
                        Ref.ObjectRef objectRef27 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$2;
                        Ref.ObjectRef objectRef28 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$1;
                        coroutineScope3 = (CoroutineScope) webSocketNetworkTransport$supervise$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        linkedHashMap = map6;
                        objectRef = objectRef26;
                        webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$1;
                        objectRef2 = objectRef27;
                        objectRef3 = objectRef28;
                        j = j7;
                        message4 = (Message) obj3;
                        if (message4 instanceof Event) {
                        }
                        return coroutine_suspended;
                    case 2:
                        j2 = webSocketNetworkTransport$supervise$1.J$0;
                        message = (Message) webSocketNetworkTransport$supervise$1.L$5;
                        linkedHashMap = (Map) webSocketNetworkTransport$supervise$1.L$4;
                        objectRef4 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$3;
                        objectRef5 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$2;
                        objectRef6 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$1;
                        coroutineScope4 = (CoroutineScope) webSocketNetworkTransport$supervise$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        if (((Boolean) obj3).booleanValue() != i3) {
                        }
                        long j52 = j2;
                        webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$1;
                        objectRef2 = objectRef5;
                        objectRef3 = objectRef6;
                        j = j52;
                        if (i != 0) {
                        }
                        break;
                    case 3:
                        long j8 = webSocketNetworkTransport$supervise$1.J$0;
                        Map map7 = (Map) webSocketNetworkTransport$supervise$1.L$4;
                        Ref.ObjectRef objectRef29 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$3;
                        Ref.ObjectRef objectRef30 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$2;
                        Ref.ObjectRef objectRef31 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$1;
                        CoroutineScope coroutineScope9 = (CoroutineScope) webSocketNetworkTransport$supervise$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        linkedHashMap = map7;
                        objectRef = objectRef29;
                        coroutineScope2 = coroutineScope9;
                        webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$1;
                        objectRef2 = objectRef30;
                        objectRef3 = objectRef31;
                        j = j8;
                        obj4 = null;
                        Channel<Message> channel2222222 = webSocketNetworkTransport.messages;
                        webSocketNetworkTransport$supervise$12.L$0 = coroutineScope2;
                        webSocketNetworkTransport$supervise$12.L$1 = objectRef3;
                        webSocketNetworkTransport$supervise$12.L$2 = objectRef2;
                        webSocketNetworkTransport$supervise$12.L$3 = objectRef;
                        webSocketNetworkTransport$supervise$12.L$4 = linkedHashMap;
                        webSocketNetworkTransport$supervise$12.L$5 = obj4;
                        webSocketNetworkTransport$supervise$12.J$0 = j;
                        webSocketNetworkTransport$supervise$12.label = i3;
                        receive = channel2222222.receive(webSocketNetworkTransport$supervise$12);
                        if (receive != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 4:
                        j3 = webSocketNetworkTransport$supervise$1.J$0;
                        webSocketEngine = (WebSocketEngine) webSocketNetworkTransport$supervise$1.L$6;
                        message2 = (Message) webSocketNetworkTransport$supervise$1.L$5;
                        map = (Map) webSocketNetworkTransport$supervise$1.L$4;
                        objectRef7 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$3;
                        objectRef8 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$2;
                        Ref.ObjectRef objectRef32 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$1;
                        CoroutineScope coroutineScope10 = (CoroutineScope) webSocketNetworkTransport$supervise$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj3);
                            coroutineScope5 = coroutineScope10;
                            objectRef12 = objectRef32;
                        } catch (Exception e4) {
                            e = e4;
                            map2 = map;
                            objectRef9 = objectRef7;
                            objectRef10 = objectRef8;
                            objectRef11 = objectRef32;
                            coroutineScope5 = coroutineScope10;
                            channel = webSocketNetworkTransport.messages;
                            networkError = new NetworkError(e);
                            webSocketNetworkTransport$supervise$1.L$0 = coroutineScope5;
                            webSocketNetworkTransport$supervise$1.L$1 = objectRef11;
                            webSocketNetworkTransport$supervise$1.L$2 = objectRef10;
                            webSocketNetworkTransport$supervise$1.L$3 = objectRef9;
                            webSocketNetworkTransport$supervise$1.L$4 = map2;
                            webSocketNetworkTransport$supervise$1.L$5 = null;
                            webSocketNetworkTransport$supervise$1.L$6 = null;
                            webSocketNetworkTransport$supervise$1.J$0 = j3;
                            webSocketNetworkTransport$supervise$1.label = 6;
                            if (channel.send(networkError, webSocketNetworkTransport$supervise$1) != coroutine_suspended) {
                                Ref.ObjectRef objectRef33 = objectRef9;
                                linkedHashMap = map2;
                                objectRef = objectRef33;
                                coroutineScope2 = coroutineScope5;
                                j = j3;
                                objectRef2 = objectRef10;
                                webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$1;
                                objectRef3 = objectRef11;
                                i3 = 1;
                                obj4 = null;
                                Channel<Message> channel22222222 = webSocketNetworkTransport.messages;
                                webSocketNetworkTransport$supervise$12.L$0 = coroutineScope2;
                                webSocketNetworkTransport$supervise$12.L$1 = objectRef3;
                                webSocketNetworkTransport$supervise$12.L$2 = objectRef2;
                                webSocketNetworkTransport$supervise$12.L$3 = objectRef;
                                webSocketNetworkTransport$supervise$12.L$4 = linkedHashMap;
                                webSocketNetworkTransport$supervise$12.L$5 = obj4;
                                webSocketNetworkTransport$supervise$12.J$0 = j;
                                webSocketNetworkTransport$supervise$12.label = i3;
                                receive = channel22222222.receive(webSocketNetworkTransport$supervise$12);
                                if (receive != coroutine_suspended) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        String str2 = (String) obj3;
                        list = webSocketNetworkTransport.headers;
                        if (list instanceof Collection) {
                            break;
                        }
                        it = list.iterator();
                        while (it.hasNext()) {
                        }
                        obj = coroutine_suspended;
                        list2 = CollectionsKt.plus((Collection<? extends HttpHeader>) webSocketNetworkTransport.headers, new HttpHeader(HttpHeaders.SEC_WEBSOCKET_PROTOCOL, webSocketNetworkTransport.protocolFactory.getName()));
                        webSocketNetworkTransport$supervise$1.L$0 = coroutineScope5;
                        webSocketNetworkTransport$supervise$1.L$1 = objectRef12;
                        webSocketNetworkTransport$supervise$1.L$2 = objectRef8;
                        webSocketNetworkTransport$supervise$1.L$3 = objectRef7;
                        webSocketNetworkTransport$supervise$1.L$4 = map;
                        webSocketNetworkTransport$supervise$1.L$5 = message2;
                        webSocketNetworkTransport$supervise$1.L$6 = null;
                        webSocketNetworkTransport$supervise$1.J$0 = j3;
                        webSocketNetworkTransport$supervise$1.label = 5;
                        obj3 = webSocketEngine.open(str2, list2, webSocketNetworkTransport$supervise$1);
                        coroutine_suspended = obj;
                        if (obj3 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 5:
                        j3 = webSocketNetworkTransport$supervise$1.J$0;
                        message3 = (Message) webSocketNetworkTransport$supervise$1.L$5;
                        Map map8 = (Map) webSocketNetworkTransport$supervise$1.L$4;
                        Ref.ObjectRef objectRef34 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$3;
                        Ref.ObjectRef objectRef35 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$2;
                        Ref.ObjectRef objectRef36 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$1;
                        coroutineScope5 = (CoroutineScope) webSocketNetworkTransport$supervise$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj3);
                            map = map8;
                            coroutineScope6 = coroutineScope5;
                            objectRef13 = objectRef36;
                            objectRef8 = objectRef35;
                            objectRef7 = objectRef34;
                        } catch (Exception e5) {
                            e = e5;
                            map2 = map8;
                            objectRef9 = objectRef34;
                            objectRef10 = objectRef35;
                            objectRef11 = objectRef36;
                            channel = webSocketNetworkTransport.messages;
                            networkError = new NetworkError(e);
                            webSocketNetworkTransport$supervise$1.L$0 = coroutineScope5;
                            webSocketNetworkTransport$supervise$1.L$1 = objectRef11;
                            webSocketNetworkTransport$supervise$1.L$2 = objectRef10;
                            webSocketNetworkTransport$supervise$1.L$3 = objectRef9;
                            webSocketNetworkTransport$supervise$1.L$4 = map2;
                            webSocketNetworkTransport$supervise$1.L$5 = null;
                            webSocketNetworkTransport$supervise$1.L$6 = null;
                            webSocketNetworkTransport$supervise$1.J$0 = j3;
                            webSocketNetworkTransport$supervise$1.label = 6;
                            if (channel.send(networkError, webSocketNetworkTransport$supervise$1) != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        objectRef7.element = webSocketNetworkTransport.protocolFactory.create((WebSocketConnection) obj3, webSocketNetworkTransport.listener, coroutineScope6);
                        T t4 = objectRef7.element;
                        Intrinsics.checkNotNull(t4);
                        webSocketNetworkTransport$supervise$1.L$0 = coroutineScope6;
                        webSocketNetworkTransport$supervise$1.L$1 = objectRef13;
                        webSocketNetworkTransport$supervise$1.L$2 = objectRef8;
                        webSocketNetworkTransport$supervise$1.L$3 = objectRef7;
                        webSocketNetworkTransport$supervise$1.L$4 = map;
                        webSocketNetworkTransport$supervise$1.L$5 = message3;
                        webSocketNetworkTransport$supervise$1.J$0 = j3;
                        webSocketNetworkTransport$supervise$1.label = 7;
                        break;
                    case 6:
                        j3 = webSocketNetworkTransport$supervise$1.J$0;
                        Map map9 = (Map) webSocketNetworkTransport$supervise$1.L$4;
                        Ref.ObjectRef objectRef37 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$3;
                        objectRef10 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$2;
                        objectRef11 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$1;
                        CoroutineScope coroutineScope11 = (CoroutineScope) webSocketNetworkTransport$supervise$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        linkedHashMap = map9;
                        objectRef = objectRef37;
                        coroutineScope2 = coroutineScope11;
                        j = j3;
                        objectRef2 = objectRef10;
                        webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$1;
                        objectRef3 = objectRef11;
                        i3 = 1;
                        obj4 = null;
                        Channel<Message> channel222222222 = webSocketNetworkTransport.messages;
                        webSocketNetworkTransport$supervise$12.L$0 = coroutineScope2;
                        webSocketNetworkTransport$supervise$12.L$1 = objectRef3;
                        webSocketNetworkTransport$supervise$12.L$2 = objectRef2;
                        webSocketNetworkTransport$supervise$12.L$3 = objectRef;
                        webSocketNetworkTransport$supervise$12.L$4 = linkedHashMap;
                        webSocketNetworkTransport$supervise$12.L$5 = obj4;
                        webSocketNetworkTransport$supervise$12.J$0 = j;
                        webSocketNetworkTransport$supervise$12.label = i3;
                        receive = channel222222222.receive(webSocketNetworkTransport$supervise$12);
                        if (receive != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 7:
                        j3 = webSocketNetworkTransport$supervise$1.J$0;
                        message3 = (Message) webSocketNetworkTransport$supervise$1.L$5;
                        map = (Map) webSocketNetworkTransport$supervise$1.L$4;
                        objectRef7 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$3;
                        objectRef8 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$2;
                        objectRef13 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$1;
                        coroutineScope6 = (CoroutineScope) webSocketNetworkTransport$supervise$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj3);
                        } catch (Exception e6) {
                            e = e6;
                            T t5 = 0;
                            Map map10 = map;
                            Ref.ObjectRef objectRef38 = objectRef7;
                            Ref.ObjectRef objectRef39 = objectRef8;
                            objectRef14 = objectRef13;
                            objectRef38.element = t5;
                            Channel<Message> channel5 = webSocketNetworkTransport.messages;
                            NetworkError networkError2 = new NetworkError(e);
                            webSocketNetworkTransport$supervise$1.L$0 = coroutineScope6;
                            webSocketNetworkTransport$supervise$1.L$1 = objectRef14;
                            webSocketNetworkTransport$supervise$1.L$2 = objectRef39;
                            webSocketNetworkTransport$supervise$1.L$3 = objectRef38;
                            webSocketNetworkTransport$supervise$1.L$4 = map10;
                            webSocketNetworkTransport$supervise$1.L$5 = t5;
                            webSocketNetworkTransport$supervise$1.J$0 = j3;
                            webSocketNetworkTransport$supervise$1.label = 8;
                            if (channel5.send(networkError2, webSocketNetworkTransport$supervise$1) != coroutine_suspended) {
                                coroutineScope2 = coroutineScope6;
                                j = j3;
                                objectRef2 = objectRef39;
                                webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$1;
                                linkedHashMap = map10;
                                objectRef = objectRef38;
                                objectRef3 = objectRef14;
                                i3 = 1;
                                obj4 = null;
                                Channel<Message> channel2222222222 = webSocketNetworkTransport.messages;
                                webSocketNetworkTransport$supervise$12.L$0 = coroutineScope2;
                                webSocketNetworkTransport$supervise$12.L$1 = objectRef3;
                                webSocketNetworkTransport$supervise$12.L$2 = objectRef2;
                                webSocketNetworkTransport$supervise$12.L$3 = objectRef;
                                webSocketNetworkTransport$supervise$12.L$4 = linkedHashMap;
                                webSocketNetworkTransport$supervise$12.L$5 = obj4;
                                webSocketNetworkTransport$supervise$12.J$0 = j;
                                webSocketNetworkTransport$supervise$12.label = i3;
                                receive = channel2222222222.receive(webSocketNetworkTransport$supervise$12);
                                if (receive != coroutine_suspended) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        Map map11 = map;
                        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, CoroutineStart.UNDISPATCHED, new WebSocketNetworkTransport$supervise$3(objectRef7, null), 1, null);
                        objectRef8.element = launch$default;
                        Message message5 = message3;
                        map3 = map11;
                        message4 = message5;
                        objectRef17 = objectRef7;
                        objectRef16 = objectRef8;
                        objectRef15 = objectRef13;
                        coroutineScope7 = coroutineScope6;
                        command = (Command) message4;
                        if (command instanceof StartOperation) {
                        }
                        WebSocketNetworkTransport$supervise$1 webSocketNetworkTransport$supervise$132 = webSocketNetworkTransport$supervise$1;
                        j = j3;
                        map4 = map3;
                        Ref.ObjectRef objectRef232 = objectRef17;
                        Ref.ObjectRef objectRef242 = objectRef16;
                        Ref.ObjectRef objectRef252 = objectRef15;
                        CoroutineScope coroutineScope82 = coroutineScope7;
                        if (map4.isEmpty()) {
                        }
                        objectRef = objectRef232;
                        objectRef3 = objectRef252;
                        obj4 = obj2;
                        coroutineScope2 = coroutineScope82;
                        objectRef2 = objectRef242;
                        webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$132;
                        linkedHashMap = map4;
                        i3 = i2;
                        webSocketNetworkTransport = this;
                        Channel<Message> channel22222222222 = webSocketNetworkTransport.messages;
                        webSocketNetworkTransport$supervise$12.L$0 = coroutineScope2;
                        webSocketNetworkTransport$supervise$12.L$1 = objectRef3;
                        webSocketNetworkTransport$supervise$12.L$2 = objectRef2;
                        webSocketNetworkTransport$supervise$12.L$3 = objectRef;
                        webSocketNetworkTransport$supervise$12.L$4 = linkedHashMap;
                        webSocketNetworkTransport$supervise$12.L$5 = obj4;
                        webSocketNetworkTransport$supervise$12.J$0 = j;
                        webSocketNetworkTransport$supervise$12.label = i3;
                        receive = channel22222222222.receive(webSocketNetworkTransport$supervise$12);
                        if (receive != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 8:
                        long j9 = webSocketNetworkTransport$supervise$1.J$0;
                        Map map12 = (Map) webSocketNetworkTransport$supervise$1.L$4;
                        Ref.ObjectRef objectRef40 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$3;
                        Ref.ObjectRef objectRef41 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$2;
                        objectRef14 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$1;
                        CoroutineScope coroutineScope12 = (CoroutineScope) webSocketNetworkTransport$supervise$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        coroutineScope2 = coroutineScope12;
                        j = j9;
                        linkedHashMap = map12;
                        objectRef = objectRef40;
                        objectRef2 = objectRef41;
                        webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$1;
                        objectRef3 = objectRef14;
                        i3 = 1;
                        obj4 = null;
                        Channel<Message> channel222222222222 = webSocketNetworkTransport.messages;
                        webSocketNetworkTransport$supervise$12.L$0 = coroutineScope2;
                        webSocketNetworkTransport$supervise$12.L$1 = objectRef3;
                        webSocketNetworkTransport$supervise$12.L$2 = objectRef2;
                        webSocketNetworkTransport$supervise$12.L$3 = objectRef;
                        webSocketNetworkTransport$supervise$12.L$4 = linkedHashMap;
                        webSocketNetworkTransport$supervise$12.L$5 = obj4;
                        webSocketNetworkTransport$supervise$12.J$0 = j;
                        webSocketNetworkTransport$supervise$12.label = i3;
                        receive = channel222222222222.receive(webSocketNetworkTransport$supervise$12);
                        if (receive != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 9:
                        j3 = webSocketNetworkTransport$supervise$1.J$0;
                        map3 = (Map) webSocketNetworkTransport$supervise$1.L$4;
                        objectRef17 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$3;
                        objectRef16 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$2;
                        objectRef15 = (Ref.ObjectRef) webSocketNetworkTransport$supervise$1.L$1;
                        coroutineScope7 = (CoroutineScope) webSocketNetworkTransport$supervise$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        WebSocketNetworkTransport$supervise$1 webSocketNetworkTransport$supervise$1322 = webSocketNetworkTransport$supervise$1;
                        j = j3;
                        map4 = map3;
                        Ref.ObjectRef objectRef2322 = objectRef17;
                        Ref.ObjectRef objectRef2422 = objectRef16;
                        Ref.ObjectRef objectRef2522 = objectRef15;
                        CoroutineScope coroutineScope822 = coroutineScope7;
                        if (map4.isEmpty()) {
                        }
                        objectRef = objectRef2322;
                        objectRef3 = objectRef2522;
                        obj4 = obj2;
                        coroutineScope2 = coroutineScope822;
                        objectRef2 = objectRef2422;
                        webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$1322;
                        linkedHashMap = map4;
                        i3 = i2;
                        webSocketNetworkTransport = this;
                        Channel<Message> channel2222222222222 = webSocketNetworkTransport.messages;
                        webSocketNetworkTransport$supervise$12.L$0 = coroutineScope2;
                        webSocketNetworkTransport$supervise$12.L$1 = objectRef3;
                        webSocketNetworkTransport$supervise$12.L$2 = objectRef2;
                        webSocketNetworkTransport$supervise$12.L$3 = objectRef;
                        webSocketNetworkTransport$supervise$12.L$4 = linkedHashMap;
                        webSocketNetworkTransport$supervise$12.L$5 = obj4;
                        webSocketNetworkTransport$supervise$12.J$0 = j;
                        webSocketNetworkTransport$supervise$12.label = i3;
                        receive = channel2222222222222.receive(webSocketNetworkTransport$supervise$12);
                        if (receive != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        webSocketNetworkTransport$supervise$1 = new WebSocketNetworkTransport$supervise$1(webSocketNetworkTransport, continuation);
        Object obj32 = webSocketNetworkTransport$supervise$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i32 = 1;
        Object obj42 = null;
        switch (webSocketNetworkTransport$supervise$1.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void supervise$closeProtocol(Ref.ObjectRef<WsProtocol> objectRef, Ref.ObjectRef<Job> objectRef2, Ref.ObjectRef<Job> objectRef3) {
        WsProtocol wsProtocol = objectRef.element;
        if (wsProtocol != null) {
            wsProtocol.close();
        }
        objectRef.element = null;
        Job job = objectRef2.element;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        objectRef2.element = null;
        Job job2 = objectRef3.element;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        objectRef3.element = null;
    }

    @Override // com.apollographql.apollo.network.NetworkTransport
    public <D extends Operation.Data> Flow<ApolloResponse<D>> execute(final ApolloRequest<D> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        final DeferredJsonMerger deferredJsonMerger = new DeferredJsonMerger();
        final SharedFlow onSubscription = FlowKt.onSubscription(this.events, new WebSocketNetworkTransport$execute$1(this, request, null));
        final Flow transformWhile = FlowsKt.transformWhile(new Flow<Event>() { // from class: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Event> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, request), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ ApolloRequest $request$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2", f = "WebSocketNetworkTransport.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, ApolloRequest apolloRequest) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$request$inlined = apolloRequest;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Event event = (Event) obj;
                                if (Intrinsics.areEqual(event.getId(), this.$request$inlined.getRequestUuid().toString()) || event.getId() == null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }, new WebSocketNetworkTransport$execute$3(request, null));
        final Flow flow = new Flow<ApolloResponse<D>>() { // from class: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, request, deferredJsonMerger, this), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ DeferredJsonMerger $deferredJsonMerger$inlined;
                final /* synthetic */ ApolloRequest $request$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ WebSocketNetworkTransport this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1$2", f = "WebSocketNetworkTransport.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, ApolloRequest apolloRequest, DeferredJsonMerger deferredJsonMerger, WebSocketNetworkTransport webSocketNetworkTransport) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$request$inlined = apolloRequest;
                    this.$deferredJsonMerger$inlined = deferredJsonMerger;
                    this.this$0 = webSocketNetworkTransport;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    ApolloResponse errorResponse;
                    Pair pair;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Event event = (Event) obj;
                                if (event instanceof OperationResponse) {
                                    Map<String, ? extends Object> payload = ((OperationResponse) event).getPayload();
                                    ExecutionContext.Element element = this.$request$inlined.getExecutionContext().get(CustomScalarAdapters.INSTANCE);
                                    Intrinsics.checkNotNull(element);
                                    CustomScalarAdapters customScalarAdapters = (CustomScalarAdapters) element;
                                    if (DeferredJsonMergerKt.isDeferred(payload)) {
                                        pair = TuplesKt.to(this.$deferredJsonMerger$inlined.merge(payload), this.$deferredJsonMerger$inlined.getMergedFragmentIds());
                                    } else {
                                        pair = TuplesKt.to(payload, null);
                                    }
                                    errorResponse = Operations.toApolloResponse(JsonReaders.jsonReader((Map<String, ? extends Object>) ((Map) pair.component1())), this.$request$inlined.getOperation(), this.$request$inlined.getRequestUuid(), customScalarAdapters, (Set) pair.component2());
                                    if (!this.$deferredJsonMerger$inlined.getHasNext()) {
                                        this.$deferredJsonMerger$inlined.reset();
                                    }
                                } else if (event instanceof OperationError) {
                                    errorResponse = this.this$0.errorResponse(this.$request$inlined, new SubscriptionOperationException(this.$request$inlined.getOperation().name(), ((OperationError) event).getPayload()));
                                } else if (event instanceof NetworkError) {
                                    errorResponse = this.this$0.errorResponse(this.$request$inlined, new ApolloNetworkException("Network error while executing " + this.$request$inlined.getOperation().name(), ((NetworkError) event).getCause()));
                                } else {
                                    if (!(event instanceof ConnectionReEstablished) && !(event instanceof OperationComplete) && !(event instanceof GeneralError)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw new IllegalStateException(("Unexpected event " + event).toString());
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(errorResponse, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        return FlowKt.onCompletion(new Flow<ApolloResponse<D>>() { // from class: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, deferredJsonMerger), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ DeferredJsonMerger $deferredJsonMerger$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2", f = "WebSocketNetworkTransport.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, DeferredJsonMerger deferredJsonMerger) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$deferredJsonMerger$inlined = deferredJsonMerger;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (!this.$deferredJsonMerger$inlined.getIsEmptyPayload()) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }, new WebSocketNetworkTransport$execute$6(this, request, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends Operation.Data> ApolloResponse<D> errorResponse(ApolloRequest<D> request, ApolloException apolloException) {
        return new ApolloResponse.Builder(request.getOperation(), request.getRequestUuid()).exception(apolloException).isLast(true).build();
    }

    @Override // com.apollographql.apollo.network.NetworkTransport
    public void dispose() {
        this.messages.mo8997trySendJP2dKIU(Dispose.INSTANCE);
    }

    public final void closeConnection(Throwable reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.messages.mo8997trySendJP2dKIU(new NetworkError(reason));
    }

    /* compiled from: WebSocketNetworkTransport.kt */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0007J+\u0010\u0004\u001a\u00020\u00002\u001e\u0010\u0004\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007J\u0014\u0010\u001e\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001fJ\u0014\u0010\t\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001fJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012JF\u0010\u0013\u001a\u00020\u000029\u0010\u0013\u001a5\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0014¢\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020#R(\u0010\u0004\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000RC\u0010\u0013\u001a5\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001a¨\u0006$"}, d2 = {"Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport$Builder;", "", "<init>", "()V", "serverUrl", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/jvm/functions/Function1;", "headers", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "webSocketEngine", "Lcom/apollographql/apollo/network/ws/WebSocketEngine;", "idleTimeoutMillis", "", "Ljava/lang/Long;", "protocolFactory", "Lcom/apollographql/apollo/network/ws/WsProtocol$Factory;", "reopenWhen", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "attempt", "", "Lkotlin/jvm/functions/Function3;", "(Lkotlin/jvm/functions/Function1;)Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport$Builder;", "addHeader", "value", "addHeaders", "", "protocol", "(Lkotlin/jvm/functions/Function3;)Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport$Builder;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private List<HttpHeader> headers = new ArrayList();
        private Long idleTimeoutMillis;
        private WsProtocol.Factory protocolFactory;
        private Function3<? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> reopenWhen;
        private Function1<? super Continuation<? super String>, ? extends Object> serverUrl;
        private WebSocketEngine webSocketEngine;

        public final Builder serverUrl(String serverUrl) {
            Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
            this.serverUrl = new WebSocketNetworkTransport$Builder$serverUrl$1$1(serverUrl, null);
            return this;
        }

        public final Builder serverUrl(Function1<? super Continuation<? super String>, ? extends Object> serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }

        public final Builder addHeader(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headers.add(new HttpHeader(name, value));
            return this;
        }

        public final Builder addHeaders(List<HttpHeader> headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.headers.addAll(headers);
            return this;
        }

        public final Builder headers(List<HttpHeader> headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.headers.clear();
            this.headers.addAll(headers);
            return this;
        }

        public final Builder webSocketEngine(WebSocketEngine webSocketEngine) {
            Intrinsics.checkNotNullParameter(webSocketEngine, "webSocketEngine");
            this.webSocketEngine = webSocketEngine;
            return this;
        }

        public final Builder idleTimeoutMillis(long idleTimeoutMillis) {
            this.idleTimeoutMillis = Long.valueOf(idleTimeoutMillis);
            return this;
        }

        public final Builder protocol(WsProtocol.Factory protocolFactory) {
            Intrinsics.checkNotNullParameter(protocolFactory, "protocolFactory");
            this.protocolFactory = protocolFactory;
            return this;
        }

        public final Builder reopenWhen(Function3<? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> reopenWhen) {
            this.reopenWhen = reopenWhen;
            return this;
        }

        public final WebSocketNetworkTransport build() {
            Function1<? super Continuation<? super String>, ? extends Object> function1 = this.serverUrl;
            if (function1 == null) {
                throw new IllegalStateException("No serverUrl specified".toString());
            }
            List<HttpHeader> list = this.headers;
            DefaultWebSocketEngine defaultWebSocketEngine = this.webSocketEngine;
            if (defaultWebSocketEngine == null) {
                defaultWebSocketEngine = new DefaultWebSocketEngine();
            }
            Long l = this.idleTimeoutMillis;
            long longValue = l != null ? l.longValue() : 60000L;
            SubscriptionWsProtocol.Factory factory = this.protocolFactory;
            if (factory == null) {
                factory = new SubscriptionWsProtocol.Factory(0L, null, null, 7, null);
            }
            return new WebSocketNetworkTransport(function1, list, defaultWebSocketEngine, longValue, factory, this.reopenWhen, null);
        }
    }
}
