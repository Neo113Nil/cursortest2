package yads;

import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class gv implements ai {
    @Override // yads.ai
    public final Object a(JSONObject jSONObject) {
        String str = new String[]{"value"}[0];
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            boolean z = ob1.a;
            throw new o12("Native Ad json has not required attributes");
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("value");
        String[] strArr = {"url", "size"};
        for (int i = 0; i < 2; i++) {
            String str2 = strArr[i];
            if (!jSONObject2.has(str2) || jSONObject2.isNull(str2)) {
                boolean z2 = ob1.a;
                throw new o12("Native Ad json has not required attributes");
            }
        }
        return new fv(jSONObject2.optInt("size"), eb3.a("url", jSONObject2));
    }
}
