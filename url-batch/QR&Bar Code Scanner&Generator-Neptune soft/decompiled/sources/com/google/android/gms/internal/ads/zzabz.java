package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzabz extends zzzw {
    private final long zza;

    public zzabz(zzzj zzzjVar, long j) {
        super(zzzjVar);
        zzdd.zzd(zzzjVar.zzf() >= j);
        this.zza = j;
    }

    @Override // com.google.android.gms.internal.ads.zzzw, com.google.android.gms.internal.ads.zzzj
    public final long zzd() {
        return super.zzd() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzzw, com.google.android.gms.internal.ads.zzzj
    public final long zze() {
        return super.zze() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzzw, com.google.android.gms.internal.ads.zzzj
    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
