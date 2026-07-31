package net.pubnative.lite.sdk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import net.pubnative.lite.sdk.api.MRectRequestManager;
import net.pubnative.lite.sdk.api.OpenRTBApiClient;
import net.pubnative.lite.sdk.api.RequestManager;
import net.pubnative.lite.sdk.models.OpenRTBAdRequestFactory;

/* loaded from: classes5.dex */
public class HyBidMRectAdView extends HyBidAdView {
    public HyBidMRectAdView(Context context) {
        super(context);
    }

    @Override // net.pubnative.lite.sdk.views.HyBidAdView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.C, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // net.pubnative.lite.sdk.views.HyBidAdView
    protected String getLogTag() {
        return HyBidMRectAdView.class.getSimpleName();
    }

    @Override // net.pubnative.lite.sdk.views.HyBidAdView
    RequestManager getORTBRequestManager() {
        return new MRectRequestManager(new OpenRTBApiClient(getContext()), new OpenRTBAdRequestFactory());
    }

    @Override // net.pubnative.lite.sdk.views.HyBidAdView
    RequestManager getRequestManager() {
        return new MRectRequestManager();
    }

    @Override // net.pubnative.lite.sdk.views.HyBidAdView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public HyBidMRectAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HyBidMRectAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public HyBidMRectAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
