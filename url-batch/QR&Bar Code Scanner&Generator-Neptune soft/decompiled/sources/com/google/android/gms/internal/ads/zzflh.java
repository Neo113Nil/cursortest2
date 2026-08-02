package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzflh implements Application.ActivityLifecycleCallbacks {
    private static final zzflh zza = new zzflh();
    private boolean zzb;
    private boolean zzc;
    private zzflm zzd;

    private zzflh() {
    }

    public static zzflh zza() {
        return zza;
    }

    private final void zze() {
        boolean z = this.zzc;
        Iterator it = zzflg.zza().zzc().iterator();
        while (it.hasNext()) {
            zzfls zzg = ((zzfkv) it.next()).zzg();
            if (zzg.zzk()) {
                zzfll.zza().zzb(zzg.zza(), "setState", true != z ? "foregrounded" : "backgrounded");
            }
        }
    }

    private final void zzf(boolean z) {
        if (this.zzc != z) {
            this.zzc = z;
            if (this.zzb) {
                zze();
                if (this.zzd != null) {
                    if (!z) {
                        zzfmi.zzd().zzi();
                    } else {
                        zzfmi.zzd().zzh();
                    }
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
        zzf(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        View zzf;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i = runningAppProcessInfo.importance;
        boolean z = true;
        for (zzfkv zzfkvVar : zzflg.zza().zzb()) {
            if (zzfkvVar.zzj() && (zzf = zzfkvVar.zzf()) != null && zzf.hasWindowFocus()) {
                z = false;
            }
        }
        zzf(i != 100 && z);
    }

    public final void zzb() {
        this.zzb = true;
        this.zzc = false;
        zze();
    }

    public final void zzc() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = null;
    }

    public final void zzd(zzflm zzflmVar) {
        this.zzd = zzflmVar;
    }
}
