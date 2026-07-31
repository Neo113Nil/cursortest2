package io.ably.lib.objects;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import io.ably.lib.realtime.AblyRealtime;
import io.ably.lib.realtime.ChannelBase;
import io.ably.lib.transport.ConnectionManager;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.util.Log;

/* loaded from: classes7.dex */
public class Adapter implements ObjectsAdapter {
    private static final String TAG = ObjectsAdapter.class.getName();
    private final AblyRealtime ably;

    public Adapter(AblyRealtime ablyRealtime) {
        this.ably = ablyRealtime;
    }

    @Override // io.ably.lib.objects.ObjectsAdapter
    public ClientOptions getClientOptions() {
        return this.ably.options;
    }

    @Override // io.ably.lib.objects.ObjectsAdapter
    public ConnectionManager getConnectionManager() {
        return this.ably.connection.connectionManager;
    }

    @Override // io.ably.lib.objects.ObjectsAdapter
    public long getTime() throws AblyException {
        return this.ably.time();
    }

    @Override // io.ably.lib.objects.ObjectsAdapter
    public ChannelBase getChannel(String str) throws AblyException {
        if (this.ably.channels.containsKey(str)) {
            return this.ably.channels.get(str);
        }
        Log.e(TAG, "attachChannel(): channel not found: " + str);
        throw AblyException.fromErrorInfo(new ErrorInfo("Channel not found: " + str, RCHTTPStatusCodes.NOT_FOUND));
    }
}
