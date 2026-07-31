package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
final class zzhhq {
    private final Object zza;
    private final int zzb;

    zzhhq(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhhq)) {
            return false;
        }
        zzhhq zzhhqVar = (zzhhq) obj;
        return this.zza == zzhhqVar.zza && this.zzb == zzhhqVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
