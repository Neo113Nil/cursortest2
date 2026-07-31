package com.apollographql.apollo.network;

import com.apollographql.apollo.network.NetworkObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkObserver.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"NoOpNetworkObserver", "Lcom/apollographql/apollo/network/NetworkObserver;", "getNoOpNetworkObserver", "()Lcom/apollographql/apollo/network/NetworkObserver;", "apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkObserverKt {
    private static final NetworkObserver NoOpNetworkObserver = new NetworkObserver() { // from class: com.apollographql.apollo.network.NetworkObserverKt$NoOpNetworkObserver$1
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // com.apollographql.apollo.network.NetworkObserver
        public void setListener(NetworkObserver.Listener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            listener.networkChanged(true);
        }
    };

    public static final NetworkObserver getNoOpNetworkObserver() {
        return NoOpNetworkObserver;
    }
}
