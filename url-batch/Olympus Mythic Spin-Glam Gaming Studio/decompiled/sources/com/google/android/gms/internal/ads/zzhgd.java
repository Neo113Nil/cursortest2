package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzhgd {
    private zzhgm zza = null;
    private zzicj zzb = null;
    private zzicj zzc = null;
    private Integer zzd = null;

    private zzhgd() {
    }

    /* synthetic */ zzhgd(byte[] bArr) {
    }

    public final zzhgd zza(zzhgm zzhgmVar) {
        this.zza = zzhgmVar;
        return this;
    }

    public final zzhgd zzb(zzicj zzicjVar) {
        this.zzb = zzicjVar;
        return this;
    }

    public final zzhgd zzc(zzicj zzicjVar) {
        this.zzc = zzicjVar;
        return this;
    }

    public final zzhgd zzd(Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzhge zze() throws GeneralSecurityException {
        zzich zzb;
        zzhgm zzhgmVar = this.zza;
        if (zzhgmVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        zzicj zzicjVar = this.zzb;
        if (zzicjVar == null || this.zzc == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (zzhgmVar.zzc() != zzicjVar.zzd()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (zzhgmVar.zzd() != this.zzc.zzd()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.zza.zza() && this.zzd == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzd != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzg() == zzhgl.zzc) {
            zzb = zzhnx.zza;
        } else if (this.zza.zzg() == zzhgl.zzb) {
            zzb = zzhnx.zza(this.zzd.intValue());
        } else {
            if (this.zza.zzg() != zzhgl.zza) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzg())));
            }
            zzb = zzhnx.zzb(this.zzd.intValue());
        }
        return new zzhge(this.zza, this.zzb, this.zzc, zzb, this.zzd, null);
    }
}
