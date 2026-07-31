package com.smaato.sdk.core.ad;

import com.pubmatic.sdk.common.POBCommonConstants;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes14.dex */
public enum AdDimension {
    XX_LARGE(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50),
    X_LARGE(300, 50),
    LARGE(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 36),
    MEDIUM(168, 28),
    SMALL(120, 20),
    MEDIUM_RECTANGLE(300, POBCommonConstants.DEFAULT_MIN_BITRATE),
    SKYSCRAPER(120, 600),
    LEADERBOARD(728, 90),
    FULLSCREEN_PORTRAIT(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 480),
    FULLSCREEN_LANDSCAPE(480, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE),
    FULLSCREEN_PORTRAIT_TABLET(768, 1024),
    FULLSCREEN_LANDSCAPE_TABLET(1024, 768);

    private final float aspectRatio;
    private final int height;
    private final int width;

    AdDimension(int i, int i2) {
        this.width = i;
        this.height = i2;
        this.aspectRatio = i / i2;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public float getAspectRatio() {
        return this.aspectRatio;
    }
}
