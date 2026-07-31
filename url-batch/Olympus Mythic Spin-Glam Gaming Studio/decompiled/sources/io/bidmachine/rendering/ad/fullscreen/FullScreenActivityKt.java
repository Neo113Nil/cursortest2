package io.bidmachine.rendering.ad.fullscreen;

import android.content.Context;
import android.content.Intent;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.rendering.internal.a;
import io.bidmachine.rendering.model.Error;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u0018\u0010\b\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lio/bidmachine/rendering/ad/fullscreen/FullScreenAd;", "Landroid/content/Context;", "context", "", "startActivity", "(Lio/bidmachine/rendering/ad/fullscreen/FullScreenAd;Landroid/content/Context;)V", "a", "Lio/bidmachine/rendering/ad/fullscreen/FullScreenAd;", "tempFullScreenAd", "bidmachine-android-sdk_bb_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class FullScreenActivityKt {
    private static FullScreenAd a;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "io.bidmachine");
        p0.startActivity(p1);
    }

    public static final void startActivity(@NotNull FullScreenAd fullScreenAd, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(fullScreenAd, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            a = fullScreenAd;
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, a.a(context, FullScreenActivity.class));
        } catch (Throwable unused) {
            a = null;
            fullScreenAd.notifyAdFailToShow(new Error("Ad is null"));
        }
    }
}
