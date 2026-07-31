package com.ogury.ad.internal;

import android.net.Uri;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class z7 {
    public void a() {
    }

    public void a(String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }

    public void b(y7 webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
    }

    public void c(WebView webView, String url) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public boolean d(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        return true;
    }

    public void a(y7 webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
    }

    public void b(WebView webView, String url) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public void a(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public boolean b(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return false;
    }

    public void a(boolean z, Uri failingUri) {
        Intrinsics.checkNotNullParameter(failingUri, "failingUri");
    }
}
