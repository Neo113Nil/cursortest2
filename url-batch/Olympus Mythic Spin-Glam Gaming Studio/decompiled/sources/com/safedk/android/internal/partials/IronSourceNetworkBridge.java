package com.safedk.android.internal.partials;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.f;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: IronSourceSourceFile */
/* loaded from: classes7.dex */
public class IronSourceNetworkBridge {
    public static InputStream urlConnectionGetInputStream(URLConnection targetInstance) throws IOException {
        Logger.d("IronSourceNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/IronSourceNetworkBridge;->urlConnectionGetInputStream(Ljava/net/URLConnection;)Ljava/io/InputStream;");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p() && targetInstance.getURL() != null) {
            try {
                String url = targetInstance.getURL().toString();
                Logger.d("SafeDKNetwork", "urlConnectionGetInputStream : ", url, ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME =  ", h.f);
                Map<String, List<String>> headerFields = targetInstance.getHeaderFields();
                InputStream inputStream = null;
                try {
                    inputStream = targetInstance.getInputStream();
                } catch (Throwable th) {
                    Logger.d("SafeDKNetwork", "Exception in urlConnectionGetInputStream : ", th.getMessage());
                }
                InputStream a = CreativeInfoManager.a(h.f, url, inputStream, headerFields);
                if ((targetInstance instanceof HttpURLConnection) && (a instanceof f)) {
                    Logger.d("SafeDKNetwork", "following HttpURLConnection:", targetInstance, " and stream: ", a);
                    f fVar = (f) a;
                    HttpURLConnection httpURLConnection = (HttpURLConnection) targetInstance;
                    NetworkBridge.b.put(httpURLConnection, fVar);
                    fVar.a(httpURLConnection);
                }
                return a;
            } catch (Throwable th2) {
                Logger.e("SafeDKNetwork", "urlConnectionGetInputStream exception", th2);
            }
        }
        return targetInstance.getInputStream();
    }

    public static OutputStream urlConnectionGetOutputStream(URLConnection targetInstance) throws IOException {
        Logger.d("IronSourceNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/IronSourceNetworkBridge;->urlConnectionGetOutputStream(Ljava/net/URLConnection;)Ljava/io/OutputStream;");
        OutputStream outputStream = targetInstance.getOutputStream();
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p() && targetInstance.getURL() != null) {
            try {
                String url = targetInstance.getURL().toString();
                Logger.d("SafeDKNetwork", "urlConnectionGetOutputStream url=", url, ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME = ", h.f);
                return CreativeInfoManager.a(h.f, url, outputStream);
            } catch (Throwable th) {
                Logger.e("SafeDKNetwork", "urlConnectionGetOutputStream exception", th);
            }
        }
        return outputStream;
    }

    public static int httpUrlConnectionGetResponseCode(HttpURLConnection targetInstance) throws IOException {
        String str;
        Logger.d("IronSourceNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/IronSourceNetworkBridge;->httpUrlConnectionGetResponseCode(Ljava/net/HttpURLConnection;)I");
        int responseCode = targetInstance.getResponseCode();
        try {
            if (targetInstance.getURL() == null) {
                str = null;
            } else {
                str = targetInstance.getURL().toString();
            }
            Logger.d("SafeDKNetwork", "httpUrlConnectionGetResponseCode - sdk=", h.f, ", response code= ", Integer.valueOf(responseCode), ", url= ", str);
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p() && responseCode >= 200 && responseCode < 300 && CreativeInfoManager.a(h.f, AdNetworkConfiguration.USE_INPUT_STREAM_EVENT_AS_RESOURCE_LOADED_INDICATION, false)) {
                CreativeInfoManager.onResourceLoaded(h.f, null, str);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "httpUrlConnectionGetResponseCode exception", th);
        }
        return responseCode;
    }

    public static void httpUrlConnectionDisconnect(HttpURLConnection targetInstance) {
        Logger.d("IronSourceNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/IronSourceNetworkBridge;->httpUrlConnectionDisconnect(Ljava/net/HttpURLConnection;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            try {
                Logger.d("SafeDKNetwork", "httpUrlConnectionDisconnect", ", isOnUiThread = ", Boolean.valueOf(n.c()));
                f remove = NetworkBridge.b.remove(targetInstance);
                if (remove != null) {
                    remove.a();
                }
            } catch (Throwable th) {
                Logger.e("SafeDKNetwork", "httpUrlConnectionDisconnect exception", th);
            }
        }
        targetInstance.disconnect();
    }

    public static void webviewLoadUrl(WebView targetInstance, String url) {
        Logger.d("IronSourceNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/IronSourceNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;)V");
        try {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: ", url, ", WebView address : ", targetInstance.toString(), ", SDK_PACKAGE_NAME = ", h.f);
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                if (!TextUtils.isEmpty(url) && !url.startsWith("javascript:")) {
                    NetworkBridge.logWebviewLoadURLRequest(h.f, targetInstance, url);
                    AdNetworkDiscovery j = CreativeInfoManager.j(h.f);
                    if (j != null && j.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                        CreativeInfoManager.a(url, (String) null, targetInstance, h.f);
                    }
                    SafeDKWebAppInterface.a(h.f, targetInstance, url, true);
                }
                Logger.d("SafeDKNetwork", "webviewLoadUrl2 loadUrl url is null or a javascript command : ", url);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewLoadUrl2 exception", th);
        }
        targetInstance.loadUrl(url);
    }

    public static void webviewAddJavascriptInterface(WebView targetInstance, Object object, String name) {
        Logger.d("IronSourceNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/IronSourceNetworkBridge;->webviewAddJavascriptInterface(Landroid/webkit/WebView;Ljava/lang/Object;Ljava/lang/String;)V");
        try {
            Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, WebView address: ", targetInstance, ", SDK_PACKAGE_NAME: ", h.f, " object is: ", object, " and name: ", name);
            AdNetworkDiscovery j = CreativeInfoManager.j(h.f);
            if (j != null) {
                j.a(targetInstance, object);
            } else {
                Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, discovery not found for sdk: ", h.f, ", add to pending list");
                d.b(targetInstance, object);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewAddJavascriptInterface exception", th);
        }
        targetInstance.addJavascriptInterface(object, name);
    }

    public static void webViewEvaluateJavaScript(WebView webView, String script, ValueCallback<String> resultCallback) {
        String w;
        Logger.d("IronSourceNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/IronSourceNetworkBridge;->webViewEvaluateJavaScript(Landroid/webkit/WebView;Ljava/lang/String;Landroid/webkit/ValueCallback;)V");
        webView.evaluateJavascript(script, resultCallback);
        try {
            String mainSdkPackage = SdksMapping.getMainSdkPackage(h.f);
            Logger.printFullVerboseLog("SafeDKNetwork", "on evaluate javascript with package name: ", mainSdkPackage, " view: ", webView, " and script: \n", script);
            AdNetworkDiscovery j = CreativeInfoManager.j(mainSdkPackage);
            if (j != null && (w = j.w(script)) != null) {
                Logger.d("SafeDKNetwork", "evaluate JS - the ad id found is: ", w);
                j.a(webView, w);
            }
        } catch (Throwable th) {
            Logger.d("SafeDKNetwork", "exception in evaluate JS: ", th);
        }
    }

    public static JSONObject jsonObjectInit() {
        Logger.d("IronSourceNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/IronSourceNetworkBridge;->jsonObjectInit()Lorg/json/JSONObject;");
        return new JSONObject();
    }

    public static JSONObject jsonObjectInit(String message) throws JSONException {
        Logger.d("IronSourceNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/IronSourceNetworkBridge;->jsonObjectInit(Ljava/lang/String;)Lorg/json/JSONObject;");
        try {
            String d = CreativeInfoManager.d(h.f, message);
            if (d != null) {
                message = d;
            }
            if (SafeDK.ad()) {
                CreativeInfoManager.c(h.f, message);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "jsonObjectInit exception", th);
        }
        return new JSONObject(message);
    }
}
