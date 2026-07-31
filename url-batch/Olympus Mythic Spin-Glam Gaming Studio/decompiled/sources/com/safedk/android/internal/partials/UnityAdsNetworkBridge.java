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

/* compiled from: UnityAdsSourceFile */
/* loaded from: classes7.dex */
public class UnityAdsNetworkBridge {
    public static void webviewLoadUrl(WebView targetInstance, String url) {
        Logger.d("UnityAdsNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/UnityAdsNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;)V");
        try {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: ", url, ", WebView address : ", targetInstance.toString(), ", SDK_PACKAGE_NAME = ", "com.unity3d.ads");
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                if (!TextUtils.isEmpty(url) && !url.startsWith("javascript:")) {
                    NetworkBridge.logWebviewLoadURLRequest("com.unity3d.ads", targetInstance, url);
                    AdNetworkDiscovery j = CreativeInfoManager.j("com.unity3d.ads");
                    if (j != null && j.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                        CreativeInfoManager.a(url, (String) null, targetInstance, "com.unity3d.ads");
                    }
                    SafeDKWebAppInterface.a("com.unity3d.ads", targetInstance, url, true);
                }
                Logger.d("SafeDKNetwork", "webviewLoadUrl2 loadUrl url is null or a javascript command : ", url);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewLoadUrl2 exception", th);
        }
        targetInstance.loadUrl(url);
    }

    public static void webviewAddJavascriptInterface(WebView targetInstance, Object object, String name) {
        Logger.d("UnityAdsNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/UnityAdsNetworkBridge;->webviewAddJavascriptInterface(Landroid/webkit/WebView;Ljava/lang/Object;Ljava/lang/String;)V");
        try {
            Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, WebView address: ", targetInstance, ", SDK_PACKAGE_NAME: ", "com.unity3d.ads", " object is: ", object, " and name: ", name);
            AdNetworkDiscovery j = CreativeInfoManager.j("com.unity3d.ads");
            if (j != null) {
                j.a(targetInstance, object);
            } else {
                Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, discovery not found for sdk: ", "com.unity3d.ads", ", add to pending list");
                d.b(targetInstance, object);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewAddJavascriptInterface exception", th);
        }
        targetInstance.addJavascriptInterface(object, name);
    }
}
