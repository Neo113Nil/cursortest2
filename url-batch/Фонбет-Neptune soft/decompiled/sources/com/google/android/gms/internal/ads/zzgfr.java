package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgfr {

    @Nullable
    private zzggb zza = null;

    @Nullable
    private zzgvs zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzgfr() {
    }

    /* synthetic */ zzgfr(zzgfq zzgfqVar) {
    }

    public final zzgfr zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgfr zzb(zzgvs zzgvsVar) {
        this.zzb = zzgvsVar;
        return this;
    }

    public final zzgfr zzc(zzggb zzggbVar) {
        this.zza = zzggbVar;
        return this;
    }

    public final zzgft zzd() throws GeneralSecurityException {
        zzgvs zzgvsVar;
        zzgvr zzb;
        zzggb zzggbVar = this.zza;
        if (zzggbVar == null || (zzgvsVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzggbVar.zzc() != zzgvsVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzggbVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzgfz.zzc) {
            zzb = zzgml.zza;
        } else if (this.zza.zze() == zzgfz.zzb) {
            zzb = zzgml.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzgfz.zza) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zze()))));
            }
            zzb = zzgml.zzb(this.zzc.intValue());
        }
        return new zzgft(this.zza, this.zzb, zzb, this.zzc, null);
    }
}
