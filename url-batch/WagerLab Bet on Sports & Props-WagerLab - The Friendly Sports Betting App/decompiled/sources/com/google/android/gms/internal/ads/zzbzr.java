package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzbzr implements zzgoq {
    final /* synthetic */ zzbzt zza;

    zzbzr(zzbzt zzbztVar) {
        Objects.requireNonNull(zzbztVar);
        this.zza = zzbztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        this.zza.zzj().set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zzb(Object obj) {
        this.zza.zzj().set(1);
    }
}
