package com.google.android.gms.internal.ads;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfxe extends zzfwv implements Serializable {
    final zzfwv zza;

    zzfxe(zzfwv zzfwvVar) {
        this.zza = zzfwvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwv, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfxe) {
            return this.zza.equals(((zzfxe) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        zzfwv zzfwvVar = this.zza;
        sb.append(zzfwvVar);
        sb.append(".reverse()");
        return zzfwvVar.toString().concat(".reverse()");
    }

    @Override // com.google.android.gms.internal.ads.zzfwv
    public final zzfwv zza() {
        return this.zza;
    }
}
