package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzzd implements zzzv {
    private final zzzf zza;
    private final long zzb;

    public zzzd(zzzf zzzfVar, long j) {
        this.zza = zzzfVar;
        this.zzb = j;
    }

    private final zzzw zza(long j, long j2) {
        return new zzzw((j * 1000000) / this.zza.zze, this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final long zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzt zzg(long j) {
        zzcw.zzb(this.zza.zzk);
        zzzf zzzfVar = this.zza;
        zzze zzzeVar = zzzfVar.zzk;
        long[] jArr = zzzeVar.zza;
        long[] jArr2 = zzzeVar.zzb;
        int zzd = zzeg.zzd(jArr, zzzfVar.zzb(j), true, false);
        zzzw zza = zza(zzd == -1 ? 0L : jArr[zzd], zzd != -1 ? jArr2[zzd] : 0L);
        if (zza.zzb == j || zzd == jArr.length - 1) {
            return new zzzt(zza, zza);
        }
        int i = zzd + 1;
        return new zzzt(zza, zza(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final boolean zzh() {
        return true;
    }
}
