package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
final /* synthetic */ class zzhxw implements zzhmt {
    static final /* synthetic */ zzhxw zza = new zzhxw();

    private /* synthetic */ zzhxw() {
    }

    @Override // com.google.android.gms.internal.ads.zzhmt
    public final /* synthetic */ zzhes zza(zzhfj zzhfjVar, Integer num) {
        zzhxq zzhxqVar = (zzhxq) zzhfjVar;
        int i = zzhxy.zza;
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzibh.zze.zzb("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(zzhxqVar.zzc(), new BigInteger(1, zzhxqVar.zzd().toByteArray())));
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
        zzhxt zzhxtVar = new zzhxt(null);
        zzhxtVar.zza(zzhxqVar);
        zzhxtVar.zzb(rSAPublicKey.getModulus());
        zzhxtVar.zzc(num);
        zzhxu zzd = zzhxtVar.zzd();
        zzhxr zzhxrVar = new zzhxr(null);
        zzhxrVar.zza(zzd);
        zzhxrVar.zzb(zzici.zza(rSAPrivateCrtKey.getPrimeP(), zzheq.zza()), zzici.zza(rSAPrivateCrtKey.getPrimeQ(), zzheq.zza()));
        zzhxrVar.zzc(zzici.zza(rSAPrivateCrtKey.getPrivateExponent(), zzheq.zza()));
        zzhxrVar.zzd(zzici.zza(rSAPrivateCrtKey.getPrimeExponentP(), zzheq.zza()), zzici.zza(rSAPrivateCrtKey.getPrimeExponentQ(), zzheq.zza()));
        zzhxrVar.zze(zzici.zza(rSAPrivateCrtKey.getCrtCoefficient(), zzheq.zza()));
        return zzhxrVar.zzf();
    }
}
