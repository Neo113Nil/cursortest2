package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.applovin.sdk.AppLovinEventParameters;
import com.facebook.internal.ServerProtocol;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzbvn {
    public final List zza;
    public final String zzb;

    @Nullable
    public final String zzc;

    public zzbvn(JSONObject jSONObject) throws JSONException {
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.zza = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbvp.zza(jSONObject, POBCTAOverlayData.KEY_CTA_CLICKURL);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbvp.zza(jSONObject, "imp_urls");
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbvp.zza(jSONObject, "downloaded_imp_urls");
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbvp.zza(jSONObject, "fill_urls");
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbvp.zza(jSONObject, "video_start_urls");
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbvp.zza(jSONObject, "video_complete_urls");
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbvp.zza(jSONObject, "video_reward_urls");
        jSONObject.optString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER);
        jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            com.google.android.gms.ads.internal.zzt.zzx();
            zzbvp.zza(optJSONObject, "manual_impression_urls");
        }
        if (optJSONObject != null) {
            optJSONObject.toString();
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.zzb = optJSONObject2 != null ? optJSONObject2.toString() : null;
        if (optJSONObject2 != null) {
            optJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        if (optJSONObject3 != null) {
            optJSONObject3.toString();
        }
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbvp.zza(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject4 != null) {
            optJSONObject4.toString();
        }
        this.zzc = jSONObject.optString(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
