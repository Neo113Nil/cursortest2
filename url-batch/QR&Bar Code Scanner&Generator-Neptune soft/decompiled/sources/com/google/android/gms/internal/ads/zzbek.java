package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbek implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzchh zza;
    final /* synthetic */ zzbel zzb;

    zzbek(zzbel zzbelVar, zzchh zzchhVar) {
        this.zzb = zzbelVar;
        this.zza = zzchhVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        obj = this.zzb.zzd;
        synchronized (obj) {
            this.zza.zze(new RuntimeException("Connection failed."));
        }
    }
}
