package com.google.android.gms.ads.appopen;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzeo;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes4.dex */
public final class AppOpenAdPreloader {
    private AppOpenAdPreloader() {
    }

    public static boolean destroy(String str) {
        zzeo zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzf(str);
    }

    public static void destroyAll() {
        zzeo zza = zza();
        if (zza != null) {
            zza.zzg();
        }
    }

    public static PreloadConfiguration getConfiguration(String str) {
        zzeo zza = zza();
        if (zza == null) {
            return null;
        }
        return zza.zzi(str);
    }

    public static Map<String, PreloadConfiguration> getConfigurations() {
        zzeo zza = zza();
        return zza == null ? new HashMap() : zza.zzh();
    }

    public static int getNumAdsAvailable(String str) {
        zzeo zza = zza();
        if (zza == null) {
            return 0;
        }
        return zza.zze(str);
    }

    public static boolean isAdAvailable(String str) {
        zzeo zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzd(str);
    }

    public static AppOpenAd pollAd(String str) {
        zzeo zza = zza();
        if (zza == null) {
            return null;
        }
        return zza.zza(str);
    }

    public static boolean start(String str, PreloadConfiguration preloadConfiguration) {
        zzeo zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzc(str, preloadConfiguration);
    }

    private static zzeo zza() {
        zzeo zzeoVar = (zzeo) zzex.zzb().zza(AdFormat.APP_OPEN_AD);
        if (zzeoVar == null) {
            zzo.zzi("Failed to get a preloader. Call MobileAds.initialize() prior to calling preload APIs.");
        }
        return zzeoVar;
    }

    public static boolean start(String str, PreloadConfiguration preloadConfiguration, PreloadCallbackV2 preloadCallbackV2) {
        zzeo zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzb(str, preloadConfiguration, preloadCallbackV2);
    }
}
