package io.intercom.android.sdk.blocks.messengercard;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes8.dex */
public class MessengerCardWebViewClient extends WebViewClient {
    private static final int WEBVIEW_FADE_IN_TIME_MS = 150;
    private final String cardHost;

    public MessengerCardWebViewClient(String str) {
        this.cardHost = str;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        webView.animate().alpha(1.0f).setStartDelay(150L).setDuration(150L).start();
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        if (!TextUtils.isEmpty(this.cardHost) && this.cardHost.equals(host)) {
            webView.loadUrl(str);
            return false;
        }
        webView.getContext().startActivity(new Intent("android.intent.action.VIEW", parse));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }
}
