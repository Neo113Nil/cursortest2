package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeeu implements zzdfv, zzdeo, zzddd {
    private final zzfiq zza;
    private final zzfir zzb;
    private final zzcgc zzc;

    public zzeeu(zzfiq zzfiqVar, zzfir zzfirVar, zzcgc zzcgcVar) {
        this.zza = zzfiqVar;
        this.zzb = zzfirVar;
        this.zzc = zzcgcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfiq zzfiqVar = this.zza;
        zzfiqVar.zza("action", "ftl");
        zzfiqVar.zza("ftl", String.valueOf(zzeVar.zza));
        zzfiqVar.zza("ed", zzeVar.zzc);
        this.zzb.zzb(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdfv
    public final void zzb(zzfdw zzfdwVar) {
        this.zza.zzh(zzfdwVar, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdfv
    public final void zzbE(zzcbc zzcbcVar) {
        this.zza.zzi(zzcbcVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzn() {
        zzfir zzfirVar = this.zzb;
        zzfiq zzfiqVar = this.zza;
        zzfiqVar.zza("action", "loaded");
        zzfirVar.zzb(zzfiqVar);
    }
}
