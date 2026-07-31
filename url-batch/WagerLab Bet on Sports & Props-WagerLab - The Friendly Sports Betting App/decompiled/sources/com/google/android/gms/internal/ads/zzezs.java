package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzezs implements zzfab {
    private final zzfab zza;
    private zzcuz zzb;

    public zzezs(zzfab zzfabVar) {
        this.zza = zzfabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfab
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcuz zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfab
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfac zzfacVar, zzfaa zzfaaVar, Object obj) {
        return zzb(zzfacVar, zzfaaVar, null);
    }

    public final synchronized ListenableFuture zzb(zzfac zzfacVar, zzfaa zzfaaVar, zzcuz zzcuzVar) {
        zzbuv zzbuvVar;
        this.zzb = zzcuzVar;
        if (zzcuzVar == null || (zzbuvVar = zzfacVar.zza) == null) {
            zzcuz zzcuzVar2 = zzcuzVar;
            return ((zzezr) this.zza).zzb(zzfacVar, zzfaaVar, zzcuzVar);
        }
        zzcrw zza = zzcuzVar.zza();
        return zza.zzc(zza.zza(zzgot.zza(zzbuvVar)));
    }
}
