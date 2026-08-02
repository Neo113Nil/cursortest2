package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdxb implements zzdfv, zzdeo, zzddd {
    private final zzdxl zza;
    private final zzdxv zzb;

    public zzdxb(zzdxl zzdxlVar, zzdxv zzdxvVar) {
        this.zza = zzdxlVar;
        this.zzb = zzdxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza.zza().put("action", "ftl");
        this.zza.zza().put("ftl", String.valueOf(zzeVar.zza));
        this.zza.zza().put("ed", zzeVar.zzc);
        this.zzb.zze(this.zza.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzdfv
    public final void zzb(zzfdw zzfdwVar) {
        this.zza.zzb(zzfdwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdfv
    public final void zzbE(zzcbc zzcbcVar) {
        this.zza.zzc(zzcbcVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzn() {
        this.zza.zza().put("action", "loaded");
        this.zzb.zze(this.zza.zza());
    }
}
