package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbdv implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbdx zza;

    zzbdv(zzbdx zzbdxVar) {
        this.zza = zzbdxVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        Object obj2;
        zzbea zzbeaVar;
        zzbea zzbeaVar2;
        obj = this.zza.zzc;
        synchronized (obj) {
            try {
                zzbdx zzbdxVar = this.zza;
                zzbeaVar = zzbdxVar.zzd;
                if (zzbeaVar != null) {
                    zzbeaVar2 = zzbdxVar.zzd;
                    zzbdxVar.zzf = zzbeaVar2.zzq();
                }
            } catch (DeadObjectException e) {
                com.google.android.gms.ads.internal.util.zze.zzh("Unable to obtain a cache service instance.", e);
                zzbdx.zzh(this.zza);
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Object obj;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = null;
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }
}
