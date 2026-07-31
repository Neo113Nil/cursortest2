package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzelp implements zzelx {
    final /* synthetic */ zzelq zza;

    zzelp(zzelq zzelqVar) {
        Objects.requireNonNull(zzelqVar);
        this.zza = zzelqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final void zza() {
        zzelq zzelqVar = this.zza;
        synchronized (zzelqVar) {
            zzelqVar.zzM(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzelq zzelqVar = this.zza;
        zzdfa zzdfaVar = (zzdfa) obj;
        synchronized (zzelqVar) {
            zzelqVar.zzM(zzdfaVar);
            zzelqVar.zzL().zzj();
        }
    }
}
