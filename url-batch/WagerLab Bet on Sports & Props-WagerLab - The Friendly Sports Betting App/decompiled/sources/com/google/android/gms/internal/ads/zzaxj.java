package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzaxj implements Runnable {
    final /* synthetic */ zzaxk zza;

    zzaxj(zzaxk zzaxkVar) {
        Objects.requireNonNull(zzaxkVar);
        this.zza = zzaxkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
