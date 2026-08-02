package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzekh extends zzekg {
    private final zzcom zza;
    private final zzdck zzb;
    private final zzemp zzc;
    private final zzdim zzd;
    private final zzdmy zze;
    private final zzdfp zzf;
    private final ViewGroup zzg;
    private final zzdhv zzh;

    public zzekh(zzcom zzcomVar, zzdck zzdckVar, zzemp zzempVar, zzdim zzdimVar, zzdmy zzdmyVar, zzdfp zzdfpVar, ViewGroup viewGroup, zzdhv zzdhvVar) {
        this.zza = zzcomVar;
        this.zzb = zzdckVar;
        this.zzc = zzempVar;
        this.zzd = zzdimVar;
        this.zze = zzdmyVar;
        this.zzf = zzdfpVar;
        this.zzg = viewGroup;
        this.zzh = zzdhvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    protected final zzfzp zzc(zzfef zzfefVar, Bundle bundle) {
        zzcxy zze = this.zza.zze();
        zzdck zzdckVar = this.zzb;
        zzdckVar.zzf(zzfefVar);
        zzdckVar.zzd(bundle);
        zze.zzi(zzdckVar.zzg());
        zze.zzf(this.zzd);
        zze.zze(this.zzc);
        zze.zzd(this.zze);
        zze.zzg(new zzcyw(this.zzf, this.zzh));
        zze.zzc(new zzcwz(this.zzg));
        zzdah zzd = zze.zzj().zzd();
        return zzd.zzh(zzd.zzi());
    }
}
