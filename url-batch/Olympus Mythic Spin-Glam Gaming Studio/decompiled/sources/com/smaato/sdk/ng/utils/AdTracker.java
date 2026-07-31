package com.smaato.sdk.ng.utils;

import android.text.TextUtils;
import com.smaato.sdk.ng.DeviceInfo;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.analytics.tracker.ReportingTracker;
import com.smaato.sdk.ng.api.ApiClient;
import com.smaato.sdk.ng.api.NGSDKApiClient;
import com.smaato.sdk.ng.models.AdData;
import com.smaato.sdk.ng.utils.json.JsonOperations;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class AdTracker {
    private static final String p = "AdTracker";
    private final NGSDKApiClient a;
    private final DeviceInfo b;
    private final List<AdData> c;
    private final List<AdData> d;
    private final List<AdData> e;
    private final List<AdData> f;
    private final List<AdData> g;
    private final JSONObject h;
    private final Set<Integer> i;
    private final Set<Integer> j;
    private final Set<Integer> k;
    private boolean l;
    private boolean m;
    private ApiClient.TrackUrlListener n;
    private final ApiClient.TrackJSListener o;

    class a implements ApiClient.TrackUrlListener {
        a() {
        }

        @Override // com.smaato.sdk.ng.api.ApiClient.TrackUrlListener
        public void onFailure(Throwable th) {
        }

        @Override // com.smaato.sdk.ng.api.ApiClient.TrackUrlListener
        public void onFinally(String str, String str2, int i) {
            if (NextGen.getReportingController() != null) {
                NextGen.getReportingController().reportFiredTracker(new ReportingTracker(str2, str, i));
            }
        }

        @Override // com.smaato.sdk.ng.api.ApiClient.TrackUrlListener
        public void onSuccess() {
        }
    }

    class b implements ApiClient.TrackJSListener {
        b() {
        }

        @Override // com.smaato.sdk.ng.api.ApiClient.TrackJSListener
        public void onFailure(Throwable th) {
        }

        @Override // com.smaato.sdk.ng.api.ApiClient.TrackJSListener
        public void onSuccess(String str) {
            if (NextGen.getReportingController() != null) {
                NextGen.getReportingController().reportFiredTracker(new ReportingTracker("JavaScript", str));
            }
        }
    }

    private enum c {
        IMPRESSION("impression"),
        CLICK("click"),
        SDK_EVENT("sdk_event"),
        COMPANION_AD_EVENT("companion_ad_event"),
        CUSTOM_ENDCARD_EVENT("custom_endcard_event");

        private final String a;

        c(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }

    public AdTracker(List<AdData> list, List<AdData> list2) {
        this(NextGen.getApiClient(), NextGen.getDeviceInfo(), list, list2, null, null, null);
    }

    private void a(List<AdData> list, c cVar) {
        a(list, cVar, null, null);
    }

    public JSONObject getPlacementParams() {
        return this.h;
    }

    public void setTrackUrlListener(ApiClient.TrackUrlListener trackUrlListener) {
        this.n = trackUrlListener;
    }

    public void trackClick() {
        if (this.m) {
            return;
        }
        a(this.d, c.CLICK);
        this.m = true;
    }

    public void trackCompanionAdEvent(Integer num, Integer num2) {
        if (this.j.add(num)) {
            a(this.f, c.COMPANION_AD_EVENT, num, num2);
        }
    }

    public void trackCustomEndcardEvent(Integer num, Integer num2) {
        if (this.k.add(num)) {
            a(this.g, c.CUSTOM_ENDCARD_EVENT, num, num2);
        }
    }

    public void trackImpression() {
        if (this.l) {
            return;
        }
        a(this.c, c.IMPRESSION);
        this.l = true;
    }

    public void trackSdkEvent(Integer num, Integer num2) {
        if (this.i.add(num)) {
            a(this.e, c.SDK_EVENT, num, num2);
        }
    }

    public AdTracker(List<AdData> list, List<AdData> list2, boolean z) {
        this(NextGen.getApiClient(), NextGen.getDeviceInfo(), list, list2, null, null, null);
        this.m = z;
    }

    private void a(List<AdData> list, c cVar, Integer num, Integer num2) {
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            for (AdData adData : list) {
                if (!TextUtils.isEmpty(adData.getURL()) && URLValidator.isValidURL(adData.getURL())) {
                    Logger.d(p, "Tracking " + cVar.toString() + " url: " + adData.getURL());
                    JsonOperations.putJsonString(jSONArray, adData.getURL());
                    String url = adData.getURL();
                    if (num != null) {
                        url = url.replace("[EVENTTYPE]", num.toString());
                    }
                    if (num2 != null) {
                        url = url.replace("[ERRORCODE]", num2.toString());
                    }
                    this.a.trackUrl(url, this.b.getUserAgent(), cVar.name(), this.n);
                }
                if (!TextUtils.isEmpty(adData.getJS())) {
                    Logger.d(p, "Tracking " + cVar.toString() + " js: " + adData.getJS());
                    JsonOperations.putJsonString(jSONArray, adData.getJS());
                    this.a.trackJS(adData.getJS(), this.o);
                }
            }
            if (cVar == c.CLICK) {
                JsonOperations.putJsonArray(this.h, "fired_clicks", jSONArray);
            } else if (cVar == c.IMPRESSION) {
                JsonOperations.putJsonArray(this.h, "fired_impressions", jSONArray);
            }
        }
    }

    public AdTracker(List<AdData> list, List<AdData> list2, List<AdData> list3, List<AdData> list4, List<AdData> list5) {
        this(NextGen.getApiClient(), NextGen.getDeviceInfo(), list, list2, list3, list4, list5);
    }

    AdTracker(NGSDKApiClient nGSDKApiClient, DeviceInfo deviceInfo, List<AdData> list, List<AdData> list2, List<AdData> list3, List<AdData> list4, List<AdData> list5) {
        this.i = new HashSet();
        this.j = new HashSet();
        this.k = new HashSet();
        this.a = nGSDKApiClient;
        this.b = deviceInfo;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = list5;
        this.h = new JSONObject();
        this.n = new a();
        this.o = new b();
    }
}
