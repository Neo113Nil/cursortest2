package com.mobilefuse.sdk;

/* loaded from: classes13.dex */
public class AdService {
    public static final int AD_RESPONSE_FAILURE_REASON_ERROR = 2;
    public static final int AD_RESPONSE_FAILURE_REASON_NO_FILL = 1;
    private static AdController currentlyShowingFullscreenAd;

    static synchronized void showFullscreenAd(AdController adController) throws Throwable {
        synchronized (AdService.class) {
            if (adController.isDestroyed()) {
                return;
            }
            MobileFuseFullscreenActivity.showAd(adController);
        }
    }

    static synchronized boolean acquireFullscreenAdLock(AdController adController) throws Throwable {
        synchronized (AdService.class) {
            if (currentlyShowingFullscreenAd != null) {
                return false;
            }
            currentlyShowingFullscreenAd = adController;
            return true;
        }
    }

    static synchronized boolean disposeFullscreenAdLock(AdController adController) throws Throwable {
        synchronized (AdService.class) {
            if (currentlyShowingFullscreenAd != adController) {
                return false;
            }
            currentlyShowingFullscreenAd = null;
            return true;
        }
    }
}
