package com.meta.analytics.dsp.uinode;

import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.1r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C00811r extends WebViewClient {
    public boolean A00 = false;
    public final C00661c A01;
    public final InterfaceC00801q A02;
    public final boolean A03;

    public C00811r(C00661c c00661c, InterfaceC00801q interfaceC00801q, boolean z) {
        this.A01 = c00661c;
        this.A02 = interfaceC00801q;
        this.A03 = z;
    }

    private void A00() {
        if (this.A03) {
            this.A02.ACZ(AdError.CACHE_ERROR);
        } else {
            A01();
        }
    }

    private void A01() {
        InterfaceC00801q interfaceC00801q = this.A02;
        if (interfaceC00801q != null) {
            interfaceC00801q.ACa();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        A00();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A00 = true;
        A01();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        new Handler().postDelayed(new C0978ar(this), this.A01.A08());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.A00 = true;
        A02();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        NY.A02(C8A.A2e);
        A00();
        return true;
    }
}
