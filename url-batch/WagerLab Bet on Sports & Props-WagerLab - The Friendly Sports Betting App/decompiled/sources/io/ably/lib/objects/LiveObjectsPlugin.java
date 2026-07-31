package io.ably.lib.objects;

import io.ably.lib.realtime.ChannelState;
import io.ably.lib.types.ProtocolMessage;

/* loaded from: classes7.dex */
public interface LiveObjectsPlugin {
    void dispose();

    void dispose(String str);

    RealtimeObjects getInstance(String str);

    void handle(ProtocolMessage protocolMessage);

    void handleStateChange(String str, ChannelState channelState, boolean z);
}
