package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhxy {
    public static final /* synthetic */ int zza = 0;
    private static final zzhok zzb = zzhok.zzd(zzhxv.zza, zzhxs.class, zzhfn.class);
    private static final zzhok zzc = zzhok.zzd(zzhxx.zza, zzhxu.class, zzhfo.class);
    private static final zzhfk zzd = zzhnc.zze("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", zzhfn.class, zzhux.zzl());
    private static final zzhet zze = zzhnc.zzf("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", zzhfo.class, 5, zzhuz.zzi());
    private static final zzhmt zzf = zzhxw.zza;
    private static final int zzg = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzg;
        if (!zzhlx.zza(i)) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = zzhzt.zza;
        zzhzt.zza(zzhnw.zza());
        zzhns zza2 = zzhns.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4", zzhxi.zzh);
        BigInteger bigInteger = zzhxq.zza;
        zzhxn zzhxnVar = new zzhxn(null);
        zzhxnVar.zzd(zzhxo.zza);
        zzhxnVar.zza(3072);
        BigInteger bigInteger2 = zzhxq.zza;
        zzhxnVar.zzb(bigInteger2);
        zzhxp zzhxpVar = zzhxp.zzd;
        zzhxnVar.zzc(zzhxpVar);
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", zzhxnVar.zze());
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", zzhxi.zzi);
        hashMap.put("RSA_SSA_PKCS1_4096_SHA512_F4", zzhxi.zzj);
        zzhxn zzhxnVar2 = new zzhxn(null);
        zzhxnVar2.zzd(zzhxo.zzc);
        zzhxnVar2.zza(4096);
        zzhxnVar2.zzb(bigInteger2);
        zzhxnVar2.zzc(zzhxpVar);
        hashMap.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", zzhxnVar2.zze());
        zza2.zzd(hashMap);
        zzhnt.zza().zzb(zzb);
        zzhnt.zza().zzb(zzc);
        zzhnn.zza().zzb(zzf, zzhxq.class);
        zzhmu.zza().zzf(zzd, i, true);
        zzhmu.zza().zzf(zze, i, false);
    }
}
