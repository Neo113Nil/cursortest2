package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaeu implements zzaes {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long[] zzf;

    private zzaeu(long j, int i, long j2, long j3, long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = j3;
        this.zze = j3 != -1 ? j + j3 : -1L;
    }

    public static zzaeu zza(long j, long j2, zzaab zzaabVar, zzef zzefVar) {
        int zzn;
        int i = zzaabVar.zzg;
        int i2 = zzaabVar.zzd;
        int zze = zzefVar.zze();
        if ((zze & 1) != 1 || (zzn = zzefVar.zzn()) == 0) {
            return null;
        }
        long zzw = zzen.zzw(zzn, i * 1000000, i2);
        if ((zze & 6) != 6) {
            return new zzaeu(j2, zzaabVar.zzc, zzw, -1L, null);
        }
        long zzs = zzefVar.zzs();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = zzefVar.zzk();
        }
        if (j != -1) {
            long j3 = j2 + zzs;
            if (j != j3) {
                zzdw.zze("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
            }
        }
        return new zzaeu(j2, zzaabVar.zzc, zzw, zzs, jArr);
    }

    private final long zzd(int i) {
        return (this.zzc * i) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zzc(long j) {
        long j2 = j - this.zza;
        if (!zzh() || j2 <= this.zzb) {
            return 0L;
        }
        long[] jArr = (long[]) zzdd.zzb(this.zzf);
        double d = (j2 * 256.0d) / this.zzd;
        int zzd = zzen.zzd(jArr, (long) d, true, true);
        long zzd2 = zzd(zzd);
        long j3 = jArr[zzd];
        int i = zzd + 1;
        long zzd3 = zzd(i);
        return zzd2 + Math.round((j3 == (zzd == 99 ? 256L : jArr[i]) ? 0.0d : (d - j3) / (r0 - j3)) * (zzd3 - zzd2));
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final zzaaj zzg(long j) {
        if (!zzh()) {
            zzaam zzaamVar = new zzaam(0L, this.zza + this.zzb);
            return new zzaaj(zzaamVar, zzaamVar);
        }
        long zzr = zzen.zzr(j, 0L, this.zzc);
        double d = (zzr * 100.0d) / this.zzc;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                double d3 = ((long[]) zzdd.zzb(this.zzf))[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : r3[i + 1]) - d3));
            }
        }
        zzaam zzaamVar2 = new zzaam(zzr, this.zza + zzen.zzr(Math.round((d2 / 256.0d) * this.zzd), this.zzb, this.zzd - 1));
        return new zzaaj(zzaamVar2, zzaamVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final boolean zzh() {
        return this.zzf != null;
    }
}
