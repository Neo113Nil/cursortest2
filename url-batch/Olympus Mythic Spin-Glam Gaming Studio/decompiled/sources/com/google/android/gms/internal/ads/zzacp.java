package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzacp implements Spatializer$OnSpatializerStateChangedListener {
    final /* synthetic */ Runnable zza;

    zzacp(zzacr zzacrVar, Runnable runnable) {
        this.zza = runnable;
        Objects.requireNonNull(zzacrVar);
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.zza.run();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.zza.run();
    }
}
