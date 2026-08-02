package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbac implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbad zza;

    zzbac(zzbad zzbadVar) {
        this.zza = zzbadVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        zzbag zzbagVar;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = null;
            zzbad zzbadVar = this.zza;
            zzbagVar = zzbadVar.zzd;
            if (zzbagVar != null) {
                zzbadVar.zzd = null;
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }
}
