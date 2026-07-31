package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhwh extends zzhym {
    private final zzhwg zza;

    private zzhwh(zzhwg zzhwgVar) {
        this.zza = zzhwgVar;
    }

    public static zzhwh zzb(zzhwg zzhwgVar) {
        return new zzhwh(zzhwgVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhwh) && ((zzhwh) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhwh.class, this.zza);
    }

    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 30);
        sb.append("Ed25519 Parameters (variant: ");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zza != zzhwg.zzd;
    }

    public final zzhwg zzc() {
        return this.zza;
    }
}
