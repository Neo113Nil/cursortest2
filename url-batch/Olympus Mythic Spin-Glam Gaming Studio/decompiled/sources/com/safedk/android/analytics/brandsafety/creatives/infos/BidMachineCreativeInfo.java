package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.g;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import org.json.JSONException;
import org.json.JSONObject;

@AdNetworkIdentifier(packageName = "io.bidmachine")
/* loaded from: classes10.dex */
public class BidMachineCreativeInfo extends CreativeInfo {
    private static final String a = "advertised_content";
    private static final long serialVersionUID = 0;
    private String E;

    public BidMachineCreativeInfo() {
    }

    public BidMachineCreativeInfo(BrandSafetyUtils.AdType adType, String sdk, String id, String sdkVersion, String placementId, String eventId) {
        super(adType, sdk, id, null, null, null, null, sdkVersion);
        this.K = placementId;
        h(eventId);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle b() {
        Bundle b = super.b();
        if (!TextUtils.isEmpty(this.E)) {
            b.putString(a, this.E);
        }
        return b;
    }

    public void a(String str) {
        this.E = str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject i = super.i();
        if (!TextUtils.isEmpty(this.E)) {
            i.put(g.c, this.E);
        }
        return i;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.E = jSONObject.optString(g.c, "");
        }
    }
}
