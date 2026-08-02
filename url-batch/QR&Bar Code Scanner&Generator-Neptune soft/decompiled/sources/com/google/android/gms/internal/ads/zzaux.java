package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaux implements zzavg {
    public final int[] zza;
    public final long[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    private final long zze;

    public zzaux(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = iArr;
        this.zzb = jArr;
        this.zzc = jArr2;
        this.zzd = jArr3;
        int length = iArr.length;
        if (length <= 0) {
            this.zze = 0L;
        } else {
            int i = length - 1;
            this.zze = jArr2[i] + jArr3[i];
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final long zzb(long j) {
        return this.zzb[zzbar.zzc(this.zzd, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final boolean zzc() {
        return true;
    }
}
