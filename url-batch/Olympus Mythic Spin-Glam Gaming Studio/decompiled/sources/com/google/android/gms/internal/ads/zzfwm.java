package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public class zzfwm implements Application.ActivityLifecycleCallbacks {
    protected boolean zza;
    private boolean zzb;
    private zzfwl zzc;

    private final boolean zza() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100 || zzb();
    }

    private final void zzh(boolean z) {
        if (this.zza != z) {
            this.zza = z;
            if (this.zzb) {
                zzc(z);
                zzfwl zzfwlVar = this.zzc;
                if (zzfwlVar != null) {
                    zzfwlVar.zzd(z);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzh(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zzh(zza());
    }

    protected boolean zzb() {
        return false;
    }

    protected void zzc(boolean z) {
    }

    public final void zzd(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void zze() {
        this.zzb = true;
        boolean zza = zza();
        this.zza = zza;
        zzc(zza);
    }

    public final void zzf() {
        this.zzb = false;
        this.zzc = null;
    }

    public final void zzg(zzfwl zzfwlVar) {
        this.zzc = zzfwlVar;
    }
}
