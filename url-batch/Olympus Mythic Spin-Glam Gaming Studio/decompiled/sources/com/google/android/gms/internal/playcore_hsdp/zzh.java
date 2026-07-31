package com.google.android.gms.internal.playcore_hsdp;

import java.io.Serializable;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes13.dex */
final class zzh implements Serializable, zzg {
    final zzg zza;
    volatile transient boolean zzb;
    transient Object zzc;
    private final transient zzk zzd = new zzk();

    zzh(zzg zzgVar) {
        this.zza = zzgVar;
    }

    public final String toString() {
        Object obj;
        if (this.zzb) {
            obj = "<supplier that returned " + String.valueOf(this.zzc) + ">";
        } else {
            obj = this.zza;
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }

    @Override // com.google.android.gms.internal.playcore_hsdp.zzg
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                try {
                    if (!this.zzb) {
                        Object zza = this.zza.zza();
                        this.zzc = zza;
                        this.zzb = true;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
