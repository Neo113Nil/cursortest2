package yads;

import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class jb implements n0 {
    public final eb3 a;
    public final c93 b;

    public jb(eb3 eb3Var, c93 c93Var) {
        this.a = eb3Var;
        this.b = c93Var;
    }

    @Override // yads.n0
    public final j0 a(JSONObject jSONObject) {
        String optString = jSONObject.optString("type");
        if (optString == null || optString.length() == 0 || Intrinsics.areEqual(optString, POBCommonConstants.NULL_VALUE)) {
            throw new o12("Native Ad json has not required attributes");
        }
        this.a.getClass();
        String a = eb3.a("url", jSONObject);
        String a2 = bd1.a("optOutUrl", jSONObject);
        if (a2 == null) {
            a2 = "";
        }
        String str = a2;
        this.b.getClass();
        JSONArray jSONArray = jSONObject.getJSONArray("trackingUrls");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return new hb(optString, a, str, jSONObject.optBoolean("darkTheme"), arrayList);
    }
}
