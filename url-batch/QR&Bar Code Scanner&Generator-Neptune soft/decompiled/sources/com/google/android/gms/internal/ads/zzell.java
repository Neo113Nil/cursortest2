package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzell implements zzdmp {
    private final Context zza;
    private final zzduy zzb;
    private final zzfef zzc;
    private final zzcgv zzd;
    private final zzfdk zze;
    private final zzfzp zzf;
    private final zzcmp zzg;
    private final zzbpx zzh;
    private final boolean zzi;

    zzell(Context context, zzduy zzduyVar, zzfef zzfefVar, zzcgv zzcgvVar, zzfdk zzfdkVar, zzfzp zzfzpVar, zzcmp zzcmpVar, zzbpx zzbpxVar, boolean z) {
        this.zza = context;
        this.zzb = zzduyVar;
        this.zzc = zzfefVar;
        this.zzd = zzcgvVar;
        this.zze = zzfdkVar;
        this.zzf = zzfzpVar;
        this.zzg = zzcmpVar;
        this.zzh = zzbpxVar;
        this.zzi = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0088  */
    @Override // com.google.android.gms.internal.ads.zzdmp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(boolean z, Context context, zzddn zzddnVar) {
        zzcmp zzcmpVar;
        zzcmp zzcmpVar2;
        zzdud zzdudVar = (zzdud) zzfzg.zzq(this.zzf);
        try {
            zzfdk zzfdkVar = this.zze;
            if (this.zzg.zzaD()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzaG)).booleanValue()) {
                    final zzcmp zza = this.zzb.zza(this.zzc.zze, null, null);
                    zzbql.zzb(zza, zzdudVar.zzg());
                    final zzdvc zzdvcVar = new zzdvc();
                    zzdvcVar.zza(this.zza, (View) zza);
                    zzdudVar.zzl().zzi(zza, true, this.zzi ? this.zzh : null);
                    zza.zzP().zzz(new zzcoa() { // from class: com.google.android.gms.internal.ads.zzelj
                        @Override // com.google.android.gms.internal.ads.zzcoa
                        public final void zza(boolean z2) {
                            zzdvc zzdvcVar2 = zzdvc.this;
                            zzcmp zzcmpVar3 = zza;
                            zzdvcVar2.zzb();
                            zzcmpVar3.zzaa();
                            zzcmpVar3.zzP().zzp();
                        }
                    });
                    zza.zzP().zzF(new zzcob() { // from class: com.google.android.gms.internal.ads.zzelk
                        @Override // com.google.android.gms.internal.ads.zzcob
                        public final void zza() {
                            zzcmp.this.zzZ();
                        }
                    });
                    zzfdp zzfdpVar = zzfdkVar.zzt;
                    zza.zzad(zzfdpVar.zzb, zzfdpVar.zza, null);
                    zzcmpVar = zza;
                    zzcmpVar.zzap(true);
                    boolean zze = !this.zzi ? this.zzh.zze(false) : false;
                    com.google.android.gms.ads.internal.zzt.zzp();
                    boolean zzE = com.google.android.gms.ads.internal.util.zzs.zzE(this.zza);
                    boolean z2 = this.zzi;
                    boolean zzd = z2 ? this.zzh.zzd() : false;
                    float zza2 = !z2 ? this.zzh.zza() : 0.0f;
                    zzfdk zzfdkVar2 = this.zze;
                    com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zze, zzE, zzd, zza2, -1, z, zzfdkVar2.zzP, zzfdkVar2.zzQ);
                    if (zzddnVar != null) {
                        zzddnVar.zzf();
                    }
                    com.google.android.gms.ads.internal.zzt.zzi();
                    zzdme zzj = zzdudVar.zzj();
                    zzfdk zzfdkVar3 = this.zze;
                    int i = zzfdkVar3.zzR;
                    zzcgv zzcgvVar = this.zzd;
                    String str = zzfdkVar3.zzC;
                    zzfdp zzfdpVar2 = zzfdkVar3.zzt;
                    com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzj, (com.google.android.gms.ads.internal.overlay.zzz) null, zzcmpVar, i, zzcgvVar, str, zzjVar, zzfdpVar2.zzb, zzfdpVar2.zza, this.zzc.zzf, zzddnVar), true);
                }
                zzcmpVar2 = this.zzg;
            } else {
                zzcmpVar2 = this.zzg;
            }
            zzcmpVar = zzcmpVar2;
            zzcmpVar.zzap(true);
            if (!this.zzi) {
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            boolean zzE2 = com.google.android.gms.ads.internal.util.zzs.zzE(this.zza);
            boolean z22 = this.zzi;
            boolean zzd2 = z22 ? this.zzh.zzd() : false;
            float zza22 = !z22 ? this.zzh.zza() : 0.0f;
            zzfdk zzfdkVar22 = this.zze;
            com.google.android.gms.ads.internal.zzj zzjVar2 = new com.google.android.gms.ads.internal.zzj(zze, zzE2, zzd2, zza22, -1, z, zzfdkVar22.zzP, zzfdkVar22.zzQ);
            if (zzddnVar != null) {
            }
            com.google.android.gms.ads.internal.zzt.zzi();
            zzdme zzj2 = zzdudVar.zzj();
            zzfdk zzfdkVar32 = this.zze;
            int i2 = zzfdkVar32.zzR;
            zzcgv zzcgvVar2 = this.zzd;
            String str2 = zzfdkVar32.zzC;
            zzfdp zzfdpVar22 = zzfdkVar32.zzt;
            com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzj2, (com.google.android.gms.ads.internal.overlay.zzz) null, zzcmpVar, i2, zzcgvVar2, str2, zzjVar2, zzfdpVar22.zzb, zzfdpVar22.zza, this.zzc.zzf, zzddnVar), true);
        } catch (zzcna e) {
            zzcgp.zzh("", e);
        }
    }
}
