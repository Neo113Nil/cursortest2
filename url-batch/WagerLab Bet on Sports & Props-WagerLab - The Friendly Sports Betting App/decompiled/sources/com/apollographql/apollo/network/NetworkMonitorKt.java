package com.apollographql.apollo.network;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"com/apollographql/apollo/network/NetworkMonitorKt__NetworkMonitorKt", "com/apollographql/apollo/network/NetworkMonitorKt__NetworkMonitor_androidKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkMonitorKt {
    public static final NetworkMonitor NetworkMonitor(Context context) {
        return NetworkMonitorKt__NetworkMonitor_androidKt.NetworkMonitor(context);
    }

    public static final Object waitForNetwork(NetworkMonitor networkMonitor, Continuation<? super Unit> continuation) {
        return NetworkMonitorKt__NetworkMonitorKt.waitForNetwork(networkMonitor, continuation);
    }
}
