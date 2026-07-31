package com.smaato.sdk.banner.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes4.dex */
public final class VideoBannerView extends BannerView {
    @Override // com.smaato.sdk.banner.widget.BannerView, com.smaato.sdk.ng.views.NextGenAdView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.v, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.smaato.sdk.banner.widget.BannerView, com.smaato.sdk.ng.views.NextGenAdView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public VideoBannerView(Context context) {
        super(context);
    }

    public VideoBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VideoBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public VideoBannerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
