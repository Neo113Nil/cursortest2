package com.smaato.sdk.ng.utils.browser;

import android.webkit.CookieManager;
import android.webkit.WebView;

/* loaded from: classes6.dex */
public class BrowserCookieManager {
    private final CookieManager a;

    public BrowserCookieManager(CookieManager cookieManager) {
        if (cookieManager == null) {
            throw new NullPointerException("CookieManager can not be null");
        }
        this.a = cookieManager;
    }

    public void setupCookiePolicy(WebView webView) {
        if (webView == null) {
            throw new NullPointerException("WebView can not be null");
        }
        this.a.setAcceptThirdPartyCookies(webView, true);
    }
}
