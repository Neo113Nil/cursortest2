package yads;

import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class t31 implements ai {
    public final h31 a = new h31();

    @Override // yads.ai
    public final Object a(JSONObject jSONObject) {
        if (!jSONObject.has("value") || jSONObject.isNull("value")) {
            boolean z = ob1.a;
            throw new o12("Native Ad json has not required attributes");
        }
        return this.a.a(jSONObject.getJSONObject("value"));
    }
}
