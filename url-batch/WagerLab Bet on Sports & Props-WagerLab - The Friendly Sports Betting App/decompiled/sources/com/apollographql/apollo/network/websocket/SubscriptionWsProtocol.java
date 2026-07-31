package com.apollographql.apollo.network.websocket;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.http.DefaultHttpRequestComposer;
import com.apollographql.apollo.api.json.JsonReaders;
import java.util.LinkedHashMap;
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
import okio.Buffer;

/* compiled from: SubscriptionWsProtocol.kt */
@Deprecated(message = "Migrate your server to GraphQLWsProtocol instead")
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012 \b\u0002\u0010\u0002\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J&\u0010\u0012\u001a\u00020\u0010\"\b\b\u0000\u0010\u0013*\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0016H\u0096@¢\u0006\u0002\u0010\u0017J \u0010\u0018\u001a\u00020\u0010\"\b\b\u0000\u0010\u0013*\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0016H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0010H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\fH\u0016R+\u0010\u0002\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/apollographql/apollo/network/websocket/SubscriptionWsProtocol;", "Lcom/apollographql/apollo/network/websocket/WsProtocol;", "connectionPayload", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getConnectionPayload", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function1;", "name", "", "getName", "()Ljava/lang/String;", "connectionInit", "Lcom/apollographql/apollo/network/websocket/ClientMessage;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "operationStart", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "request", "Lcom/apollographql/apollo/api/ApolloRequest;", "(Lcom/apollographql/apollo/api/ApolloRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "operationStop", "ping", "pong", "parseServerMessage", "Lcom/apollographql/apollo/network/websocket/ServerMessage;", "text", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionWsProtocol implements WsProtocol {
    private final Function1<Continuation<Object>, Object> connectionPayload;

    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionWsProtocol() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    public ClientMessage ping() {
        return null;
    }

    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    public ClientMessage pong() {
        return null;
    }

    /* compiled from: SubscriptionWsProtocol.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo.network.websocket.SubscriptionWsProtocol$1", f = "SubscriptionWsProtocol.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.apollographql.apollo.network.websocket.SubscriptionWsProtocol$1, reason: invalid class name */
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

    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionWsProtocol(Function1<? super Continuation<Object>, ? extends Object> connectionPayload) {
        Intrinsics.checkNotNullParameter(connectionPayload, "connectionPayload");
        this.connectionPayload = connectionPayload;
    }

    public /* synthetic */ SubscriptionWsProtocol(AnonymousClass1 anonymousClass1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AnonymousClass1(null) : anonymousClass1);
    }

    public final Function1<Continuation<Object>, Object> getConnectionPayload() {
        return this.connectionPayload;
    }

    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    public String getName() {
        return "graphql-ws";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object connectionInit(Continuation<? super ClientMessage> continuation) {
        SubscriptionWsProtocol$connectionInit$1 subscriptionWsProtocol$connectionInit$1;
        Object obj;
        int i;
        Map map;
        if (continuation instanceof SubscriptionWsProtocol$connectionInit$1) {
            subscriptionWsProtocol$connectionInit$1 = (SubscriptionWsProtocol$connectionInit$1) continuation;
            if ((subscriptionWsProtocol$connectionInit$1.label & Integer.MIN_VALUE) != 0) {
                subscriptionWsProtocol$connectionInit$1.label -= Integer.MIN_VALUE;
                obj = subscriptionWsProtocol$connectionInit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = subscriptionWsProtocol$connectionInit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("type", "connection_init");
                    Function1<Continuation<Object>, Object> function1 = this.connectionPayload;
                    subscriptionWsProtocol$connectionInit$1.L$0 = linkedHashMap;
                    subscriptionWsProtocol$connectionInit$1.label = 1;
                    Object invoke = function1.invoke(subscriptionWsProtocol$connectionInit$1);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    map = linkedHashMap;
                    obj = invoke;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = (Map) subscriptionWsProtocol$connectionInit$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (obj != null) {
                    map.put("payload", obj);
                }
                return ClientMessageKt.toClientMessage(map);
            }
        }
        subscriptionWsProtocol$connectionInit$1 = new SubscriptionWsProtocol$connectionInit$1(this, continuation);
        obj = subscriptionWsProtocol$connectionInit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = subscriptionWsProtocol$connectionInit$1.label;
        if (i != 0) {
        }
        if (obj != null) {
        }
        return ClientMessageKt.toClientMessage(map);
    }

    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    public <D extends Operation.Data> Object operationStart(ApolloRequest<D> apolloRequest, Continuation<? super ClientMessage> continuation) {
        return ClientMessageKt.toClientMessage(MapsKt.mapOf(TuplesKt.to("id", apolloRequest.getRequestUuid().toString()), TuplesKt.to("type", "start"), TuplesKt.to("payload", DefaultHttpRequestComposer.INSTANCE.composePayload(apolloRequest))));
    }

    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    public <D extends Operation.Data> ClientMessage operationStop(ApolloRequest<D> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientMessageKt.toClientMessage(MapsKt.mapOf(TuplesKt.to("type", "stop"), TuplesKt.to("id", request.getRequestUuid().toString())));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        if (r2.equals("error") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        r3 = r1.get("id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
    
        if ((r3 instanceof java.lang.String) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
    
        r4 = (java.lang.String) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a9, code lost:
    
        if (r4 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c5, code lost:
    
        return new com.apollographql.apollo.network.websocket.ParseErrorServerMessage("No 'id' found in message: '" + r11 + "'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ca, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, "data") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        return new com.apollographql.apollo.network.websocket.ResponseServerMessage(r4, r1.get("payload"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dc, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, io.intercom.android.sdk.NotificationStatuses.COMPLETE_STATUS) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e5, code lost:
    
        return new com.apollographql.apollo.network.websocket.CompleteServerMessage(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ea, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, "error") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f7, code lost:
    
        return new com.apollographql.apollo.network.websocket.OperationErrorServerMessage(r4, r1.get("payload"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0103, code lost:
    
        throw new java.lang.IllegalStateException("".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0092, code lost:
    
        if (r2.equals("data") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r2.equals(io.intercom.android.sdk.NotificationStatuses.COMPLETE_STATUS) == false) goto L53;
     */
    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ServerMessage parseServerMessage(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        try {
            Object readAny = JsonReaders.readAny(JsonReaders.jsonReader(new Buffer().writeUtf8(text)));
            Intrinsics.checkNotNull(readAny, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            Map map = (Map) readAny;
            Object obj = map.get("type");
            String str = null;
            String str2 = obj instanceof String ? (String) obj : null;
            if (str2 == null) {
                return new ParseErrorServerMessage("No 'type' found in server message: '" + text + "'");
            }
            switch (str2.hashCode()) {
                case -599445191:
                    break;
                case 3076010:
                    break;
                case 96784904:
                    break;
                case 1198953831:
                    if (str2.equals("connection_error")) {
                        return new ConnectionErrorServerMessage(map.get("payload"));
                    }
                    return new ParseErrorServerMessage("Unknown type: '" + str2 + "' found in server message: '" + text + "'");
                case 1270515624:
                    if (str2.equals("connection_ack")) {
                        return ConnectionAckServerMessage.INSTANCE;
                    }
                    return new ParseErrorServerMessage("Unknown type: '" + str2 + "' found in server message: '" + text + "'");
                default:
                    return new ParseErrorServerMessage("Unknown type: '" + str2 + "' found in server message: '" + text + "'");
            }
        } catch (Exception unused) {
            return new ParseErrorServerMessage("Invalid JSON: '" + text + "'");
        }
    }
}
