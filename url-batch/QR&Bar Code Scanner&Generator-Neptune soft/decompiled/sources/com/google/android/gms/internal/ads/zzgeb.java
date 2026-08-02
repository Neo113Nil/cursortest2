package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgeb extends zzgfq {
    final /* synthetic */ zzgec zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgeb(zzgec zzgecVar, Class cls) {
        super(cls);
        this.zza = zzgecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* bridge */ /* synthetic */ zzgso zza(zzgso zzgsoVar) throws GeneralSecurityException {
        zzgkh zzgkhVar = (zzgkh) zzgsoVar;
        KeyPair zzc = zzgoe.zzc(zzgoe.zzk(zzgel.zzc(zzgkhVar.zze().zzf().zzg())));
        ECPublicKey eCPublicKey = (ECPublicKey) zzc.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) zzc.getPrivate();
        ECPoint w = eCPublicKey.getW();
        zzgkp zzd = zzgkq.zzd();
        zzd.zzb(0);
        zzd.zza(zzgkhVar.zze());
        zzd.zzc(zzgpw.zzv(w.getAffineX().toByteArray()));
        zzd.zzd(zzgpw.zzv(w.getAffineY().toByteArray()));
        zzgkq zzgkqVar = (zzgkq) zzd.zzam();
        zzgkm zzc2 = zzgkn.zzc();
        zzc2.zzc(0);
        zzc2.zzb(zzgkqVar);
        zzc2.zza(zzgpw.zzv(eCPrivateKey.getS().toByteArray()));
        return (zzgkn) zzc2.zzam();
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* synthetic */ zzgso zzb(zzgpw zzgpwVar) throws zzgrq {
        return zzgkh.zzd(zzgpwVar, zzgqq.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final Map zzc() throws GeneralSecurityException {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        HashMap hashMap = new HashMap();
        zzgbd zza = zzgbe.zza("AES128_GCM");
        bArr = zzgec.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzgec.zzh(4, 5, 3, zza, bArr, 1));
        zzgbd zza2 = zzgbe.zza("AES128_GCM");
        bArr2 = zzgec.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzgec.zzh(4, 5, 3, zza2, bArr2, 3));
        zzgbd zza3 = zzgbe.zza("AES128_GCM");
        bArr3 = zzgec.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzgec.zzh(4, 5, 4, zza3, bArr3, 1));
        zzgbd zza4 = zzgbe.zza("AES128_GCM");
        bArr4 = zzgec.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzgec.zzh(4, 5, 4, zza4, bArr4, 3));
        zzgbd zza5 = zzgbe.zza("AES128_GCM");
        bArr5 = zzgec.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzgec.zzh(4, 5, 4, zza5, bArr5, 3));
        zzgbd zza6 = zzgbe.zza("AES128_CTR_HMAC_SHA256");
        bArr6 = zzgec.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzgec.zzh(4, 5, 3, zza6, bArr6, 1));
        zzgbd zza7 = zzgbe.zza("AES128_CTR_HMAC_SHA256");
        bArr7 = zzgec.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzgec.zzh(4, 5, 3, zza7, bArr7, 3));
        zzgbd zza8 = zzgbe.zza("AES128_CTR_HMAC_SHA256");
        bArr8 = zzgec.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzgec.zzh(4, 5, 4, zza8, bArr8, 1));
        zzgbd zza9 = zzgbe.zza("AES128_CTR_HMAC_SHA256");
        bArr9 = zzgec.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzgec.zzh(4, 5, 4, zza9, bArr9, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* synthetic */ void zzd(zzgso zzgsoVar) throws GeneralSecurityException {
        zzgel.zza(((zzgkh) zzgsoVar).zze());
    }
}
