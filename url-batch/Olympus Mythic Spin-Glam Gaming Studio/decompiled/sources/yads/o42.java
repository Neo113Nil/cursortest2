package yads;

import org.json.JSONObject;

/* loaded from: classes13.dex */
public abstract class o42 {
    public static final boolean a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (!jSONObject.has(str)) {
                return false;
            }
        }
        return true;
    }
}
