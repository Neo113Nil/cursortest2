package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.ironsource.X3;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzcet {
    public static String zza(String str, Context context, boolean z, Map map) {
        String zzk;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbg)).booleanValue() && !z) || !com.google.android.gms.ads.internal.zzt.zzD().zzb(context) || TextUtils.isEmpty(str) || (zzk = com.google.android.gms.ads.internal.zzt.zzD().zzk(context)) == null) {
            return str;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaZ);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaY)).booleanValue() && str.contains(str2)) {
            if (com.google.android.gms.ads.internal.zzt.zzc().zzh(str)) {
                com.google.android.gms.ads.internal.zzt.zzD().zzl(context, zzk, (Map) map.get("_ac"));
                return zzd(str, context).replace(str2, zzk);
            }
            if (!com.google.android.gms.ads.internal.zzt.zzc().zzi(str)) {
                return str;
            }
            com.google.android.gms.ads.internal.zzt.zzD().zzm(context, zzk, (Map) map.get("_ai"));
            return zzd(str, context).replace(str2, zzk);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaX)).booleanValue()) {
            return str;
        }
        if (com.google.android.gms.ads.internal.zzt.zzc().zzh(str)) {
            com.google.android.gms.ads.internal.zzt.zzD().zzl(context, zzk, (Map) map.get("_ac"));
            return zzc(zzd(str, context), "fbs_aeid", zzk).toString();
        }
        if (!com.google.android.gms.ads.internal.zzt.zzc().zzi(str)) {
            return str;
        }
        com.google.android.gms.ads.internal.zzt.zzD().zzm(context, zzk, (Map) map.get("_ai"));
        return zzc(zzd(str, context), "fbs_aeid", zzk).toString();
    }

    public static String zzb(Uri uri, Context context, Map map) {
        if (!com.google.android.gms.ads.internal.zzt.zzD().zzb(context)) {
            return uri.toString();
        }
        String zzk = com.google.android.gms.ads.internal.zzt.zzD().zzk(context);
        if (zzk == null) {
            return uri.toString();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaZ);
        String uri2 = uri.toString();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaY)).booleanValue() && uri2.contains(str)) {
            com.google.android.gms.ads.internal.zzt.zzD().zzl(context, zzk, (Map) map.get("_ac"));
            return zzd(uri2, context).replace(str, zzk);
        }
        if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return uri2;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaX)).booleanValue()) {
            return uri2;
        }
        String uri3 = zzc(zzd(uri2, context), "fbs_aeid", zzk).toString();
        com.google.android.gms.ads.internal.zzt.zzD().zzl(context, zzk, (Map) map.get("_ac"));
        return uri3;
    }

    @VisibleForTesting
    static Uri zzc(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + X3.j.c + str.substring(i));
    }

    private static String zzd(String str, Context context) {
        String zzi = com.google.android.gms.ads.internal.zzt.zzD().zzi(context);
        String zzj = com.google.android.gms.ads.internal.zzt.zzD().zzj(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(zzi)) {
            str = zzc(str, "gmp_app_id", zzi).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(zzj)) ? str : zzc(str, "fbs_aiid", zzj).toString();
    }
}
