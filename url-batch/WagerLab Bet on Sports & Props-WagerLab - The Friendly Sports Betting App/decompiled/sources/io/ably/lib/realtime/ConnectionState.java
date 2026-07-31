package io.ably.lib.realtime;

/* loaded from: classes7.dex */
public enum ConnectionState {
    initialized(ConnectionEvent.initialized),
    connecting(ConnectionEvent.connecting),
    connected(ConnectionEvent.connected),
    disconnected(ConnectionEvent.disconnected),
    suspended(ConnectionEvent.suspended),
    closing(ConnectionEvent.closing),
    closed(ConnectionEvent.closed),
    failed(ConnectionEvent.failed);

    private final ConnectionEvent event;

    ConnectionState(ConnectionEvent connectionEvent) {
        this.event = connectionEvent;
    }

    public ConnectionEvent getConnectionEvent() {
        return this.event;
    }
}
