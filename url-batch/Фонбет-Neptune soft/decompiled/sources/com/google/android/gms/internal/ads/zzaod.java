package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaod implements zzadi {
    private final zzaoa zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaod(zzaoa zzaoaVar, int i, long j, long j2) {
        this.zza = zzaoaVar;
        this.zzb = i;
        this.zzc = j;
        long j3 = (j2 - j) / zzaoaVar.zzd;
        this.zzd = j3;
        this.zze = zzb(j3);
    }

    private final long zzb(long j) {
        return zzet.zzt(j * this.zzb, 1000000L, this.zza.zzc, RoundingMode.FLOOR);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j) {
        long max = Math.max(0L, Math.min((this.zza.zzc * j) / (this.zzb * 1000000), this.zzd - 1));
        long zzb = zzb(max);
        zzadj zzadjVar = new zzadj(zzb, this.zzc + (this.zza.zzd * max));
        if (zzb >= j || max == this.zzd - 1) {
            return new zzadg(zzadjVar, zzadjVar);
        }
        long j2 = max + 1;
        return new zzadg(zzadjVar, new zzadj(zzb(j2), this.zzc + (j2 * this.zza.zzd)));
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return true;
    }
}
