package com.google.android.gms.internal.ads;

import androidx.media3.common.C;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public class zzack implements zzadv {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzack(long j, long j2, int i, int i2, boolean z) {
        long zze;
        this.zza = j;
        this.zzb = j2;
        this.zzc = i2 == -1 ? 1 : i2;
        this.zze = i;
        if (j == -1) {
            this.zzd = -1L;
            zze = C.TIME_UNSET;
        } else {
            this.zzd = j - j2;
            zze = zze(j, j2, i);
        }
        this.zzf = zze;
    }

    private static long zze(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return this.zzd != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        long j2 = this.zzd;
        if (j2 == -1) {
            zzadw zzadwVar = new zzadw(0L, this.zzb);
            return new zzadt(zzadwVar, zzadwVar);
        }
        long j3 = this.zzc;
        long j4 = (((this.zze * j) / 8000000) / j3) * j3;
        if (j2 != -1) {
            j4 = Math.min(j4, j2 - j3);
        }
        long max = this.zzb + Math.max(j4, 0L);
        long zzd = zzd(max);
        zzadw zzadwVar2 = new zzadw(zzd, max);
        if (j2 != -1 && zzd < j) {
            long j5 = max + j3;
            if (j5 < this.zza) {
                return new zzadt(zzadwVar2, new zzadw(zzd(j5), j5));
            }
        }
        return new zzadt(zzadwVar2, zzadwVar2);
    }

    public final long zzd(long j) {
        return zze(j, this.zzb, this.zze);
    }
}
