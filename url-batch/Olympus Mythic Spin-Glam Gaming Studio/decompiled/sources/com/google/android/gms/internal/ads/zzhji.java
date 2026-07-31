package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhji extends zzhfz {
    private final zzhjo zza;
    private final zzicj zzb;
    private final zzich zzc;
    private final Integer zzd;

    private zzhji(zzhjo zzhjoVar, zzicj zzicjVar, zzich zzichVar, Integer num) {
        this.zza = zzhjoVar;
        this.zzb = zzicjVar;
        this.zzc = zzichVar;
        this.zzd = num;
    }

    @Override // com.google.android.gms.internal.ads.zzhfz, com.google.android.gms.internal.ads.zzhes
    public final /* synthetic */ zzhfj zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhes
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhfz
    public final zzich zzc() {
        return this.zzc;
    }

    public final zzicj zze() {
        return this.zzb;
    }

    public final zzhjo zzf() {
        return this.zza;
    }

    public static zzhji zzd(zzhjn zzhjnVar, zzicj zzicjVar, Integer num) throws GeneralSecurityException {
        zzich zzb;
        zzhjn zzhjnVar2 = zzhjn.zzc;
        if (zzhjnVar != zzhjnVar2 && num == null) {
            String obj = zzhjnVar.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 62);
            sb.append("For given Variant ");
            sb.append(obj);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (zzhjnVar == zzhjnVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzicjVar.zzd() != 32) {
            int zzd = zzicjVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzd).length() + 75);
            sb2.append("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            sb2.append(zzd);
            throw new GeneralSecurityException(sb2.toString());
        }
        zzhjo zzb2 = zzhjo.zzb(zzhjnVar);
        if (zzb2.zzc() == zzhjnVar2) {
            zzb = zzhnx.zza;
        } else if (zzb2.zzc() == zzhjn.zzb) {
            zzb = zzhnx.zza(num.intValue());
        } else {
            if (zzb2.zzc() != zzhjn.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzb2.zzc().toString()));
            }
            zzb = zzhnx.zzb(num.intValue());
        }
        return new zzhji(zzb2, zzicjVar, zzb, num);
    }
}
