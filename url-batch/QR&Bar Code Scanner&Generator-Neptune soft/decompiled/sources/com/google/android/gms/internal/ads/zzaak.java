package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public class zzaak implements zzaal {
    private final long zza;
    private final zzaaj zzb;

    public zzaak(long j, long j2) {
        this.zza = j;
        zzaam zzaamVar = j2 == 0 ? zzaam.zza : new zzaam(0L, j2);
        this.zzb = new zzaaj(zzaamVar, zzaamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final long zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final zzaaj zzg(long j) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final boolean zzh() {
        return false;
    }
}
