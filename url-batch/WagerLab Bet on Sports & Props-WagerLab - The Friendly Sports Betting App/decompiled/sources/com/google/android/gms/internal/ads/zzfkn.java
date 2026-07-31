package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzfkn extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzfko zza;

    zzfkn(zzfko zzfkoVar) {
        Objects.requireNonNull(zzfkoVar);
        this.zza = zzfkoVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.zza.zzi(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.zza.zzi(false);
    }
}
