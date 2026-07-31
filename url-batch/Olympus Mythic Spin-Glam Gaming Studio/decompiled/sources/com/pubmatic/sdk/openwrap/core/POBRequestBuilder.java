package com.pubmatic.sdk.openwrap.core;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBRequestBuilding;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBAppInfo;
import com.pubmatic.sdk.common.models.POBApplicationInfo;
import com.pubmatic.sdk.common.models.POBDeviceInfo;
import com.pubmatic.sdk.common.network.POBHttpRequest;
import com.pubmatic.sdk.common.utility.POBLocationDetector;
import com.pubmatic.sdk.common.utility.POBUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class POBRequestBuilder implements POBRequestBuilding {
    private final String a;
    private final POBRequest b;
    private final Context c;
    private final Boolean d;
    private POBLocationDetector e;
    private POBDeviceInfo f;
    private POBAppInfo g;

    public POBRequestBuilder(@NonNull POBRequest pOBRequest, @NonNull String str, @NonNull Context context) {
        this.c = context.getApplicationContext();
        this.a = str;
        this.b = pOBRequest;
        this.d = Boolean.valueOf(POBUtils.isDebugBuild(context));
    }

    private JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("profileid", this.b.getProfileId());
            jSONObject2.put(POBConstants.KEY_CLIENT_CONFIG, 1);
            jSONObject.put(POBConstants.KEY_WRAPPER, jSONObject2);
            if (this.b.a()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("returnallbidstatus", true);
                jSONObject.put(POBConstants.KEY_PREBID, jSONObject3);
                return jSONObject;
            }
        } catch (JSONException e) {
            POBLog.error("POBRequestBuilder", "Exception occurred in getExtObject() : " + e.getMessage(), new Object[0]);
        }
        return jSONObject;
    }

    private String b() {
        String adServerUrl = this.b.getAdServerUrl();
        if (adServerUrl == null) {
            adServerUrl = this.a;
        }
        return this.b.isDebugStateEnabled() ? POBUtils.buildUrlWithQueryParam(adServerUrl, "debug", "1") : adServerUrl;
    }

    private void c() {
        POBDeviceInfo pOBDeviceInfo = this.f;
        if (pOBDeviceInfo != null) {
            pOBDeviceInfo.refreshAdvertisingIdInfo();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBRequestBuilding
    public POBHttpRequest build() {
        return prepareHttpRequest(b(), getBody().toString(), POBConstants.ORTB_VERSION);
    }

    public JSONObject getAppJson(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            POBAppInfo pOBAppInfo = this.g;
            if (pOBAppInfo != null) {
                POBCommonOrtbJsonHelper.addParamToJson(jSONObject, "name", pOBAppInfo.getAppName());
                POBCommonOrtbJsonHelper.addParamToJson(jSONObject, POBConstants.KEY_BUNDLE, this.g.getPackageName());
            }
            POBApplicationInfo applicationInfo = POBInstanceProvider.getSdkConfig().getApplicationInfo();
            if (applicationInfo != null) {
                POBCommonOrtbJsonHelper.addParamToJson(jSONObject, "domain", applicationInfo.getDomain());
                if (applicationInfo.getStoreURL() != null) {
                    POBCommonOrtbJsonHelper.addParamToJson(jSONObject, POBConstants.KEY_STORE_URL, applicationInfo.getStoreURL().toString());
                } else {
                    POBLog.warn("POBRequestBuilder", "Missing \"storeURL\" in the request. It is required for platform identification", new Object[0]);
                }
                Boolean isPaid = applicationInfo.isPaid();
                if (isPaid != null) {
                    jSONObject.put(POBConstants.KEY_PAID, isPaid.booleanValue() ? 1 : 0);
                }
                if (applicationInfo.getCategories() != null) {
                    jSONObject.put(POBConstants.KEY_CATEGORY, new JSONArray(applicationInfo.getCategories().split(StringUtils.COMMA)));
                }
                if (!POBUtils.isNullOrEmpty(applicationInfo.getKeywords())) {
                    jSONObject.put("keywords", applicationInfo.getKeywords());
                }
            }
            POBAppInfo pOBAppInfo2 = this.g;
            if (pOBAppInfo2 != null) {
                jSONObject.put("ver", pOBAppInfo2.getAppVersion());
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("publisher", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            POBLog.error("POBRequestBuilder", "Exception occurred in getAppJson() : " + e.getMessage(), new Object[0]);
            return jSONObject;
        }
    }

    public JSONObject getBody() {
        c();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", UUID.randomUUID().toString());
            jSONObject.put(POBConstants.KEY_AT, 1);
            jSONObject.put(POBConstants.KEY_IMPRESSION, POBCommonOrtbJsonHelper.getImpressionJsonArray(this.b));
            jSONObject.put("app", getAppJson(this.b.getPubId()));
            jSONObject.put("device", POBCommonOrtbJsonHelper.getDeviceObject(this.f, this.e, this.c));
            if (POBInstanceProvider.getSdkConfig().getMeasurementProvider(POBCommonConstants.HTML_MEASUREMENT_PROVIDER_CLASS) != null) {
                jSONObject.put("source", POBCommonOrtbJsonHelper.getMeasurementJson());
            }
            JSONObject userJson = POBCommonOrtbJsonHelper.getUserJson(this.c, this.b.getPlacementType());
            if (userJson.length() > 0) {
                jSONObject.put(POBConstants.KEY_USER, userJson);
            }
            if (this.b.getTestMode() != null && this.b.getTestMode().booleanValue()) {
                jSONObject.put(POBConstants.TEST_MODE, 1);
            }
            JSONObject regsJson = POBCommonOrtbJsonHelper.getRegsJson(this.c);
            if (regsJson != null && regsJson.length() > 0) {
                jSONObject.put(POBConstants.KEY_REGS, regsJson);
            }
            jSONObject.put("ext", a());
            return jSONObject;
        } catch (JSONException e) {
            POBLog.error("POBRequestBuilder", "Exception occurred in getBody() : " + e.getMessage(), new Object[0]);
            return jSONObject;
        }
    }

    @NonNull
    public POBHttpRequest prepareHttpRequest(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/json");
        if (str3 != null) {
            hashMap.put(POBConstants.ORTB_VERSION_PARAM, str3);
        }
        POBHttpRequest pOBHttpRequest = new POBHttpRequest();
        pOBHttpRequest.setRequestMethod(POBHttpRequest.HTTP_METHOD.POST);
        pOBHttpRequest.setPostData(str2);
        pOBHttpRequest.setUrl(str);
        pOBHttpRequest.setTimeout(this.b.getNetworkTimeout() * 1000);
        pOBHttpRequest.setRequestTag(String.valueOf(hashCode()));
        pOBHttpRequest.setHeaders(hashMap);
        return pOBHttpRequest;
    }

    @Override // com.pubmatic.sdk.common.base.POBRequestBuilding
    public void setAppInfo(@Nullable POBAppInfo pOBAppInfo) {
        this.g = pOBAppInfo;
    }

    @Override // com.pubmatic.sdk.common.base.POBRequestBuilding
    public void setDeviceInfo(@Nullable POBDeviceInfo pOBDeviceInfo) {
        this.f = pOBDeviceInfo;
    }

    @Override // com.pubmatic.sdk.common.base.POBRequestBuilding
    public void setLocationDetector(@Nullable POBLocationDetector pOBLocationDetector) {
        this.e = pOBLocationDetector;
    }
}
