package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzeva implements zzeup {
    private final zzgpd zza;
    private final Context zzb;
    private final zzdwx zzc;

    zzeva(zzgpd zzgpdVar, Context context, zzdwx zzdwxVar) {
        this.zza = zzgpdVar;
        this.zzb = context;
        this.zzc = zzdwxVar;
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzeva.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 38;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzeuy zzc() {
        ActivityInfo activityInfo;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z2;
        PackageInfo packageInfo;
        Context context = this.zzb;
        PackageManager packageManager = context.getPackageManager();
        Locale locale = Locale.getDefault();
        ResolveInfo zzd = zzd(packageManager, "geo:0,0?q=donuts");
        ResolveInfo zzd2 = zzd(packageManager, "http://www.google.com");
        String country = locale.getCountry();
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        boolean zzw = com.google.android.gms.ads.internal.util.client.zzf.zzw();
        boolean isLatchsky = DeviceProperties.isLatchsky(context);
        boolean isSidewinder = DeviceProperties.isSidewinder(context);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        LocaleList localeList = LocaleList.getDefault();
        for (int i = 0; i < localeList.size(); i++) {
            arrayList.add(localeList.get(i).getLanguage());
        }
        ResolveInfo zzd3 = zzd(packageManager, "market://details?id=com.google.android.gms.ads");
        String str7 = null;
        if (zzd3 == null || (activityInfo = zzd3.activityInfo) == null) {
            str = null;
            z = true;
        } else {
            try {
                z = true;
                try {
                    PackageInfo packageInfo2 = Wrappers.packageManager(context).getPackageInfo(activityInfo.packageName, 0);
                    if (packageInfo2 != null) {
                        int i2 = packageInfo2.versionCode;
                        String str8 = activityInfo.packageName;
                        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 1 + String.valueOf(str8).length());
                        sb.append(i2);
                        sb.append(".");
                        sb.append(str8);
                        str = sb.toString();
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                z = true;
            }
            str = null;
        }
        try {
            packageInfo = Wrappers.packageManager(this.zzb).getPackageInfo("com.android.vending", 128);
        } catch (Exception unused3) {
        }
        if (packageInfo != null) {
            int i3 = packageInfo.versionCode;
            String str9 = packageInfo.packageName;
            str2 = str;
            try {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 1 + String.valueOf(str9).length());
                sb2.append(i3);
                sb2.append(".");
                sb2.append(str9);
                str3 = sb2.toString();
            } catch (Exception unused4) {
            }
            boolean z3 = false;
            String str10 = Build.FINGERPRINT;
            String language2 = Locale.getDefault().getLanguage();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoh)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzog)).booleanValue()) {
                    language2 = com.google.android.gms.ads.internal.util.zzs.zzm(this.zzb).zzb();
                }
                str4 = language2;
                str5 = null;
            } else {
                com.google.android.gms.ads.internal.util.zzq zzm = com.google.android.gms.ads.internal.util.zzs.zzm(this.zzb);
                String zzb = zzm.zzb();
                str5 = zzm.zza();
                str4 = zzb;
            }
            Context context2 = this.zzb;
            if (packageManager != null) {
                str6 = str3;
            } else {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                if (queryIntentActivities != null && resolveActivity != null) {
                    int i4 = 0;
                    while (i4 < queryIntentActivities.size()) {
                        str6 = str3;
                        if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i4).activityInfo.name)) {
                            z3 = resolveActivity.activityInfo.packageName.equals(zzhqn.zza(context2));
                            break;
                        }
                        i4++;
                        str3 = str6;
                    }
                }
                str6 = str3;
                z3 = false;
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmg)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzF(context2)) {
                    z2 = z;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmk)).booleanValue()) {
                        try {
                            Bundle bundle = Wrappers.packageManager(context2).getApplicationInfo(context2.getPackageName(), 128).metaData;
                            if (bundle != null && bundle.containsKey("com.google.unity.ads.UNITY_VERSION")) {
                                str7 = bundle.getString("com.google.unity.ads.UNITY_VERSION");
                            }
                        } catch (PackageManager.NameNotFoundException unused5) {
                        }
                    } else {
                        str7 = "";
                    }
                    return new zzeuy(zzd != null ? z : false, zzd2 != null ? z : false, country, zzw, isLatchsky, isSidewinder, language, arrayList, str2, str6, str10, z3, Build.MODEL, availableBytes, z2, str7, Build.VERSION.SDK_INT, str4, str5, this.zzc.zza());
                }
            }
            z2 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmk)).booleanValue()) {
            }
            if (zzd2 != null) {
            }
            return new zzeuy(zzd != null ? z : false, zzd2 != null ? z : false, country, zzw, isLatchsky, isSidewinder, language, arrayList, str2, str6, str10, z3, Build.MODEL, availableBytes, z2, str7, Build.VERSION.SDK_INT, str4, str5, this.zzc.zza());
        }
        str2 = str;
        str3 = null;
        boolean z32 = false;
        String str102 = Build.FINGERPRINT;
        String language22 = Locale.getDefault().getLanguage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoh)).booleanValue()) {
        }
        Context context22 = this.zzb;
        if (packageManager != null) {
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmg)).booleanValue()) {
        }
        z2 = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmk)).booleanValue()) {
        }
        if (zzd2 != null) {
        }
        return new zzeuy(zzd != null ? z : false, zzd2 != null ? z : false, country, zzw, isLatchsky, isSidewinder, language, arrayList, str2, str6, str102, z32, Build.MODEL, availableBytes2, z2, str7, Build.VERSION.SDK_INT, str4, str5, this.zzc.zza());
    }
}
