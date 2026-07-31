package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhpm extends zzhqc {
    private final int zza;
    private final int zzb;
    private final zzhpl zzc;

    /* synthetic */ zzhpm(int i, int i2, zzhpl zzhplVar, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzhplVar;
    }

    public static zzhpk zzb() {
        return new zzhpk(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhpm)) {
            return false;
        }
        zzhpm zzhpmVar = (zzhpm) obj;
        return zzhpmVar.zza == this.zza && zzhpmVar.zze() == zze() && zzhpmVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzhpm.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        int length = valueOf.length();
        int i = this.zzb;
        int length2 = String.valueOf(i).length();
        int i2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i2).length() + 10);
        sb.append("AES-CMAC Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte tags, and ");
        sb.append(i2);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zzc != zzhpl.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhpl zzhplVar = this.zzc;
        if (zzhplVar == zzhpl.zzd) {
            return this.zzb;
        }
        if (zzhplVar == zzhpl.zza || zzhplVar == zzhpl.zzb || zzhplVar == zzhpl.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhpl zzf() {
        return this.zzc;
    }
}
