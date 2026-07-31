package com.google.android.gms.ads.rewarded;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.client.zzey;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
public final class RewardedAdPreloader {
    private RewardedAdPreloader() {
    }

    public static boolean destroy(@NonNull String str) {
        zzey zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzf(str);
    }

    public static void destroyAll() {
        zzey zza = zza();
        if (zza != null) {
            zza.zzg();
        }
    }

    @Nullable
    public static PreloadConfiguration getConfiguration(@NonNull String str) {
        zzey zza = zza();
        if (zza == null) {
            return null;
        }
        return zza.zzi(str);
    }

    @NonNull
    public static Map<String, PreloadConfiguration> getConfigurations() {
        zzey zza = zza();
        return zza == null ? new HashMap() : zza.zzh();
    }

    public static int getNumAdsAvailable(@NonNull String str) {
        zzey zza = zza();
        if (zza == null) {
            return 0;
        }
        return zza.zze(str);
    }

    public static boolean isAdAvailable(@NonNull String str) {
        zzey zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzd(str);
    }

    @Nullable
    public static RewardedAd pollAd(@NonNull String str) {
        zzey zza = zza();
        if (zza == null) {
            return null;
        }
        return zza.zza(str);
    }

    public static boolean start(@NonNull String str, @NonNull PreloadConfiguration preloadConfiguration) {
        zzey zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzc(str, preloadConfiguration);
    }

    @Nullable
    private static zzey zza() {
        zzey zzeyVar = (zzey) zzeu.zzb().zza(AdFormat.REWARDED);
        if (zzeyVar == null) {
            zzo.zzl("Failed to get a preloader. Call MobileAds.initialize() prior to calling preload APIs.", null);
        }
        return zzeyVar;
    }

    public static boolean start(@NonNull String str, @NonNull PreloadConfiguration preloadConfiguration, @NonNull PreloadCallbackV2 preloadCallbackV2) {
        zzey zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzb(str, preloadConfiguration, preloadCallbackV2);
    }
}
