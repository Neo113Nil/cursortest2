package io.bidmachine.banner;

import androidx.annotation.NonNull;
import com.my.tracker.MyTracker;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.BannerAdSize;

@Deprecated(since = MyTracker.VERSION)
/* loaded from: classes3.dex */
public enum BannerSize {
    Size_320x50(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50),
    Size_300x250(300, POBCommonConstants.DEFAULT_MIN_BITRATE),
    Size_728x90(728, 90);

    public final int height;
    public final int width;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[BannerSize.values().length];
            a = iArr;
            try {
                iArr[BannerSize.Size_300x250.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[BannerSize.Size_728x90.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    BannerSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    @NonNull
    public static BannerSize fromBannerAdSize(@NonNull BannerAdSize bannerAdSize) {
        return bannerAdSize.equals(BannerAdSize.Leaderboard) ? Size_728x90 : bannerAdSize.equals(BannerAdSize.MediumRectangle) ? Size_300x250 : Size_320x50;
    }

    @NonNull
    public static BannerAdSize toBannerAdSize(@NonNull BannerSize bannerSize) {
        int i = a.a[bannerSize.ordinal()];
        return i != 1 ? i != 2 ? BannerAdSize.Banner : BannerAdSize.Leaderboard : BannerAdSize.MediumRectangle;
    }
}
