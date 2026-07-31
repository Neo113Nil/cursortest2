package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
final class zzhoy {
    private final Class zza;
    private final zzich zzb;

    /* synthetic */ zzhoy(Class cls, zzich zzichVar, byte[] bArr) {
        this.zza = cls;
        this.zzb = zzichVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhoy)) {
            return false;
        }
        zzhoy zzhoyVar = (zzhoy) obj;
        return zzhoyVar.zza.equals(this.zza) && zzhoyVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        zzich zzichVar = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String valueOf = String.valueOf(zzichVar);
        StringBuilder sb = new StringBuilder(simpleName.length() + 21 + valueOf.length());
        sb.append(simpleName);
        sb.append(", object identifier: ");
        sb.append(valueOf);
        return sb.toString();
    }
}
