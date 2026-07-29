package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzsq implements zztr {
    private final zztr zza;
    private final long zzb;

    public zzsq(zztr zztrVar, long j) {
        this.zza = zztrVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final int zza(zzja zzjaVar, zzgc zzgcVar, int i) {
        int zza = this.zza.zza(zzjaVar, zzgcVar, i);
        if (zza != -4) {
            return zza;
        }
        zzgcVar.zzd = Math.max(0L, zzgcVar.zzd + this.zzb);
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final int zzb(long j) {
        return this.zza.zzb(j - this.zzb);
    }

    public final zztr zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final boolean zze() {
        return this.zza.zze();
    }
}
