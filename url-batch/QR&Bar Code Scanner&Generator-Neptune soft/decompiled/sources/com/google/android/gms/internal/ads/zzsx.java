package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzsx implements zztz {
    private final zztz zza;
    private final long zzb;

    public zzsx(zztz zztzVar, long j) {
        this.zza = zztzVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zztz
    public final int zza(zzjg zzjgVar, zzgi zzgiVar, int i) {
        int zza = this.zza.zza(zzjgVar, zzgiVar, i);
        if (zza != -4) {
            return zza;
        }
        zzgiVar.zzd = Math.max(0L, zzgiVar.zzd + this.zzb);
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zztz
    public final int zzb(long j) {
        return this.zza.zzb(j - this.zzb);
    }

    public final zztz zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zztz
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zztz
    public final boolean zze() {
        return this.zza.zze();
    }
}
