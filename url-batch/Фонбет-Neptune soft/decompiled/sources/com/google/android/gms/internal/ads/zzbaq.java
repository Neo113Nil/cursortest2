package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbaq implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbzt zza;
    final /* synthetic */ zzbar zzb;

    zzbaq(zzbar zzbarVar, zzbzt zzbztVar) {
        this.zza = zzbztVar;
        this.zzb = zzbarVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        obj = this.zzb.zzd;
        synchronized (obj) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
