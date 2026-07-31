package yads;

import java.util.Iterator;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public abstract class oq1 {
    public static pq1 a(String str) {
        Long l;
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.has("default_timeout") ? jSONObject : null;
        if (jSONObject2 != null) {
            long optLong = jSONObject2.optLong("default_timeout");
            l = Long.valueOf(optLong);
            if (optLong <= 0) {
                throw new IllegalArgumentException("default_timeout must be positive");
            }
        } else {
            l = null;
        }
        return new pq1(l, !jSONObject.has("banner") ? null : a("banner", jSONObject), !jSONObject.has("interstitial") ? null : a("interstitial", jSONObject), !jSONObject.has("rewarded") ? null : a("rewarded", jSONObject), !jSONObject.has("native") ? null : a("native", jSONObject), jSONObject.has("appOpenAd") ? a("appOpenAd", jSONObject) : null);
    }

    public static pq1 b(String str) {
        Object m8023constructorimpl;
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(a(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
            boolean z = ob1.a;
        }
        return (pq1) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
    }

    public static Map a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        Map createMapBuilder = MapsKt.createMapBuilder();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            long j = jSONObject2.getLong(next);
            if (j > 0) {
                createMapBuilder.put(next, Long.valueOf(j));
            } else {
                throw new IllegalArgumentException(("timeout for format=" + str + " network=" + next + " must be positive").toString());
            }
        }
        return MapsKt.build(createMapBuilder);
    }
}
