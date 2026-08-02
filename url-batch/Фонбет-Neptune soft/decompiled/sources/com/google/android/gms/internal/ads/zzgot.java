package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgot {

    @Nullable
    private zzgpg zza = null;

    @Nullable
    private zzgvs zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzgot() {
    }

    /* synthetic */ zzgot(zzgos zzgosVar) {
    }

    public final zzgot zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgot zzb(zzgvs zzgvsVar) {
        this.zzb = zzgvsVar;
        return this;
    }

    public final zzgot zzc(zzgpg zzgpgVar) {
        this.zza = zzgpgVar;
        return this;
    }

    public final zzgov zzd() throws GeneralSecurityException {
        zzgvs zzgvsVar;
        zzgvr zza;
        zzgpg zzgpgVar = this.zza;
        if (zzgpgVar == null || (zzgvsVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgpgVar.zzc() != zzgvsVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgpgVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzg() == zzgpe.zzd) {
            zza = zzgml.zza;
        } else if (this.zza.zzg() == zzgpe.zzc || this.zza.zzg() == zzgpe.zzb) {
            zza = zzgml.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzg() != zzgpe.zza) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzg()))));
            }
            zza = zzgml.zzb(this.zzc.intValue());
        }
        return new zzgov(this.zza, this.zzb, zza, this.zzc, null);
    }
}
