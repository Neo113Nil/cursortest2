package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzahy implements zzzv {
    private final zzahv zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzahy(zzahv zzahvVar, int i, long j, long j2) {
        this.zza = zzahvVar;
        this.zzb = i;
        this.zzc = j;
        long j3 = (j2 - j) / zzahvVar.zzd;
        this.zzd = j3;
        this.zze = zza(j3);
    }

    private final long zza(long j) {
        return zzeg.zzw(j * this.zzb, 1000000L, this.zza.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final long zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzt zzg(long j) {
        long zzr = zzeg.zzr((this.zza.zzc * j) / (this.zzb * 1000000), 0L, this.zzd - 1);
        long j2 = this.zzc;
        int i = this.zza.zzd;
        long zza = zza(zzr);
        zzzw zzzwVar = new zzzw(zza, j2 + (i * zzr));
        if (zza >= j || zzr == this.zzd - 1) {
            return new zzzt(zzzwVar, zzzwVar);
        }
        long j3 = zzr + 1;
        return new zzzt(zzzwVar, new zzzw(zza(j3), this.zzc + (j3 * this.zza.zzd)));
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final boolean zzh() {
        return true;
    }
}
