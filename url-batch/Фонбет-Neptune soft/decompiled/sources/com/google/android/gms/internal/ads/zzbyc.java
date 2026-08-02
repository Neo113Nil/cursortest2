package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbyc {
    static Uri zza(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    public static String zzb(Uri uri, Context context, Map map) {
        if (!com.google.android.gms.ads.internal.zzu.zzn().zzp(context)) {
            return uri.toString();
        }
        String zza = com.google.android.gms.ads.internal.zzu.zzn().zza(context);
        if (zza == null) {
            return uri.toString();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzZ);
        String uri2 = uri.toString();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzY)).booleanValue() && uri2.contains(str)) {
            com.google.android.gms.ads.internal.zzu.zzn().zzj(context, zza, (Map) map.get("_ac"));
            return zzd(uri2, context).replace(str, zza);
        }
        if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return uri2;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzX)).booleanValue()) {
            return uri2;
        }
        String uri3 = zza(zzd(uri2, context), "fbs_aeid", zza).toString();
        com.google.android.gms.ads.internal.zzu.zzn().zzj(context, zza, (Map) map.get("_ac"));
        return uri3;
    }

    public static String zzc(String str, Context context, boolean z, Map map) {
        String zza;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzag)).booleanValue() && !z) || !com.google.android.gms.ads.internal.zzu.zzn().zzp(context) || TextUtils.isEmpty(str) || (zza = com.google.android.gms.ads.internal.zzu.zzn().zza(context)) == null) {
            return str;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzZ);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzY)).booleanValue() && str.contains(str2)) {
            if (com.google.android.gms.ads.internal.zzu.zzp().zzi(str)) {
                com.google.android.gms.ads.internal.zzu.zzn().zzj(context, zza, (Map) map.get("_ac"));
                return zzd(str, context).replace(str2, zza);
            }
            if (!com.google.android.gms.ads.internal.zzu.zzp().zzj(str)) {
                return str;
            }
            com.google.android.gms.ads.internal.zzu.zzn().zzk(context, zza, (Map) map.get("_ai"));
            return zzd(str, context).replace(str2, zza);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzX)).booleanValue()) {
            return str;
        }
        if (com.google.android.gms.ads.internal.zzu.zzp().zzi(str)) {
            com.google.android.gms.ads.internal.zzu.zzn().zzj(context, zza, (Map) map.get("_ac"));
            return zza(zzd(str, context), "fbs_aeid", zza).toString();
        }
        if (!com.google.android.gms.ads.internal.zzu.zzp().zzj(str)) {
            return str;
        }
        com.google.android.gms.ads.internal.zzu.zzn().zzk(context, zza, (Map) map.get("_ai"));
        return zza(zzd(str, context), "fbs_aeid", zza).toString();
    }

    private static String zzd(String str, Context context) {
        String zzd = com.google.android.gms.ads.internal.zzu.zzn().zzd(context);
        String zzb = com.google.android.gms.ads.internal.zzu.zzn().zzb(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(zzd)) {
            str = zza(str, "gmp_app_id", zzd).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(zzb)) ? str : zza(str, "fbs_aiid", zzb).toString();
    }
}
