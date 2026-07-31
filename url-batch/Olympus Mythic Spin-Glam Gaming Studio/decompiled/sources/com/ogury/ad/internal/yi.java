package com.ogury.ad.internal;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class yi extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        Logger.d("Ogury|SafeDK: Execution> Lcom/ogury/ad/internal/yi;->onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z");
        boolean safedk_yi_onCreateWindow_2819797ffe0a5c0f908a51b5d7dabdfc = safedk_yi_onCreateWindow_2819797ffe0a5c0f908a51b5d7dabdfc(webView, z, z2, message);
        BrandSafetyUtils.onWebChromeClientCreateWindow("io.presage", webView, message, safedk_yi_onCreateWindow_2819797ffe0a5c0f908a51b5d7dabdfc);
        return safedk_yi_onCreateWindow_2819797ffe0a5c0f908a51b5d7dabdfc;
    }

    public boolean safedk_yi_onCreateWindow_2819797ffe0a5c0f908a51b5d7dabdfc(WebView view, boolean p1, boolean p2, Message p3) {
        Intrinsics.checkNotNullParameter(view, "view");
        String extra = view.getHitTestResult().getExtra();
        if (extra == null) {
            return false;
        }
        boolean p22 = StringsKt.isBlank(extra);
        if (p22) {
            return false;
        }
        view.loadUrl(extra);
        return false;
    }
}
