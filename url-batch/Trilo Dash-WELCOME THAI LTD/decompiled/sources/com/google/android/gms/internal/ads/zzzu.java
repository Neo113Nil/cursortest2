package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public class zzzu implements zzzv {
    private final long zza;
    private final zzzt zzb;

    public zzzu(long j, long j2) {
        this.zza = j;
        zzzw zzzwVar = j2 == 0 ? zzzw.zza : new zzzw(0L, j2);
        this.zzb = new zzzt(zzzwVar, zzzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final long zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzt zzg(long j) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final boolean zzh() {
        return false;
    }
}
