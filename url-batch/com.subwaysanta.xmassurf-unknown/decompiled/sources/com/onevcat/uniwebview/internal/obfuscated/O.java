package com.onevcat.uniwebview.internal.obfuscated;

import android.webkit.JavascriptInterface;
import com.onevcat.uniwebview.UniWebViewInterface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class O {
    public final C0092z a;

    public O(C0092z webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.a = webView;
    }

    @JavascriptInterface
    public final String call(String messageJson) {
        Intrinsics.checkNotNullParameter(messageJson, "messageJson");
        C0058o c0058o = C0058o.b;
        c0058o.a("Received sync channel message: %s", messageJson);
        try {
            P p = new P(this.a.getName(), messageJson);
            UniWebViewInterface.Companion.getClass();
            V a = y2.a(p);
            M messageProvider = new M(a);
            Intrinsics.checkNotNullParameter(messageProvider, "messageProvider");
            c0058o.a(EnumC0054n.DEBUG, messageProvider);
            if (a == null) {
                return null;
            }
            return a.a;
        } catch (Exception e) {
            C0058o c0058o2 = C0058o.b;
            N messageProvider2 = new N(e);
            c0058o2.getClass();
            Intrinsics.checkNotNullParameter(messageProvider2, "messageProvider");
            c0058o2.a(EnumC0054n.CRITICAL, messageProvider2);
            return "{\"error\": \"Failed to process message: " + e.getMessage() + "\"}";
        }
    }
}
