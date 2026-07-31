package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzfxb extends zzfxa {
    @SuppressLint({"SetJavaScriptEnabled"})
    public zzfxb(String str, WebView webView) {
        super(str);
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        zzc(webView);
    }
}
