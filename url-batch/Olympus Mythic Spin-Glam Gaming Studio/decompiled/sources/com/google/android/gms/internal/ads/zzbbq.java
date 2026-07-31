package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzbbq implements zzbbu {
    final /* synthetic */ Activity zza;

    zzbbq(zzbbv zzbbvVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzbbvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.zza);
    }
}
