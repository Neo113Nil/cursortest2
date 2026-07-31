package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzbfm implements zzbft {
    final /* synthetic */ Activity zza;
    final /* synthetic */ Bundle zzb;

    zzbfm(zzbfu zzbfuVar, Activity activity, Bundle bundle) {
        this.zza = activity;
        this.zzb = bundle;
        Objects.requireNonNull(zzbfuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.zza, this.zzb);
    }
}
