package com.onevcat.uniwebview.internal.obfuscated;

import android.webkit.JavascriptInterface;
import com.onevcat.uniwebview.UniWebViewInterface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class L {
    public final C0092z a;

    public L(C0092z webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.a = webView;
    }

    @JavascriptInterface
    public final void postMessage(String messageJson) {
        Intrinsics.checkNotNullParameter(messageJson, "messageJson");
        C0058o c0058o = C0058o.b;
        c0058o.a("Received channel message: %s", messageJson);
        try {
            P p = new P(this.a.getName(), messageJson);
            UniWebViewInterface.Companion.getClass();
            J messageProvider = new J(y2.a(p));
            Intrinsics.checkNotNullParameter(messageProvider, "messageProvider");
            c0058o.a(EnumC0054n.DEBUG, messageProvider);
        } catch (Exception e) {
            C0058o c0058o2 = C0058o.b;
            K messageProvider2 = new K(e);
            c0058o2.getClass();
            Intrinsics.checkNotNullParameter(messageProvider2, "messageProvider");
            c0058o2.a(EnumC0054n.CRITICAL, messageProvider2);
        }
    }
}
