package com.mbridge.msdk.config.dynamic.baseview.webview.client;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.config.dynamic.baseview.webview.ComponentWebView;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* compiled from: MBWebViewClient.java */
/* loaded from: classes11.dex */
public class b extends WebViewClient {
    private final String a = "MBWebViewClient";
    private com.mbridge.msdk.config.dynamic.baseview.webview.listener.a b;

    public void a(com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar) {
        this.b = aVar;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(h.o, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.b;
        if (aVar != null) {
            aVar.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/config/dynamic/baseview/webview/client/b;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(h.o, webView, str);
        safedk_b_onPageStarted_97d39c13335afeee9ac7531ad164782e(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/config/dynamic/baseview/webview/client/b;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.o, webView, i, str, str2);
        safedk_b_onReceivedError_656102890709f0f3ebbcd0a3e947aa99(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/config/dynamic/baseview/webview/client/b;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.o, webView, webResourceRequest, webResourceError);
        safedk_b_onReceivedError_b711c2e1ccb3e0098c4bac8c445ee993(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.b;
        if (aVar != null) {
            aVar.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        q0.b("MBWebViewClient", "WebView called onRenderProcessGone");
        if (webView != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) webView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                if (webView instanceof ComponentWebView) {
                    ComponentWebView componentWebView = (ComponentWebView) webView;
                    if (!componentWebView.isDestroyed()) {
                        componentWebView.destroy();
                    }
                } else {
                    webView.destroy();
                }
            } catch (Throwable th) {
                q0.b("MBWebViewClient", th.getMessage());
                return true;
            }
        }
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.b;
        if (aVar != null) {
            aVar.onRenderProcessGone(webView);
        }
        return true;
    }

    public void safedk_b_onPageStarted_97d39c13335afeee9ac7531ad164782e(WebView p0, String p1, Bitmap p2) {
        super.onPageStarted(p0, p1, p2);
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.b;
        if (aVar != null) {
            aVar.onPageStarted(p0, p1, p2);
        }
    }

    public void safedk_b_onReceivedError_b711c2e1ccb3e0098c4bac8c445ee993(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        super.onReceivedError(p0, p1, p2);
    }

    public boolean safedk_b_shouldOverrideUrlLoading_2b95b7b644d607f8d0738201379b4d99(WebView p0, String p1) {
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.b;
        return aVar != null ? aVar.shouldOverrideUrlLoading(p0, p1) : super.shouldOverrideUrlLoading(p0, p1);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.o, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/config/dynamic/baseview/webview/client/b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_b_shouldOverrideUrlLoading_679281cc165927fd5a2cf89f070c4b44 = safedk_b_shouldOverrideUrlLoading_679281cc165927fd5a2cf89f070c4b44(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.o, webView, webResourceRequest, safedk_b_shouldOverrideUrlLoading_679281cc165927fd5a2cf89f070c4b44);
        return safedk_b_shouldOverrideUrlLoading_679281cc165927fd5a2cf89f070c4b44;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/config/dynamic/baseview/webview/client/b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_b_shouldOverrideUrlLoading_2b95b7b644d607f8d0738201379b4d99 = safedk_b_shouldOverrideUrlLoading_2b95b7b644d607f8d0738201379b4d99(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.o, webView, str, safedk_b_shouldOverrideUrlLoading_2b95b7b644d607f8d0738201379b4d99);
        return safedk_b_shouldOverrideUrlLoading_2b95b7b644d607f8d0738201379b4d99;
    }

    public void safedk_b_onReceivedError_656102890709f0f3ebbcd0a3e947aa99(WebView p0, int p1, String p2, String p3) {
        super.onReceivedError(p0, p1, p2, p3);
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.b;
        if (aVar != null) {
            aVar.onReceivedError(p0, p1, p2, p3);
        }
    }

    public boolean safedk_b_shouldOverrideUrlLoading_679281cc165927fd5a2cf89f070c4b44(WebView p0, WebResourceRequest p1) {
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.b;
        if (aVar != null) {
            return aVar.shouldOverrideUrlLoading(p0, p1.getUrl().toString());
        }
        return super.shouldOverrideUrlLoading(p0, p1);
    }
}
