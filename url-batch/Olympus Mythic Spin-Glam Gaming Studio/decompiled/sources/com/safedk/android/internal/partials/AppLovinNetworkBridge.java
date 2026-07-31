package com.safedk.android.internal.partials;

import android.text.TextUtils;
import android.webkit.WebView;
import com.safedk.android.SafeDK;
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
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* compiled from: AppLovinSourceFile */
/* loaded from: classes7.dex */
public class AppLovinNetworkBridge {
    public static InputStream urlConnectionGetInputStream(URLConnection targetInstance) throws IOException {
        Logger.d("AppLovinNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/AppLovinNetworkBridge;->urlConnectionGetInputStream(Ljava/net/URLConnection;)Ljava/io/InputStream;");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p() && targetInstance.getURL() != null) {
            try {
                String url = targetInstance.getURL().toString();
                Logger.d("SafeDKNetwork", "urlConnectionGetInputStream : ", url, ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME =  ", h.a);
                Map<String, List<String>> headerFields = targetInstance.getHeaderFields();
                InputStream inputStream = null;
                try {
                    inputStream = targetInstance.getInputStream();
                } catch (Throwable th) {
                    Logger.d("SafeDKNetwork", "Exception in urlConnectionGetInputStream : ", th.getMessage());
                }
                InputStream a = CreativeInfoManager.a(h.a, url, inputStream, headerFields);
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
        Logger.d("AppLovinNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/AppLovinNetworkBridge;->urlConnectionGetOutputStream(Ljava/net/URLConnection;)Ljava/io/OutputStream;");
        OutputStream outputStream = targetInstance.getOutputStream();
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p() && targetInstance.getURL() != null) {
            try {
                String url = targetInstance.getURL().toString();
                Logger.d("SafeDKNetwork", "urlConnectionGetOutputStream url=", url, ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME = ", h.a);
                return CreativeInfoManager.a(h.a, url, outputStream);
            } catch (Throwable th) {
                Logger.e("SafeDKNetwork", "urlConnectionGetOutputStream exception", th);
            }
        }
        return outputStream;
    }

    public static int httpUrlConnectionGetResponseCode(HttpURLConnection targetInstance) throws IOException {
        String str;
        Logger.d("AppLovinNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/AppLovinNetworkBridge;->httpUrlConnectionGetResponseCode(Ljava/net/HttpURLConnection;)I");
        int responseCode = targetInstance.getResponseCode();
        try {
            if (targetInstance.getURL() == null) {
                str = null;
            } else {
                str = targetInstance.getURL().toString();
            }
            Logger.d("SafeDKNetwork", "httpUrlConnectionGetResponseCode - sdk=", h.a, ", response code= ", Integer.valueOf(responseCode), ", url= ", str);
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p() && responseCode >= 200 && responseCode < 300 && CreativeInfoManager.a(h.a, AdNetworkConfiguration.USE_INPUT_STREAM_EVENT_AS_RESOURCE_LOADED_INDICATION, false)) {
                CreativeInfoManager.onResourceLoaded(h.a, null, str);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "httpUrlConnectionGetResponseCode exception", th);
        }
        return responseCode;
    }

    public static void httpUrlConnectionDisconnect(HttpURLConnection targetInstance) {
        Logger.d("AppLovinNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/AppLovinNetworkBridge;->httpUrlConnectionDisconnect(Ljava/net/HttpURLConnection;)V");
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
        Logger.d("AppLovinNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/AppLovinNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;)V");
        try {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: ", url, ", WebView address : ", targetInstance.toString(), ", SDK_PACKAGE_NAME = ", h.a);
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                if (!TextUtils.isEmpty(url) && !url.startsWith("javascript:")) {
                    NetworkBridge.logWebviewLoadURLRequest(h.a, targetInstance, url);
                    AdNetworkDiscovery j = CreativeInfoManager.j(h.a);
                    if (j != null && j.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                        CreativeInfoManager.a(url, (String) null, targetInstance, h.a);
                    }
                    SafeDKWebAppInterface.a(h.a, targetInstance, url, true);
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
        Logger.d("AppLovinNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/AppLovinNetworkBridge;->webviewLoadDataWithBaseURL(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        try {
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                Logger.d("SafeDKNetwork", "webviewLoadDataWithBaseURL: ", baseUrl, ", WebView address : ", targetInstance.toString(), ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME = ", h.a);
                CreativeInfoManager.a(baseUrl, data, targetInstance, h.a);
                SafeDKWebAppInterface.a(h.a, targetInstance, data, true);
            }
            AdNetworkDiscovery j = CreativeInfoManager.j(h.a);
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

    public static void webviewLoadData(WebView targetInstance, String data, String mimeType, String encoding) {
        Logger.d("AppLovinNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/AppLovinNetworkBridge;->webviewLoadData(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        try {
            boolean z = SafeDK.getInstance() != null && SafeDK.getInstance().p();
            Logger.d("SafeDKNetwork", "webviewLoadData invoked, WebView address : ", targetInstance, ", isSafeDKInitialized = ", Boolean.valueOf(z), ", SDK_PACKAGE_NAME = ", h.a);
            if (z) {
                CreativeInfoManager.a((String) null, data, targetInstance, h.a);
                SafeDKWebAppInterface.a(h.a, targetInstance, data, true);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewLoadData exception", th);
        }
        targetInstance.loadData(data, mimeType, encoding);
    }

    public static String stringInit(byte[] bytes, String charSet) throws UnsupportedEncodingException {
        Logger.d("AppLovinNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/AppLovinNetworkBridge;->stringInit([BLjava/lang/String;)Ljava/lang/String;");
        String str = new String(bytes, charSet);
        try {
            if (SafeDK.ad()) {
                CreativeInfoManager.c(h.a, str);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "stringInit exception", th);
        }
        return str;
    }
}
