package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzawt implements zzaxk {
    final /* synthetic */ zzawu zza;
    private final int zzb;

    public zzawt(zzawu zzawuVar, int i) {
        this.zza = zzawuVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzaxk
    public final int zzb(zzart zzartVar, zzatn zzatnVar, boolean z) {
        return this.zza.zze(this.zzb, zzartVar, zzatnVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaxk
    public final void zzc() throws IOException {
        this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzaxk
    public final void zzd(long j) {
        this.zza.zzy(this.zzb, j);
    }

    @Override // com.google.android.gms.internal.ads.zzaxk
    public final boolean zze() {
        return this.zza.zzA(this.zzb);
    }
}
