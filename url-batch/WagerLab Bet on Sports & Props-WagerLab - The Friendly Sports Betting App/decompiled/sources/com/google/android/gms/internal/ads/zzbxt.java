package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.amazon.a.a.o.b.f;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbxt {
    public static String zza(String str, Context context, boolean z, Map map) {
        String zzj;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaG)).booleanValue() && !z) || !com.google.android.gms.ads.internal.zzt.zzD().zza(context) || TextUtils.isEmpty(str) || (zzj = com.google.android.gms.ads.internal.zzt.zzD().zzj(context)) == null) {
            return str;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaz);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzay)).booleanValue() && str.contains(str2)) {
            if (com.google.android.gms.ads.internal.zzt.zzc().zzi(str)) {
                com.google.android.gms.ads.internal.zzt.zzD().zzk(context, zzj, (Map) map.get("_ac"));
                return zzd(str, context).replace(str2, zzj);
            }
            if (!com.google.android.gms.ads.internal.zzt.zzc().zzj(str)) {
                return str;
            }
            com.google.android.gms.ads.internal.zzt.zzD().zzl(context, zzj, (Map) map.get("_ai"));
            return zzd(str, context).replace(str2, zzj);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzax)).booleanValue()) {
            return str;
        }
        if (com.google.android.gms.ads.internal.zzt.zzc().zzi(str)) {
            com.google.android.gms.ads.internal.zzt.zzD().zzk(context, zzj, (Map) map.get("_ac"));
            return zzc(zzd(str, context), "fbs_aeid", zzj).toString();
        }
        if (!com.google.android.gms.ads.internal.zzt.zzc().zzj(str)) {
            return str;
        }
        com.google.android.gms.ads.internal.zzt.zzD().zzl(context, zzj, (Map) map.get("_ai"));
        return zzc(zzd(str, context), "fbs_aeid", zzj).toString();
    }

    public static String zzb(Uri uri, Context context, Map map) {
        if (!com.google.android.gms.ads.internal.zzt.zzD().zza(context)) {
            return uri.toString();
        }
        String zzj = com.google.android.gms.ads.internal.zzt.zzD().zzj(context);
        if (zzj == null) {
            return uri.toString();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaz);
        String uri2 = uri.toString();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzay)).booleanValue() && uri2.contains(str)) {
            com.google.android.gms.ads.internal.zzt.zzD().zzk(context, zzj, (Map) map.get("_ac"));
            return zzd(uri2, context).replace(str, zzj);
        }
        if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzax)).booleanValue()) {
                String uri3 = zzc(zzd(uri2, context), "fbs_aeid", zzj).toString();
                com.google.android.gms.ads.internal.zzt.zzD().zzk(context, zzj, (Map) map.get("_ac"));
                return uri3;
            }
        }
        return uri2;
    }

    static Uri zzc(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + f.b + str3 + "&" + str.substring(i));
    }

    private static String zzd(String str, Context context) {
        String zzh = com.google.android.gms.ads.internal.zzt.zzD().zzh(context);
        String zzi = com.google.android.gms.ads.internal.zzt.zzD().zzi(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(zzh)) {
            str = zzc(str, "gmp_app_id", zzh).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(zzi)) ? str : zzc(str, "fbs_aiid", zzi).toString();
    }
}
