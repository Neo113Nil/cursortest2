package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhfj implements zzgpx {
    private final zzhfy zza;
    private final zzgqr zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzhfj(zzhfy zzhfyVar, zzgqr zzgqrVar, int i, byte[] bArr) {
        this.zza = zzhfyVar;
        this.zzb = zzgqrVar;
        this.zzc = i;
        this.zzd = bArr;
    }

    public static zzgpx zzb(zzgrm zzgrmVar) throws GeneralSecurityException {
        zzhfd zzhfdVar = new zzhfd(zzgrmVar.zzd().zzc(zzgqc.zza()), zzgrmVar.zzf().zzf());
        String valueOf = String.valueOf(zzgrmVar.zzf().zzh());
        String.valueOf(valueOf);
        String valueOf2 = String.valueOf(valueOf);
        return new zzhfj(zzhfdVar, new zzhgd(new zzhgc("HMAC".concat(valueOf2), new SecretKeySpec(zzgrmVar.zze().zzc(zzgqc.zza()), "HMAC")), zzgrmVar.zzf().zze()), zzgrmVar.zzf().zze(), zzgrmVar.zzb().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int length = bArr.length;
        int i = this.zzc;
        int length2 = bArr3.length;
        if (length < i + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzgzu.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i2 = length - i;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, length2, i2);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i2, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (MessageDigest.isEqual(((zzhgd) this.zzb).zzc(zzhfh.zza(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), copyOfRange2)) {
            return this.zza.zza(copyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
