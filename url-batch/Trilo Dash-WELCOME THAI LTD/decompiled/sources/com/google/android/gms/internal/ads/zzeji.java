package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzeji implements zzdlf {
    private final Context zza;
    private final zzdto zzb;
    private final zzfby zzc;
    private final zzcfo zzd;
    private final zzfbg zze;
    private final zzfvj zzf;
    private final zzcli zzg;
    private final zzboo zzh;
    private final boolean zzi;

    zzeji(Context context, zzdto zzdtoVar, zzfby zzfbyVar, zzcfo zzcfoVar, zzfbg zzfbgVar, zzfvj zzfvjVar, zzcli zzcliVar, zzboo zzbooVar, boolean z) {
        this.zza = context;
        this.zzb = zzdtoVar;
        this.zzc = zzfbyVar;
        this.zzd = zzcfoVar;
        this.zze = zzfbgVar;
        this.zzf = zzfvjVar;
        this.zzg = zzcliVar;
        this.zzh = zzbooVar;
        this.zzi = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0088  */
    @Override // com.google.android.gms.internal.ads.zzdlf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(boolean z, Context context, zzdcf zzdcfVar) {
        zzcli zzcliVar;
        zzcli zzcliVar2;
        zzdst zzdstVar = (zzdst) zzfva.zzq(this.zzf);
        try {
            zzfbg zzfbgVar = this.zze;
            if (this.zzg.zzaD()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzaG)).booleanValue()) {
                    final zzcli zza = this.zzb.zza(this.zzc.zze, null, null);
                    zzbpb.zzb(zza, zzdstVar.zzg());
                    final zzdts zzdtsVar = new zzdts();
                    zzdtsVar.zza(this.zza, (View) zza);
                    zzdstVar.zzl().zzi(zza, true, this.zzi ? this.zzh : null);
                    zza.zzP().zzz(new zzcmt() { // from class: com.google.android.gms.internal.ads.zzejg
                        @Override // com.google.android.gms.internal.ads.zzcmt
                        public final void zza(boolean z2) {
                            zzdts zzdtsVar2 = zzdts.this;
                            zzcli zzcliVar3 = zza;
                            zzdtsVar2.zzb();
                            zzcliVar3.zzaa();
                            zzcliVar3.zzP().zzp();
                        }
                    });
                    zza.zzP().zzF(new zzcmu() { // from class: com.google.android.gms.internal.ads.zzejh
                        @Override // com.google.android.gms.internal.ads.zzcmu
                        public final void zza() {
                            zzcli.this.zzZ();
                        }
                    });
                    zzfbl zzfblVar = zzfbgVar.zzt;
                    zza.zzad(zzfblVar.zzb, zzfblVar.zza, null);
                    zzcliVar = zza;
                    zzcliVar.zzap(true);
                    boolean zze = !this.zzi ? this.zzh.zze(false) : false;
                    com.google.android.gms.ads.internal.zzt.zzp();
                    boolean zzE = com.google.android.gms.ads.internal.util.zzs.zzE(this.zza);
                    boolean z2 = this.zzi;
                    boolean zzd = !z2 ? this.zzh.zzd() : false;
                    float zza2 = !z2 ? this.zzh.zza() : 0.0f;
                    zzfbg zzfbgVar2 = this.zze;
                    com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zze, zzE, zzd, zza2, -1, z, zzfbgVar2.zzP, zzfbgVar2.zzQ);
                    if (zzdcfVar != null) {
                        zzdcfVar.zzf();
                    }
                    com.google.android.gms.ads.internal.zzt.zzj();
                    zzdku zzj = zzdstVar.zzj();
                    zzfbg zzfbgVar3 = this.zze;
                    int i = zzfbgVar3.zzR;
                    zzcfo zzcfoVar = this.zzd;
                    String str = zzfbgVar3.zzC;
                    zzfbl zzfblVar2 = zzfbgVar3.zzt;
                    com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzj, (com.google.android.gms.ads.internal.overlay.zzw) null, zzcliVar, i, zzcfoVar, str, zzjVar, zzfblVar2.zzb, zzfblVar2.zza, this.zzc.zzf, zzdcfVar), true);
                }
                zzcliVar2 = this.zzg;
            } else {
                zzcliVar2 = this.zzg;
            }
            zzcliVar = zzcliVar2;
            zzcliVar.zzap(true);
            if (!this.zzi) {
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            boolean zzE2 = com.google.android.gms.ads.internal.util.zzs.zzE(this.zza);
            boolean z22 = this.zzi;
            if (!z22) {
            }
            if (!z22) {
            }
            zzfbg zzfbgVar22 = this.zze;
            com.google.android.gms.ads.internal.zzj zzjVar2 = new com.google.android.gms.ads.internal.zzj(zze, zzE2, zzd, zza2, -1, z, zzfbgVar22.zzP, zzfbgVar22.zzQ);
            if (zzdcfVar != null) {
            }
            com.google.android.gms.ads.internal.zzt.zzj();
            zzdku zzj2 = zzdstVar.zzj();
            zzfbg zzfbgVar32 = this.zze;
            int i2 = zzfbgVar32.zzR;
            zzcfo zzcfoVar2 = this.zzd;
            String str2 = zzfbgVar32.zzC;
            zzfbl zzfblVar22 = zzfbgVar32.zzt;
            com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzj2, (com.google.android.gms.ads.internal.overlay.zzw) null, zzcliVar, i2, zzcfoVar2, str2, zzjVar2, zzfblVar22.zzb, zzfblVar22.zza, this.zzc.zzf, zzdcfVar), true);
        } catch (zzclt e) {
            zzcfi.zzh("", e);
        }
    }
}
