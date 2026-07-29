package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzyk implements zzzv {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzyk(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
        } else {
            int i = length - 1;
            this.zzf = jArr2[i] + jArr3[i];
        }
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.zza + ", sizes=" + Arrays.toString(this.zzb) + ", offsets=" + Arrays.toString(this.zzc) + ", timeUs=" + Arrays.toString(this.zze) + ", durationsUs=" + Arrays.toString(this.zzd) + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final long zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzt zzg(long j) {
        int zzd = zzeg.zzd(this.zze, j, true, true);
        zzzw zzzwVar = new zzzw(this.zze[zzd], this.zzc[zzd]);
        if (zzzwVar.zzb >= j || zzd == this.zza - 1) {
            return new zzzt(zzzwVar, zzzwVar);
        }
        int i = zzd + 1;
        return new zzzt(zzzwVar, new zzzw(this.zze[i], this.zzc[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final boolean zzh() {
        return true;
    }
}
