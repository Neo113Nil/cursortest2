package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbbz {
    private final String zza = (String) zzbdm.zza.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbbz(Context context, String str) {
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzu.zzp();
        linkedHashMap.put("device", com.google.android.gms.ads.internal.util.zzt.zzr());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        com.google.android.gms.ads.internal.zzu.zzp();
        linkedHashMap.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzt.zzE(context) ? "0" : "1");
        Future zzb = com.google.android.gms.ads.internal.zzu.zzm().zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbvf) zzb.get()).zzj));
            linkedHashMap.put("network_fine", Integer.toString(((zzbvf) zzb.get()).zzk));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzku)).booleanValue()) {
            Map map = this.zzb;
            com.google.android.gms.ads.internal.zzu.zzp();
            map.put("is_bstar", true == com.google.android.gms.ads.internal.util.zzt.zzB(context) ? "1" : "0");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziA)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbZ)).booleanValue() || zzfvj.zzd(com.google.android.gms.ads.internal.zzu.zzo().zzn())) {
                return;
            }
            this.zzb.put("plugin", com.google.android.gms.ads.internal.zzu.zzo().zzn());
        }
    }

    final Context zza() {
        return this.zzc;
    }

    final String zzb() {
        return this.zzd;
    }

    final String zzc() {
        return this.zza;
    }

    final Map zzd() {
        return this.zzb;
    }
}
