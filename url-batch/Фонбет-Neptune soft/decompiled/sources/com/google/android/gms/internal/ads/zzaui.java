package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaui implements Runnable {
    final /* synthetic */ zzauj zza;

    zzaui(zzauj zzaujVar) {
        this.zza = zzaujVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z;
        zzavp zzavpVar;
        ConditionVariable conditionVariable2;
        if (this.zza.zzb != null) {
            return;
        }
        conditionVariable = zzauj.zzc;
        synchronized (conditionVariable) {
            if (this.zza.zzb != null) {
                return;
            }
            boolean z2 = false;
            try {
                z = ((Boolean) zzbbw.zzcl.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                z = false;
            }
            if (z) {
                try {
                    zzavpVar = this.zza.zze;
                    zzauj.zza = zzfqj.zzb(zzavpVar.zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z2 = z;
            this.zza.zzb = Boolean.valueOf(z2);
            conditionVariable2 = zzauj.zzc;
            conditionVariable2.open();
        }
    }
}
