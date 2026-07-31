package com.safedk.android.internal.partials;

import android.text.TextUtils;
import android.webkit.WebView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;

/* compiled from: InMobiSourceFile */
/* loaded from: classes7.dex */
public class InMobiNetworkBridge {
    public static void webviewLoadUrl(WebView targetInstance, String url, Map<String, String> additionalHttpHeaders) {
        Logger.d("InMobiNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/InMobiNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Map;)V");
        try {
            Logger.d("SafeDKNetwork", "webviewLoadUrl. url: ", url, ", WebView address : ", targetInstance.toString(), "  SDK_PACKAGE_NAME = ", h.i);
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                if (!TextUtils.isEmpty(url) && !url.startsWith("javascript:")) {
                    NetworkBridge.logWebviewLoadURLRequest(h.i, targetInstance, url);
                    AdNetworkDiscovery j = CreativeInfoManager.j(h.i);
                    if (j != null && j.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                        CreativeInfoManager.a(url, (String) null, targetInstance, h.i);
                    }
                    SafeDKWebAppInterface.a(h.i, targetInstance, url, true);
                }
                Logger.d("SafeDKNetwork", "webviewLoadUrl loadUrl url is null or a javascript command : ", url);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewLoadUrl exception", th);
        }
        targetInstance.loadUrl(url, additionalHttpHeaders);
    }

    public static void webviewLoadUrl(WebView targetInstance, String url) {
        Logger.d("InMobiNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/InMobiNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;)V");
        try {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: ", url, ", WebView address : ", targetInstance.toString(), ", SDK_PACKAGE_NAME = ", h.i);
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                if (!TextUtils.isEmpty(url) && !url.startsWith("javascript:")) {
                    NetworkBridge.logWebviewLoadURLRequest(h.i, targetInstance, url);
                    AdNetworkDiscovery j = CreativeInfoManager.j(h.i);
                    if (j != null && j.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                        CreativeInfoManager.a(url, (String) null, targetInstance, h.i);
                    }
                    SafeDKWebAppInterface.a(h.i, targetInstance, url, true);
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
        Logger.d("InMobiNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/InMobiNetworkBridge;->webviewLoadDataWithBaseURL(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        try {
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                Logger.d("SafeDKNetwork", "webviewLoadDataWithBaseURL: ", baseUrl, ", WebView address : ", targetInstance.toString(), ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME = ", h.i);
                CreativeInfoManager.a(baseUrl, data, targetInstance, h.i);
                SafeDKWebAppInterface.a(h.i, targetInstance, data, true);
            }
            AdNetworkDiscovery j = CreativeInfoManager.j(h.i);
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
        Logger.d("InMobiNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/InMobiNetworkBridge;->webviewLoadData(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        try {
            boolean z = SafeDK.getInstance() != null && SafeDK.getInstance().p();
            Logger.d("SafeDKNetwork", "webviewLoadData invoked, WebView address : ", targetInstance, ", isSafeDKInitialized = ", Boolean.valueOf(z), ", SDK_PACKAGE_NAME = ", h.i);
            if (z) {
                CreativeInfoManager.a((String) null, data, targetInstance, h.i);
                SafeDKWebAppInterface.a(h.i, targetInstance, data, true);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewLoadData exception", th);
        }
        targetInstance.loadData(data, mimeType, encoding);
    }

    public static void webviewAddJavascriptInterface(WebView targetInstance, Object object, String name) {
        Logger.d("InMobiNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/InMobiNetworkBridge;->webviewAddJavascriptInterface(Landroid/webkit/WebView;Ljava/lang/Object;Ljava/lang/String;)V");
        try {
            Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, WebView address: ", targetInstance, ", SDK_PACKAGE_NAME: ", h.i, " object is: ", object, " and name: ", name);
            AdNetworkDiscovery j = CreativeInfoManager.j(h.i);
            if (j != null) {
                j.a(targetInstance, object);
            } else {
                Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, discovery not found for sdk: ", h.i, ", add to pending list");
                d.b(targetInstance, object);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewAddJavascriptInterface exception", th);
        }
        targetInstance.addJavascriptInterface(object, name);
    }

    public static void okhttp3CallEnqueue(Call targetInstance, Callback responseCallback) {
        Logger.d("InMobiNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/InMobiNetworkBridge;->okhttp3CallEnqueue(Lokhttp3/Call;Lokhttp3/Callback;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            try {
                Request request = targetInstance.request();
                int identityHashCode = System.identityHashCode(request);
                String url = request.url().getUrl();
                NetworkBridge.RequestInfo requestInfo = NetworkBridge.d.get(Integer.valueOf(identityHashCode));
                if (requestInfo == null) {
                    requestInfo = new NetworkBridge.RequestInfo(h.i, url);
                } else {
                    requestInfo.a(url);
                }
                NetworkBridge.d.put(Integer.valueOf(identityHashCode), requestInfo);
                Logger.d("SafeDKNetwork", "retrofitokhttp3Call_enqueue request id:", Integer.valueOf(identityHashCode), ", RequestInfo:", requestInfo, ", isOnUiThread = ", Boolean.valueOf(n.c()));
            } catch (Throwable th) {
                Logger.d("SafeDKNetwork", "retrofit|okhttp3.Call enqueue error ", th.getMessage());
            }
        }
        targetInstance.enqueue(responseCallback);
    }

    public static ResponseBody okhttp3Response_body(Response targetInstance) {
        Logger.d("InMobiNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/InMobiNetworkBridge;->okhttp3Response_body(Lokhttp3/Response;)Lokhttp3/ResponseBody;");
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

    public static BufferedSource retrofitExceptionCatchingRequestBody_source(ResponseBody targetInstance) {
        Logger.d("InMobiNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/InMobiNetworkBridge;->retrofitExceptionCatchingRequestBody_source(Lokhttp3/ResponseBody;)Lokio/BufferedSource;");
        BufferedSource bodySource = targetInstance.getBodySource();
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            try {
                int identityHashCode = System.identityHashCode(targetInstance);
                Logger.d("SafeDKNetwork", "retrofit|retrofitExceptionCatchingRequestBody_source bodyId ", Integer.valueOf(identityHashCode), " retroReq ", NetworkBridge.d, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                NetworkBridge.RequestInfo requestInfo = NetworkBridge.d.get(Integer.valueOf(identityHashCode));
                if (requestInfo != null) {
                    bodySource = CreativeInfoManager.a(requestInfo.a(), requestInfo.b(), bodySource, identityHashCode);
                    Logger.d("SafeDKNetwork", "retrofit|retrofitExceptionCatchingRequestBody_source found responseBodyId:", Integer.valueOf(identityHashCode), ", RequestInfo:", requestInfo, ", returning Source: ", bodySource);
                    return bodySource;
                }
                return bodySource;
            } catch (Throwable th) {
                Logger.d("SafeDKNetwork", "retrofit|retrofitExceptionCatchingRequestBody_source error ", th.getMessage());
                return bodySource;
            }
        }
        return bodySource;
    }
}
