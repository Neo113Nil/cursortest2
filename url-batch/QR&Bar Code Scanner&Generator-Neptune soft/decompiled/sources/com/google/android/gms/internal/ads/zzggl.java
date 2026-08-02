package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzggl {
    private final Class zza;
    private final zzgpc zzb;

    /* synthetic */ zzggl(Class cls, zzgpc zzgpcVar, zzggk zzggkVar) {
        this.zza = cls;
        this.zzb = zzgpcVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggl)) {
            return false;
        }
        zzggl zzgglVar = (zzggl) obj;
        return zzgglVar.zza.equals(this.zza) && zzgglVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return this.zza.getSimpleName() + ", object identifier: " + String.valueOf(this.zzb);
    }
}
