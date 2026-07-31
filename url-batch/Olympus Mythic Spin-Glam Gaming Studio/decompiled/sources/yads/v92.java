package yads;

import com.pubmatic.sdk.common.POBCommonConstants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class v92 implements ai {
    public final nq2 a = new nq2();

    @Override // yads.ai
    public final Object a(JSONObject jSONObject) {
        String optString = jSONObject.optString("name");
        if (optString == null || optString.length() == 0 || Intrinsics.areEqual(optString, POBCommonConstants.NULL_VALUE)) {
            throw new o12("Native Ad json has not required attributes");
        }
        String optString2 = jSONObject.optString("value");
        if (optString2 == null || optString2.length() == 0 || Intrinsics.areEqual(optString2, POBCommonConstants.NULL_VALUE)) {
            throw new o12("Native Ad json has not required attributes");
        }
        return Intrinsics.areEqual("review_count", optString) ? this.a.a(optString2) : optString2;
    }
}
