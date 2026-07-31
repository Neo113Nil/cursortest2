package com.google.unity.ads.nextgen;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.libraries.ads.mobile.sdk.MobileAds;
import com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration;
import com.google.android.libraries.ads.mobile.sdk.initialization.InitializationConfig;
import com.google.android.libraries.ads.mobile.sdk.initialization.InitializationStatus;
import com.google.android.libraries.ads.mobile.sdk.initialization.OnAdapterInitializationCompleteListener;

/* loaded from: classes6.dex */
public final class UnityMobileAds {
    private static final String APPLICATION_ID_KEY = "com.google.android.gms.ads.APPLICATION_ID";
    private static final String TAG = "UnityMobileAds";
    private static volatile RequestConfiguration requestConfiguration;
    private static MobileAdsWrapper mobileAdsWrapper = new MobileAdsWrapper();
    private static final Object stateLock = new Object();
    private static volatile boolean isMobileAdsInitialized = false;
    private static volatile float userVolume = -1.0f;
    private static volatile boolean isMuted = false;
    private static volatile boolean isPublisherFirstPartyIdEnabled = false;

    private UnityMobileAds() {
    }

    @VisibleForTesting
    static void setMobileAdsWrapper(MobileAdsWrapper mobileAdsWrapper2) {
        mobileAdsWrapper = mobileAdsWrapper2;
    }

    public static void initialize(final Activity activity, final OnAdapterInitializationCompleteListener onAdapterInitializationCompleteListener) {
        String applicationMetaData = getApplicationMetaData(activity, APPLICATION_ID_KEY);
        if (applicationMetaData == null) {
            Log.e(TAG, "Application ID is null. Cannot initialize the Google Mobile Ads SDK.");
            return;
        }
        InitializationConfig.Builder builder = new InitializationConfig.Builder(applicationMetaData);
        synchronized (stateLock) {
            try {
                if (requestConfiguration != null) {
                    builder = builder.setRequestConfiguration(requestConfiguration);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        final InitializationConfig build = builder.build();
        new Thread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityMobileAds$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                UnityMobileAds.lambda$initialize$0(activity, build, onAdapterInitializationCompleteListener);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initialize$0(Activity activity, InitializationConfig initializationConfig, final OnAdapterInitializationCompleteListener onAdapterInitializationCompleteListener) {
        MobileAds.initialize(activity, initializationConfig, new OnAdapterInitializationCompleteListener() { // from class: com.google.unity.ads.nextgen.UnityMobileAds$$ExternalSyntheticLambda1
        });
    }

    private static /* synthetic */ void lambda$initialize$1(OnAdapterInitializationCompleteListener onAdapterInitializationCompleteListener, InitializationStatus initializationStatus) {
        synchronized (stateLock) {
            try {
                isMobileAdsInitialized = true;
                requestConfiguration = null;
                if (isPublisherFirstPartyIdEnabled) {
                    MobileAds.putPublisherFirstPartyIdEnabled(true);
                    isPublisherFirstPartyIdEnabled = false;
                }
                if (userVolume >= 0.0f) {
                    MobileAds.setUserControlledAppVolume(userVolume);
                    userVolume = -1.0f;
                }
                if (isMuted) {
                    MobileAds.setUserMutedApp(isMuted);
                    isMuted = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        onAdapterInitializationCompleteListener.onAdapterInitializationComplete(initializationStatus);
    }

    public static void setRequestConfiguration(RequestConfiguration requestConfiguration2) {
        synchronized (stateLock) {
            try {
                if (!isMobileAdsInitialized) {
                    requestConfiguration = requestConfiguration2;
                } else {
                    MobileAds.setRequestConfiguration(requestConfiguration2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static RequestConfiguration getRequestConfiguration() {
        return mobileAdsWrapper.getRequestConfiguration();
    }

    public static boolean putPublisherFirstPartyIdEnabled(boolean z) {
        synchronized (stateLock) {
            try {
                if (!isMobileAdsInitialized) {
                    isPublisherFirstPartyIdEnabled = z;
                    return true;
                }
                return MobileAds.putPublisherFirstPartyIdEnabled(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setUserControlledAppVolume(float f) {
        synchronized (stateLock) {
            try {
                if (!isMobileAdsInitialized) {
                    userVolume = f;
                } else {
                    MobileAds.setUserControlledAppVolume(f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setApplicationMuted(boolean z) {
        synchronized (stateLock) {
            try {
                if (!isMobileAdsInitialized) {
                    isMuted = z;
                } else {
                    MobileAds.setUserMutedApp(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String getSdkVersionString() {
        return mobileAdsWrapper.getVersionString();
    }

    @Nullable
    private static String getApplicationMetaData(Activity activity, String str) {
        Bundle bundle;
        if (activity == null) {
            Log.e(TAG, "Unity Activity is null. Cannot read Application ID.");
            return null;
        }
        try {
            bundle = activity.getPackageManager().getApplicationInfo(activity.getPackageName(), 128).metaData;
        } catch (Exception e) {
            Log.e(TAG, "Error reading application ID from manifest: " + e.getMessage());
        }
        if (bundle == null || !bundle.containsKey(str)) {
            Log.e(TAG, "Application ID not found in manifest!");
            return null;
        }
        return bundle.getString(str);
    }
}
