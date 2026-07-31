package yads;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class s6 {
    public static d7 a(String str) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(a(new JSONObject(str)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
            boolean z = ob1.a;
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        return (d7) m8023constructorimpl;
    }

    public static d7 a(JSONObject jSONObject) {
        Object m8023constructorimpl;
        Set set;
        Map map;
        String str = "usagePercent";
        if (jSONObject == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            boolean z = jSONObject.getBoolean("isEnabled");
            boolean z2 = jSONObject.getBoolean("isInDebug");
            String string = jSONObject.getString("apiKey");
            long j = jSONObject.getLong("validationTimeoutInSec");
            int i = jSONObject.getInt("usagePercent");
            boolean z3 = jSONObject.getBoolean("willBlockAdOnInternalError");
            JSONArray optJSONArray = jSONObject.optJSONArray("enabledAdUnits");
            if (optJSONArray != null) {
                Set createSetBuilder = SetsKt.createSetBuilder();
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    String string2 = optJSONArray.getString(i2);
                    if (string2.length() > 0) {
                        createSetBuilder.add(string2);
                    }
                }
                set = SetsKt.build(createSetBuilder);
            } else {
                set = null;
            }
            if (set == null) {
                set = SetsKt.emptySet();
            }
            Set set2 = set;
            JSONObject optJSONObject = jSONObject.optJSONObject("adNetworksCustomParameters");
            if (optJSONObject != null) {
                Map createMapBuilder = MapsKt.createMapBuilder();
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = optJSONObject.getJSONObject(next);
                    createMapBuilder.put(next, new f7(jSONObject2.getBoolean("isDisabled"), jSONObject2.getInt(str)));
                    optJSONObject = optJSONObject;
                    str = str;
                }
                map = MapsKt.build(createMapBuilder);
            } else {
                map = null;
            }
            if (map == null) {
                map = MapsKt.emptyMap();
            }
            m8023constructorimpl = Result.m8023constructorimpl(new d7(z, z2, string, j, i, z3, set2, map));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
            jSONObject.toString();
            boolean z4 = ob1.a;
        }
        return (d7) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
    }

    public static String a(d7 d7Var) {
        if (d7Var == null) {
            return null;
        }
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, "isEnabled", Boolean.valueOf(d7Var.a));
        JsonElementBuildersKt.put(jsonObjectBuilder, "isInDebug", Boolean.valueOf(d7Var.b));
        JsonElementBuildersKt.put(jsonObjectBuilder, "apiKey", d7Var.c);
        JsonElementBuildersKt.put(jsonObjectBuilder, "validationTimeoutInSec", Long.valueOf(d7Var.d));
        JsonElementBuildersKt.put(jsonObjectBuilder, "usagePercent", Integer.valueOf(d7Var.e));
        JsonElementBuildersKt.put(jsonObjectBuilder, "willBlockAdOnInternalError", Boolean.valueOf(d7Var.f));
        JsonElementBuildersKt.putJsonArray(jsonObjectBuilder, "enabledAdUnits", new p6(d7Var));
        JsonElementBuildersKt.putJsonObject(jsonObjectBuilder, "adNetworksCustomParameters", new r6(d7Var));
        return jsonObjectBuilder.build().toString();
    }
}
