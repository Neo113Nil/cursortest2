package com.sglib.easymobile.androidnative.gdpr;

import android.graphics.Color;
import com.sglib.easymobile.androidnative.Helper;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class UnityColor {
    public static final String ALPHA_KEY = "a";
    public static final String BLUE_KEY = "b";
    public static final String GREEN_KEY = "g";
    public static final String RED_KEY = "r";
    public final float a;
    public final float b;
    public final float g;
    public final float r;

    public UnityColor(float f, float f2, float f3, float f4) {
        this.r = f;
        this.g = f2;
        this.b = f3;
        this.a = f4;
    }

    public String toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("r", this.r);
            jSONObject.put("g", this.g);
            jSONObject.put("b", this.b);
            jSONObject.put("a", this.a);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    public int toAndroidColor() {
        return Color.argb(floatToIntColorValue(this.a), floatToIntColorValue(this.r), floatToIntColorValue(this.g), floatToIntColorValue(this.b));
    }

    public static UnityColor fromJson(String str) {
        if (Helper.IsNullOrEmptyString(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new UnityColor(BigDecimal.valueOf(jSONObject.getDouble("r")).floatValue(), BigDecimal.valueOf(jSONObject.getDouble("g")).floatValue(), BigDecimal.valueOf(jSONObject.getDouble("b")).floatValue(), BigDecimal.valueOf(jSONObject.getDouble("a")).floatValue());
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int fromJsonToAndroidColor(String str) {
        UnityColor fromJson = fromJson(str);
        if (fromJson == null) {
            return 0;
        }
        return fromJson.toAndroidColor();
    }

    private static int floatToIntColorValue(float f) {
        return Math.round(f * 255.0f);
    }
}
