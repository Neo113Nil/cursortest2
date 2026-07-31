package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;
import org.json.JSONException;
import org.json.JSONObject;

@AdNetworkIdentifier(packageName = h.C)
/* loaded from: classes3.dex */
public class VerveCreativeInfo extends CreativeInfo {
    private static final String a = "VerveCreativeInfo";
    private static final long serialVersionUID = 0;
    private String E;
    private String Y;
    private String Z;

    public VerveCreativeInfo() {
        this.E = null;
        this.Y = null;
        this.Z = null;
    }

    public VerveCreativeInfo(BrandSafetyUtils.AdType adType, String id, String creativeId, BrandSafetyEvent.AdFormatType adFormatType, String placementId, String sdkVersion, String eventId) {
        super(adType, h.C, id, creativeId, null, null, null, sdkVersion);
        this.E = null;
        this.Y = null;
        this.Z = null;
        this.K = placementId;
        a(adFormatType);
        h(eventId);
    }

    public void a(String str) {
        this.E = str;
    }

    public String as() {
        return this.E;
    }

    public void J(String str) {
        this.Y = str;
    }

    public String at() {
        return this.Y;
    }

    public void K(String str) {
        this.Z = str;
    }

    public String au() {
        return this.Z;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject i = super.i();
        if (!TextUtils.isEmpty(this.E)) {
            i.put("innerDspCreativeId", this.E);
        }
        if (!TextUtils.isEmpty(this.Y)) {
            i.put("innerImpressionUrl", this.Y);
        }
        if (!TextUtils.isEmpty(this.Z)) {
            i.put("impIdCrid", this.Z);
        }
        return i;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.E = jSONObject.optString("innerDspCreativeId", "");
            this.Y = jSONObject.optString("innerImpressionUrl", "");
            this.Z = jSONObject.optString("impIdCrid", "");
        }
    }
}
