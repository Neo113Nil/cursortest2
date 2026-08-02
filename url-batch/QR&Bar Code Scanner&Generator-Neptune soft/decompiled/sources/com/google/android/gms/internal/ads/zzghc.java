package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzghc extends zzgfq {
    final /* synthetic */ zzghd zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzghc(zzghd zzghdVar, Class cls) {
        super(cls);
        this.zza = zzghdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* bridge */ /* synthetic */ zzgso zza(zzgso zzgsoVar) throws GeneralSecurityException {
        zzgld zzgldVar = (zzgld) zzgsoVar;
        zzgkz zzc = zzgla.zzc();
        zzc.zzc(0);
        zzc.zzb(zzgldVar.zzg());
        zzc.zza(zzgpw.zzv(zzgox.zza(zzgldVar.zza())));
        return (zzgla) zzc.zzam();
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* synthetic */ zzgso zzb(zzgpw zzgpwVar) throws zzgrq {
        return zzgld.zzf(zzgpwVar, zzgqq.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", zzghd.zzm(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzghd.zzm(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", zzghd.zzm(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzghd.zzm(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", zzghd.zzm(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzghd.zzm(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", zzghd.zzm(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzghd.zzm(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", zzghd.zzm(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzghd.zzm(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* bridge */ /* synthetic */ void zzd(zzgso zzgsoVar) throws GeneralSecurityException {
        zzgld zzgldVar = (zzgld) zzgsoVar;
        if (zzgldVar.zza() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzghd.zzn(zzgldVar.zzg());
    }
}
