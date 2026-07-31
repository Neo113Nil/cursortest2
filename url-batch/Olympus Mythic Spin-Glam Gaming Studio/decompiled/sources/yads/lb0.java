package yads;

import android.content.Context;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lb0 implements n0 {
    public final eb3 a;
    public final pg2 b;
    public final b93 c;

    public lb0(Context context, eb3 eb3Var) {
        pg2 pg2Var = new pg2(context, eb3Var);
        b93 b93Var = new b93();
        this.a = eb3Var;
        this.b = pg2Var;
        this.c = b93Var;
    }

    @Override // yads.n0
    public final j0 a(JSONObject jSONObject) {
        List build;
        String optString = jSONObject.optString("type");
        if (optString == null || optString.length() == 0 || Intrinsics.areEqual(optString, POBCommonConstants.NULL_VALUE)) {
            throw new o12("Native Ad json has not required attributes");
        }
        this.a.getClass();
        String a = eb3.a("fallbackUrl", jSONObject);
        this.c.getClass();
        JSONArray optJSONArray = jSONObject.optJSONArray("fallbackTrackingUrls");
        JSONArray jSONArray = null;
        List a2 = optJSONArray == null ? null : b93.a(optJSONArray);
        if (jSONObject.has("preferredPackages")) {
            jSONArray = jSONObject.getJSONArray("preferredPackages");
        } else if (jSONObject.has("preferredLinks")) {
            jSONArray = jSONObject.getJSONArray("preferredLinks");
        }
        pg2 pg2Var = this.b;
        pg2Var.getClass();
        if (jSONArray == null) {
            build = CollectionsKt.emptyList();
        } else {
            List createListBuilder = CollectionsKt.createListBuilder();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    createListBuilder.add(pg2Var.a.a(optJSONObject));
                }
            }
            build = CollectionsKt.build(createListBuilder);
        }
        return new ib0(optString, a, a2, build);
    }
}
