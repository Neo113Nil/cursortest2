package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.view.MotionEvent;
import androidx.annotation.MainThread;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/mobile/ads/nativeads/NativeAdView;", "Lcom/monetization/ads/nativeads/ExtendedNativeAdView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@MainThread
/* loaded from: classes6.dex */
public final class NativeAdView extends ExtendedNativeAdView {
    public NativeAdView(@NotNull Context context) {
        super(context);
    }

    @Override // com.monetization.ads.nativeads.ExtendedNativeAdView, yads.bj2, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.monetization.ads.nativeads.ExtendedNativeAdView, yads.bj2, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
