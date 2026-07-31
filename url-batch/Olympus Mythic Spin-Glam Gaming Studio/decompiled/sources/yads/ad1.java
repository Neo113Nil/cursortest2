package yads;

import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public abstract class ad1 {
    public static final Json a = JsonKt.Json$default(null, zc1.b, 1, null);

    public static Map a(JSONObject jSONObject) {
        Map createMapBuilder = MapsKt.createMapBuilder();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null && optString.length() != 0 && !Intrinsics.areEqual(POBCommonConstants.NULL_VALUE, optString)) {
                createMapBuilder.put(next, optString);
            }
        }
        return MapsKt.build(createMapBuilder);
    }

    public static List b(String str, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return null;
        }
        List createListBuilder = CollectionsKt.createListBuilder();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            String optString = optJSONArray.optString(i);
            if (optString != null && optString.length() != 0 && !Intrinsics.areEqual(POBCommonConstants.NULL_VALUE, optString)) {
                createListBuilder.add(optString);
            }
        }
        return CollectionsKt.build(createListBuilder);
    }

    public static final Integer a(String str, JSONObject jSONObject) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(Integer.valueOf(jSONObject.getInt(str)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        return (Integer) m8023constructorimpl;
    }

    public static final JSONObject a(String str) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(new JSONObject(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        return (JSONObject) m8023constructorimpl;
    }
}
