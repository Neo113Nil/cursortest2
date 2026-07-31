package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzbaw implements Runnable {
    final /* synthetic */ zzbax zza;

    zzbaw(zzbax zzbaxVar) {
        Objects.requireNonNull(zzbaxVar);
        this.zza = zzbaxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z;
        ConditionVariable conditionVariable2;
        zzbax zzbaxVar = this.zza;
        if (zzbaxVar.zzb != null) {
            return;
        }
        conditionVariable = zzbax.zzd;
        synchronized (conditionVariable) {
            if (zzbaxVar.zzb != null) {
                return;
            }
            boolean z2 = false;
            try {
                z = ((Boolean) zzbjg.zzdz.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                z = false;
            }
            if (z) {
                try {
                    zzbax.zza = zzgae.zzb(this.zza.zzb().zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z2 = z;
            this.zza.zzb = Boolean.valueOf(z2);
            conditionVariable2 = zzbax.zzd;
            conditionVariable2.open();
        }
    }
}
