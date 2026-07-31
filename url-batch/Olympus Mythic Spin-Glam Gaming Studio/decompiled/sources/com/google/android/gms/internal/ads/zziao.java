package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zziao implements zzhek {
    private static final ThreadLocal zza = new zzian();
    private final byte[] zzb;
    private final zzhrh zzc;
    private final SecretKeySpec zzd;
    private final int zze;

    private zziao(byte[] bArr, int i, byte[] bArr2) throws GeneralSecurityException {
        if (!zzhlx.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zze = i;
        int length = bArr.length;
        zzicf.zza(length);
        this.zzd = new SecretKeySpec(bArr, "AES");
        this.zzc = zzibu.zzb(zzhrf.zzc(zzhrg.zzb(length), zzicj.zza(bArr, zzheq.zza())));
        this.zzb = bArr2;
    }

    public static zzhek zzb(zzhgo zzhgoVar) throws GeneralSecurityException {
        if (!zzhlx.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        zzhgoVar.zzf();
        return new zziao(zzhgoVar.zze().zzc(zzheq.zza()), zzhgoVar.zzf().zzd(), zzhgoVar.zzc().zzc());
    }

    private final byte[] zzc(int i, byte[] bArr, int i2, int i3) throws GeneralSecurityException {
        byte[] bArr2 = new byte[i3 + 16];
        bArr2[15] = (byte) i;
        System.arraycopy(bArr, i2, bArr2, 16, i3);
        return this.zzc.zza(bArr2, 16);
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i = this.zze;
        int i2 = ((length - length2) - i) - 16;
        if (i2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhpd.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] zzc = zzc(0, bArr, length2, i);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] zzc2 = zzc(1, bArr2, 0, bArr2.length);
        byte[] zzc3 = zzc(2, bArr, length2 + i, i2);
        int i3 = length - 16;
        byte b = 0;
        for (int i4 = 0; i4 < 16; i4++) {
            b = (byte) (b | (((bArr[i3 + i4] ^ zzc2[i4]) ^ zzc[i4]) ^ zzc3[i4]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) zza.get();
        cipher.init(1, this.zzd, new IvParameterSpec(zzc));
        return cipher.doFinal(bArr, bArr3.length + i, i2);
    }
}
