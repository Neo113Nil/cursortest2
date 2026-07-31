package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzewc {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    @Nullable
    private zzewb zzb;

    public final void zza(boolean z) {
        this.zza.set(true);
    }

    public final boolean zzb() {
        return this.zza.get();
    }

    final void zzc(zzewb zzewbVar) {
        this.zzb = zzewbVar;
    }

    @Nullable
    final zzewb zzd() {
        return this.zzb;
    }
}
