package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
final class zziev {
    private final Object zza;
    private final int zzb;

    zziev(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zziev)) {
            return false;
        }
        zziev zzievVar = (zziev) obj;
        return this.zza == zzievVar.zza && this.zzb == zzievVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
