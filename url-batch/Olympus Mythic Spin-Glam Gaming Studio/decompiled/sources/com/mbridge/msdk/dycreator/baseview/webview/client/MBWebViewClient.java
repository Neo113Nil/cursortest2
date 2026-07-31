package com.mbridge.msdk.dycreator.baseview.webview.client;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import com.ironsource.B5;
import com.mbridge.msdk.dycreator.baseview.webview.MBWebView;
import com.mbridge.msdk.dycreator.baseview.webview.listener.WebViewEventListener;
import com.mbridge.msdk.dycreator.baseview.webview.util.MBHybridUtil;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.image.a;
import com.mbridge.msdk.foundation.same.image.b;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public class MBWebViewClient extends WebViewClient {
    private final String a = "MBWebViewClient";
    private WebViewEventListener b;

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(h.o, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        WebViewEventListener webViewEventListener = this.b;
        if (webViewEventListener != null) {
            webViewEventListener.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/dycreator/baseview/webview/client/MBWebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(h.o, webView, str);
        safedk_MBWebViewClient_onPageStarted_fb2325cdf4c6eb5d721cb94165ea03c5(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/dycreator/baseview/webview/client/MBWebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.o, webView, i, str, str2);
        safedk_MBWebViewClient_onReceivedError_d17395ac70977d5007df83bf94b569e6(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/dycreator/baseview/webview/client/MBWebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.o, webView, webResourceRequest, webResourceError);
        safedk_MBWebViewClient_onReceivedError_2eb8585443afd2ed3e4f18892f6b7c13(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        WebViewEventListener webViewEventListener = this.b;
        if (webViewEventListener != null) {
            webViewEventListener.onReceivedSslError(webView, sslErrorHandler, sslError);
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
                if (webView instanceof MBWebView) {
                    MBWebView mBWebView = (MBWebView) webView;
                    if (!mBWebView.isDestroyed()) {
                        mBWebView.destroy();
                    }
                } else {
                    webView.destroy();
                }
            } catch (Throwable th) {
                q0.b("MBWebViewClient", th.getMessage());
                return true;
            }
        }
        WebViewEventListener webViewEventListener = this.b;
        if (webViewEventListener != null) {
            webViewEventListener.onRenderProcessGone(webView);
        }
        return true;
    }

    public void safedk_MBWebViewClient_onPageStarted_fb2325cdf4c6eb5d721cb94165ea03c5(WebView p0, String p1, Bitmap p2) {
        super.onPageStarted(p0, p1, p2);
        WebViewEventListener webViewEventListener = this.b;
        if (webViewEventListener != null) {
            webViewEventListener.onPageStarted(p0, p1, p2);
        }
    }

    public void safedk_MBWebViewClient_onReceivedError_2eb8585443afd2ed3e4f18892f6b7c13(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        super.onReceivedError(p0, p1, p2);
    }

    @Nullable
    public WebResourceResponse safedk_MBWebViewClient_shouldInterceptRequest_22183f214e3ee160a47e6252f37381c6(WebView p0, String p1) {
        Bitmap b;
        try {
            if (!TextUtils.isEmpty(p1)) {
                String imageMimeType = MBHybridUtil.getImageMimeType(p1);
                if (!TextUtils.isEmpty(imageMimeType) && (b = b.a(c.n().d()).b(p1)) != null && !b.isRecycled()) {
                    return new WebResourceResponse(imageMimeType, B5.O, a.a(b));
                }
            }
        } catch (Throwable th) {
            q0.b("MBWebViewClient", th.getMessage());
        }
        return super.shouldInterceptRequest(p0, p1);
    }

    public boolean safedk_MBWebViewClient_shouldOverrideUrlLoading_2adfd40ef2c0c0873b3ab240cdac4526(WebView p0, String p1) {
        WebViewEventListener webViewEventListener = this.b;
        return webViewEventListener != null ? webViewEventListener.shouldOverrideUrlLoading(p0, p1) : super.shouldOverrideUrlLoading(p0, p1);
    }

    public void setWebViewEventListener(WebViewEventListener webViewEventListener) {
        this.b = webViewEventListener;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/dycreator/baseview/webview/client/MBWebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(h.o, webView, str, safedk_MBWebViewClient_shouldInterceptRequest_22183f214e3ee160a47e6252f37381c6(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/dycreator/baseview/webview/client/MBWebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_MBWebViewClient_shouldOverrideUrlLoading_c3ec35bddd454570e78aa39f086db1a4 = safedk_MBWebViewClient_shouldOverrideUrlLoading_c3ec35bddd454570e78aa39f086db1a4(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.o, webView, webResourceRequest, safedk_MBWebViewClient_shouldOverrideUrlLoading_c3ec35bddd454570e78aa39f086db1a4);
        return safedk_MBWebViewClient_shouldOverrideUrlLoading_c3ec35bddd454570e78aa39f086db1a4;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/dycreator/baseview/webview/client/MBWebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_MBWebViewClient_shouldOverrideUrlLoading_2adfd40ef2c0c0873b3ab240cdac4526 = safedk_MBWebViewClient_shouldOverrideUrlLoading_2adfd40ef2c0c0873b3ab240cdac4526(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.o, webView, str, safedk_MBWebViewClient_shouldOverrideUrlLoading_2adfd40ef2c0c0873b3ab240cdac4526);
        return safedk_MBWebViewClient_shouldOverrideUrlLoading_2adfd40ef2c0c0873b3ab240cdac4526;
    }

    public void safedk_MBWebViewClient_onReceivedError_d17395ac70977d5007df83bf94b569e6(WebView p0, int p1, String p2, String p3) {
        super.onReceivedError(p0, p1, p2, p3);
        WebViewEventListener webViewEventListener = this.b;
        if (webViewEventListener != null) {
            webViewEventListener.onReceivedError(p0, p1, p2, p3);
        }
    }

    public boolean safedk_MBWebViewClient_shouldOverrideUrlLoading_c3ec35bddd454570e78aa39f086db1a4(WebView p0, WebResourceRequest p1) {
        WebViewEventListener webViewEventListener = this.b;
        if (webViewEventListener != null) {
            return webViewEventListener.shouldOverrideUrlLoading(p0, p1.getUrl().toString());
        }
        return super.shouldOverrideUrlLoading(p0, p1);
    }
}
