package yads;

import com.pubmatic.sdk.common.POBCommonConstants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class cw implements ai {
    @Override // yads.ai
    public final Object a(JSONObject jSONObject) {
        if (jSONObject.has("value") && jSONObject.isNull("value")) {
            return new bw(aw.c, null);
        }
        aw awVar = aw.b;
        String optString = jSONObject.optString("value");
        if (optString == null || optString.length() == 0 || Intrinsics.areEqual(optString, POBCommonConstants.NULL_VALUE)) {
            throw new o12("Native Ad json has not required attributes");
        }
        return new bw(awVar, optString);
    }
}
