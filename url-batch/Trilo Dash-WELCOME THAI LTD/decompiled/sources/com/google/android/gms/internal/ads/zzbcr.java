package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzbcr implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbct zza;

    zzbcr(zzbct zzbctVar) {
        this.zza = zzbctVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        Object obj2;
        zzbcw zzbcwVar;
        zzbcw zzbcwVar2;
        obj = this.zza.zzb;
        synchronized (obj) {
            try {
                zzbct zzbctVar = this.zza;
                zzbcwVar = zzbctVar.zzc;
                if (zzbcwVar != null) {
                    zzbcwVar2 = zzbctVar.zzc;
                    zzbctVar.zze = zzbcwVar2.zzq();
                }
            } catch (DeadObjectException e) {
                com.google.android.gms.ads.internal.util.zze.zzh("Unable to obtain a cache service instance.", e);
                zzbct.zzh(this.zza);
            }
            obj2 = this.zza.zzb;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Object obj;
        Object obj2;
        obj = this.zza.zzb;
        synchronized (obj) {
            this.zza.zze = null;
            obj2 = this.zza.zzb;
            obj2.notifyAll();
        }
    }
}
