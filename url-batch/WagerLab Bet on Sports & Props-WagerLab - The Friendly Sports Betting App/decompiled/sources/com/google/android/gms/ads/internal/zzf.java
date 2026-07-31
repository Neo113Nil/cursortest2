package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.amazon.a.a.o.b.f;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbbz;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbnt;
import com.google.android.gms.internal.ads.zzbnx;
import com.google.android.gms.internal.ads.zzboa;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbyq;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzdsl;
import com.google.android.gms.internal.ads.zzdsm;
import com.google.android.gms.internal.ads.zzfhr;
import com.google.android.gms.internal.ads.zzfie;
import com.google.android.gms.internal.ads.zzgob;
import com.google.android.gms.internal.ads.zzgot;
import com.google.android.gms.internal.ads.zzgpd;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzf {
    private Context zza;
    private long zzb = 0;

    static final /* synthetic */ ListenableFuture zzd(Long l, zzdsm zzdsmVar, zzfhr zzfhrVar, zzfie zzfieVar, JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            zzt.zzh().zzo().zzh(jSONObject.getString("appSettingsJson"));
            if (l != null) {
                zzf(zzdsmVar, "cld_s", zzt.zzk().elapsedRealtime() - l.longValue());
            }
        }
        String optString = jSONObject.optString("errorReason", "");
        if (!TextUtils.isEmpty(optString)) {
            zzfhrVar.zzk(optString);
        }
        zzfhrVar.zzd(optBoolean);
        zzfieVar.zzb(zzfhrVar.zzm());
        return zzgot.zza(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzf(zzdsm zzdsmVar, String str, long j) {
        if (zzdsmVar != null) {
            if (((Boolean) zzbd.zzc().zzd(zzbci.zznw)).booleanValue()) {
                zzdsl zza = zzdsmVar.zza();
                zza.zzc("action", "lat_init");
                zza.zzc(str, Long.toString(j));
                zza.zzd();
            }
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, Runnable runnable, zzfie zzfieVar, zzdsm zzdsmVar, Long l, boolean z) {
        zzc(context, versionInfoParcel, true, null, str, null, runnable, zzfieVar, zzdsmVar, l, z);
    }

    public final void zzb(Context context, VersionInfoParcel versionInfoParcel, String str, zzbyq zzbyqVar, zzfie zzfieVar, boolean z) {
        zzc(context, versionInfoParcel, false, zzbyqVar, zzbyqVar != null ? zzbyqVar.zze() : null, str, null, zzfieVar, null, null, z);
    }

    final void zzc(Context context, VersionInfoParcel versionInfoParcel, boolean z, zzbyq zzbyqVar, String str, String str2, Runnable runnable, final zzfie zzfieVar, final zzdsm zzdsmVar, final Long l, boolean z2) {
        zzfhr zzfhrVar;
        Exception exc;
        ListenableFuture zzb;
        zzgob zzgobVar;
        PackageInfo packageInfo;
        if (zzt.zzk().elapsedRealtime() - this.zzb < 5000) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzk().elapsedRealtime();
        if (zzbyqVar != null && !TextUtils.isEmpty(zzbyqVar.zzd())) {
            if (zzt.zzk().currentTimeMillis() - zzbyqVar.zzb() <= ((Long) zzbd.zzc().zzd(zzbci.zzeE)).longValue() && zzbyqVar.zzc()) {
                return;
            }
        }
        if (context == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        final zzfhr zzn = zzfhr.zzn(context, 4);
        zzn.zza();
        zzbod zzb2 = zzt.zzr().zzb(this.zza, versionInfoParcel, zzfieVar);
        zzbnx zzbnxVar = zzboa.zza;
        zzbnt zza = zzb2.zza("google.afma.config.fetchAppSettings", zzbnxVar, zzbnxVar);
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                zzbbz zzbbzVar = zzbci.zza;
                jSONObject.put("experiment_ids", TextUtils.join(f.f598a, zzbd.zzb().zze()));
                jSONObject.put("js", versionInfoParcel.afmaVersion);
                if (((Boolean) zzbd.zzc().zzd(zzbci.zzko)).booleanValue()) {
                    jSONObject.put("inspector_enabled", z2);
                }
                try {
                    ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                    if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                        jSONObject.put("version", packageInfo.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
                }
                zzb = zza.zzb(jSONObject);
                try {
                    zzgobVar = new zzgob(this) { // from class: com.google.android.gms.ads.internal.zzd
                        @Override // com.google.android.gms.internal.ads.zzgob
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return zzf.zzd(l, zzdsmVar, zzn, zzfieVar, (JSONObject) obj);
                        }
                    };
                    zzfhrVar = zzn;
                } catch (Exception e) {
                    e = e;
                    zzfhrVar = zzn;
                }
            } catch (Exception e2) {
                exc = e2;
                zzfhrVar = zzn;
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error requesting application settings", exc);
                zzfhrVar.zzj(exc);
                zzfhrVar.zzd(false);
                zzfieVar.zzb(zzfhrVar.zzm());
            }
        } catch (Exception e3) {
            e = e3;
            zzfhrVar = zzn;
        }
        try {
            zzgpd zzgpdVar = zzbzh.zzg;
            ListenableFuture zzj = zzgot.zzj(zzb, zzgobVar, zzgpdVar);
            if (runnable != null) {
                zzb.addListener(runnable, zzgpdVar);
            }
            if (l != null) {
                zzb.addListener(new Runnable(this) { // from class: com.google.android.gms.ads.internal.zze
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzf.zzf(zzdsmVar, "cld_r", zzt.zzk().elapsedRealtime() - l.longValue());
                    }
                }, zzgpdVar);
            }
            if (((Boolean) zzbd.zzc().zzd(zzbci.zzik)).booleanValue()) {
                zzbzk.zzb(zzj, "ConfigLoader.maybeFetchNewAppSettings");
            } else {
                zzbzk.zza(zzj, "ConfigLoader.maybeFetchNewAppSettings");
            }
        } catch (Exception e4) {
            e = e4;
            exc = e;
            int i42 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error requesting application settings", exc);
            zzfhrVar.zzj(exc);
            zzfhrVar.zzd(false);
            zzfieVar.zzb(zzfhrVar.zzm());
        }
    }
}
