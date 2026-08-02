package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzzt implements zzaal {
    private final zzzv zza;
    private final long zzb;

    public zzzt(zzzv zzzvVar, long j) {
        this.zza = zzzvVar;
        this.zzb = j;
    }

    private final zzaam zza(long j, long j2) {
        return new zzaam((j * 1000000) / this.zza.zze, this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final long zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final zzaaj zzg(long j) {
        zzdd.zzb(this.zza.zzk);
        zzzv zzzvVar = this.zza;
        zzzu zzzuVar = zzzvVar.zzk;
        long[] jArr = zzzuVar.zza;
        long[] jArr2 = zzzuVar.zzb;
        int zzd = zzen.zzd(jArr, zzzvVar.zzb(j), true, false);
        zzaam zza = zza(zzd == -1 ? 0L : jArr[zzd], zzd != -1 ? jArr2[zzd] : 0L);
        if (zza.zzb == j || zzd == jArr.length - 1) {
            return new zzaaj(zza, zza);
        }
        int i = zzd + 1;
        return new zzaaj(zza, zza(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final boolean zzh() {
        return true;
    }
}
