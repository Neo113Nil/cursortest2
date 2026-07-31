package yads;

import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class vv0 {
    public static tv0 a(JSONObject jSONObject) {
        Object m8023constructorimpl;
        Json Json$default = JsonKt.Json$default(null, uv0.b, 1, null);
        try {
            Result.Companion companion = Result.INSTANCE;
            String jSONObject2 = jSONObject.toString();
            Json$default.getSerializersModule();
            m8023constructorimpl = Result.m8023constructorimpl((tv0) Json$default.decodeFromString(tv0.Companion.serializer(), jSONObject2));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        return (tv0) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
    }
}
