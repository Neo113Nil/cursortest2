package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzdya implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzbzt zza = new zzbzt();
    protected final Object zzb = new Object();
    protected boolean zzc = false;
    protected boolean zzd = false;
    protected zzbvb zze;
    protected zzbty zzf;

    static void zzc(Context context, ListenableFuture listenableFuture, Executor executor) {
        if (((Boolean) zzbdk.zzj.zze()).booleanValue() || ((Boolean) zzbdk.zzh.zze()).booleanValue()) {
            zzgcj.zzr(listenableFuture, new zzdxy(context), executor);
        }
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        com.google.android.gms.ads.internal.util.client.zzm.zze("Disconnected from remote ad request service.");
        this.zza.zzd(new zzdyp(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        com.google.android.gms.ads.internal.util.client.zzm.zze("Cannot connect to remote service, fallback to local instance.");
    }

    protected final void zzb() {
        synchronized (this.zzb) {
            this.zzd = true;
            if (this.zzf.isConnected() || this.zzf.isConnecting()) {
                this.zzf.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }
}
