package com.pubmatic.sdk.nativead;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBTrackerHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.view.POBWebView;
import com.pubmatic.sdk.nativead.response.POBNativeAdResponseEventTracker;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public class POBNativeTrackerHandler {
    private final POBTrackerHandler a;

    class a extends WebViewClient {
        final /* synthetic */ POBWebView a;

        a(POBWebView pOBWebView) {
            this.a = pOBWebView;
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(h.F, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            BrandSafetyUtils.onWebViewPageStarted(h.F, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
            BrandSafetyUtils.onWebViewReceivedError(h.F, view, errorCode, description, failingUrl);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            this.a.destroy();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(h.F, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
            BrandSafetyUtils.onShouldOverrideUrlLoading(h.F, view, url, shouldOverrideUrlLoading);
            return shouldOverrideUrlLoading;
        }
    }

    public POBNativeTrackerHandler(@NonNull POBTrackerHandler pOBTrackerHandler) {
        this.a = pOBTrackerHandler;
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList();
        if (!POBUtils.isListNullOrEmpty(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((POBNativeAdResponseEventTracker) it.next()).getUrl());
            }
        }
        return arrayList;
    }

    public void executeClickTrackers(@Nullable List<String> list) {
        this.a.sendTrackers(list);
    }

    @MainThread
    public void executeImpressionTracker(@NonNull Context context, @Nullable List<POBNativeAdResponseEventTracker> list, @Nullable List<POBNativeAdResponseEventTracker> list2, @Nullable List<String> list3, @Nullable String str) {
        this.a.sendTrackers(a(list2, list3));
        List a2 = a(list, str);
        if (a2.isEmpty()) {
            POBLog.error("POBNativeTrackerHandler", "Failed to execute tracker url: " + a2, new Object[0]);
            return;
        }
        POBWebView createInstance = POBWebView.createInstance(context);
        if (createInstance != null) {
            createInstance.setWebViewClient(new a(createInstance));
            this.a.executeJsScripts(createInstance, POBUtils.parseJsTracker(a2));
        }
    }

    private List a(List list, String str) {
        ArrayList arrayList = new ArrayList();
        if (!POBUtils.isNullOrEmpty(str)) {
            arrayList.add(str);
        }
        arrayList.addAll(a(list));
        return arrayList;
    }

    private List a(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        if (!POBUtils.isListNullOrEmpty(list2)) {
            arrayList.addAll(list2);
        }
        arrayList.addAll(a(list));
        return arrayList;
    }
}
