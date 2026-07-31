package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzaun implements Runnable {
    final /* synthetic */ zzauo zza;

    zzaun(zzauo zzauoVar) {
        Objects.requireNonNull(zzauoVar);
        this.zza = zzauoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z;
        ConditionVariable conditionVariable2;
        zzauo zzauoVar = this.zza;
        if (zzauoVar.zzb != null) {
            return;
        }
        conditionVariable = zzauo.zzd;
        synchronized (conditionVariable) {
            if (zzauoVar.zzb != null) {
                return;
            }
            boolean z2 = false;
            try {
                z = ((Boolean) zzbci.zzcQ.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                z = false;
            }
            if (z) {
                try {
                    zzauo.zza = zzfqd.zzb(this.zza.zzb().zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z2 = z;
            this.zza.zzb = Boolean.valueOf(z2);
            conditionVariable2 = zzauo.zzd;
            conditionVariable2.open();
        }
    }
}
