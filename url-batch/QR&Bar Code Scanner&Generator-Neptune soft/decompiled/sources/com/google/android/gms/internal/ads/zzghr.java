package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzghr {
    private final zzgbc zza;
    private final int zzb;
    private final zzgbl zzc;

    /* synthetic */ zzghr(zzgbc zzgbcVar, int i, zzgbl zzgblVar, zzghq zzghqVar) {
        this.zza = zzgbcVar;
        this.zzb = i;
        this.zzc = zzgblVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghr)) {
            return false;
        }
        zzghr zzghrVar = (zzghr) obj;
        return this.zza == zzghrVar.zza && this.zzb == zzghrVar.zzb && this.zzc.equals(zzghrVar.zzc);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), Integer.valueOf(this.zzc.hashCode())});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, parameters='%s')", this.zza, Integer.valueOf(this.zzb), this.zzc);
    }

    public final int zza() {
        return this.zzb;
    }
}
