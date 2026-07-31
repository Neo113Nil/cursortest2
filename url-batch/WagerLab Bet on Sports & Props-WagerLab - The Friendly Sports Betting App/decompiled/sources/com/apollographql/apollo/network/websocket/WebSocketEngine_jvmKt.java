package com.apollographql.apollo.network.websocket;

import com.apollographql.apollo.network.OkHttpExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.WebSocket;

/* compiled from: WebSocketEngine.jvm.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0016\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"WebSocketEngine", "Lcom/apollographql/apollo/network/websocket/WebSocketEngine;", "webSocketFactory", "Lkotlin/Function0;", "Lokhttp3/WebSocket$Factory;", "apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WebSocketEngine_jvmKt {
    public static final WebSocketEngine WebSocketEngine() {
        return new JvmWebSocketEngine((Function0<? extends WebSocket.Factory>) new Function0() { // from class: com.apollographql.apollo.network.websocket.WebSocketEngine_jvmKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WebSocket.Factory WebSocketEngine$lambda$0;
                WebSocketEngine$lambda$0 = WebSocketEngine_jvmKt.WebSocketEngine$lambda$0();
                return WebSocketEngine$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebSocket.Factory WebSocketEngine$lambda$0() {
        return OkHttpExtensionsKt.getDefaultOkHttpClientBuilder().build();
    }

    public static final WebSocketEngine WebSocketEngine(Function0<? extends WebSocket.Factory> webSocketFactory) {
        Intrinsics.checkNotNullParameter(webSocketFactory, "webSocketFactory");
        return new JvmWebSocketEngine(webSocketFactory);
    }

    public static final WebSocketEngine WebSocketEngine(WebSocket.Factory webSocketFactory) {
        Intrinsics.checkNotNullParameter(webSocketFactory, "webSocketFactory");
        return new JvmWebSocketEngine(webSocketFactory);
    }
}
