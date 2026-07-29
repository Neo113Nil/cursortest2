package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzcel;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfuh;
import com.google.android.gms.internal.ads.zzfva;
import com.google.android.gms.internal.ads.zzfvj;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zze {
    private Context zza;
    private long zzb = 0;

    public final void zza(Context context, zzcfo zzcfoVar, String str, Runnable runnable, zzfhs zzfhsVar) {
        zzb(context, zzcfoVar, true, null, str, null, runnable, zzfhsVar);
    }

    final void zzb(Context context, zzcfo zzcfoVar, boolean z, zzcel zzcelVar, String str, String str2, Runnable runnable, final zzfhs zzfhsVar) {
        PackageInfo packageInfo;
        if (zzt.zzA().elapsedRealtime() - this.zzb < 5000) {
            com.google.android.gms.ads.internal.util.zze.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzA().elapsedRealtime();
        if (zzcelVar != null) {
            if (zzt.zzA().currentTimeMillis() - zzcelVar.zza() <= ((Long) zzay.zzc().zzb(zzbhy.zzdd)).longValue() && zzcelVar.zzi()) {
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
        final zzfhg zza = zzfhf.zza(context, 4);
        zza.zzf();
        zzbsp zza2 = zzt.zzf().zza(this.zza, zzcfoVar, zzfhsVar).zza("google.afma.config.fetchAppSettings", zzbsw.zza, zzbsw.zza);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z);
            jSONObject.put("pn", context.getPackageName());
            jSONObject.put("experiment_ids", TextUtils.join(",", zzbhy.zza()));
            try {
                ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", packageInfo.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            zzfvj zzb = zza2.zzb(jSONObject);
            zzfvj zzn = zzfva.zzn(zzb, new zzfuh() { // from class: com.google.android.gms.ads.internal.zzd
                @Override // com.google.android.gms.internal.ads.zzfuh
                public final zzfvj zza(Object obj) {
                    zzfhs zzfhsVar2 = zzfhs.this;
                    zzfhg zzfhgVar = zza;
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean optBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (optBoolean) {
                        zzt.zzo().zzh().zzu(jSONObject2.getString("appSettingsJson"));
                    }
                    zzfhgVar.zze(optBoolean);
                    zzfhsVar2.zzb(zzfhgVar.zzj());
                    return zzfva.zzi(null);
                }
            }, zzcfv.zzf);
            if (runnable != null) {
                zzb.zzc(runnable, zzcfv.zzf);
            }
            zzcfy.zza(zzn, "ConfigLoader.maybeFetchNewAppSettings");
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzh("Error requesting application settings", e);
            zza.zze(false);
            zzfhsVar.zzb(zza.zzj());
        }
    }

    public final void zzc(Context context, zzcfo zzcfoVar, String str, zzcel zzcelVar, zzfhs zzfhsVar) {
        zzb(context, zzcfoVar, false, zzcelVar, zzcelVar != null ? zzcelVar.zzb() : null, str, null, zzfhsVar);
    }
}
