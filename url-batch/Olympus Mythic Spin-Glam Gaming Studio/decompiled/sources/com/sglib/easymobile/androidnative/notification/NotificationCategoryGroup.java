package com.sglib.easymobile.androidnative.notification;

import com.sglib.easymobile.androidnative.Helper;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class NotificationCategoryGroup {
    public static final String ID_KEY = "id";
    public static final String NAME_KEY = "name";
    public String id;
    public String name;

    public NotificationCategoryGroup(String str, String str2) {
        this.id = str;
        this.name = str2;
    }

    public String ToJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = "";
            jSONObject.put("id", Helper.IsNullOrEmptyString(this.id) ? "" : this.id);
            if (!Helper.IsNullOrEmptyString(this.name)) {
                str = this.name;
            }
            jSONObject.put("name", str);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static NotificationCategoryGroup FromJson(String str) {
        if (Helper.IsNullOrEmptyString(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new NotificationCategoryGroup(jSONObject.getString("id"), jSONObject.getString("name"));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static NotificationCategoryGroup[] NotificationCategoryGroupsFromJson(String str) {
        if (!Helper.IsNullOrEmptyString(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(FromJson(jSONArray.getString(i)));
                }
                return (NotificationCategoryGroup[]) arrayList.toArray(new NotificationCategoryGroup[0]);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return new NotificationCategoryGroup[0];
    }
}
