package com.ogury.ad.internal;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class w1 {
    public static final void a(y7 y7Var) {
        Intrinsics.checkNotNullParameter(y7Var, "<this>");
        y7Var.getSettings().setJavaScriptEnabled(true);
        y7Var.getSettings().setBuiltInZoomControls(true);
        y7Var.getSettings().setDisplayZoomControls(false);
        y7Var.getSettings().setUseWideViewPort(true);
        y7Var.getSettings().setLoadWithOverviewMode(true);
        y7Var.getSettings().setDomStorageEnabled(true);
        y7Var.getSettings().setDatabaseEnabled(true);
        y7Var.getSettings().setSupportMultipleWindows(true);
        y7Var.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(y7Var, true);
        y7Var.getSettings().setMixedContentMode(2);
        y7Var.getSettings().setLoadsImagesAutomatically(true);
        y7Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
        y7Var.getSettings().setSaveFormData(true);
        y7Var.getSettings().setSupportZoom(true);
        Context context = y7Var.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        y7Var.setDownloadListener(new g8(context));
    }

    public static final String a(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        Object tag = webView.getTag();
        String str = tag instanceof String ? (String) tag : null;
        return str == null ? "" : str;
    }
}
