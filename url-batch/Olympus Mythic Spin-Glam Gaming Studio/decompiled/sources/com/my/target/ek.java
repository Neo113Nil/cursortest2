package com.my.target;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class ek extends b1 {
    private final String d;
    private View e;

    public ek(String str, yj yjVar, WebViewClient webViewClient, Context context) {
        super(context);
        WebSettings settings = getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        this.d = str;
        WebView webView = getWebView();
        if (webView == null) {
            mi.b("WebFormView: WebView is null, can't add handlers");
        } else {
            setWebViewClient(webViewClient);
            webView.addJavascriptInterface(yjVar, "AndroidBridge");
        }
    }

    private void h() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, getContext().getResources().getDisplayMetrics().heightPixels, 0.0f);
        translateAnimation.setDuration(500L);
        translateAnimation.setFillAfter(true);
        startAnimation(translateAnimation);
    }

    public void a(View view) {
        if (this.e != null) {
            removeView(view);
        }
        this.e = view;
        addView(view);
    }

    @Override // com.my.target.b1, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void g() {
        WebView webView = getWebView();
        if (webView == null) {
            return;
        }
        webView.reload();
    }

    public void i() {
        h();
        a(this.d);
    }

    @Override // com.my.target.b1, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
