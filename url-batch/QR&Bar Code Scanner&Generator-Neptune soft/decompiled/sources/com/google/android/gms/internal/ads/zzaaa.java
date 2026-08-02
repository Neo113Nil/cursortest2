package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaaa implements zzaal {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final boolean zzd;

    public zzaaa(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzdd.zzd(length == length2);
        boolean z = length2 > 0;
        this.zzd = z;
        if (!z || jArr2[0] <= 0) {
            this.zza = jArr;
            this.zzb = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.zza = jArr3;
            long[] jArr4 = new long[i];
            this.zzb = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final zzaaj zzg(long j) {
        if (!this.zzd) {
            zzaam zzaamVar = zzaam.zza;
            return new zzaaj(zzaamVar, zzaamVar);
        }
        int zzd = zzen.zzd(this.zzb, j, true, true);
        zzaam zzaamVar2 = new zzaam(this.zzb[zzd], this.zza[zzd]);
        if (zzaamVar2.zzb != j) {
            long[] jArr = this.zzb;
            if (zzd != jArr.length - 1) {
                int i = zzd + 1;
                return new zzaaj(zzaamVar2, new zzaam(jArr[i], this.zza[i]));
            }
        }
        return new zzaaj(zzaamVar2, zzaamVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final boolean zzh() {
        return this.zzd;
    }
}
