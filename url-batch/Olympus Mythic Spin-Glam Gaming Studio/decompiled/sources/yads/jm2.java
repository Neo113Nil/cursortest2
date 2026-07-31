package yads;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class jm2 {
    public static hm2 a(String str) {
        new im2();
        JSONObject jSONObject = new JSONObject(em.b(str));
        HashMap hashMap = new HashMap();
        String string = jSONObject.getString("body");
        JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject2.getString(next));
        }
        return new hm2(hashMap, string);
    }
}
