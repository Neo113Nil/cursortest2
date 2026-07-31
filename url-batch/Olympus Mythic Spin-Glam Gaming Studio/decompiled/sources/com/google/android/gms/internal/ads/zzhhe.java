package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzhhe {
    private zzhhm zza = null;
    private zzicj zzb = null;
    private Integer zzc = null;

    private zzhhe() {
    }

    /* synthetic */ zzhhe(byte[] bArr) {
    }

    public final zzhhe zza(zzhhm zzhhmVar) {
        this.zza = zzhhmVar;
        return this;
    }

    public final zzhhe zzb(zzicj zzicjVar) {
        this.zzb = zzicjVar;
        return this;
    }

    public final zzhhe zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhhf zzd() throws GeneralSecurityException {
        zzicj zzicjVar;
        zzich zzb;
        zzhhm zzhhmVar = this.zza;
        if (zzhhmVar == null || (zzicjVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhhmVar.zzc() != zzicjVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhhmVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzhhl.zzc) {
            zzb = zzhnx.zza;
        } else if (this.zza.zzd() == zzhhl.zzb) {
            zzb = zzhnx.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzhhl.zza) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zzb = zzhnx.zzb(this.zzc.intValue());
        }
        return new zzhhf(this.zza, this.zzb, zzb, this.zzc, null);
    }
}
