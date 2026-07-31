package com.fyber.inneractive.sdk.web;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C4701ic;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import com.safedk.android.utils.Logger;
import java.io.ByteArrayInputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class k0 extends WebViewClient {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public j e;

    public k0(j jVar, boolean z, int i, int i2, int i3) {
        this.e = jVar;
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/k0;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.p, webView, str);
        safedk_k0_onLoadResource_5e4c7aec67db305f1f538b12d57d1270(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        IAlog.e("onPageFinished - url: %s", str);
        j jVar = this.e;
        if (jVar != null) {
            jVar.a(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/k0;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.p, webView, str);
        safedk_k0_onPageStarted_55e13a21f09af3e6fa96da754e574b55(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/k0;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.p, webView, i, str, str2);
        safedk_k0_onReceivedError_b22b6879bfac1bb0412f4ab0db7dbb4c(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        IAlog.a("onWebViewRenderProcessGone called for web view! %s", webView);
        if (webView != null) {
            com.fyber.inneractive.sdk.util.v.a(webView);
            webView.destroy();
        }
        j jVar = this.e;
        if (jVar == null) {
            return true;
        }
        jVar.a();
        return true;
    }

    public void safedk_k0_onLoadResource_5e4c7aec67db305f1f538b12d57d1270(WebView p0, String p1) {
        super.onLoadResource(p0, p1);
        IAlog.e("Resources to load: %s", p1);
        IAlog.d("%s %s", "RESOURCES", p1);
        j jVar = this.e;
        if (jVar != null) {
            i iVar = (i) jVar;
            if (TextUtils.isEmpty(p1) || !p1.startsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.v) || com.fyber.inneractive.sdk.util.s.a()) {
                return;
            }
            IAlog.a("%s Found a portential unsecure resource url: %s", IAlog.a(iVar), p1);
        }
    }

    public void safedk_k0_onPageStarted_55e13a21f09af3e6fa96da754e574b55(WebView p0, String p1, Bitmap p2) {
        super.onPageStarted(p0, p1, p2);
        IAlog.e("onPageStarted - url: %s", p1);
    }

    public WebResourceResponse safedk_k0_shouldInterceptRequest_d2b0cda7f0212217cff9d9ea52019c55(WebView p0, WebResourceRequest p1) {
        URL url;
        HttpURLConnection httpURLConnection;
        if (this.a && p1 != null) {
            IAlog.e("shouldInterceptRequest, method = %s", p1.getMethod());
            b1 b1Var = b1.c;
            int i = this.b;
            int i2 = this.c;
            int i3 = this.d;
            b1Var.getClass();
            WebResourceResponse webResourceResponse = null;
            if (p1.getUrl() != null && p1.getUrl().getScheme() != null && p1.getUrl().getScheme().startsWith("http") && TextUtils.equals(p1.getMethod(), C4701ic.a)) {
                c1 c1Var = (c1) b1Var.a.get(new d1(p1));
                if (c1Var != null) {
                    webResourceResponse = new WebResourceResponse(c1Var.c, c1Var.d, c1Var.e, c1Var.f, c1Var.b, new ByteArrayInputStream(c1Var.a));
                } else {
                    try {
                        url = new URL(p1.getUrl().toString());
                    } catch (MalformedURLException unused) {
                        url = null;
                    }
                    if (url != null) {
                        ByteBuffer byteBuffer = (ByteBuffer) com.fyber.inneractive.sdk.util.f.b.a.poll();
                        if (byteBuffer == null) {
                            byteBuffer = ByteBuffer.allocateDirect(16384);
                        }
                        try {
                            httpURLConnection = (HttpURLConnection) url.openConnection();
                            try {
                                httpURLConnection.setRequestMethod(p1.getMethod());
                                httpURLConnection.setInstanceFollowRedirects(false);
                                b1.a(p1, httpURLConnection);
                            } catch (Throwable unused2) {
                            }
                        } catch (Throwable unused3) {
                            httpURLConnection = null;
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.setConnectTimeout(i);
                            httpURLConnection.setReadTimeout(i2);
                            c1 c1Var2 = null;
                            while (i3 > 0) {
                                try {
                                    c1Var2 = b1.a(httpURLConnection, byteBuffer);
                                } catch (SocketTimeoutException | UnknownHostException unused4) {
                                } catch (Throwable unused5) {
                                    i3 = 0;
                                }
                                if (c1Var2 != null) {
                                    break;
                                }
                                i3--;
                            }
                            if (c1Var2 != null) {
                                try {
                                    if (c1Var2.a()) {
                                        b1Var.a.put(new d1(p1), c1Var2);
                                    }
                                    WebResourceResponse webResourceResponse2 = new WebResourceResponse(c1Var2.c, c1Var2.d, c1Var2.e, c1Var2.f, c1Var2.b, new ByteArrayInputStream(c1Var2.a));
                                    DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                    com.fyber.inneractive.sdk.util.f.b.a.offer(byteBuffer);
                                    webResourceResponse = webResourceResponse2;
                                } catch (Throwable unused6) {
                                    DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                }
                            } else {
                                DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                            }
                            com.fyber.inneractive.sdk.util.f.b.a.offer(byteBuffer);
                        }
                    }
                }
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
            IAlog.e("shouldInterceptRequest did not intercept %s", p1.getUrl());
        }
        return super.shouldInterceptRequest(p0, p1);
    }

    public boolean safedk_k0_shouldOverrideUrlLoading_54382488ca1c63006c3b71a3450023e2(WebView p0, String p1) {
        super.shouldOverrideUrlLoading(p0, p1);
        j jVar = this.e;
        return jVar != null && jVar.a(p0, p1);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/k0;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.p, webView, webResourceRequest, safedk_k0_shouldInterceptRequest_d2b0cda7f0212217cff9d9ea52019c55(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/k0;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_k0_shouldOverrideUrlLoading_54382488ca1c63006c3b71a3450023e2 = safedk_k0_shouldOverrideUrlLoading_54382488ca1c63006c3b71a3450023e2(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.p, webView, str, safedk_k0_shouldOverrideUrlLoading_54382488ca1c63006c3b71a3450023e2);
        return safedk_k0_shouldOverrideUrlLoading_54382488ca1c63006c3b71a3450023e2;
    }

    public void safedk_k0_onReceivedError_b22b6879bfac1bb0412f4ab0db7dbb4c(WebView p0, int p1, String p2, String p3) {
        IAlog.e("%sError: code = %d text = %s WebView = %s", IAlog.a(this), Integer.valueOf(p1), p2, p0);
        super.onReceivedError(p0, p1, p2, p3);
        j jVar = this.e;
        if (jVar != null) {
            jVar.d();
        }
    }
}
