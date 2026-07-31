package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdgq implements zzcxg, com.google.android.gms.ads.internal.overlay.zzq, zzcwm {
    zzedu zza;
    private final Context zzb;
    private final zzcek zzc;
    private final zzfcj zzd;
    private final VersionInfoParcel zze;
    private final zzeds zzf;

    public zzdgq(Context context, zzcek zzcekVar, zzfcj zzfcjVar, VersionInfoParcel versionInfoParcel, zzeds zzedsVar) {
        this.zzb = context;
        this.zzc = zzcekVar;
        this.zzd = zzfcjVar;
        this.zze = versionInfoParcel;
        this.zzf = zzedsVar;
    }

    private final boolean zzl() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfM)).booleanValue() && this.zzf.zzb();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdA() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdB() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdD() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdX() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdY(int i) {
        this.zza = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdu() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdv() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdw() {
        zzcek zzcekVar;
        if (zzl()) {
            this.zzf.zzd();
        } else {
            if (this.zza == null || (zzcekVar = this.zzc) == null) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfP)).booleanValue()) {
                zzcekVar.zze("onSdkImpression", new ArrayMap());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzg() {
        zzcek zzcekVar;
        zzedr zzedrVar;
        zzedq zzedqVar;
        zzfcj zzfcjVar = this.zzd;
        if (!zzfcjVar.zzT || (zzcekVar = this.zzc) == null) {
            return;
        }
        if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.zzb)) {
            if (zzl()) {
                this.zzf.zzc();
                return;
            }
            VersionInfoParcel versionInfoParcel = this.zze;
            int i = versionInfoParcel.buddyApkVersion;
            int i2 = versionInfoParcel.clientJarVersion;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            String sb2 = sb.toString();
            zzfdf zzfdfVar = zzfcjVar.zzV;
            String zza = zzfdfVar.zza();
            if (zzfdfVar.zzc() == 1) {
                zzedqVar = zzedq.VIDEO;
                zzedrVar = zzedr.DEFINED_BY_JAVASCRIPT;
            } else {
                zzedrVar = zzfcjVar.zzY == 2 ? zzedr.UNSPECIFIED : zzedr.BEGIN_TO_RENDER;
                zzedqVar = zzedq.HTML_DISPLAY;
            }
            zzedu zzc = com.google.android.gms.ads.internal.zzt.zzu().zzc(sb2, zzcekVar.zzD(), "", "javascript", zza, zzedrVar, zzedqVar, zzfcjVar.zzal);
            this.zza = zzc;
            if (zzc != null) {
                zzflj zza2 = zzc.zza();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfL)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(zza2, zzcekVar.zzD());
                    Iterator it = zzcekVar.zzF().iterator();
                    while (it.hasNext()) {
                        com.google.android.gms.ads.internal.zzt.zzu().zzg(zza2, (View) it.next());
                    }
                } else {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(zza2, zzcekVar.zzE());
                }
                zzcekVar.zzak(this.zza);
                com.google.android.gms.ads.internal.zzt.zzu().zze(zza2);
                zzcekVar.zze("onSdkLoaded", new ArrayMap());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzh() {
        zzcek zzcekVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfP)).booleanValue() || (zzcekVar = this.zzc) == null) {
            return;
        }
        if (this.zza != null || zzl()) {
            if (this.zza != null) {
                zzcekVar.zze("onSdkImpression", new ArrayMap());
            } else {
                this.zzf.zzd();
            }
        }
    }
}
