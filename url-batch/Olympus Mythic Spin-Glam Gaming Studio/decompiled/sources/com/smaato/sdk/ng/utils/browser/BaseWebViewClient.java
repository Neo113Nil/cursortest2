package com.smaato.sdk.ng.utils.browser;

import android.annotation.TargetApi;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.SmaatoNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.smaato.sdk.ng.utils.browser.BrowserActivity;
import io.bidmachine.util.network.NetworkUtils;
import java.net.URISyntaxException;
import java.util.Locale;

/* loaded from: classes5.dex */
public class BaseWebViewClient extends WebViewClient {
    private static final String c = "com.smaato.sdk.ng.utils.browser.BaseWebViewClient";
    private WebViewClientCallback a;
    private final BrowserActivity.WebViewCloseListener b;

    public interface WebViewClientCallback {
        void onGeneralError(int i, String str, String str2);

        @TargetApi(23)
        void onHttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

        void onPageFinishedLoading(String str);

        void onPageStartedLoading(String str);

        @TargetApi(26)
        void onRenderProcessGone();

        boolean shouldOverrideUrlLoading(String str);
    }

    public BaseWebViewClient(BrowserActivity.WebViewCloseListener webViewCloseListener) {
        this.b = webViewCloseListener;
    }

    private boolean a(WebView webView, String str) {
        BrowserActivity.WebViewCloseListener webViewCloseListener;
        BrowserActivity.WebViewCloseListener webViewCloseListener2;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        String lowerCase = parse.toString().toLowerCase(Locale.ROOT);
        if (SDKConstants.PARAM_INTENT.equalsIgnoreCase(scheme)) {
            return a(str, webView);
        }
        if (!POBCommonConstants.PLAY_STORE_DOMAIN.equalsIgnoreCase(host) && !"market.android.com".equalsIgnoreCase(host) && !NetworkUtils.PROTOCOL_MARKET.equalsIgnoreCase(scheme) && !lowerCase.startsWith(POBCommonConstants.PLAY_STORE_DOMAIN) && !lowerCase.startsWith("market.android.com/")) {
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                return a(str);
            }
            boolean forceHandleDeepLink = forceHandleDeepLink(parse, webView);
            if (forceHandleDeepLink && (webViewCloseListener2 = this.b) != null) {
                webViewCloseListener2.onWebViewCloseRequested();
            }
            return forceHandleDeepLink;
        }
        String queryParameter = parse.getQueryParameter("id");
        if (queryParameter == null) {
            return forceHandleDeepLink(parse, webView);
        }
        boolean forceHandleDeepLink2 = forceHandleDeepLink(Uri.parse("market://details?id=" + queryParameter), webView);
        if (forceHandleDeepLink2 && (webViewCloseListener = this.b) != null) {
            webViewCloseListener.onWebViewCloseRequested();
        }
        return forceHandleDeepLink2;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.v);
        p0.startActivity(p1);
    }

    public boolean forceHandleDeepLink(Uri uri, WebView webView) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(webView.getContext(), intent);
            return true;
        } catch (RuntimeException e) {
            com.smaato.sdk.ng.utils.Logger.e(c, e.getMessage());
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(h.v, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        WebViewClientCallback webViewClientCallback = this.a;
        if (webViewClientCallback != null) {
            webViewClientCallback.onPageFinishedLoading(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("Smaato|SafeDK: Execution> Lcom/smaato/sdk/ng/utils/browser/BaseWebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(h.v, webView, str);
        safedk_BaseWebViewClient_onPageStarted_a6024c6a36c07407ec9a83863e3ddff0(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("Smaato|SafeDK: Execution> Lcom/smaato/sdk/ng/utils/browser/BaseWebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.v, webView, i, str, str2);
        safedk_BaseWebViewClient_onReceivedError_b439638dbd123914bc7ba9ad9f9dafe2(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("Smaato|SafeDK: Execution> Lcom/smaato/sdk/ng/utils/browser/BaseWebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.v, webView, webResourceRequest, webResourceError);
        safedk_BaseWebViewClient_onReceivedError_d543fd3df77c49d6d0c1ad99514b6563(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        WebViewClientCallback webViewClientCallback = this.a;
        if (webViewClientCallback != null) {
            webViewClientCallback.onHttpError(webResourceRequest, webResourceResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewClientCallback webViewClientCallback = this.a;
        if (webViewClientCallback == null) {
            return false;
        }
        webViewClientCallback.onRenderProcessGone();
        return true;
    }

    public void safedk_BaseWebViewClient_onPageStarted_a6024c6a36c07407ec9a83863e3ddff0(WebView p0, String p1, Bitmap p2) {
        WebViewClientCallback webViewClientCallback = this.a;
        if (webViewClientCallback != null) {
            webViewClientCallback.onPageStartedLoading(p1);
        }
    }

    public void safedk_BaseWebViewClient_onReceivedError_b439638dbd123914bc7ba9ad9f9dafe2(WebView p0, int p1, String p2, String p3) {
        WebViewClientCallback webViewClientCallback = this.a;
        if (webViewClientCallback != null) {
            webViewClientCallback.onGeneralError(p1, p2, p3);
        }
    }

    public boolean safedk_BaseWebViewClient_shouldOverrideUrlLoading_6623b72ef2efa6374705dddc38781bb3(WebView p0, String p1) {
        return a(p0, p1);
    }

    public void setWebViewClientCallback(WebViewClientCallback webViewClientCallback) {
        this.a = webViewClientCallback;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.v, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Smaato|SafeDK: Execution> Lcom/smaato/sdk/ng/utils/browser/BaseWebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_BaseWebViewClient_shouldOverrideUrlLoading_8590d48308f75a6851d4e6cf71f52dfd = safedk_BaseWebViewClient_shouldOverrideUrlLoading_8590d48308f75a6851d4e6cf71f52dfd(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.v, webView, webResourceRequest, safedk_BaseWebViewClient_shouldOverrideUrlLoading_8590d48308f75a6851d4e6cf71f52dfd);
        return safedk_BaseWebViewClient_shouldOverrideUrlLoading_8590d48308f75a6851d4e6cf71f52dfd;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("Smaato|SafeDK: Execution> Lcom/smaato/sdk/ng/utils/browser/BaseWebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_BaseWebViewClient_shouldOverrideUrlLoading_6623b72ef2efa6374705dddc38781bb3 = safedk_BaseWebViewClient_shouldOverrideUrlLoading_6623b72ef2efa6374705dddc38781bb3(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.v, webView, str, safedk_BaseWebViewClient_shouldOverrideUrlLoading_6623b72ef2efa6374705dddc38781bb3);
        return safedk_BaseWebViewClient_shouldOverrideUrlLoading_6623b72ef2efa6374705dddc38781bb3;
    }

    @TargetApi(24)
    public boolean safedk_BaseWebViewClient_shouldOverrideUrlLoading_8590d48308f75a6851d4e6cf71f52dfd(WebView p0, WebResourceRequest p1) {
        return a(p0, p1.getUrl().toString());
    }

    @TargetApi(23)
    public void safedk_BaseWebViewClient_onReceivedError_d543fd3df77c49d6d0c1ad99514b6563(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        WebViewClientCallback webViewClientCallback = this.a;
        if (webViewClientCallback != null) {
            webViewClientCallback.onGeneralError(p2.getErrorCode(), p2.getDescription().toString(), p1.getUrl().toString());
        }
    }

    private boolean a(String str) {
        WebViewClientCallback webViewClientCallback = this.a;
        if (webViewClientCallback == null) {
            return false;
        }
        return webViewClientCallback.shouldOverrideUrlLoading(str);
    }

    private boolean a(String str, WebView webView) {
        BrowserActivity.WebViewCloseListener webViewCloseListener;
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            if (parseUri.resolveActivity(webView.getContext().getPackageManager()) != null) {
                parseUri.addFlags(268435456);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(webView.getContext(), parseUri);
                BrowserActivity.WebViewCloseListener webViewCloseListener2 = this.b;
                if (webViewCloseListener2 != null) {
                    webViewCloseListener2.onWebViewCloseRequested();
                }
                return true;
            }
            String stringExtra = parseUri.getStringExtra("browser_fallback_url");
            if (stringExtra != null && !stringExtra.isEmpty()) {
                SmaatoNetworkBridge.webviewLoadUrl(webView, stringExtra);
                return true;
            }
            String str2 = parseUri.getPackage();
            if (str2 == null || str2.isEmpty()) {
                return false;
            }
            boolean forceHandleDeepLink = forceHandleDeepLink(Uri.parse("market://details?id=" + str2), webView);
            if (forceHandleDeepLink && (webViewCloseListener = this.b) != null) {
                webViewCloseListener.onWebViewCloseRequested();
            }
            return forceHandleDeepLink;
        } catch (ActivityNotFoundException e) {
            com.smaato.sdk.ng.utils.Logger.e(c, "Activity not found for intent URL: " + e.getMessage());
            return false;
        } catch (URISyntaxException e2) {
            com.smaato.sdk.ng.utils.Logger.e(c, "URI syntax error: " + e2.getMessage());
            return false;
        } catch (Exception e3) {
            com.smaato.sdk.ng.utils.Logger.e(c, "Error handling intent URL: " + e3.getMessage());
            return false;
        }
    }
}
