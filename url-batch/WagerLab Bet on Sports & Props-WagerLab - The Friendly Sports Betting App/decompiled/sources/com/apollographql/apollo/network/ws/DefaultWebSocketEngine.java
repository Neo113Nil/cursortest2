package com.apollographql.apollo.network.ws;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.ApolloWebSocketClosedException;
import com.apollographql.apollo.network.OkHttpExtensionsKt;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

/* compiled from: OkHttpWebSocketEngine.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\bJ$\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0096@¢\u0006\u0002\u0010\u0014R\u001b\u0010\u0002\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/apollographql/apollo/network/ws/DefaultWebSocketEngine;", "Lcom/apollographql/apollo/network/ws/WebSocketEngine;", "webSocketFactory", "Lkotlin/Function0;", "Lokhttp3/WebSocket$Factory;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "(Lokhttp3/WebSocket$Factory;)V", "()V", "getWebSocketFactory", "()Lokhttp3/WebSocket$Factory;", "webSocketFactory$delegate", "Lkotlin/Lazy;", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "Lcom/apollographql/apollo/network/ws/WebSocketConnection;", "url", "", "headers", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultWebSocketEngine implements WebSocketEngine {

    /* renamed from: webSocketFactory$delegate, reason: from kotlin metadata */
    private final Lazy webSocketFactory;

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebSocket.Factory _init_$lambda$1(WebSocket.Factory factory) {
        return factory;
    }

    public DefaultWebSocketEngine(final Function0<? extends WebSocket.Factory> webSocketFactory) {
        Intrinsics.checkNotNullParameter(webSocketFactory, "webSocketFactory");
        this.webSocketFactory = LazyKt.lazy(new Function0() { // from class: com.apollographql.apollo.network.ws.DefaultWebSocketEngine$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WebSocket.Factory webSocketFactory_delegate$lambda$0;
                webSocketFactory_delegate$lambda$0 = DefaultWebSocketEngine.webSocketFactory_delegate$lambda$0(Function0.this);
                return webSocketFactory_delegate$lambda$0;
            }
        });
    }

    private final WebSocket.Factory getWebSocketFactory() {
        return (WebSocket.Factory) this.webSocketFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebSocket.Factory webSocketFactory_delegate$lambda$0(Function0 function0) {
        return (WebSocket.Factory) function0.invoke();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultWebSocketEngine(final WebSocket.Factory webSocketFactory) {
        this((Function0<? extends WebSocket.Factory>) new Function0() { // from class: com.apollographql.apollo.network.ws.DefaultWebSocketEngine$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WebSocket.Factory _init_$lambda$1;
                _init_$lambda$1 = DefaultWebSocketEngine._init_$lambda$1(WebSocket.Factory.this);
                return _init_$lambda$1;
            }
        });
        Intrinsics.checkNotNullParameter(webSocketFactory, "webSocketFactory");
    }

    public DefaultWebSocketEngine() {
        this(OkHttpExtensionsKt.getDefaultOkHttpClientBuilder().build());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.apollographql.apollo.network.ws.WebSocketEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object open(String str, List<HttpHeader> list, Continuation<? super WebSocketConnection> continuation) {
        DefaultWebSocketEngine$open$1 defaultWebSocketEngine$open$1;
        int i;
        final WebSocket newWebSocket;
        final Channel channel;
        if (continuation instanceof DefaultWebSocketEngine$open$1) {
            defaultWebSocketEngine$open$1 = (DefaultWebSocketEngine$open$1) continuation;
            if ((defaultWebSocketEngine$open$1.label & Integer.MIN_VALUE) != 0) {
                defaultWebSocketEngine$open$1.label -= Integer.MIN_VALUE;
                Object obj = defaultWebSocketEngine$open$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultWebSocketEngine$open$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    final Channel Channel$default = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                    final CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    newWebSocket = getWebSocketFactory().newWebSocket(new Request.Builder().url(str).headers(OkHttpExtensionsKt.toOkHttpHeaders(list)).build(), new WebSocketListener() { // from class: com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$webSocket$1
                        @Override // okhttp3.WebSocketListener
                        public void onOpen(WebSocket webSocket, Response response) {
                            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                            Intrinsics.checkNotNullParameter(response, "response");
                            CompletableDeferred$default.complete(Unit.INSTANCE);
                        }

                        @Override // okhttp3.WebSocketListener
                        public void onMessage(WebSocket webSocket, String text) {
                            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                            Intrinsics.checkNotNullParameter(text, "text");
                            Channel$default.mo8997trySendJP2dKIU(text);
                        }

                        @Override // okhttp3.WebSocketListener
                        public void onMessage(WebSocket webSocket, ByteString bytes) {
                            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                            Intrinsics.checkNotNullParameter(bytes, "bytes");
                            Channel$default.mo8997trySendJP2dKIU(bytes.utf8());
                        }

                        @Override // okhttp3.WebSocketListener
                        public void onFailure(WebSocket webSocket, Throwable t, Response response) {
                            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                            Intrinsics.checkNotNullParameter(t, "t");
                            CompletableDeferred$default.complete(Unit.INSTANCE);
                            Channel$default.close(new ApolloNetworkException("Web socket communication error", t));
                        }

                        @Override // okhttp3.WebSocketListener
                        public void onClosing(WebSocket webSocket, int code, String reason) {
                            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                            Intrinsics.checkNotNullParameter(reason, "reason");
                            CompletableDeferred$default.complete(Unit.INSTANCE);
                            Channel$default.close(new ApolloWebSocketClosedException(code, reason, null, 4, null));
                        }

                        @Override // okhttp3.WebSocketListener
                        public void onClosed(WebSocket webSocket, int code, String reason) {
                            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                            Intrinsics.checkNotNullParameter(reason, "reason");
                            SendChannel.DefaultImpls.close$default(Channel$default, null, 1, null);
                        }
                    });
                    defaultWebSocketEngine$open$1.L$0 = Channel$default;
                    defaultWebSocketEngine$open$1.L$1 = newWebSocket;
                    defaultWebSocketEngine$open$1.label = 1;
                    if (CompletableDeferred$default.await(defaultWebSocketEngine$open$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    channel = Channel$default;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    newWebSocket = (WebSocket) defaultWebSocketEngine$open$1.L$1;
                    channel = (Channel) defaultWebSocketEngine$open$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                channel.invokeOnClose(new Function1() { // from class: com.apollographql.apollo.network.ws.DefaultWebSocketEngine$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit open$lambda$2;
                        open$lambda$2 = DefaultWebSocketEngine.open$lambda$2(WebSocket.this, (Throwable) obj2);
                        return open$lambda$2;
                    }
                });
                return new WebSocketConnection() { // from class: com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$3
                    @Override // com.apollographql.apollo.network.ws.WebSocketConnection
                    public Object receive(Continuation<? super String> continuation2) {
                        return channel.receive(continuation2);
                    }

                    @Override // com.apollographql.apollo.network.ws.WebSocketConnection
                    public void send(ByteString data) {
                        Intrinsics.checkNotNullParameter(data, "data");
                        if (newWebSocket.send(data)) {
                            return;
                        }
                        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
                    }

                    @Override // com.apollographql.apollo.network.ws.WebSocketConnection
                    public void send(String string) {
                        Intrinsics.checkNotNullParameter(string, "string");
                        if (newWebSocket.send(string)) {
                            return;
                        }
                        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
                    }

                    @Override // com.apollographql.apollo.network.ws.WebSocketConnection
                    public void close() {
                        newWebSocket.close(1000, null);
                    }
                };
            }
        }
        defaultWebSocketEngine$open$1 = new DefaultWebSocketEngine$open$1(this, continuation);
        Object obj2 = defaultWebSocketEngine$open$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultWebSocketEngine$open$1.label;
        if (i != 0) {
        }
        channel.invokeOnClose(new Function1() { // from class: com.apollographql.apollo.network.ws.DefaultWebSocketEngine$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj22) {
                Unit open$lambda$2;
                open$lambda$2 = DefaultWebSocketEngine.open$lambda$2(WebSocket.this, (Throwable) obj22);
                return open$lambda$2;
            }
        });
        return new WebSocketConnection() { // from class: com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$3
            @Override // com.apollographql.apollo.network.ws.WebSocketConnection
            public Object receive(Continuation<? super String> continuation2) {
                return channel.receive(continuation2);
            }

            @Override // com.apollographql.apollo.network.ws.WebSocketConnection
            public void send(ByteString data) {
                Intrinsics.checkNotNullParameter(data, "data");
                if (newWebSocket.send(data)) {
                    return;
                }
                SendChannel.DefaultImpls.close$default(channel, null, 1, null);
            }

            @Override // com.apollographql.apollo.network.ws.WebSocketConnection
            public void send(String string) {
                Intrinsics.checkNotNullParameter(string, "string");
                if (newWebSocket.send(string)) {
                    return;
                }
                SendChannel.DefaultImpls.close$default(channel, null, 1, null);
            }

            @Override // com.apollographql.apollo.network.ws.WebSocketConnection
            public void close() {
                newWebSocket.close(1000, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit open$lambda$2(WebSocket webSocket, Throwable th) {
        webSocket.close(1001, null);
        return Unit.INSTANCE;
    }
}
