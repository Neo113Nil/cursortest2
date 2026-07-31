package com.safedk.android.internal.partials;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;

/* compiled from: LiftoffMonetizeSourceFile */
/* loaded from: classes7.dex */
public class LiftoffMonetizeNetworkBridge {
    public static void webviewLoadUrl(WebView targetInstance, String url) {
        Logger.d("LiftoffMonetizeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/LiftoffMonetizeNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;)V");
        try {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: ", url, ", WebView address : ", targetInstance.toString(), ", SDK_PACKAGE_NAME = ", h.d);
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                if (!TextUtils.isEmpty(url) && !url.startsWith("javascript:")) {
                    NetworkBridge.logWebviewLoadURLRequest(h.d, targetInstance, url);
                    AdNetworkDiscovery j = CreativeInfoManager.j(h.d);
                    if (j != null && j.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                        CreativeInfoManager.a(url, (String) null, targetInstance, h.d);
                    }
                    SafeDKWebAppInterface.a(h.d, targetInstance, url, true);
                }
                Logger.d("SafeDKNetwork", "webviewLoadUrl2 loadUrl url is null or a javascript command : ", url);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewLoadUrl2 exception", th);
        }
        targetInstance.loadUrl(url);
    }

    public static Response okhttp3CallExecute(Call targetInstance) throws IOException {
        Logger.d("LiftoffMonetizeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/LiftoffMonetizeNetworkBridge;->okhttp3CallExecute(Lokhttp3/Call;)Lokhttp3/Response;");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            try {
                Request request = targetInstance.request();
                int identityHashCode = System.identityHashCode(request);
                String url = request.url().getUrl();
                NetworkBridge.RequestInfo requestInfo = NetworkBridge.d.get(Integer.valueOf(identityHashCode));
                if (requestInfo == null) {
                    requestInfo = new NetworkBridge.RequestInfo(h.d, url);
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

    public static void okhttp3CallEnqueue(Call targetInstance, Callback responseCallback) {
        Logger.d("LiftoffMonetizeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/LiftoffMonetizeNetworkBridge;->okhttp3CallEnqueue(Lokhttp3/Call;Lokhttp3/Callback;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            try {
                Request request = targetInstance.request();
                int identityHashCode = System.identityHashCode(request);
                String url = request.url().getUrl();
                NetworkBridge.RequestInfo requestInfo = NetworkBridge.d.get(Integer.valueOf(identityHashCode));
                if (requestInfo == null) {
                    requestInfo = new NetworkBridge.RequestInfo(h.d, url);
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
        Logger.d("LiftoffMonetizeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/LiftoffMonetizeNetworkBridge;->okhttp3Response_body(Lokhttp3/Response;)Lokhttp3/ResponseBody;");
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
        Logger.d("LiftoffMonetizeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/LiftoffMonetizeNetworkBridge;->retrofitExceptionCatchingRequestBody_source(Lokhttp3/ResponseBody;)Lokio/BufferedSource;");
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

    public static void webViewEvaluateJavaScript(WebView webView, String script, ValueCallback<String> resultCallback) {
        String w;
        Logger.d("LiftoffMonetizeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/LiftoffMonetizeNetworkBridge;->webViewEvaluateJavaScript(Landroid/webkit/WebView;Ljava/lang/String;Landroid/webkit/ValueCallback;)V");
        webView.evaluateJavascript(script, resultCallback);
        try {
            String mainSdkPackage = SdksMapping.getMainSdkPackage(h.d);
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
}
