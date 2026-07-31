package yads;

import com.pubmatic.sdk.common.POBCommonConstants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class eb3 {
    public static String a(String str, JSONObject jSONObject) {
        String optString = jSONObject.optString(str);
        if (optString == null || optString.length() == 0 || Intrinsics.areEqual(optString, POBCommonConstants.NULL_VALUE)) {
            throw new o12("Native Ad json has not required attributes");
        }
        if (optString.length() != 0) {
            return optString;
        }
        throw new o12("Native Ad json has not required attributes");
    }
}
