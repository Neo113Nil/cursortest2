package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzejd implements zzdmp {
    private final Context zza;
    private final zzcgv zzb;
    private final zzfzp zzc;
    private final zzfdk zzd;
    private final zzcmp zze;
    private final zzfef zzf;
    private final zzbpx zzg;
    private final boolean zzh;

    zzejd(Context context, zzcgv zzcgvVar, zzfzp zzfzpVar, zzfdk zzfdkVar, zzcmp zzcmpVar, zzfef zzfefVar, boolean z, zzbpx zzbpxVar) {
        this.zza = context;
        this.zzb = zzcgvVar;
        this.zzc = zzfzpVar;
        this.zzd = zzfdkVar;
        this.zze = zzcmpVar;
        this.zzf = zzfefVar;
        this.zzg = zzbpxVar;
        this.zzh = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdmp
    public final void zza(boolean z, Context context, zzddn zzddnVar) {
        zzdlh zzdlhVar = (zzdlh) zzfzg.zzq(this.zzc);
        this.zze.zzap(true);
        boolean zze = this.zzh ? this.zzg.zze(false) : false;
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzE = com.google.android.gms.ads.internal.util.zzs.zzE(this.zza);
        boolean z2 = this.zzh;
        com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zze, zzE, z2 ? this.zzg.zzd() : false, z2 ? this.zzg.zza() : 0.0f, -1, z, this.zzd.zzP, false);
        if (zzddnVar != null) {
            zzddnVar.zzf();
        }
        com.google.android.gms.ads.internal.zzt.zzi();
        zzdme zzj = zzdlhVar.zzj();
        zzcmp zzcmpVar = this.zze;
        zzfdk zzfdkVar = this.zzd;
        int i = zzfdkVar.zzR;
        zzcgv zzcgvVar = this.zzb;
        String str = zzfdkVar.zzC;
        zzfdp zzfdpVar = zzfdkVar.zzt;
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzj, (com.google.android.gms.ads.internal.overlay.zzz) null, zzcmpVar, i, zzcgvVar, str, zzjVar, zzfdpVar.zzb, zzfdpVar.zza, this.zzf.zzf, zzddnVar), true);
    }
}
