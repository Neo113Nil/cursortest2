package yads;

import com.pubmatic.sdk.common.POBCommonConstants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class bm implements fc3 {
    @Override // yads.fc3
    public final String a(String str, JSONObject jSONObject) {
        String optString = jSONObject.optString(str);
        if (optString == null || optString.length() == 0 || Intrinsics.areEqual(optString, POBCommonConstants.NULL_VALUE)) {
            throw new o12("Native Ad json has not required attributes");
        }
        String b = am.b(optString);
        if (b == null || b.length() == 0) {
            throw new o12("Native Ad json has attribute with broken base64 encoding");
        }
        return b;
    }
}
