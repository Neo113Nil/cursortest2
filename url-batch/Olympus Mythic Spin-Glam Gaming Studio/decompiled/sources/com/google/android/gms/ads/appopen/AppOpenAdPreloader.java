package com.google.android.gms.ads.appopen;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes6.dex */
public final class AppOpenAdPreloader {
    private AppOpenAdPreloader() {
    }

    public static boolean destroy(@NonNull String str) {
        zzel zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzf(str);
    }

    public static void destroyAll() {
        zzel zza = zza();
        if (zza != null) {
            zza.zzg();
        }
    }

    @Nullable
    public static PreloadConfiguration getConfiguration(@NonNull String str) {
        zzel zza = zza();
        if (zza == null) {
            return null;
        }
        return zza.zzi(str);
    }

    @NonNull
    public static Map<String, PreloadConfiguration> getConfigurations() {
        zzel zza = zza();
        return zza == null ? new HashMap() : zza.zzh();
    }

    public static int getNumAdsAvailable(@NonNull String str) {
        zzel zza = zza();
        if (zza == null) {
            return 0;
        }
        return zza.zze(str);
    }

    public static boolean isAdAvailable(@NonNull String str) {
        zzel zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzd(str);
    }

    @Nullable
    public static AppOpenAd pollAd(@NonNull String str) {
        zzel zza = zza();
        if (zza == null) {
            return null;
        }
        return zza.zza(str);
    }

    public static boolean start(@NonNull String str, @NonNull PreloadConfiguration preloadConfiguration) {
        zzel zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzc(str, preloadConfiguration);
    }

    @Nullable
    private static zzel zza() {
        zzel zzelVar = (zzel) zzeu.zzb().zza(AdFormat.APP_OPEN_AD);
        if (zzelVar == null) {
            zzo.zzi("Failed to get a preloader. Call MobileAds.initialize() prior to calling preload APIs.");
        }
        return zzelVar;
    }

    public static boolean start(@NonNull String str, @NonNull PreloadConfiguration preloadConfiguration, @NonNull PreloadCallbackV2 preloadCallbackV2) {
        zzel zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzb(str, preloadConfiguration, preloadCallbackV2);
    }
}
