package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgxh implements zzgxv, zzgxc {
    private static final Object zza = new Object();
    private volatile zzgxv zzb;
    private volatile Object zzc = zza;

    private zzgxh(zzgxv zzgxvVar) {
        this.zzb = zzgxvVar;
    }

    public static zzgxc zza(zzgxv zzgxvVar) {
        if (zzgxvVar instanceof zzgxc) {
            return (zzgxc) zzgxvVar;
        }
        Objects.requireNonNull(zzgxvVar);
        return new zzgxh(zzgxvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final Object zzb() {
        Object obj = this.zzc;
        Object obj2 = zza;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.zzc;
                if (obj == obj2) {
                    obj = this.zzb.zzb();
                    Object obj3 = this.zzc;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.zzc = obj;
                    this.zzb = null;
                }
            }
        }
        return obj;
    }

    public static zzgxv zzc(zzgxv zzgxvVar) {
        Objects.requireNonNull(zzgxvVar);
        return zzgxvVar instanceof zzgxh ? zzgxvVar : new zzgxh(zzgxvVar);
    }
}
