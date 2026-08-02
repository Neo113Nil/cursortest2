package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaja implements zzaal {
    private final zzaix zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaja(zzaix zzaixVar, int i, long j, long j2) {
        this.zza = zzaixVar;
        this.zzb = i;
        this.zzc = j;
        long j3 = (j2 - j) / zzaixVar.zzd;
        this.zzd = j3;
        this.zze = zza(j3);
    }

    private final long zza(long j) {
        return zzen.zzw(j * this.zzb, 1000000L, this.zza.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final long zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final zzaaj zzg(long j) {
        long zzr = zzen.zzr((this.zza.zzc * j) / (this.zzb * 1000000), 0L, this.zzd - 1);
        long j2 = this.zzc;
        int i = this.zza.zzd;
        long zza = zza(zzr);
        zzaam zzaamVar = new zzaam(zza, j2 + (i * zzr));
        if (zza >= j || zzr == this.zzd - 1) {
            return new zzaaj(zzaamVar, zzaamVar);
        }
        long j3 = zzr + 1;
        return new zzaaj(zzaamVar, new zzaam(zza(j3), this.zzc + (j3 * this.zza.zzd)));
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final boolean zzh() {
        return true;
    }
}
