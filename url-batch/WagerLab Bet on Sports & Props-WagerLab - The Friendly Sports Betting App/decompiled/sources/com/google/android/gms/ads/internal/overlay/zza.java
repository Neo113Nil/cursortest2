package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzdsm;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes4.dex */
public final class zza {
    public static final boolean zza(Context context, Intent intent, zzac zzacVar, zzz zzzVar, boolean z, zzdsm zzdsmVar, String str) {
        if (z) {
            return zzc(context, intent.getData(), zzacVar, zzzVar);
        }
        try {
            String uri = intent.toURI();
            StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 21);
            sb.append("Launching an intent: ");
            sb.append(uri);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            if (((Boolean) zzbd.zzc().zzd(zzbci.zznU)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzac(context, intent, zzdsmVar, str);
            } else {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzY(context, intent);
            }
            if (zzacVar != null) {
                zzacVar.zzl();
            }
            if (zzzVar != null) {
                zzzVar.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            String message = e.getMessage();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            if (zzzVar != null) {
                zzzVar.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(Context context, zzc zzcVar, zzac zzacVar, zzz zzzVar, zzdsm zzdsmVar, String str) {
        int i = 0;
        if (zzcVar == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("No intent data for launcher overlay.");
            return false;
        }
        zzbci.zza(context);
        Intent intent = zzcVar.zzh;
        if (intent != null) {
            return zza(context, intent, zzacVar, zzzVar, zzcVar.zzj, zzdsmVar, str);
        }
        Intent intent2 = new Intent();
        String str2 = zzcVar.zzb;
        if (TextUtils.isEmpty(str2)) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Open GMSG did not contain a URL.");
            return false;
        }
        String str3 = zzcVar.zzc;
        if (TextUtils.isEmpty(str3)) {
            intent2.setData(Uri.parse(str2));
        } else {
            intent2.setDataAndType(Uri.parse(str2), str3);
        }
        intent2.setAction("android.intent.action.VIEW");
        String str4 = zzcVar.zzd;
        if (!TextUtils.isEmpty(str4)) {
            intent2.setPackage(str4);
        }
        String str5 = zzcVar.zze;
        if (!TextUtils.isEmpty(str5)) {
            String[] split = str5.split("/", 2);
            if (split.length < 2) {
                String.valueOf(str5);
                String valueOf = String.valueOf(str5);
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse component name from open GMSG: ".concat(valueOf));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str6 = zzcVar.zzf;
        if (!TextUtils.isEmpty(str6)) {
            try {
                i = Integer.parseInt(str6);
            } catch (NumberFormatException unused) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzfa)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzbd.zzc().zzd(zzbci.zzeZ)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzs(context, intent2);
            }
        }
        return zza(context, intent2, zzacVar, zzzVar, zzcVar.zzj, zzdsmVar, str);
    }

    private static final boolean zzc(Context context, Uri uri, zzac zzacVar, zzz zzzVar) {
        int i;
        try {
            i = com.google.android.gms.ads.internal.zzt.zzc().zzp(context, uri);
            if (zzacVar != null) {
                zzacVar.zzl();
            }
        } catch (ActivityNotFoundException e) {
            String message = e.getMessage();
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            i = 6;
        }
        if (zzzVar != null) {
            zzzVar.zzb(i);
        }
        return i == 5;
    }
}
