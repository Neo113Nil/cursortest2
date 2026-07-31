package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final /* synthetic */ class zzgry implements zzgyd {
    static final /* synthetic */ zzgry zza = new zzgry();

    private /* synthetic */ zzgry() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyd
    public final /* synthetic */ zzgqd zza(zzgqs zzgqsVar, Integer num) {
        zzgsc zzgscVar = (zzgsc) zzgqsVar;
        int i = zzgrz.zza;
        if (zzgscVar.zzc() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        zzgrv zzgrvVar = new zzgrv(null);
        zzgrvVar.zza(zzgscVar);
        zzgrvVar.zzc(num);
        zzgrvVar.zzb(zzhgh.zzb(zzgscVar.zzc()));
        return zzgrvVar.zzd();
    }
}
