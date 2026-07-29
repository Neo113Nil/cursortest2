package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzaaz implements zzzv {
    final /* synthetic */ zzzv zza;
    final /* synthetic */ zzaba zzb;

    zzaaz(zzaba zzabaVar, zzzv zzzvVar) {
        this.zzb = zzabaVar;
        this.zza = zzzvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final long zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzt zzg(long j) {
        long j2;
        long j3;
        zzzt zzg = this.zza.zzg(j);
        zzzw zzzwVar = zzg.zza;
        long j4 = zzzwVar.zzb;
        long j5 = zzzwVar.zzc;
        j2 = this.zzb.zzb;
        zzzw zzzwVar2 = new zzzw(j4, j5 + j2);
        zzzw zzzwVar3 = zzg.zzb;
        long j6 = zzzwVar3.zzb;
        long j7 = zzzwVar3.zzc;
        j3 = this.zzb.zzb;
        return new zzzt(zzzwVar2, new zzzw(j6, j7 + j3));
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final boolean zzh() {
        return this.zza.zzh();
    }
}
