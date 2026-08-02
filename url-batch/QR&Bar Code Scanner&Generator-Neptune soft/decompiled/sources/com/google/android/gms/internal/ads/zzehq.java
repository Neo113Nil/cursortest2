package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzehq implements zzdmp {
    private final zzcgv zza;
    private final zzfzp zzb;
    private final zzfdk zzc;
    private final zzcmp zzd;
    private final zzfef zze;
    private final zzbpx zzf;
    private final boolean zzg;

    zzehq(zzcgv zzcgvVar, zzfzp zzfzpVar, zzfdk zzfdkVar, zzcmp zzcmpVar, zzfef zzfefVar, boolean z, zzbpx zzbpxVar) {
        this.zza = zzcgvVar;
        this.zzb = zzfzpVar;
        this.zzc = zzfdkVar;
        this.zzd = zzcmpVar;
        this.zze = zzfefVar;
        this.zzg = z;
        this.zzf = zzbpxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdmp
    public final void zza(boolean z, Context context, zzddn zzddnVar) {
        zzcwn zzcwnVar = (zzcwn) zzfzg.zzq(this.zzb);
        this.zzd.zzap(true);
        boolean zze = this.zzg ? this.zzf.zze(true) : true;
        boolean z2 = this.zzg;
        com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zze, true, z2 ? this.zzf.zzd() : false, z2 ? this.zzf.zza() : 0.0f, -1, z, this.zzc.zzP, false);
        if (zzddnVar != null) {
            zzddnVar.zzf();
        }
        com.google.android.gms.ads.internal.zzt.zzi();
        zzdme zzg = zzcwnVar.zzg();
        zzcmp zzcmpVar = this.zzd;
        int i = this.zzc.zzR;
        if (i == -1) {
            com.google.android.gms.ads.internal.client.zzw zzwVar = this.zze.zzj;
            if (zzwVar != null) {
                int i2 = zzwVar.zza;
                if (i2 == 1) {
                    i = 7;
                } else if (i2 == 2) {
                    i = 6;
                }
            }
            com.google.android.gms.ads.internal.util.zze.zze("Error setting app open orientation; no targeting orientation available.");
            i = this.zzc.zzR;
        }
        int i3 = i;
        zzcgv zzcgvVar = this.zza;
        zzfdk zzfdkVar = this.zzc;
        String str = zzfdkVar.zzC;
        zzfdp zzfdpVar = zzfdkVar.zzt;
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzg, (com.google.android.gms.ads.internal.overlay.zzz) null, zzcmpVar, i3, zzcgvVar, str, zzjVar, zzfdpVar.zzb, zzfdpVar.zza, this.zze.zzf, zzddnVar), true);
    }
}
