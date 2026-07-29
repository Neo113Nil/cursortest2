package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzdlg implements zzddg, com.google.android.gms.ads.internal.overlay.zzo {
    IObjectWrapper zza;
    private final Context zzb;
    private final zzcli zzc;
    private final zzfbg zzd;
    private final zzcfo zze;
    private final zzbdv zzf;

    public zzdlg(Context context, zzcli zzcliVar, zzfbg zzfbgVar, zzcfo zzcfoVar, zzbdv zzbdvVar) {
        this.zzb = context;
        this.zzc = zzcliVar;
        this.zzd = zzfbgVar;
        this.zze = zzcfoVar;
        this.zzf = zzbdvVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        zzcli zzcliVar;
        if (this.zza == null || (zzcliVar = this.zzc) == null) {
            return;
        }
        zzcliVar.zzd("onSdkImpression", new ArrayMap());
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

    @Override // com.google.android.gms.internal.ads.zzddg
    public final void zzn() {
        zzbxq zzbxqVar;
        zzbxp zzbxpVar;
        zzbdv zzbdvVar;
        if ((this.zzf == zzbdv.REWARD_BASED_VIDEO_AD || (zzbdvVar = this.zzf) == zzbdv.INTERSTITIAL || zzbdvVar == zzbdv.APP_OPEN) && this.zzd.zzU && this.zzc != null && com.google.android.gms.ads.internal.zzt.zzh().zze(this.zzb)) {
            zzcfo zzcfoVar = this.zze;
            String str = zzcfoVar.zzb + "." + zzcfoVar.zzc;
            String zza = this.zzd.zzW.zza();
            if (this.zzd.zzW.zzb() == 1) {
                zzbxpVar = zzbxp.VIDEO;
                zzbxqVar = zzbxq.DEFINED_BY_JAVASCRIPT;
            } else {
                zzbxqVar = this.zzd.zzZ == 2 ? zzbxq.UNSPECIFIED : zzbxq.BEGIN_TO_RENDER;
                zzbxpVar = zzbxp.HTML_DISPLAY;
            }
            IObjectWrapper zza2 = com.google.android.gms.ads.internal.zzt.zzh().zza(str, this.zzc.zzI(), "", "javascript", zza, zzbxqVar, zzbxpVar, this.zzd.zzan);
            this.zza = zza2;
            if (zza2 != null) {
                com.google.android.gms.ads.internal.zzt.zzh().zzc(this.zza, (View) this.zzc);
                this.zzc.zzar(this.zza);
                com.google.android.gms.ads.internal.zzt.zzh().zzd(this.zza);
                this.zzc.zzd("onSdkLoaded", new ArrayMap());
            }
        }
    }
}
