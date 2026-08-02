package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzawr {
    public final int zza;
    public final long[] zzb;
    public final int[] zzc;
    public final int zzd;
    public final long[] zze;
    public final int[] zzf;

    public zzawr(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        int length = jArr2.length;
        zzbac.zzc(iArr.length == length);
        int length2 = jArr.length;
        zzbac.zzc(length2 == length);
        zzbac.zzc(iArr2.length == length);
        this.zzb = jArr;
        this.zzc = iArr;
        this.zzd = i;
        this.zze = jArr2;
        this.zzf = iArr2;
        this.zza = length2;
    }

    public final int zza(long j) {
        for (int zzc = zzbar.zzc(this.zze, j, true, false); zzc >= 0; zzc--) {
            if ((this.zzf[zzc] & 1) != 0) {
                return zzc;
            }
        }
        return -1;
    }

    public final int zzb(long j) {
        for (int zzb = zzbar.zzb(this.zze, j, true, false); zzb < this.zze.length; zzb++) {
            if ((this.zzf[zzb] & 1) != 0) {
                return zzb;
            }
        }
        return -1;
    }
}
