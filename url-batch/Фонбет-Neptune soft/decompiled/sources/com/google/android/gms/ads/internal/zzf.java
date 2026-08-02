package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbne;
import com.google.android.gms.internal.ads.zzbnl;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzdsj;
import com.google.android.gms.internal.ads.zzdsk;
import com.google.android.gms.internal.ads.zzfjt;
import com.google.android.gms.internal.ads.zzfju;
import com.google.android.gms.internal.ads.zzfki;
import com.google.android.gms.internal.ads.zzgbq;
import com.google.android.gms.internal.ads.zzgcj;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzf {
    private Context zza;
    private long zzb = 0;

    static final /* synthetic */ ListenableFuture zzd(Long l, zzdsk zzdskVar, zzfki zzfkiVar, zzfju zzfjuVar, JSONObject jSONObject) throws Exception {
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            zzu.zzo().zzi().zzv(jSONObject.getString("appSettingsJson"));
            if (l != null) {
                zzf(zzdskVar, "cld_s", zzu.zzB().elapsedRealtime() - l.longValue());
            }
        }
        zzfjuVar.zzg(optBoolean);
        zzfkiVar.zzb(zzfjuVar.zzm());
        return zzgcj.zzh(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzf(zzdsk zzdskVar, String str, long j) {
        if (zzdskVar != null) {
            if (((Boolean) zzba.zzc().zza(zzbbw.zzlI)).booleanValue()) {
                zzdsj zza = zzdskVar.zza();
                zza.zzb("action", "lat_init");
                zza.zzb(str, Long.toString(j));
                zza.zzf();
            }
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, Runnable runnable, zzfki zzfkiVar, zzdsk zzdskVar, Long l) {
        zzb(context, versionInfoParcel, true, null, str, null, runnable, zzfkiVar, zzdskVar, l);
    }

    final void zzb(Context context, VersionInfoParcel versionInfoParcel, boolean z, zzbyy zzbyyVar, String str, String str2, Runnable runnable, final zzfki zzfkiVar, final zzdsk zzdskVar, final Long l) {
        PackageInfo packageInfo;
        if (zzu.zzB().elapsedRealtime() - this.zzb < 5000) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzu.zzB().elapsedRealtime();
        if (zzbyyVar != null && !TextUtils.isEmpty(zzbyyVar.zzc())) {
            if (zzu.zzB().currentTimeMillis() - zzbyyVar.zza() <= ((Long) zzba.zzc().zza(zzbbw.zzdJ)).longValue() && zzbyyVar.zzi()) {
                return;
            }
        }
        if (context == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        final zzfju zza = zzfjt.zza(context, 4);
        zza.zzi();
        zzbne zza2 = zzu.zzf().zza(this.zza, versionInfoParcel, zzfkiVar).zza("google.afma.config.fetchAppSettings", zzbnl.zza, zzbnl.zza);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z);
            jSONObject.put("pn", context.getPackageName());
            zzbbn zzbbnVar = zzbbw.zza;
            jSONObject.put("experiment_ids", TextUtils.join(",", zzba.zza().zza()));
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            try {
                ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", packageInfo.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            ListenableFuture zzb = zza2.zzb(jSONObject);
            ListenableFuture zzn = zzgcj.zzn(zzb, new zzgbq(this) { // from class: com.google.android.gms.ads.internal.zzd
                @Override // com.google.android.gms.internal.ads.zzgbq
                public final ListenableFuture zza(Object obj) {
                    return zzf.zzd(l, zzdskVar, zzfkiVar, zza, (JSONObject) obj);
                }
            }, zzbzo.zzf);
            if (runnable != null) {
                zzb.addListener(runnable, zzbzo.zzf);
            }
            if (l != null) {
                zzb.addListener(new Runnable(this) { // from class: com.google.android.gms.ads.internal.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzf.zzf(zzdskVar, "cld_r", zzu.zzB().elapsedRealtime() - l.longValue());
                    }
                }, zzbzo.zzf);
            }
            if (((Boolean) zzba.zzc().zza(zzbbw.zzgT)).booleanValue()) {
                zzbzr.zzb(zzn, "ConfigLoader.maybeFetchNewAppSettings");
            } else {
                zzbzr.zza(zzn, "ConfigLoader.maybeFetchNewAppSettings");
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error requesting application settings", e);
            zza.zzh(e);
            zza.zzg(false);
            zzfkiVar.zzb(zza.zzm());
        }
    }

    public final void zzc(Context context, VersionInfoParcel versionInfoParcel, String str, zzbyy zzbyyVar, zzfki zzfkiVar) {
        zzb(context, versionInfoParcel, false, zzbyyVar, zzbyyVar != null ? zzbyyVar.zzb() : null, str, null, zzfkiVar, null, null);
    }
}
