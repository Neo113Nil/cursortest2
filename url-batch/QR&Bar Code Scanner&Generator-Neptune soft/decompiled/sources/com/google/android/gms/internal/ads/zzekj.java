package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzekj extends zzekg {
    private final zzcom zza;
    private final zzdck zzb;
    private final zzemp zzc;
    private final zzdim zzd;

    public zzekj(zzcom zzcomVar, zzdck zzdckVar, zzemp zzempVar, zzdim zzdimVar) {
        this.zza = zzcomVar;
        this.zzb = zzdckVar;
        this.zzc = zzempVar;
        this.zzd = zzdimVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    protected final zzfzp zzc(zzfef zzfefVar, Bundle bundle) {
        zzdmg zzg = this.zza.zzg();
        zzdck zzdckVar = this.zzb;
        zzdckVar.zzf(zzfefVar);
        zzdckVar.zzd(bundle);
        zzg.zze(zzdckVar.zzg());
        zzg.zzd(this.zzd);
        zzg.zzc(this.zzc);
        zzdah zza = zzg.zzf().zza();
        return zza.zzh(zza.zzi());
    }
}
