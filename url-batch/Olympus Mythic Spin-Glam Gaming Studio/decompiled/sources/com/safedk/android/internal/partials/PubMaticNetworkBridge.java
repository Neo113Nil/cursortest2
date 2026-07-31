package com.safedk.android.internal.partials;

import android.text.TextUtils;
import android.webkit.WebView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;

/* compiled from: PubMaticSourceFile */
/* loaded from: classes7.dex */
public class PubMaticNetworkBridge {
    public static void webviewLoadUrl(WebView targetInstance, String url) {
        Logger.d("PubMaticNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/PubMaticNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;)V");
        try {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: ", url, ", WebView address : ", targetInstance.toString(), ", SDK_PACKAGE_NAME = ", h.F);
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                if (!TextUtils.isEmpty(url) && !url.startsWith("javascript:")) {
                    NetworkBridge.logWebviewLoadURLRequest(h.F, targetInstance, url);
                    AdNetworkDiscovery j = CreativeInfoManager.j(h.F);
                    if (j != null && j.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                        CreativeInfoManager.a(url, (String) null, targetInstance, h.F);
                    }
                    SafeDKWebAppInterface.a(h.F, targetInstance, url, true);
                }
                Logger.d("SafeDKNetwork", "webviewLoadUrl2 loadUrl url is null or a javascript command : ", url);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewLoadUrl2 exception", th);
        }
        targetInstance.loadUrl(url);
    }

    public static void webviewLoadDataWithBaseURL(WebView targetInstance, String baseUrl, String data, String mimeType, String encoding, String historyUrl) {
        String data2;
        Logger.d("PubMaticNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/PubMaticNetworkBridge;->webviewLoadDataWithBaseURL(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        try {
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                Logger.d("SafeDKNetwork", "webviewLoadDataWithBaseURL: ", baseUrl, ", WebView address : ", targetInstance.toString(), ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME = ", h.F);
                CreativeInfoManager.a(baseUrl, data, targetInstance, h.F);
                SafeDKWebAppInterface.a(h.F, targetInstance, data, true);
            }
            AdNetworkDiscovery j = CreativeInfoManager.j(h.F);
            if (j == null) {
                data2 = data;
            } else {
                data2 = j.a(targetInstance, baseUrl, data);
            }
        } catch (Throwable data3) {
            Logger.e("SafeDKNetwork", "webviewLoadDataWithBaseURL exception", data3);
            data2 = data;
        }
        targetInstance.loadDataWithBaseURL(baseUrl, data2, mimeType, encoding, historyUrl);
    }

    public static void webviewAddJavascriptInterface(WebView targetInstance, Object object, String name) {
        Logger.d("PubMaticNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/PubMaticNetworkBridge;->webviewAddJavascriptInterface(Landroid/webkit/WebView;Ljava/lang/Object;Ljava/lang/String;)V");
        try {
            Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, WebView address: ", targetInstance, ", SDK_PACKAGE_NAME: ", h.F, " object is: ", object, " and name: ", name);
            AdNetworkDiscovery j = CreativeInfoManager.j(h.F);
            if (j != null) {
                j.a(targetInstance, object);
            } else {
                Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, discovery not found for sdk: ", h.F, ", add to pending list");
                d.b(targetInstance, object);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewAddJavascriptInterface exception", th);
        }
        targetInstance.addJavascriptInterface(object, name);
    }
}
