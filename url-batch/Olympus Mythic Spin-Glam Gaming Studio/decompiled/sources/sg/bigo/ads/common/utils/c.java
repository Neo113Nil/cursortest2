package sg.bigo.ads.common.utils;

import android.text.TextUtils;
import android.util.Patterns;
import androidx.annotation.Nullable;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c {
    public static String a(String str, String str2) {
        try {
            URL url = new URL(str);
            StringBuilder sb = new StringBuilder(str);
            String authority = url.getAuthority();
            int lastIndexOf = str.lastIndexOf(authority);
            if (lastIndexOf >= 0) {
                sb.replace(lastIndexOf, authority.length() + lastIndexOf, str2);
            }
            return sb.toString();
        } catch (Exception e) {
            sg.bigo.ads.bn.a.a(0, "AntiBanUtils", "replaceHost error： " + e.getMessage());
            return str;
        }
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int indexOf = str.indexOf(":");
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        return Patterns.DOMAIN_NAME.matcher(str).matches();
    }

    @Nullable
    public static Map<String, String> b(String str, String str2) {
        JSONArray jSONArray;
        HashMap hashMap = new HashMap();
        if (r.a((CharSequence) str)) {
            return hashMap;
        }
        try {
            jSONArray = new JSONArray(str);
        } catch (JSONException unused) {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return hashMap;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("country", str2);
                String optString2 = optJSONObject.optString("host", "");
                if (a(optString2)) {
                    hashMap.put(optString, optString2);
                }
            }
        }
        return hashMap;
    }
}
