package com.sglib.easymobile.androidnative.notification;

import com.sglib.easymobile.androidnative.Helper;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class NotificationResponse {
    public static final String ACTION_ID_KEY = "actionId";
    public static final String REQUEST_KEY = "request";
    public final String actionId;
    public final NotificationRequest request;

    public NotificationResponse(String str, NotificationRequest notificationRequest) {
        this.actionId = str;
        this.request = notificationRequest;
    }

    public static NotificationResponse FromJson(String str) {
        if (Helper.IsNullOrEmptyString(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new NotificationResponse(jSONObject.getString(ACTION_ID_KEY), NotificationRequest.FromJson(jSONObject.getString("request")));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String ToJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = "";
            jSONObject.put(ACTION_ID_KEY, Helper.IsNullOrEmptyString(this.actionId) ? "" : this.actionId);
            NotificationRequest notificationRequest = this.request;
            if (notificationRequest != null) {
                str = notificationRequest.ToJson();
            }
            jSONObject.put("request", str);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
