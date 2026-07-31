package com.smaato.sdk.ng.api;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.smaato.sdk.ng.BuildConfig;
import com.smaato.sdk.ng.NextGenError;
import com.smaato.sdk.ng.NextGenErrorCode;
import com.smaato.sdk.ng.api.ApiClient;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.AdRequest;
import com.smaato.sdk.ng.models.AdResponse;
import com.smaato.sdk.ng.models.NGSDKAdRequest;
import com.smaato.sdk.ng.network.NGSDKHttpClient;
import com.smaato.sdk.ng.utils.AdRequestRegistry;
import com.smaato.sdk.ng.utils.NGSDKApiUrlComposer;
import com.smaato.sdk.ng.utils.json.JsonOperations;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class NGSDKApiClient implements ApiClient {
    public static final /* synthetic */ int d = 0;
    private final Context a;
    private String b = BuildConfig.BASE_URL;
    private JSONObject c;

    class a implements NGSDKHttpClient.Listener {
        final /* synthetic */ String a;
        final /* synthetic */ long b;
        final /* synthetic */ ApiClient.AdRequestListener c;

        a(String str, long j, ApiClient.AdRequestListener adRequestListener) {
            this.a = str;
            this.b = j;
            this.c = adRequestListener;
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onFailure(Throwable th) {
            NGSDKApiClient.this.a(this.a, th.getMessage(), this.b);
            if (this.c != null) {
                NextGenErrorCode nextGenErrorCode = NextGenErrorCode.SERVER_ERROR_PREFIX;
                nextGenErrorCode.getMessage();
                th.getMessage();
                this.c.onFailure(new NextGenError(nextGenErrorCode, th));
            }
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onSuccess(String str, Map<String, List<String>> map) {
            NGSDKApiClient.this.a(this.a, str, this.b);
            NGSDKApiClient.this.processStream(str, this.c);
        }
    }

    class b implements NGSDKHttpClient.Listener {
        final /* synthetic */ ApiClient.TrackUrlListener a;
        final /* synthetic */ String b;

        b(ApiClient.TrackUrlListener trackUrlListener, String str) {
            this.a = trackUrlListener;
            this.b = str;
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onFailure(Throwable th) {
            ApiClient.TrackUrlListener trackUrlListener = this.a;
            if (trackUrlListener != null) {
                trackUrlListener.onFailure(new NextGenError(NextGenErrorCode.ERROR_TRACKING_URL, th));
            }
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onFinally(String str, int i) {
            this.a.onFinally(str, this.b, i);
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onSuccess(String str, Map<String, List<String>> map) {
            ApiClient.TrackUrlListener trackUrlListener = this.a;
            if (trackUrlListener != null) {
                trackUrlListener.onSuccess();
            }
        }
    }

    public NGSDKApiClient(Context context) {
        this.a = context;
    }

    private void a(String str, String str2, String str3, ApiClient.TrackUrlListener trackUrlListener) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("User-Agent", str2);
        }
        NGSDKHttpClient.makeRequest(this.a, str, hashMap, null, false, true, new b(trackUrlListener, str3));
    }

    @Override // com.smaato.sdk.ng.api.ApiClient
    public void getAd(AdRequest adRequest, String str, ApiClient.AdRequestListener adRequestListener) {
        getAd(a(adRequest), str, adRequestListener);
    }

    @Override // com.smaato.sdk.ng.api.ApiClient
    public String getApiUrl() {
        return this.b;
    }

    @Override // com.smaato.sdk.ng.api.ApiClient
    public Context getContext() {
        return this.a;
    }

    @Override // com.smaato.sdk.ng.api.ApiClient
    public JSONObject getPlacementParams() {
        return this.c;
    }

    @Override // com.smaato.sdk.ng.api.ApiClient
    public void processStream(String str, ApiClient.AdRequestListener adRequestListener) {
        AdResponse adResponse = null;
        try {
            AdResponse adResponse2 = new AdResponse(new JSONObject(str));
            e = null;
            adResponse = adResponse2;
        } catch (Error e) {
            e = new NextGenError(NextGenErrorCode.PARSER_ERROR, e);
        } catch (Exception e2) {
            e = e2;
        }
        processStream(adResponse, e, adRequestListener);
    }

    @Override // com.smaato.sdk.ng.api.ApiClient
    public void setApiUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b = str;
    }

    @Override // com.smaato.sdk.ng.api.ApiClient
    public void setCustomUrl(String str) {
    }

    @Override // com.smaato.sdk.ng.api.ApiClient
    @SuppressLint({"SetJavaScriptEnabled", "ObsoleteSdkInt"})
    public void trackJS(String str, ApiClient.TrackJSListener trackJSListener) {
        if (TextUtils.isEmpty(str)) {
            if (trackJSListener != null) {
                trackJSListener.onFailure(new NextGenError(NextGenErrorCode.ERROR_TRACKING_JS, "Empty JS tracking beacon"));
                return;
            }
            return;
        }
        try {
            WebView webView = new WebView(this.a);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.evaluateJavascript(a(str), null);
            if (trackJSListener != null) {
                trackJSListener.onSuccess(str);
            }
        } catch (RuntimeException unused) {
            if (trackJSListener != null) {
                trackJSListener.onFailure(new NextGenError(NextGenErrorCode.ERROR_TRACKING_JS, "Error tracking JS beacon. No webview to evaluate JS."));
            }
        }
    }

    @Override // com.smaato.sdk.ng.api.ApiClient
    public void trackUrl(String str, String str2, String str3, ApiClient.TrackUrlListener trackUrlListener) {
        a(str, str2, str3, trackUrlListener);
    }

    @Override // com.smaato.sdk.ng.api.ApiClient
    public void getAd(String str, String str2, ApiClient.AdRequestListener adRequestListener) {
        this.c = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            if (adRequestListener != null) {
                adRequestListener.onFailure(new NextGenError(NextGenErrorCode.INVALID_URL));
            }
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("User-Agent", str2);
            }
            NGSDKHttpClient.makeRequest(this.a, str, hashMap, null, new a(str, currentTimeMillis, adRequestListener));
        }
    }

    private String a(String str) {
        return str.replace("<script>", "").replace("</script>", "");
    }

    protected String a(AdRequest adRequest) {
        return NGSDKApiUrlComposer.buildUrl(this.b, (NGSDKAdRequest) adRequest);
    }

    @Override // com.smaato.sdk.ng.api.ApiClient
    public void processStream(String str, AdRequest adRequest, Integer num, Integer num2, ApiClient.AdRequestListener adRequestListener) {
        processStream(str, adRequestListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        JsonOperations.putJsonString(this.c, "ad_request", str);
        JsonOperations.putJsonString(this.c, "ad_response", str2);
        JsonOperations.putJsonLong(this.c, "response_time", currentTimeMillis);
        AdRequestRegistry.getInstance().setLastAdRequest(str, str2, currentTimeMillis);
    }

    @Override // com.smaato.sdk.ng.api.ApiClient
    public void processStream(AdResponse adResponse, Exception exc, ApiClient.AdRequestListener adRequestListener) {
        if (exc != null) {
            adRequestListener.onFailure(new NextGenError(NextGenErrorCode.PARSER_ERROR, exc));
            return;
        }
        if (adResponse == null) {
            adRequestListener.onFailure(new NextGenError(NextGenErrorCode.PARSER_ERROR));
            return;
        }
        if ("ok".equals(adResponse.status)) {
            List<Ad> list = adResponse.ads;
            if (list != null && !list.isEmpty()) {
                adRequestListener.onSuccess(adResponse.ads.get(0));
                return;
            } else {
                adRequestListener.onFailure(new NextGenError(NextGenErrorCode.NO_FILL));
                return;
            }
        }
        NextGenErrorCode nextGenErrorCode = NextGenErrorCode.SERVER_ERROR_PREFIX;
        nextGenErrorCode.getMessage();
        adRequestListener.onFailure(new NextGenError(nextGenErrorCode, new Exception(adResponse.error_message)));
    }
}
