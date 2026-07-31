package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final /* synthetic */ class zzgye implements zzgyd {
    static final /* synthetic */ zzgye zza = new zzgye();

    private /* synthetic */ zzgye() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyd
    public final /* synthetic */ zzgqd zza(zzgqs zzgqsVar, Integer num) {
        int i = zzgyf.zza;
        zzhdw zzc = ((zzgxw) zzgqsVar).zzb().zzc();
        zzgqe zzd = zzgxk.zza().zzd(zzc.zza());
        if (!zzgxk.zza().zze(zzc.zza())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        zzhdt zzc2 = zzd.zzc(zzc.zzb());
        return new zzgxv(zzgzj.zza(zzc2.zza(), zzc2.zzb(), zzc2.zzc(), zzc.zzc(), num), zzgqc.zza());
    }
}
