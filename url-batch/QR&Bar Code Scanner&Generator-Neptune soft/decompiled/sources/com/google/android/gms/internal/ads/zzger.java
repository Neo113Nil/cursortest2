package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzger {
    private static final byte[] zza = new byte[0];
    private final zzgeq zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private BigInteger zzg = BigInteger.ZERO;

    private zzger(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzgeq zzgeqVar) {
        this.zzf = bArr;
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzgeqVar;
    }

    static zzger zzc(byte[] bArr, byte[] bArr2, zzgeu zzgeuVar, zzgep zzgepVar, zzgeq zzgeqVar, byte[] bArr3) throws GeneralSecurityException {
        byte[] zzb = zzgfd.zzb(zzgeuVar.zzb(), zzgepVar.zzc(), zzgeqVar.zzb());
        byte[] bArr4 = zzgfd.zzl;
        byte[] bArr5 = zza;
        byte[] zzc = zzgnv.zzc(zzgfd.zza, zzgepVar.zze(bArr4, bArr5, "psk_id_hash", zzb), zzgepVar.zze(zzgfd.zzl, bArr3, "info_hash", zzb));
        byte[] zze = zzgepVar.zze(bArr2, bArr5, "secret", zzb);
        return new zzger(bArr, zzgepVar.zzd(zze, zzc, "key", zzb, zzgeqVar.zza()), zzgepVar.zzd(zze, zzc, "base_nonce", zzb, 12), BigInteger.ONE.shiftLeft(96).subtract(BigInteger.ONE), zzgeqVar);
    }

    private final synchronized byte[] zzd() throws GeneralSecurityException {
        byte[] zzd;
        byte[] bArr = this.zze;
        byte[] byteArray = this.zzg.toByteArray();
        int length = byteArray.length;
        if (length != 12) {
            if (length > 13) {
                throw new GeneralSecurityException("integer too large");
            }
            if (length != 13) {
                byte[] bArr2 = new byte[12];
                System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                byteArray = bArr2;
            } else {
                if (byteArray[0] != 0) {
                    throw new GeneralSecurityException("integer too large");
                }
                byteArray = Arrays.copyOfRange(byteArray, 1, 13);
            }
        }
        zzd = zzgnv.zzd(bArr, byteArray);
        if (this.zzg.compareTo(this.zzc) >= 0) {
            throw new GeneralSecurityException("message limit reached");
        }
        this.zzg = this.zzg.add(BigInteger.ONE);
        return zzd;
    }

    final byte[] zza() {
        return this.zzf;
    }

    final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.zzb.zzc(this.zzd, zzd(), bArr, bArr2);
    }
}
