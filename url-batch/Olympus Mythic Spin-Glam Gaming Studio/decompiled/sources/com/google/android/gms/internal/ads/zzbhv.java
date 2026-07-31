package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzbhv extends zzcgo {
    final /* synthetic */ zzbib zza;

    zzbhv(zzbib zzbibVar) {
        Objects.requireNonNull(zzbibVar);
        this.zza = zzbibVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgo, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.zza.zzb();
        return super.cancel(z);
    }
}
