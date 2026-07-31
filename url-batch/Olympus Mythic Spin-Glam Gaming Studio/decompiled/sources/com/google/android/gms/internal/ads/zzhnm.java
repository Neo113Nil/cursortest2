package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
final /* synthetic */ class zzhnm implements zzhmt {
    static final /* synthetic */ zzhnm zza = new zzhnm();

    private /* synthetic */ zzhnm() {
    }

    @Override // com.google.android.gms.internal.ads.zzhmt
    public final /* synthetic */ zzhes zza(zzhfj zzhfjVar, Integer num) {
        int i = zzhnn.zza;
        zzhtw zzc = ((zzhnf) zzhfjVar).zzb().zzc();
        zzhet zzd = zzhmu.zza().zzd(zzc.zza());
        if (!zzhmu.zza().zze(zzc.zza())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        zzhtt zzd2 = zzd.zzd(zzc.zzb());
        return new zzhne(zzhos.zza(zzd2.zza(), zzd2.zzb(), zzhor.zzc(zzd2.zzi()), zzhor.zzd(zzc.zzk()), num), zzheq.zza());
    }
}
