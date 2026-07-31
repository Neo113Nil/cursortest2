package com.five_corp.ad.internal.view;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.internal.partials.LINENetworkBridge;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public abstract class p {
    public static final /* synthetic */ int a = 0;

    public static void a(WebView webView, com.five_corp.ad.internal.cache.p pVar, com.five_corp.ad.internal.ad.custom_layout.j jVar, com.five_corp.ad.internal.layouter.d dVar) {
        StringBuilder sb = new StringBuilder("<html><head><meta charset='utf-8' />");
        sb.append(String.format("<meta name='viewport' content='width=%dpx' />", Integer.valueOf(jVar.a)));
        sb.append("</head><body style='margin:0;padding:0'>");
        String str = jVar.c;
        ArrayList<com.five_corp.ad.internal.ad.h> arrayList = jVar.b;
        if (arrayList != null) {
            for (com.five_corp.ad.internal.ad.h hVar : arrayList) {
                com.five_corp.ad.internal.cache.n nVar = (com.five_corp.ad.internal.cache.n) pVar.a.get(hVar);
                if (nVar != null && nVar.c()) {
                    com.five_corp.ad.internal.storage.a aVar = nVar.c;
                    com.five_corp.ad.internal.storage.b bVar = aVar.a;
                    String str2 = aVar.b;
                    bVar.getClass();
                    String absolutePath = new File(bVar.a, str2).getAbsolutePath();
                    str = str.replace("{{resource:" + hVar.b + "}}", "file://" + absolutePath);
                }
            }
        }
        sb.append(str);
        sb.append("</body></html>");
        String sb2 = sb.toString();
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSupportZoom(false);
        webView.setBackgroundColor(-1);
        webView.setScrollBarStyle(0);
        webView.setVisibility(8);
        webView.setLayerType(1, null);
        webView.setOnLongClickListener(new n());
        webView.setWebViewClient(Build.VERSION.SDK_INT >= 26 ? new o(dVar) : new WebViewClient());
        LINENetworkBridge.webviewLoadDataWithBaseURL(webView, "", sb2, POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", "");
    }
}
