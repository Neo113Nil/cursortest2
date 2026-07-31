package io.ably.lib.network;

import java.net.URI;

/* loaded from: classes7.dex */
public class DefaultWebSocketEngine implements WebSocketEngine {
    private final WebSocketEngineConfig config;

    @Override // io.ably.lib.network.WebSocketEngine
    public boolean isPingListenerSupported() {
        return true;
    }

    public DefaultWebSocketEngine(WebSocketEngineConfig webSocketEngineConfig) {
        this.config = webSocketEngineConfig;
    }

    @Override // io.ably.lib.network.WebSocketEngine
    public WebSocketClient create(String str, WebSocketListener webSocketListener) {
        DefaultWebSocketClient defaultWebSocketClient = new DefaultWebSocketClient(URI.create(str), webSocketListener, this.config);
        if (this.config.isTls()) {
            defaultWebSocketClient.setSocketFactory(this.config.getSslSocketFactory());
        }
        return defaultWebSocketClient;
    }
}
