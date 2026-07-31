package com.inmobi.media;

import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Ue implements Runnable {
    public final WeakReference a;

    public Ue(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.a = new WeakReference(webView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebSettings settings;
        WebView webView = (WebView) this.a.get();
        if (webView == null || (settings = webView.getSettings()) == null) {
            return;
        }
        settings.setBlockNetworkLoads(true);
    }
}
