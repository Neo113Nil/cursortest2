package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzfxp implements Runnable {
    final /* synthetic */ zzfxu zza;

    zzfxp(zzfxu zzfxuVar) {
        Objects.requireNonNull(zzfxuVar);
        this.zza = zzfxuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzh().zzc();
    }
}
