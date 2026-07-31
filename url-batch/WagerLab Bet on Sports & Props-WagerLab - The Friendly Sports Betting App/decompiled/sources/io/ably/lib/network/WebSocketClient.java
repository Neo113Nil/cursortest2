package io.ably.lib.network;

/* loaded from: classes7.dex */
public interface WebSocketClient {
    void cancel(int i, String str);

    void close();

    void close(int i, String str);

    void connect();

    void send(String str);

    void send(byte[] bArr);
}
