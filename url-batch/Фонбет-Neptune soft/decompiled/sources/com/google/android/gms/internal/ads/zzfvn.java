package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfvn implements zzfvk {
    private static final zzfvk zza = new zzfvk() { // from class: com.google.android.gms.internal.ads.zzfvm
        @Override // com.google.android.gms.internal.ads.zzfvk
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private volatile zzfvk zzb;

    @CheckForNull
    private Object zzc;

    zzfvn(zzfvk zzfvkVar) {
        this.zzb = zzfvkVar;
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj == zza) {
            obj = "<supplier that returned " + String.valueOf(this.zzc) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    public final Object zza() {
        zzfvk zzfvkVar = this.zzb;
        zzfvk zzfvkVar2 = zza;
        if (zzfvkVar != zzfvkVar2) {
            synchronized (this) {
                if (this.zzb != zzfvkVar2) {
                    Object zza2 = this.zzb.zza();
                    this.zzc = zza2;
                    this.zzb = zzfvkVar2;
                    return zza2;
                }
            }
        }
        return this.zzc;
    }
}
