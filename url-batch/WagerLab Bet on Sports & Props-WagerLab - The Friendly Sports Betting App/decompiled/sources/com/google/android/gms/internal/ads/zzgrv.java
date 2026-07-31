package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzgrv {

    @Nullable
    private zzgsc zza = null;

    @Nullable
    private zzhgh zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzgrv() {
    }

    /* synthetic */ zzgrv(byte[] bArr) {
    }

    public final zzgrv zza(zzgsc zzgscVar) {
        this.zza = zzgscVar;
        return this;
    }

    public final zzgrv zzb(zzhgh zzhghVar) {
        this.zzb = zzhghVar;
        return this;
    }

    public final zzgrv zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgrw zzd() throws GeneralSecurityException {
        zzhgh zzhghVar;
        zzhgg zzb;
        zzgsc zzgscVar = this.zza;
        if (zzgscVar == null || (zzhghVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgscVar.zzc() != zzhghVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgscVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzgsb.zzc) {
            zzb = zzgyp.zza;
        } else if (this.zza.zze() == zzgsb.zzb) {
            zzb = zzgyp.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzgsb.zza) {
                String valueOf = String.valueOf(this.zza.zze());
                String.valueOf(valueOf);
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(valueOf)));
            }
            zzb = zzgyp.zzb(this.zzc.intValue());
        }
        return new zzgrw(this.zza, this.zzb, zzb, this.zzc, null);
    }
}
