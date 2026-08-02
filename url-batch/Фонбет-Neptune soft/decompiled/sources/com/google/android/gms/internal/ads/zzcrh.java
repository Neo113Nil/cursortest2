package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcrh implements zzcye, zzcxk {
    private final Context zza;
    private final zzcej zzb;
    private final zzfel zzc;
    private final VersionInfoParcel zzd;
    private zzeeo zze;
    private boolean zzf;
    private final zzeem zzg;

    public zzcrh(Context context, zzcej zzcejVar, zzfel zzfelVar, VersionInfoParcel versionInfoParcel, zzeem zzeemVar) {
        this.zza = context;
        this.zzb = zzcejVar;
        this.zzc = zzfelVar;
        this.zzd = versionInfoParcel;
        this.zzg = zzeemVar;
    }

    private final synchronized void zza() {
        zzeel zzeelVar;
        zzeek zzeekVar;
        if (this.zzc.zzT && this.zzb != null) {
            if (com.google.android.gms.ads.internal.zzu.zzA().zzl(this.zza)) {
                VersionInfoParcel versionInfoParcel = this.zzd;
                String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                zzffj zzffjVar = this.zzc.zzV;
                String zza = zzffjVar.zza();
                if (zzffjVar.zzc() == 1) {
                    zzeekVar = zzeek.VIDEO;
                    zzeelVar = zzeel.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzfel zzfelVar = this.zzc;
                    zzeek zzeekVar2 = zzeek.HTML_DISPLAY;
                    zzeelVar = zzfelVar.zze == 1 ? zzeel.ONE_PIXEL : zzeel.BEGIN_TO_RENDER;
                    zzeekVar = zzeekVar2;
                }
                zzeeo zza2 = com.google.android.gms.ads.internal.zzu.zzA().zza(str, this.zzb.zzG(), "", "javascript", zza, zzeelVar, zzeekVar, this.zzc.zzal);
                this.zze = zza2;
                Object obj = this.zzb;
                if (zza2 != null) {
                    zzflq zza3 = zza2.zza();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeB)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzu.zzA().zzj(zza3, this.zzb.zzG());
                        Iterator it = this.zzb.zzV().iterator();
                        while (it.hasNext()) {
                            com.google.android.gms.ads.internal.zzu.zzA().zzg(zza3, (View) it.next());
                        }
                    } else {
                        com.google.android.gms.ads.internal.zzu.zzA().zzj(zza3, (View) obj);
                    }
                    this.zzb.zzat(this.zze);
                    com.google.android.gms.ads.internal.zzu.zzA().zzk(zza3);
                    this.zzf = true;
                    this.zzb.zzd("onSdkLoaded", new ArrayMap());
                }
            }
        }
    }

    private final boolean zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeC)).booleanValue() && this.zzg.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcxk
    public final synchronized void zzr() {
        zzcej zzcejVar;
        if (zzb()) {
            this.zzg.zzb();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzT || this.zze == null || (zzcejVar = this.zzb) == null) {
            return;
        }
        zzcejVar.zzd("onSdkImpression", new ArrayMap());
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final synchronized void zzs() {
        if (zzb()) {
            this.zzg.zzc();
        } else {
            if (this.zzf) {
                return;
            }
            zza();
        }
    }
}
