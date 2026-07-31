package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: CommonWebViewClient.java */
/* loaded from: classes6.dex */
public class b extends WebViewClient {
    private CopyOnWriteArrayList<WebViewClient> a = new CopyOnWriteArrayList<>();

    public void a(WebViewClient webViewClient) {
        this.a.add(webViewClient);
    }

    public void b(WebViewClient webViewClient) {
        this.a.remove(webViewClient);
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        Iterator<WebViewClient> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().doUpdateVisitedHistory(webView, str, z);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        Iterator<WebViewClient> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().onFormResubmission(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/b;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(h.o, webView, str);
        safedk_b_onLoadResource_0782066d0b03b20ccd60b835604ecc29(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Iterator<WebViewClient> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/b;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(h.o, webView, str);
        safedk_b_onPageStarted_ce20aafdba96d8c7dd0af6c26e0cca0a(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/b;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.o, webView, i, str, str2);
        safedk_b_onReceivedError_35a5c94038a1c34ac9b229888abe1d51(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/b;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.o, webView, webResourceRequest, webResourceError);
        safedk_b_onReceivedError_0d6fdfef127a0f6f1e798460ee3106ba(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        Iterator<WebViewClient> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        Iterator<WebViewClient> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Iterator<WebViewClient> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) webView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                if (webView instanceof WindVaneWebView) {
                    ((WindVaneWebView) webView).release();
                } else {
                    webView.destroy();
                }
            } catch (Throwable th) {
                q0.b("CommonWebViewClient", th.getMessage());
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        try {
            if (Build.VERSION.SDK_INT >= 27) {
                Iterator<WebViewClient> it = this.a.iterator();
                while (it.hasNext()) {
                    it.next().onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
                }
            }
        } catch (Exception e) {
            q0.b("CommonWebViewClient", e.getMessage());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f, float f2) {
        Iterator<WebViewClient> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().onScaleChanged(webView, f, f2);
        }
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        Iterator<WebViewClient> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().onTooManyRedirects(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        Iterator<WebViewClient> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    public void safedk_b_onLoadResource_0782066d0b03b20ccd60b835604ecc29(WebView p0, String p1) {
        Iterator<WebViewClient> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().onLoadResource(p0, p1);
        }
    }

    public void safedk_b_onPageStarted_ce20aafdba96d8c7dd0af6c26e0cca0a(WebView p0, String p1, Bitmap p2) {
        Iterator<WebViewClient> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().onPageStarted(p0, p1, p2);
        }
    }

    @Deprecated
    public void safedk_b_onReceivedError_35a5c94038a1c34ac9b229888abe1d51(WebView p0, int p1, String p2, String p3) {
        Iterator<WebViewClient> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedError(p0, p1, p2, p3);
        }
    }

    @Deprecated
    public WebResourceResponse safedk_b_shouldInterceptRequest_59e16d28155978e1d5717688fcd22b49(WebView p0, String p1) {
        Iterator<WebViewClient> it = this.a.iterator();
        WebResourceResponse webResourceResponse = null;
        while (it.hasNext()) {
            webResourceResponse = it.next().shouldInterceptRequest(p0, p1);
        }
        return webResourceResponse;
    }

    public boolean safedk_b_shouldOverrideUrlLoading_1d89a49476ba953906baff95e3f16175(WebView p0, String p1) {
        Iterator<WebViewClient> it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            boolean shouldOverrideUrlLoading = it.next().shouldOverrideUrlLoading(p0, p1);
            if (shouldOverrideUrlLoading) {
                z = shouldOverrideUrlLoading;
            }
        }
        return z;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/b;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.o, webView, webResourceRequest, safedk_b_shouldInterceptRequest_e2d069ec271ea2797a5b11ba8077c8e2(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/b;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(h.o, webView, str, safedk_b_shouldInterceptRequest_59e16d28155978e1d5717688fcd22b49(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        Iterator<WebViewClient> it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z = it.next().shouldOverrideKeyEvent(webView, keyEvent);
        }
        return z;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_b_shouldOverrideUrlLoading_4a315c1cf8cfa4be6a119ea0e3d3cb37 = safedk_b_shouldOverrideUrlLoading_4a315c1cf8cfa4be6a119ea0e3d3cb37(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.o, webView, webResourceRequest, safedk_b_shouldOverrideUrlLoading_4a315c1cf8cfa4be6a119ea0e3d3cb37);
        return safedk_b_shouldOverrideUrlLoading_4a315c1cf8cfa4be6a119ea0e3d3cb37;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_b_shouldOverrideUrlLoading_1d89a49476ba953906baff95e3f16175 = safedk_b_shouldOverrideUrlLoading_1d89a49476ba953906baff95e3f16175(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.o, webView, str, safedk_b_shouldOverrideUrlLoading_1d89a49476ba953906baff95e3f16175);
        return safedk_b_shouldOverrideUrlLoading_1d89a49476ba953906baff95e3f16175;
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        try {
            Iterator<WebViewClient> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().onPageCommitVisible(webView, str);
            }
        } catch (Exception e) {
            q0.b("CommonWebViewClient", e.getMessage());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        try {
            Iterator<WebViewClient> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().onReceivedClientCertRequest(webView, clientCertRequest);
            }
        } catch (Exception e) {
            q0.b("CommonWebViewClient", e.getMessage());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        try {
            Iterator<WebViewClient> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
        } catch (Exception e) {
            q0.b("CommonWebViewClient", e.getMessage());
        }
    }

    public void safedk_b_onReceivedError_0d6fdfef127a0f6f1e798460ee3106ba(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        try {
            Iterator<WebViewClient> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().onReceivedError(p0, p1, p2);
            }
        } catch (Exception e) {
            q0.b("CommonWebViewClient", e.getMessage());
        }
    }

    public WebResourceResponse safedk_b_shouldInterceptRequest_e2d069ec271ea2797a5b11ba8077c8e2(WebView p0, WebResourceRequest p1) {
        WebResourceResponse webResourceResponse = null;
        try {
            Iterator<WebViewClient> it = this.a.iterator();
            while (it.hasNext()) {
                webResourceResponse = it.next().shouldInterceptRequest(p0, p1);
            }
        } catch (Exception e) {
            q0.b("CommonWebViewClient", e.getMessage());
        }
        return webResourceResponse;
    }

    public boolean safedk_b_shouldOverrideUrlLoading_4a315c1cf8cfa4be6a119ea0e3d3cb37(WebView p0, WebResourceRequest p1) {
        boolean z = false;
        try {
            Iterator<WebViewClient> it = this.a.iterator();
            while (it.hasNext()) {
                boolean shouldOverrideUrlLoading = it.next().shouldOverrideUrlLoading(p0, p1);
                if (shouldOverrideUrlLoading) {
                    z = shouldOverrideUrlLoading;
                }
            }
        } catch (Exception e) {
            q0.b("CommonWebViewClient", e.getMessage());
        }
        return z;
    }
}
