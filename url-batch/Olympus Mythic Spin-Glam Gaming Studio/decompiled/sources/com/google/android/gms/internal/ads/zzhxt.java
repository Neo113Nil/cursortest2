package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhxt {
    private zzhxq zza = null;
    private BigInteger zzb = null;
    private Integer zzc = null;

    private zzhxt() {
    }

    /* synthetic */ zzhxt(byte[] bArr) {
    }

    public final zzhxt zza(zzhxq zzhxqVar) {
        this.zza = zzhxqVar;
        return this;
    }

    public final zzhxt zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzhxt zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhxu zzd() throws GeneralSecurityException {
        zzich zza;
        if (this.zza == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = this.zzb;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int bitLength = bigInteger.bitLength();
        int zzc = this.zza.zzc();
        if (bitLength != zzc) {
            StringBuilder sb = new StringBuilder(String.valueOf(bitLength).length() + 56 + String.valueOf(zzc).length());
            sb.append("Got modulus size ");
            sb.append(bitLength);
            sb.append(", but parameters requires modulus size ");
            sb.append(zzc);
            throw new GeneralSecurityException(sb.toString());
        }
        if (this.zza.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzhxp.zzd) {
            zza = zzhnx.zza;
        } else if (this.zza.zze() == zzhxp.zzc || this.zza.zze() == zzhxp.zzb) {
            zza = zzhnx.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzhxp.zza) {
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zza = zzhnx.zzb(this.zzc.intValue());
        }
        return new zzhxu(this.zza, this.zzb, zza, this.zzc, null);
    }
}
