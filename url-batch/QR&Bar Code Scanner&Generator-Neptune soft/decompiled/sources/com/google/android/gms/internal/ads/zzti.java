package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzti implements zztz {
    final /* synthetic */ zztl zza;
    private final int zzb;

    public zzti(zztl zztlVar, int i) {
        this.zza = zztlVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zztz
    public final int zza(zzjg zzjgVar, zzgi zzgiVar, int i) {
        return this.zza.zzg(this.zzb, zzjgVar, zzgiVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zztz
    public final int zzb(long j) {
        return this.zza.zzi(this.zzb, j);
    }

    @Override // com.google.android.gms.internal.ads.zztz
    public final void zzd() throws IOException {
        this.zza.zzH(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztz
    public final boolean zze() {
        return this.zza.zzO(this.zzb);
    }
}
