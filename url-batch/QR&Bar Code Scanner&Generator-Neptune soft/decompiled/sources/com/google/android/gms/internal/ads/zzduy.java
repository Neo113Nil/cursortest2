package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzduy {
    private final zzcnb zza;
    private final Context zzb;
    private final zzape zzc;
    private final zzbkb zzd;
    private final zzcgv zze;
    private final com.google.android.gms.ads.internal.zza zzf;
    private final zzbep zzg;
    private final zzdfp zzh;

    public zzduy(zzcnb zzcnbVar, Context context, zzape zzapeVar, zzbkb zzbkbVar, zzcgv zzcgvVar, com.google.android.gms.ads.internal.zza zzaVar, zzbep zzbepVar, zzdfp zzdfpVar) {
        this.zza = zzcnbVar;
        this.zzb = context;
        this.zzc = zzapeVar;
        this.zzd = zzbkbVar;
        this.zze = zzcgvVar;
        this.zzf = zzaVar;
        this.zzg = zzbepVar;
        this.zzh = zzdfpVar;
    }

    public final zzcmp zza(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfdk zzfdkVar, zzfdn zzfdnVar) throws zzcna {
        return zzcnb.zza(this.zzb, zzcoe.zzc(zzqVar), zzqVar.zza, false, false, this.zzc, this.zzd, this.zze, null, new zzdun(this), this.zzf, this.zzg, zzfdkVar, zzfdnVar);
    }
}
