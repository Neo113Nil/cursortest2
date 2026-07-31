package org.chromium.base;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import internal.org.chromium.build.BuildConfig;
import internal.org.jni_zero.CalledByNative;

/* loaded from: classes10.dex */
public final class DeviceInfo {
    private static final Object CREATION_LOCK = new Object();
    private static String sGmsVersionCodeForTesting;
    private static boolean sInitialized;
    private static DeviceInfo sInstance;
    private static Boolean sIsAutomotiveForTesting;
    private static boolean sIsXrForTesting;
    private final IDeviceInfo mIDeviceInfo;

    interface Natives {
        void fillFields(String str, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, boolean z6);
    }

    @CalledByNative
    private static void nativeReadyForFields() {
        sendToNative(getInstance().mIDeviceInfo);
    }

    public static void sendToNative(IDeviceInfo iDeviceInfo) {
        DeviceInfoJni.get().fillFields(iDeviceInfo.gmsVersionCode, iDeviceInfo.isTv, iDeviceInfo.isAutomotive, iDeviceInfo.isFoldable, iDeviceInfo.isDesktop, iDeviceInfo.vulkanDeqpLevel, sIsXrForTesting ? true : iDeviceInfo.isXr, iDeviceInfo.wasLaunchedOnLargeDisplay);
    }

    private static DeviceInfo getInstance() {
        DeviceInfo deviceInfo;
        if (BuildConfig.IS_FOR_TEST) {
            return new DeviceInfo();
        }
        synchronized (CREATION_LOCK) {
            try {
                if (sInstance == null) {
                    sInstance = new DeviceInfo();
                }
                deviceInfo = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return deviceInfo;
    }

    public static long packageVersionCode(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            return longVersionCode;
        }
        return packageInfo.versionCode;
    }

    private static int getDeviceWidthInDp() {
        return (int) (r0.widthPixels / ContextUtils.getApplicationContext().getResources().getDisplayMetrics().density);
    }

    private DeviceInfo() {
        String str;
        boolean z;
        int i;
        FeatureInfo[] systemAvailableFeatures;
        IDeviceInfo iDeviceInfo = new IDeviceInfo();
        this.mIDeviceInfo = iDeviceInfo;
        sInitialized = true;
        PackageInfo packageInfo = PackageUtils.getPackageInfo("com.google.android.gms", 0);
        if (packageInfo != null) {
            str = String.valueOf(packageVersionCode(packageInfo));
        } else {
            str = "gms versionCode not available.";
        }
        iDeviceInfo.gmsVersionCode = str;
        String str2 = sGmsVersionCodeForTesting;
        if (str2 != null) {
            iDeviceInfo.gmsVersionCode = str2;
        }
        Context applicationContext = ContextUtils.getApplicationContext();
        PackageManager packageManager = applicationContext.getPackageManager();
        UiModeManager uiModeManager = (UiModeManager) applicationContext.getSystemService("uimode");
        iDeviceInfo.isTv = uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
        try {
            z = packageManager.hasSystemFeature("android.hardware.type.automotive");
        } catch (SecurityException e) {
            Log.e("DeviceInfo", "Unable to query for Automotive system feature", (Throwable) e);
            z = false;
        }
        IDeviceInfo iDeviceInfo2 = this.mIDeviceInfo;
        iDeviceInfo2.isAutomotive = z;
        Boolean bool = sIsAutomotiveForTesting;
        if (bool != null) {
            iDeviceInfo2.isAutomotive = bool.booleanValue();
        }
        this.mIDeviceInfo.isDesktop = (BuildConfig.IS_DESKTOP_ANDROID && packageManager.hasSystemFeature("android.hardware.type.pc")) || CommandLine.getInstance().hasSwitch("force-desktop-android");
        IDeviceInfo iDeviceInfo3 = this.mIDeviceInfo;
        iDeviceInfo3.isFoldable = !iDeviceInfo3.isDesktop && Build.VERSION.SDK_INT >= 30 && packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
        if (Build.VERSION.SDK_INT >= 33 && (systemAvailableFeatures = packageManager.getSystemAvailableFeatures()) != null) {
            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                if ("android.software.vulkan.deqp.level".equals(featureInfo.name)) {
                    i = featureInfo.version;
                    break;
                }
            }
        }
        i = 0;
        IDeviceInfo iDeviceInfo4 = this.mIDeviceInfo;
        iDeviceInfo4.vulkanDeqpLevel = i;
        iDeviceInfo4.wasLaunchedOnLargeDisplay = getDeviceWidthInDp() >= 600;
        this.mIDeviceInfo.isXr = packageManager.hasSystemFeature("android.software.xr.api.openxr");
    }
}
