package com.apollographql.apollo.network;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import com.apollographql.apollo.network.NetworkObserver;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkObserver.android.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/apollographql/apollo/network/AndroidNetworkObserver;", "Lcom/apollographql/apollo/network/NetworkObserver;", "connectivityManager", "Landroid/net/ConnectivityManager;", "<init>", "(Landroid/net/ConnectivityManager;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljava/lang/ref/WeakReference;", "Lcom/apollographql/apollo/network/NetworkObserver$Listener;", "onlineNetworks", "", "", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "onConnectivityChange", "", "isOnline", "", InAppPurchaseConstants.METHOD_SET_LISTENER, "close", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidNetworkObserver implements NetworkObserver {
    private final ConnectivityManager connectivityManager;
    private WeakReference<NetworkObserver.Listener> listener;
    private final ConnectivityManager.NetworkCallback networkCallback;
    private Set<Long> onlineNetworks;

    public AndroidNetworkObserver(ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        this.connectivityManager = connectivityManager;
        this.onlineNetworks = new LinkedHashSet();
        this.networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.apollographql.apollo.network.AndroidNetworkObserver$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                Set set;
                Set set2;
                Intrinsics.checkNotNullParameter(network, "network");
                set = AndroidNetworkObserver.this.onlineNetworks;
                set.add(Long.valueOf(network.getNetworkHandle()));
                AndroidNetworkObserver androidNetworkObserver = AndroidNetworkObserver.this;
                set2 = androidNetworkObserver.onlineNetworks;
                androidNetworkObserver.onConnectivityChange(!set2.isEmpty());
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                Set set;
                Set set2;
                Intrinsics.checkNotNullParameter(network, "network");
                set = AndroidNetworkObserver.this.onlineNetworks;
                set.remove(Long.valueOf(network.getNetworkHandle()));
                AndroidNetworkObserver androidNetworkObserver = AndroidNetworkObserver.this;
                set2 = androidNetworkObserver.onlineNetworks;
                androidNetworkObserver.onConnectivityChange(!set2.isEmpty());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConnectivityChange(boolean isOnline) {
        WeakReference<NetworkObserver.Listener> weakReference = this.listener;
        Intrinsics.checkNotNull(weakReference);
        NetworkObserver.Listener listener = weakReference.get();
        if (listener == null) {
            close();
        } else {
            listener.networkChanged(isOnline);
        }
    }

    @Override // com.apollographql.apollo.network.NetworkObserver
    public void setListener(NetworkObserver.Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.listener != null) {
            throw new IllegalStateException("There can be only one listener".toString());
        }
        NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
        this.listener = new WeakReference<>(listener);
        this.connectivityManager.registerNetworkCallback(build, this.networkCallback);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.connectivityManager.unregisterNetworkCallback(this.networkCallback);
        this.listener = null;
    }
}
