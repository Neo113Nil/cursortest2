package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeke extends zzekg {
    private final zzcom zza;
    private final zzdmy zzb;
    private final zzdck zzc;
    private final zzdim zzd;

    public zzeke(zzcom zzcomVar, zzdmy zzdmyVar, zzdck zzdckVar, zzdim zzdimVar) {
        this.zza = zzcomVar;
        this.zzb = zzdmyVar;
        this.zzc = zzdckVar;
        this.zzd = zzdimVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    protected final zzfzp zzc(zzfef zzfefVar, Bundle bundle) {
        zzdnc zzh = this.zza.zzh();
        zzdck zzdckVar = this.zzc;
        zzdckVar.zzf(zzfefVar);
        zzdckVar.zzd(bundle);
        zzh.zzf(zzdckVar.zzg());
        zzh.zze(this.zzd);
        zzh.zzd(this.zzb);
        zzh.zzc(new zzcwz(null));
        zzdah zza = zzh.zzg().zza();
        return zza.zzh(zza.zzi());
    }
}
