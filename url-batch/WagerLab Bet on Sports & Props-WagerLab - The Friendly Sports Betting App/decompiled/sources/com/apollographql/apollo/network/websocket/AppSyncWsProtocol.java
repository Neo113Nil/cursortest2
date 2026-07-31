package com.apollographql.apollo.network.websocket;

import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.http.DefaultHttpRequestComposer;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import com.apollographql.apollo.api.json.JsonReaders;
import com.apollographql.apollo.api.json.JsonWriters;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
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

/* compiled from: AppSyncWsProtocol.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB)\u0012 \b\u0002\u0010\u0002\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J&\u0010\u0012\u001a\u00020\u0010\"\b\b\u0000\u0010\u0013*\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0016H\u0096@¢\u0006\u0002\u0010\u0017J \u0010\u0018\u001a\u00020\u0010\"\b\b\u0000\u0010\u0013*\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0016H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0010H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\fH\u0016R+\u0010\u0002\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/apollographql/apollo/network/websocket/AppSyncWsProtocol;", "Lcom/apollographql/apollo/network/websocket/WsProtocol;", "authorization", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getAuthorization", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function1;", "name", "", "getName", "()Ljava/lang/String;", "connectionInit", "Lcom/apollographql/apollo/network/websocket/ClientMessage;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "operationStart", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "request", "Lcom/apollographql/apollo/api/ApolloRequest;", "(Lcom/apollographql/apollo/api/ApolloRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "operationStop", "ping", "pong", "parseServerMessage", "Lcom/apollographql/apollo/network/websocket/ServerMessage;", "text", "Companion", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppSyncWsProtocol implements WsProtocol {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Function1<Continuation<Object>, Object> authorization;

    /* JADX WARN: Multi-variable type inference failed */
    public AppSyncWsProtocol() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* compiled from: AppSyncWsProtocol.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo.network.websocket.AppSyncWsProtocol$1", f = "AppSyncWsProtocol.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.apollographql.apollo.network.websocket.AppSyncWsProtocol$1, reason: invalid class name */
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
    public AppSyncWsProtocol(Function1<? super Continuation<Object>, ? extends Object> authorization) {
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        this.authorization = authorization;
    }

    public /* synthetic */ AppSyncWsProtocol(AnonymousClass1 anonymousClass1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AnonymousClass1(null) : anonymousClass1);
    }

    public final Function1<Continuation<Object>, Object> getAuthorization() {
        return this.authorization;
    }

    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    public String getName() {
        return "graphql-ws";
    }

    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    public Object connectionInit(Continuation<? super ClientMessage> continuation) {
        return ClientMessageKt.toClientMessage(MapsKt.mapOf(TuplesKt.to("type", "connection_init")));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <D extends Operation.Data> Object operationStart(ApolloRequest<D> apolloRequest, Continuation<? super ClientMessage> continuation) {
        AppSyncWsProtocol$operationStart$1 appSyncWsProtocol$operationStart$1;
        int i;
        Pair[] pairArr;
        int i2;
        String str;
        Pair[] pairArr2;
        String str2;
        Pair[] pairArr3;
        String str3;
        Pair[] pairArr4;
        if (continuation instanceof AppSyncWsProtocol$operationStart$1) {
            appSyncWsProtocol$operationStart$1 = (AppSyncWsProtocol$operationStart$1) continuation;
            if ((appSyncWsProtocol$operationStart$1.label & Integer.MIN_VALUE) != 0) {
                appSyncWsProtocol$operationStart$1.label -= Integer.MIN_VALUE;
                Object obj = appSyncWsProtocol$operationStart$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appSyncWsProtocol$operationStart$1.label;
                int i3 = 1;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String m9325toJson$default = Adapters.m9325toJson$default(Adapters.NullableAnyAdapter, DefaultHttpRequestComposer.INSTANCE.composePayload(apolloRequest), null, null, 6, null);
                    pairArr = new Pair[3];
                    pairArr[0] = TuplesKt.to("type", "start");
                    pairArr[1] = TuplesKt.to("id", apolloRequest.getRequestUuid().toString());
                    i2 = 2;
                    Pair[] pairArr5 = new Pair[2];
                    pairArr5[0] = TuplesKt.to("data", m9325toJson$default);
                    Function1<Continuation<Object>, Object> function1 = this.authorization;
                    appSyncWsProtocol$operationStart$1.L$0 = pairArr;
                    appSyncWsProtocol$operationStart$1.L$1 = pairArr5;
                    appSyncWsProtocol$operationStart$1.L$2 = pairArr;
                    str = "payload";
                    appSyncWsProtocol$operationStart$1.L$3 = "payload";
                    appSyncWsProtocol$operationStart$1.L$4 = pairArr5;
                    appSyncWsProtocol$operationStart$1.L$5 = "extensions";
                    appSyncWsProtocol$operationStart$1.L$6 = "authorization";
                    appSyncWsProtocol$operationStart$1.I$0 = 2;
                    appSyncWsProtocol$operationStart$1.I$1 = 1;
                    appSyncWsProtocol$operationStart$1.label = 1;
                    obj = function1.invoke(appSyncWsProtocol$operationStart$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pairArr2 = pairArr;
                    str2 = "authorization";
                    pairArr3 = pairArr5;
                    str3 = "extensions";
                    pairArr4 = pairArr3;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = appSyncWsProtocol$operationStart$1.I$1;
                    i2 = appSyncWsProtocol$operationStart$1.I$0;
                    str2 = (String) appSyncWsProtocol$operationStart$1.L$6;
                    str3 = (String) appSyncWsProtocol$operationStart$1.L$5;
                    pairArr4 = (Pair[]) appSyncWsProtocol$operationStart$1.L$4;
                    str = (String) appSyncWsProtocol$operationStart$1.L$3;
                    pairArr = (Pair[]) appSyncWsProtocol$operationStart$1.L$2;
                    pairArr3 = (Pair[]) appSyncWsProtocol$operationStart$1.L$1;
                    pairArr2 = (Pair[]) appSyncWsProtocol$operationStart$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                pairArr4[i3] = TuplesKt.to(str3, MapsKt.mapOf(TuplesKt.to(str2, obj)));
                pairArr[i2] = TuplesKt.to(str, MapsKt.mapOf(pairArr3));
                return ClientMessageKt.toClientMessage(MapsKt.mapOf(pairArr2));
            }
        }
        appSyncWsProtocol$operationStart$1 = new AppSyncWsProtocol$operationStart$1(this, continuation);
        Object obj2 = appSyncWsProtocol$operationStart$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appSyncWsProtocol$operationStart$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        pairArr4[i32] = TuplesKt.to(str3, MapsKt.mapOf(TuplesKt.to(str2, obj2)));
        pairArr[i2] = TuplesKt.to(str, MapsKt.mapOf(pairArr3));
        return ClientMessageKt.toClientMessage(MapsKt.mapOf(pairArr2));
    }

    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    public <D extends Operation.Data> ClientMessage operationStop(ApolloRequest<D> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientMessageKt.toClientMessage(MapsKt.mapOf(TuplesKt.to("type", "stop"), TuplesKt.to("id", request.getRequestUuid().toString())));
    }

    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    public ClientMessage ping() {
        return ClientMessageKt.toClientMessage(MapsKt.mapOf(TuplesKt.to("type", "ping")));
    }

    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    public ClientMessage pong() {
        return ClientMessageKt.toClientMessage(MapsKt.mapOf(TuplesKt.to("type", "pong")));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
    
        if (r2.equals("data") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00dc, code lost:
    
        r3 = r1.get("id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
    
        if ((r3 instanceof java.lang.String) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e4, code lost:
    
        r4 = (java.lang.String) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e7, code lost:
    
        if (r4 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0103, code lost:
    
        return new com.apollographql.apollo.network.websocket.ParseErrorServerMessage("No 'id' found in message: '" + r10 + "'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0108, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, "data") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0115, code lost:
    
        return new com.apollographql.apollo.network.websocket.ResponseServerMessage(r4, r1.get("payload"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, io.intercom.android.sdk.NotificationStatuses.COMPLETE_STATUS) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0123, code lost:
    
        return new com.apollographql.apollo.network.websocket.CompleteServerMessage(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012f, code lost:
    
        throw new java.lang.IllegalStateException("".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r2.equals(io.intercom.android.sdk.NotificationStatuses.COMPLETE_STATUS) == false) goto L62;
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
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                return new ParseErrorServerMessage("No 'type' found in server message: '" + this + "'");
            }
            switch (str.hashCode()) {
                case -599445191:
                    break;
                case 3414:
                    if (str.equals("ka")) {
                        return PingServerMessage.INSTANCE;
                    }
                    return new ParseErrorServerMessage("Unknown type: '" + str + "' found in server message: '" + text + "'");
                case 3076010:
                    break;
                case 96784904:
                    if (str.equals("error")) {
                        Object obj2 = map.get("id");
                        r4 = obj2 instanceof String ? (String) obj2 : null;
                        return r4 != null ? new OperationErrorServerMessage(r4, map.get("payload")) : new ParseErrorServerMessage("General error: " + text);
                    }
                    return new ParseErrorServerMessage("Unknown type: '" + str + "' found in server message: '" + text + "'");
                case 1198953831:
                    if (str.equals("connection_error")) {
                        return new ConnectionErrorServerMessage(map.get("payload"));
                    }
                    return new ParseErrorServerMessage("Unknown type: '" + str + "' found in server message: '" + text + "'");
                case 1270515624:
                    if (str.equals("connection_ack")) {
                        return ConnectionAckServerMessage.INSTANCE;
                    }
                    return new ParseErrorServerMessage("Unknown type: '" + str + "' found in server message: '" + text + "'");
                default:
                    return new ParseErrorServerMessage("Unknown type: '" + str + "' found in server message: '" + text + "'");
            }
        } catch (Exception unused) {
            return new ParseErrorServerMessage("Invalid JSON: '" + this + "'");
        }
    }

    /* compiled from: AppSyncWsProtocol.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bJ\u001a\u0010\n\u001a\u00020\u0005*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH\u0002¨\u0006\u000b"}, d2 = {"Lcom/apollographql/apollo/network/websocket/AppSyncWsProtocol$Companion;", "", "<init>", "()V", "buildUrl", "", "baseUrl", "authorization", "", "payload", "base64Encode", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
