package io.ably.lib.network;

/* loaded from: classes7.dex */
public class DefaultWebSocketEngineFactory implements WebSocketEngineFactory {
    @Override // io.ably.lib.network.WebSocketEngineFactory
    public WebSocketEngine create(WebSocketEngineConfig webSocketEngineConfig) {
        return new DefaultWebSocketEngine(webSocketEngineConfig);
    }

    @Override // io.ably.lib.network.WebSocketEngineFactory
    public EngineType getEngineType() {
        return EngineType.DEFAULT;
    }
}
