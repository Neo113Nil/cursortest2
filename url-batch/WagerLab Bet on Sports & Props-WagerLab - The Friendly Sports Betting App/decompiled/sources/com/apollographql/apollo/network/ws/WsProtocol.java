package com.apollographql.apollo.network.ws;

import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import com.apollographql.apollo.api.json.BufferedSourceJsonReader;
import com.apollographql.apollo.api.json.JsonWriters;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okio.Buffer;
import okio.ByteString;

/* compiled from: WsProtocol.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H&J \u0010\u0013\u001a\u00020\r\"\b\b\u0000\u0010\u0014*\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0017H&J \u0010\u0018\u001a\u00020\r\"\b\b\u0000\u0010\u0014*\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0017H&J\u001a\u0010\u0019\u001a\u00020\u001a*\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0004J\u001a\u0010\u001b\u001a\u00020\u0012*\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0004J\u001c\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0011*\u00020\u0012H\u0004J\u001e\u0010\u001d\u001a\u00020\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0004J\u001e\u0010\u001e\u001a\u00020\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0004J&\u0010\u001f\u001a\u00020\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00112\u0006\u0010 \u001a\u00020!H\u0004J\u001c\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0084@¢\u0006\u0002\u0010\u000eJ\u000e\u0010#\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eJ\b\u0010$\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006'"}, d2 = {"Lcom/apollographql/apollo/network/ws/WsProtocol;", "", "webSocketConnection", "Lcom/apollographql/apollo/network/ws/WebSocketConnection;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;", "<init>", "(Lcom/apollographql/apollo/network/ws/WebSocketConnection;Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;)V", "getWebSocketConnection", "()Lcom/apollographql/apollo/network/ws/WebSocketConnection;", "getListener", "()Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;", "connectionInit", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleServerMessage", "messageMap", "", "", "startOperation", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "request", "Lcom/apollographql/apollo/api/ApolloRequest;", "stopOperation", "toByteString", "Lokio/ByteString;", "toUtf8", "toMessageMap", "sendMessageMapBinary", "sendMessageMapText", "sendMessageMap", "frameType", "Lcom/apollographql/apollo/network/ws/WsFrameType;", "receiveMessageMap", "run", "close", "Listener", "Factory", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class WsProtocol {
    private final Listener listener;
    private final WebSocketConnection webSocketConnection;

    /* compiled from: WsProtocol.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/ws/WsProtocol$Factory;", "", "name", "", "getName", "()Ljava/lang/String;", "create", "Lcom/apollographql/apollo/network/ws/WsProtocol;", "webSocketConnection", "Lcom/apollographql/apollo/network/ws/WebSocketConnection;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        WsProtocol create(WebSocketConnection webSocketConnection, Listener listener, CoroutineScope scope);

        String getName();
    }

    /* compiled from: WsProtocol.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H&J(\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\n\u001a\u00020\u00032\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;", "", "operationResponse", "", "id", "", "payload", "", "operationError", "operationComplete", "generalError", "networkError", "cause", "", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Listener {
        void generalError(Map<String, ? extends Object> payload);

        void networkError(Throwable cause);

        void operationComplete(String id);

        void operationError(String id, Map<String, ? extends Object> payload);

        void operationResponse(String id, Map<String, ? extends Object> payload);
    }

    /* compiled from: WsProtocol.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WsFrameType.values().length];
            try {
                iArr[WsFrameType.Text.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WsFrameType.Binary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public abstract Object connectionInit(Continuation<? super Unit> continuation);

    public abstract void handleServerMessage(Map<String, ? extends Object> messageMap);

    public Object run(Continuation<? super Unit> continuation) {
        return run$suspendImpl(this, continuation);
    }

    public abstract <D extends Operation.Data> void startOperation(ApolloRequest<D> request);

    public abstract <D extends Operation.Data> void stopOperation(ApolloRequest<D> request);

    public WsProtocol(WebSocketConnection webSocketConnection, Listener listener) {
        Intrinsics.checkNotNullParameter(webSocketConnection, "webSocketConnection");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.webSocketConnection = webSocketConnection;
        this.listener = listener;
    }

    protected final WebSocketConnection getWebSocketConnection() {
        return this.webSocketConnection;
    }

    protected final Listener getListener() {
        return this.listener;
    }

    protected final Map<String, Object> toMessageMap(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Object fromJson = Adapters.AnyAdapter.fromJson(new BufferedSourceJsonReader(new Buffer().writeUtf8(str)), CustomScalarAdapters.Empty);
            if (fromJson instanceof Map) {
                return (Map) fromJson;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    protected final void sendMessageMapBinary(Map<String, ? extends Object> messageMap) {
        Intrinsics.checkNotNullParameter(messageMap, "messageMap");
        this.webSocketConnection.send(toByteString(messageMap));
    }

    protected final void sendMessageMapText(Map<String, ? extends Object> messageMap) {
        Intrinsics.checkNotNullParameter(messageMap, "messageMap");
        this.webSocketConnection.send(toUtf8(messageMap));
    }

    protected final void sendMessageMap(Map<String, ? extends Object> messageMap, WsFrameType frameType) {
        Intrinsics.checkNotNullParameter(messageMap, "messageMap");
        Intrinsics.checkNotNullParameter(frameType, "frameType");
        int i = WhenMappings.$EnumSwitchMapping$0[frameType.ordinal()];
        if (i == 1) {
            sendMessageMapText(messageMap);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            sendMessageMapBinary(messageMap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0046 -> B:10:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object receiveMessageMap(Continuation<? super Map<String, ? extends Object>> continuation) {
        WsProtocol$receiveMessageMap$1 wsProtocol$receiveMessageMap$1;
        int i;
        if (continuation instanceof WsProtocol$receiveMessageMap$1) {
            wsProtocol$receiveMessageMap$1 = (WsProtocol$receiveMessageMap$1) continuation;
            if ((wsProtocol$receiveMessageMap$1.label & Integer.MIN_VALUE) != 0) {
                wsProtocol$receiveMessageMap$1.label -= Integer.MIN_VALUE;
                Object obj = wsProtocol$receiveMessageMap$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = wsProtocol$receiveMessageMap$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    WebSocketConnection webSocketConnection = this.webSocketConnection;
                    wsProtocol$receiveMessageMap$1.L$0 = this;
                    wsProtocol$receiveMessageMap$1.label = 1;
                    obj = webSocketConnection.receive(wsProtocol$receiveMessageMap$1);
                    if (obj == coroutine_suspended) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    WsProtocol wsProtocol = (WsProtocol) wsProtocol$receiveMessageMap$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    Map<String, Object> messageMap = wsProtocol.toMessageMap((String) obj);
                    if (messageMap != null) {
                        return messageMap;
                    }
                    WebSocketConnection webSocketConnection2 = this.webSocketConnection;
                    wsProtocol$receiveMessageMap$1.L$0 = this;
                    wsProtocol$receiveMessageMap$1.label = 1;
                    obj = webSocketConnection2.receive(wsProtocol$receiveMessageMap$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    wsProtocol = this;
                    Map<String, Object> messageMap2 = wsProtocol.toMessageMap((String) obj);
                    if (messageMap2 != null) {
                    }
                    WebSocketConnection webSocketConnection22 = this.webSocketConnection;
                    wsProtocol$receiveMessageMap$1.L$0 = this;
                    wsProtocol$receiveMessageMap$1.label = 1;
                    obj = webSocketConnection22.receive(wsProtocol$receiveMessageMap$1);
                    if (obj == coroutine_suspended) {
                    }
                }
            }
        }
        wsProtocol$receiveMessageMap$1 = new WsProtocol$receiveMessageMap$1(this, continuation);
        Object obj2 = wsProtocol$receiveMessageMap$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = wsProtocol$receiveMessageMap$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004c -> B:12:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object run$suspendImpl(WsProtocol wsProtocol, Continuation<? super Unit> continuation) {
        WsProtocol$run$1 wsProtocol$run$1;
        int i;
        if (continuation instanceof WsProtocol$run$1) {
            wsProtocol$run$1 = (WsProtocol$run$1) continuation;
            if ((wsProtocol$run$1.label & Integer.MIN_VALUE) != 0) {
                wsProtocol$run$1.label -= Integer.MIN_VALUE;
                Object obj = wsProtocol$run$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = wsProtocol$run$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    wsProtocol$run$1.L$0 = wsProtocol;
                    wsProtocol$run$1.L$1 = wsProtocol;
                    wsProtocol$run$1.label = 1;
                    obj = wsProtocol.receiveMessageMap(wsProtocol$run$1);
                    if (obj == coroutine_suspended) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wsProtocol = (WsProtocol) wsProtocol$run$1.L$1;
                    WsProtocol wsProtocol2 = (WsProtocol) wsProtocol$run$1.L$0;
                    try {
                        try {
                            ResultKt.throwOnFailure(obj);
                            try {
                                wsProtocol.handleServerMessage((Map) obj);
                                wsProtocol$run$1.L$0 = wsProtocol;
                                wsProtocol$run$1.L$1 = wsProtocol;
                                wsProtocol$run$1.label = 1;
                                obj = wsProtocol.receiveMessageMap(wsProtocol$run$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                wsProtocol2 = wsProtocol;
                                wsProtocol.handleServerMessage((Map) obj);
                                wsProtocol = wsProtocol2;
                                wsProtocol$run$1.L$0 = wsProtocol;
                                wsProtocol$run$1.L$1 = wsProtocol;
                                wsProtocol$run$1.label = 1;
                                obj = wsProtocol.receiveMessageMap(wsProtocol$run$1);
                                if (obj == coroutine_suspended) {
                                }
                            } catch (Exception e) {
                                wsProtocol2 = wsProtocol;
                                e = e;
                                wsProtocol2.listener.networkError(e);
                                return Unit.INSTANCE;
                            }
                            wsProtocol = wsProtocol2;
                        } catch (CancellationException e2) {
                            throw e2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        wsProtocol2.listener.networkError(e);
                        return Unit.INSTANCE;
                    }
                }
            }
        }
        wsProtocol$run$1 = new WsProtocol$run$1(wsProtocol, continuation);
        Object obj2 = wsProtocol$run$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = wsProtocol$run$1.label;
        if (i != 0) {
        }
    }

    public void close() {
        this.webSocketConnection.close();
    }

    protected final ByteString toByteString(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Buffer buffer = new Buffer();
        JsonWriters.writeAny(new BufferedSinkJsonWriter(buffer, null), map);
        return buffer.readByteString();
    }

    protected final String toUtf8(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Buffer buffer = new Buffer();
        JsonWriters.writeAny(new BufferedSinkJsonWriter(buffer, null), map);
        return buffer.readUtf8();
    }
}
