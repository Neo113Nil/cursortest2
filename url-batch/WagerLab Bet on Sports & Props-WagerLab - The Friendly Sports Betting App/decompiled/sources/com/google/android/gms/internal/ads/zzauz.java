package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzauz extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzava zza;

    zzauz(zzava zzavaVar) {
        Objects.requireNonNull(zzavaVar);
        this.zza = zzavaVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzava.class) {
            this.zza.zzd(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (zzava.class) {
            this.zza.zzd(null);
        }
    }
}
