package com.smaato.sdk.ng.utils.browser;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.SmaatoNetworkBridge;
import com.safedk.android.utils.h;

/* loaded from: classes4.dex */
public class BaseWebView extends WebView {
    public BaseWebView(Context context) {
        super(context.getApplicationContext());
        b();
    }

    private void a() {
        getSettings().setAllowContentAccess(false);
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
    }

    private void b() {
        c();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void c() {
        getSettings().setJavaScriptEnabled(true);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.v, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void loadHtml(String str) {
        if (str != null) {
            SmaatoNetworkBridge.webviewLoadDataWithBaseURL(this, null, str, POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
        }
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public BaseWebView(Context context, AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        b();
    }

    public BaseWebView(Context context, AttributeSet attributeSet, int i) {
        super(context.getApplicationContext(), attributeSet, i);
        b();
    }
}
