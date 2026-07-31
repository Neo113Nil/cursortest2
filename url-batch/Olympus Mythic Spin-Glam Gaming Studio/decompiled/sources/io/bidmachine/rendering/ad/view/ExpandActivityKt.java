package io.bidmachine.rendering.ad.view;

import android.content.Context;
import android.content.Intent;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.rendering.internal.a;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007¨\u0006\t"}, d2 = {"Lio/bidmachine/rendering/ad/view/AdView;", "", "startExpandActivity", "(Lio/bidmachine/rendering/ad/view/AdView;)V", "a", "()V", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "tempAdView", "bidmachine-android-sdk_bb_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public final class ExpandActivityKt {
    private static WeakReference a;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a() {
        WeakReference weakReference = a;
        if (weakReference != null) {
            weakReference.clear();
        }
        a = null;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "io.bidmachine");
        p0.startActivity(p1);
    }

    public static final void startExpandActivity(@NotNull AdView adView) {
        Intrinsics.checkNotNullParameter(adView, "<this>");
        try {
            a = new WeakReference(adView);
            Context context = adView.getContext();
            Context context2 = adView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, a.a(context2, ExpandActivity.class));
        } catch (Throwable unused) {
            adView.collapse();
        }
    }
}
