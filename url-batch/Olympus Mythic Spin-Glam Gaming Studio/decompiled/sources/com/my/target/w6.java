package com.my.target;

import android.text.TextUtils;
import com.my.target.tb;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class w6 extends v {
    private final int a;

    private w6(int i) {
        this.a = i;
    }

    public static v a(int i) {
        return new w6(i);
    }

    @Override // com.my.target.v
    public x6 a(String str, y yVar, x6 x6Var, n nVar, tb.a aVar, tb tbVar, List list, s sVar) {
        JSONObject a = v.a(str, aVar, tbVar, list, sVar);
        if (a == null) {
            sVar.b(q.j);
            return null;
        }
        JSONObject optJSONObject = a.optJSONObject(nVar.i());
        if (optJSONObject == null) {
            sVar.b(q.m);
            return null;
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("banners");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            JSONObject optJSONObject2 = optJSONArray.optJSONObject(0);
            if (optJSONObject2 == null) {
                sVar.b(q.r);
                return null;
            }
            u6 X = u6.X();
            String optString = optJSONObject2.optString("id");
            if (TextUtils.isEmpty(optString)) {
                optString = optJSONObject2.optString(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.an, X.x());
            }
            X.n(optString);
            String optString2 = optJSONObject2.optString("type");
            if (!TextUtils.isEmpty(optString2)) {
                X.y(optString2);
            }
            if (optJSONObject2.optJSONArray("statistics") != null) {
                cg.b(yVar, nVar).a(X.H(), optJSONObject2, optString, this.a);
            }
            if (!X.H().f()) {
                sVar.b(q.i);
                return null;
            }
            x6 d = x6.d();
            d.a(X);
            return d;
        }
        sVar.b(q.r);
        return null;
    }
}
