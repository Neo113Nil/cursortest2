package com.smaato.sdk.ng.api;

import android.content.Context;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.AdRequest;
import com.smaato.sdk.ng.models.AdResponse;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public interface ApiClient {

    public interface AdRequestListener {
        void onFailure(Throwable th);

        void onSuccess(Ad ad);
    }

    public interface TrackJSListener {
        void onFailure(Throwable th);

        void onSuccess(String str);
    }

    public interface TrackUrlListener {
        void onFailure(Throwable th);

        void onFinally(String str, String str2, int i);

        void onSuccess();
    }

    void getAd(AdRequest adRequest, String str, AdRequestListener adRequestListener);

    void getAd(String str, String str2, AdRequestListener adRequestListener);

    String getApiUrl();

    Context getContext();

    JSONObject getPlacementParams();

    void processStream(AdResponse adResponse, Exception exc, AdRequestListener adRequestListener);

    void processStream(String str, AdRequestListener adRequestListener);

    void processStream(String str, AdRequest adRequest, Integer num, Integer num2, AdRequestListener adRequestListener);

    void setApiUrl(String str);

    void setCustomUrl(String str);

    void trackJS(String str, TrackJSListener trackJSListener);

    void trackUrl(String str, String str2, String str3, TrackUrlListener trackUrlListener);
}
