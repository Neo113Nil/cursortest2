package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.a.a.o.b.f;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbbz;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzghs;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes4.dex */
public class CsiParamDefaults {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public CsiParamDefaults(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = versionInfoParcel.afmaVersion;
    }

    public void set(Map<String, String> map) {
        map.put(CmcdData.STREAMING_FORMAT_SS, "gmob_sdk");
        map.put("v", ExifInterface.GPS_MEASUREMENT_3D);
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzt.zzc();
        map.put(DeviceRequestsHelper.DEVICE_INFO_DEVICE, zzs.zzv());
        map.put("app", this.zzb);
        zzt.zzc();
        Context context = this.zza;
        boolean zzI = zzs.zzI(context);
        String str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        map.put("is_lite_sdk", true != zzI ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1");
        zzbbz zzbbzVar = zzbci.zza;
        List zzf = zzbd.zzb().zzf();
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzhm)).booleanValue()) {
            zzf.addAll(zzt.zzh().zzo().zzi().zzh());
        }
        map.put("e", TextUtils.join(f.f598a, zzf));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzmf)).booleanValue()) {
            zzt.zzc();
            if (true == zzs.zzF(context)) {
                str = "1";
            }
            map.put("is_bstar", str);
        }
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzkj)).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzd(zzbci.zzcE)).booleanValue()) {
                map.put("plugin", zzghs.zza(zzt.zzh().zzu()));
            }
        }
    }
}
