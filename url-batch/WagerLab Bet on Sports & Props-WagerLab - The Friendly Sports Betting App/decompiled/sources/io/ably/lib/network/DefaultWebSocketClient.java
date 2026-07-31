package io.ably.lib.network;

import java.net.URI;
import java.nio.ByteBuffer;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import org.java_websocket.WebSocket;
import org.java_websocket.exceptions.WebsocketNotConnectedException;
import org.java_websocket.framing.Framedata;
import org.java_websocket.handshake.ServerHandshake;

/* loaded from: classes7.dex */
public class DefaultWebSocketClient extends org.java_websocket.client.WebSocketClient implements WebSocketClient {
    private final WebSocketEngineConfig config;
    private final WebSocketListener listener;
    private boolean shouldExplicitlyVerifyHostname;

    public DefaultWebSocketClient(URI uri, WebSocketListener webSocketListener, WebSocketEngineConfig webSocketEngineConfig) {
        super(uri);
        this.shouldExplicitlyVerifyHostname = true;
        this.listener = webSocketListener;
        this.config = webSocketEngineConfig;
    }

    @Override // org.java_websocket.client.WebSocketClient
    public void onOpen(ServerHandshake serverHandshake) {
        if (this.config.isTls() && this.shouldExplicitlyVerifyHostname && !isHostnameVerified(this.config.getHost())) {
            close();
        } else {
            this.listener.onOpen();
        }
    }

    @Override // org.java_websocket.client.WebSocketClient
    public void onMessage(String str) {
        this.listener.onMessage(str);
    }

    @Override // org.java_websocket.client.WebSocketClient
    public void onMessage(ByteBuffer byteBuffer) {
        this.listener.onMessage(byteBuffer);
    }

    @Override // org.java_websocket.WebSocketAdapter, org.java_websocket.WebSocketListener
    public void onWebsocketPing(WebSocket webSocket, Framedata framedata) {
        super.onWebsocketPing(webSocket, framedata);
        this.listener.onWebsocketPing();
    }

    @Override // org.java_websocket.client.WebSocketClient
    public void onClose(int i, String str, boolean z) {
        this.listener.onClose(i, str);
    }

    @Override // org.java_websocket.client.WebSocketClient
    public void onError(Exception exc) {
        this.listener.onError(exc);
    }

    @Override // io.ably.lib.network.WebSocketClient
    public void cancel(int i, String str) {
        closeConnection(i, str);
    }

    @Override // org.java_websocket.client.WebSocketClient
    protected void onSetSSLParameters(SSLParameters sSLParameters) {
        try {
            super.onSetSSLParameters(sSLParameters);
            this.shouldExplicitlyVerifyHostname = false;
        } catch (NoSuchMethodError e) {
            this.shouldExplicitlyVerifyHostname = true;
            this.listener.onOldJavaVersionDetected(e);
        }
    }

    @Override // org.java_websocket.client.WebSocketClient, org.java_websocket.WebSocket, io.ably.lib.network.WebSocketClient
    public void send(String str) {
        try {
            super.send(str);
        } catch (WebsocketNotConnectedException e) {
            throw new NotConnectedException(e);
        }
    }

    private boolean isHostnameVerified(String str) {
        SSLSession sSLSession = getSSLSession();
        if (HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession)) {
            return true;
        }
        this.listener.onError(new IllegalArgumentException("Hostname verification failed, expected " + str + ", found " + sSLSession.getPeerHost()));
        return false;
    }
}
