package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbhw {
    private final com.google.android.gms.ads.formats.zze zza;
    private final com.google.android.gms.ads.formats.zzd zzb;
    private zzbgr zzc;

    public zzbhw(com.google.android.gms.ads.formats.zze zzeVar, com.google.android.gms.ads.formats.zzd zzdVar) {
        this.zza = zzeVar;
        this.zzb = zzdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized zzbgr zze(zzbgq zzbgqVar) {
        zzbgr zzbgrVar = this.zzc;
        if (zzbgrVar != null) {
            return zzbgrVar;
        }
        zzbgr zzbgrVar2 = new zzbgr(zzbgqVar);
        this.zzc = zzbgrVar2;
        return zzbgrVar2;
    }

    public final zzbhd zza() {
        return new zzbhv(this, null);
    }

    public final zzbha zzb() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbhu(this, null);
    }

    final /* synthetic */ com.google.android.gms.ads.formats.zze zzc() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.ads.formats.zzd zzd() {
        return this.zzb;
    }
}
