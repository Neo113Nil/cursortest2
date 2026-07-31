package com.inmobi.media;

import android.os.Build;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.ironsource.X3;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.d0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC3929d0 {
    public static void a(String str, String str2, AdResponse adResponse, C4493y9 c4493y9) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        if (c4493y9 == null) {
            return;
        }
        try {
            int i = 0;
            AdSet adSet = adResponse.getAdSets().get(0);
            String value = adResponse.getRequestId();
            Intrinsics.checkNotNullParameter(SDKConstants.REQUEST_ID, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            Xh xh = c4493y9.a;
            if (xh != null) {
                xh.a(SDKConstants.REQUEST_ID, value);
            }
            String value2 = String.valueOf(adResponse.getPlacementId());
            Intrinsics.checkNotNullParameter(SDKConstants.PARAM_PLACEMENT_ID, "key");
            Intrinsics.checkNotNullParameter(value2, "value");
            Xh xh2 = c4493y9.a;
            if (xh2 != null) {
                xh2.a(SDKConstants.PARAM_PLACEMENT_ID, value2);
            }
            String value3 = String.valueOf(str);
            Intrinsics.checkNotNullParameter("adType", "key");
            Intrinsics.checkNotNullParameter(value3, "value");
            Xh xh3 = c4493y9.a;
            if (xh3 != null) {
                xh3.a("adType", value3);
            }
            String value4 = String.valueOf(str2);
            Intrinsics.checkNotNullParameter("placementType", "key");
            Intrinsics.checkNotNullParameter(value4, "value");
            Xh xh4 = c4493y9.a;
            if (xh4 != null) {
                xh4.a("placementType", value4);
            }
            String value5 = String.valueOf(E1.a);
            Intrinsics.checkNotNullParameter("bundleID", "key");
            Intrinsics.checkNotNullParameter(value5, "value");
            Xh xh5 = c4493y9.a;
            if (xh5 != null) {
                xh5.a("bundleID", value5);
            }
            F5.a.getClass();
            String value6 = (String) F5.j.getSecond();
            Intrinsics.checkNotNullParameter(X3.j.n, "key");
            Intrinsics.checkNotNullParameter(value6, "value");
            Xh xh6 = c4493y9.a;
            if (xh6 != null) {
                xh6.a(X3.j.n, value6);
            }
            String value7 = F5.o();
            Intrinsics.checkNotNullParameter("networkType", "key");
            Intrinsics.checkNotNullParameter(value7, "value");
            Xh xh7 = c4493y9.a;
            if (xh7 != null) {
                xh7.a("networkType", value7);
            }
            String value8 = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(value8, "MODEL");
            Intrinsics.checkNotNullParameter("deviceModel", "key");
            Intrinsics.checkNotNullParameter(value8, "value");
            Xh xh8 = c4493y9.a;
            if (xh8 != null) {
                xh8.a("deviceModel", value8);
            }
            String value9 = String.valueOf(AbstractC4002fj.c);
            Intrinsics.checkNotNullParameter("publisherID", "key");
            Intrinsics.checkNotNullParameter(value9, "value");
            Xh xh9 = c4493y9.a;
            if (xh9 != null) {
                xh9.a("publisherID", value9);
            }
            Intrinsics.checkNotNullParameter("sdkVersion", "key");
            Intrinsics.checkNotNullParameter("11.3.0", "value");
            Xh xh10 = c4493y9.a;
            if (xh10 != null) {
                xh10.a("sdkVersion", "11.3.0");
            }
            String value10 = String.valueOf(AbstractC4030gj.b);
            Intrinsics.checkNotNullParameter("tpName", "key");
            Intrinsics.checkNotNullParameter(value10, "value");
            Xh xh11 = c4493y9.a;
            if (xh11 != null) {
                xh11.a("tpName", value10);
            }
            String value11 = String.valueOf(AbstractC4030gj.a);
            Intrinsics.checkNotNullParameter("tpVersion", "key");
            Intrinsics.checkNotNullParameter(value11, "value");
            Xh xh12 = c4493y9.a;
            if (xh12 != null) {
                xh12.a("tpVersion", value11);
            }
            Intrinsics.checkNotNullParameter("source", "key");
            Intrinsics.checkNotNullParameter("sdk_android", "value");
            Xh xh13 = c4493y9.a;
            if (xh13 != null) {
                xh13.a("source", "sdk_android");
            }
            String value12 = AbstractC4030gj.a();
            Intrinsics.checkNotNullParameter("mkVersion", "key");
            Intrinsics.checkNotNullParameter(value12, "value");
            Xh xh14 = c4493y9.a;
            if (xh14 != null) {
                xh14.a("mkVersion", value12);
            }
            String value13 = AbstractC4002fj.c();
            Intrinsics.checkNotNullParameter("webViewUserAgent", "key");
            Intrinsics.checkNotNullParameter(value13, "value");
            Xh xh15 = c4493y9.a;
            if (xh15 != null) {
                xh15.a("webViewUserAgent", value13);
            }
            String value14 = String.valueOf(adSet.getIsPod());
            Intrinsics.checkNotNullParameter("sdkAdPod", "key");
            Intrinsics.checkNotNullParameter(value14, "value");
            Xh xh16 = c4493y9.a;
            if (xh16 != null) {
                xh16.a("sdkAdPod", value14);
            }
            String value15 = String.valueOf(adSet.getLogEnabled());
            Intrinsics.checkNotNullParameter("isServerSideLogging", "key");
            Intrinsics.checkNotNullParameter(value15, "value");
            Xh xh17 = c4493y9.a;
            if (xh17 != null) {
                xh17.a("isServerSideLogging", value15);
            }
            String value16 = adSet.getTransactionId();
            if (value16 == null) {
                value16 = "Not Set";
            }
            Intrinsics.checkNotNullParameter("transactionID", "key");
            Intrinsics.checkNotNullParameter(value16, "value");
            Xh xh18 = c4493y9.a;
            if (xh18 != null) {
                xh18.a("transactionID", value16);
            }
            String value17 = a();
            Intrinsics.checkNotNullParameter("configData", "key");
            Intrinsics.checkNotNullParameter(value17, "value");
            Xh xh19 = c4493y9.a;
            if (xh19 != null) {
                xh19.a("configData", value17);
            }
            if (adSet.getIsPod()) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (adSet.getAds().isEmpty()) {
                    c4493y9.b("AdLogResponseHandler", "no ads. cannot update vitals");
                } else {
                    for (Object obj : adSet.getAds()) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        com.inmobi.media.ads.network.common.model.Ad ad = (com.inmobi.media.ads.network.common.model.Ad) obj;
                        arrayList.add(i, ad.getCreativeId());
                        arrayList2.add(i, ad.getImpressionId());
                        i = i2;
                    }
                    String value18 = CollectionsKt.joinToString$default(arrayList, " , ", null, null, 0, null, null, 62, null);
                    Intrinsics.checkNotNullParameter("creativeID", "key");
                    Intrinsics.checkNotNullParameter(value18, "value");
                    Xh xh20 = c4493y9.a;
                    if (xh20 != null) {
                        xh20.a("creativeID", value18);
                    }
                    String value19 = CollectionsKt.joinToString$default(arrayList2, " , ", null, null, 0, null, null, 62, null);
                    Intrinsics.checkNotNullParameter("impressionID", "key");
                    Intrinsics.checkNotNullParameter(value19, "value");
                    Xh xh21 = c4493y9.a;
                    if (xh21 != null) {
                        xh21.a("impressionID", value19);
                    }
                }
            } else if (adSet.getAds().isEmpty()) {
                c4493y9.b("AdLogResponseHandler", "no ads. cannot update vitals");
            } else {
                com.inmobi.media.ads.network.common.model.Ad ad2 = adSet.getAds().get(0);
                String value20 = ad2.getCreativeId();
                Intrinsics.checkNotNullParameter("creativeID", "key");
                Intrinsics.checkNotNullParameter(value20, "value");
                Xh xh22 = c4493y9.a;
                if (xh22 != null) {
                    xh22.a("creativeID", value20);
                }
                String value21 = ad2.getImpressionId();
                Intrinsics.checkNotNullParameter("impressionID", "key");
                Intrinsics.checkNotNullParameter(value21, "value");
                Xh xh23 = c4493y9.a;
                if (xh23 != null) {
                    xh23.a("impressionID", value21);
                }
            }
        } catch (JSONException e) {
            c4493y9.a("AdLogResponseHandler", "error while update vitals", e);
        }
        a(adResponse, c4493y9);
    }

    public static void a(AdResponse adResponse, C4493y9 c4493y9) {
        try {
            boolean logEnabled = adResponse.getAdSets().get(0).getLogEnabled();
            c4493y9.a("AdLogResponseHandler", "server side logger lever - " + logEnabled);
            c4493y9.a(logEnabled);
        } catch (JSONException e) {
            c4493y9.a("AdLogResponseHandler", "error while setting server-side lever", e);
            c4493y9.a(false);
        }
    }

    public static String a() {
        JSONObject jSONObject = new JSONObject();
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        C4277q4 c4277q42 = AbstractC4015g4.a;
        jSONObject.put("root", ((RootConfig) c4277q42.a(RootConfig.class)).getLastUpdateTimeStamp());
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        jSONObject.put("ads", ((AdConfig) c4277q42.a(AdConfig.class)).getLastUpdateTimeStamp());
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        jSONObject.put(TelemetryCategory.TELEMETRY, ((TelemetryConfig) c4277q42.a(TelemetryConfig.class)).getLastUpdateTimeStamp());
        Intrinsics.checkNotNullParameter(CrashConfig.class, "clazz");
        jSONObject.put("crashReporting", ((CrashConfig) c4277q42.a(CrashConfig.class)).getLastUpdateTimeStamp());
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        jSONObject.put("signals", ((SignalsConfig) c4277q42.a(SignalsConfig.class)).getLastUpdateTimeStamp());
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}
