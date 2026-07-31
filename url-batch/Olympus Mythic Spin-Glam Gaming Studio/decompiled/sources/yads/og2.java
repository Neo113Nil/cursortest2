package yads;

import android.content.Context;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class og2 {
    public final eb3 a;
    public final dq0 b;

    public og2(Context context, eb3 eb3Var) {
        this.a = eb3Var;
        this.b = new dq0(context, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a5, code lost:
    
        if (r1.isEmpty() != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mg2 a(JSONObject jSONObject) {
        Map map;
        Object m8023constructorimpl;
        Object obj;
        String optString;
        Object obj2;
        JSONObject jSONObject2 = jSONObject.has("deeplinkLaunchParams") ? jSONObject.getJSONObject("deeplinkLaunchParams") : jSONObject;
        String optString2 = jSONObject2.optString("package");
        if (optString2 == null || optString2.length() == 0 || Intrinsics.areEqual(optString2, POBCommonConstants.NULL_VALUE)) {
            throw new o12("Native Ad json has not required attributes");
        }
        JSONObject optJSONObject = jSONObject2.optJSONObject("extras");
        dq0 dq0Var = this.b;
        dq0Var.getClass();
        if (optJSONObject != null) {
            Map createMapBuilder = MapsKt.createMapBuilder();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!optJSONObject.isNull(next)) {
                    Object obj3 = optJSONObject.get(next);
                    if (obj3 instanceof JSONObject) {
                        bq0 bq0Var = dq0Var.a;
                        JSONObject jSONObject3 = (JSONObject) obj3;
                        String optString3 = jSONObject3.optString("type");
                        try {
                            obj2 = jSONObject3.get("value");
                        } catch (JSONException unused) {
                            obj2 = null;
                        }
                        obj3 = (Intrinsics.areEqual(optString3, "parcelable") && Intrinsics.areEqual(obj2, POBCommonConstants.NULL_VALUE)) ? cq0.a : (Intrinsics.areEqual(optString3, SDKConstants.PARAM_INTENT) && (obj2 instanceof JSONObject)) ? new zp0(bq0Var.a, bq0Var.b.a((JSONObject) obj2)) : null;
                    }
                    if (obj3 != null) {
                        createMapBuilder.put(next, obj3);
                    }
                }
            }
            map = MapsKt.build(createMapBuilder);
        }
        map = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(Integer.valueOf(jSONObject2.getInt("flags")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        Integer num = (Integer) m8023constructorimpl;
        String a = bd1.a("launchMode", jSONObject2);
        nb0.b.getClass();
        Iterator<E> it = nb0.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (StringsKt.equals(((nb0) obj).name(), a, true)) {
                break;
            }
        }
        nb0 nb0Var = (nb0) obj;
        if (nb0Var == null) {
            nb0Var = nb0.c;
        }
        String a2 = bd1.a("className", jSONObject2);
        if (a2 == null) {
            this.a.getClass();
            optString = eb3.a("url", jSONObject);
        } else {
            optString = jSONObject.optString("url");
        }
        String str = optString;
        String a3 = bd1.a("deeplinkType", jSONObject);
        JSONArray optJSONArray = jSONObject.optJSONArray("trackingUrls");
        List a4 = optJSONArray == null ? null : b93.a(optJSONArray);
        JSONArray optJSONArray2 = jSONObject.optJSONArray("fallbackTrackingUrls");
        return new mg2(optString2, str, map, num, nb0Var, a4, optJSONArray2 == null ? null : b93.a(optJSONArray2), a3, a2);
    }
}
