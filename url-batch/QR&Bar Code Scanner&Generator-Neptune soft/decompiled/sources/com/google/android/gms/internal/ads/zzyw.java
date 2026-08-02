package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzyw implements zzaal {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzyw(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
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

    @Override // com.google.android.gms.internal.ads.zzaal
    public final long zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final zzaaj zzg(long j) {
        int zzd = zzen.zzd(this.zze, j, true, true);
        zzaam zzaamVar = new zzaam(this.zze[zzd], this.zzc[zzd]);
        if (zzaamVar.zzb >= j || zzd == this.zza - 1) {
            return new zzaaj(zzaamVar, zzaamVar);
        }
        int i = zzd + 1;
        return new zzaaj(zzaamVar, new zzaam(this.zze[i], this.zzc[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final boolean zzh() {
        return true;
    }
}
