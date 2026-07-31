package com.apollographql.apollo.network.ws;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.http.DefaultHttpRequestComposer;
import com.apollographql.apollo.network.ws.WsProtocol;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.intercom.android.sdk.NotificationStatuses;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SubscriptionWsProtocol.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001eB]\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012.\b\u0002\u0010\b\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0013\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u001e\u0010\u0016\u001a\u00020\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH\u0016J \u0010\u0018\u001a\u00020\u0014\"\b\b\u0000\u0010\u0019*\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001cH\u0016J \u0010\u001d\u001a\u00020\u0014\"\b\b\u0000\u0010\u0019*\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001cH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\b\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/apollographql/apollo/network/ws/SubscriptionWsProtocol;", "Lcom/apollographql/apollo/network/ws/WsProtocol;", "webSocketConnection", "Lcom/apollographql/apollo/network/ws/WebSocketConnection;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;", "connectionAcknowledgeTimeoutMs", "", "connectionPayload", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "", "frameType", "Lcom/apollographql/apollo/network/ws/WsFrameType;", "<init>", "(Lcom/apollographql/apollo/network/ws/WebSocketConnection;Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;JLkotlin/jvm/functions/Function1;Lcom/apollographql/apollo/network/ws/WsFrameType;)V", "Lkotlin/jvm/functions/Function1;", "connectionInit", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleServerMessage", "messageMap", "startOperation", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "request", "Lcom/apollographql/apollo/api/ApolloRequest;", "stopOperation", "Factory", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionWsProtocol extends WsProtocol {
    private final long connectionAcknowledgeTimeoutMs;
    private final Function1<Continuation<? super Map<String, ? extends Object>>, Object> connectionPayload;
    private final WsFrameType frameType;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriptionWsProtocol(WebSocketConnection webSocketConnection, WsProtocol.Listener listener) {
        this(webSocketConnection, listener, 0L, null, null, 28, null);
        Intrinsics.checkNotNullParameter(webSocketConnection, "webSocketConnection");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriptionWsProtocol(WebSocketConnection webSocketConnection, WsProtocol.Listener listener, long j) {
        this(webSocketConnection, listener, j, null, null, 24, null);
        Intrinsics.checkNotNullParameter(webSocketConnection, "webSocketConnection");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriptionWsProtocol(WebSocketConnection webSocketConnection, WsProtocol.Listener listener, long j, Function1<? super Continuation<? super Map<String, ? extends Object>>, ? extends Object> connectionPayload) {
        this(webSocketConnection, listener, j, connectionPayload, null, 16, null);
        Intrinsics.checkNotNullParameter(webSocketConnection, "webSocketConnection");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(connectionPayload, "connectionPayload");
    }

    /* compiled from: SubscriptionWsProtocol.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo.network.ws.SubscriptionWsProtocol$1", f = "SubscriptionWsProtocol.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.apollographql.apollo.network.ws.SubscriptionWsProtocol$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return null;
        }
    }

    public /* synthetic */ SubscriptionWsProtocol(WebSocketConnection webSocketConnection, WsProtocol.Listener listener, long j, AnonymousClass1 anonymousClass1, WsFrameType wsFrameType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(webSocketConnection, listener, (i & 4) != 0 ? 10000L : j, (i & 8) != 0 ? new AnonymousClass1(null) : anonymousClass1, (i & 16) != 0 ? WsFrameType.Text : wsFrameType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionWsProtocol(WebSocketConnection webSocketConnection, WsProtocol.Listener listener, long j, Function1<? super Continuation<? super Map<String, ? extends Object>>, ? extends Object> connectionPayload, WsFrameType frameType) {
        super(webSocketConnection, listener);
        Intrinsics.checkNotNullParameter(webSocketConnection, "webSocketConnection");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(connectionPayload, "connectionPayload");
        Intrinsics.checkNotNullParameter(frameType, "frameType");
        this.connectionAcknowledgeTimeoutMs = j;
        this.connectionPayload = connectionPayload;
        this.frameType = frameType;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (kotlinx.coroutines.TimeoutKt.withTimeout(r4, r7, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.apollographql.apollo.network.ws.WsProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object connectionInit(Continuation<? super Unit> continuation) {
        SubscriptionWsProtocol$connectionInit$1 subscriptionWsProtocol$connectionInit$1;
        int i;
        Map<String, ? extends Object> mutableMapOf;
        Map map;
        if (continuation instanceof SubscriptionWsProtocol$connectionInit$1) {
            subscriptionWsProtocol$connectionInit$1 = (SubscriptionWsProtocol$connectionInit$1) continuation;
            if ((subscriptionWsProtocol$connectionInit$1.label & Integer.MIN_VALUE) != 0) {
                subscriptionWsProtocol$connectionInit$1.label -= Integer.MIN_VALUE;
                Object obj = subscriptionWsProtocol$connectionInit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = subscriptionWsProtocol$connectionInit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("type", "connection_init"));
                    Function1<Continuation<? super Map<String, ? extends Object>>, Object> function1 = this.connectionPayload;
                    subscriptionWsProtocol$connectionInit$1.L$0 = mutableMapOf;
                    subscriptionWsProtocol$connectionInit$1.label = 1;
                    obj = function1.invoke(subscriptionWsProtocol$connectionInit$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    mutableMapOf = (Map) subscriptionWsProtocol$connectionInit$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                map = (Map) obj;
                if (map != null) {
                    mutableMapOf.put("payload", map);
                }
                sendMessageMap(mutableMapOf, this.frameType);
                long j = this.connectionAcknowledgeTimeoutMs;
                SubscriptionWsProtocol$connectionInit$2 subscriptionWsProtocol$connectionInit$2 = new SubscriptionWsProtocol$connectionInit$2(this, null);
                subscriptionWsProtocol$connectionInit$1.L$0 = null;
                subscriptionWsProtocol$connectionInit$1.label = 2;
            }
        }
        subscriptionWsProtocol$connectionInit$1 = new SubscriptionWsProtocol$connectionInit$1(this, continuation);
        Object obj2 = subscriptionWsProtocol$connectionInit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = subscriptionWsProtocol$connectionInit$1.label;
        if (i != 0) {
        }
        map = (Map) obj2;
        if (map != null) {
        }
        sendMessageMap(mutableMapOf, this.frameType);
        long j2 = this.connectionAcknowledgeTimeoutMs;
        SubscriptionWsProtocol$connectionInit$2 subscriptionWsProtocol$connectionInit$22 = new SubscriptionWsProtocol$connectionInit$2(this, null);
        subscriptionWsProtocol$connectionInit$1.L$0 = null;
        subscriptionWsProtocol$connectionInit$1.label = 2;
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public void handleServerMessage(Map<String, ? extends Object> messageMap) {
        Intrinsics.checkNotNullParameter(messageMap, "messageMap");
        Object obj = messageMap.get("type");
        if (Intrinsics.areEqual(obj, "data")) {
            WsProtocol.Listener listener = getListener();
            Object obj2 = messageMap.get("id");
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = messageMap.get("payload");
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            listener.operationResponse((String) obj2, (Map) obj3);
            return;
        }
        if (Intrinsics.areEqual(obj, "error")) {
            Object obj4 = messageMap.get("id");
            if (obj4 instanceof String) {
                getListener().operationError((String) obj4, (Map) messageMap.get("payload"));
                return;
            } else {
                getListener().generalError((Map) messageMap.get("payload"));
                return;
            }
        }
        if (Intrinsics.areEqual(obj, NotificationStatuses.COMPLETE_STATUS)) {
            WsProtocol.Listener listener2 = getListener();
            Object obj5 = messageMap.get("id");
            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
            listener2.operationComplete((String) obj5);
        }
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public <D extends Operation.Data> void startOperation(ApolloRequest<D> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        sendMessageMap(MapsKt.mapOf(TuplesKt.to("type", "start"), TuplesKt.to("id", request.getRequestUuid().toString()), TuplesKt.to("payload", DefaultHttpRequestComposer.INSTANCE.composePayload(request))), this.frameType);
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public <D extends Operation.Data> void stopOperation(ApolloRequest<D> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        sendMessageMap(MapsKt.mapOf(TuplesKt.to("type", "stop"), TuplesKt.to("id", request.getRequestUuid().toString())), this.frameType);
    }

    /* compiled from: SubscriptionWsProtocol.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BM\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012.\b\u0002\u0010\u0004\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\u0004\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/apollographql/apollo/network/ws/SubscriptionWsProtocol$Factory;", "Lcom/apollographql/apollo/network/ws/WsProtocol$Factory;", "connectionAcknowledgeTimeoutMs", "", "connectionPayload", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "", "frameType", "Lcom/apollographql/apollo/network/ws/WsFrameType;", "<init>", "(JLkotlin/jvm/functions/Function1;Lcom/apollographql/apollo/network/ws/WsFrameType;)V", "Lkotlin/jvm/functions/Function1;", "name", "getName", "()Ljava/lang/String;", "create", "Lcom/apollographql/apollo/network/ws/WsProtocol;", "webSocketConnection", "Lcom/apollographql/apollo/network/ws/WebSocketConnection;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements WsProtocol.Factory {
        private final long connectionAcknowledgeTimeoutMs;
        private final Function1<Continuation<? super Map<String, ? extends Object>>, Object> connectionPayload;
        private final WsFrameType frameType;

        public Factory() {
            this(0L, null, null, 7, null);
        }

        public Factory(long j) {
            this(j, null, null, 6, null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Factory(long j, Function1<? super Continuation<? super Map<String, ? extends Object>>, ? extends Object> connectionPayload) {
            this(j, connectionPayload, null, 4, null);
            Intrinsics.checkNotNullParameter(connectionPayload, "connectionPayload");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(long j, Function1<? super Continuation<? super Map<String, ? extends Object>>, ? extends Object> connectionPayload, WsFrameType frameType) {
            Intrinsics.checkNotNullParameter(connectionPayload, "connectionPayload");
            Intrinsics.checkNotNullParameter(frameType, "frameType");
            this.connectionAcknowledgeTimeoutMs = j;
            this.connectionPayload = connectionPayload;
            this.frameType = frameType;
        }

        /* compiled from: SubscriptionWsProtocol.kt */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.apollographql.apollo.network.ws.SubscriptionWsProtocol$Factory$1", f = "SubscriptionWsProtocol.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.apollographql.apollo.network.ws.SubscriptionWsProtocol$Factory$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation, Object> {
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return null;
            }
        }

        public /* synthetic */ Factory(long j, AnonymousClass1 anonymousClass1, WsFrameType wsFrameType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 10000L : j, (i & 2) != 0 ? new AnonymousClass1(null) : anonymousClass1, (i & 4) != 0 ? WsFrameType.Text : wsFrameType);
        }

        @Override // com.apollographql.apollo.network.ws.WsProtocol.Factory
        public String getName() {
            return "graphql-ws";
        }

        @Override // com.apollographql.apollo.network.ws.WsProtocol.Factory
        public WsProtocol create(WebSocketConnection webSocketConnection, WsProtocol.Listener listener, CoroutineScope scope) {
            Intrinsics.checkNotNullParameter(webSocketConnection, "webSocketConnection");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(scope, "scope");
            return new SubscriptionWsProtocol(webSocketConnection, listener, this.connectionAcknowledgeTimeoutMs, this.connectionPayload, this.frameType);
        }
    }
}
