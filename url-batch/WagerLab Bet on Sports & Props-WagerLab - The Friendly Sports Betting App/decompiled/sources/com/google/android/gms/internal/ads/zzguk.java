package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzguk extends zzgrf {
    private final zzgup zza;
    private final zzhgh zzb;
    private final zzhgg zzc;

    @Nullable
    private final Integer zzd;

    private zzguk(zzgup zzgupVar, zzhgh zzhghVar, zzhgg zzhggVar, @Nullable Integer num) {
        this.zza = zzgupVar;
        this.zzb = zzhghVar;
        this.zzc = zzhggVar;
        this.zzd = num;
    }

    public static zzguk zzc(zzgup zzgupVar, zzhgh zzhghVar, @Nullable Integer num) throws GeneralSecurityException {
        zzhgg zzb;
        zzguo zzc = zzgupVar.zzc();
        zzguo zzguoVar = zzguo.zzb;
        if (zzc != zzguoVar && num == null) {
            String obj = zzgupVar.zzc().toString();
            StringBuilder sb = new StringBuilder(obj.length() + 62);
            sb.append("For given Variant ");
            sb.append(obj);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (zzgupVar.zzc() == zzguoVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhghVar.zzd() != 32) {
            int zzd = zzhghVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzd).length() + 68);
            sb2.append("XAesGcmKey key must be constructed with key of length 32 bytes, not ");
            sb2.append(zzd);
            throw new GeneralSecurityException(sb2.toString());
        }
        if (zzgupVar.zzc() == zzguoVar) {
            zzb = zzgyp.zza;
        } else {
            if (zzgupVar.zzc() != zzguo.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzgupVar.zzc().toString()));
            }
            zzb = zzgyp.zzb(num.intValue());
        }
        return new zzguk(zzgupVar, zzhghVar, zzb, num);
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

    public final zzgup zze() {
        return this.zza;
    }

    @Nullable
    public final Integer zzf() {
        return this.zzd;
    }
}
