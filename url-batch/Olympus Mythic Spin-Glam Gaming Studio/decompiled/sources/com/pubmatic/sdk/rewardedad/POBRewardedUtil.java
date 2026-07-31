package com.pubmatic.sdk.rewardedad;

import android.content.Context;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.ui.POBRewardedAdRendering;
import com.pubmatic.sdk.openwrap.core.rewarded.POBRewardedAdRenderer;
import com.pubmatic.sdk.openwrap.core.rewarded.POBSkipConfirmationInfo;

/* loaded from: classes15.dex */
public final class POBRewardedUtil {
    @NonNull
    public static POBRewardedAdRendering getRewardedRenderer(@NonNull Context context, int i, @NonNull POBSkipConfirmationInfo pOBSkipConfirmationInfo) {
        return new POBRewardedAdRenderer(context, i, pOBSkipConfirmationInfo);
    }
}
