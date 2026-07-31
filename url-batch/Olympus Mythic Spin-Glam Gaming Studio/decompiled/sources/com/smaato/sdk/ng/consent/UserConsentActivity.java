package com.smaato.sdk.ng.consent;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.SmaatoNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.smaato.sdk.ng.NextGen;

/* loaded from: classes5.dex */
public class UserConsentActivity extends Activity {
    public static final int RESULT_CONSENT_ACCEPTED = 200;
    public static final int RESULT_CONSENT_REJECTED = 201;
    private static final String b = "UserConsentActivity";
    private final WebViewClient a = new a();

    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(h.v, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.d("Smaato|SafeDK: Execution> Lcom/smaato/sdk/ng/consent/UserConsentActivity$a;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
            BrandSafetyUtils.onWebViewPageStarted(h.v, webView, str);
            safedk_UserConsentActivity$a_onPageStarted_fc5651129cad61247192562059c27311(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
            BrandSafetyUtils.onWebViewReceivedError(h.v, view, errorCode, description, failingUrl);
        }

        public void safedk_UserConsentActivity$a_onPageStarted_fc5651129cad61247192562059c27311(WebView p0, String p1, Bitmap p2) {
            super.onPageStarted(p0, p1, p2);
        }

        public boolean safedk_UserConsentActivity$a_shouldOverrideUrlLoading_8af53790f00aee8c4588585f3bd755ad(WebView p0, String p1) {
            p1.getClass();
            switch (p1) {
                case "https://pubnative.net/":
                    UserConsentActivity.this.finish();
                    return false;
                case "https://cdn.pubnative.net/static/consent/GDPR-consent-dialog-accept.html":
                    NextGen.getUserDataManager().grantConsent();
                    UserConsentActivity.this.setResult(200);
                    return false;
                case "https://cdn.pubnative.net/static/consent/GDPR-consent-dialog-reject.html":
                    NextGen.getUserDataManager().denyConsent();
                    UserConsentActivity.this.setResult(201);
                    return false;
                default:
                    return super.shouldOverrideUrlLoading(p0, p1);
            }
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(h.v, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("Smaato|SafeDK: Execution> Lcom/smaato/sdk/ng/consent/UserConsentActivity$a;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean safedk_UserConsentActivity$a_shouldOverrideUrlLoading_8af53790f00aee8c4588585f3bd755ad = safedk_UserConsentActivity$a_shouldOverrideUrlLoading_8af53790f00aee8c4588585f3bd755ad(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(h.v, webView, str, safedk_UserConsentActivity$a_shouldOverrideUrlLoading_8af53790f00aee8c4588585f3bd755ad);
            return safedk_UserConsentActivity$a_shouldOverrideUrlLoading_8af53790f00aee8c4588585f3bd755ad;
        }
    }

    private void a(WebView webView) {
        if (!NextGen.isInitialized() || NextGen.getUserDataManager() == null) {
            com.smaato.sdk.ng.utils.Logger.e(b, "NextGen SDK has not been initialised yet. Dropping call.");
            finish();
            return;
        }
        String consentPageLink = NextGen.getUserDataManager().getConsentPageLink();
        if (!TextUtils.isEmpty(consentPageLink)) {
            SmaatoNetworkBridge.webviewLoadUrl(webView, consentPageLink);
        } else {
            com.smaato.sdk.ng.utils.Logger.e(b, "Invalid consent page URL. Dropping call.");
            finish();
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void b(WebView webView) {
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setLoadWithOverviewMode(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        webView.setWebViewClient(this.a);
        setContentView(webView, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.v, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        b(webView);
        a(webView);
    }
}
