package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzguq extends zzgrf {
    private final zzguw zza;
    private final zzhgh zzb;
    private final zzhgg zzc;

    @Nullable
    private final Integer zzd;

    private zzguq(zzguw zzguwVar, zzhgh zzhghVar, zzhgg zzhggVar, @Nullable Integer num) {
        this.zza = zzguwVar;
        this.zzb = zzhghVar;
        this.zzc = zzhggVar;
        this.zzd = num;
    }

    public static zzguq zzc(zzguv zzguvVar, zzhgh zzhghVar, @Nullable Integer num) throws GeneralSecurityException {
        zzhgg zzb;
        zzguv zzguvVar2 = zzguv.zzc;
        if (zzguvVar != zzguvVar2 && num == null) {
            String obj = zzguvVar.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 62);
            sb.append("For given Variant ");
            sb.append(obj);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (zzguvVar == zzguvVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhghVar.zzd() != 32) {
            int zzd = zzhghVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzd).length() + 75);
            sb2.append("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            sb2.append(zzd);
            throw new GeneralSecurityException(sb2.toString());
        }
        zzguw zzb2 = zzguw.zzb(zzguvVar);
        if (zzb2.zzc() == zzguvVar2) {
            zzb = zzgyp.zza;
        } else if (zzb2.zzc() == zzguv.zzb) {
            zzb = zzgyp.zza(num.intValue());
        } else {
            if (zzb2.zzc() != zzguv.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzb2.zzc().toString()));
            }
            zzb = zzgyp.zzb(num.intValue());
        }
        return new zzguq(zzb2, zzhghVar, zzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzgrf, com.google.android.gms.internal.ads.zzgqd
    public final /* synthetic */ zzgqs zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgrf
    public final zzhgg zzb() {
        return this.zzc;
    }

    public final zzhgh zzd() {
        return this.zzb;
    }

    public final zzguw zze() {
        return this.zza;
    }

    @Nullable
    public final Integer zzf() {
        return this.zzd;
    }
}
