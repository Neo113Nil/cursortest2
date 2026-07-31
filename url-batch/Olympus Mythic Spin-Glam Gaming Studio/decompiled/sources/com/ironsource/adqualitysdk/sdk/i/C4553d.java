package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4553d extends WebChromeClient {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C4554e f141;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public boolean f142 = false;

    public C4553d(C4554e c4554e) {
        this.f141 = c4554e;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        this.f141.mo3949(webView, str2);
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        if (i != 100 || this.f142) {
            return;
        }
        this.f142 = true;
        this.f141.mo3948(webView);
    }
}
