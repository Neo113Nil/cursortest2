package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhpw {
    private Integer zza = null;
    private Integer zzb = null;
    private zzhpx zzc = null;
    private zzhpy zzd = zzhpy.zzd;

    private zzhpw() {
    }

    /* synthetic */ zzhpw(byte[] bArr) {
    }

    public final zzhpw zza(int i) throws GeneralSecurityException {
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzhpw zzb(int i) throws GeneralSecurityException {
        this.zzb = Integer.valueOf(i);
        return this;
    }

    public final zzhpw zzc(zzhpy zzhpyVar) {
        this.zzd = zzhpyVar;
        return this;
    }

    public final zzhpw zzd(zzhpx zzhpxVar) {
        this.zzc = zzhpxVar;
        return this;
    }

    public final zzhpz zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.zza));
        }
        Integer num2 = this.zzb;
        int intValue = num2.intValue();
        zzhpx zzhpxVar = this.zzc;
        if (intValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (zzhpxVar == zzhpx.zza) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (zzhpxVar == zzhpx.zzb) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (zzhpxVar == zzhpx.zzc) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (zzhpxVar == zzhpx.zzd) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (zzhpxVar != zzhpx.zze) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new zzhpz(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc, null);
    }
}
