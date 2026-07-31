package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhia extends zzhfz {
    private final zzhic zza;
    private final zzich zzb;
    private final Integer zzc;

    private zzhia(zzhic zzhicVar, zzich zzichVar, Integer num) {
        this.zza = zzhicVar;
        this.zzb = zzichVar;
        this.zzc = num;
    }

    public static zzhia zzd(zzhic zzhicVar, Integer num) throws GeneralSecurityException {
        zzich zza;
        if (zzhicVar.zzd() == zzhib.zza) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zza = zzich.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzhicVar.zzd() != zzhib.zzb) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(zzhicVar.zzd().toString()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zza = zzich.zza(new byte[0]);
        }
        return new zzhia(zzhicVar, zza, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhfz, com.google.android.gms.internal.ads.zzhes
    public final /* synthetic */ zzhfj zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhes
    public final Integer zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhfz
    public final zzich zzc() {
        return this.zzb;
    }

    public final zzhic zze() {
        return this.zza;
    }
}
