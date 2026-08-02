package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbuh;
import com.google.android.gms.internal.ads.zzcfs;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzchc;
import com.google.android.gms.internal.ads.zzchf;
import com.google.android.gms.internal.ads.zzfji;
import com.google.android.gms.internal.ads.zzfjj;
import com.google.android.gms.internal.ads.zzfjw;
import com.google.android.gms.internal.ads.zzfyn;
import com.google.android.gms.internal.ads.zzfzg;
import com.google.android.gms.internal.ads.zzfzp;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zze {
    private Context zza;
    private long zzb = 0;

    public final void zza(Context context, zzcgv zzcgvVar, String str, Runnable runnable, zzfjw zzfjwVar) {
        zzb(context, zzcgvVar, true, null, str, null, runnable, zzfjwVar);
    }

    final void zzb(Context context, zzcgv zzcgvVar, boolean z, zzcfs zzcfsVar, String str, String str2, Runnable runnable, final zzfjw zzfjwVar) {
        PackageInfo packageInfo;
        if (zzt.zzB().elapsedRealtime() - this.zzb < 5000) {
            com.google.android.gms.ads.internal.util.zze.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzB().elapsedRealtime();
        if (zzcfsVar != null) {
            if (zzt.zzB().currentTimeMillis() - zzcfsVar.zza() <= ((Long) zzay.zzc().zzb(zzbjc.zzdi)).longValue() && zzcfsVar.zzi()) {
                return;
            }
        }
        if (context == null) {
            com.google.android.gms.ads.internal.util.zze.zzj("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            com.google.android.gms.ads.internal.util.zze.zzj("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        final zzfjj zza = zzfji.zza(context, 4);
        zza.zzf();
        zzbua zza2 = zzt.zzf().zza(this.zza, zzcgvVar, zzfjwVar).zza("google.afma.config.fetchAppSettings", zzbuh.zza, zzbuh.zza);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z);
            jSONObject.put("pn", context.getPackageName());
            jSONObject.put("experiment_ids", TextUtils.join(",", zzbjc.zza()));
            try {
                ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", packageInfo.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            zzfzp zzb = zza2.zzb(jSONObject);
            zzfzp zzn = zzfzg.zzn(zzb, new zzfyn() { // from class: com.google.android.gms.ads.internal.zzd
                @Override // com.google.android.gms.internal.ads.zzfyn
                public final zzfzp zza(Object obj) {
                    zzfjw zzfjwVar2 = zzfjw.this;
                    zzfjj zzfjjVar = zza;
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean optBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (optBoolean) {
                        zzt.zzo().zzh().zzu(jSONObject2.getString("appSettingsJson"));
                    }
                    zzfjjVar.zze(optBoolean);
                    zzfjwVar2.zzb(zzfjjVar.zzj());
                    return zzfzg.zzi(null);
                }
            }, zzchc.zzf);
            if (runnable != null) {
                zzb.zzc(runnable, zzchc.zzf);
            }
            zzchf.zza(zzn, "ConfigLoader.maybeFetchNewAppSettings");
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzh("Error requesting application settings", e);
            zza.zze(false);
            zzfjwVar.zzb(zza.zzj());
        }
    }

    public final void zzc(Context context, zzcgv zzcgvVar, String str, zzcfs zzcfsVar, zzfjw zzfjwVar) {
        zzb(context, zzcgvVar, false, zzcfsVar, zzcfsVar != null ? zzcfsVar.zzb() : null, str, null, zzfjwVar);
    }
}
