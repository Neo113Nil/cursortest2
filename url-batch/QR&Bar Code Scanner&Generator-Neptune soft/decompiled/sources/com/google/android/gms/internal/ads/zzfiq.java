package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfiq {
    private final HashMap zza;
    private final zzfiw zzb;

    private zzfiq() {
        HashMap hashMap = new HashMap();
        this.zza = hashMap;
        this.zzb = new zzfiw(com.google.android.gms.ads.internal.zzt.zzB());
        hashMap.put("new_csi", "1");
    }

    public static zzfiq zzb(String str) {
        zzfiq zzfiqVar = new zzfiq();
        zzfiqVar.zza.put("action", str);
        return zzfiqVar;
    }

    public static zzfiq zzc(String str) {
        zzfiq zzfiqVar = new zzfiq();
        zzfiqVar.zza.put("request_id", str);
        return zzfiqVar;
    }

    public final zzfiq zza(String str, String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzfiq zzd(String str) {
        this.zzb.zzb(str);
        return this;
    }

    public final zzfiq zze(String str, String str2) {
        this.zzb.zzc(str, str2);
        return this;
    }

    public final zzfiq zzf(zzfdk zzfdkVar) {
        this.zza.put("aai", zzfdkVar.zzx);
        return this;
    }

    public final zzfiq zzg(zzfdn zzfdnVar) {
        if (!TextUtils.isEmpty(zzfdnVar.zzb)) {
            this.zza.put("gqi", zzfdnVar.zzb);
        }
        return this;
    }

    public final zzfiq zzh(zzfdw zzfdwVar, zzcgc zzcgcVar) {
        zzfdv zzfdvVar = zzfdwVar.zzb;
        zzg(zzfdvVar.zzb);
        if (!zzfdvVar.zza.isEmpty()) {
            switch (((zzfdk) zzfdvVar.zza.get(0)).zzb) {
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
                    if (zzcgcVar != null) {
                        this.zza.put("as", true != zzcgcVar.zzj() ? "0" : "1");
                        break;
                    }
                    break;
                default:
                    this.zza.put("ad_format", EnvironmentCompat.MEDIA_UNKNOWN);
                    break;
            }
        }
        return this;
    }

    public final zzfiq zzi(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map zzj() {
        HashMap hashMap = new HashMap(this.zza);
        for (zzfiv zzfivVar : this.zzb.zza()) {
            hashMap.put(zzfivVar.zza, zzfivVar.zzb);
        }
        return hashMap;
    }
}
