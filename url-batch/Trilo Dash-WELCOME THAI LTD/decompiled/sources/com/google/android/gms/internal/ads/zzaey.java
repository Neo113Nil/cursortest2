package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzaey implements zzzv {
    final /* synthetic */ zzaez zza;

    /* synthetic */ zzaey(zzaez zzaezVar, zzaex zzaexVar) {
        this.zza = zzaezVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final long zze() {
        zzafl zzaflVar;
        long j;
        zzaez zzaezVar = this.zza;
        zzaflVar = zzaezVar.zzd;
        j = zzaezVar.zzf;
        return zzaflVar.zzf(j);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzt zzg(long j) {
        zzafl zzaflVar;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        zzaez zzaezVar = this.zza;
        zzaflVar = zzaezVar.zzd;
        long zzg = zzaflVar.zzg(j);
        j2 = zzaezVar.zzb;
        j3 = zzaezVar.zzc;
        j4 = zzaezVar.zzb;
        j5 = zzaezVar.zzf;
        long j8 = (zzg * (j3 - j4)) / j5;
        j6 = zzaezVar.zzb;
        j7 = zzaezVar.zzc;
        zzzw zzzwVar = new zzzw(j, zzeg.zzr((-30000) + j2 + j8, j6, j7 - 1));
        return new zzzt(zzzwVar, zzzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final boolean zzh() {
        return true;
    }
}
