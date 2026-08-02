package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzdxl {
    private final ConcurrentHashMap zza;
    private final zzcgc zzb;
    private final zzfef zzc;
    private final String zzd;
    private final String zze;

    public zzdxl(zzdxv zzdxvVar, zzcgc zzcgcVar, zzfef zzfefVar, String str, String str2) {
        ConcurrentHashMap zzc = zzdxvVar.zzc();
        this.zza = zzc;
        this.zzb = zzcgcVar;
        this.zzc = zzfefVar;
        this.zzd = str;
        this.zze = str2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgd)).booleanValue()) {
            int zzd = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzd(zzfefVar);
            int i = zzd - 1;
            if (i == 0) {
                zzc.put("scar", "false");
                return;
            }
            if (i == 1) {
                zzc.put("se", "query_g");
            } else if (i == 2) {
                zzc.put("se", "r_adinfo");
            } else if (i != 3) {
                zzc.put("se", "r_both");
            } else {
                zzc.put("se", "r_adstring");
            }
            zzc.put("scar", "true");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgE)).booleanValue()) {
                zzc.put("ad_format", str2);
            }
            if (zzd == 2) {
                zzc.put("rid", str);
            }
            zzd("ragent", zzfefVar.zzd.zzp);
            zzd("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(zzfefVar.zzd)));
        }
    }

    private final void zzd(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final Map zza() {
        return this.zza;
    }

    public final void zzb(zzfdw zzfdwVar) {
        if (zzfdwVar.zzb.zza.size() > 0) {
            switch (((zzfdk) zzfdwVar.zzb.zza.get(0)).zzb) {
                case 1:
                    this.zza.put("ad_format", "banner");
                    break;
                case 2:
                    this.zza.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.zza.put("ad_format", "native_express");
                    break;
                case 4:
                    this.zza.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.zza.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.zza.put("ad_format", "app_open_ad");
                    this.zza.put("as", true != this.zzb.zzj() ? "0" : "1");
                    break;
                default:
                    this.zza.put("ad_format", EnvironmentCompat.MEDIA_UNKNOWN);
                    break;
            }
        }
        zzd("gqi", zzfdwVar.zzb.zzb.zzb);
    }

    public final void zzc(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
