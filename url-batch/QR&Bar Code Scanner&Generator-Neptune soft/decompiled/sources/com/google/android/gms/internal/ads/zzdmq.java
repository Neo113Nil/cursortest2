package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdmq implements zzdeo, com.google.android.gms.ads.internal.overlay.zzo, zzddu {
    IObjectWrapper zza;
    private final Context zzb;
    private final zzcmp zzc;
    private final zzfdk zzd;
    private final zzcgv zze;
    private final zzbez zzf;

    public zzdmq(Context context, zzcmp zzcmpVar, zzfdk zzfdkVar, zzcgv zzcgvVar, zzbez zzbezVar) {
        this.zzb = context;
        this.zzc = zzcmpVar;
        this.zzd = zzfdkVar;
        this.zze = zzcgvVar;
        this.zzf = zzbezVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        if (this.zza == null || this.zzc == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzel)).booleanValue()) {
            return;
        }
        this.zzc.zzd("onSdkImpression", new ArrayMap());
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zzl() {
        if (this.zza == null || this.zzc == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzel)).booleanValue()) {
            this.zzc.zzd("onSdkImpression", new ArrayMap());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzn() {
        zzehb zzehbVar;
        zzeha zzehaVar;
        zzbez zzbezVar;
        if ((this.zzf == zzbez.REWARD_BASED_VIDEO_AD || (zzbezVar = this.zzf) == zzbez.INTERSTITIAL || zzbezVar == zzbez.APP_OPEN) && this.zzd.zzU && this.zzc != null && com.google.android.gms.ads.internal.zzt.zzA().zze(this.zzb)) {
            zzcgv zzcgvVar = this.zze;
            String str = zzcgvVar.zzb + "." + zzcgvVar.zzc;
            String zza = this.zzd.zzW.zza();
            if (this.zzd.zzW.zzb() == 1) {
                zzehaVar = zzeha.VIDEO;
                zzehbVar = zzehb.DEFINED_BY_JAVASCRIPT;
            } else {
                zzehbVar = this.zzd.zzZ == 2 ? zzehb.UNSPECIFIED : zzehb.BEGIN_TO_RENDER;
                zzehaVar = zzeha.HTML_DISPLAY;
            }
            IObjectWrapper zza2 = com.google.android.gms.ads.internal.zzt.zzA().zza(str, this.zzc.zzI(), "", "javascript", zza, zzehbVar, zzehaVar, this.zzd.zzan);
            this.zza = zza2;
            if (zza2 != null) {
                com.google.android.gms.ads.internal.zzt.zzA().zzc(this.zza, (View) this.zzc);
                this.zzc.zzar(this.zza);
                com.google.android.gms.ads.internal.zzt.zzA().zzd(this.zza);
                this.zzc.zzd("onSdkLoaded", new ArrayMap());
            }
        }
    }
}
