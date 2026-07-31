package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzeip implements zzhcv {
    final /* synthetic */ zzcbe zza;
    final /* synthetic */ zzcbn zzb;

    zzeip(zzejg zzejgVar, zzcbn zzcbnVar, zzcbe zzcbeVar) {
        this.zzb = zzcbnVar;
        this.zza = zzcbeVar;
        Objects.requireNonNull(zzejgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        try {
            this.zzb.zzf(com.google.android.gms.ads.internal.util.zzba.zza(th));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zzb.zze((String) obj, this.zza);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
        }
    }
}
