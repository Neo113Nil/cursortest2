package com.tiktok.util;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
/* loaded from: classes5.dex */
public final class JSON {
    private static final String TAG = "JSON";

    @NonNull
    public static JSONObject build() {
        return new JSONObject();
    }

    @Nullable
    public static JSONObject build(String str) {
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static JSONObject build(Map<String, String> map) {
        try {
            return new JSONObject(map);
        } catch (Throwable unused) {
            return null;
        }
    }

    @NonNull
    public static JSONArray buildArr() {
        return new JSONArray();
    }

    @Nullable
    public static JSONArray buildArr(String str) {
        try {
            return new JSONArray(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void putInt(JSONObject jSONObject, String str, int i) {
        if (jSONObject != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                jSONObject.put(str, i);
            } catch (Throwable unused) {
            }
        }
    }

    public static void putLong(JSONObject jSONObject, String str, long j) {
        if (jSONObject != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                jSONObject.put(str, j);
            } catch (Throwable unused) {
            }
        }
    }

    public static void putDouble(JSONObject jSONObject, String str, double d) {
        if (jSONObject != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                jSONObject.put(str, d);
            } catch (Throwable unused) {
            }
        }
    }

    public static void putBoolean(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                jSONObject.put(str, z);
            } catch (Throwable unused) {
            }
        }
    }

    public static void putObject(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                jSONObject.put(str, obj);
            } catch (Throwable unused) {
            }
        }
    }

    public static void putArr(JSONArray jSONArray, Object obj) {
        if (jSONArray == null || obj == null) {
            return;
        }
        try {
            jSONArray.put(obj);
        } catch (Throwable unused) {
        }
    }

    public static int getInt(JSONObject jSONObject, String str) {
        return getInt(jSONObject, str, 0);
    }

    public static int getInt(JSONObject jSONObject, String str, int i) {
        if (jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return jSONObject.optInt(str, i);
                }
            } catch (Throwable unused) {
            }
        }
        return i;
    }

    public static long getLong(JSONObject jSONObject, String str) {
        return getLong(jSONObject, str, 0L);
    }

    public static long getLong(JSONObject jSONObject, String str, long j) {
        if (jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return jSONObject.optLong(str, j);
                }
            } catch (Throwable unused) {
            }
        }
        return j;
    }

    public static double getDouble(JSONObject jSONObject, String str) {
        return getDouble(jSONObject, str, 0.0d);
    }

    public static double getDouble(JSONObject jSONObject, String str, double d) {
        if (jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return jSONObject.optDouble(str, d);
                }
            } catch (Throwable unused) {
            }
        }
        return d;
    }

    public static String getString(JSONObject jSONObject, String str) {
        return getString(jSONObject, str, "");
    }

    public static String getString(JSONObject jSONObject, String str, String str2) {
        if (jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return jSONObject.optString(str, str2);
                }
            } catch (Throwable unused) {
            }
        }
        return str2;
    }

    public static boolean getBoolean(JSONObject jSONObject, String str) {
        return getBoolean(jSONObject, str, false);
    }

    public static boolean getBoolean(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return jSONObject.optBoolean(str, z);
                }
            } catch (Throwable unused) {
            }
        }
        return z;
    }

    public static Object getObject(JSONObject jSONObject, String str) {
        return getObject(jSONObject, str, null);
    }

    public static Object getObject(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return jSONObject.opt(str);
                }
            } catch (Throwable unused) {
            }
        }
        return obj;
    }

    public static JSONObject getJsonObject(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return jSONObject.optJSONObject(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONArray getJsonArray(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return jSONObject.optJSONArray(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Iterator<String> getKeys(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.keys();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONArray remove(JSONArray jSONArray, int i) {
        JSONArray jSONArray2 = new JSONArray();
        if (i < 0 || i >= jSONArray.length()) {
            return jSONArray;
        }
        for (int i2 = 0; i2 < i; i2++) {
            try {
                jSONArray2.put(jSONArray.getJSONObject(i2));
            } catch (JSONException unused) {
            }
        }
        while (true) {
            i++;
            if (i >= jSONArray.length()) {
                return jSONArray2;
            }
            try {
                jSONArray2.put(jSONArray.getJSONObject(i));
            } catch (Throwable unused2) {
            }
        }
    }

    @Nullable
    public static JSONObject getJSONObject(JSONArray jSONArray, int i) {
        try {
            return jSONArray.getJSONObject(i);
        } catch (Throwable unused) {
            return null;
        }
    }
}
