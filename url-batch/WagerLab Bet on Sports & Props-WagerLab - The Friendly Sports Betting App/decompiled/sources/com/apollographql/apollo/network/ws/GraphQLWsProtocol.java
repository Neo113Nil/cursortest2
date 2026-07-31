package com.apollographql.apollo.network.ws;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.http.DefaultWebSocketPayloadComposer;
import com.apollographql.apollo.api.http.WebSocketPayloadComposer;
import com.apollographql.apollo.network.ws.WsProtocol;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.intercom.android.sdk.NotificationStatuses;
import java.util.Map;
import kotlin.Deprecated;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GraphQLWsProtocol.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001(B¥\u0001\b\u0000\u0012.\b\u0002\u0010\u0002\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018B\u009d\u0001\b\u0017\u0012.\b\u0002\u0010\u0002\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0019J\u000e\u0010\u001b\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ \u0010\u001e\u001a\u00020\u001c\"\b\b\u0000\u0010\u001f*\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001f0\"H\u0016J \u0010#\u001a\u00020\u001c\"\b\b\u0000\u0010\u001f*\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001f0\"H\u0016J\u000e\u0010$\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ\u001e\u0010%\u001a\u00020\u001c2\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0016J\b\u0010'\u001a\u00020\u001cH\u0002R6\u0010\u0002\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/apollographql/apollo/network/ws/GraphQLWsProtocol;", "Lcom/apollographql/apollo/network/ws/WsProtocol;", "connectionPayload", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "", "pingPayload", "pongPayload", "connectionAcknowledgeTimeoutMs", "", "pingIntervalMillis", "frameType", "Lcom/apollographql/apollo/network/ws/WsFrameType;", "webSocketConnection", "Lcom/apollographql/apollo/network/ws/WebSocketConnection;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "webSocketPayloadComposer", "Lcom/apollographql/apollo/api/http/WebSocketPayloadComposer;", "<init>", "(Lkotlin/jvm/functions/Function1;Ljava/util/Map;Ljava/util/Map;JJLcom/apollographql/apollo/network/ws/WsFrameType;Lcom/apollographql/apollo/network/ws/WebSocketConnection;Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;Lkotlinx/coroutines/CoroutineScope;Lcom/apollographql/apollo/api/http/WebSocketPayloadComposer;)V", "(Lkotlin/jvm/functions/Function1;Ljava/util/Map;Ljava/util/Map;JJLcom/apollographql/apollo/network/ws/WsFrameType;Lcom/apollographql/apollo/network/ws/WebSocketConnection;Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;Lkotlinx/coroutines/CoroutineScope;)V", "Lkotlin/jvm/functions/Function1;", "connectionInit", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startOperation", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "request", "Lcom/apollographql/apollo/api/ApolloRequest;", "stopOperation", "run", "handleServerMessage", "messageMap", "sendPong", "Factory", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GraphQLWsProtocol extends WsProtocol {
    private final long connectionAcknowledgeTimeoutMs;
    private final Function1<Continuation<? super Map<String, ? extends Object>>, Object> connectionPayload;
    private final WsFrameType frameType;
    private final long pingIntervalMillis;
    private final Map<String, Object> pingPayload;
    private final Map<String, Object> pongPayload;
    private final CoroutineScope scope;
    private final WebSocketPayloadComposer webSocketPayloadComposer;

    /* compiled from: GraphQLWsProtocol.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo.network.ws.GraphQLWsProtocol$1", f = "GraphQLWsProtocol.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.apollographql.apollo.network.ws.GraphQLWsProtocol$1, reason: invalid class name */
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

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GraphQLWsProtocol(kotlin.jvm.functions.Function1 r2, java.util.Map r3, java.util.Map r4, long r5, long r7, com.apollographql.apollo.network.ws.WsFrameType r9, com.apollographql.apollo.network.ws.WebSocketConnection r10, com.apollographql.apollo.network.ws.WsProtocol.Listener r11, kotlinx.coroutines.CoroutineScope r12, com.apollographql.apollo.api.http.WebSocketPayloadComposer r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r1 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto Lc
            com.apollographql.apollo.network.ws.GraphQLWsProtocol$1 r2 = new com.apollographql.apollo.network.ws.GraphQLWsProtocol$1
            r2.<init>(r0)
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
        Lc:
            r15 = r14 & 2
            if (r15 == 0) goto L11
            r3 = r0
        L11:
            r14 = r14 & 4
            if (r14 == 0) goto L21
            r14 = r12
            r15 = r13
            r12 = r10
            r13 = r11
            r11 = r9
            r9 = r7
            r7 = r5
            r6 = r0
            r4 = r2
            r5 = r3
            r3 = r1
            goto L2c
        L21:
            r14 = r12
            r15 = r13
            r12 = r10
            r13 = r11
            r11 = r9
            r9 = r7
            r7 = r5
            r6 = r4
            r5 = r3
            r3 = r1
            r4 = r2
        L2c:
            r3.<init>(r4, r5, r6, r7, r9, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.ws.GraphQLWsProtocol.<init>(kotlin.jvm.functions.Function1, java.util.Map, java.util.Map, long, long, com.apollographql.apollo.network.ws.WsFrameType, com.apollographql.apollo.network.ws.WebSocketConnection, com.apollographql.apollo.network.ws.WsProtocol$Listener, kotlinx.coroutines.CoroutineScope, com.apollographql.apollo.api.http.WebSocketPayloadComposer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GraphQLWsProtocol(Function1<? super Continuation<? super Map<String, ? extends Object>>, ? extends Object> connectionPayload, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, long j, long j2, WsFrameType frameType, WebSocketConnection webSocketConnection, WsProtocol.Listener listener, CoroutineScope scope, WebSocketPayloadComposer webSocketPayloadComposer) {
        super(webSocketConnection, listener);
        Intrinsics.checkNotNullParameter(connectionPayload, "connectionPayload");
        Intrinsics.checkNotNullParameter(frameType, "frameType");
        Intrinsics.checkNotNullParameter(webSocketConnection, "webSocketConnection");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(webSocketPayloadComposer, "webSocketPayloadComposer");
        this.connectionPayload = connectionPayload;
        this.pingPayload = map;
        this.pongPayload = map2;
        this.connectionAcknowledgeTimeoutMs = j;
        this.pingIntervalMillis = j2;
        this.frameType = frameType;
        this.scope = scope;
        this.webSocketPayloadComposer = webSocketPayloadComposer;
    }

    /* compiled from: GraphQLWsProtocol.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo.network.ws.GraphQLWsProtocol$2", f = "GraphQLWsProtocol.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.apollographql.apollo.network.ws.GraphQLWsProtocol$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
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

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GraphQLWsProtocol(kotlin.jvm.functions.Function1 r2, java.util.Map r3, java.util.Map r4, long r5, long r7, com.apollographql.apollo.network.ws.WsFrameType r9, com.apollographql.apollo.network.ws.WebSocketConnection r10, com.apollographql.apollo.network.ws.WsProtocol.Listener r11, kotlinx.coroutines.CoroutineScope r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r1 = this;
            r14 = r13 & 1
            r0 = 0
            if (r14 == 0) goto Lc
            com.apollographql.apollo.network.ws.GraphQLWsProtocol$2 r2 = new com.apollographql.apollo.network.ws.GraphQLWsProtocol$2
            r2.<init>(r0)
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
        Lc:
            r14 = r13 & 2
            if (r14 == 0) goto L11
            r3 = r0
        L11:
            r13 = r13 & 4
            if (r13 == 0) goto L20
            r13 = r11
            r14 = r12
            r11 = r9
            r12 = r10
            r9 = r7
            r7 = r5
            r6 = r0
            r4 = r2
            r5 = r3
            r3 = r1
            goto L2a
        L20:
            r13 = r11
            r14 = r12
            r11 = r9
            r12 = r10
            r9 = r7
            r7 = r5
            r6 = r4
            r5 = r3
            r3 = r1
            r4 = r2
        L2a:
            r3.<init>(r4, r5, r6, r7, r9, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.ws.GraphQLWsProtocol.<init>(kotlin.jvm.functions.Function1, java.util.Map, java.util.Map, long, long, com.apollographql.apollo.network.ws.WsFrameType, com.apollographql.apollo.network.ws.WebSocketConnection, com.apollographql.apollo.network.ws.WsProtocol$Listener, kotlinx.coroutines.CoroutineScope, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Use GraphQLWsProtocol.Factory instead")
    public GraphQLWsProtocol(Function1<? super Continuation<? super Map<String, ? extends Object>>, ? extends Object> connectionPayload, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, long j, long j2, WsFrameType frameType, WebSocketConnection webSocketConnection, WsProtocol.Listener listener, CoroutineScope scope) {
        this(connectionPayload, map, map2, j, j2, frameType, webSocketConnection, listener, scope, new DefaultWebSocketPayloadComposer());
        Intrinsics.checkNotNullParameter(connectionPayload, "connectionPayload");
        Intrinsics.checkNotNullParameter(frameType, "frameType");
        Intrinsics.checkNotNullParameter(webSocketConnection, "webSocketConnection");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(scope, "scope");
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
        GraphQLWsProtocol$connectionInit$1 graphQLWsProtocol$connectionInit$1;
        int i;
        Map<String, ? extends Object> mutableMapOf;
        Map map;
        if (continuation instanceof GraphQLWsProtocol$connectionInit$1) {
            graphQLWsProtocol$connectionInit$1 = (GraphQLWsProtocol$connectionInit$1) continuation;
            if ((graphQLWsProtocol$connectionInit$1.label & Integer.MIN_VALUE) != 0) {
                graphQLWsProtocol$connectionInit$1.label -= Integer.MIN_VALUE;
                Object obj = graphQLWsProtocol$connectionInit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = graphQLWsProtocol$connectionInit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("type", "connection_init"));
                    Function1<Continuation<? super Map<String, ? extends Object>>, Object> function1 = this.connectionPayload;
                    graphQLWsProtocol$connectionInit$1.L$0 = mutableMapOf;
                    graphQLWsProtocol$connectionInit$1.label = 1;
                    obj = function1.invoke(graphQLWsProtocol$connectionInit$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    mutableMapOf = (Map) graphQLWsProtocol$connectionInit$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                map = (Map) obj;
                if (map != null) {
                    mutableMapOf.put("payload", map);
                }
                sendMessageMap(mutableMapOf, this.frameType);
                long j = this.connectionAcknowledgeTimeoutMs;
                GraphQLWsProtocol$connectionInit$2 graphQLWsProtocol$connectionInit$2 = new GraphQLWsProtocol$connectionInit$2(this, null);
                graphQLWsProtocol$connectionInit$1.L$0 = null;
                graphQLWsProtocol$connectionInit$1.label = 2;
            }
        }
        graphQLWsProtocol$connectionInit$1 = new GraphQLWsProtocol$connectionInit$1(this, continuation);
        Object obj2 = graphQLWsProtocol$connectionInit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = graphQLWsProtocol$connectionInit$1.label;
        if (i != 0) {
        }
        map = (Map) obj2;
        if (map != null) {
        }
        sendMessageMap(mutableMapOf, this.frameType);
        long j2 = this.connectionAcknowledgeTimeoutMs;
        GraphQLWsProtocol$connectionInit$2 graphQLWsProtocol$connectionInit$22 = new GraphQLWsProtocol$connectionInit$2(this, null);
        graphQLWsProtocol$connectionInit$1.L$0 = null;
        graphQLWsProtocol$connectionInit$1.label = 2;
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public <D extends Operation.Data> void startOperation(ApolloRequest<D> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        sendMessageMap(MapsKt.mapOf(TuplesKt.to("type", "subscribe"), TuplesKt.to("id", request.getRequestUuid().toString()), TuplesKt.to("payload", this.webSocketPayloadComposer.compose(request))), this.frameType);
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public <D extends Operation.Data> void stopOperation(ApolloRequest<D> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        sendMessageMap(MapsKt.mapOf(TuplesKt.to("type", NotificationStatuses.COMPLETE_STATUS), TuplesKt.to("id", request.getRequestUuid().toString())), this.frameType);
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public Object run(Continuation<? super Unit> continuation) {
        if (this.pingIntervalMillis > 0) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new GraphQLWsProtocol$run$2(this, null), 3, null);
        }
        Object run = super.run(continuation);
        return run == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? run : Unit.INSTANCE;
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public void handleServerMessage(Map<String, ? extends Object> messageMap) {
        Intrinsics.checkNotNullParameter(messageMap, "messageMap");
        Object obj = messageMap.get("type");
        if (Intrinsics.areEqual(obj, "next")) {
            WsProtocol.Listener listener = getListener();
            Object obj2 = messageMap.get("id");
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = messageMap.get("payload");
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            listener.operationResponse((String) obj2, (Map) obj3);
            return;
        }
        if (Intrinsics.areEqual(obj, "error")) {
            WsProtocol.Listener listener2 = getListener();
            Object obj4 = messageMap.get("id");
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
            listener2.operationResponse((String) obj4, MapsKt.mapOf(TuplesKt.to("errors", messageMap.get("payload"))));
            WsProtocol.Listener listener3 = getListener();
            Object obj5 = messageMap.get("id");
            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
            listener3.operationComplete((String) obj5);
            return;
        }
        if (Intrinsics.areEqual(obj, NotificationStatuses.COMPLETE_STATUS)) {
            WsProtocol.Listener listener4 = getListener();
            Object obj6 = messageMap.get("id");
            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.String");
            listener4.operationComplete((String) obj6);
            return;
        }
        if (Intrinsics.areEqual(obj, "ping")) {
            sendPong();
        } else {
            Intrinsics.areEqual(obj, "pong");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendPong() {
        Map<String, ? extends Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("type", "pong"));
        Map<String, Object> map = this.pongPayload;
        if (map != null) {
            mutableMapOf.put("payload", map);
        }
        sendMessageMap(mutableMapOf, this.frameType);
    }

    /* compiled from: GraphQLWsProtocol.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u008b\u0001\b\u0016\u0012.\b\u0002\u0010\u0004\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0007\u0012\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0002\u0010\u0011J9\u0010\u0004\u001a\u00020\u00162*\u0010\u0004\u001a&\b\u0001\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005H\u0007¢\u0006\u0002\u0010\u0017J\u0010\u0010\n\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\f\u001a\u00020\u00162\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0007H\u0007J \u0010\r\u001a\u00020\u00162\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0007H\u0007J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000bH\u0007J\u0010\u0010\u000f\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0014\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J \u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016R8\u0010\u0004\u001a*\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006$"}, d2 = {"Lcom/apollographql/apollo/network/ws/GraphQLWsProtocol$Factory;", "Lcom/apollographql/apollo/network/ws/WsProtocol$Factory;", "<init>", "()V", "connectionPayload", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "", "pingIntervalMillis", "", "pingPayload", "pongPayload", "connectionAcknowledgeTimeoutMs", "frameType", "Lcom/apollographql/apollo/network/ws/WsFrameType;", "(Lkotlin/jvm/functions/Function1;JLjava/util/Map;Ljava/util/Map;JLcom/apollographql/apollo/network/ws/WsFrameType;)V", "Lkotlin/jvm/functions/Function1;", "Ljava/lang/Long;", "webSocketPayloadComposer", "Lcom/apollographql/apollo/api/http/WebSocketPayloadComposer;", "", "(Lkotlin/jvm/functions/Function1;)V", "connectionAcknowledgeTimeoutMillis", "name", "getName", "()Ljava/lang/String;", "create", "Lcom/apollographql/apollo/network/ws/WsProtocol;", "webSocketConnection", "Lcom/apollographql/apollo/network/ws/WebSocketConnection;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements WsProtocol.Factory {
        private Long connectionAcknowledgeTimeoutMs;
        private Function1<? super Continuation<? super Map<String, ? extends Object>>, ? extends Object> connectionPayload;
        private WsFrameType frameType;
        private Long pingIntervalMillis;
        private Map<String, ? extends Object> pingPayload;
        private Map<String, ? extends Object> pongPayload;
        private WebSocketPayloadComposer webSocketPayloadComposer;

        public Factory() {
        }

        /* compiled from: GraphQLWsProtocol.kt */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.apollographql.apollo.network.ws.GraphQLWsProtocol$Factory$1", f = "GraphQLWsProtocol.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.apollographql.apollo.network.ws.GraphQLWsProtocol$Factory$1, reason: invalid class name */
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

        public /* synthetic */ Factory(AnonymousClass1 anonymousClass1, long j, Map map, Map map2, long j2, WsFrameType wsFrameType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new AnonymousClass1(null) : anonymousClass1, (i & 2) != 0 ? -1L : j, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : map2, (i & 16) != 0 ? 10000L : j2, (i & 32) != 0 ? WsFrameType.Text : wsFrameType);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Factory(Function1<? super Continuation<? super Map<String, ? extends Object>>, ? extends Object> connectionPayload, long j, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, long j2, WsFrameType frameType) {
            this();
            Intrinsics.checkNotNullParameter(connectionPayload, "connectionPayload");
            Intrinsics.checkNotNullParameter(frameType, "frameType");
            this.connectionPayload = connectionPayload;
            this.pingIntervalMillis = Long.valueOf(j);
            this.pingPayload = map;
            this.pongPayload = map2;
            this.connectionAcknowledgeTimeoutMs = Long.valueOf(j2);
            this.frameType = frameType;
        }

        public final void connectionPayload(Function1<? super Continuation<? super Map<String, ? extends Object>>, ? extends Object> connectionPayload) {
            Intrinsics.checkNotNullParameter(connectionPayload, "connectionPayload");
            this.connectionPayload = connectionPayload;
        }

        public final void pingIntervalMillis(long pingIntervalMillis) {
            this.pingIntervalMillis = Long.valueOf(pingIntervalMillis);
        }

        public final void pingPayload(Map<String, ? extends Object> pingPayload) {
            this.pingPayload = pingPayload;
        }

        public final void pongPayload(Map<String, ? extends Object> pongPayload) {
            this.pongPayload = pongPayload;
        }

        public final void connectionAcknowledgeTimeoutMillis(long connectionAcknowledgeTimeoutMillis) {
            this.connectionAcknowledgeTimeoutMs = Long.valueOf(connectionAcknowledgeTimeoutMillis);
        }

        public final void frameType(WsFrameType frameType) {
            Intrinsics.checkNotNullParameter(frameType, "frameType");
            this.frameType = frameType;
        }

        public final void webSocketPayloadComposer(WebSocketPayloadComposer webSocketPayloadComposer) {
            Intrinsics.checkNotNullParameter(webSocketPayloadComposer, "webSocketPayloadComposer");
            this.webSocketPayloadComposer = webSocketPayloadComposer;
        }

        @Override // com.apollographql.apollo.network.ws.WsProtocol.Factory
        public String getName() {
            return "graphql-transport-ws";
        }

        @Override // com.apollographql.apollo.network.ws.WsProtocol.Factory
        public WsProtocol create(WebSocketConnection webSocketConnection, WsProtocol.Listener listener, CoroutineScope scope) {
            Intrinsics.checkNotNullParameter(webSocketConnection, "webSocketConnection");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(scope, "scope");
            GraphQLWsProtocol$Factory$create$connectionPayload$1 graphQLWsProtocol$Factory$create$connectionPayload$1 = this.connectionPayload;
            if (graphQLWsProtocol$Factory$create$connectionPayload$1 == null) {
                graphQLWsProtocol$Factory$create$connectionPayload$1 = new GraphQLWsProtocol$Factory$create$connectionPayload$1(null);
            }
            Function1<? super Continuation<? super Map<String, ? extends Object>>, ? extends Object> function1 = graphQLWsProtocol$Factory$create$connectionPayload$1;
            Long l = this.connectionAcknowledgeTimeoutMs;
            long longValue = l != null ? l.longValue() : 10000L;
            Long l2 = this.pingIntervalMillis;
            long longValue2 = l2 != null ? l2.longValue() : -1L;
            WsFrameType wsFrameType = this.frameType;
            if (wsFrameType == null) {
                wsFrameType = WsFrameType.Text;
            }
            WsFrameType wsFrameType2 = wsFrameType;
            Map<String, ? extends Object> map = this.pingPayload;
            Map<String, ? extends Object> map2 = this.pongPayload;
            DefaultWebSocketPayloadComposer defaultWebSocketPayloadComposer = this.webSocketPayloadComposer;
            if (defaultWebSocketPayloadComposer == null) {
                defaultWebSocketPayloadComposer = new DefaultWebSocketPayloadComposer();
            }
            return new GraphQLWsProtocol(function1, map, map2, longValue, longValue2, wsFrameType2, webSocketConnection, listener, scope, defaultWebSocketPayloadComposer);
        }
    }
}
