package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐝ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0777 extends WebViewClient implements InterfaceC0488, InterfaceC1077 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final WebViewClient f1822;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final WebViewClient f1823;

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f1821 = StringFog.decrypt("lydncP93dkWsK2BI4lZkZa8wZFL5YA==\n", "wEIFJpYSAQY=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f1820 = StringFog.decrypt("XFIHeuzVUgpeUyRI/OJLH0x0H0T72lY=\n", "OzdzLZ60Ino=\n");

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f1819 = StringFog.decrypt("DWE1FIhhLL88bSQ3qVoguARw\n", "agRBQOo2Sd0=\n");

    public C0777(WebViewClient webViewClient, WebViewClient webViewClient2) {
        this.f1823 = webViewClient;
        this.f1822 = webViewClient2;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        try {
            this.f1822.doUpdateVisitedHistory(webView, str, z);
        } catch (Throwable th) {
            AbstractC0577.m4068(f1821, StringFog.decrypt("pu/RcPYRyEnD8Pd9yFjSU4bzxm2kVc5yk/nCa+FnyFSK6cZ7zFjSU4zv2g==\n", "452jH4QxoSc=\n"), th, false);
        }
        WebViewClient webViewClient = this.f1823;
        if (webViewClient != null) {
            webViewClient.doUpdateVisitedHistory(webView, str, z);
        } else {
            super.doUpdateVisitedHistory(webView, str, z);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        try {
            this.f1822.onFormResubmission(webView, message, message2);
        } catch (Throwable th) {
            AbstractC0577.m4068(f1821, StringFog.decrypt("0QPK/u+3ED60HOzz0f4KJPEf3eO9+BcW+wPVw/jkDDL5GMvi9PgX\n", "lHG4kZ2XeVA=\n"), th, false);
        }
        try {
            WebViewClient webViewClient = this.f1823;
            if (webViewClient != null) {
                webViewClient.onFormResubmission(webView, message, message2);
            } else {
                super.onFormResubmission(webView, message, message2);
            }
        } catch (Error e) {
            AbstractC0577.m4068(f1821, StringFog.decrypt("FNoNYh+voT9xxxFLAv2lAzTbCm8A5rsiOMcR\n", "Uah/DW2PyFE=\n"), (Throwable) e, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/ᐝ;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.f, webView, str);
        m4167safedk__onLoadResource_d7e3d2c148b5d71dea9ba7b895ca8fe8(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        try {
            this.f1822.onPageCommitVisible(webView, str);
        } catch (Throwable th) {
            AbstractC0577.m4068(f1821, StringFog.decrypt("b1m6CoCs2ygKRpwHvuXBMk9FrRfS49wWS0ytNobtwDJPTw==\n", "KivIZfKMskY=\n"), th, false);
        }
        WebViewClient webViewClient = this.f1823;
        if (webViewClient != null) {
            webViewClient.onPageCommitVisible(webView, str);
        } else {
            super.onPageCommitVisible(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        try {
            this.f1822.onPageFinished(webView, str);
        } catch (Throwable th) {
            AbstractC0577.m4068(f1821, StringFog.decrypt("EwcXsRH1zdd2GDG8L7zXzTMbAKxDusrpNxIAmAq7zco+EAE=\n", "VnVl3mPVpLk=\n"), th, false);
        }
        WebViewClient webViewClient = this.f1823;
        if (webViewClient != null) {
            webViewClient.onPageFinished(webView, str);
        } else {
            super.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/ᐝ;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.f, webView, str);
        m4168safedk__onPageStarted_57b35ef70e7737a6f66a38da1a6563d9(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        try {
            this.f1822.onReceivedClientCertRequest(webView, clientCertRequest);
        } catch (Throwable th) {
            AbstractC0577.m4068(f1821, StringFog.decrypt("BjLS0SrkFuRjLfTcFK0M/iYuxcx4qxHYJiPF1y6hG8kvKcXQLIca+DcSxc8toQz+\n", "Q0CgvljEf4o=\n"), th, false);
        }
        try {
            WebViewClient webViewClient = this.f1823;
            if (webViewClient != null) {
                webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
            } else {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
            }
        } catch (Throwable th2) {
            AbstractC0577.m4068(f1821, StringFog.decrypt("CNWBEoB3xXhtxJIRnj7CcW3IgRSVPsI2IsmhGJEyxWAow7ARmzLCYg7CgQmgMt1jKNSH\n", "TafzffJXrBY=\n"), th2, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/ᐝ;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.f, webView, i, str, str2);
        m4169safedk__onReceivedError_4854b021cc82804811639f7ca426ad79(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/ᐝ;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.f, webView, webResourceRequest, webResourceError);
        m4170safedk__onReceivedError_9a2c8e1afa41576be62e69bae1d6915c(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        try {
            this.f1822.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } catch (Throwable th) {
            AbstractC0577.m4068(f1821, StringFog.decrypt("znO7qogyc/KrbJ2ntntp6O5vrLfafXTO7mKsrIx3ftT/dbmEj2Zyzu5wvKCJZg==\n", "iwHJxfoSGpw=\n"), th, false);
        }
        WebViewClient webViewClient = this.f1823;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        try {
            this.f1822.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } catch (Throwable th) {
            AbstractC0577.m4068(f1821, StringFog.decrypt("SYAnnnTj5cgsnwGTSqr/0mmcMIMmrOL0aZEwmHCm6O54hiW0dLHj1A==\n", "DPJV8QbDjKY=\n"), th, false);
        }
        WebViewClient webViewClient = this.f1823;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } else {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        try {
            this.f1822.onReceivedLoginRequest(webView, str, str2, str3);
        } catch (Throwable th) {
            AbstractC0577.m4068(f1821, StringFog.decrypt("MWpko4FnAm1UdUKuvy4YdxF2c77TKAVREXtzpYUiD08bf3+ioSIadhFrYg==\n", "dBgWzPNHawM=\n"), th, false);
        }
        WebViewClient webViewClient = this.f1823;
        if (webViewClient != null) {
            webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
        } else {
            super.onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        try {
            this.f1822.onReceivedSslError(webView, sslErrorHandler, sslError);
        } catch (Throwable th) {
            AbstractC0577.m4068(f1821, StringFog.decrypt("i1QuGPT/KXfuSwgVyrYzbatIOQWmsC5Lq0U5HvC6JEq9ShkF9LAy\n", "ziZcd4bfQBk=\n"), th, false);
        }
        WebViewClient webViewClient = this.f1823;
        if (webViewClient != null) {
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean onRenderProcessGone;
        try {
            this.f1822.onRenderProcessGone(webView, renderProcessGoneDetail);
        } catch (Throwable th) {
            AbstractC0577.m4068(f1821, StringFog.decrypt("4tCB2pYEZGOHz6fXqE1+ecLMlsfES2NfwsyX0JZ0f2LEx4DGo0tjaA==\n", "p6LzteQkDQ0=\n"), th, false);
        }
        WebViewClient webViewClient = this.f1823;
        if (webViewClient == null) {
            return true;
        }
        onRenderProcessGone = webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
        return onRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f2) {
        try {
            this.f1822.onScaleChanged(webView, f, f2);
        } catch (Throwable th) {
            AbstractC0577.m4068(f1821, StringFog.decrypt("EaYJrgepYBd0uS+jOeB6DTG6HrNV5mcqN7UXpDbhaBczsR8=\n", "VNR7wXWJCXk=\n"), th, false);
        }
        WebViewClient webViewClient = this.f1823;
        if (webViewClient != null) {
            webViewClient.onScaleChanged(webView, f, f2);
        } else {
            super.onScaleChanged(webView, f, f2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        try {
            this.f1822.onTooManyRedirects(webView, message, message2);
        } catch (Throwable th) {
            AbstractC0577.m4068(f1821, StringFog.decrypt("Wi7qUd5jFgI/Mcxc4CoMGHoy/UyMLBE4cDPVX8I6LQl7NepbzzcM\n", "H1yYPqxDf2w=\n"), th, false);
        }
        WebViewClient webViewClient = this.f1823;
        if (webViewClient != null) {
            webViewClient.onTooManyRedirects(webView, message, message2);
        } else {
            super.onTooManyRedirects(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        try {
            this.f1822.onUnhandledKeyEvent(webView, keyEvent);
        } catch (Throwable th) {
            AbstractC0577.m4068(f1821, StringFog.decrypt("9wat1FUNhXqSGYvZa0SfYNcauskHQoJB3By+1UNBiXD5Eab+UUiCYA==\n", "snTfuyct7BQ=\n"), th, false);
        }
        WebViewClient webViewClient = this.f1823;
        if (webViewClient != null) {
            webViewClient.onUnhandledKeyEvent(webView, keyEvent);
        } else {
            super.onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    /* renamed from: safedk_ᐝ_onLoadResource_d7e3d2c148b5d71dea9ba7b895ca8fe8, reason: contains not printable characters */
    public void m4167safedk__onLoadResource_d7e3d2c148b5d71dea9ba7b895ca8fe8(WebView p0, String p1) {
        try {
            this.f1822.onLoadResource(p0, p1);
        } catch (Throwable th) {
            AbstractC0577.m4068(f1821, StringFog.decrypt("thB9qZnkxx7TD1ukp63dBJYMarTLq8A8nANrlI63wQWBAWo=\n", "82IPxuvErnA=\n"), th, false);
        }
        WebViewClient webViewClient = this.f1823;
        if (webViewClient != null) {
            webViewClient.onLoadResource(p0, p1);
        } else {
            super.onLoadResource(p0, p1);
        }
    }

    /* renamed from: safedk_ᐝ_onPageStarted_57b35ef70e7737a6f66a38da1a6563d9, reason: contains not printable characters */
    public void m4168safedk__onPageStarted_57b35ef70e7737a6f66a38da1a6563d9(WebView p0, String p1, Bitmap p2) {
        try {
            this.f1822.onPageStarted(p0, p1, p2);
        } catch (Throwable th) {
            AbstractC0577.m4068(f1821, StringFog.decrypt("Nog/iiF0s81TlxmHHz2p1xaUKJdzO7TzEp0otic1qNcWng==\n", "c/pN5VNU2qM=\n"), th, false);
        }
        WebViewClient webViewClient = this.f1823;
        if (webViewClient != null) {
            webViewClient.onPageStarted(p0, p1, p2);
        } else {
            super.onPageStarted(p0, p1, p2);
        }
    }

    /* renamed from: safedk_ᐝ_onReceivedError_4854b021cc82804811639f7ca426ad79, reason: contains not printable characters */
    public void m4169safedk__onReceivedError_4854b021cc82804811639f7ca426ad79(WebView p0, int p1, String p2, String p3) {
        try {
            this.f1822.onReceivedError(p0, p1, p2, p3);
        } catch (Throwable th) {
            AbstractC0577.m4068(f1821, StringFog.decrypt("8edCDj3EcNyU+GQDA41qxtH7VRNvi3fg0fZVCDmBfffG518T\n", "tJUwYU/kGbI=\n"), th, false);
        }
        WebViewClient webViewClient = this.f1823;
        if (webViewClient != null) {
            webViewClient.onReceivedError(p0, p1, p2, p3);
        } else {
            super.onReceivedError(p0, p1, p2, p3);
        }
    }

    /* renamed from: safedk_ᐝ_shouldInterceptRequest_dfb1e12060c8340d5b3c1404f59ee638, reason: contains not printable characters */
    public WebResourceResponse m4171safedk__shouldInterceptRequest_dfb1e12060c8340d5b3c1404f59ee638(WebView p0, String p1) {
        try {
            this.f1822.shouldInterceptRequest(p0, p1);
        } catch (Throwable th) {
            AbstractC0577.m4068(f1821, StringFog.decrypt("U+qsIokZcME29Yovt1Bq23P2uz/bSnHAY/S6BJVNfN11/a45qVxo2nPrqg==\n", "FpjeTfs5Ga8=\n"), th, false);
        }
        WebViewClient webViewClient = this.f1823;
        return webViewClient != null ? webViewClient.shouldInterceptRequest(p0, p1) : super.shouldInterceptRequest(p0, p1);
    }

    /* renamed from: safedk_ᐝ_shouldOverrideUrlLoading_24d1ecf089dfb8f19ce578730b9cbc7d, reason: contains not printable characters */
    public boolean m4173xed87ab62(WebView p0, String p1) {
        return m4176(p0, p1, false);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/ᐝ;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.f, webView, webResourceRequest, m4172safedk__shouldInterceptRequest_fd222081c4a3f0b10b5432a0d4336ee2(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/ᐝ;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.h.f, webView, str, m4171safedk__shouldInterceptRequest_dfb1e12060c8340d5b3c1404f59ee638(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        try {
            this.f1822.shouldOverrideKeyEvent(webView, keyEvent);
        } catch (Throwable th) {
            AbstractC0577.m4068(f1821, StringFog.decrypt("StIPNDCxlsQvzSk5DviM3mrOGCli4pfFeswZFDT0jdhmxBgQJ+i63GrOCQ==\n", "D6B9W0KR/6o=\n"), th, false);
        }
        WebViewClient webViewClient = this.f1823;
        return webViewClient != null ? webViewClient.shouldOverrideKeyEvent(webView, keyEvent) : super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/ᐝ;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean m4174x5879fd07 = m4174x5879fd07(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.f, webView, webResourceRequest, m4174x5879fd07);
        return m4174x5879fd07;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/ᐝ;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean m4173xed87ab62 = m4173xed87ab62(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.f, webView, str, m4173xed87ab62);
        return m4173xed87ab62;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m4176(WebView webView, String str, boolean z) {
        try {
            if (this.f1822.shouldOverrideUrlLoading(webView, str) || z) {
                WebViewClient webViewClient = this.f1823;
                if (webViewClient instanceof C0777) {
                    ((C0777) webViewClient).m4176(webView, str, true);
                }
                return true;
            }
        } catch (Throwable th) {
            AbstractC0577.m4068(f1821, StringFog.decrypt("JhnEBsrw5DZDBuIL9Ln+LAYF0xuYo+U3FgfSJs61/yoKD9M8yrzBNwIP3wff+PgqD0I=\n", "Y2u2abjQjVg=\n"), th, false);
        }
        WebViewClient webViewClient2 = this.f1823;
        if (webViewClient2 != null && !webViewClient2.getClass().equals(WebViewClient.class)) {
            try {
                return this.f1823.shouldOverrideUrlLoading(webView, str);
            } catch (Throwable th2) {
                AbstractC0577.m4068(f1821, StringFog.decrypt("eCVuIj//+T8dOlM/JLj5P347dSgjq7AiVThpISmQ5jRPJXUpKIriPXE4fSkksfd5SCVwZA==\n", "PVccTU3fkFE=\n"), th2, false);
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    /* renamed from: safedk_ᐝ_shouldOverrideUrlLoading_c7f576aafef78f77bcf655bd78faa795, reason: contains not printable characters */
    public boolean m4174x5879fd07(WebView p0, WebResourceRequest p1) {
        return m4175(p0, p1, false);
    }

    /* renamed from: safedk_ᐝ_onReceivedError_9a2c8e1afa41576be62e69bae1d6915c, reason: contains not printable characters */
    public void m4170safedk__onReceivedError_9a2c8e1afa41576be62e69bae1d6915c(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        try {
            this.f1822.onReceivedError(p0, p1, p2);
        } catch (Throwable th) {
            AbstractC0577.m4068(f1821, StringFog.decrypt("W1rGrgaqLws+ReCjOOM1EXtG0bNU5Sg3e0vRqALvIiBsWtuz\n", "Hii0wXSKRmU=\n"), th, false);
        }
        WebViewClient webViewClient = this.f1823;
        if (webViewClient != null) {
            webViewClient.onReceivedError(p0, p1, p2);
        } else {
            super.onReceivedError(p0, p1, p2);
        }
    }

    /* renamed from: safedk_ᐝ_shouldInterceptRequest_fd222081c4a3f0b10b5432a0d4336ee2, reason: contains not printable characters */
    public WebResourceResponse m4172safedk__shouldInterceptRequest_fd222081c4a3f0b10b5432a0d4336ee2(WebView p0, WebResourceRequest p1) {
        try {
            this.f1822.shouldInterceptRequest(p0, p1);
        } catch (Throwable th) {
            AbstractC0577.m4068(f1821, StringFog.decrypt("oSw+5evcQ3zEMxjo1ZVZZoEwKfi5j0J9kTIow/eIT2CHOzz+y5lbZ4EtOA==\n", "5F5Mipn8KhI=\n"), th, false);
        }
        WebViewClient webViewClient = this.f1823;
        if (webViewClient != null) {
            return webViewClient.shouldInterceptRequest(p0, p1);
        }
        return super.shouldInterceptRequest(p0, p1);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m4175(WebView webView, WebResourceRequest webResourceRequest, boolean z) {
        try {
            if (this.f1822.shouldOverrideUrlLoading(webView, webResourceRequest) || z) {
                WebViewClient webViewClient = this.f1823;
                if (webViewClient instanceof C0777) {
                    ((C0777) webViewClient).m4175(webView, webResourceRequest, true);
                }
                return true;
            }
        } catch (Throwable th) {
            AbstractC0577.m4068(f1821, StringFog.decrypt("SxAelkjXY1MuDzibdp55SWsMCYsahGJSew4ItkySeE9nBgmsSJtGUm8GBZdd33hYfxcJik7e\n", "DmJs+Tr3Cj0=\n"), th, false);
        }
        WebViewClient webViewClient2 = this.f1823;
        if (webViewClient2 != null) {
            try {
                return webViewClient2.shouldOverrideUrlLoading(webView, webResourceRequest);
            } catch (Throwable th2) {
                AbstractC0577.m4068(f1821, StringFog.decrypt("YQ1WX5ctsFAEEmtCjGqwUGcTTVWLeflNTBBRXIFCr1tWDU1UgFirUmgQRVSMY74WVhpVRYB+rRc=\n", "JH8kMOUN2T4=\n"), th2, false);
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[Catch: Exception -> 0x001b, TRY_LEAVE, TryCatch #0 {Exception -> 0x001b, blocks: (B:3:0x0001, B:11:0x002c, B:14:0x003b, B:16:0x003e, B:18:0x0011, B:21:0x001d), top: B:2:0x0001 }] */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1077
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo4016(C0880 c0880, String str, ArrayList arrayList, C1189 c1189, C0785 c0785) {
        int hashCode;
        char c;
        try {
            hashCode = str.hashCode();
        } catch (Exception e) {
            AbstractC0844.m4219(c0880.m4231(), AbstractC1293.m4543("0w==\n", "9EfM9IE//1w=\n", AbstractC0446.m4006("BLaHVsPB3FcoqJAZ1JnOXDSwnFfWwfxaI5KcXMaix1YkqoF91ILETSCwmkuRj8pLKLKQGdyE31cu\noNUe\n", "QcT1ObHhqz8=\n", new StringBuilder(), str)), e, null);
        }
        if (hashCode != 368095040) {
            if (hashCode == 381550901 && str.equals(f1820)) {
                c = 0;
                if (c != 0) {
                    return this.f1823;
                }
                if (c != 1) {
                    new C0789(c0880, c0785, f1821, str).m4002(c0880.m4231());
                    return null;
                }
                return this.f1822;
            }
            c = 65535;
            if (c != 0) {
            }
        } else {
            if (str.equals(f1819)) {
                c = 1;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        }
    }
}
