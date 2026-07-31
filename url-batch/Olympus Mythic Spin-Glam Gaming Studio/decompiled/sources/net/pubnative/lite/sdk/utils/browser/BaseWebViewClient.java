package net.pubnative.lite.sdk.utils.browser;

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
import com.safedk.android.internal.partials.VerveNetworkBridge;
import com.safedk.android.utils.h;
import io.bidmachine.util.network.NetworkUtils;
import java.net.URISyntaxException;
import java.util.Locale;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.browser.BrowserActivity;

/* loaded from: classes14.dex */
public class BaseWebViewClient extends WebViewClient {
    private static final String TAG = "net.pubnative.lite.sdk.utils.browser.BaseWebViewClient";
    private WebViewClientCallback webViewClientCallback;
    private final BrowserActivity.WebViewCloseListener webViewCloseListener;

    public interface WebViewClientCallback {
        void onGeneralError(int i, String str, String str2);

        void onHttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

        void onPageFinishedLoading(String str);

        void onPageStartedLoading(String str);

        void onRenderProcessGone();

        boolean shouldOverrideUrlLoading(String str);
    }

    public BaseWebViewClient(BrowserActivity.WebViewCloseListener webViewCloseListener) {
        this.webViewCloseListener = webViewCloseListener;
    }

    private boolean handleIntentUrl(String str, WebView webView) {
        BrowserActivity.WebViewCloseListener webViewCloseListener;
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            if (parseUri.resolveActivity(webView.getContext().getPackageManager()) != null) {
                parseUri.addFlags(268435456);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(webView.getContext(), parseUri);
                BrowserActivity.WebViewCloseListener webViewCloseListener2 = this.webViewCloseListener;
                if (webViewCloseListener2 != null) {
                    webViewCloseListener2.onWebViewCloseRequested();
                }
                return true;
            }
            String stringExtra = parseUri.getStringExtra("browser_fallback_url");
            if (stringExtra != null && !stringExtra.isEmpty()) {
                VerveNetworkBridge.webviewLoadUrl(webView, stringExtra);
                return true;
            }
            String str2 = parseUri.getPackage();
            if (str2 == null || str2.isEmpty()) {
                return false;
            }
            boolean forceHandleDeepLink = forceHandleDeepLink(Uri.parse("market://details?id=" + str2), webView);
            if (forceHandleDeepLink && (webViewCloseListener = this.webViewCloseListener) != null) {
                webViewCloseListener.onWebViewCloseRequested();
            }
            return forceHandleDeepLink;
        } catch (ActivityNotFoundException e) {
            Logger.e(TAG, "Activity not found for intent URL: " + e.getMessage());
            return false;
        } catch (URISyntaxException e2) {
            Logger.e(TAG, "URI syntax error: " + e2.getMessage());
            return false;
        } catch (Exception e3) {
            Logger.e(TAG, "Error handling intent URL: " + e3.getMessage());
            return false;
        }
    }

    private boolean handleUrlLoading(WebView webView, String str) {
        BrowserActivity.WebViewCloseListener webViewCloseListener;
        BrowserActivity.WebViewCloseListener webViewCloseListener2;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        String lowerCase = parse.toString().toLowerCase(Locale.ROOT);
        if (SDKConstants.PARAM_INTENT.equalsIgnoreCase(scheme)) {
            return handleIntentUrl(str, webView);
        }
        if (!POBCommonConstants.PLAY_STORE_DOMAIN.equalsIgnoreCase(host) && !"market.android.com".equalsIgnoreCase(host) && !NetworkUtils.PROTOCOL_MARKET.equalsIgnoreCase(scheme) && !lowerCase.startsWith(POBCommonConstants.PLAY_STORE_DOMAIN) && !lowerCase.startsWith("market.android.com/")) {
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                return shouldOverrideUrlLoadingInternal(str);
            }
            boolean forceHandleDeepLink = forceHandleDeepLink(parse, webView);
            if (forceHandleDeepLink && (webViewCloseListener2 = this.webViewCloseListener) != null) {
                webViewCloseListener2.onWebViewCloseRequested();
            }
            return forceHandleDeepLink;
        }
        String queryParameter = parse.getQueryParameter("id");
        if (queryParameter == null) {
            return forceHandleDeepLink(parse, webView);
        }
        boolean forceHandleDeepLink2 = forceHandleDeepLink(Uri.parse("market://details?id=" + queryParameter), webView);
        if (forceHandleDeepLink2 && (webViewCloseListener = this.webViewCloseListener) != null) {
            webViewCloseListener.onWebViewCloseRequested();
        }
        return forceHandleDeepLink2;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.C);
        p0.startActivity(p1);
    }

    private boolean shouldOverrideUrlLoadingInternal(String str) {
        WebViewClientCallback webViewClientCallback = this.webViewClientCallback;
        if (webViewClientCallback == null) {
            return false;
        }
        return webViewClientCallback.shouldOverrideUrlLoading(str);
    }

    public boolean forceHandleDeepLink(Uri uri, WebView webView) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(webView.getContext(), intent);
            return true;
        } catch (RuntimeException e) {
            Logger.e(TAG, e.getMessage());
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(h.C, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        WebViewClientCallback webViewClientCallback = this.webViewClientCallback;
        if (webViewClientCallback != null) {
            webViewClientCallback.onPageFinishedLoading(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        com.safedk.android.utils.Logger.d("Verve|SafeDK: Execution> Lnet/pubnative/lite/sdk/utils/browser/BaseWebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(h.C, webView, str);
        safedk_BaseWebViewClient_onPageStarted_dbd9b983bb0a7bdcfcabf7701d757611(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        com.safedk.android.utils.Logger.d("Verve|SafeDK: Execution> Lnet/pubnative/lite/sdk/utils/browser/BaseWebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.C, webView, i, str, str2);
        safedk_BaseWebViewClient_onReceivedError_c4b40af0830a4d4b18e7d115318a5d54(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        com.safedk.android.utils.Logger.d("Verve|SafeDK: Execution> Lnet/pubnative/lite/sdk/utils/browser/BaseWebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.C, webView, webResourceRequest, webResourceError);
        safedk_BaseWebViewClient_onReceivedError_c750cd823b853d0907b2f463495b09b8(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        WebViewClientCallback webViewClientCallback = this.webViewClientCallback;
        if (webViewClientCallback != null) {
            webViewClientCallback.onHttpError(webResourceRequest, webResourceResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewClientCallback webViewClientCallback = this.webViewClientCallback;
        if (webViewClientCallback == null) {
            return false;
        }
        webViewClientCallback.onRenderProcessGone();
        return true;
    }

    public void safedk_BaseWebViewClient_onPageStarted_dbd9b983bb0a7bdcfcabf7701d757611(WebView p0, String p1, Bitmap p2) {
        WebViewClientCallback webViewClientCallback = this.webViewClientCallback;
        if (webViewClientCallback != null) {
            webViewClientCallback.onPageStartedLoading(p1);
        }
    }

    public void safedk_BaseWebViewClient_onReceivedError_c4b40af0830a4d4b18e7d115318a5d54(WebView p0, int p1, String p2, String p3) {
        WebViewClientCallback webViewClientCallback = this.webViewClientCallback;
        if (webViewClientCallback != null) {
            webViewClientCallback.onGeneralError(p1, p2, p3);
        }
    }

    public boolean safedk_BaseWebViewClient_shouldOverrideUrlLoading_0e0e5b17f6d0330f63838b591ccd4816(WebView p0, String p1) {
        return handleUrlLoading(p0, p1);
    }

    public void setWebViewClientCallback(WebViewClientCallback webViewClientCallback) {
        this.webViewClientCallback = webViewClientCallback;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.C, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        com.safedk.android.utils.Logger.d("Verve|SafeDK: Execution> Lnet/pubnative/lite/sdk/utils/browser/BaseWebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_BaseWebViewClient_shouldOverrideUrlLoading_1246a67e7c5ff87fdaf5db4c4ca2cb84 = safedk_BaseWebViewClient_shouldOverrideUrlLoading_1246a67e7c5ff87fdaf5db4c4ca2cb84(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.C, webView, webResourceRequest, safedk_BaseWebViewClient_shouldOverrideUrlLoading_1246a67e7c5ff87fdaf5db4c4ca2cb84);
        return safedk_BaseWebViewClient_shouldOverrideUrlLoading_1246a67e7c5ff87fdaf5db4c4ca2cb84;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.safedk.android.utils.Logger.d("Verve|SafeDK: Execution> Lnet/pubnative/lite/sdk/utils/browser/BaseWebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_BaseWebViewClient_shouldOverrideUrlLoading_0e0e5b17f6d0330f63838b591ccd4816 = safedk_BaseWebViewClient_shouldOverrideUrlLoading_0e0e5b17f6d0330f63838b591ccd4816(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.C, webView, str, safedk_BaseWebViewClient_shouldOverrideUrlLoading_0e0e5b17f6d0330f63838b591ccd4816);
        return safedk_BaseWebViewClient_shouldOverrideUrlLoading_0e0e5b17f6d0330f63838b591ccd4816;
    }

    public boolean safedk_BaseWebViewClient_shouldOverrideUrlLoading_1246a67e7c5ff87fdaf5db4c4ca2cb84(WebView p0, WebResourceRequest p1) {
        return handleUrlLoading(p0, p1.getUrl().toString());
    }

    public void safedk_BaseWebViewClient_onReceivedError_c750cd823b853d0907b2f463495b09b8(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        WebViewClientCallback webViewClientCallback = this.webViewClientCallback;
        if (webViewClientCallback != null) {
            webViewClientCallback.onGeneralError(p2.getErrorCode(), p2.getDescription().toString(), p1.getUrl().toString());
        }
    }
}
