package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzmp implements zzbg {
    public static zzbg zza(zzof zzofVar) throws GeneralSecurityException {
        byte[] zzb;
        zzqb zza = zzofVar.zza(zzbf.zza());
        zzbg zzbgVar = (zzbg) zznq.zza().zza(zza.zzf(), zzbg.class).zzb(zza.zzd());
        zzxz zzb2 = zza.zzb();
        int i = zzmo.zza[zzb2.ordinal()];
        if (i == 1) {
            zzb = zzpe.zza.zzb();
        } else if (i == 2 || i == 3) {
            zzb = zzpe.zza(zzofVar.zzb().intValue()).zzb();
        } else {
            if (i != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + String.valueOf(zzb2));
            }
            zzb = zzpe.zzb(zzofVar.zzb().intValue()).zzb();
        }
        return new zzmp(zzbgVar, zzb);
    }

    private zzmp(zzbg zzbgVar, byte[] bArr) {
    }
}
