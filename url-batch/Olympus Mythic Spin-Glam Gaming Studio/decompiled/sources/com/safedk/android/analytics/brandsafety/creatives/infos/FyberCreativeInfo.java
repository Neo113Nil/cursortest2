package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@AdNetworkIdentifier(packageName = h.p)
/* loaded from: classes12.dex */
public class FyberCreativeInfo extends CreativeInfo {
    private static final String Y = "FyberCreativeInfo";
    private static final String aa = "alternative_click_url";
    private static final List<String> ac = Arrays.asList("www.serveroute.com/log_string", "column=", "line=", "ad_exchange=inneractive&mraid_version=");
    private static final long serialVersionUID = 0;
    private String ag;
    private String b_;

    public FyberCreativeInfo() {
    }

    public FyberCreativeInfo(String id, String creativeId, String campaignId, String clickUrl, String videoUrl, BrandSafetyEvent.AdFormatType adFormat, BrandSafetyUtils.AdType adType, String spotId, String sdkVersion, String adNetwork, String adDomain, String alternativeClickUrl, String eventId) {
        super(adType, h.p, id, creativeId, clickUrl, videoUrl, "", sdkVersion);
        this.K = spotId;
        Logger.d(Y, "FyberCreativeInfo ctor started");
        a(adFormat);
        this.b_ = campaignId;
        this.ar = adNetwork;
        this.aX = adDomain;
        this.ag = alternativeClickUrl;
        h(eventId);
    }

    public String as() {
        return this.b_;
    }

    public String at() {
        return this.ag;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean a() {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle b() {
        Bundle b = super.b();
        if (!TextUtils.isEmpty(this.b_)) {
            b.putString("campaign_id", this.b_);
        }
        if (!TextUtils.isEmpty(this.ag)) {
            b.putString(aa, this.ag);
        }
        return b;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public void b(List<String> list) {
        boolean z;
        Logger.d(Y, "classifyPrefetchUrl started, urlList=", list);
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String D = D(it.next());
                if (!TextUtils.isEmpty(D)) {
                    if (b(D)) {
                        y(D);
                        z = true;
                    } else if (v(D) && !D.equals(M())) {
                        x(D);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        Logger.d(Y, "classifyPrefetchUrl url is unclassified and will be dropped : ", D);
                    }
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject i = super.i();
        if (!TextUtils.isEmpty(this.b_)) {
            i.put("campaignId", this.b_);
        }
        if (!TextUtils.isEmpty(this.ag)) {
            i.put("alternativeClickUrl", this.ag);
        }
        return i;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.b_ = jSONObject.optString("campaignId", "");
            this.ag = jSONObject.optString("alternativeClickUrl", "");
        }
    }
}
