package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzggt extends zzgfq {
    zzggt(zzggu zzgguVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* bridge */ /* synthetic */ zzgso zza(zzgso zzgsoVar) throws GeneralSecurityException {
        zzgia zzgiaVar = (zzgia) zzgsoVar;
        zzghw zzc = zzghx.zzc();
        zzc.zzc(0);
        zzc.zza(zzgpw.zzv(zzgox.zza(zzgiaVar.zza())));
        zzc.zzb(zzgiaVar.zzf());
        return (zzghx) zzc.zzam();
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* synthetic */ zzgso zzb(zzgpw zzgpwVar) throws zzgrq {
        return zzgia.zze(zzgpwVar, zzgqq.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzghz zzc = zzgia.zzc();
        zzc.zza(32);
        zzgic zzc2 = zzgid.zzc();
        zzc2.zza(16);
        zzc.zzb((zzgid) zzc2.zzam());
        hashMap.put("AES_CMAC", new zzgfp((zzgia) zzc.zzam(), 1));
        zzghz zzc3 = zzgia.zzc();
        zzc3.zza(32);
        zzgic zzc4 = zzgid.zzc();
        zzc4.zza(16);
        zzc3.zzb((zzgid) zzc4.zzam());
        hashMap.put("AES256_CMAC", new zzgfp((zzgia) zzc3.zzam(), 1));
        zzghz zzc5 = zzgia.zzc();
        zzc5.zza(32);
        zzgic zzc6 = zzgid.zzc();
        zzc6.zza(16);
        zzc5.zzb((zzgid) zzc6.zzam());
        hashMap.put("AES256_CMAC_RAW", new zzgfp((zzgia) zzc5.zzam(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* bridge */ /* synthetic */ void zzd(zzgso zzgsoVar) throws GeneralSecurityException {
        zzgia zzgiaVar = (zzgia) zzgsoVar;
        zzggu.zzm(zzgiaVar.zzf());
        zzggu.zzn(zzgiaVar.zza());
    }
}
