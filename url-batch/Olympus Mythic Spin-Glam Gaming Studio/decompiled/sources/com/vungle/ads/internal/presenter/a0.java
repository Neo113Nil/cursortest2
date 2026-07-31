package com.vungle.ads.internal.presenter;

import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 {
    public final WebView a;
    public final com.vungle.ads.internal.ui.z b;

    public a0(com.vungle.ads.internal.ui.z webViewClient, WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(webViewClient, "webViewClient");
        this.a = webView;
        this.b = webViewClient;
    }

    public final WebView a() {
        return this.a;
    }

    public final com.vungle.ads.internal.ui.z b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.areEqual(this.a, a0Var.a) && Intrinsics.areEqual(this.b, a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("WebViewEntry(webView=");
        a.append(this.a);
        a.append(", webViewClient=");
        a.append(this.b);
        a.append(')');
        return a.toString();
    }
}
