package com.safedk.android.internal.partials;

import android.text.TextUtils;
import android.webkit.WebView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.f;
import com.safedk.android.internal.partials.NetworkBridge;
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
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: DTExchangeSourceFile */
/* loaded from: classes7.dex */
public class DTExchangeNetworkBridge {
    public static InputStream urlConnectionGetInputStream(URLConnection targetInstance) throws IOException {
        Logger.d("DTExchangeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/DTExchangeNetworkBridge;->urlConnectionGetInputStream(Ljava/net/URLConnection;)Ljava/io/InputStream;");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p() && targetInstance.getURL() != null) {
            try {
                String url = targetInstance.getURL().toString();
                Logger.d("SafeDKNetwork", "urlConnectionGetInputStream : ", url, ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME =  ", h.p);
                Map<String, List<String>> headerFields = targetInstance.getHeaderFields();
                InputStream inputStream = null;
                try {
                    inputStream = targetInstance.getInputStream();
                } catch (Throwable th) {
                    Logger.d("SafeDKNetwork", "Exception in urlConnectionGetInputStream : ", th.getMessage());
                }
                InputStream a = CreativeInfoManager.a(h.p, url, inputStream, headerFields);
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
        Logger.d("DTExchangeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/DTExchangeNetworkBridge;->urlConnectionGetOutputStream(Ljava/net/URLConnection;)Ljava/io/OutputStream;");
        OutputStream outputStream = targetInstance.getOutputStream();
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p() && targetInstance.getURL() != null) {
            try {
                String url = targetInstance.getURL().toString();
                Logger.d("SafeDKNetwork", "urlConnectionGetOutputStream url=", url, ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME = ", h.p);
                return CreativeInfoManager.a(h.p, url, outputStream);
            } catch (Throwable th) {
                Logger.e("SafeDKNetwork", "urlConnectionGetOutputStream exception", th);
            }
        }
        return outputStream;
    }

    public static int httpUrlConnectionGetResponseCode(HttpURLConnection targetInstance) throws IOException {
        String str;
        Logger.d("DTExchangeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/DTExchangeNetworkBridge;->httpUrlConnectionGetResponseCode(Ljava/net/HttpURLConnection;)I");
        int responseCode = targetInstance.getResponseCode();
        try {
            if (targetInstance.getURL() == null) {
                str = null;
            } else {
                str = targetInstance.getURL().toString();
            }
            Logger.d("SafeDKNetwork", "httpUrlConnectionGetResponseCode - sdk=", h.p, ", response code= ", Integer.valueOf(responseCode), ", url= ", str);
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p() && responseCode >= 200 && responseCode < 300 && CreativeInfoManager.a(h.p, AdNetworkConfiguration.USE_INPUT_STREAM_EVENT_AS_RESOURCE_LOADED_INDICATION, false)) {
                CreativeInfoManager.onResourceLoaded(h.p, null, str);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "httpUrlConnectionGetResponseCode exception", th);
        }
        return responseCode;
    }

    public static void httpUrlConnectionDisconnect(HttpURLConnection targetInstance) {
        Logger.d("DTExchangeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/DTExchangeNetworkBridge;->httpUrlConnectionDisconnect(Ljava/net/HttpURLConnection;)V");
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
        Logger.d("DTExchangeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/DTExchangeNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;)V");
        try {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: ", url, ", WebView address : ", targetInstance.toString(), ", SDK_PACKAGE_NAME = ", h.p);
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                if (!TextUtils.isEmpty(url) && !url.startsWith("javascript:")) {
                    NetworkBridge.logWebviewLoadURLRequest(h.p, targetInstance, url);
                    AdNetworkDiscovery j = CreativeInfoManager.j(h.p);
                    if (j != null && j.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                        CreativeInfoManager.a(url, (String) null, targetInstance, h.p);
                    }
                    SafeDKWebAppInterface.a(h.p, targetInstance, url, true);
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
        Logger.d("DTExchangeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/DTExchangeNetworkBridge;->webviewLoadDataWithBaseURL(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        try {
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                Logger.d("SafeDKNetwork", "webviewLoadDataWithBaseURL: ", baseUrl, ", WebView address : ", targetInstance.toString(), ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME = ", h.p);
                CreativeInfoManager.a(baseUrl, data, targetInstance, h.p);
                SafeDKWebAppInterface.a(h.p, targetInstance, data, true);
            }
            AdNetworkDiscovery j = CreativeInfoManager.j(h.p);
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
        Logger.d("DTExchangeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/DTExchangeNetworkBridge;->webviewLoadData(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        try {
            boolean z = SafeDK.getInstance() != null && SafeDK.getInstance().p();
            Logger.d("SafeDKNetwork", "webviewLoadData invoked, WebView address : ", targetInstance, ", isSafeDKInitialized = ", Boolean.valueOf(z), ", SDK_PACKAGE_NAME = ", h.p);
            if (z) {
                CreativeInfoManager.a((String) null, data, targetInstance, h.p);
                SafeDKWebAppInterface.a(h.p, targetInstance, data, true);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewLoadData exception", th);
        }
        targetInstance.loadData(data, mimeType, encoding);
    }

    public static void webviewAddJavascriptInterface(WebView targetInstance, Object object, String name) {
        Logger.d("DTExchangeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/DTExchangeNetworkBridge;->webviewAddJavascriptInterface(Landroid/webkit/WebView;Ljava/lang/Object;Ljava/lang/String;)V");
        try {
            Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, WebView address: ", targetInstance, ", SDK_PACKAGE_NAME: ", h.p, " object is: ", object, " and name: ", name);
            AdNetworkDiscovery j = CreativeInfoManager.j(h.p);
            if (j != null) {
                j.a(targetInstance, object);
            } else {
                Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, discovery not found for sdk: ", h.p, ", add to pending list");
                d.b(targetInstance, object);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewAddJavascriptInterface exception", th);
        }
        targetInstance.addJavascriptInterface(object, name);
    }

    public static Response okhttp3CallExecute(Call targetInstance) throws IOException {
        Logger.d("DTExchangeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/DTExchangeNetworkBridge;->okhttp3CallExecute(Lokhttp3/Call;)Lokhttp3/Response;");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            try {
                Request request = targetInstance.request();
                int identityHashCode = System.identityHashCode(request);
                String url = request.url().getUrl();
                NetworkBridge.RequestInfo requestInfo = NetworkBridge.d.get(Integer.valueOf(identityHashCode));
                if (requestInfo == null) {
                    requestInfo = new NetworkBridge.RequestInfo(h.p, url);
                } else {
                    requestInfo.a(url);
                }
                NetworkBridge.d.put(Integer.valueOf(identityHashCode), requestInfo);
                Logger.d("SafeDKNetwork", "retrofitCall_execute request id:", Integer.valueOf(identityHashCode), ", RequestInfo:", requestInfo, ", isOnUiThread = ", Boolean.valueOf(n.c()));
            } catch (Throwable th) {
                Logger.d("SafeDKNetwork", "retrofit|okhttp3 okhttp3.Call execute error ", th.getMessage());
            }
        }
        return targetInstance.execute();
    }

    public static ResponseBody okhttp3Response_body(Response targetInstance) {
        Logger.d("DTExchangeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/DTExchangeNetworkBridge;->okhttp3Response_body(Lokhttp3/Response;)Lokhttp3/ResponseBody;");
        ResponseBody body = targetInstance.body();
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            try {
                int identityHashCode = System.identityHashCode(targetInstance);
                NetworkBridge.RequestInfo remove = NetworkBridge.d.remove(Integer.valueOf(identityHashCode));
                Logger.d("SafeDKNetwork", "retrofitokhttp3Response_body response id ", Integer.valueOf(identityHashCode), ", info ", remove, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                if (remove == null) {
                    Logger.d("SafeDKNetwork", "retrofitokhttp3Response_body, skipping response Id:", Integer.valueOf(identityHashCode));
                } else {
                    int identityHashCode2 = System.identityHashCode(body);
                    NetworkBridge.d.put(Integer.valueOf(identityHashCode2), remove);
                    Logger.d("SafeDKNetwork", "retrofitokhttp3Response_body, removing response Id:", Integer.valueOf(identityHashCode), ", adding  responseBodyId:", Integer.valueOf(identityHashCode2), ", RequestInfo:", remove);
                }
            } catch (Throwable th) {
                Logger.d("SafeDKNetwork", "retrofitokhttp3Response_body error ", th.getMessage());
            }
        }
        return body;
    }
}
