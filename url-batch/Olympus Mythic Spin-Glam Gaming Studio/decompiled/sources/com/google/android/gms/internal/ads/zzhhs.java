package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhhs extends zzhga {
    private final zzhhr zza;

    private zzhhs(zzhhr zzhhrVar) {
        this.zza = zzhhrVar;
    }

    public static zzhhs zzb(zzhhr zzhhrVar) {
        return new zzhhs(zzhhrVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhhs) && ((zzhhs) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhhs.class, this.zza);
    }

    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 39);
        sb.append("ChaCha20Poly1305 Parameters (variant: ");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zza != zzhhr.zzc;
    }

    public final zzhhr zzc() {
        return this.zza;
    }
}
