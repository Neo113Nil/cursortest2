package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcnr extends zzcns {
    public zzcnr(zzcmp zzcmpVar, zzbep zzbepVar, boolean z) {
        super(zzcmpVar, zzbepVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcmw, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzM(webView, str, null);
    }
}
