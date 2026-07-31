package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBExtensions;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import com.safedk.android.analytics.brandsafety.m;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class POBImpression {
    private Map a;

    @Nullable
    protected POBRequest.AdPosition adPosition;

    @NonNull
    protected final String adUnitId;
    private POBBanner b;
    private POBVideo c;
    private POBNative d;
    private boolean e;
    private boolean f;
    private boolean g;

    @Nullable
    protected String gpid;
    private boolean h;
    private boolean i;

    @NonNull
    protected final String id;
    private JSONObject j;

    @Nullable
    protected String testCreativeId;

    public POBImpression(@NonNull String str, @NonNull String str2) {
        this.h = false;
        this.i = true;
        this.id = str;
        this.adUnitId = str2;
    }

    Map a() {
        return this.a;
    }

    @NonNull
    public POBRequest.AdPosition getAdPosition() {
        return this.adPosition;
    }

    @NonNull
    public String getAdUnitId() {
        return this.adUnitId;
    }

    @Nullable
    public POBBanner getBanner() {
        return this.b;
    }

    @Nullable
    protected String getCustomData() {
        Map a = a();
        if (a != null && !a.isEmpty()) {
            StringBuilder sb = null;
            for (String str : a.keySet()) {
                if (sb == null) {
                    sb = new StringBuilder();
                } else {
                    sb.append(m.ad);
                }
                sb.append(str);
                sb.append("=");
                List<String> list = (List) a.get(str);
                if (list != null) {
                    int i = 0;
                    for (String str2 : list) {
                        if (i > 0) {
                            sb.append(StringUtils.COMMA);
                        }
                        sb.append(str2);
                        i++;
                    }
                }
            }
            if (sb != null) {
                return sb.toString();
            }
        }
        return null;
    }

    @Nullable
    protected JSONObject getExtJson(@Nullable JSONArray jSONArray) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (jSONArray != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("keywords", jSONArray);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.putOpt("pubmatic", jSONObject2);
                jSONObject.putOpt("bidder", jSONObject3);
            }
            if (!POBUtils.isNullOrEmpty(this.gpid)) {
                jSONObject.putOpt(POBConstants.KEY_GPID, this.gpid);
            } else if (!POBUtils.isNullOrEmpty(this.adUnitId)) {
                jSONObject.putOpt(POBConstants.KEY_GPID, this.adUnitId);
            }
            if (this.f) {
                jSONObject.putOpt("reward", 1);
            }
            if (this.g) {
                jSONObject.putOpt(POBConstants.KEY_IS_APP_OPEN_AD, 1);
            }
            a(jSONObject);
            return jSONObject;
        } catch (JSONException unused) {
            POBLog.warn("POBImpression", "Not able to generate Ext Json.", new Object[0]);
            return null;
        }
    }

    @NonNull
    public String getId() {
        return this.id;
    }

    @NonNull
    public JSONObject getImpressionJson() throws JSONException {
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.id);
        if (POBInstanceProvider.getSdkConfig().isUseInternalBrowser()) {
            jSONObject.put(POBConstants.KEY_CLICK_BROWSER, 0);
        } else {
            jSONObject.put(POBConstants.KEY_CLICK_BROWSER, 1);
        }
        jSONObject.put(POBConstants.KEY_DISPLAY_MANAGER, "PubMatic_OpenWrap_SDK");
        jSONObject.put(POBConstants.KEY_DISPLAY_MANAGER_VERSION, "5.1.2");
        jSONObject.put(POBConstants.KEY_TAG_ID, this.adUnitId);
        String testCreativeId = getTestCreativeId();
        if (POBUtils.isNullOrEmpty(testCreativeId)) {
            jSONArray = null;
        } else {
            jSONArray = new JSONArray();
            jSONArray.put(putKeyValueObject(POBConstants.KEY_TEST_CREATIVE_ID, testCreativeId));
        }
        String customData = getCustomData();
        if (customData != null) {
            if (jSONArray == null) {
                jSONArray = new JSONArray();
            }
            jSONArray.put(putKeyValueObject(POBConstants.KEY_DCTR, customData));
        }
        JSONObject extJson = getExtJson(jSONArray);
        if (extJson != null && extJson.length() > 0) {
            jSONObject.putOpt("ext", extJson);
        }
        jSONObject.put(POBConstants.KEY_SECURE, 1);
        POBBanner pOBBanner = this.b;
        if (pOBBanner != null) {
            if (this.e) {
                pOBBanner.setAdPosition(POBRequest.AdPosition.FULL_SCREEN);
            } else if (a(this.adPosition)) {
                this.b.setAdPosition(this.adPosition);
            }
            POBBanner pOBBanner2 = this.b;
            jSONObject.put("banner", pOBBanner2.getRTBJson(pOBBanner2.getSupportedAPIs(false), false));
        }
        POBVideo pOBVideo = this.c;
        if (pOBVideo != null) {
            if (this.e) {
                pOBVideo.setPosition(POBRequest.AdPosition.FULL_SCREEN);
            } else if (a(this.adPosition)) {
                this.c.setPosition(this.adPosition);
            }
            jSONObject.put("video", this.c.getRTBJson());
        }
        POBNative pOBNative = this.d;
        if (pOBNative != null) {
            jSONObject.put("native", pOBNative.getRTBJson());
        }
        jSONObject.put(POBConstants.KEY_INTERSTITIAL, this.e ? 1 : 0);
        return jSONObject;
    }

    @Nullable
    public POBNative getNative() {
        return this.d;
    }

    @Nullable
    public String getTestCreativeId() {
        return this.testCreativeId;
    }

    @Nullable
    public POBVideo getVideo() {
        return this.c;
    }

    public boolean isAppOpenAd() {
        return this.g;
    }

    public boolean isCtaOverlayEnabled() {
        return this.h;
    }

    public boolean isInterstitial() {
        return this.e;
    }

    @Deprecated
    public boolean isRewardedAd() {
        return this.f;
    }

    @NonNull
    protected JSONObject putKeyValueObject(@Nullable String str, @Nullable Object... objArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("key", str);
            jSONObject.putOpt("value", new JSONArray(objArr));
            return jSONObject;
        } catch (JSONException unused) {
            POBLog.warn("POBImpression", "Not able to generate Json with key/value pair.", new Object[0]);
            return jSONObject;
        }
    }

    public void setAdPosition(@NonNull POBRequest.AdPosition adPosition) {
        this.adPosition = adPosition;
    }

    public void setAppOpenAd(boolean z) {
        this.g = z;
    }

    public void setAppStatusSchemes(@Nullable JSONObject jSONObject) {
        this.j = jSONObject;
    }

    public void setBanner(@Nullable POBBanner pOBBanner) {
        this.b = pOBBanner;
    }

    public void setCtaOverlayEnabled(boolean z) {
        this.h = z;
    }

    public void setCustomParam(@Nullable Map<String, List<String>> map) {
        this.a = map;
    }

    public void setGpid(@NonNull String str) {
        this.gpid = str;
    }

    public void setInterstitial(boolean z) {
        this.e = z;
    }

    public void setMRAIDAppStatusEnabled(boolean z) {
        this.i = z;
    }

    public void setNative(@Nullable POBNative pOBNative) {
        this.d = pOBNative;
    }

    public void setTestCreativeId(@Nullable String str) {
        this.testCreativeId = str;
    }

    public void setVideo(@Nullable POBVideo pOBVideo) {
        this.c = pOBVideo;
    }

    private boolean a(POBRequest.AdPosition adPosition) {
        return (adPosition == null || adPosition == POBRequest.AdPosition.UNKNOWN) ? false : true;
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray valueJsonArray;
        try {
            POBLog.debug("POBImpression", "MRAID APP INSTALL Enabled : " + this.i, new Object[0]);
            JSONObject jSONObject3 = new JSONObject();
            if (isCtaOverlayEnabled()) {
                jSONObject3.putOpt("ctaoverlay", 1);
            }
            if (this.i && (jSONObject2 = this.j) != null && jSONObject2.length() > 0 && (valueJsonArray = POBExtensions.toValueJsonArray(this.j)) != null) {
                POBLog.debug("POBImpression", "Consolidated List of Application Scheme: %s", valueJsonArray.toString());
                jSONObject3.putOpt(POBConstants.KEY_APP_STATUS_SCHEMES, valueJsonArray);
            }
            if (jSONObject3.length() > 0) {
                jSONObject.putOpt(POBConstants.KEY_OWSDK, jSONObject3);
            }
        } catch (JSONException unused) {
            POBLog.debug("POBImpression", "Not able to add owsdk parameters", new Object[0]);
        }
    }

    public POBImpression(@NonNull String str, @NonNull String str2, boolean z, boolean z2) {
        this(str, str2);
        this.f = z;
        this.e = z2;
    }
}
