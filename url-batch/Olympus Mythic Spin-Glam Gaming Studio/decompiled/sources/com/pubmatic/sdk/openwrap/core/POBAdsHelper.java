package com.pubmatic.sdk.openwrap.core;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBAdFormat;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.cache.POBCacheManager;
import com.pubmatic.sdk.common.models.POBAdResponse;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import java.util.UUID;

/* loaded from: classes6.dex */
public class POBAdsHelper {
    private static String a() {
        return UUID.randomUUID().toString();
    }

    @Nullable
    public static POBImpression createFullScreenImpression(@NonNull Context context, @NonNull String str, @NonNull POBAdFormat pOBAdFormat) {
        POBImpression pOBImpression = pOBAdFormat == POBAdFormat.INTERSTITIAL ? new POBImpression(a(), str) : pOBAdFormat == POBAdFormat.REWARDEDAD ? new POBImpression(a(), str, true, true) : null;
        if (pOBImpression != null) {
            pOBImpression.setAdPosition(POBRequest.AdPosition.FULL_SCREEN);
            pOBImpression.setInterstitial(true);
            pOBImpression.setCtaOverlayEnabled(true);
        }
        return pOBImpression;
    }

    @Nullable
    public static POBImpression getImpression(@Nullable POBRequest pOBRequest) {
        POBImpression[] impressions;
        if (pOBRequest == null || (impressions = pOBRequest.getImpressions()) == null || impressions.length == 0) {
            return null;
        }
        return impressions[0];
    }

    public static void recordImpressionDepth(@NonNull Context context, @NonNull POBAdFormat pOBAdFormat) {
        POBInstanceProvider.getImpDepthHandler(POBInstanceProvider.getApplicationSessionHandler((Application) context.getApplicationContext())).recordImpression(pOBAdFormat);
    }

    public static void updateAppInstallStatusSignals(@NonNull Context context, @NonNull POBImpression pOBImpression) {
        POBCacheManager cacheManager = POBInstanceProvider.getCacheManager(context);
        pOBImpression.setMRAIDAppStatusEnabled(cacheManager.getAppInstallStatus());
        pOBImpression.setAppStatusSchemes(cacheManager.getAppStatusSchemes());
    }

    @NonNull
    public static <T extends POBAdDescriptor> POBAdResponse<T> updateResponseUsingAdFormatType(@NonNull POBAdResponse<T> pOBAdResponse, @NonNull POBAdFormat pOBAdFormat) {
        return pOBAdResponse.getWinningBid() != null ? new POBAdResponse.Builder(pOBAdResponse).updateWithRefreshIntervalAndExpiryTimeout(pOBAdFormat).build() : pOBAdResponse;
    }

    public static boolean validate(@Nullable Context context, @Nullable String str, @Nullable String str2) {
        return (context == null || POBUtils.isNullOrEmpty(str) || POBUtils.isNullOrEmpty(str2)) ? false : true;
    }

    public static boolean validate(@Nullable Context context, @Nullable String str, @Nullable String str2, @Nullable Object obj) {
        return validate(context, str, str2) && obj != null;
    }
}
