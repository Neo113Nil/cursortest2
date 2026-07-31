package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.h;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class PangleCreativeInfo extends CreativeInfo {
    public static final String E = "non-app";
    public static final String Y = "/playable";
    public static final String Z = "/dynamic_";
    public static final String a = "app";
    public static final String aa = "/dpa_count_";
    public static final String ab = "/dpa";
    public static final String ac = "/dpa_related_products_count_";
    private static final long serialVersionUID = 0;
    private String ae;
    private int af;
    private boolean ag;

    public PangleCreativeInfo() {
    }

    public PangleCreativeInfo(BrandSafetyUtils.AdType adType, String id, String creativeId, String clickUrl, String videoUrl, String endCardUrl, boolean isPlayable, String placementId, String sdkVersion, String packageName, String downstreamStruct) {
        super(adType, h.u, id, creativeId, clickUrl, videoUrl, downstreamStruct, sdkVersion);
        this.K = placementId;
        this.W = isPlayable;
        this.at = endCardUrl;
        this.M = packageName;
        this.ae = null;
        this.af = 0;
        this.ag = false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject i = super.i();
        if (!TextUtils.isEmpty(this.ae)) {
            i.put("commonMultiAdUuid", this.ae);
        }
        i.put("dynamicCreativesCount", this.af);
        i.put("isDpa", this.ag);
        return i;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.ae = jSONObject.optString("commonMultiAdUuid", "");
            this.af = jSONObject.optInt("dynamicCreativesCount", 0);
            this.ag = jSONObject.optBoolean("isDpa", false);
        }
    }

    public void a(String str) {
        this.ae = str;
    }

    public String as() {
        return this.ae;
    }

    public int at() {
        return this.af;
    }

    public void b(int i) {
        this.af = i;
    }

    public void au() {
        this.ag = true;
    }

    public boolean av() {
        return this.ag;
    }
}
