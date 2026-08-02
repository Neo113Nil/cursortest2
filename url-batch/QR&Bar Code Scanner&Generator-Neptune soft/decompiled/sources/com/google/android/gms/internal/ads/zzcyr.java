package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcyr implements zzdeo, zzddu {
    private final Context zza;
    private final zzcmp zzb;
    private final zzfdk zzc;
    private final zzcgv zzd;
    private IObjectWrapper zze;
    private boolean zzf;

    public zzcyr(Context context, zzcmp zzcmpVar, zzfdk zzfdkVar, zzcgv zzcgvVar) {
        this.zza = context;
        this.zzb = zzcmpVar;
        this.zzc = zzfdkVar;
        this.zzd = zzcgvVar;
    }

    private final synchronized void zza() {
        zzeha zzehaVar;
        zzehb zzehbVar;
        if (this.zzc.zzU) {
            if (this.zzb == null) {
                return;
            }
            if (com.google.android.gms.ads.internal.zzt.zzA().zze(this.zza)) {
                zzcgv zzcgvVar = this.zzd;
                String str = zzcgvVar.zzb + "." + zzcgvVar.zzc;
                String zza = this.zzc.zzW.zza();
                if (this.zzc.zzW.zzb() == 1) {
                    zzehaVar = zzeha.VIDEO;
                    zzehbVar = zzehb.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzehaVar = zzeha.HTML_DISPLAY;
                    zzehbVar = this.zzc.zzf == 1 ? zzehb.ONE_PIXEL : zzehb.BEGIN_TO_RENDER;
                }
                IObjectWrapper zza2 = com.google.android.gms.ads.internal.zzt.zzA().zza(str, this.zzb.zzI(), "", "javascript", zza, zzehbVar, zzehaVar, this.zzc.zzan);
                this.zze = zza2;
                Object obj = this.zzb;
                if (zza2 != null) {
                    com.google.android.gms.ads.internal.zzt.zzA().zzc(this.zze, (View) obj);
                    this.zzb.zzar(this.zze);
                    com.google.android.gms.ads.internal.zzt.zzA().zzd(this.zze);
                    this.zzf = true;
                    this.zzb.zzd("onSdkLoaded", new ArrayMap());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final synchronized void zzl() {
        zzcmp zzcmpVar;
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzU || this.zze == null || (zzcmpVar = this.zzb) == null) {
            return;
        }
        zzcmpVar.zzd("onSdkImpression", new ArrayMap());
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final synchronized void zzn() {
        if (this.zzf) {
            return;
        }
        zza();
    }
}
