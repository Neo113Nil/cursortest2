package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzefn implements zzdlf {
    private final zzcfo zza;
    private final zzfvj zzb;
    private final zzfbg zzc;
    private final zzcli zzd;
    private final zzfby zze;
    private final zzboo zzf;
    private final boolean zzg;

    zzefn(zzcfo zzcfoVar, zzfvj zzfvjVar, zzfbg zzfbgVar, zzcli zzcliVar, zzfby zzfbyVar, boolean z, zzboo zzbooVar) {
        this.zza = zzcfoVar;
        this.zzb = zzfvjVar;
        this.zzc = zzfbgVar;
        this.zzd = zzcliVar;
        this.zze = zzfbyVar;
        this.zzg = z;
        this.zzf = zzbooVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdlf
    public final void zza(boolean z, Context context, zzdcf zzdcfVar) {
        int i;
        zzcvf zzcvfVar = (zzcvf) zzfva.zzq(this.zzb);
        this.zzd.zzap(true);
        boolean zze = this.zzg ? this.zzf.zze(true) : true;
        boolean z2 = this.zzg;
        com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zze, true, z2 ? this.zzf.zzd() : false, z2 ? this.zzf.zza() : 0.0f, -1, z, this.zzc.zzP, false);
        if (zzdcfVar != null) {
            zzdcfVar.zzf();
        }
        com.google.android.gms.ads.internal.zzt.zzj();
        zzdku zzg = zzcvfVar.zzg();
        zzcli zzcliVar = this.zzd;
        int i2 = this.zzc.zzR;
        if (i2 == -1) {
            com.google.android.gms.ads.internal.client.zzw zzwVar = this.zze.zzj;
            if (zzwVar != null) {
                int i3 = zzwVar.zza;
                if (i3 == 1) {
                    i = 7;
                } else if (i3 == 2) {
                    i = 6;
                }
                zzcfo zzcfoVar = this.zza;
                zzfbg zzfbgVar = this.zzc;
                String str = zzfbgVar.zzC;
                zzfbl zzfblVar = zzfbgVar.zzt;
                com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzg, (com.google.android.gms.ads.internal.overlay.zzw) null, zzcliVar, i, zzcfoVar, str, zzjVar, zzfblVar.zzb, zzfblVar.zza, this.zze.zzf, zzdcfVar), true);
            }
            com.google.android.gms.ads.internal.util.zze.zze("Error setting app open orientation; no targeting orientation available.");
            i2 = this.zzc.zzR;
        }
        i = i2;
        zzcfo zzcfoVar2 = this.zza;
        zzfbg zzfbgVar2 = this.zzc;
        String str2 = zzfbgVar2.zzC;
        zzfbl zzfblVar2 = zzfbgVar2.zzt;
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzg, (com.google.android.gms.ads.internal.overlay.zzw) null, zzcliVar, i, zzcfoVar2, str2, zzjVar, zzfblVar2.zzb, zzfblVar2.zza, this.zze.zzf, zzdcfVar), true);
    }
}
