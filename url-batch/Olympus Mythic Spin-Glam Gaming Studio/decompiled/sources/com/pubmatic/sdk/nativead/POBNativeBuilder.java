package com.pubmatic.sdk.nativead;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.nativead.request.POBBaseNativeRequestAsset;
import com.pubmatic.sdk.nativead.request.POBNativeRequestEventTracker;
import com.pubmatic.sdk.openwrap.core.POBNative;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeContextSubType;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeContextType;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativePlacementType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class POBNativeBuilder implements POBNative {
    private final List a;
    private final List b;
    private final Set c;
    private POBNativeAdLoaderConfig d;

    public POBNativeBuilder(@NonNull List<POBBaseNativeRequestAsset> list, @NonNull List<POBNativeRequestEventTracker> list2, @NonNull Set<Integer> set) {
        this.a = list;
        this.b = list2;
        this.c = set;
    }

    private String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ver", "1.2");
        POBNativeAdLoaderConfig pOBNativeAdLoaderConfig = this.d;
        if (pOBNativeAdLoaderConfig != null) {
            POBNativeContextType contextType = pOBNativeAdLoaderConfig.getContextType();
            if (contextType != null) {
                jSONObject.put("context", contextType.getValue());
            }
            POBNativeContextSubType contextSubType = this.d.getContextSubType();
            if (contextSubType != null) {
                jSONObject.put("contextsubtype", contextSubType.getValue());
            }
            POBNativePlacementType placementType = this.d.getPlacementType();
            if (placementType != null) {
                jSONObject.put("plcmttype", placementType.getValue());
            }
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            jSONArray.put(((POBBaseNativeRequestAsset) it.next()).getRTBJSON());
        }
        jSONObject.put("assets", jSONArray);
        if (!this.b.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((POBNativeRequestEventTracker) it2.next()).getRTBJSON());
            }
            jSONObject.put("eventtrackers", jSONArray2);
        }
        jSONObject.put("privacy", 1);
        return jSONObject.toString();
    }

    @NonNull
    public List<POBBaseNativeRequestAsset> getAssets() {
        return this.a;
    }

    @Nullable
    public POBNativeAdLoaderConfig getConfig() {
        return this.d;
    }

    @NonNull
    public List<POBNativeRequestEventTracker> getEventTrackers() {
        return this.b;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBNative
    @NonNull
    public JSONObject getRTBJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("request", a());
            jSONObject.put("ver", "1.2");
            jSONObject.put("api", new JSONArray((Collection) this.c));
            return jSONObject;
        } catch (JSONException e) {
            POBLog.error("POBNativeBuilder", POBNativeLogConstants.NATIVE_JSON_EXCEPTION, "POBNativeBuilder", e.getMessage());
            return jSONObject;
        }
    }

    @NonNull
    public Set<Integer> getSupportedAPIs() {
        return this.c;
    }

    public void setConfig(@NonNull POBNativeAdLoaderConfig pOBNativeAdLoaderConfig) {
        this.d = pOBNativeAdLoaderConfig;
    }
}
