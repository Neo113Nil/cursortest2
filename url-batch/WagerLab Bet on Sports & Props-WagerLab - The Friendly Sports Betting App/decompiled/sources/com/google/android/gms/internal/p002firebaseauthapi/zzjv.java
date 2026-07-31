package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzjv implements zzbe {
    private final zzbe zza;
    private final zzxz zzb;
    private final byte[] zzc;

    public static zzbe zza(zzof zzofVar) throws GeneralSecurityException {
        byte[] zzb;
        zzqb zza = zzofVar.zza(zzbf.zza());
        zzbe zzbeVar = (zzbe) zznq.zza().zza(zza.zzf(), zzbe.class).zzb(zza.zzd());
        zzxz zzb2 = zza.zzb();
        int i = zzjy.zza[zzb2.ordinal()];
        if (i == 1) {
            zzb = zzpe.zza.zzb();
        } else if (i == 2 || i == 3) {
            zzb = zzpe.zza(zzofVar.zzb().intValue()).zzb();
        } else {
            if (i != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + zzb2.zza());
            }
            zzb = zzpe.zzb(zzofVar.zzb().intValue()).zzb();
        }
        return new zzjv(zzbeVar, zzb2, zzb);
    }

    private zzjv(zzbe zzbeVar, zzxz zzxzVar, byte[] bArr) {
        this.zza = zzbeVar;
        this.zzb = zzxzVar;
        this.zzc = bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (this.zzb == zzxz.RAW) {
            return this.zza.zza(bArr, bArr2);
        }
        if (!zzqn.zza(this.zzc, bArr)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
    }
}
