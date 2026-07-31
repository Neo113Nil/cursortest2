package com.apollographql.apollo.network.ws;

import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.http.DefaultHttpRequestComposer;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import com.apollographql.apollo.api.json.JsonWriters;
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
import okio.Buffer;

/* compiled from: AppSyncWsProtocol.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fBO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012.\b\u0002\u0010\u0004\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fB7\b\u0016\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0011J\u000e\u0010\u0013\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J \u0010\u0016\u001a\u00020\u0014\"\b\b\u0000\u0010\u0017*\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00170\u001aH\u0016J \u0010\u001b\u001a\u00020\u0014\"\b\b\u0000\u0010\u0017*\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00170\u001aH\u0016J\u001e\u0010\u001c\u001a\u00020\u00142\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\u0004\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/apollographql/apollo/network/ws/AppSyncWsProtocol;", "Lcom/apollographql/apollo/network/ws/WsProtocol;", "connectionAcknowledgeTimeoutMs", "", "connectionPayload", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "", "webSocketConnection", "Lcom/apollographql/apollo/network/ws/WebSocketConnection;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;", "<init>", "(JLkotlin/jvm/functions/Function1;Lcom/apollographql/apollo/network/ws/WebSocketConnection;Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;)V", "authorization", "(Ljava/util/Map;JLcom/apollographql/apollo/network/ws/WebSocketConnection;Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;)V", "Lkotlin/jvm/functions/Function1;", "connectionInit", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startOperation", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "request", "Lcom/apollographql/apollo/api/ApolloRequest;", "stopOperation", "handleServerMessage", "messageMap", "Factory", "Companion", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppSyncWsProtocol extends WsProtocol {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Map<String, ? extends Object> authorization;
    private final long connectionAcknowledgeTimeoutMs;
    private final Function1<Continuation<? super Map<String, ? extends Object>>, Object> connectionPayload;

    /* compiled from: AppSyncWsProtocol.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo.network.ws.AppSyncWsProtocol$1", f = "AppSyncWsProtocol.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.apollographql.apollo.network.ws.AppSyncWsProtocol$1, reason: invalid class name */
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

    public /* synthetic */ AppSyncWsProtocol(long j, AnonymousClass1 anonymousClass1, WebSocketConnection webSocketConnection, WsProtocol.Listener listener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (Function1<? super Continuation<? super Map<String, ? extends Object>>, ? extends Object>) ((i & 2) != 0 ? new AnonymousClass1(null) : anonymousClass1), webSocketConnection, listener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppSyncWsProtocol(long j, Function1<? super Continuation<? super Map<String, ? extends Object>>, ? extends Object> connectionPayload, WebSocketConnection webSocketConnection, WsProtocol.Listener listener) {
        super(webSocketConnection, listener);
        Intrinsics.checkNotNullParameter(connectionPayload, "connectionPayload");
        Intrinsics.checkNotNullParameter(webSocketConnection, "webSocketConnection");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.connectionAcknowledgeTimeoutMs = j;
        this.connectionPayload = connectionPayload;
    }

    /* compiled from: AppSyncWsProtocol.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo.network.ws.AppSyncWsProtocol$2", f = "AppSyncWsProtocol.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.apollographql.apollo.network.ws.AppSyncWsProtocol$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Map<String, ? extends Object>>, Object> {
        final /* synthetic */ Map<String, Object> $authorization;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Map<String, ? extends Object> map, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$authorization = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass2(this.$authorization, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Map<String, ? extends Object>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return this.$authorization;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppSyncWsProtocol(Map<String, ? extends Object> authorization, long j, WebSocketConnection webSocketConnection, WsProtocol.Listener listener) {
        this(j, new AnonymousClass2(authorization, null), webSocketConnection, listener);
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(webSocketConnection, "webSocketConnection");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
        if (kotlinx.coroutines.TimeoutKt.withTimeout(r4, r7, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.apollographql.apollo.network.ws.WsProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object connectionInit(Continuation<? super Unit> continuation) {
        AppSyncWsProtocol$connectionInit$1 appSyncWsProtocol$connectionInit$1;
        int i;
        AppSyncWsProtocol appSyncWsProtocol;
        if (continuation instanceof AppSyncWsProtocol$connectionInit$1) {
            appSyncWsProtocol$connectionInit$1 = (AppSyncWsProtocol$connectionInit$1) continuation;
            if ((appSyncWsProtocol$connectionInit$1.label & Integer.MIN_VALUE) != 0) {
                appSyncWsProtocol$connectionInit$1.label -= Integer.MIN_VALUE;
                Object obj = appSyncWsProtocol$connectionInit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appSyncWsProtocol$connectionInit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    sendMessageMapText(MapsKt.mutableMapOf(TuplesKt.to("type", "connection_init")));
                    Function1<Continuation<? super Map<String, ? extends Object>>, Object> function1 = this.connectionPayload;
                    appSyncWsProtocol$connectionInit$1.L$0 = this;
                    appSyncWsProtocol$connectionInit$1.label = 1;
                    obj = function1.invoke(appSyncWsProtocol$connectionInit$1);
                    if (obj != coroutine_suspended) {
                        appSyncWsProtocol = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                appSyncWsProtocol = (AppSyncWsProtocol) appSyncWsProtocol$connectionInit$1.L$0;
                ResultKt.throwOnFailure(obj);
                appSyncWsProtocol.authorization = (Map) obj;
                long j = this.connectionAcknowledgeTimeoutMs;
                AppSyncWsProtocol$connectionInit$2 appSyncWsProtocol$connectionInit$2 = new AppSyncWsProtocol$connectionInit$2(this, null);
                appSyncWsProtocol$connectionInit$1.L$0 = null;
                appSyncWsProtocol$connectionInit$1.label = 2;
            }
        }
        appSyncWsProtocol$connectionInit$1 = new AppSyncWsProtocol$connectionInit$1(this, continuation);
        Object obj2 = appSyncWsProtocol$connectionInit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appSyncWsProtocol$connectionInit$1.label;
        if (i != 0) {
        }
        appSyncWsProtocol.authorization = (Map) obj2;
        long j2 = this.connectionAcknowledgeTimeoutMs;
        AppSyncWsProtocol$connectionInit$2 appSyncWsProtocol$connectionInit$22 = new AppSyncWsProtocol$connectionInit$2(this, null);
        appSyncWsProtocol$connectionInit$1.L$0 = null;
        appSyncWsProtocol$connectionInit$1.label = 2;
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public <D extends Operation.Data> void startOperation(ApolloRequest<D> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        sendMessageMapText(MapsKt.mapOf(TuplesKt.to("type", "start"), TuplesKt.to("id", request.getRequestUuid().toString()), TuplesKt.to("payload", MapsKt.mapOf(TuplesKt.to("data", Adapters.m9325toJson$default(Adapters.NullableAnyAdapter, DefaultHttpRequestComposer.INSTANCE.composePayload(request), null, null, 6, null)), TuplesKt.to("extensions", MapsKt.mapOf(TuplesKt.to("authorization", this.authorization)))))));
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public <D extends Operation.Data> void stopOperation(ApolloRequest<D> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        sendMessageMapText(MapsKt.mapOf(TuplesKt.to("type", "stop"), TuplesKt.to("id", request.getRequestUuid().toString())));
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
        if (!Intrinsics.areEqual(obj, NotificationStatuses.COMPLETE_STATUS)) {
            Intrinsics.areEqual(obj, "ka");
            return;
        }
        WsProtocol.Listener listener2 = getListener();
        Object obj5 = messageMap.get("id");
        Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
        listener2.operationComplete((String) obj5);
    }

    /* compiled from: AppSyncWsProtocol.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012.\b\u0002\u0010\u0004\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0004\b\n\u0010\u000bB)\b\u0016\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\rJ \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\u0004\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/apollographql/apollo/network/ws/AppSyncWsProtocol$Factory;", "Lcom/apollographql/apollo/network/ws/WsProtocol$Factory;", "connectionAcknowledgeTimeoutMs", "", "connectionPayload", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "", "<init>", "(JLkotlin/jvm/functions/Function1;)V", "authorization", "(Ljava/util/Map;J)V", "Lkotlin/jvm/functions/Function1;", "name", "getName", "()Ljava/lang/String;", "create", "Lcom/apollographql/apollo/network/ws/WsProtocol;", "webSocketConnection", "Lcom/apollographql/apollo/network/ws/WebSocketConnection;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements WsProtocol.Factory {
        private final long connectionAcknowledgeTimeoutMs;
        private final Function1<Continuation<? super Map<String, ? extends Object>>, Object> connectionPayload;

        public Factory() {
            this(0L, (Function1) null, 3, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(long j, Function1<? super Continuation<? super Map<String, ? extends Object>>, ? extends Object> connectionPayload) {
            Intrinsics.checkNotNullParameter(connectionPayload, "connectionPayload");
            this.connectionAcknowledgeTimeoutMs = j;
            this.connectionPayload = connectionPayload;
        }

        /* compiled from: AppSyncWsProtocol.kt */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.apollographql.apollo.network.ws.AppSyncWsProtocol$Factory$1", f = "AppSyncWsProtocol.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.apollographql.apollo.network.ws.AppSyncWsProtocol$Factory$1, reason: invalid class name */
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

        public /* synthetic */ Factory(long j, AnonymousClass1 anonymousClass1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 10000L : j, (Function1<? super Continuation<? super Map<String, ? extends Object>>, ? extends Object>) ((i & 2) != 0 ? new AnonymousClass1(null) : anonymousClass1));
        }

        public /* synthetic */ Factory(Map map, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((Map<String, ? extends Object>) map, (i & 2) != 0 ? 10000L : j);
        }

        /* compiled from: AppSyncWsProtocol.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.apollographql.apollo.network.ws.AppSyncWsProtocol$Factory$2", f = "AppSyncWsProtocol.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.apollographql.apollo.network.ws.AppSyncWsProtocol$Factory$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Map<String, ? extends Object>>, Object> {
            final /* synthetic */ Map<String, Object> $authorization;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Map<String, ? extends Object> map, Continuation<? super AnonymousClass2> continuation) {
                super(1, continuation);
                this.$authorization = map;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass2(this.$authorization, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Map<String, ? extends Object>> continuation) {
                return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return this.$authorization;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Factory(Map<String, ? extends Object> authorization, long j) {
            this(j, new AnonymousClass2(authorization, null));
            Intrinsics.checkNotNullParameter(authorization, "authorization");
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
            return new AppSyncWsProtocol(this.connectionAcknowledgeTimeoutMs, this.connectionPayload, webSocketConnection, listener);
        }
    }

    /* compiled from: AppSyncWsProtocol.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bJ\u001a\u0010\n\u001a\u00020\u0005*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH\u0002¨\u0006\u000b"}, d2 = {"Lcom/apollographql/apollo/network/ws/AppSyncWsProtocol$Companion;", "", "<init>", "()V", "buildUrl", "", "baseUrl", "authorization", "", "payload", "base64Encode", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ String buildUrl$default(Companion companion, String str, Map map, Map map2, int i, Object obj) {
            if ((i & 4) != 0) {
                map2 = MapsKt.emptyMap();
            }
            return companion.buildUrl(str, map, map2);
        }

        public final String buildUrl(String baseUrl, Map<String, ? extends Object> authorization, Map<String, ? extends Object> payload) {
            Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
            Intrinsics.checkNotNullParameter(authorization, "authorization");
            Intrinsics.checkNotNullParameter(payload, "payload");
            return DefaultHttpRequestComposer.INSTANCE.appendQueryParameters(baseUrl, MapsKt.mapOf(TuplesKt.to("header", base64Encode(authorization)), TuplesKt.to("payload", base64Encode(payload))));
        }

        private final String base64Encode(Map<String, ? extends Object> map) {
            Buffer buffer = new Buffer();
            JsonWriters.writeAny(new BufferedSinkJsonWriter(buffer, null), map);
            return buffer.readByteString().base64();
        }
    }
}
