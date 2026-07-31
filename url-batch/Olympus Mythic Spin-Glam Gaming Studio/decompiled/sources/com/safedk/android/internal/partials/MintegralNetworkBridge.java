package com.safedk.android.internal.partials;

import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.f;
import com.safedk.android.utils.Logger;
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

/* compiled from: MintegralSourceFile */
/* loaded from: classes7.dex */
public class MintegralNetworkBridge {
    public static InputStream urlConnectionGetInputStream(URLConnection targetInstance) throws IOException {
        Logger.d("MintegralNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/MintegralNetworkBridge;->urlConnectionGetInputStream(Ljava/net/URLConnection;)Ljava/io/InputStream;");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p() && targetInstance.getURL() != null) {
            try {
                String url = targetInstance.getURL().toString();
                Logger.d("SafeDKNetwork", "urlConnectionGetInputStream : ", url, ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME =  ", h.o);
                Map<String, List<String>> headerFields = targetInstance.getHeaderFields();
                InputStream inputStream = null;
                try {
                    inputStream = targetInstance.getInputStream();
                } catch (Throwable th) {
                    Logger.d("SafeDKNetwork", "Exception in urlConnectionGetInputStream : ", th.getMessage());
                }
                InputStream a = CreativeInfoManager.a(h.o, url, inputStream, headerFields);
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
        Logger.d("MintegralNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/MintegralNetworkBridge;->urlConnectionGetOutputStream(Ljava/net/URLConnection;)Ljava/io/OutputStream;");
        OutputStream outputStream = targetInstance.getOutputStream();
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p() && targetInstance.getURL() != null) {
            try {
                String url = targetInstance.getURL().toString();
                Logger.d("SafeDKNetwork", "urlConnectionGetOutputStream url=", url, ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME = ", h.o);
                return CreativeInfoManager.a(h.o, url, outputStream);
            } catch (Throwable th) {
                Logger.e("SafeDKNetwork", "urlConnectionGetOutputStream exception", th);
            }
        }
        return outputStream;
    }

    public static int httpUrlConnectionGetResponseCode(HttpURLConnection targetInstance) throws IOException {
        String str;
        Logger.d("MintegralNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/MintegralNetworkBridge;->httpUrlConnectionGetResponseCode(Ljava/net/HttpURLConnection;)I");
        int responseCode = targetInstance.getResponseCode();
        try {
            if (targetInstance.getURL() == null) {
                str = null;
            } else {
                str = targetInstance.getURL().toString();
            }
            Logger.d("SafeDKNetwork", "httpUrlConnectionGetResponseCode - sdk=", h.o, ", response code= ", Integer.valueOf(responseCode), ", url= ", str);
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p() && responseCode >= 200 && responseCode < 300 && CreativeInfoManager.a(h.o, AdNetworkConfiguration.USE_INPUT_STREAM_EVENT_AS_RESOURCE_LOADED_INDICATION, false)) {
                CreativeInfoManager.onResourceLoaded(h.o, null, str);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "httpUrlConnectionGetResponseCode exception", th);
        }
        return responseCode;
    }

    public static void httpUrlConnectionDisconnect(HttpURLConnection targetInstance) {
        Logger.d("MintegralNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/MintegralNetworkBridge;->httpUrlConnectionDisconnect(Ljava/net/HttpURLConnection;)V");
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

    public static void webviewLoadUrl(WebView targetInstance, String url, Map<String, String> additionalHttpHeaders) {
        Logger.d("MintegralNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/MintegralNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Map;)V");
        try {
            Logger.d("SafeDKNetwork", "webviewLoadUrl. url: ", url, ", WebView address : ", targetInstance.toString(), "  SDK_PACKAGE_NAME = ", h.o);
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                if (!TextUtils.isEmpty(url) && !url.startsWith("javascript:")) {
                    NetworkBridge.logWebviewLoadURLRequest(h.o, targetInstance, url);
                    AdNetworkDiscovery j = CreativeInfoManager.j(h.o);
                    if (j != null && j.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                        CreativeInfoManager.a(url, (String) null, targetInstance, h.o);
                    }
                    SafeDKWebAppInterface.a(h.o, targetInstance, url, true);
                }
                Logger.d("SafeDKNetwork", "webviewLoadUrl loadUrl url is null or a javascript command : ", url);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewLoadUrl exception", th);
        }
        targetInstance.loadUrl(url, additionalHttpHeaders);
    }

    public static void webviewLoadUrl(WebView targetInstance, String url) {
        Logger.d("MintegralNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/MintegralNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;)V");
        try {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: ", url, ", WebView address : ", targetInstance.toString(), ", SDK_PACKAGE_NAME = ", h.o);
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                if (!TextUtils.isEmpty(url) && !url.startsWith("javascript:")) {
                    NetworkBridge.logWebviewLoadURLRequest(h.o, targetInstance, url);
                    AdNetworkDiscovery j = CreativeInfoManager.j(h.o);
                    if (j != null && j.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                        CreativeInfoManager.a(url, (String) null, targetInstance, h.o);
                    }
                    SafeDKWebAppInterface.a(h.o, targetInstance, url, true);
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
        Logger.d("MintegralNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/MintegralNetworkBridge;->webviewLoadDataWithBaseURL(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        try {
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                Logger.d("SafeDKNetwork", "webviewLoadDataWithBaseURL: ", baseUrl, ", WebView address : ", targetInstance.toString(), ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME = ", h.o);
                CreativeInfoManager.a(baseUrl, data, targetInstance, h.o);
                SafeDKWebAppInterface.a(h.o, targetInstance, data, true);
            }
            AdNetworkDiscovery j = CreativeInfoManager.j(h.o);
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

    public static void webviewSetWebChromeClient(WebView targetInstance, WebChromeClient client) {
        Logger.d("MintegralNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/MintegralNetworkBridge;->webviewSetWebChromeClient(Landroid/webkit/WebView;Landroid/webkit/WebChromeClient;)V");
        try {
            boolean z = SafeDK.getInstance() != null && SafeDK.getInstance().p();
            Logger.d("SafeDKNetwork", "webviewSetWebChromeClient invoked, WebView address : ", targetInstance, ", WebChromeClient = ", client, ", SDK_PACKAGE_NAME = ", h.o);
            if (z) {
                BrandSafetyUtils.a(h.o, targetInstance, client);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewSetWebChromeClient exception", th);
        }
        targetInstance.setWebChromeClient(client);
    }

    public static JSONObject jsonObjectInit(String message) throws JSONException {
        Logger.d("MintegralNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/MintegralNetworkBridge;->jsonObjectInit(Ljava/lang/String;)Lorg/json/JSONObject;");
        try {
            String d = CreativeInfoManager.d(h.o, message);
            if (d != null) {
                message = d;
            }
            if (SafeDK.ad()) {
                CreativeInfoManager.c(h.o, message);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "jsonObjectInit exception", th);
        }
        return new JSONObject(message);
    }
}
