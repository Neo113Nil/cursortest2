package com.ogury.ad.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.ogury.ad.interstitial.ui.InterstitialActivity;
import com.ogury.ad.interstitial.ui.InterstitialAndroid8RotableActivity;
import com.ogury.ad.interstitial.ui.InterstitialAndroid8TransparentActivity;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.SourceTag;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class u3 {
    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "io.presage");
        p0.startActivity(p1);
    }

    public final void a(Context context, b ad, List notDisplayedAds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(notDisplayedAds, "notDisplayedAds");
        IntegrationLogger.d(LogTag.INTERNAL, SourceTag.ADS, "[Activity] Prepare and start Activity");
        Intent intent = new Intent(context, (Class<?>) (Build.VERSION.SDK_INT != 26 ? InterstitialActivity.class : ad.o ? InterstitialAndroid8TransparentActivity.class : InterstitialAndroid8RotableActivity.class));
        intent.putExtra("ad", ad);
        intent.putExtra("not_displayed_ads", new ArrayList(notDisplayedAds));
        intent.addFlags(268435456);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
    }
}
