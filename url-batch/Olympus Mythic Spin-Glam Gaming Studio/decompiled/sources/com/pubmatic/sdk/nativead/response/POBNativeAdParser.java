package com.pubmatic.sdk.nativead.response;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import com.pubmatic.sdk.nativead.POBNativeLogConstants;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeDataAssetType;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeEventTrackingMethod;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeEventType;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeImageAssetType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class POBNativeAdParser {
    /* JADX WARN: Removed duplicated region for block: B:27:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List a(JSONArray jSONArray) {
        JSONObject optJSONObject;
        POBNativeAdResponseAsset pOBNativeAdVideoResponseAsset;
        ArrayList arrayList = new ArrayList();
        if (!POBUtils.isJsonArrayNullOrEmpty(jSONArray)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject2 = jSONArray.optJSONObject(i);
                if (!POBUtils.isJsonObjectNullOrEmpty(optJSONObject2) && optJSONObject2.has("id")) {
                    int optInt = optJSONObject2.optInt("id");
                    boolean z = optJSONObject2.optInt("required") == 1;
                    POBNativeAdLinkResponse a = a(optJSONObject2.optJSONObject("link"));
                    boolean has = optJSONObject2.has("title");
                    boolean has2 = optJSONObject2.has("img");
                    boolean has3 = optJSONObject2.has("data");
                    boolean has4 = optJSONObject2.has("video");
                    if (has) {
                        JSONObject optJSONObject3 = optJSONObject2.optJSONObject("title");
                        if (optJSONObject3 != null) {
                            String optString = optJSONObject3.optString("text");
                            if (!POBUtils.isNullOrEmpty(optString)) {
                                pOBNativeAdVideoResponseAsset = new POBNativeAdTitleResponseAsset(optInt, z, a, optString, optJSONObject3.optInt("len", optString.length()));
                                if (pOBNativeAdVideoResponseAsset == null) {
                                    arrayList.add(pOBNativeAdVideoResponseAsset);
                                }
                            }
                        }
                        pOBNativeAdVideoResponseAsset = null;
                        if (pOBNativeAdVideoResponseAsset == null) {
                        }
                    } else if (has2) {
                        JSONObject optJSONObject4 = optJSONObject2.optJSONObject("img");
                        if (optJSONObject4 != null) {
                            String optString2 = optJSONObject4.optString("url");
                            if (!POBUtils.isNullOrEmpty(optString2)) {
                                pOBNativeAdVideoResponseAsset = new POBNativeAdImageResponseAsset(optInt, z, a, optString2, optJSONObject4.optInt("w"), optJSONObject4.optInt("h"), POBNativeImageAssetType.getImageAssetType(optJSONObject4.optInt("type")));
                                if (pOBNativeAdVideoResponseAsset == null) {
                                }
                            }
                        }
                        pOBNativeAdVideoResponseAsset = null;
                        if (pOBNativeAdVideoResponseAsset == null) {
                        }
                    } else if (has3) {
                        JSONObject optJSONObject5 = optJSONObject2.optJSONObject("data");
                        if (optJSONObject5 != null && !POBUtils.isNullOrEmpty(optJSONObject5.optString("value"))) {
                            POBNativeDataAssetType dataAssetType = POBNativeDataAssetType.getDataAssetType(optJSONObject5.optInt("type"));
                            String optString3 = optJSONObject5.optString("value");
                            pOBNativeAdVideoResponseAsset = new POBNativeAdDataResponseAsset(optInt, z, a, optString3, optJSONObject5.optInt("len", optString3.length()), dataAssetType);
                            if (pOBNativeAdVideoResponseAsset == null) {
                            }
                        }
                        pOBNativeAdVideoResponseAsset = null;
                        if (pOBNativeAdVideoResponseAsset == null) {
                        }
                    } else {
                        if (has4 && (optJSONObject = optJSONObject2.optJSONObject("video")) != null) {
                            String optString4 = optJSONObject.optString(POBNativeConstants.NATIVE_VAST_AD_TAG);
                            if (!POBUtils.isNullOrEmpty(optString4)) {
                                pOBNativeAdVideoResponseAsset = new POBNativeAdVideoResponseAsset(optInt, z, optString4, a);
                                if (pOBNativeAdVideoResponseAsset == null) {
                                }
                            }
                        }
                        pOBNativeAdVideoResponseAsset = null;
                        if (pOBNativeAdVideoResponseAsset == null) {
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private List b(JSONArray jSONArray) {
        POBNativeEventType eventType;
        POBNativeEventTrackingMethod eventTrackingMethod;
        ArrayList arrayList = new ArrayList();
        if (!POBUtils.isJsonArrayNullOrEmpty(jSONArray)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (!POBUtils.isJsonObjectNullOrEmpty(optJSONObject)) {
                    String optString = optJSONObject.optString("url");
                    if (!POBUtils.isNullOrEmpty(optString) && (eventType = POBNativeEventType.getEventType(optJSONObject.optInt("event"))) != null && (eventTrackingMethod = POBNativeEventTrackingMethod.getEventTrackingMethod(optJSONObject.optInt("method"))) != null) {
                        POBNativeAdResponseEventTracker pOBNativeAdResponseEventTracker = new POBNativeAdResponseEventTracker(optString, eventType, eventTrackingMethod);
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("ext");
                        if (!POBUtils.isJsonObjectNullOrEmpty(optJSONObject2)) {
                            pOBNativeAdResponseEventTracker.setExt(optJSONObject2);
                        }
                        arrayList.add(pOBNativeAdResponseEventTracker);
                    }
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public POBNativeAdResponse parseNativeAdResponse(@NonNull String str) throws Exception {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("ver");
            List a = a(jSONObject.optJSONArray("assets"));
            if (a.isEmpty()) {
                throw new Exception(POBNativeLogConstants.NATIVE_EMPTY_ASSETS);
            }
            POBNativeAdResponse pOBNativeAdResponse = new POBNativeAdResponse(optString, a, a(jSONObject.optJSONObject("link")), POBUtils.convertStringJsonArrayToList(jSONObject.optJSONArray("imptrackers")), jSONObject.optString("jstracker"), b(jSONObject.optJSONArray("eventtrackers")), jSONObject.has("privacy") ? jSONObject.optString("privacy") : null);
            POBLog.debug("POBNativeAdParser", "Native Ad response: " + pOBNativeAdResponse, new Object[0]);
            return pOBNativeAdResponse;
        } catch (JSONException e) {
            throw new Exception(e.getMessage());
        }
    }

    private POBNativeAdLinkResponse a(JSONObject jSONObject) {
        if (POBUtils.isJsonObjectNullOrEmpty(jSONObject)) {
            return null;
        }
        return new POBNativeAdLinkResponse(jSONObject.optString("url"), POBUtils.convertStringJsonArrayToList(jSONObject.optJSONArray("clicktrackers")), jSONObject.optString("fallback"));
    }
}
