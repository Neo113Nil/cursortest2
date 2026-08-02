package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdbs implements zzdfv {
    private final Context zza;
    private final zzfef zzb;
    private final zzcgv zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzdzs zze;
    private final zzfjw zzf;

    public zzdbs(Context context, zzfef zzfefVar, zzcgv zzcgvVar, com.google.android.gms.ads.internal.util.zzg zzgVar, zzdzs zzdzsVar, zzfjw zzfjwVar) {
        this.zza = context;
        this.zzb = zzfefVar;
        this.zzc = zzcgvVar;
        this.zzd = zzgVar;
        this.zze = zzdzsVar;
        this.zzf = zzfjwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdfv
    public final void zzb(zzfdw zzfdwVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdfv
    public final void zzbE(zzcbc zzcbcVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzde)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zza().zzc(this.zza, this.zzc, this.zzb.zzf, this.zzd.zzh(), this.zzf);
        }
        this.zze.zzr();
    }
}
