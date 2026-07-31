package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes.dex */
public class zzafx implements zzahk {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;
    private final boolean zzg;

    protected zzafx(long j, long j2, int i, int i2, boolean z, boolean z2) {
        long zzf;
        this.zza = j;
        this.zzb = j2;
        this.zzc = i2 == -1 ? 1 : i2;
        this.zze = i;
        this.zzg = z2;
        if (j == -1) {
            this.zzd = -1L;
            zzf = -9223372036854775807L;
        } else {
            this.zzd = j - j2;
            zzf = zzf(j, j2, i);
        }
        this.zzf = zzf;
    }

    private static long zzf(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return this.zzd != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi zzc(long j) {
        long j2 = this.zzd;
        if (j2 == -1) {
            zzahl zzahlVar = new zzahl(0L, this.zzb);
            return new zzahi(zzahlVar, zzahlVar);
        }
        long j3 = this.zzc;
        long j4 = (((this.zze * j) / 8000000) / j3) * j3;
        if (j2 != -1) {
            j4 = Math.min(j4, j2 - j3);
        }
        long max = this.zzb + Math.max(j4, 0L);
        long zze = zze(max);
        zzahl zzahlVar2 = new zzahl(zze, max);
        if (j2 != -1 && zze < j) {
            long j5 = max + j3;
            if (j5 < this.zza) {
                return new zzahi(zzahlVar2, new zzahl(zze(j5), j5));
            }
        }
        return new zzahi(zzahlVar2, zzahlVar2);
    }

    public final long zze(long j) {
        return zzf(j, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzj() {
        return this.zzg;
    }
}
