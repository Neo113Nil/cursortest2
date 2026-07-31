package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzcqf implements zzcxg, zzcwm {
    private final Context zza;
    private final zzcek zzb;
    private final zzfcj zzc;
    private final VersionInfoParcel zzd;
    private zzedu zze;
    private boolean zzf;
    private final zzeds zzg;

    public zzcqf(Context context, zzcek zzcekVar, zzfcj zzfcjVar, VersionInfoParcel versionInfoParcel, zzeds zzedsVar) {
        this.zza = context;
        this.zzb = zzcekVar;
        this.zzc = zzfcjVar;
        this.zzd = versionInfoParcel;
        this.zzg = zzedsVar;
    }

    private final synchronized void zza() {
        zzcek zzcekVar;
        zzedr zzedrVar;
        zzedq zzedqVar;
        zzfcj zzfcjVar = this.zzc;
        if (zzfcjVar.zzT && (zzcekVar = this.zzb) != null) {
            if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.zza)) {
                VersionInfoParcel versionInfoParcel = this.zzd;
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
                    int i3 = zzfcjVar.zze;
                    zzedq zzedqVar2 = zzedq.HTML_DISPLAY;
                    zzedrVar = i3 == 1 ? zzedr.ONE_PIXEL : zzedr.BEGIN_TO_RENDER;
                    zzedqVar = zzedqVar2;
                }
                zzedu zzc = com.google.android.gms.ads.internal.zzt.zzu().zzc(sb2, zzcekVar.zzD(), "", "javascript", zza, zzedrVar, zzedqVar, zzfcjVar.zzal);
                this.zze = zzc;
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
                    zzcekVar.zzak(this.zze);
                    com.google.android.gms.ads.internal.zzt.zzu().zze(zza2);
                    this.zzf = true;
                    zzcekVar.zze("onSdkLoaded", new ArrayMap());
                }
            }
        }
    }

    private final boolean zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfM)).booleanValue() && this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final synchronized void zzdw() {
        zzcek zzcekVar;
        if (zzb()) {
            this.zzg.zzd();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzT || this.zze == null || (zzcekVar = this.zzb) == null) {
            return;
        }
        zzcekVar.zze("onSdkImpression", new ArrayMap());
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final synchronized void zzg() {
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
