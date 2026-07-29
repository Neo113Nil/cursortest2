package com.google.firebase.database.tubesock;

import com.google.firebase.database.tubesock.MessageBuilderFactory;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
class WebSocketReceiver {
    private MessageBuilderFactory.Builder pendingBuilder;
    private WebSocket websocket;
    private DataInputStream input = null;
    private WebSocketEventHandler eventHandler = null;
    private byte[] inputHeader = new byte[112];
    private volatile boolean stop = false;

    public WebSocketReceiver(WebSocket webSocket) {
        this.websocket = null;
        this.websocket = webSocket;
    }

    private void appendBytes(boolean z, byte b, byte[] bArr) {
        if (b == 9) {
            if (!z) {
                throw new WebSocketException("PING must not fragment across frames");
            }
            handlePing(bArr);
            return;
        }
        MessageBuilderFactory.Builder builder = this.pendingBuilder;
        if (builder != null && b != 0) {
            throw new WebSocketException("Failed to continue outstanding frame");
        }
        if (builder == null && b == 0) {
            throw new WebSocketException("Received continuing frame, but there's nothing to continue");
        }
        if (builder == null) {
            this.pendingBuilder = MessageBuilderFactory.builder(b);
        }
        if (!this.pendingBuilder.appendBytes(bArr)) {
            throw new WebSocketException("Failed to decode frame");
        }
        if (z) {
            WebSocketMessage message = this.pendingBuilder.toMessage();
            this.pendingBuilder = null;
            if (message == null) {
                throw new WebSocketException("Failed to decode whole message");
            }
            this.eventHandler.onMessage(message);
        }
    }

    private void handleError(WebSocketException webSocketException) {
        stopit();
        this.websocket.handleReceiverError(webSocketException);
    }

    private void handlePing(byte[] bArr) {
        if (bArr.length > 125) {
            throw new WebSocketException("PING frame too long");
        }
        this.websocket.pong(bArr);
    }

    private long parseLong(byte[] bArr, int i) {
        return (bArr[i] << 56) + ((bArr[i + 1] & 255) << 48) + ((bArr[i + 2] & 255) << 40) + ((bArr[i + 3] & 255) << 32) + ((bArr[i + 4] & 255) << 24) + ((bArr[i + 5] & 255) << 16) + ((bArr[i + 6] & 255) << 8) + (bArr[i + 7] & 255);
    }

    private int read(byte[] bArr, int i, int i2) {
        this.input.readFully(bArr, i, i2);
        return i2;
    }

    public boolean isRunning() {
        return !this.stop;
    }

    public void run() {
        int read;
        byte[] bArr;
        byte b;
        boolean z;
        long parseLong;
        this.eventHandler = this.websocket.getEventHandler();
        while (!this.stop) {
            try {
                read = read(this.inputHeader, 0, 1);
                bArr = this.inputHeader;
                b = bArr[0];
                z = (b & 128) != 0;
            } catch (WebSocketException e) {
                handleError(e);
            } catch (SocketTimeoutException unused) {
            } catch (IOException e2) {
                handleError(new WebSocketException("IO Error", e2));
            }
            if ((b & 112) != 0) {
                throw new WebSocketException("Invalid frame received");
            }
            byte b2 = (byte) (b & 15);
            int read2 = read + read(bArr, read, 1);
            byte[] bArr2 = this.inputHeader;
            byte b3 = bArr2[1];
            if (b3 < 126) {
                parseLong = b3;
            } else if (b3 == 126) {
                read(bArr2, read2, 2);
                byte[] bArr3 = this.inputHeader;
                parseLong = ((bArr3[2] & 255) << 8) | (bArr3[3] & 255);
            } else {
                parseLong = b3 == Byte.MAX_VALUE ? parseLong(this.inputHeader, (read2 + read(bArr2, read2, 8)) - 8) : 0L;
            }
            int i = (int) parseLong;
            byte[] bArr4 = new byte[i];
            read(bArr4, 0, i);
            if (b2 == 8) {
                this.websocket.onCloseOpReceived();
            } else if (b2 != 10) {
                if (b2 != 1 && b2 != 2 && b2 != 9 && b2 != 0) {
                    throw new WebSocketException("Unsupported opcode: " + ((int) b2));
                }
                appendBytes(z, b2, bArr4);
            }
        }
    }

    public void setInput(DataInputStream dataInputStream) {
        this.input = dataInputStream;
    }

    public void stopit() {
        this.stop = true;
    }
}
