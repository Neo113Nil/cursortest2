package com.google.android.gms.internal.ads;

import android.app.Application;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfkq {
    private boolean zza;

    final void zza(Context context) {
        zzfly.zzb(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzflm.zzb().zzc(context);
        zzflh zza = zzflh.zza();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(zza);
        }
        zzflw.zzg(context);
        zzflj.zzb().zzc(context);
    }

    final boolean zzb() {
        return this.zza;
    }
}
