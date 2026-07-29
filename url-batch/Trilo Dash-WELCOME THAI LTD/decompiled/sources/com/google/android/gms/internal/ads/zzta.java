package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzta implements zztr {
    final /* synthetic */ zztd zza;
    private final int zzb;

    public zzta(zztd zztdVar, int i) {
        this.zza = zztdVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final int zza(zzja zzjaVar, zzgc zzgcVar, int i) {
        return this.zza.zzg(this.zzb, zzjaVar, zzgcVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final int zzb(long j) {
        return this.zza.zzi(this.zzb, j);
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final void zzd() throws IOException {
        this.zza.zzF(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final boolean zze() {
        return this.zza.zzM(this.zzb);
    }
}
