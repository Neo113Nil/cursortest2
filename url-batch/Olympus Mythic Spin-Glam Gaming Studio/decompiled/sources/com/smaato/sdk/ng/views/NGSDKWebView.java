package com.smaato.sdk.ng.views;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.smaato.sdk.ng.utils.ViewUtils;

/* loaded from: classes4.dex */
public class NGSDKWebView extends WebView {
    private static boolean sDeadlockCleared;

    class a extends WebChromeClient {
        a() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            jsPromptResult.confirm();
            return true;
        }
    }

    public NGSDKWebView(Context context) {
        this(context.getApplicationContext(), null);
    }

    private void fixWebViewDeadlock(Context context) {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.smaato.sdk.ng.views.NGSDKWebView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    NGSDKWebView.this.destroy();
                }
            });
            return;
        }
        ViewUtils.removeFromParent(this);
        removeAllViews();
        super.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.v, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void enablePlugins(boolean z) {
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public NGSDKWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowContentAccess(false);
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
        enableWebDebugging();
        enablePlugins(false);
        setWebChromeClient(new a());
        if (sDeadlockCleared) {
            return;
        }
        fixWebViewDeadlock(getContext());
        sDeadlockCleared = true;
    }

    public void enableWebDebugging() {
        if ((getContext().getApplicationInfo().flags & 2) != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }
}
