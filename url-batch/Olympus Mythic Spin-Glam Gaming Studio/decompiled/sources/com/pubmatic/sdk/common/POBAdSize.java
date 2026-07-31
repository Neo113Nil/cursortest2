package com.pubmatic.sdk.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.iab.vast.tags.VastAttributes;

/* loaded from: classes10.dex */
public class POBAdSize {
    private int a;
    private int b;
    public static final POBAdSize BANNER_SIZE_320x50 = new POBAdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    public static final POBAdSize BANNER_SIZE_320x100 = new POBAdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 100);
    public static final POBAdSize BANNER_SIZE_300x250 = new POBAdSize(300, POBCommonConstants.DEFAULT_MIN_BITRATE);
    public static final POBAdSize BANNER_SIZE_300x300 = new POBAdSize(300, 300);
    public static final POBAdSize BANNER_SIZE_250x250 = new POBAdSize(POBCommonConstants.DEFAULT_MIN_BITRATE, POBCommonConstants.DEFAULT_MIN_BITRATE);
    public static final POBAdSize BANNER_SIZE_468x60 = new POBAdSize(468, 60);
    public static final POBAdSize BANNER_SIZE_728x90 = new POBAdSize(728, 90);
    public static final POBAdSize BANNER_SIZE_120x600 = new POBAdSize(120, 600);
    public static final POBAdSize INTERSTITIAL_320x480 = new POBAdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 480);
    public static final POBAdSize INTERSTITIAL_480x320 = new POBAdSize(480, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE);
    public static final POBAdSize INTERSTITIAL_768x1024 = new POBAdSize(768, 1024);
    public static final POBAdSize INTERSTITIAL_1024x768 = new POBAdSize(1024, 768);

    public POBAdSize(int i, int i2) {
        this();
        this.a = i;
        this.b = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof POBAdSize)) {
            return false;
        }
        POBAdSize pOBAdSize = (POBAdSize) obj;
        return this.a == pOBAdSize.a && this.b == pOBAdSize.b;
    }

    public int getAdHeight() {
        return this.b;
    }

    public int getAdWidth() {
        return this.a;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean isMREC() {
        return equals(BANNER_SIZE_300x250) || equals(BANNER_SIZE_300x300) || equals(BANNER_SIZE_250x250);
    }

    @NonNull
    public String toString() {
        return this.a + VastAttributes.HORIZONTAL_POSITION + this.b;
    }

    private POBAdSize() {
    }
}
