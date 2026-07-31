package com.sglib.easymobile.androidnative.notification;

import com.sglib.easymobile.androidnative.Helper;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class NotificationRequest {
    public static final String CATEGORY_ID_KEY = "categoryId";
    public static final String FIRE_TIME_KEY = "fireTimeMillis";
    public static final String ID_KEY = "id";
    public static final String LARGE_ICON_KEY = "largeIcon";
    public static final String MESSAGE_KEY = "message";
    public static final String REPEAT_KEY = "repeatSecs";
    public static final String REQUEST_CODE_KEY = "requestCode";
    public static final String SMALL_ICON_KEY = "smallIcon";
    public static final String TITLE_KEY = "title";
    public static final String USER_INFO_KEY = "userInfo";
    public String categoryId;
    public long fireTimeMillis;
    public String id;
    public String largeIcon;
    public String message;
    public long repeatSecs;
    public int requestCode;
    public String smallIcon;
    public String title;
    public String userInfo;

    public NotificationRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, long j2, int i) {
        this.id = str;
        this.title = str2;
        this.message = str3;
        this.userInfo = str4;
        this.categoryId = str5;
        this.smallIcon = str6;
        this.largeIcon = str7;
        this.fireTimeMillis = j;
        this.repeatSecs = j2;
        this.requestCode = i;
    }

    public static NotificationRequest FromJson(String str) {
        if (Helper.IsNullOrEmptyString(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new NotificationRequest(jSONObject.getString("id"), jSONObject.getString("title"), jSONObject.getString("message"), jSONObject.getString(USER_INFO_KEY), jSONObject.getString(CATEGORY_ID_KEY), jSONObject.getString(SMALL_ICON_KEY), jSONObject.getString(LARGE_ICON_KEY), jSONObject.getLong(FIRE_TIME_KEY), jSONObject.getLong(REPEAT_KEY), jSONObject.getInt(REQUEST_CODE_KEY));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public JSONObject ToJSONObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = "";
            jSONObject.put("id", Helper.IsNullOrEmptyString(this.id) ? "" : this.id);
            jSONObject.put("title", Helper.IsNullOrEmptyString(this.title) ? "" : this.title);
            jSONObject.put("message", Helper.IsNullOrEmptyString(this.message) ? "" : this.message);
            jSONObject.put(USER_INFO_KEY, Helper.IsNullOrEmptyString(this.userInfo) ? "" : this.userInfo);
            jSONObject.put(CATEGORY_ID_KEY, Helper.IsNullOrEmptyString(this.categoryId) ? "" : this.categoryId);
            jSONObject.put(SMALL_ICON_KEY, Helper.IsNullOrEmptyString(this.smallIcon) ? "" : this.smallIcon);
            if (!Helper.IsNullOrEmptyString(this.largeIcon)) {
                str = this.largeIcon;
            }
            jSONObject.put(LARGE_ICON_KEY, str);
            jSONObject.put(FIRE_TIME_KEY, this.fireTimeMillis);
            jSONObject.put(REPEAT_KEY, this.repeatSecs);
            jSONObject.put(REQUEST_CODE_KEY, this.requestCode);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String ToJson() {
        JSONObject ToJSONObject = ToJSONObject();
        if (ToJSONObject != null) {
            return ToJSONObject.toString();
        }
        return null;
    }
}
