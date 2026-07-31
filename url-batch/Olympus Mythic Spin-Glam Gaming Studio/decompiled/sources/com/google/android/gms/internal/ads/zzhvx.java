package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhvx extends zzhym {
    private final zzhvv zza;
    private final zzhvt zzb;
    private final zzhvu zzc;
    private final zzhvw zzd;

    /* synthetic */ zzhvx(zzhvv zzhvvVar, zzhvt zzhvtVar, zzhvu zzhvuVar, zzhvw zzhvwVar, byte[] bArr) {
        this.zza = zzhvvVar;
        this.zzb = zzhvtVar;
        this.zzc = zzhvuVar;
        this.zzd = zzhvwVar;
    }

    public static zzhvs zzb() {
        return new zzhvs(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhvx)) {
            return false;
        }
        zzhvx zzhvxVar = (zzhvx) obj;
        return zzhvxVar.zza == this.zza && zzhvxVar.zzb == this.zzb && zzhvxVar.zzc == this.zzc && zzhvxVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhvx.class, this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final String toString() {
        String obj = this.zzd.toString();
        int length = obj.length();
        String obj2 = this.zzc.toString();
        int length2 = obj2.length();
        String obj3 = this.zza.toString();
        int length3 = obj3.length();
        String obj4 = this.zzb.toString();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + obj4.length() + 1);
        sb.append("ECDSA Parameters (variant: ");
        sb.append(obj);
        sb.append(", hashType: ");
        sb.append(obj2);
        sb.append(", encoding: ");
        sb.append(obj3);
        sb.append(", curve: ");
        sb.append(obj4);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zzd != zzhvw.zzd;
    }

    public final zzhvv zzc() {
        return this.zza;
    }

    public final zzhvt zzd() {
        return this.zzb;
    }

    public final zzhvu zze() {
        return this.zzc;
    }

    public final zzhvw zzf() {
        return this.zzd;
    }
}
