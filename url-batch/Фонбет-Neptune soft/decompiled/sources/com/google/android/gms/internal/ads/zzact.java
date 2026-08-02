package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzact implements zzadi {
    private final zzacv zza;
    private final long zzb;

    public zzact(zzacv zzacvVar, long j) {
        this.zza = zzacvVar;
        this.zzb = j;
    }

    private final zzadj zzb(long j, long j2) {
        return new zzadj((j * 1000000) / this.zza.zze, this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j) {
        zzdi.zzb(this.zza.zzk);
        zzacv zzacvVar = this.zza;
        zzacu zzacuVar = zzacvVar.zzk;
        long[] jArr = zzacuVar.zza;
        long[] jArr2 = zzacuVar.zzb;
        int zzc = zzet.zzc(jArr, zzacvVar.zzb(j), true, false);
        zzadj zzb = zzb(zzc == -1 ? 0L : jArr[zzc], zzc != -1 ? jArr2[zzc] : 0L);
        if (zzb.zzb == j || zzc == jArr.length - 1) {
            return new zzadg(zzb, zzb);
        }
        int i = zzc + 1;
        return new zzadg(zzb, zzb(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return true;
    }
}
