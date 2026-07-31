package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzenj {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzeni zzb;

    public final void zza(boolean z) {
        this.zza.set(true);
    }

    public final boolean zzb() {
        return this.zza.get();
    }

    final void zzc(zzeni zzeniVar) {
        this.zzb = zzeniVar;
    }

    final zzeni zzd() {
        return this.zzb;
    }
}
