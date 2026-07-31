package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzbnh implements zzbzq {
    final /* synthetic */ zzbnj zza;

    zzbnh(zzbnj zzbnjVar) {
        Objects.requireNonNull(zzbnjVar);
        this.zza = zzbnjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        this.zza.zzb().zzb();
    }
}
