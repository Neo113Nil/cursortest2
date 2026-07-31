package yads;

import kotlin.ranges.RangesKt;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class jn3 implements ai {
    @Override // yads.ai
    public final Object a(JSONObject jSONObject) {
        Object obj = jSONObject.get("value");
        if (obj instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) obj;
            return new k10(jSONObject2.getString("warningText"), RangesKt.coerceIn((float) jSONObject2.optDouble("warningSize", 0.11999999731779099d), 0.0f, 1.0f));
        }
        if (obj instanceof String) {
            return new k10((String) obj);
        }
        throw new o12("Native Ad json has not required attributes");
    }
}
