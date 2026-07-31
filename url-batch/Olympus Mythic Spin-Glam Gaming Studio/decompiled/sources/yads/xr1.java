package yads;

import com.ironsource.O6;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class xr1 {
    public static ds2 a(JSONObject jSONObject) {
        Object obj;
        try {
            if (!jSONObject.has("format_parameters")) {
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("format_parameters");
            if (!jSONObject2.has("bridge_ad_type")) {
                return null;
            }
            String optString = jSONObject2.optString("bridge_ad_type");
            if (optString.length() == 0) {
                return null;
            }
            rq1.c.getClass();
            Iterator<E> it = rq1.g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((rq1) obj).b, optString)) {
                    break;
                }
            }
            rq1 rq1Var = (rq1) obj;
            if (rq1Var == null) {
                return null;
            }
            JSONObject optJSONObject = jSONObject2.optJSONObject(com.safedk.android.utils.j.c);
            Long valueOf = (optJSONObject == null || !optJSONObject.has("rewarded_delay")) ? null : Long.valueOf(optJSONObject.optLong("rewarded_delay"));
            if (valueOf != null && valueOf.longValue() <= 0) {
                valueOf = null;
            }
            return new ds2(rq1Var, new bs2(valueOf));
        } catch (JSONException unused) {
            boolean z = ob1.a;
            return null;
        }
    }

    public final er1 b(JSONObject jSONObject) {
        String string;
        y4 y4Var;
        try {
            Json json = ad1.a;
            String string2 = jSONObject.getString(O6.G1);
            if (string2 == null || string2.length() == 0 || Intrinsics.areEqual(POBCommonConstants.NULL_VALUE, string2)) {
                throw new JSONException("Json value can not be null or empty");
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("network_data");
            Map createMapBuilder = MapsKt.createMapBuilder();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                createMapBuilder.put(next, jSONObject2.getString(next));
            }
            Map build = MapsKt.build(createMapBuilder);
            if (build.isEmpty()) {
                return null;
            }
            List b = ad1.b("click_tracking_urls", jSONObject);
            List b2 = ad1.b("impression_tracking_urls", jSONObject);
            List b3 = ad1.b("ad_response_tracking_urls", jSONObject);
            JSONObject optJSONObject = jSONObject.optJSONObject("bidding_info");
            Map a = optJSONObject != null ? ad1.a(optJSONObject) : null;
            if (jSONObject.has("impression_data")) {
                try {
                    string = jSONObject.getString("impression_data");
                } catch (Exception unused) {
                    boolean z = ob1.a;
                }
                if (string.length() == 0 || Intrinsics.areEqual(POBCommonConstants.NULL_VALUE, string)) {
                    throw new JSONException("Json has not required attributes");
                }
                y4Var = new y4(string);
                return new er1(string2, build, b2, b, b3, y4Var, a, a(jSONObject));
            }
            y4Var = null;
            return new er1(string2, build, b2, b, b3, y4Var, a, a(jSONObject));
        } catch (JSONException unused2) {
            boolean z2 = ob1.a;
            return null;
        }
    }
}
