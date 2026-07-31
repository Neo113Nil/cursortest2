package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhjc extends zzhfz {
    private final zzhjh zza;
    private final zzicj zzb;
    private final zzich zzc;
    private final Integer zzd;

    private zzhjc(zzhjh zzhjhVar, zzicj zzicjVar, zzich zzichVar, Integer num) {
        this.zza = zzhjhVar;
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

    public final zzhjh zzf() {
        return this.zza;
    }

    public static zzhjc zzd(zzhjh zzhjhVar, zzicj zzicjVar, Integer num) throws GeneralSecurityException {
        zzich zzb;
        zzhjg zzc = zzhjhVar.zzc();
        zzhjg zzhjgVar = zzhjg.zzb;
        if (zzc != zzhjgVar && num == null) {
            String obj = zzhjhVar.zzc().toString();
            StringBuilder sb = new StringBuilder(obj.length() + 62);
            sb.append("For given Variant ");
            sb.append(obj);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (zzhjhVar.zzc() == zzhjgVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzicjVar.zzd() != 32) {
            int zzd = zzicjVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzd).length() + 68);
            sb2.append("XAesGcmKey key must be constructed with key of length 32 bytes, not ");
            sb2.append(zzd);
            throw new GeneralSecurityException(sb2.toString());
        }
        if (zzhjhVar.zzc() == zzhjgVar) {
            zzb = zzhnx.zza;
        } else {
            if (zzhjhVar.zzc() != zzhjg.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhjhVar.zzc().toString()));
            }
            zzb = zzhnx.zzb(num.intValue());
        }
        return new zzhjc(zzhjhVar, zzicjVar, zzb, num);
    }
}
