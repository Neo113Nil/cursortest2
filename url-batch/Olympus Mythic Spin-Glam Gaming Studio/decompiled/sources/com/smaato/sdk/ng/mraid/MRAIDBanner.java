package com.smaato.sdk.ng.mraid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.smaato.sdk.ng.mraid.MRAIDView;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public class MRAIDBanner extends MRAIDView {
    public MRAIDBanner(Context context, String str, String str2, Boolean bool, Boolean bool2, String[] strArr, MRAIDViewListener mRAIDViewListener, MRAIDNativeFeatureListener mRAIDNativeFeatureListener, ViewGroup viewGroup) {
        super(context, str, str2, bool, strArr, mRAIDViewListener, mRAIDNativeFeatureListener, viewGroup, false, bool2.booleanValue());
        WebView webView = this.webView;
        if (webView != null) {
            webView.setBackgroundColor(0);
            addView(this.webView, new FrameLayout.LayoutParams(-1, -1));
        } else if (mRAIDViewListener != null) {
            mRAIDViewListener.mraidViewError(this);
        }
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.v, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDView
    @Deprecated
    protected void expand(String str, Boolean bool, MRAIDView.OnExpandCreativeFailListener onExpandCreativeFailListener) {
        int i = this.state;
        if (i == 1 || i == 3) {
            super.expand(str, bool, onExpandCreativeFailListener);
        }
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDView
    protected void expandHelper(WebView webView) {
        this.state = 2;
        super.expandHelper(webView);
        fireStateChangeEvent();
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDView
    public boolean onBackPressed() {
        return this.state != 1 && super.onBackPressed();
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDView
    protected void onLayoutCompleted() {
        if (this.state == 0 && this.isPageFinished) {
            this.state = 1;
            fireStateChangeEvent();
            fireReadyEvent();
            setViewable(getVisibility());
        }
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
