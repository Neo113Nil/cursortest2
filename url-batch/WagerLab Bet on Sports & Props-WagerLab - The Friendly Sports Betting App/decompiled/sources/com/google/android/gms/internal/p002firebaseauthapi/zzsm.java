package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzsm implements zzcc {
    private static final byte[] zza = {0};
    private final zzcc zzb;
    private final zzxz zzc;
    private final byte[] zzd;

    public static zzcc zza(zzof zzofVar) throws GeneralSecurityException {
        byte[] zzb;
        zzqb zza2 = zzofVar.zza(zzbf.zza());
        zzcc zzccVar = (zzcc) zznq.zza().zza(zza2.zzf(), zzcc.class).zzb(zza2.zzd());
        zzxz zzb2 = zza2.zzb();
        int i = zzsp.zza[zzb2.ordinal()];
        if (i == 1) {
            zzb = zzpe.zza.zzb();
        } else if (i == 2 || i == 3) {
            zzb = zzpe.zza(zzofVar.zzb().intValue()).zzb();
        } else {
            if (i != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            zzb = zzpe.zzb(zzofVar.zzb().intValue()).zzb();
        }
        return new zzsm(zzccVar, zzb2, zzb);
    }

    private zzsm(zzcc zzccVar, zzxz zzxzVar, byte[] bArr) {
        this.zzb = zzccVar;
        this.zzc = zzxzVar;
        this.zzd = bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcc
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 10) {
            throw new GeneralSecurityException("tag too short");
        }
        if (this.zzc.equals(zzxz.LEGACY)) {
            bArr2 = zzyz.zza(bArr2, zza);
        }
        byte[] bArr3 = new byte[0];
        if (!this.zzc.equals(zzxz.RAW)) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
            bArr3 = copyOf;
        }
        if (!Arrays.equals(this.zzd, bArr3)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        this.zzb.zza(bArr, bArr2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcc
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        if (this.zzc.equals(zzxz.LEGACY)) {
            bArr = zzyz.zza(bArr, zza);
        }
        return zzyz.zza(this.zzd, this.zzb.zza(bArr));
    }
}
