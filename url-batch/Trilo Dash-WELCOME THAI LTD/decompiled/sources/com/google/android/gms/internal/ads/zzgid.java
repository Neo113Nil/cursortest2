package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgid implements zzgbe {
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    public zzgid(byte[] bArr) throws GeneralSecurityException {
        zzgik.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zza = secretKeySpec;
        Cipher zzb = zzb();
        zzb.init(1, secretKeySpec);
        byte[] zzb2 = zzghe.zzb(zzb.doFinal(new byte[16]));
        this.zzb = zzb2;
        this.zzc = zzghe.zzb(zzb2);
    }

    private static Cipher zzb() throws GeneralSecurityException {
        if (zzfzc.zza(1)) {
            return (Cipher) zzghq.zza.zza("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.zzgbe
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher zzb = zzb();
        zzb.init(1, this.zza);
        int length = bArr.length;
        double d = length;
        Double.isNaN(d);
        int max = Math.max(1, (int) Math.ceil(d / 16.0d));
        byte[] zze = max * 16 == length ? zzghf.zze(bArr, (max - 1) * 16, this.zzb, 0, 16) : zzghf.zzd(zzghe.zza(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.zzc);
        byte[] bArr2 = new byte[16];
        for (int i2 = 0; i2 < max - 1; i2++) {
            bArr2 = zzb.doFinal(zzghf.zze(bArr2, 0, bArr, i2 * 16, 16));
        }
        return Arrays.copyOf(zzb.doFinal(zzghf.zzd(zze, bArr2)), i);
    }
}
