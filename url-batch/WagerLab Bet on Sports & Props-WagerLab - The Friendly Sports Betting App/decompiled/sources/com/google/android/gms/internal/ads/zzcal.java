package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzcal implements Runnable {
    final /* synthetic */ zzcar zza;

    zzcal(zzcar zzcarVar) {
        Objects.requireNonNull(zzcarVar);
        this.zza = zzcarVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzI("surfaceCreated", new String[0]);
    }
}
