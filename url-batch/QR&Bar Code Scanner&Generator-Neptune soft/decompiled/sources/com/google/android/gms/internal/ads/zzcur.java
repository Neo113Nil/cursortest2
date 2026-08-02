package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcur implements zzddd {
    private final zzfdn zza;
    private final zzfdw zzb;
    private final zzfki zzc;
    private final zzfkm zzd;

    public zzcur(zzfdw zzfdwVar, zzfkm zzfkmVar, zzfki zzfkiVar) {
        this.zzb = zzfdwVar;
        this.zzd = zzfkmVar;
        this.zzc = zzfkiVar;
        this.zza = zzfdwVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzd.zzd(this.zzc.zzc(this.zzb, null, this.zza.zza));
    }
}
