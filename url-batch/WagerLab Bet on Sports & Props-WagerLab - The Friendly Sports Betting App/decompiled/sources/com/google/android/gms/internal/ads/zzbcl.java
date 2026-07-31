package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbcl {
    private final String zza = (String) zzbec.zza.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbcl(Context context, String str) {
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put(CmcdData.STREAMING_FORMAT_SS, "gmob_sdk");
        linkedHashMap.put("v", ExifInterface.GPS_MEASUREMENT_3D);
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzc();
        linkedHashMap.put(DeviceRequestsHelper.DEVICE_INFO_DEVICE, com.google.android.gms.ads.internal.util.zzs.zzv());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zzI = com.google.android.gms.ads.internal.util.zzs.zzI(context);
        String str2 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        linkedHashMap.put("is_lite_sdk", true != zzI ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1");
        Future zza = com.google.android.gms.ads.internal.zzt.zzp().zza(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbuz) zza.get()).zzj));
            linkedHashMap.put("network_fine", Integer.toString(((zzbuz) zza.get()).zzk));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmf)).booleanValue()) {
            Map map = this.zzb;
            com.google.android.gms.ads.internal.zzt.zzc();
            map.put("is_bstar", true == com.google.android.gms.ads.internal.util.zzs.zzF(context) ? "1" : str2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkj)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcE)).booleanValue() || zzghs.zzc(com.google.android.gms.ads.internal.zzt.zzh().zzu())) {
                return;
            }
            this.zzb.put("plugin", com.google.android.gms.ads.internal.zzt.zzh().zzu());
        }
    }

    final String zza() {
        return this.zza;
    }

    final Context zzb() {
        return this.zzc;
    }

    final String zzc() {
        return this.zzd;
    }

    final Map zzd() {
        return this.zzb;
    }
}
