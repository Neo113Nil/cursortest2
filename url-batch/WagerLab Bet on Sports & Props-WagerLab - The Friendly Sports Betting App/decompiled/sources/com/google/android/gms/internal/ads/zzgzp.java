package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzgzp {
    private final Class zza;
    private final zzhgg zzb;

    /* synthetic */ zzgzp(Class cls, zzhgg zzhggVar, byte[] bArr) {
        this.zza = cls;
        this.zzb = zzhggVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgzp)) {
            return false;
        }
        zzgzp zzgzpVar = (zzgzp) obj;
        return zzgzpVar.zza.equals(this.zza) && zzgzpVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        zzhgg zzhggVar = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String valueOf = String.valueOf(zzhggVar);
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 21 + String.valueOf(valueOf).length());
        sb.append(simpleName);
        sb.append(", object identifier: ");
        sb.append(valueOf);
        return sb.toString();
    }
}
