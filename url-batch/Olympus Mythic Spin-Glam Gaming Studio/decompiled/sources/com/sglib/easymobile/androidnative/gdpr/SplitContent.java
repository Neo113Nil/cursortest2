package com.sglib.easymobile.androidnative.gdpr;

import com.sglib.easymobile.androidnative.Helper;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class SplitContent {
    public static final String BUTTON_VALUE = "button";
    public static final String CONTENT_KEY = "content";
    public static final String PLAIN_TEXT_VALUE = "plain_text";
    public static final String TOGGLE_VALUE = "toggle";
    public static final String TYPE_KEY = "type";
    public final String content;
    public final Type type;

    enum Type {
        Unknown,
        PlainText,
        Toggle,
        Button
    }

    public SplitContent(Type type, String str) {
        this.type = type;
        this.content = str;
    }

    public static SplitContent fromJson(String str) {
        if (Helper.IsNullOrEmptyString(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new SplitContent(toType(jSONObject.getString("type")), jSONObject.getString("content"));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Type toType(String str) {
        return str.equals(PLAIN_TEXT_VALUE) ? Type.PlainText : str.equals(TOGGLE_VALUE) ? Type.Toggle : str.equals(BUTTON_VALUE) ? Type.Button : Type.Unknown;
    }
}
