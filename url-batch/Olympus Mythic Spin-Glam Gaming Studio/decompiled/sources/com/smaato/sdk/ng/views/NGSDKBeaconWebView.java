package com.smaato.sdk.ng.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.SmaatoNetworkBridge;
import com.safedk.android.utils.h;

/* loaded from: classes4.dex */
public class NGSDKBeaconWebView extends WebView {
    public NGSDKBeaconWebView(Context context) {
        super(context);
        a();
    }

    private void a() {
        getSettings().setJavaScriptEnabled(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.v, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void loadBeacon(String str) {
        SmaatoNetworkBridge.webviewLoadUrl(this, "javascript:" + str);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public NGSDKBeaconWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public NGSDKBeaconWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
