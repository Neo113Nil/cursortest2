package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhwf {
    public static final /* synthetic */ int zza = 0;
    private static final zzhok zzb = zzhok.zzd(zzhwc.zza, zzhvz.class, zzhfn.class);
    private static final zzhok zzc = zzhok.zzd(zzhwe.zza, zzhwb.class, zzhfo.class);
    private static final zzhfk zzd = zzhnc.zze("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", zzhfn.class, zzhta.zzg());
    private static final zzhet zze = zzhnc.zzf("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", zzhfo.class, 5, zzhtc.zzi());
    private static final zzhmt zzf = zzhwd.zza;
    private static final int zzg = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzg;
        if (!zzhlx.zza(i)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = zzhyz.zza;
        zzhyz.zza(zzhnw.zza());
        zzhns zza2 = zzhns.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("ECDSA_P256", zzhxi.zza);
        hashMap.put("ECDSA_P256_IEEE_P1363", zzhxi.zzd);
        zzhvs zzhvsVar = new zzhvs(null);
        zzhvsVar.zzc(zzhvu.zza);
        zzhvsVar.zzb(zzhvt.zza);
        zzhvsVar.zza(zzhvv.zza);
        zzhvsVar.zzd(zzhvw.zzd);
        hashMap.put("ECDSA_P256_RAW", zzhvsVar.zze());
        hashMap.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", zzhxi.zzf);
        hashMap.put("ECDSA_P384", zzhxi.zzb);
        hashMap.put("ECDSA_P384_IEEE_P1363", zzhxi.zze);
        zzhvs zzhvsVar2 = new zzhvs(null);
        zzhvsVar2.zzc(zzhvu.zzc);
        zzhvt zzhvtVar = zzhvt.zzb;
        zzhvsVar2.zzb(zzhvtVar);
        zzhvv zzhvvVar = zzhvv.zzb;
        zzhvsVar2.zza(zzhvvVar);
        zzhvw zzhvwVar = zzhvw.zza;
        zzhvsVar2.zzd(zzhvwVar);
        hashMap.put("ECDSA_P384_SHA512", zzhvsVar2.zze());
        zzhvs zzhvsVar3 = new zzhvs(null);
        zzhvsVar3.zzc(zzhvu.zzb);
        zzhvsVar3.zzb(zzhvtVar);
        zzhvsVar3.zza(zzhvvVar);
        zzhvsVar3.zzd(zzhvwVar);
        hashMap.put("ECDSA_P384_SHA384", zzhvsVar3.zze());
        hashMap.put("ECDSA_P521", zzhxi.zzc);
        hashMap.put("ECDSA_P521_IEEE_P1363", zzhxi.zzg);
        zza2.zzd(Collections.unmodifiableMap(hashMap));
        zzhnt.zza().zzb(zzb);
        zzhnt.zza().zzb(zzc);
        zzhnn.zza().zzb(zzf, zzhvx.class);
        zzhmu.zza().zzf(zzd, i, true);
        zzhmu.zza().zzf(zze, i, false);
    }
}
