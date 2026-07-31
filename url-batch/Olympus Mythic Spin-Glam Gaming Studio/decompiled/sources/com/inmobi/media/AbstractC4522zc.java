package com.inmobi.media;

import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.zc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4522zc {
    public static Ac a(TimeoutConfigurations.MediationConfig mediationConfig, String placementType, String adTypes, String str) {
        TimeoutConfigurations.AdNonABConfig banner;
        TimeoutConfigurations.AdPreloadConfig banner2;
        TimeoutConfigurations.AdABConfig banner3;
        Intrinsics.checkNotNullParameter(mediationConfig, "mediationConfig");
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Intrinsics.checkNotNullParameter(adTypes, "adTypes");
        if (placementType.equals("AB")) {
            TimeoutConfigurations.ABConfig ab = mediationConfig.getAb();
            int hashCode = adTypes.hashCode();
            if (hashCode == -1396342996) {
                if (adTypes.equals("banner")) {
                    banner3 = ab.getBanner();
                }
                banner3 = ab.getBanner();
            } else if (hashCode == -1052618729) {
                if (adTypes.equals("native")) {
                    banner3 = ab.getNative();
                }
                banner3 = ab.getBanner();
            } else if (hashCode != 104431) {
                if (hashCode == 93166550 && adTypes.equals("audio")) {
                    banner3 = ab.getAudio();
                }
                banner3 = ab.getBanner();
            } else {
                if (adTypes.equals(com.safedk.android.analytics.brandsafety.m.w)) {
                    banner3 = ab.getInt();
                }
                banner3 = ab.getBanner();
            }
            return new Ac(a(str, banner3.getLoadRetryInterval()), a(str, banner3.getMaxLoadRetries()), a(str, banner3.getLoadTimeout()), (Integer) null, 24);
        }
        if (placementType.equals("Preload")) {
            TimeoutConfigurations.PreloadConfig preload = mediationConfig.getPreload();
            int hashCode2 = adTypes.hashCode();
            if (hashCode2 == -1396342996) {
                if (adTypes.equals("banner")) {
                    banner2 = preload.getBanner();
                }
                banner2 = preload.getBanner();
            } else if (hashCode2 == -1052618729) {
                if (adTypes.equals("native")) {
                    banner2 = preload.getNative();
                }
                banner2 = preload.getBanner();
            } else if (hashCode2 != 104431) {
                if (hashCode2 == 93166550 && adTypes.equals("audio")) {
                    banner2 = preload.getAudio();
                }
                banner2 = preload.getBanner();
            } else {
                if (adTypes.equals(com.safedk.android.analytics.brandsafety.m.w)) {
                    banner2 = preload.getInt();
                }
                banner2 = preload.getBanner();
            }
            return new Ac(a(str, banner2.getLoadRetryInterval()), a(str, banner2.getMaxLoadRetries()), a(str, banner2.getLoadTimeout()), Integer.valueOf(a(str, banner2.getMuttTimeout())), Integer.valueOf(a(str, banner2.getPreloadTimeout())));
        }
        TimeoutConfigurations.NonABConfig nonAb = mediationConfig.getNonAb();
        int hashCode3 = adTypes.hashCode();
        if (hashCode3 == -1396342996) {
            if (adTypes.equals("banner")) {
                banner = nonAb.getBanner();
            }
            banner = nonAb.getBanner();
        } else if (hashCode3 == -1052618729) {
            if (adTypes.equals("native")) {
                banner = nonAb.getNative();
            }
            banner = nonAb.getBanner();
        } else if (hashCode3 != 104431) {
            if (hashCode3 == 93166550 && adTypes.equals("audio")) {
                banner = nonAb.getAudio();
            }
            banner = nonAb.getBanner();
        } else {
            if (adTypes.equals(com.safedk.android.analytics.brandsafety.m.w)) {
                banner = nonAb.getInt();
            }
            banner = nonAb.getBanner();
        }
        return new Ac(a(str, banner.getLoadRetryInterval()), a(str, banner.getMaxLoadRetries()), a(str, banner.getLoadTimeout()), Integer.valueOf(a(str, banner.getMuttTimeout())), 16);
    }

    public static int a(String str, JSONObject jSONObject) {
        if (str != null && jSONObject.has(str)) {
            return jSONObject.getInt(str);
        }
        return jSONObject.optInt("default", 0);
    }
}
