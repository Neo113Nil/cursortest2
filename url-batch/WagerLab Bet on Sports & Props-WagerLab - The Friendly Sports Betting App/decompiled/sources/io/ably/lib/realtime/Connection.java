package io.ably.lib.realtime;

import io.ably.lib.objects.LiveObjectsPlugin;
import io.ably.lib.realtime.ConnectionStateListener;
import io.ably.lib.transport.ConnectionManager;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.RecoveryKeyContext;
import io.ably.lib.util.EventEmitter;
import io.ably.lib.util.Log;
import io.ably.lib.util.PlatformAgentProvider;

/* loaded from: classes7.dex */
public class Connection extends EventEmitter<ConnectionEvent, ConnectionStateListener> {
    private static final String TAG = "io.ably.lib.realtime.Connection";
    final AblyRealtime ably;
    public final ConnectionManager connectionManager;
    public String id;
    public String key;
    public ErrorInfo reason;

    @Deprecated
    public String recoveryKey;
    public ConnectionState state = ConnectionState.initialized;

    public String createRecoveryKey() {
        String str = this.key;
        if (str == null || str.isEmpty() || this.state == ConnectionState.closing || this.state == ConnectionState.closed || this.state == ConnectionState.failed || this.state == ConnectionState.suspended) {
            return null;
        }
        return new RecoveryKeyContext(this.key, this.connectionManager.msgSerial, this.ably.getChannelSerials()).encode();
    }

    public void connect() {
        this.connectionManager.connect();
    }

    public void ping(CompletionListener completionListener) {
        this.connectionManager.ping(completionListener);
    }

    public void close() {
        this.key = null;
        this.recoveryKey = null;
        this.connectionManager.close();
    }

    Connection(AblyRealtime ablyRealtime, ConnectionManager.Channels channels, PlatformAgentProvider platformAgentProvider, LiveObjectsPlugin liveObjectsPlugin) throws AblyException {
        this.ably = ablyRealtime;
        this.connectionManager = new ConnectionManager(ablyRealtime, this, channels, platformAgentProvider, liveObjectsPlugin);
    }

    public void onConnectionStateChange(ConnectionStateListener.ConnectionStateChange connectionStateChange) {
        this.state = connectionStateChange.current;
        this.reason = connectionStateChange.reason;
        emit(this.state, connectionStateChange);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.ably.lib.util.EventEmitter
    public void apply(ConnectionStateListener connectionStateListener, ConnectionEvent connectionEvent, Object... objArr) {
        try {
            connectionStateListener.onConnectionStateChanged((ConnectionStateListener.ConnectionStateChange) objArr[0]);
        } catch (Throwable th) {
            Log.e(TAG, "Unexpected exception calling ConnectionStateListener", th);
        }
    }

    public void emitUpdate(ErrorInfo errorInfo) {
        if (this.state == ConnectionState.connected) {
            emit((Connection) ConnectionEvent.update, ConnectionStateListener.ConnectionStateChange.createUpdateEvent(errorInfo));
        }
    }

    @Deprecated
    public void emit(ConnectionState connectionState, ConnectionStateListener.ConnectionStateChange connectionStateChange) {
        super.emit((Connection) connectionState.getConnectionEvent(), connectionStateChange);
    }

    @Deprecated
    public void on(ConnectionState connectionState, ConnectionStateListener connectionStateListener) {
        super.on((Connection) connectionState.getConnectionEvent(), (ConnectionEvent) connectionStateListener);
    }

    @Deprecated
    public void once(ConnectionState connectionState, ConnectionStateListener connectionStateListener) {
        super.once((Connection) connectionState.getConnectionEvent(), (ConnectionEvent) connectionStateListener);
    }
}
