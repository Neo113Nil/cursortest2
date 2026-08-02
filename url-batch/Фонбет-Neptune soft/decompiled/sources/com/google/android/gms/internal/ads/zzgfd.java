package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgfd {

    @Nullable
    private zzgfp zza = null;

    @Nullable
    private zzgvs zzb = null;

    @Nullable
    private zzgvs zzc = null;

    @Nullable
    private Integer zzd = null;

    private zzgfd() {
    }

    /* synthetic */ zzgfd(zzgfc zzgfcVar) {
    }

    public final zzgfd zza(zzgvs zzgvsVar) {
        this.zzb = zzgvsVar;
        return this;
    }

    public final zzgfd zzb(zzgvs zzgvsVar) {
        this.zzc = zzgvsVar;
        return this;
    }

    public final zzgfd zzc(@Nullable Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzgfd zzd(zzgfp zzgfpVar) {
        this.zza = zzgfpVar;
        return this;
    }

    public final zzgff zze() throws GeneralSecurityException {
        zzgvr zzb;
        zzgfp zzgfpVar = this.zza;
        if (zzgfpVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        zzgvs zzgvsVar = this.zzb;
        if (zzgvsVar == null || this.zzc == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (zzgfpVar.zzb() != zzgvsVar.zza()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (zzgfpVar.zzc() != this.zzc.zza()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.zza.zza() && this.zzd == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzd != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzh() == zzgfn.zzc) {
            zzb = zzgml.zza;
        } else if (this.zza.zzh() == zzgfn.zzb) {
            zzb = zzgml.zza(this.zzd.intValue());
        } else {
            if (this.zza.zzh() != zzgfn.zza) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzh()))));
            }
            zzb = zzgml.zzb(this.zzd.intValue());
        }
        return new zzgff(this.zza, this.zzb, this.zzc, zzb, this.zzd, null);
    }
}
