package com.iab.omid.library.pubmatic.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.pubmatic.adsession.OutputDeviceStatus;
import com.iab.omid.library.pubmatic.walking.a;
import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class c {
    private static WindowManager a;
    private static String[] b = {VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "width", "height"};
    static float c = Resources.getSystem().getDisplayMetrics().density;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class b {
        final float a;
        final float b;

        b(float f, float f2) {
            this.a = f;
            this.b = f2;
        }
    }

    static float a(int i) {
        return i / c;
    }

    private static b a(JSONObject jSONObject) {
        float f;
        float f2;
        if (a != null) {
            Point point = new Point(0, 0);
            a.getDefaultDisplay().getRealSize(point);
            f = a(point.x);
            f2 = a(point.y);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new b(f, f2);
    }

    public static JSONObject a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(VastAttributes.HORIZONTAL_POSITION, a(i));
            jSONObject.put(VastAttributes.VERTICAL_POSITION, a(i2));
            jSONObject.put("width", a(i3));
            jSONObject.put("height", a(i4));
        } catch (JSONException e) {
            d.a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    public static void a(Context context) {
        if (context != null) {
            c = context.getResources().getDisplayMetrics().density;
            a = (WindowManager) context.getSystemService("window");
        }
    }

    public static void a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", a(outputDeviceStatus));
        } catch (JSONException e) {
            d.a("Error with setting output device status", e);
        }
    }

    public static void a(JSONObject jSONObject, a.C0322a c0322a) {
        com.iab.omid.library.pubmatic.internal.e a2 = c0322a.a();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = c0322a.b().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a2.d());
            jSONObject.put("friendlyObstructionPurpose", a2.b());
            jSONObject.put("friendlyObstructionReason", a2.a());
        } catch (JSONException e) {
            d.a("Error with setting friendly obstruction", e);
        }
    }

    public static void a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            d.a("Error with setting has window focus", e);
        }
    }

    public static void a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            d.a("Error with setting ad session id", e);
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            d.a("JSONException during JSONObject.put for name [" + str + X3.j.e, e);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static boolean a(OutputDeviceStatus outputDeviceStatus) {
        return a.a[outputDeviceStatus.ordinal()] == 1;
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    public static Map<String, String> b(JSONObject jSONObject) {
        try {
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    hashMap.put(next, (String) obj);
                }
            }
            return hashMap;
        } catch (Exception e) {
            throw new RuntimeException("Failed to parse JSON to Map", e);
        }
    }

    public static void b(JSONObject jSONObject, Boolean bool) {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e) {
                d.a("Error with setting is picture-in-picture active", e);
            }
        }
    }

    public static void b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            d.a("Error with setting not visible reason", e);
        }
    }

    private static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!h(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    public static void c(JSONObject jSONObject) {
        b a2 = a(jSONObject);
        try {
            jSONObject.put("width", a2.a);
            jSONObject.put("height", a2.b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!optJSONArray.optString(i, "").equals(optJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    private static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    private static boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    public static boolean h(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return f(jSONObject, jSONObject2) && g(jSONObject, jSONObject2) && e(jSONObject, jSONObject2) && d(jSONObject, jSONObject2) && c(jSONObject, jSONObject2) && b(jSONObject, jSONObject2);
    }
}
