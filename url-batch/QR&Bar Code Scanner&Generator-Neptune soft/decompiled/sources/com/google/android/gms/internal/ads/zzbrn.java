package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbrn implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzchh zza;
    final /* synthetic */ zzbrp zzb;

    zzbrn(zzbrp zzbrpVar, zzchh zzchhVar) {
        this.zzb = zzbrpVar;
        this.zza = zzchhVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbrc zzbrcVar;
        try {
            zzchh zzchhVar = this.zza;
            zzbrcVar = this.zzb.zza;
            zzchhVar.zzd(zzbrcVar.zzp());
        } catch (DeadObjectException e) {
            this.zza.zze(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zza.zze(new RuntimeException("onConnectionSuspended: " + i));
    }
}
