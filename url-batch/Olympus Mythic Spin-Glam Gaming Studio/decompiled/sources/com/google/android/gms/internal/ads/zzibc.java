package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzibc implements zzhek {
    private final zzibs zza;
    private final zzhfi zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzibc(zzibs zzibsVar, zzhfi zzhfiVar, int i, byte[] bArr) {
        this.zza = zzibsVar;
        this.zzb = zzhfiVar;
        this.zzc = i;
        this.zzd = bArr;
    }

    public static zzhek zzb(zzhge zzhgeVar) throws GeneralSecurityException {
        zziam zziamVar = new zziam(zzhgeVar.zze().zzc(zzheq.zza()), zzhgeVar.zzg().zzf());
        String valueOf = String.valueOf(zzhgeVar.zzg().zzh());
        return new zzibc(zziamVar, new zzibx(new zzibw("HMAC".concat(valueOf), new SecretKeySpec(zzhgeVar.zzf().zzc(zzheq.zza()), "HMAC")), zzhgeVar.zzg().zze()), zzhgeVar.zzg().zze(), zzhgeVar.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int length = bArr.length;
        int i = this.zzc;
        int length2 = bArr3.length;
        if (length < i + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzhpd.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i2 = length - i;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, length2, i2);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i2, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (MessageDigest.isEqual(((zzibx) this.zzb).zzc(zziat.zza(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), copyOfRange2)) {
            return this.zza.zza(copyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
