package net.pubnative.lite.sdk.analytics;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import net.pubnative.lite.sdk.analytics.Reporting;
import net.pubnative.lite.sdk.utils.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class ReportingEvent {
    private static final String TAG = "ReportingEvent";
    private final JSONObject eventObject = new JSONObject();

    public String getAdFormat() {
        return getCustomString("ad_format");
    }

    public String getAdSize() {
        return getCustomString("ad_size");
    }

    public String getAdType() {
        return getCustomString("ad_type");
    }

    public String getAgeOfApp() {
        return getCustomString("age_of_app");
    }

    public String getAppToken() {
        return getCustomString("app_token");
    }

    public String getCampaignId() {
        return getCustomString("campaign_id");
    }

    public String getCategoryId() {
        return getCustomString("category_id");
    }

    public String getConfigId() {
        return getCustomString("remote_config_id");
    }

    public String getCreative() {
        return getCustomString("creative");
    }

    public String getCreativeId() {
        return getCustomString("creative_id");
    }

    public String getCreativeType() {
        return getCustomString("creative_type");
    }

    public Boolean getCustomBoolean(String str) {
        try {
            return Boolean.valueOf(this.eventObject.getBoolean(str));
        } catch (JSONException e) {
            Logger.e(TAG, e.getMessage());
            return null;
        }
    }

    public Double getCustomDecimal(String str) {
        try {
            return Double.valueOf(this.eventObject.getDouble(str));
        } catch (JSONException e) {
            Logger.e(TAG, e.getMessage());
            return null;
        }
    }

    public Long getCustomInteger(String str) {
        try {
            return Long.valueOf(this.eventObject.getLong(str));
        } catch (JSONException e) {
            Logger.e(TAG, e.getMessage());
            return null;
        }
    }

    public JSONArray getCustomJSONArray(String str) {
        try {
            return this.eventObject.getJSONArray(str);
        } catch (JSONException e) {
            Logger.e(TAG, e.getMessage());
            return null;
        }
    }

    public JSONObject getCustomJSONObject(String str) {
        try {
            return this.eventObject.getJSONObject(str);
        } catch (JSONException e) {
            Logger.e(TAG, e.getMessage());
            return null;
        }
    }

    public String getCustomString(String str) {
        try {
            return this.eventObject.getString(str);
        } catch (JSONException e) {
            Logger.e(TAG, e.getMessage());
            return null;
        }
    }

    public long getErrorCode() {
        return getCustomInteger("error_code").longValue();
    }

    public String getErrorMessage() {
        return getCustomString("error_message");
    }

    public Bundle getEventData() {
        Bundle bundle = new Bundle();
        Iterator<String> keys = this.eventObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, this.eventObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        return bundle;
    }

    public JSONObject getEventObject() {
        return this.eventObject;
    }

    public String getEventType() {
        return getCustomString("event_type");
    }

    public boolean getHasEndCard() {
        return getCustomBoolean("has_end_card").booleanValue();
    }

    public String getImpDepth() {
        return getCustomString("imp_depth");
    }

    public String getImpId() {
        return getCustomString("impression_id");
    }

    public String getIntegrationType() {
        return getCustomString("integration_type");
    }

    public String getPlacementId() {
        return getCustomString("placement_id");
    }

    public String getPlatform() {
        return getCustomString("platform");
    }

    public synchronized String getRequestType() {
        return getCustomString("request_type");
    }

    public String getSdkVersion() {
        return getCustomString(Reporting.Key.HYBID_VERSION);
    }

    public String getSessionDuration() {
        return getCustomString("session_duration");
    }

    public String getTimestamp() {
        return getCustomString("timestamp");
    }

    public String getVast() {
        return getCustomString("vast");
    }

    public String getZoneId() {
        return getCustomString("zone_id");
    }

    public synchronized void mergeJSONObject(JSONObject jSONObject) {
        JSONArray names;
        if (jSONObject != null) {
            if (jSONObject.length() != 0 && (names = jSONObject.names()) != null) {
                for (int i = 0; i < names.length(); i++) {
                    try {
                        String string = names.getString(i);
                        this.eventObject.put(string, jSONObject.get(string));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
    }

    public synchronized void setAdFormat(String str) {
        setCustomString("ad_format", str);
    }

    public synchronized void setAdSessionData(String str) {
        setCustomString("ad_session_data", str);
    }

    public synchronized void setAdSize(String str) {
        setCustomString("ad_size", str);
    }

    public synchronized void setAdType(String str) {
        setCustomString("ad_type", str);
    }

    public synchronized void setAgeOfApp(String str) {
        setCustomString("age_of_app", str);
    }

    public synchronized void setAppToken(String str) {
        setCustomString("app_token", str);
    }

    public synchronized void setCampaignId(String str) {
        setCustomString("campaign_id", str);
    }

    public synchronized void setCategoryId(String str) {
        setCustomString("category_id", str);
    }

    public synchronized void setConfigId(String str) {
        setCustomString("remote_config_id", str);
    }

    public synchronized void setCreative(String str) {
        setCustomString("creative", str);
    }

    public synchronized void setCreativeId(String str) {
        setCustomString("creative_id", str);
    }

    public synchronized void setCreativeType(String str) {
        setCustomString("creative_type", str);
    }

    public synchronized void setCustomBoolean(String str, boolean z) {
        try {
            this.eventObject.put(str, z);
        } catch (JSONException e) {
            Logger.e(TAG, e.getMessage());
        }
    }

    public synchronized void setCustomDecimal(String str, double d) {
        try {
            this.eventObject.put(str, d);
        } catch (JSONException e) {
            Logger.e(TAG, e.getMessage());
        }
    }

    public void setCustomInteger(String str, long j) {
        try {
            this.eventObject.put(str, j);
        } catch (JSONException e) {
            Logger.e(TAG, e.getMessage());
        }
    }

    public synchronized void setCustomJSONArray(String str, JSONArray jSONArray) {
        try {
            this.eventObject.put(str, jSONArray);
        } catch (JSONException e) {
            Logger.e(TAG, e.getMessage());
        }
    }

    public synchronized void setCustomJSONObject(String str, JSONObject jSONObject) {
        try {
            this.eventObject.put(str, jSONObject);
        } catch (JSONException e) {
            Logger.e(TAG, e.getMessage());
        }
    }

    public synchronized void setCustomString(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.eventObject.put(str, str2);
        } catch (JSONException e) {
            Logger.e(TAG, e.getMessage());
        }
    }

    public synchronized void setErrorCode(int i) {
        setCustomInteger("error_code", i);
    }

    public synchronized void setErrorMessage(String str) {
        setCustomString("error_message", str);
    }

    public synchronized void setEventType(String str) {
        setCustomString("event_type", str);
    }

    public synchronized void setHasEndCard(boolean z) {
        setCustomBoolean("has_end_card", z);
    }

    public synchronized void setImpDepth(String str) {
        setCustomString("imp_depth", str);
    }

    public synchronized void setImpId(String str) {
        setCustomString("impression_id", str);
    }

    public synchronized void setIntegrationType(String str) {
        setCustomString("integration_type", str);
    }

    public synchronized void setPlacementId(String str) {
        setCustomString("placement_id", str);
    }

    public synchronized void setPlatform(String str) {
        setCustomString("platform", str);
    }

    public synchronized void setRequestType(String str) {
        setCustomString("request_type", str);
    }

    public synchronized void setSdkVersion(String str) {
        setCustomString(Reporting.Key.HYBID_VERSION, str);
    }

    public synchronized void setSessionDuration(String str) {
        setCustomString("session_duration", str);
    }

    public synchronized void setTimestamp(long j) {
        setCustomString("timestamp", String.valueOf(j));
    }

    public synchronized void setVast(String str) {
        setCustomString("vast", str);
    }

    public synchronized void setZoneId(String str) {
        setCustomString("zone_id", str);
    }

    public synchronized void setTimestamp(String str) {
        setCustomString("timestamp", str);
    }
}
