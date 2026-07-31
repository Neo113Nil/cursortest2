package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhpe {
    private zzhpm zza = null;
    private zzicj zzb = null;
    private Integer zzc = null;

    private zzhpe() {
    }

    /* synthetic */ zzhpe(byte[] bArr) {
    }

    public final zzhpe zza(zzhpm zzhpmVar) {
        this.zza = zzhpmVar;
        return this;
    }

    public final zzhpe zzb(zzicj zzicjVar) throws GeneralSecurityException {
        this.zzb = zzicjVar;
        return this;
    }

    public final zzhpe zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhpf zzd() throws GeneralSecurityException {
        zzicj zzicjVar;
        zzich zza;
        zzhpm zzhpmVar = this.zza;
        if (zzhpmVar == null || (zzicjVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhpmVar.zzc() != zzicjVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhpmVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhpl.zzd) {
            zza = zzhnx.zza;
        } else if (this.zza.zzf() == zzhpl.zzc || this.zza.zzf() == zzhpl.zzb) {
            zza = zzhnx.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhpl.zza) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
            }
            zza = zzhnx.zzb(this.zzc.intValue());
        }
        return new zzhpf(this.zza, this.zzb, zza, this.zzc, null);
    }
}
