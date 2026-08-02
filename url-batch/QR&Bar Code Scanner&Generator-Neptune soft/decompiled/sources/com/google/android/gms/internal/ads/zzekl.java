package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzekl extends zzekg {
    private final zzcom zza;
    private final zzdck zzb;
    private final zzdim zzc;

    public zzekl(zzcom zzcomVar, zzdck zzdckVar, zzdim zzdimVar) {
        this.zza = zzcomVar;
        this.zzb = zzdckVar;
        this.zzc = zzdimVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    protected final zzfzp zzc(zzfef zzfefVar, Bundle bundle) {
        zzdug zzi = this.zza.zzi();
        zzdck zzdckVar = this.zzb;
        zzdckVar.zzf(zzfefVar);
        zzdckVar.zzd(bundle);
        zzi.zzd(zzdckVar.zzg());
        zzi.zzc(this.zzc);
        zzdah zzb = zzi.zze().zzb();
        return zzb.zzh(zzb.zzi());
    }
}
