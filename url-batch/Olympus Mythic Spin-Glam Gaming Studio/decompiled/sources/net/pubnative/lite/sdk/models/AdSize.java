package net.pubnative.lite.sdk.models;

import com.pubmatic.sdk.common.POBCommonConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Locale;

/* loaded from: classes4.dex */
public enum AdSize {
    SIZE_320x50(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, "s"),
    SIZE_300x250(300, POBCommonConstants.DEFAULT_MIN_BITRATE, "m"),
    SIZE_300x50(300, 50, "s"),
    SIZE_320x480(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 480, "l"),
    SIZE_1024x768(1024, 768, "l"),
    SIZE_768x1024(768, 1024, "l"),
    SIZE_728x90(728, 90, "s"),
    SIZE_160x600(160, 600, "m"),
    SIZE_250x250(POBCommonConstants.DEFAULT_MIN_BITRATE, POBCommonConstants.DEFAULT_MIN_BITRATE, "m"),
    SIZE_300x600(300, 600, "l"),
    SIZE_320x100(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 100, "s"),
    SIZE_480x320(480, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, "l"),
    SIZE_INTERSTITIAL(0, 0, "l");

    private final String adLayoutSize;
    private final int height;
    private final int width;

    AdSize(int i, int i2, String str) {
        this.width = i;
        this.height = i2;
        this.adLayoutSize = str;
    }

    public String getAdLayoutSize() {
        return this.adLayoutSize;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.format(Locale.ENGLISH, "(%d x %d)", Integer.valueOf(getWidth()), Integer.valueOf(getHeight()));
    }
}
