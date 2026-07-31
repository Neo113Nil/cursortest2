package yads;

import com.pubmatic.sdk.common.POBCommonConstants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class xv implements n0 {
    @Override // yads.n0
    public final j0 a(JSONObject jSONObject) {
        String optString = jSONObject.optString("type");
        if (optString == null || optString.length() == 0 || Intrinsics.areEqual(optString, POBCommonConstants.NULL_VALUE)) {
            throw new o12("Native Ad json has not required attributes");
        }
        return new vv(optString);
    }
}
