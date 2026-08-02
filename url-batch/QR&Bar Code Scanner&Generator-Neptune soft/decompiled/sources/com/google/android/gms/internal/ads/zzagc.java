package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzagc implements zzagi {
    private final zzzv zza;
    private final zzzu zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzagc(zzzv zzzvVar, zzzu zzzuVar) {
        this.zza = zzzvVar;
        this.zzb = zzzuVar;
    }

    public final void zza(long j) {
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final long zzd(zzzj zzzjVar) {
        long j = this.zzd;
        if (j < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final zzaal zze() {
        zzdd.zzf(this.zzc != -1);
        return new zzzt(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final void zzg(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzen.zzd(jArr, j, true, true)];
    }
}
