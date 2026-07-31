package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzezr implements zzfab {
    private zzcuz zza;

    @Override // com.google.android.gms.internal.ads.zzfab
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcuz zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfab
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfac zzfacVar, zzfaa zzfaaVar, Object obj) {
        return zzb(zzfacVar, zzfaaVar, null);
    }

    public final synchronized ListenableFuture zzb(zzfac zzfacVar, zzfaa zzfaaVar, zzcuz zzcuzVar) {
        zzcrw zza;
        if (zzcuzVar != null) {
            this.zza = zzcuzVar;
        } else {
            this.zza = (zzcuz) zzfaaVar.zza(zzfacVar.zzb).zzh();
        }
        zza = this.zza.zza();
        return zza.zzc(zza.zzb());
    }
}
