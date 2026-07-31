package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzali implements zzalf {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;

    @Nullable
    private final long[] zzg;

    private zzali(long j, int i, long j2, int i2, long j3, @Nullable long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzd = i2;
        this.zze = j3;
        this.zzg = jArr;
        this.zzf = j3 != -1 ? j + j3 : -1L;
    }

    @Nullable
    public static zzali zze(zzalh zzalhVar, long j, long j2) {
        long j3;
        long zzb = zzalhVar.zzb();
        if (zzb == -9223372036854775807L) {
            return null;
        }
        long j4 = zzalhVar.zzc;
        if (j4 == -1 || j2 == -1 || j + j4 == j2) {
            j3 = j4;
        } else {
            long j5 = j2 - j;
            StringBuilder sb = new StringBuilder(String.valueOf(j5).length() + 53 + String.valueOf(j4).length() + 23);
            sb.append("Data size mismatch between stream (");
            sb.append(j5);
            sb.append(") and Xing frame (");
            sb.append(j4);
            sb.append("), using smaller value.");
            zzeh.zzb("XingSeeker", sb.toString());
            j3 = Math.min(j4, j5);
        }
        zzahe zzaheVar = zzalhVar.zza;
        return new zzali(j, zzaheVar.zzc, zzb, zzaheVar.zzf, j3, zzalhVar.zzg);
    }

    private final long zzi(int i) {
        return (this.zzc * i) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return this.zzg != null;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi zzc(long j) {
        if (!zzb()) {
            zzahl zzahlVar = new zzahl(0L, this.zza + this.zzb);
            return new zzahi(zzahlVar, zzahlVar);
        }
        long j2 = this.zzc;
        String str = zzfm.zza;
        long max = Math.max(0L, Math.min(j, j2));
        double d = (max * 100.0d) / j2;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.zzg;
                jArr.getClass();
                double d3 = jArr[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        long j3 = this.zze;
        zzahl zzahlVar2 = new zzahl(max, this.zza + Math.max(this.zzb, Math.min(Math.round((d2 / 256.0d) * j3), j3 - 1)));
        return new zzahi(zzahlVar2, zzahlVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    public final long zzf(long j) {
        if (!zzb()) {
            return 0L;
        }
        long j2 = j - this.zza;
        if (j2 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzg;
        jArr.getClass();
        double d = (j2 * 256.0d) / this.zze;
        int zzo = zzfm.zzo(jArr, (long) d, true, true);
        long zzi = zzi(zzo);
        long j3 = jArr[zzo];
        int i = zzo + 1;
        long zzi2 = zzi(i);
        return zzi + Math.round((j3 == (zzo == 99 ? 256L : jArr[i]) ? 0.0d : (d - j3) / (r0 - j3)) * (zzi2 - zzi));
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    public final long zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    public final int zzh() {
        return this.zzd;
    }
}
