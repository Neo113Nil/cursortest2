package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaxx implements zzayo {
    final /* synthetic */ zzaxy zza;
    private final int zzb;

    public zzaxx(zzaxy zzaxyVar, int i) {
        this.zza = zzaxyVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzayo
    public final int zzb(zzasx zzasxVar, zzaur zzaurVar, boolean z) {
        return this.zza.zze(this.zzb, zzasxVar, zzaurVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzayo
    public final void zzc() throws IOException {
        this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzayo
    public final void zzd(long j) {
        this.zza.zzy(this.zzb, j);
    }

    @Override // com.google.android.gms.internal.ads.zzayo
    public final boolean zze() {
        return this.zza.zzA(this.zzb);
    }
}
