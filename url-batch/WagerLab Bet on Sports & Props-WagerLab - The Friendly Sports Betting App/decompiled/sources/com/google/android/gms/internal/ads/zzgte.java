package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzgte implements zzgpx {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = new byte[0];
    private static final Set zze;
    private final String zzc;
    private final zzgpx zzd;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zze = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    zzgte(zzhdw zzhdwVar, zzgpx zzgpxVar) throws GeneralSecurityException {
        if (zze.contains(zzhdwVar.zza())) {
            this.zzc = zzhdwVar.zza();
            zzhdv zzg = zzhdw.zzg(zzhdwVar);
            zzg.zzc(zzhep.RAW);
            zzgqu.zzb(((zzhdw) zzg.zzbu()).zzaN());
            this.zzd = zzgpxVar;
            return;
        }
        String zza2 = zzhdwVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 67);
        sb.append("Unsupported DEK key type: ");
        sb.append(zza2);
        sb.append(". Only Tink AEAD key types are supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > 4096 || i > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            byte[] zza2 = this.zzd.zza(bArr3, zzb);
            String str = this.zzc;
            zzhhb zzhhbVar = zzhhb.zzb;
            return ((zzgpx) zzgyl.zza().zzd(zzgyo.zza().zzg(zzgzj.zza(str, zzhhb.zzr(zza2, 0, zza2.length), zzhds.SYMMETRIC, zzhep.RAW, null), zzgqc.zza()), zzgpx.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
