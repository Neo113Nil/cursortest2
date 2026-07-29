package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzadt implements zzadr {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long[] zzf;

    private zzadt(long j, int i, long j2, long j3, long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = j3;
        this.zze = j3 != -1 ? j + j3 : -1L;
    }

    public static zzadt zza(long j, long j2, zzzl zzzlVar, zzdy zzdyVar) {
        int zzn;
        int i = zzzlVar.zzg;
        int i2 = zzzlVar.zzd;
        int zze = zzdyVar.zze();
        if ((zze & 1) != 1 || (zzn = zzdyVar.zzn()) == 0) {
            return null;
        }
        long zzw = zzeg.zzw(zzn, i * 1000000, i2);
        if ((zze & 6) != 6) {
            return new zzadt(j2, zzzlVar.zzc, zzw, -1L, null);
        }
        long zzs = zzdyVar.zzs();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = zzdyVar.zzk();
        }
        if (j != -1) {
            long j3 = j2 + zzs;
            if (j != j3) {
                Log.w("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
            }
        }
        return new zzadt(j2, zzzlVar.zzc, zzw, zzs, jArr);
    }

    private final long zzd(int i) {
        return (this.zzc * i) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final long zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final long zzc(long j) {
        double d;
        long j2 = j - this.zza;
        if (!zzh() || j2 <= this.zzb) {
            return 0L;
        }
        long[] jArr = (long[]) zzcw.zzb(this.zzf);
        double d2 = j2;
        Double.isNaN(d2);
        double d3 = this.zzd;
        Double.isNaN(d3);
        double d4 = (d2 * 256.0d) / d3;
        int zzd = zzeg.zzd(jArr, (long) d4, true, true);
        long zzd2 = zzd(zzd);
        long j3 = jArr[zzd];
        int i = zzd + 1;
        long zzd3 = zzd(i);
        long j4 = zzd == 99 ? 256L : jArr[i];
        if (j3 == j4) {
            d = 0.0d;
        } else {
            double d5 = j3;
            Double.isNaN(d5);
            double d6 = j4 - j3;
            Double.isNaN(d6);
            d = (d4 - d5) / d6;
        }
        double d7 = zzd3 - zzd2;
        Double.isNaN(d7);
        return zzd2 + Math.round(d * d7);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzt zzg(long j) {
        if (!zzh()) {
            zzzw zzzwVar = new zzzw(0L, this.zza + this.zzb);
            return new zzzt(zzzwVar, zzzwVar);
        }
        long zzr = zzeg.zzr(j, 0L, this.zzc);
        double d = zzr;
        Double.isNaN(d);
        double d2 = this.zzc;
        Double.isNaN(d2);
        double d3 = (d * 100.0d) / d2;
        double d4 = 0.0d;
        if (d3 > 0.0d) {
            if (d3 >= 100.0d) {
                d4 = 256.0d;
            } else {
                int i = (int) d3;
                double d5 = ((long[]) zzcw.zzb(this.zzf))[i];
                double d6 = i == 99 ? 256.0d : r3[i + 1];
                double d7 = i;
                Double.isNaN(d7);
                Double.isNaN(d5);
                Double.isNaN(d5);
                d4 = d5 + ((d3 - d7) * (d6 - d5));
            }
        }
        double d8 = this.zzd;
        Double.isNaN(d8);
        zzzw zzzwVar2 = new zzzw(zzr, this.zza + zzeg.zzr(Math.round((d4 / 256.0d) * d8), this.zzb, this.zzd - 1));
        return new zzzt(zzzwVar2, zzzwVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final boolean zzh() {
        return this.zzf != null;
    }
}
