package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzggn {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzggn(Class cls, Class cls2, zzggm zzggmVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggn)) {
            return false;
        }
        zzggn zzggnVar = (zzggn) obj;
        return zzggnVar.zza.equals(this.zza) && zzggnVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return this.zza.getSimpleName() + " with serialization type: " + this.zzb.getSimpleName();
    }
}
