package io.ably.lib.types;

import io.ably.lib.transport.Defaults;
import io.ably.lib.util.Log;
import java.io.IOException;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessageUnpacker;

/* loaded from: classes7.dex */
public class ConnectionDetails {
    private static final String TAG = "io.ably.lib.types.ConnectionDetails";
    public String clientId;
    public String connectionKey;
    public Long maxFrameSize;
    public Long maxInboundRate;
    public int maxMessageSize;
    public Long maxOutboundRate;
    public String serverId;
    public Long maxIdleInterval = Long.valueOf(Defaults.maxIdleInterval);
    public Long connectionStateTtl = Long.valueOf(Defaults.connectionStateTtl);

    ConnectionDetails() {
    }

    ConnectionDetails readMsgpack(MessageUnpacker messageUnpacker) throws IOException {
        int unpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < unpackMapHeader; i++) {
            String intern = messageUnpacker.unpackString().intern();
            if (!messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                intern.hashCode();
                switch (intern) {
                    case "maxIdleInterval":
                        this.maxIdleInterval = Long.valueOf(messageUnpacker.unpackLong());
                        break;
                    case "maxFrameSize":
                        this.maxFrameSize = Long.valueOf(messageUnpacker.unpackLong());
                        break;
                    case "connectionKey":
                        this.connectionKey = messageUnpacker.unpackString();
                        break;
                    case "clientId":
                        this.clientId = messageUnpacker.unpackString();
                        break;
                    case "maxInboundRate":
                        this.maxInboundRate = Long.valueOf(messageUnpacker.unpackLong());
                        break;
                    case "serverId":
                        this.serverId = messageUnpacker.unpackString();
                        break;
                    case "maxMessageSize":
                        this.maxMessageSize = messageUnpacker.unpackInt();
                        break;
                    case "connectionStateTtl":
                        this.connectionStateTtl = Long.valueOf(messageUnpacker.unpackLong());
                        break;
                    case "maxOutboundRate":
                        this.maxOutboundRate = Long.valueOf(messageUnpacker.unpackLong());
                        break;
                    default:
                        Log.v(TAG, "Unexpected field: " + intern);
                        messageUnpacker.skipValue();
                        break;
                }
            } else {
                messageUnpacker.unpackNil();
            }
        }
        return this;
    }

    static ConnectionDetails fromMsgpack(MessageUnpacker messageUnpacker) throws IOException {
        return new ConnectionDetails().readMsgpack(messageUnpacker);
    }
}
