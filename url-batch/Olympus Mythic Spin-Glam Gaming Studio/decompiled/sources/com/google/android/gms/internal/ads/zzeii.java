package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzeii implements zzegu {
    final /* synthetic */ zzeil zza;

    zzeii(zzeil zzeilVar) {
        Objects.requireNonNull(zzeilVar);
        this.zza = zzeilVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegu
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpT)).booleanValue()) {
            zzeai zza = this.zza.zzd().zza();
            zza.zzc("action", "ptard");
            zza.zzc("ptard", "r");
            zza.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzegu
    public final void zzb(RemoteException remoteException) {
        this.zza.zzc();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpU)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(remoteException, "Preconnect Remote");
        }
    }
}
