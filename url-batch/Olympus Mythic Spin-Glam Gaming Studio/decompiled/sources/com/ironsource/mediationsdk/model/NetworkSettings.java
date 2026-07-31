package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.C4782n4;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class NetworkSettings {
    private static final String r = "customNetwork";
    private static final String s = "customNetworkPackage";
    private static final String t = "customNetworkAdapterName";
    private String a;
    private String b;
    private JSONObject c;
    private JSONObject d;
    private JSONObject e;
    private JSONObject f;
    private JSONObject g;
    private String h;
    private String i;
    private boolean j;
    private String k;
    private int l;
    private int m;
    private int n;
    private int o;
    private String p;
    private String q;

    public NetworkSettings(String str) {
        this.a = str;
        this.k = str;
        this.b = str;
        this.p = str;
        this.q = str;
        this.d = IronSourceNetworkBridge.jsonObjectInit();
        this.e = IronSourceNetworkBridge.jsonObjectInit();
        this.f = IronSourceNetworkBridge.jsonObjectInit();
        this.g = IronSourceNetworkBridge.jsonObjectInit();
        this.c = IronSourceNetworkBridge.jsonObjectInit();
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
    }

    public String getAdSourceNameForEvents() {
        return this.i;
    }

    public JSONObject getApplicationSettings() {
        return this.c;
    }

    public int getBannerPriority() {
        return this.n;
    }

    public JSONObject getBannerSettings() {
        return this.f;
    }

    public String getCustomNetwork() {
        JSONObject jSONObject = this.c;
        if (jSONObject != null) {
            return jSONObject.optString("customNetwork");
        }
        return null;
    }

    public String getCustomNetworkAdapterName(IronSource.a aVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        if (aVar == null && (jSONObject5 = this.c) != null) {
            return jSONObject5.optString(t);
        }
        if (aVar.equals(IronSource.a.REWARDED_VIDEO) && (jSONObject4 = this.d) != null) {
            return jSONObject4.optString(t);
        }
        if (aVar.equals(IronSource.a.INTERSTITIAL) && (jSONObject3 = this.e) != null) {
            return jSONObject3.optString(t);
        }
        if (aVar.equals(IronSource.a.BANNER) && (jSONObject2 = this.f) != null) {
            return jSONObject2.optString(t);
        }
        if (!aVar.equals(IronSource.a.NATIVE_AD) || (jSONObject = this.g) == null) {
            return null;
        }
        return jSONObject.optString(t);
    }

    public String getCustomNetworkPackage() {
        JSONObject jSONObject = this.c;
        return jSONObject != null ? jSONObject.optString(s, "") : "";
    }

    public int getInstanceType(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return getRewardedVideoSettings().optInt("instanceType");
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return getInterstitialSettings().optInt("instanceType");
        }
        if (aVar == IronSource.a.BANNER) {
            return getBannerSettings().optInt("instanceType");
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return getNativeAdSettings().optInt("instanceType");
        }
        return 1;
    }

    public int getInterstitialPriority() {
        return this.m;
    }

    public JSONObject getInterstitialSettings() {
        return this.e;
    }

    public int getMaxAdsPerSession(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return getRewardedVideoSettings().optInt("maxAdsPerSession", 99);
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return getInterstitialSettings().optInt("maxAdsPerSession", 99);
        }
        if (aVar == IronSource.a.BANNER) {
            return getBannerSettings().optInt("maxAdsPerSession", 99);
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return getNativeAdSettings().optInt("maxAdsPerSession", 99);
        }
        return 99;
    }

    public int getNativeAdPriority() {
        return this.o;
    }

    public JSONObject getNativeAdSettings() {
        return this.g;
    }

    public String getProviderDefaultInstance() {
        return this.p;
    }

    public String getProviderInstanceName() {
        return this.k;
    }

    public String getProviderName() {
        return this.a;
    }

    public String getProviderNetworkKey() {
        return this.q;
    }

    public String getProviderTypeForReflection() {
        return this.b;
    }

    public int getRewardedVideoPriority() {
        return this.l;
    }

    public JSONObject getRewardedVideoSettings() {
        return this.d;
    }

    public String getSubProviderId() {
        return this.h;
    }

    public boolean isBidder(IronSource.a aVar) {
        return !isCustomNetwork() && getInstanceType(aVar) == 2;
    }

    public boolean isCustomNetwork() {
        return !TextUtils.isEmpty(getCustomNetwork());
    }

    public boolean isIronSource() {
        return getProviderTypeForReflection().equalsIgnoreCase("IronSource");
    }

    public boolean isMultipleInstances() {
        return this.j;
    }

    public void setAdSourceNameForEvents(String str) {
        this.i = str;
    }

    public void setApplicationSettings(JSONObject jSONObject) {
        this.c = jSONObject;
    }

    public void setBannerPriority(int i) {
        this.n = i;
    }

    public void setBannerSettings(JSONObject jSONObject) {
        this.f = jSONObject;
    }

    public void setInterstitialPriority(int i) {
        this.m = i;
    }

    public void setInterstitialSettings(JSONObject jSONObject) {
        this.e = jSONObject;
    }

    public void setIsMultipleInstances(boolean z) {
        this.j = z;
    }

    public void setNativeAdPriority(int i) {
        this.o = i;
    }

    public void setNativeAdSettings(JSONObject jSONObject) {
        this.g = jSONObject;
    }

    public void setProviderNetworkKey(String str) {
        this.q = str;
    }

    public void setRewardedVideoPriority(int i) {
        this.l = i;
    }

    public void setRewardedVideoSettings(JSONObject jSONObject) {
        this.d = jSONObject;
    }

    public void setSubProviderId(String str) {
        this.h = str;
    }

    public boolean shouldEarlyInit(boolean z) {
        JSONObject jSONObject = this.c;
        return (jSONObject == null || !jSONObject.has(IronSourceConstants.EARLY_INIT_FIELD)) ? z : this.c.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
    }

    public void setBannerSettings(String str, Object obj) {
        try {
            this.f.put(str, obj);
        } catch (JSONException e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void setInterstitialSettings(String str, Object obj) {
        try {
            this.e.put(str, obj);
        } catch (JSONException e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void setNativeAdSettings(String str, Object obj) {
        try {
            this.g.put(str, obj);
        } catch (JSONException e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void setRewardedVideoSettings(String str, Object obj) {
        try {
            this.d.put(str, obj);
        } catch (JSONException e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public NetworkSettings(String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        this.a = str;
        this.k = str;
        this.b = str2;
        this.p = str3;
        this.q = str4;
        this.d = jSONObject2;
        this.e = jSONObject3;
        this.f = jSONObject4;
        this.g = jSONObject5;
        this.c = jSONObject;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
    }

    public NetworkSettings(NetworkSettings networkSettings) {
        this.a = networkSettings.getProviderName();
        this.k = networkSettings.getProviderName();
        this.b = networkSettings.getProviderTypeForReflection();
        this.d = networkSettings.getRewardedVideoSettings();
        this.e = networkSettings.getInterstitialSettings();
        this.f = networkSettings.getBannerSettings();
        this.g = networkSettings.getNativeAdSettings();
        this.c = networkSettings.getApplicationSettings();
        this.l = networkSettings.getRewardedVideoPriority();
        this.m = networkSettings.getInterstitialPriority();
        this.n = networkSettings.getBannerPriority();
        this.o = networkSettings.getNativeAdPriority();
        this.p = networkSettings.getProviderDefaultInstance();
        this.q = networkSettings.getProviderNetworkKey();
    }
}
