package yads;

import com.pubmatic.sdk.common.POBCommonConstants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class u43 implements ai {
    @Override // yads.ai
    public final Object a(JSONObject jSONObject) {
        String optString = jSONObject.optString("value");
        if (optString == null || optString.length() == 0 || Intrinsics.areEqual(optString, POBCommonConstants.NULL_VALUE)) {
            throw new o12("Native Ad json has not required attributes");
        }
        return optString;
    }
}
