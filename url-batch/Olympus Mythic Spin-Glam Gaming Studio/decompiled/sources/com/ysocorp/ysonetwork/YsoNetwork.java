package com.ysocorp.ysonetwork;

import android.app.Activity;
import android.app.Application;
import android.view.View;
import androidx.annotation.Nullable;
import com.ysocorp.ysonetwork.YNManager;
import com.ysocorp.ysonetwork.device.YNDeviceManager;
import com.ysocorp.ysonetwork.enums.YNEnumActionError;
import com.ysocorp.ysonetwork.enums.YNEnumInitializationStatus;
import com.ysocorp.ysonetwork.enums.YNEnumPlacementType;
import com.ysocorp.ysonetwork.utils.YNLog;

/* loaded from: classes11.dex */
public class YsoNetwork {
    public static final String SDK_VERSION = "1.3.6";

    public interface ActionDisplay {
        void onClick();

        void onClose(boolean z, boolean z2);

        void onDisplay(View view);
    }

    @FunctionalInterface
    public interface ActionLoad {
        void onLoad(YNEnumActionError yNEnumActionError);
    }

    public static String getSdkVersion() {
        return "1.3.6";
    }

    @Nullable
    public static String getSignal() {
        if (isInitialized()) {
            return YNDeviceManager.getInstance().getDeviceMetrics();
        }
        return null;
    }

    public static void initialize(Application application) throws Exception {
        YNManager.initialize(application);
        YNLog.ProdInfo("YSO Network SDK 1.3.6");
    }

    public static YNEnumInitializationStatus initializationStatus() {
        return YNManager.initializationStatus();
    }

    public static boolean isInitialized() {
        return YNManager.isInitialized();
    }

    @Deprecated
    public static boolean isInitialize() {
        return isInitialized();
    }

    public static void destroy() {
        YNManager.destroy();
    }

    public static void interstitialLoad(String str, String str2, ActionLoad actionLoad) {
        YNManager.load(str, str2, actionLoad);
    }

    @Deprecated
    public static void interstitialLoad(String str, String str2, YNManager.ActionLoad actionLoad) {
        interstitialLoad(str, str2, (ActionLoad) actionLoad);
    }

    public static void interstitialShow(String str, ActionDisplay actionDisplay, Activity activity) {
        YNManager.show(str, YNEnumPlacementType.Interstitial, actionDisplay, activity);
    }

    @Deprecated
    public static void interstitialShow(String str, YNManager.ActionDisplay actionDisplay, Activity activity) {
        interstitialShow(str, (ActionDisplay) actionDisplay, activity);
    }

    public static void rewardedLoad(String str, String str2, ActionLoad actionLoad) {
        YNManager.load(str, str2, actionLoad);
    }

    @Deprecated
    public static void rewardedLoad(String str, String str2, YNManager.ActionLoad actionLoad) {
        rewardedLoad(str, str2, (ActionLoad) actionLoad);
    }

    public static void rewardedShow(String str, ActionDisplay actionDisplay, Activity activity) {
        YNManager.show(str, YNEnumPlacementType.Rewarded, actionDisplay, activity);
    }

    @Deprecated
    public static void rewardedShow(String str, YNManager.ActionDisplay actionDisplay, Activity activity) {
        rewardedShow(str, (ActionDisplay) actionDisplay, activity);
    }

    public static void bannerLoad(String str, String str2, ActionLoad actionLoad) {
        YNManager.load(str, str2, actionLoad);
    }

    @Deprecated
    public static void bannerLoad(String str, String str2, YNManager.ActionLoad actionLoad) {
        bannerLoad(str, str2, (ActionLoad) actionLoad);
    }

    public static void bannerShow(String str, ActionDisplay actionDisplay, Activity activity) {
        YNManager.show(str, YNEnumPlacementType.Banner, actionDisplay, activity);
    }

    @Deprecated
    public static void bannerShow(String str, YNManager.ActionDisplay actionDisplay, Activity activity) {
        bannerShow(str, (ActionDisplay) actionDisplay, activity);
    }
}
