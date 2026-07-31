package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzcam implements Runnable {
    final /* synthetic */ zzcar zza;

    zzcam(zzcar zzcarVar) {
        Objects.requireNonNull(zzcarVar);
        this.zza = zzcarVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzI("surfaceDestroyed", new String[0]);
    }
}
