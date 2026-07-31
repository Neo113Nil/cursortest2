package com.google.unity.ads;

import android.app.Activity;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes5.dex */
public final class UnityMobileAds {
    public static void initialize(Activity activity, OnInitializationCompleteListener onInitializationCompleteListener) {
        if (activity == null) {
            return;
        }
        MobileAds.initialize(activity, onInitializationCompleteListener);
    }

    public static void setAppVolume(float f) {
        MobileAds.setAppVolume(f);
    }

    public static void disableMediationAdapterInitialization(Activity activity) {
        if (activity == null) {
            return;
        }
        MobileAds.disableMediationAdapterInitialization(activity);
    }

    public static void setAppMuted(boolean z) {
        MobileAds.setAppMuted(z);
    }

    public static boolean putPublisherFirstPartyIdEnabled(boolean z) {
        return MobileAds.putPublisherFirstPartyIdEnabled(z);
    }

    public static void setRequestConfiguration(RequestConfiguration requestConfiguration) {
        if (requestConfiguration == null) {
            return;
        }
        MobileAds.setRequestConfiguration(requestConfiguration);
    }

    public static RequestConfiguration getRequestConfiguration() {
        return MobileAds.getRequestConfiguration();
    }

    public static void openAdInspector(Activity activity, UnityAdInspectorListener unityAdInspectorListener) {
        if (activity == null) {
            return;
        }
        UnityAdInspector.openAdInspector(activity, unityAdInspectorListener);
    }

    public static void startPreload(Activity activity, List<PreloadConfiguration> list, PreloadCallback preloadCallback) {
        if (activity == null) {
            return;
        }
        MobileAds.startPreload(activity, list, preloadCallback);
    }

    public static void setPlugin(String str) {
        try {
            Method declaredMethod = MobileAds.class.getDeclaredMethod("setPlugin", String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, str);
        } catch (Exception unused) {
        }
    }

    public static String getSdkVersionString() {
        return MobileAds.getVersion().toString();
    }

    private UnityMobileAds() {
    }
}
