package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbdw implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbdx zza;

    zzbdw(zzbdx zzbdxVar) {
        this.zza = zzbdxVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        zzbea zzbeaVar;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = null;
            zzbdx zzbdxVar = this.zza;
            zzbeaVar = zzbdxVar.zzd;
            if (zzbeaVar != null) {
                zzbdxVar.zzd = null;
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }
}
