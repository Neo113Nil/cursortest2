package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.lang.reflect.Method;

/* loaded from: classes13.dex */
public class BrowserView extends LinearLayout {
    private CampaignEx a;
    private String b;
    private e c;
    private WebView d;
    private ProgressBar e;
    private ToolBar f;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (BrowserView.this.d != null) {
                BrowserView.this.d.stopLoading();
            }
            String str = (String) view.getTag();
            boolean z = false;
            if (TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD)) {
                BrowserView.this.f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD).setEnabled(true);
                if (BrowserView.this.d != null && BrowserView.this.d.canGoBack()) {
                    BrowserView.this.d.goBack();
                }
                View item = BrowserView.this.f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD);
                if (BrowserView.this.d != null && BrowserView.this.d.canGoBack()) {
                    z = true;
                }
                item.setEnabled(z);
                return;
            }
            if (TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD)) {
                BrowserView.this.f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(true);
                if (BrowserView.this.d != null && BrowserView.this.d.canGoForward()) {
                    BrowserView.this.d.goForward();
                }
                View item2 = BrowserView.this.f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD);
                if (BrowserView.this.d != null && BrowserView.this.d.canGoForward()) {
                    z = true;
                }
                item2.setEnabled(z);
                return;
            }
            if (!TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.REFRESH)) {
                if (!TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.EXITS) || BrowserView.this.c == null) {
                    return;
                }
                BrowserView.this.c.a();
                return;
            }
            BrowserView.this.f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(BrowserView.this.d != null && BrowserView.this.d.canGoBack());
            View item3 = BrowserView.this.f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD);
            if (BrowserView.this.d != null && BrowserView.this.d.canGoForward()) {
                z = true;
            }
            item3.setEnabled(z);
            if (BrowserView.this.d != null) {
                MintegralNetworkBridge.webviewLoadUrl(BrowserView.this.d, BrowserView.this.b);
            }
        }
    }

    class b extends WebViewClient {
        b() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/foundation/webview/BrowserView$b;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
            CreativeInfoManager.onResourceLoaded(h.o, webView, str);
            safedk_BrowserView$b_onLoadResource_ebf16ae792b4beb708ff1eebaf51488c(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (BrowserView.this.c != null) {
                BrowserView.this.c.onPageFinished(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/foundation/webview/BrowserView$b;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
            BrandSafetyUtils.onWebViewPageStarted(h.o, webView, str);
            safedk_BrowserView$b_onPageStarted_1b9e6df702946d1cfb626db890e1d6b0(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/foundation/webview/BrowserView$b;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
            BrandSafetyUtils.onWebViewReceivedError(h.o, webView, i, str, str2);
            safedk_BrowserView$b_onReceivedError_9d794158f2618356f8049cd3c88afcbf(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView != null) {
                try {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    webView.destroy();
                } catch (Throwable th) {
                    q0.b("BrowserView", th.getMessage());
                    return true;
                }
            }
            if (BrowserView.this.c != null) {
                BrowserView.this.c.a();
            }
            return true;
        }

        public void safedk_BrowserView$b_onLoadResource_ebf16ae792b4beb708ff1eebaf51488c(WebView p0, String p1) {
            super.onLoadResource(p0, p1);
            q0.c("BrowserView", "onLoadResource 开始! = " + p1);
            if (BrowserView.this.c != null) {
                BrowserView.this.c.a(p0, p1);
            }
        }

        public void safedk_BrowserView$b_onPageStarted_1b9e6df702946d1cfb626db890e1d6b0(WebView p0, String p1, Bitmap p2) {
            q0.c("BrowserView", "开始! = " + p1);
            BrowserView.this.b = p1;
            if (BrowserView.this.c != null) {
                BrowserView.this.c.onPageStarted(p0, p1, p2);
            }
            BrowserView.this.e.setVisible(true);
            BrowserView.this.e.setProgressState(5);
        }

        public void safedk_BrowserView$b_onReceivedError_9d794158f2618356f8049cd3c88afcbf(WebView p0, int p1, String p2, String p3) {
            if (BrowserView.this.c != null) {
                BrowserView.this.c.onReceivedError(p0, p1, p2, p3);
            }
        }

        public boolean safedk_BrowserView$b_shouldOverrideUrlLoading_433e38c44449c3cff3a8e0aa3ac29cf8(WebView p0, String p1) {
            q0.c("BrowserView", "js大跳! = " + p1);
            BrowserView.this.f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(true);
            BrowserView.this.f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD).setEnabled(false);
            if (BrowserView.this.c != null) {
                return BrowserView.this.c.shouldOverrideUrlLoading(p0, p1);
            }
            return false;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(h.o, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/foundation/webview/BrowserView$b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean safedk_BrowserView$b_shouldOverrideUrlLoading_433e38c44449c3cff3a8e0aa3ac29cf8 = safedk_BrowserView$b_shouldOverrideUrlLoading_433e38c44449c3cff3a8e0aa3ac29cf8(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(h.o, webView, str, safedk_BrowserView$b_shouldOverrideUrlLoading_433e38c44449c3cff3a8e0aa3ac29cf8);
            return safedk_BrowserView$b_shouldOverrideUrlLoading_433e38c44449c3cff3a8e0aa3ac29cf8;
        }
    }

    class c extends WebChromeClient {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BrowserView.this.e.setVisible(false);
            }
        }

        c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/foundation/webview/BrowserView$c;->onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z");
            boolean safedk_BrowserView$c_onJsPrompt_5212bea387ee1bfaf68f4b3927947cf5 = safedk_BrowserView$c_onJsPrompt_5212bea387ee1bfaf68f4b3927947cf5(webView, str, str2, str3, jsPromptResult);
            BrandSafetyUtils.onJsPrompt(h.o, webView, str, str2, safedk_BrowserView$c_onJsPrompt_5212bea387ee1bfaf68f4b3927947cf5);
            return safedk_BrowserView$c_onJsPrompt_5212bea387ee1bfaf68f4b3927947cf5;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (i == 100) {
                BrowserView.this.e.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }

        public boolean safedk_BrowserView$c_onJsPrompt_5212bea387ee1bfaf68f4b3927947cf5(WebView p0, String p1, String p2, String p3, JsPromptResult p4) {
            return true;
        }
    }

    class d extends WebChromeClient {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BrowserView.this.e.setVisible(false);
            }
        }

        d() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (i == 100) {
                BrowserView.this.e.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }
    }

    public interface e {
        void a();

        void a(WebView webView, String str);

        void onPageFinished(WebView webView, String str);

        void onPageStarted(WebView webView, String str, Bitmap bitmap);

        void onReceivedError(WebView webView, int i, String str, String str2);

        boolean shouldOverrideUrlLoading(WebView webView, String str);
    }

    public BrowserView(Context context, CampaignEx campaignEx) {
        super(context);
        this.a = campaignEx;
        init();
    }

    private WebView getWebView() {
        WebView webView = new WebView(getContext());
        try {
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setCacheMode(-1);
            settings.setAllowFileAccess(true);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
            settings.setDatabaseEnabled(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    settings.setSafeBrowsingEnabled(false);
                } catch (Throwable th) {
                    q0.b("BrowserView", th.getMessage());
                }
            }
            settings.setMediaPlaybackRequiresUserGesture(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
            try {
                settings.setMixedContentMode(0);
            } catch (Exception e2) {
                q0.b("BrowserView", e2.getMessage());
            }
            settings.setDatabaseEnabled(true);
            String path = getContext().getDir("database", 0).getPath();
            settings.setDatabasePath(path);
            settings.setGeolocationEnabled(true);
            settings.setGeolocationDatabasePath(path);
            try {
                Method declaredMethod = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(settings, Boolean.FALSE);
            } catch (Exception e3) {
                q0.b("BrowserView", e3.getMessage());
            }
        } catch (Throwable th2) {
            q0.b("BrowserView", th2.getMessage());
        }
        webView.setDownloadListener(new com.mbridge.msdk.foundation.same.webview.a(this.a));
        webView.setWebViewClient(new b());
        MintegralNetworkBridge.webviewSetWebChromeClient(webView, m0.s() <= 10 ? new c() : new d());
        return webView;
    }

    public void destroy() {
        try {
            WebView webView = this.d;
            if (webView != null) {
                webView.setWebViewClient(null);
                this.d.destroy();
                this.d = null;
                removeAllViews();
            }
        } catch (Throwable th) {
            q0.b("BrowserView", th.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        a();
        this.e.initResource(true);
        this.f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(false);
        this.f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD).setEnabled(false);
        this.f.setOnItemClickListener(new a());
    }

    public void loadUrl(String str) {
        WebView webView = this.d;
        if (webView != null) {
            MintegralNetworkBridge.webviewLoadUrl(webView, str);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setListener(e eVar) {
        this.c = eVar;
    }

    public void setWebView(WebView webView) {
        this.d = webView;
    }

    private void a() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.e = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        try {
            if (this.d == null) {
                this.d = getWebView();
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            this.d.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            q0.b("BrowserView", "webview is error", th);
        }
        this.f = new ToolBar(getContext());
        this.f.setLayoutParams(new LinearLayout.LayoutParams(-1, v0.a(getContext(), 40.0f)));
        this.f.setBackgroundColor(-1);
        addView(this.e);
        WebView webView = this.d;
        if (webView != null) {
            addView(webView);
        }
        addView(this.f);
    }

    public BrowserView(Context context) {
        super(context);
        init();
    }

    public BrowserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }
}
