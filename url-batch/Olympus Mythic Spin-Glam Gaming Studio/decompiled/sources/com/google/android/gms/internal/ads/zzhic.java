package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhic extends zzhga {
    private final String zza;
    private final zzhib zzb;

    private zzhic(String str, zzhib zzhibVar) {
        this.zza = str;
        this.zzb = zzhibVar;
    }

    public static zzhic zzb(String str, zzhib zzhibVar) {
        return new zzhic(str, zzhibVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhic)) {
            return false;
        }
        zzhic zzhicVar = (zzhic) obj;
        return zzhicVar.zza.equals(this.zza) && zzhicVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(zzhic.class, this.zza, this.zzb);
    }

    public final String toString() {
        String obj = this.zzb.toString();
        String str = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + obj.length() + 1);
        sb.append("LegacyKmsAead Parameters (keyUri: ");
        sb.append(str);
        sb.append(", variant: ");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zzb != zzhib.zzb;
    }

    public final String zzc() {
        return this.zza;
    }

    public final zzhib zzd() {
        return this.zzb;
    }
}
