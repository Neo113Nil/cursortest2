package net.pubnative.lite.sdk.api;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.BuildConfig;
import net.pubnative.lite.sdk.HyBidError;
import net.pubnative.lite.sdk.HyBidErrorCode;
import net.pubnative.lite.sdk.api.ApiClient;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdRequest;
import net.pubnative.lite.sdk.models.AdResponse;
import net.pubnative.lite.sdk.models.PNAdRequest;
import net.pubnative.lite.sdk.network.PNHttpClient;
import net.pubnative.lite.sdk.utils.AdRequestRegistry;
import net.pubnative.lite.sdk.utils.PNApiUrlComposer;
import net.pubnative.lite.sdk.utils.json.JsonOperations;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class PNApiClient implements ApiClient {
    private static final String TAG = "PNApiClient";
    private String mApiUrl = BuildConfig.BASE_URL;
    private final Context mContext;
    private JSONObject mPlacementParams;

    public PNApiClient(Context context) {
        this.mContext = context;
    }

    private String processJS(String str) {
        return str.replace("<script>", "").replace("</script>", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerAdRequest(String str, String str2, long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        JsonOperations.putJsonString(this.mPlacementParams, "ad_request", str);
        JsonOperations.putJsonString(this.mPlacementParams, "ad_response", str2);
        JsonOperations.putJsonLong(this.mPlacementParams, "response_time", currentTimeMillis);
        AdRequestRegistry.getInstance().setLastAdRequest(str, str2, currentTimeMillis);
    }

    private void sendTrackingRequest(String str, String str2, final String str3, final ApiClient.TrackUrlListener trackUrlListener) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("User-Agent", str2);
        }
        PNHttpClient.makeRequest(this.mContext, str, hashMap, null, false, true, new PNHttpClient.Listener() { // from class: net.pubnative.lite.sdk.api.PNApiClient.2
            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
            public void onFailure(Throwable th) {
                ApiClient.TrackUrlListener trackUrlListener2 = trackUrlListener;
                if (trackUrlListener2 != null) {
                    trackUrlListener2.onFailure(new HyBidError(HyBidErrorCode.ERROR_TRACKING_URL, th));
                }
            }

            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
            public void onFinally(String str4, int i) {
                trackUrlListener.onFinally(str4, str3, i);
            }

            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
            public void onSuccess(String str4, Map<String, List<String>> map) {
                ApiClient.TrackUrlListener trackUrlListener2 = trackUrlListener;
                if (trackUrlListener2 != null) {
                    trackUrlListener2.onSuccess();
                }
            }
        });
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void getAd(AdRequest adRequest, String str, ApiClient.AdRequestListener adRequestListener) {
        getAd(getAdRequestURL(adRequest), str, adRequestListener);
    }

    protected String getAdRequestURL(AdRequest adRequest) {
        return PNApiUrlComposer.buildUrl(this.mApiUrl, (PNAdRequest) adRequest);
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public String getApiUrl() {
        return this.mApiUrl;
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public Context getContext() {
        return this.mContext;
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public JSONObject getPlacementParams() {
        return this.mPlacementParams;
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void processStream(String str, ApiClient.AdRequestListener adRequestListener) {
        AdResponse adResponse = null;
        try {
            AdResponse adResponse2 = new AdResponse(new JSONObject(str));
            e = null;
            adResponse = adResponse2;
        } catch (Error e) {
            e = new HyBidError(HyBidErrorCode.PARSER_ERROR, e);
        } catch (Exception e2) {
            e = e2;
        }
        processStream(adResponse, e, adRequestListener);
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void setApiUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mApiUrl = str;
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void setCustomUrl(String str) {
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void trackJS(String str, ApiClient.TrackJSListener trackJSListener) {
        if (TextUtils.isEmpty(str)) {
            if (trackJSListener != null) {
                trackJSListener.onFailure(new HyBidError(HyBidErrorCode.ERROR_TRACKING_JS, "Empty JS tracking beacon"));
                return;
            }
            return;
        }
        try {
            WebView webView = new WebView(this.mContext);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.evaluateJavascript(processJS(str), null);
            if (trackJSListener != null) {
                trackJSListener.onSuccess(str);
            }
        } catch (RuntimeException unused) {
            if (trackJSListener != null) {
                trackJSListener.onFailure(new HyBidError(HyBidErrorCode.ERROR_TRACKING_JS, "Error tracking JS beacon. No webview to evaluate JS."));
            }
        }
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void trackUrl(String str, String str2, String str3, ApiClient.TrackUrlListener trackUrlListener) {
        sendTrackingRequest(str, str2, str3, trackUrlListener);
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void getAd(final String str, String str2, final ApiClient.AdRequestListener adRequestListener) {
        this.mPlacementParams = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            if (adRequestListener != null) {
                adRequestListener.onFailure(new HyBidError(HyBidErrorCode.INVALID_URL));
            }
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("User-Agent", str2);
            }
            PNHttpClient.makeRequest(this.mContext, str, hashMap, null, new PNHttpClient.Listener() { // from class: net.pubnative.lite.sdk.api.PNApiClient.1
                @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                public void onFailure(Throwable th) {
                    PNApiClient.this.registerAdRequest(str, th.getMessage(), currentTimeMillis);
                    if (adRequestListener != null) {
                        String str3 = PNApiClient.TAG;
                        StringBuilder sb = new StringBuilder();
                        HyBidErrorCode hyBidErrorCode = HyBidErrorCode.SERVER_ERROR_PREFIX;
                        sb.append(hyBidErrorCode.getMessage());
                        sb.append(th.getMessage());
                        Log.d(str3, sb.toString());
                        adRequestListener.onFailure(new HyBidError(hyBidErrorCode, th));
                    }
                }

                @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                public void onSuccess(String str3, Map<String, List<String>> map) {
                    PNApiClient.this.registerAdRequest(str, str3, currentTimeMillis);
                    PNApiClient.this.processStream(str3, adRequestListener);
                }
            });
        }
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void processStream(String str, AdRequest adRequest, Integer num, Integer num2, ApiClient.AdRequestListener adRequestListener) {
        processStream(str, adRequestListener);
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void processStream(AdResponse adResponse, Exception exc, ApiClient.AdRequestListener adRequestListener) {
        if (exc != null) {
            adRequestListener.onFailure(new HyBidError(HyBidErrorCode.PARSER_ERROR, exc));
            return;
        }
        if (adResponse == null) {
            adRequestListener.onFailure(new HyBidError(HyBidErrorCode.PARSER_ERROR));
            return;
        }
        if ("ok".equals(adResponse.status)) {
            List<Ad> list = adResponse.ads;
            if (list != null && !list.isEmpty()) {
                adRequestListener.onSuccess(adResponse.ads.get(0));
                return;
            } else {
                adRequestListener.onFailure(new HyBidError(HyBidErrorCode.NO_FILL));
                return;
            }
        }
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        HyBidErrorCode hyBidErrorCode = HyBidErrorCode.SERVER_ERROR_PREFIX;
        sb.append(hyBidErrorCode.getMessage());
        sb.append(adResponse.error_message);
        Log.d(str, sb.toString());
        adRequestListener.onFailure(new HyBidError(hyBidErrorCode, new Exception(adResponse.error_message)));
    }
}
