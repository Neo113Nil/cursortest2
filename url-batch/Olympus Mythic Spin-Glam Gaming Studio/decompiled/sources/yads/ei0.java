package yads;

import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class ei0 implements n0 {
    public final lg0 a;
    public final wi0 b;
    public final c93 c;
    public final boolean d;

    public ei0(lg0 lg0Var, wi0 wi0Var, c93 c93Var, boolean z) {
        this.a = lg0Var;
        this.b = wi0Var;
        this.c = c93Var;
        this.d = z;
    }

    @Override // yads.n0
    public final j0 a(JSONObject jSONObject) {
        String optString = jSONObject.optString("type");
        if (optString == null || optString.length() == 0 || Intrinsics.areEqual(optString, POBCommonConstants.NULL_VALUE)) {
            throw new o12("Native Ad json has not required attributes");
        }
        this.c.getClass();
        JSONArray jSONArray = jSONObject.getJSONArray("trackingUrls");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("design");
        fg0 a = optJSONObject != null ? this.a.a(optJSONObject) : null;
        ri0 a2 = a != null ? this.b.a(a, this.d) : null;
        if (a2 != null) {
            return new ci0(optString, a2, arrayList);
        }
        throw new o12("Native Ad json has not required attributes");
    }
}
