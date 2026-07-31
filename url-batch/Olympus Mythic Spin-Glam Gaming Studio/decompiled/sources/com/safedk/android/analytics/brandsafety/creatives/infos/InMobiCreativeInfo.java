package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.g;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.h;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class InMobiCreativeInfo extends CreativeInfo {
    private static final String a = "advertised_content";
    private static final String aa = "InMobiCreativeInfo";
    private static final long serialVersionUID = 0;
    private int E;
    private String Y;
    private String Z;

    public InMobiCreativeInfo() {
    }

    public InMobiCreativeInfo(String id, String creativeId, String placementId, String sdkVersion, BrandSafetyUtils.AdType adType, int multiAds, BrandSafetyEvent.AdFormatType adFormat, String eventId, String advertisedContent) {
        super(adType, h.i, id, creativeId, null, null, null, sdkVersion);
        this.K = placementId;
        this.Y = id;
        this.E = multiAds;
        if (adFormat != null) {
            a(adFormat);
        } else if (adType != null) {
            BrandSafetyEvent.AdFormatType adFormat2 = BrandSafetyUtils.a(adType);
            if (adFormat2 != null) {
                a(adFormat2);
            }
        }
        h(eventId);
        this.Z = advertisedContent;
    }

    public String as() {
        return this.Y;
    }

    public int at() {
        return this.E;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle b() {
        Bundle b = super.b();
        if (this.bg != null && !this.bg.isEmpty()) {
            synchronized (this.bg) {
                b.putStringArrayList(BrandSafetyEvent.u, new ArrayList<>(this.bg));
            }
        }
        if (!TextUtils.isEmpty(this.Z)) {
            b.putString(a, this.Z);
        }
        return b;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    protected boolean b(String str) {
        if (str == null) {
            return false;
        }
        return super.b(str.split(X3.j.c)[0]);
    }

    public InMobiCreativeInfo au() {
        return new InMobiCreativeInfo(L(), N(), this.K, this.Q, K(), this.E, BrandSafetyEvent.AdFormatType.valueOf(I()), n(), this.Z);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject i = super.i();
        if (!TextUtils.isEmpty(this.Y)) {
            i.put("impressionId", this.Y);
        }
        i.put("multiAds", this.E);
        if (!TextUtils.isEmpty(this.Z)) {
            i.put(g.c, this.Z);
        }
        return i;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.Y = jSONObject.optString("impressionId", "");
            this.E = jSONObject.optInt("multiAds", 0);
            this.Z = jSONObject.optString(g.c, "");
        }
    }
}
