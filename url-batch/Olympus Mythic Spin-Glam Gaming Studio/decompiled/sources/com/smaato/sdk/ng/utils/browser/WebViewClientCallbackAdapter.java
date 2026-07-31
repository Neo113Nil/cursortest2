package com.smaato.sdk.ng.utils.browser;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.smaato.sdk.ng.utils.browser.BaseWebViewClient;

/* loaded from: classes13.dex */
public class WebViewClientCallbackAdapter implements BaseWebViewClient.WebViewClientCallback {
    @Override // com.smaato.sdk.ng.utils.browser.BaseWebViewClient.WebViewClientCallback
    public void onGeneralError(int i, String str, String str2) {
    }

    @Override // com.smaato.sdk.ng.utils.browser.BaseWebViewClient.WebViewClientCallback
    public void onHttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    @Override // com.smaato.sdk.ng.utils.browser.BaseWebViewClient.WebViewClientCallback
    public void onPageFinishedLoading(String str) {
    }

    @Override // com.smaato.sdk.ng.utils.browser.BaseWebViewClient.WebViewClientCallback
    public void onPageStartedLoading(String str) {
    }

    @Override // com.smaato.sdk.ng.utils.browser.BaseWebViewClient.WebViewClientCallback
    public void onRenderProcessGone() {
    }

    @Override // com.smaato.sdk.ng.utils.browser.BaseWebViewClient.WebViewClientCallback
    public boolean shouldOverrideUrlLoading(String str) {
        return false;
    }
}
