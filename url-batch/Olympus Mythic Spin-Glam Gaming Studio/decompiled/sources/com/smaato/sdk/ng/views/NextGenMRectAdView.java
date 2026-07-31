package com.smaato.sdk.ng.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.smaato.sdk.ng.api.MRectRequestManager;
import com.smaato.sdk.ng.api.OpenRTBApiClient;
import com.smaato.sdk.ng.api.RequestManager;
import com.smaato.sdk.ng.models.OpenRTBAdRequestFactory;

/* loaded from: classes10.dex */
public class NextGenMRectAdView extends NextGenAdView {
    public NextGenMRectAdView(Context context) {
        super(context);
    }

    @Override // com.smaato.sdk.ng.views.NextGenAdView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.v, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.smaato.sdk.ng.views.NextGenAdView
    protected String getLogTag() {
        return NextGenMRectAdView.class.getSimpleName();
    }

    @Override // com.smaato.sdk.ng.views.NextGenAdView
    RequestManager getORTBRequestManager() {
        return new MRectRequestManager(new OpenRTBApiClient(getContext()), new OpenRTBAdRequestFactory());
    }

    @Override // com.smaato.sdk.ng.views.NextGenAdView
    RequestManager getRequestManager() {
        return new MRectRequestManager();
    }

    @Override // com.smaato.sdk.ng.views.NextGenAdView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public NextGenMRectAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NextGenMRectAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public NextGenMRectAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
