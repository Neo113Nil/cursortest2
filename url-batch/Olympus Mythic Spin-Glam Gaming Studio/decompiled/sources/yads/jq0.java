package yads;

import java.util.HashMap;
import java.util.Iterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class jq0 {
    public static HashMap a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObject2 = jSONObject.getJSONObject("report_data");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject2.get(next));
            }
            Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        return hashMap;
    }
}
