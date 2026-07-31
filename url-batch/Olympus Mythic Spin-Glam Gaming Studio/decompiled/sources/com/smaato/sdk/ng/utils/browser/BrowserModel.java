package com.smaato.sdk.ng.utils.browser;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.safedk.android.internal.partials.SmaatoNetworkBridge;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.browser.BaseWebChromeClient;
import com.smaato.sdk.ng.utils.browser.BaseWebViewClient;

/* loaded from: classes10.dex */
class BrowserModel {
    private static final String i = "BrowserModel";
    private final BaseWebViewClient a;
    private final BaseWebChromeClient b;
    private final BrowserCookieManager c;
    private WebView d;
    private Callback e;
    private final BaseWebChromeClient.WebChromeClientCallback f;
    private String g;
    private final BaseWebViewClient.WebViewClientCallback h;

    public interface Callback {
        void onGeneralError(int i, String str, String str2);

        @TargetApi(23)
        void onHttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

        void onPageNavigationStackChanged(boolean z, boolean z2);

        void onProgressChanged(int i);

        @TargetApi(26)
        void onRenderProcessGone();

        void onUrlLoadingStarted(String str);

        boolean shouldOverrideUrlLoading(String str);
    }

    class a implements BaseWebChromeClient.WebChromeClientCallback {
        a() {
        }

        @Override // com.smaato.sdk.ng.utils.browser.BaseWebChromeClient.WebChromeClientCallback
        public void onProgressChanged(int i) {
            Callback callback = BrowserModel.this.e;
            if (callback != null) {
                callback.onProgressChanged(i);
                BrowserModel browserModel = BrowserModel.this;
                WebView webView = browserModel.d;
                if (webView != null) {
                    browserModel.e.onPageNavigationStackChanged(webView.canGoBack(), BrowserModel.this.d.canGoForward());
                }
            }
        }
    }

    class b extends WebViewClientCallbackAdapter {
        b() {
        }

        @Override // com.smaato.sdk.ng.utils.browser.WebViewClientCallbackAdapter, com.smaato.sdk.ng.utils.browser.BaseWebViewClient.WebViewClientCallback
        public void onGeneralError(int i, String str, String str2) {
            Logger.e(BrowserModel.i, "onGeneralError. Errorcode " + i + " Description: " + str);
            Callback callback = BrowserModel.this.e;
            if (callback != null) {
                callback.onGeneralError(i, str, str2);
            }
        }

        @Override // com.smaato.sdk.ng.utils.browser.WebViewClientCallbackAdapter, com.smaato.sdk.ng.utils.browser.BaseWebViewClient.WebViewClientCallback
        public void onHttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            Logger.e(BrowserModel.i, "onHttpError: " + webResourceResponse.toString());
            Callback callback = BrowserModel.this.e;
            if (callback != null) {
                callback.onHttpError(webResourceRequest, webResourceResponse);
            }
        }

        @Override // com.smaato.sdk.ng.utils.browser.WebViewClientCallbackAdapter, com.smaato.sdk.ng.utils.browser.BaseWebViewClient.WebViewClientCallback
        public void onPageStartedLoading(String str) {
            BrowserModel browserModel = BrowserModel.this;
            browserModel.g = str;
            Callback callback = browserModel.e;
            if (callback != null) {
                callback.onUrlLoadingStarted(str);
            }
        }

        @Override // com.smaato.sdk.ng.utils.browser.WebViewClientCallbackAdapter, com.smaato.sdk.ng.utils.browser.BaseWebViewClient.WebViewClientCallback
        public void onRenderProcessGone() {
            Logger.e(BrowserModel.i, "WebView's render process has exited");
            Callback callback = BrowserModel.this.e;
            if (callback != null) {
                callback.onRenderProcessGone();
            }
        }

        @Override // com.smaato.sdk.ng.utils.browser.WebViewClientCallbackAdapter, com.smaato.sdk.ng.utils.browser.BaseWebViewClient.WebViewClientCallback
        public boolean shouldOverrideUrlLoading(String str) {
            Callback callback = BrowserModel.this.e;
            if (callback != null) {
                return callback.shouldOverrideUrlLoading(str);
            }
            return false;
        }
    }

    BrowserModel(BaseWebViewClient baseWebViewClient, BaseWebChromeClient baseWebChromeClient, BrowserCookieManager browserCookieManager) {
        a aVar = new a();
        this.f = aVar;
        b bVar = new b();
        this.h = bVar;
        if (baseWebViewClient == null) {
            throw new NullPointerException("BrowserModel: webViewClient can not be null");
        }
        this.a = baseWebViewClient;
        if (baseWebChromeClient == null) {
            throw new NullPointerException("BrowserModel: webChromeClient can not be null");
        }
        this.b = baseWebChromeClient;
        if (browserCookieManager == null) {
            throw new NullPointerException("BrowserModel: cookieManager can not be null");
        }
        this.c = browserCookieManager;
        baseWebViewClient.setWebViewClientCallback(bVar);
        baseWebChromeClient.setWebChromeClientCallback(aVar);
    }

    public void a(WebView webView) {
        if (webView == null) {
            throw new NullPointerException("BrowserModel: Parameter webView cannot be null");
        }
        this.d = webView;
        webView.setWebViewClient(this.a);
        webView.setWebChromeClient(this.b);
        this.c.setupCookiePolicy(webView);
    }

    public void b() {
        WebView webView = this.d;
        if (webView != null) {
            webView.goBack();
        }
    }

    public void c() {
        WebView webView = this.d;
        if (webView != null) {
            webView.goForward();
        }
    }

    public void d() {
        WebView webView = this.d;
        if (webView != null) {
            webView.onPause();
        }
    }

    public void e() {
        WebView webView = this.d;
        if (webView != null) {
            webView.reload();
        }
    }

    public void f() {
        WebView webView = this.d;
        if (webView != null) {
            webView.onResume();
        }
    }

    public void a(Callback callback) {
        this.e = callback;
    }

    public void a(String str) {
        if (str != null) {
            this.g = str;
            WebView webView = this.d;
            if (webView != null) {
                SmaatoNetworkBridge.webviewLoadUrl(webView, str);
            }
        }
        this.g = str;
    }

    public String a() {
        if (this.g == null) {
            Logger.e(i, "Internal error: loadUrl() was not called");
        }
        return this.g;
    }
}
