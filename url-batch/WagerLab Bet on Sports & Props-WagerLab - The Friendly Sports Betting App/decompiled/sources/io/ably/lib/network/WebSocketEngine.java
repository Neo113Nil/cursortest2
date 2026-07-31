package io.ably.lib.network;

/* loaded from: classes7.dex */
public interface WebSocketEngine {
    WebSocketClient create(String str, WebSocketListener webSocketListener);

    boolean isPingListenerSupported();
}
