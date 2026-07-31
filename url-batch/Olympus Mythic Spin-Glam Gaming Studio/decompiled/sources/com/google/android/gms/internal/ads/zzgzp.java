package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzgzp extends zzgzg implements Serializable {
    final zzgzg zza;

    zzgzp(zzgzg zzgzgVar) {
        this.zza = zzgzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgzp) {
            return this.zza.equals(((zzgzp) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }
}
