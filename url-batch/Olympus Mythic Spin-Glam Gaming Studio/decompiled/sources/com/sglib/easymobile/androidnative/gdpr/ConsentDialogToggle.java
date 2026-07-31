package com.sglib.easymobile.androidnative.gdpr;

import com.sglib.easymobile.androidnative.Helper;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class ConsentDialogToggle {
    public static final String ID_KEY = "id";
    public static final String INTERACTABLE_KEY = "interactable";
    public static final String IS_ON_KEY = "isOn";
    public static final String OFF_DESCRIPTION_KEY = "offDescription";
    public static final String ON_DESCRIPTION_KEY = "onDescription";
    public static final String SHOULD_TOGGLE_DESCRIPTION_KEY = "shouldToggleDescription";
    public static final String TITLE_KEY = "title";
    public final String id;
    private Boolean interactable;
    private Boolean isOn;
    public final String offDescription;
    public final String onDescription;
    public final Boolean shouldToggleDescription;
    public final String title;

    public ConsentDialogToggle(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3) {
        this.id = str;
        this.title = str2;
        this.onDescription = str3;
        this.offDescription = str4;
        this.isOn = bool;
        this.interactable = bool2;
        this.shouldToggleDescription = bool3;
    }

    public Boolean getIsOn() {
        return this.isOn;
    }

    public void setIsOn(Boolean bool) {
        this.isOn = bool;
    }

    public Boolean getInteractable() {
        return this.interactable;
    }

    public void setInteractable(Boolean bool) {
        this.interactable = bool;
    }

    public String getDescription() {
        if (this.shouldToggleDescription.booleanValue() && !this.isOn.booleanValue()) {
            return this.offDescription;
        }
        return this.onDescription;
    }

    public String toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = "";
            jSONObject.put("id", Helper.IsNullOrEmptyString(this.id) ? "" : this.id);
            jSONObject.put("title", Helper.IsNullOrEmptyString(this.title) ? "" : this.title);
            jSONObject.put(ON_DESCRIPTION_KEY, Helper.IsNullOrEmptyString(this.onDescription) ? "" : this.onDescription);
            if (!Helper.IsNullOrEmptyString(this.offDescription)) {
                str = this.offDescription;
            }
            jSONObject.put(OFF_DESCRIPTION_KEY, str);
            jSONObject.put(IS_ON_KEY, this.isOn);
            jSONObject.put("interactable", this.interactable);
            jSONObject.put(SHOULD_TOGGLE_DESCRIPTION_KEY, this.shouldToggleDescription);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ConsentDialogToggle fromJson(String str) {
        if (Helper.IsNullOrEmptyString(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new ConsentDialogToggle(jSONObject.getString("id"), jSONObject.getString("title"), jSONObject.getString(ON_DESCRIPTION_KEY), jSONObject.getString(OFF_DESCRIPTION_KEY), Boolean.valueOf(jSONObject.getBoolean(IS_ON_KEY)), Boolean.valueOf(jSONObject.getBoolean("interactable")), Boolean.valueOf(jSONObject.getBoolean(SHOULD_TOGGLE_DESCRIPTION_KEY)));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
