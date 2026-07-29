package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzbqc implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzcga zza;
    final /* synthetic */ zzbqe zzb;

    zzbqc(zzbqe zzbqeVar, zzcga zzcgaVar) {
        this.zzb = zzbqeVar;
        this.zza = zzcgaVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbpr zzbprVar;
        try {
            zzcga zzcgaVar = this.zza;
            zzbprVar = this.zzb.zza;
            zzcgaVar.zzd(zzbprVar.zzp());
        } catch (DeadObjectException e) {
            this.zza.zze(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zza.zze(new RuntimeException("onConnectionSuspended: " + i));
    }
}
