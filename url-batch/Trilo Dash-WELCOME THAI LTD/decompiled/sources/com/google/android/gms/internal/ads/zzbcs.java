package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzbcs implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbct zza;

    zzbcs(zzbct zzbctVar) {
        this.zza = zzbctVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        zzbcw zzbcwVar;
        Object obj2;
        obj = this.zza.zzb;
        synchronized (obj) {
            this.zza.zze = null;
            zzbct zzbctVar = this.zza;
            zzbcwVar = zzbctVar.zzc;
            if (zzbcwVar != null) {
                zzbctVar.zzc = null;
            }
            obj2 = this.zza.zzb;
            obj2.notifyAll();
        }
    }
}
