package io.invertase.firebase.common;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class ReactNativeFirebaseJSON {
    private static ReactNativeFirebaseJSON sharedInstance = new ReactNativeFirebaseJSON();
    private JSONObject jsonObject;

    private ReactNativeFirebaseJSON() {
        try {
            this.jsonObject = new JSONObject("{\"messaging_android_notification_color\":\"@color/mediumblue\",\"crashlytics_disable_auto_disabler\":true,\"crashlytics_auto_collection_enabled\":true,\"crashlytics_is_error_generation_on_js_crash_enabled\":true,\"crashlytics_javascript_exception_handler_chaining_enabled\":false,\"crashlytics_ndk_enabled\":true,\"android_task_executor_maximum_pool_size\":30,\"android_task_executor_keep_alive_seconds\":3,\"messaging_android_notification_channel_id\":\"wagerlab-channel\"}");
        } catch (JSONException unused) {
        }
    }

    public static ReactNativeFirebaseJSON getSharedInstance() {
        return sharedInstance;
    }

    public boolean contains(String str) {
        JSONObject jSONObject = this.jsonObject;
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.has(str);
    }

    public boolean getBooleanValue(String str, boolean z) {
        JSONObject jSONObject = this.jsonObject;
        return jSONObject == null ? z : jSONObject.optBoolean(str, z);
    }

    public int getIntValue(String str, int i) {
        JSONObject jSONObject = this.jsonObject;
        return jSONObject == null ? i : jSONObject.optInt(str, i);
    }

    public long getLongValue(String str, long j) {
        JSONObject jSONObject = this.jsonObject;
        return jSONObject == null ? j : jSONObject.optLong(str, j);
    }

    public String getStringValue(String str, String str2) {
        JSONObject jSONObject = this.jsonObject;
        return jSONObject == null ? str2 : jSONObject.optString(str, str2);
    }

    public ArrayList<String> getArrayValue(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        JSONObject jSONObject = this.jsonObject;
        if (jSONObject != null) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray(str);
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        arrayList.add(optJSONArray.getString(i));
                    }
                }
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    public String getRawJSON() {
        return "{\"messaging_android_notification_color\":\"@color/mediumblue\",\"crashlytics_disable_auto_disabler\":true,\"crashlytics_auto_collection_enabled\":true,\"crashlytics_is_error_generation_on_js_crash_enabled\":true,\"crashlytics_javascript_exception_handler_chaining_enabled\":false,\"crashlytics_ndk_enabled\":true,\"android_task_executor_maximum_pool_size\":30,\"android_task_executor_keep_alive_seconds\":3,\"messaging_android_notification_channel_id\":\"wagerlab-channel\"}";
    }

    public WritableMap getAll() {
        WritableMap createMap = Arguments.createMap();
        JSONArray names = this.jsonObject.names();
        for (int i = 0; i < names.length(); i++) {
            try {
                String string = names.getString(i);
                SharedUtils.mapPutValue(string, this.jsonObject.get(string), createMap);
            } catch (JSONException unused) {
            }
        }
        return createMap;
    }
}
