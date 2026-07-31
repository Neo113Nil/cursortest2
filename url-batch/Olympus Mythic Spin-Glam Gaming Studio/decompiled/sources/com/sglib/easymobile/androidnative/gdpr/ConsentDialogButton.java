package com.sglib.easymobile.androidnative.gdpr;

import com.sglib.easymobile.androidnative.Helper;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ConsentDialogButton {
    public static final String ID_KEY = "id";
    public static final String INTERACTABLE_BACKGROUND_COLOR_KEY = "backgroundColor";
    public static final String INTERACTABLE_KEY = "interactable";
    public static final String INTERACTABLE_TEXT_COLOR_KEY = "titleColor";
    public static final String TITLE_KEY = "title";
    public static final String UNINTERACTABLE_BACKGROUND_COLOR_KEY = "uninteractableBackgroundColor";
    public static final String UNINTERACTABLE_TEXT_COLOR_KEY = "uninteractableTitleColor";
    public final String id;
    private Boolean interactable;
    public final int interactableBackgroundColor;
    public final int interactableTextColor;
    public final String title;
    public final int uninteractableBackgroundColor;
    public final int uninteractableTextColor;

    public ConsentDialogButton(String str, String str2, Boolean bool, int i, int i2, int i3, int i4) {
        this.id = str;
        this.title = str2;
        this.interactable = bool;
        this.interactableTextColor = i;
        this.interactableBackgroundColor = i2;
        this.uninteractableTextColor = i3;
        this.uninteractableBackgroundColor = i4;
    }

    public String toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = "";
            jSONObject.put("id", Helper.IsNullOrEmptyString(this.id) ? "" : this.id);
            if (!Helper.IsNullOrEmptyString(this.title)) {
                str = this.title;
            }
            jSONObject.put("title", str);
            jSONObject.put("interactable", this.interactable);
            jSONObject.put(INTERACTABLE_TEXT_COLOR_KEY, this.interactableTextColor);
            jSONObject.put("backgroundColor", this.interactableBackgroundColor);
            jSONObject.put(UNINTERACTABLE_TEXT_COLOR_KEY, this.uninteractableTextColor);
            jSONObject.put(UNINTERACTABLE_BACKGROUND_COLOR_KEY, this.uninteractableBackgroundColor);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ConsentDialogButton fromJson(String str) {
        if (Helper.IsNullOrEmptyString(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new ConsentDialogButton(jSONObject.getString("id"), jSONObject.getString("title"), Boolean.valueOf(jSONObject.getBoolean("interactable")), parseColor(jSONObject, INTERACTABLE_TEXT_COLOR_KEY), parseColor(jSONObject, "backgroundColor"), parseColor(jSONObject, UNINTERACTABLE_TEXT_COLOR_KEY), parseColor(jSONObject, UNINTERACTABLE_BACKGROUND_COLOR_KEY));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int getTextColor() {
        return this.interactable.booleanValue() ? this.interactableTextColor : this.uninteractableTextColor;
    }

    public int getBackgroundColor() {
        return this.interactable.booleanValue() ? this.interactableBackgroundColor : this.uninteractableBackgroundColor;
    }

    public Boolean getInteractable() {
        return this.interactable;
    }

    public void setInteractable(Boolean bool) {
        this.interactable = bool;
    }

    private static int parseColor(JSONObject jSONObject, String str) {
        try {
            return UnityColor.fromJsonToAndroidColor(jSONObject.getString(str));
        } catch (JSONException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
