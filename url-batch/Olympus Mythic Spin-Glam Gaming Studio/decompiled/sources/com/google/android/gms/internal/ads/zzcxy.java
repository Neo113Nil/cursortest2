package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzcxy implements zzdfd, zzdej {
    private final Context zza;

    @Nullable
    private final zzclm zzb;
    private final zzfld zzc;
    private final VersionInfoParcel zzd;

    @Nullable
    private zzeml zze;
    private boolean zzf;
    private final zzemj zzg;

    public zzcxy(Context context, @Nullable zzclm zzclmVar, zzfld zzfldVar, VersionInfoParcel versionInfoParcel, zzemj zzemjVar) {
        this.zza = context;
        this.zzb = zzclmVar;
        this.zzc = zzfldVar;
        this.zzd = versionInfoParcel;
        this.zzg = zzemjVar;
    }

    private final synchronized void zza() {
        zzclm zzclmVar;
        zzemi zzemiVar;
        zzemh zzemhVar;
        try {
            zzfld zzfldVar = this.zzc;
            if (zzfldVar.zzT && (zzclmVar = this.zzb) != null) {
                if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.zza)) {
                    VersionInfoParcel versionInfoParcel = this.zzd;
                    int i = versionInfoParcel.buddyApkVersion;
                    int i2 = versionInfoParcel.clientJarVersion;
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
                    sb.append(i);
                    sb.append(".");
                    sb.append(i2);
                    String sb2 = sb.toString();
                    zzflz zzflzVar = zzfldVar.zzV;
                    String zza = zzflzVar.zza();
                    if (zzflzVar.zzc() == 1) {
                        zzemhVar = zzemh.VIDEO;
                        zzemiVar = zzemi.DEFINED_BY_JAVASCRIPT;
                    } else {
                        int i3 = zzfldVar.zze;
                        zzemh zzemhVar2 = zzemh.HTML_DISPLAY;
                        zzemiVar = i3 == 1 ? zzemi.ONE_PIXEL : zzemi.BEGIN_TO_RENDER;
                        zzemhVar = zzemhVar2;
                    }
                    zzeml zzc = com.google.android.gms.ads.internal.zzt.zzu().zzc(sb2, zzclmVar.zzD(), "", "javascript", zza, zzemiVar, zzemhVar, zzfldVar.zzal);
                    this.zze = zzc;
                    if (zzc != null) {
                        zzfvm zza2 = zzc.zza();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgs)).booleanValue()) {
                            com.google.android.gms.ads.internal.zzt.zzu().zzh(zza2, zzclmVar.zzD());
                            Iterator it = zzclmVar.zzF().iterator();
                            while (it.hasNext()) {
                                com.google.android.gms.ads.internal.zzt.zzu().zzg(zza2, (View) it.next());
                            }
                        } else {
                            com.google.android.gms.ads.internal.zzt.zzu().zzh(zza2, zzclmVar.zzE());
                        }
                        zzclmVar.zzak(this.zze);
                        com.google.android.gms.ads.internal.zzt.zzu().zze(zza2);
                        this.zzf = true;
                        zzclmVar.zze("onSdkLoaded", new ArrayMap());
                    }
                }
            }
        } finally {
        }
    }

    private final boolean zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgt)).booleanValue() && this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final synchronized void zzdr() {
        zzclm zzclmVar;
        if (zzb()) {
            this.zzg.zzd();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzT || this.zze == null || (zzclmVar = this.zzb) == null) {
            return;
        }
        zzclmVar.zze("onSdkImpression", new ArrayMap());
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
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
